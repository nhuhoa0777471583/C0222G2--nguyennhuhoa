package com.dictionary.service;

import com.dictionary.repository.DictionaryRepository;
import com.dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService{
    private IDictionaryRepository iDictionaryRepository = new DictionaryRepository();

    @Override
    public String dictionary(String english) {
        return iDictionaryRepository.dictionary(english);
    }
}
