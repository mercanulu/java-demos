public class Main {
    public static void main(String[] args){
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,8,9,14,0,6,10};
        int aranacak = 11;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            mesajVer(aranacak + " sayısı bulundu");
        }
        else{
            System.out.println(aranacak + " sayısı bulunamadı");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
