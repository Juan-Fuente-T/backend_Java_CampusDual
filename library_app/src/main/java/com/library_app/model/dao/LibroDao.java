package com.library_app.model.dao;

import com.library_app.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository<Libro, Integer> {
}
