package com.codegym.validation;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<Author, String> {

//    List<String> authors = Arrays.asList("Santideva", "Marie Kondo", "Martin Fowler", "levunguyen");

    @Autowired
    private IMusicRepository iMusicRepository;


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        List<Music> music = this.iMusicRepository.findAll();
        for (Music m : music){
            if(m.getNameMusic().equals(value)){
                return false;
            }
        }
        return true;

    }
}
