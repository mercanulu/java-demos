public abstract class GameCalculator {
    public abstract void hesapla();

    /*
    oyun herkes için aynı şekilde biteceği için gameOver
    override edilmemelidir, bu yüzden final
    */

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
