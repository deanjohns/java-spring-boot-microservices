package com.inventory.inventory.repo;

import com.inventory.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
    @Query(value = "SELECT * FROM inventory WHERE id = ?1", nativeQuery = true)
    Inventory getItemById(Integer itemId);
}
