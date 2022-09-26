package com.skj.skjapi.repos;

import com.skj.skjapi.models.Shirt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Shirts extends JpaRepository<Shirt, Long> {
}
