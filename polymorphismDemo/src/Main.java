public class Main {
    public static void main(String[] args){
        //polymorphism
       /*
       BaseLogger[] baseLoggers = new BaseLogger[]{new EmailLogger(),new FileLogger(),
                new DatabaseLogger(),new ConsoleLogger()};
        for(BaseLogger log:baseLoggers){
            log.log("Log message");
        }
        */

        //polymorphizm
        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();


    }
}
