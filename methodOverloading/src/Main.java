public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.topla(3, 4);
        int sonuc2 = dortIslem.topla(5, 8, 9);

        System.out.println("Sonuc1: " + sonuc1);
        System.out.println("Sonuc2: " + sonuc2);
    }
}
