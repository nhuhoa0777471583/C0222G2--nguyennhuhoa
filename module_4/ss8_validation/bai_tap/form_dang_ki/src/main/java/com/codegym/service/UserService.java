package com.codegym.service;

import com.codegym.model.User;
import com.codegym.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<User> displayAll() {
        return iUserRepository.displayAll();
    }

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }
}
