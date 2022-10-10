public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void Calculate() {
        System.out.println("Ogretmen kredisi hesaplandı.");
    }

    @Override
    public void Save() {
        super.Save();
        System.out.println("Öğretmen kaydedildi");
    }
}
