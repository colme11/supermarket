package com.colme.supermarket.domain.service;

import com.colme.supermarket.domain.Purchase;
import com.colme.supermarket.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    public List<Purchase> getALL(){
        return  purchaseRepository.getALL();
    }

    public Optional<List<Purchase>> getByClient(String clienteId){
        return purchaseRepository.getByClient(clienteId);
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}
