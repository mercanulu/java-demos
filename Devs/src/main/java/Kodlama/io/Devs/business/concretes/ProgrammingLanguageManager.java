package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;
    private ProgrammingLanguage programmingLanguage;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {
        return programmingLanguageRepository.getById(id);

    }


    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if(programmingLanguage.getName().isEmpty()){
            throw new Exception("Programlama dili boş geçilemez.");
        }
        for(ProgrammingLanguage language:getAll()){
            if(programmingLanguage.getId() ==language.getId() || programmingLanguage.getName().equals(language.getName())){
                throw new Exception("Programlama dili tekrar edemez");
            }
        }

        programmingLanguageRepository.add(programmingLanguage);

    }

    @Override
    public void delete(int id) throws Exception {
      programmingLanguageRepository.delete(id);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageRepository.update(programmingLanguage);

    }

}
