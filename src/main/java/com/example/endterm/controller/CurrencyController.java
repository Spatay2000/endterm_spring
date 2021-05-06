package com.example.endterm.controller;
import com.example.endterm.model.Currency;
import com.example.endterm.model.User;
import com.example.endterm.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")

public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @PostMapping("/create")
    public Currency createCurrency(@RequestBody Currency currency) {
        return currencyService.createCurrency(currency);
    }

    @PostMapping("/update")
    public  Currency update(@RequestBody Currency currency){
        return currencyService.uptade(currency);
    }

    @PostMapping("/all")
    public List<Currency> findAll(){
        return currencyService.findAll();
    }

    @PostMapping("/{id}")
    public Currency getById(@RequestBody int id ){
        return  currencyService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody int id ){
        currencyService.delete(id);
    }

    @GetMapping("/convert")
    public Currency getConvert(@RequestParam String valueName1, @RequestParam String valueName2, @RequestParam double value1) {
        return currencyService.convert(valueName1,valueName2,value1);
    }
}
