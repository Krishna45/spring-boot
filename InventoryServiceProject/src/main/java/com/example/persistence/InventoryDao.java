package com.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.bean.InventoryItem;

@Repository
public interface InventoryDao extends JpaRepository<InventoryItem,Long> {

	@Query("from InventoryItem where productionCode=:code")
	InventoryItem findInventoryByProductionCode(@Param("code") String code);
	
}
