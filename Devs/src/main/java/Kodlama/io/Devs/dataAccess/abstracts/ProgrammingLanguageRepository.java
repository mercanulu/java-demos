package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage);
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);

}
