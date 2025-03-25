package example;

public class Array1 {
    public static void main(String[] args) {
        int[] arr =new int[]{90,80,70,60,50};
        int total = 0;
        for (int j : arr) {
            total += j;
        }
        double average = (double) total / arr.length;
        System.out.println("점수 총합:"+ total);
        System.out.println("점수 평균: "+ average);
    }

}


