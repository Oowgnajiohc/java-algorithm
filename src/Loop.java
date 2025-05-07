public class Loop {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {  // i: 줄 번호
                for (int j = 1; j <= i; j++) {  // j: 각 줄의 숫자
                    System.out.print(j + " ");
                }
                System.out.println();  // 줄 바꿈
            }
        }
    }
