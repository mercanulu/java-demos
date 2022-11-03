package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id) throws Exception;
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;

}
