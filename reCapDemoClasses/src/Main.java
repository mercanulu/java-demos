public class Main {
    public static void main(String[] args){
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        dortIslem.Cikar(5,5);
        dortIslem.Carp(1,10);
        dortIslem.Bol(5,5);

        System.out.println(sonuc);

    }
}
