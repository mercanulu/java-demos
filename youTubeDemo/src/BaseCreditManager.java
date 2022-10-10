public abstract class BaseCreditManager implements ICreditManager {

    //ortak özellikleri olan nesneleri modellemek için
    //abstract class yapısı kullanılır.

    //Her yerde değişken, ortak değil bu yüzden abstract metod imzası olarak bırakılır
    public abstract void Calculate();

    //Her yerde aynı
    //istenildiği yerde değiştirilme imkanı da vardır
    // Bu duruma virtual metodlar, temel sınıflarda tanımlanan ve türeyen sınıflarda geçersiz kılınabilen metodlardır.
    public void Save() {
        System.out.println("Kaydedildi.");
    }

}
