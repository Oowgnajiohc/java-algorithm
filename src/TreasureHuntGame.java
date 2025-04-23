import java.util.Scanner;

class Player {
    private int x; // 플레이어의 x 좌표
    private int y; // 플레이어의 y 좌표
    private int health; // 플레이어의 체력
    private boolean hasKey; // 열쇠 소지 여부

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.health = 100;
        this.hasKey = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void increaseHealth(int amount) {
        this.health += amount;
        if (this.health > 100) {
            this.health = 100; // 최대 체력은 100으로 제한
        }
    }

    public void pickupKey() {
        this.hasKey = true;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}

class Maze {
    private int[][] maze; // 미로의 구조
    private int rows; // 미로의 행 수
    private int cols; // 미로의 열 수
    private Player player; // 플레이어 객체

    public Maze(int[][] mazeData) {
        this.maze = mazeData;
        this.rows = mazeData.length;
        this.cols = mazeData[0].length;

        // 플레이어의 시작 위치 찾기
        int startX = 0, startY = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 2) {
                    startX = i;
                    startY = j;
                    maze[i][j] = 0; // 시작 위치를 빈 공간으로 변경
                    break;
                }
            }
        }

        this.player = new Player(startX, startY);
    }

    public boolean isValidMove(int x, int y) {
        // 좌표가 미로 범위 내에 있고, 벽이 아닌지 확인
        return x >= 0 && x < rows && y >= 0 && y < cols && maze[x][y] != 1;
    }

    public void printMaze() {
        System.out.println("현재 체력: " + player.getHealth());
        System.out.println("열쇠 보유: " + (player.hasKey() ? "예" : "아니오"));
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == player.getX() && j == player.getY()) {
                    System.out.print("P "); // 플레이어 위치
                } else {
                    switch(maze[i][j]) {
                        case 0:
                            System.out.print(". "); // 빈 공간
                            break;
                        case 1:
                            System.out.print("# "); // 벽
                            break;
                        case 3:
                            System.out.print("K "); // 열쇠
                            break;
                        case 4:
                            System.out.print("T "); // 보물상자 (출구)
                            break;
                        case 5:
                            System.out.print("! "); // 함정
                            break;
                        case 6:
                            System.out.print("H "); // 물약 (Health)
                            break;
                        default:
                            System.out.print(maze[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void processMove(int x, int y) {
        if (!isValidMove(x, y)) {
            System.out.println("이동할 수 없는 위치입니다!");
            return;
        }

        // 이동하기 전에 해당 위치의 아이템 등을 처리
        int item = maze[x][y];

        switch(item) {
            case 3: // 열쇠
                player.pickupKey();
                System.out.println("열쇠를 획득했습니다!");
                maze[x][y] = 0; // 열쇠를 획득했으므로 빈 공간으로 변경
                break;

            case 4: // 보물상자 (출구)
                if (player.hasKey()) {
                    System.out.println("보물을 찾았습니다! 게임 클리어!");
                    player.move(x, y);
                    return;
                } else {
                    System.out.println("보물상자가 잠겨있습니다. 열쇠가 필요합니다.");
                    return; // 이동하지 않음
                }

            case 5: // 함정
                player.decreaseHealth(20);
                System.out.println("함정에 빠졌습니다! 체력이 20 감소했습니다.");
                maze[x][y] = 0; // 함정은 한 번만 발동
                break;

            case 6: // 물약
                player.increaseHealth(30);
                System.out.println("물약을 마셨습니다! 체력이 30 회복되었습니다.");
                maze[x][y] = 0; // 물약을 사용했으므로 빈 공간으로 변경
                break;
        }

        // 플레이어 위치 이동
        player.move(x, y);

        // 체력 확인
        if (!player.isAlive()) {
            System.out.println("체력이 0이 되었습니다. 게임 오버!");
        }
    }

    public boolean isGameClear() {
        int x = player.getX();
        int y = player.getY();
        return maze[x][y] == 4 && player.hasKey();
    }

    public boolean isGameOver() {
        return !player.isAlive();
    }

    public Player getPlayer() {
        return player;
    }
}

public class TreasureHuntGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 보물 찾기 미로 탈출 게임 ===");
        System.out.println("P: 플레이어, #: 벽, K: 열쇠, T: 보물상자, !: 함정, H: 물약, .: 빈 공간");
        System.out.println();

        // 미로 데이터 초기화 (10x10 미로)
        int[][] mazeData = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 5, 1, 0, 1, 1},
                {1, 0, 1, 1, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 5, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 0, 6, 1},
                {1, 3, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 5, 0, 4, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        // 미로 객체 생성
        Maze maze = new Maze(mazeData);

        // 게임 루프
        boolean gameRunning = true;
        while (gameRunning) {
            // 현재 미로 상태 출력
            maze.printMaze();

            if (maze.isGameClear()) {
                System.out.println("축하합니다! 보물을 찾아 미로를 탈출했습니다!");
                break;
            }

            if (maze.isGameOver()) {
                System.out.println("게임 오버! 체력이 모두 소진되었습니다.");
                break;
            }

            // 플레이어 이동 입력 받기
            System.out.println("이동 방향을 선택하세요 (w: 위, s: 아래, a: 왼쪽, d: 오른쪽, q: 종료)");
            String input = scanner.next().toLowerCase();

            if (input.equals("q")) {
                System.out.println("게임을 종료합니다.");
                gameRunning = false;
                continue;
            }

            // 현재 플레이어 위치
            int currentX = maze.getPlayer().getX();
            int currentY = maze.getPlayer().getY();
            int newX = currentX;
            int newY = currentY;

            // 입력에 따라 새 위치 계산
            switch(input) {
                case "w": // 위
                    newX = currentX - 1;
                    break;
                case "s": // 아래
                    newX = currentX + 1;
                    break;
                case "a": // 왼쪽
                    newY = currentY - 1;
                    break;
                case "d": // 오른쪽
                    newY = currentY + 1;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    continue;
            }

            // 이동 처리
            maze.processMove(newX, newY);
        }

        scanner.close();
    }
}
