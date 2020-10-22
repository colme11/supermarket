package com.colme.supermarket.web.controller;

import com.colme.supermarket.domain.Purchase;
import com.colme.supermarket.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getALL(){
        return new ResponseEntity<>(purchaseService.getALL(), HttpStatus.OK);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Purchase>> getByClient(@PathVariable("id") String clienteId){
        return purchaseService.getByClient(clienteId)
                .map(Purchase -> new ResponseEntity<>(Purchase, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
        return new ResponseEntity<>( purchaseService.save(purchase), HttpStatus.CREATED);
    }
}
