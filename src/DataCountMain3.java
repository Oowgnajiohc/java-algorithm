class Data3{
    public String name;
    public static int count;
    public Data3(String name){
        this.name=name;
        count++;
    }
}



public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
        Data3 data4 = new Data3("D");
        System.out.println("인스턴스를 통한 접근" + data4.count);
        System.out.println((Data3.count));
    }
}
