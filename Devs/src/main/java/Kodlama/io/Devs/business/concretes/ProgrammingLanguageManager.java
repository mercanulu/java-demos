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
    public ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage) {
        return programmingLanguageRepository.getById(programmingLanguage);

    }


    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        List<ProgrammingLanguage> languages = programmingLanguageRepository.getAll();

        for (ProgrammingLanguage language : languages) {
            if (language.getId()==programmingLanguage.getId() || language.getName().equals("")) {
                throw new Exception("Aynı isimde bilgi girdiniz veya bilgi girmediniz");
            }

        }
        programmingLanguageRepository.add(programmingLanguage);

    }

    @Override
    public void delete(int id) {
        if(isValidId(programmingLanguage.getId())){
            programmingLanguageRepository.delete(programmingLanguage.getId());
        }

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {

    }
    public boolean isValidId(int id){
        for(ProgrammingLanguage language:getAll()){
            if(language.getId()==programmingLanguage.getId()){
                return true;
            }
        }
        return false;
    }
}
