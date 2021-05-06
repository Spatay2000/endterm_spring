package com.example.endterm.repository;

import com.example.endterm.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Integer> {
    Currency getById(int id);
    List<Currency> findAll();
    Currency getByNameCurrency(String nameCurrency);
}
