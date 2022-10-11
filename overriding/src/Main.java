public class Main {
    public static void main(String[] args){
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new TarimKrediManager(),
                new OgretmenKrediManager()};
        for(BaseKrediManager kredi:baseKrediManagers){
            System.out.println(kredi.hesapla(5000));
        }


    }
}
