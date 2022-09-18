import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        int number = 25;
        int reminder = number % 2;
        System.out.println(reminder);
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();
        boolean isPrime=true;
        /*int counter = 0;

        for(int i=2; i<number;i++){
            if(number%i==0){
                counter++;
            }
        }
        if(counter == 0){
            System.out.println(number + " Asal bir sayıdır.");
        }
        else{
            System.out.println(number + " Asal bir sayı değildir.");
        }*/
        if(number==1){
            System.out.println(" Asal bir sayı değildir.");
            return;
        }
        if(number<1){
            System.out.println(" Geçersiz sayı girişi");
            return;
        }
        for(int i=2;i<number;i++){
            if(i%number==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Asal bir sayıdır");
        }
        else{
            System.out.println("Asal sayı değildir.");
        }

    }
}
