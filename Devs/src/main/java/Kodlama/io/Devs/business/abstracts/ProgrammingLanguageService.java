package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(ProgrammingLanguage programmingLanguage);
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);
}
