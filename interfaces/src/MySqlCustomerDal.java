public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }

    @Override
    public void save() {
        System.out.println("My sql kaydedildi.");
    }

}
