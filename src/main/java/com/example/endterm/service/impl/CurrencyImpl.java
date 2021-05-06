package com.example.endterm.service.impl;

import com.example.endterm.model.Currency;
import com.example.endterm.repository.CurrencyRepo;
import com.example.endterm.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurrencyImpl implements CurrencyService {
   @Autowired
    private CurrencyRepo currencyRepo;
   @Override
    public Currency getById(int id) {
        return currencyRepo.getById(id);
    }

    @Override
    public List<Currency> findAll() {
        return currencyRepo.findAll();
    }

    @Override
    public Currency createCurrency(Currency currency) {
        return currencyRepo.save(currency);
    }

    @Override
    public Currency uptade(Currency currency) {
        return currencyRepo.save(currency);
    }

    @Override
    public void delete(int id) {
    Currency currency1 = currencyRepo.getById(id);
    currencyRepo.delete(currency1);
    }

    @Override
    public Currency convert(String valueName1, String valueName2, double value1) {
       Currency currency1 = currencyRepo.getByNameCurrency(valueName1);
       Currency currency2 = currencyRepo.getByNameCurrency(valueName2);
       double value = currency2.getValue() / currency1.getValue() * value1;
        Currency result = new Currency();
        result.setNameCurrency(valueName2);
        result.setValue(value);
        return result;
       // Currency2 / Currency1 * double1
    }
}
