public class Worker implements IWorkable,IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("Çalışan bilgisi getirildi");
    }

    @Override
    public void eat() {
        System.out.println("Çalışanın yemek hakkı vardır.");
    }

    @Override
    public void salary() {
        System.out.println("Çalışan maaşı hesaplandı");
    }
}
