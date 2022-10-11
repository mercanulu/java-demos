/*
* -----Senaryo----
* X bankasının 2 çeşit yazılım geliştirici çalışanı vardır: kendi çalışanı, dışardan gelen
* Banka kendi personeline yemek verip ve ödeme yaparken dışardan gelene bunları sağlamıyor.
*
*/

public class Main {
    public static void main(String[] args){
        Worker worker = new Worker();
        worker.work();
        worker.eat();
        worker.salary();
    }
}
