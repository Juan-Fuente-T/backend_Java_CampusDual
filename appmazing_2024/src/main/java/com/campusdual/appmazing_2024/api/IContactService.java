package com.campusdual.appmazing_2024.api;

import com.campusdual.appmazing_2024.model.dto.ContactDTO;

import java.util.List;

public interface IContactService {
    //CRUD Operations
    ContactDTO queryContact(ContactDTO contactDTO);

    List<ContactDTO> queryAllContacts();

    int insertContact(ContactDTO contactDTO);

    int updateContact(ContactDTO contactDTO);

    int deleteContact(ContactDTO contactDTO);
}
