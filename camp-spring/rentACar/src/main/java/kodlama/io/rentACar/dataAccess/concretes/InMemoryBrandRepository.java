package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository//Bu sınıf bir dataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {

    //içinde brandlerin olduğu koleksiyon listesi oluşturulur
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();//oluşturulan liste boş bir array döndürür


        //Boş olan listeye brandler eklenir.Inmemory de çalıştığımız için veriler bu şekilde eklendi.
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Audi"));
        brands.add(new Brand(3,"Aston Martin"));
        brands.add(new Brand(4,"Kia Rio"));
        brands.add(new Brand(5,"Fiat"));
    }


    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
