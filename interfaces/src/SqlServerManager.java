public class SqlServerManager implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Sql server eklendi");
    }

    @Override
    public void save() {
        System.out.println("Sql server kaydedildi.");
    }
}
