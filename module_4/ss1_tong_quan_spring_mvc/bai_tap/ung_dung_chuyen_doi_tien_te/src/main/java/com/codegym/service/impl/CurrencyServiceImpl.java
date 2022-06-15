package com.codegym.service.impl;

import com.codegym.service.ICurrecyService;
import org.springframework.stereotype.Service;


@Service
public class CurrencyServiceImpl implements ICurrecyService {
    @Override
    public double count(int usd, int rate) {
        return usd * rate;
    }
}
