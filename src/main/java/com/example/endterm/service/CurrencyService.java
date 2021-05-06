package com.example.endterm.service;

import com.example.endterm.model.Currency;
import com.example.endterm.model.User;

import java.util.List;

public interface CurrencyService {
    Currency getById(int id);
    List<Currency> findAll();
    Currency createCurrency(Currency currency);
    Currency uptade(Currency currency);
    void delete(int id);
    Currency convert(String valueName1,String valueName2, double value1 );

}
