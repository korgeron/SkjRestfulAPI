package com.skj.skjapi.repos;

import com.skj.skjapi.models.Shirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface Shirts extends JpaRepository<Shirt, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE Shirt s SET s.name = :name, s.size = :size, s.price = :price WHERE s.id = :id")
    Integer updateShirt(Long id, String name, String size, String price);
}
