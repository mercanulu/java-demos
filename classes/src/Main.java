public class Main {
    public static void main(String[] args){
        //reference type
        CustomerManager customerManager ;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //referance type
        int[] sayilar = new int[]{1,2,3,4};
        int[] sayilar2 = new int[]{5,6,7,8};

        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
