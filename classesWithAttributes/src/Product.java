public class Product {
    public Product() {
        System.out.println("Yapıcı blok çalıştı.");
    }
   //overloading
    public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _renk) {
        System.out.println("Paramatreli yapıcı blok çalıştı.");
        this._id = _id;
        this._name = _name;
        this._price = _price;
        this._renk = _renk;
        this._description = _description;
        this._stockAmount = _stockAmount;
    }

    //field encapsulation
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    private String _renk;

    private String _kod;

    //getter read-only
    public int get_id() {
        return _id;
    }

    //setter write-only
    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    public String get_kod() {
        return this._name.substring(0, 1) + _id;
    }

}
