package Kodlama.io.Devs.webApi.controllers;


import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }

    @PostMapping("/getbyid")
    public ProgrammingLanguage getById(@RequestBody ProgrammingLanguage programmingLanguage){
        return programmingLanguageService.getById(programmingLanguage);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.delete(programmingLanguage.getId());
    }
}
