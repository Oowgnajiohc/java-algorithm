class ProductOrder{
    private String productName;
    private int price;
    private int count;

    public ProductOrder(String productName, int price, int count) {
        this.productName = productName;
        this.price = price;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void show(){
        System.out.println("상품명:" + productName + ", 가격:" + price + ", 수량" + count);
    }

    public int getTotal(){
        return price * count;
    }
}


public class ClassEx5 {
    public static void main(String[] args) {
                ProductOrder po1 = new ProductOrder("두부",2000,2);
                ProductOrder po2 = new ProductOrder("김치",5000,1);
                ProductOrder po3 = new ProductOrder("콜라",1500,2);

                ProductOrder[] productOrders = {po1,po2,po3};

                int sum = 0;

                for(ProductOrder productOrder : productOrders){
                    productOrder.show();
                    sum += productOrder.getTotal();
                }
                System.out.println("총 결제 금액:"+ sum);

        }

    }

