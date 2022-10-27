public class CustomerManager {
    private ICustomerDal customerDal;
    IRepository repository;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal =customerDal;
    }

    public void add(){
        customerDal.add();
    }
    public void save(){
        repository.save();
    }

}
