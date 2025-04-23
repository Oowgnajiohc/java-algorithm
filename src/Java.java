import java.util.Scanner;


class Task {
    String name;
    int duration;
    int[] predecessors;
    int predecessorCount;
    int earliestStart;
    int earliestFinish;


    public Task(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.predecessors = new int[2];
        this.predecessorCount = 0;
        this.earliestStart = 0;
        this.earliestFinish = 0;
    }


    public void addPredecessor(int taskIndex) {
        if (predecessorCount < 2) {
            predecessors[predecessorCount] = taskIndex;
            predecessorCount++;
        }
    }
}


public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        scanner.nextLine();


        Task[] tasks = new Task[n];


        for (int i = 0; i < n; i++) {
            System.out.println("작업 " + (i+1) + "의 이름을 입력하세요:");
            String name = scanner.nextLine();


            System.out.println("작업 " + (i+1) + "의 소요시간을 입력하세요:");
            int duration = scanner.nextInt();
            scanner.nextLine();


            tasks[i] = new Task(name, duration);


            System.out.println("작업 " + (i+1) + "의 선행작업 수를 입력하세요 (0, 1, 또는 2):");
            int predecessorCount = scanner.nextInt();
            scanner.nextLine();


            for (int j = 0; j < predecessorCount; j++) {
                System.out.println("선행작업 " + (j+1) + "의 번호를 입력하세요 (1부터 " + i + "까지):");
                int predecessorIndex = scanner.nextInt() - 1;
                scanner.nextLine();


                if (predecessorIndex >= 0 && predecessorIndex < i) {
                    tasks[i].addPredecessor(predecessorIndex);
                } else {
                    System.out.println("유효하지 않은 선행작업 번호입니다. 다시 입력하세요.");
                    j--;
                }
            }
        }


        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tasks[i].predecessorCount; j++) {
                int predecessorIndex = tasks[i].predecessors[j];
                inDegree[i]++;
            }
        }


        int[] queue = new int[n];
        int front = 0;
        int rear = 0;


        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue[rear++] = i;
                tasks[i].earliestStart = 0;
                tasks[i].earliestFinish = tasks[i].duration;
            }
        }


        while (front < rear) {
            int current = queue[front++];
            for (int i = 0; i < n; i++) {
                boolean isPredecessor = false;


                for (int j = 0; j < tasks[i].predecessorCount; j++) {
                    if (tasks[i].predecessors[j] == current) {
                        isPredecessor = true;
                        break;
                    }
                }


                if (isPredecessor) {
                    inDegree[i]--;
                    int newEarliestStart = tasks[i].earliestStart;
                    if (tasks[current].earliestFinish > newEarliestStart) {
                        newEarliestStart = tasks[current].earliestFinish;
                    }


                    tasks[i].earliestStart = newEarliestStart;
                    tasks[i].earliestFinish = newEarliestStart + tasks[i].duration;
                    if (inDegree[i] == 0) {
                        queue[rear++] = i;
                    }
                }
            }
        }


        int maxFinishTime = 0;
        for (int i = 0; i < n; i++) {
            if (tasks[i].earliestFinish > maxFinishTime) {
                maxFinishTime = tasks[i].earliestFinish;
            }
        }


        System.out.println("프로젝트의 최소 소요 시간: " + maxFinishTime);


        scanner.close();
    }
}
