public class OracleCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }

    @Override
    public void save() {
        System.out.println("Oracle kaydedildi");
    }
}
