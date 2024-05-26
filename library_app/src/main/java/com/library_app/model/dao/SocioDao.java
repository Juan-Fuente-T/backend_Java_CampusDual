package com.library_app.model.dao;

import com.library_app.model.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioDao extends JpaRepository<Socio, Integer> {
}
