package com.wmak.restaurant.impl.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.wmak.restaurant.impl.entity.DishEntity;

@Transactional
public interface DishDao extends JpaRepository<DishEntity, String> {

	@Modifying(clearAutomatically = true)
	@Query("UPDATE DishEntity d SET d.name = ?2, d.category = ?3, d.price = ?4 WHERE d.id = ?1")
	void updateDish(String id, String name, String category, double price);

	@Query("SELECT DishEntity d WHERE d.category = ?1")
	List<DishEntity> getDishByCategory(String category);
}
