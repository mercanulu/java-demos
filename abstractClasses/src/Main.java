public class Main {
    public static void main(String[] args){
        /*
        * Abstract class'lar new'lenemez
        * Abstract class'ların referansları new' lenebilir.
        *
        */
        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();





    }
}
