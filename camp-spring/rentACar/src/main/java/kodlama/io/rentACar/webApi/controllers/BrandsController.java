package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Restful yapılar için controller olduğunu belirten annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    /*  IoC
     *Autowired annotation'ı, eklenmiş constructor parametresiyle eşleşen bir class ya da interface arar.
     *bağlantı kurduğunda (wired) ise otomatik olarak bağımlılığı enjekte eder.
     **/

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }




}
