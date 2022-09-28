public class Main {
    public static void main(String[] args){
        String mesaj = "Bugün hava bulutlu.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sonuc =topla(5,10);
        System.out.println(sonuc);
        int sonuc2 = topla2(1,2,5,10,75,100);
        System.out.println(sonuc2);

    }
    public static void ekle(){
        System.out.println("Eklendi");

    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "İstanbul";
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;
    }
}
