package com.colme.supermarket.domain.repository;

import com.colme.supermarket.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getALL();

    Optional<List<Purchase>> getByClient(String clienteId);

    Purchase save(Purchase purchase);

}
