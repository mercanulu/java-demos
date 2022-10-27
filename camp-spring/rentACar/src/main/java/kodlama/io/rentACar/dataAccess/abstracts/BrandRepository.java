package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    //Repository isimlendirmesi genellikle veritabanı işleri yapan classlara verilir. Dao gibi
    List<Brand> getAll();
}
