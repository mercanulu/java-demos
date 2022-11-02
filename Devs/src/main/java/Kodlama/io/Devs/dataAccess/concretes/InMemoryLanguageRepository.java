package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<ProgrammingLanguage>();

        languages.add(new ProgrammingLanguage(1,"Java"));
        languages.add(new ProgrammingLanguage(2,"C#"));
        languages.add(new ProgrammingLanguage(3,"Python"));
        languages.add(new ProgrammingLanguage(4,"R"));
        languages.add(new ProgrammingLanguage(5,"PHP"));
        languages.add(new ProgrammingLanguage(6,"C++"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    @Override
    public ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage) {
        for(ProgrammingLanguage language:languages){
            if(language.getId()==programmingLanguage.getId()){
                return language;
            }
        }

        return null;

    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        languages.add(programmingLanguage);


    }

    @Override
    public void delete(int id) {

        languages.remove(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {

    }

}
