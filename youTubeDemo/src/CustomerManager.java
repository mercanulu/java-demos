public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;

    private BaseCreditManager _baseCreditManager;


    //POLIMORFIZM
    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this._customer = customer;
        this._creditManager = creditManager;

    }

    public void Delete() {
        System.out.println("Musteri silindi: " );
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi.");
    }
}
