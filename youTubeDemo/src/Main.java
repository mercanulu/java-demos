public class Main {
    public static void main(String[] args){

        //Dependency injection yapisi---Bu yapi IoC Container ile yapilandirilabilir.
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();




        /*
        ------IoC-------------
        Birbirine bagimliligi az (loose coupling) olan nesneler olusturmayi
        amaclayan bir yazilim gelistirme prensibidir.
        */

         /*
         polimorfizm
           Customer customer2 = new Person();
           Customer customer3 = new Company();
       */




    }
}
