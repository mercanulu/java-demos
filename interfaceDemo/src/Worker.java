public class Worker implements IWorkable,IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("Çalışan bilgisi getirildi");

    }

    @Override
    public void eat() {
        System.out.println("Çalışan yemeği verildi");
    }

    @Override
    public void salary() {
        System.out.println("Çalışan maaşı hesaplandı");
    }
}
