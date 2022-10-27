public class Main {
    public static void main(String[] args){
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name="Keyboard";
        product.price=500;
        productManager.add(product);

        //inner class
        DatabaseHelper.Connection.createConnection();
    }
}
