public class Main {
    public static void main(String[] args){
//        Product product = new Product();
//        product.set_name("Mouse");
//        product.set_id(1);
//        product.set_description("sdhfgs");
//        product.set_price(300);
//        product.set_stockAmount(1);
//        product.set_renk("Siyah");

        Product product2 = new Product(2,"Laptop","sdf",15000,1,"Beyaz");
        ProductManager productManager = new ProductManager();
        productManager.Add(product2);

        System.out.println(product2.get_kod());


    }
}
