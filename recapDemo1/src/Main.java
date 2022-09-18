public class Main {
    public static void main(String[] args){
        int number1 = 20;
        int number2 = 25;
        int number3 = 2;

        int max = number1;

        if(max<number2){
            max = number2;
        }

        if (max<number3){
            max = number3;
        }

        System.out.println("En büyük sayı = "+max);
    }
}
