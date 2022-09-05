package com.demo.service.account;

import com.demo.model.account.AppUser;

public interface IAppUserService {

    AppUser findAppUserByUsername(String username);

    void save(AppUser appUser);
}
