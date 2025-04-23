

class MathArrayUtils{
    private MathArrayUtils(){
    }

    public static int sum(int[] values){  // 2 usages
        int sum = 0;
        for(int value : values){
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values){
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values){
        int min = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values){
        int max = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }
}

public class StaticEx2 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}