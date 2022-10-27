public class Main {
    public static void main(String[] args){
        //design pattern 1
        CustomerManager customerManager = new CustomerManager(new SqlServerManager());
        customerManager.add();


        //design pattern 2
        customerManager.repository = new SqlServerManager();
        customerManager.save();

    }
}
