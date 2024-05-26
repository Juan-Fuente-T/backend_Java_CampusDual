package com.library_app.model.dao;

import com.library_app.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoDao extends JpaRepository<Prestamo, Integer> {
}
