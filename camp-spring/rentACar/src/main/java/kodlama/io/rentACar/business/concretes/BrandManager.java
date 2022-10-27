package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service// Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {
    //Dependency injection
    private BrandRepository brandRepository;

    //loosely coupled. Bir sınıfla doğrudan bağlantı yerine interface'i ile bağlanmak.

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları
        return brandRepository.getAll();
    }

}
