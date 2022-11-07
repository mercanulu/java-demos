package kodlama.io.rentACar.dataAccess.abstracts;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository<T> extends JpaRepository<Brand, Integer> {

}
