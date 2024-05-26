package com.campusdual.appmazing_2024.model.dao;

import com.campusdual.appmazing_2024.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDao extends JpaRepository<Contact, Integer> {

}
