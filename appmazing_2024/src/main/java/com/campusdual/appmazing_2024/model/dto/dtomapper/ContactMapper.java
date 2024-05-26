package com.campusdual.appmazing_2024.model.dto.dtomapper;

import com.campusdual.appmazing_2024.model.Contact;
import com.campusdual.appmazing_2024.model.dto.ContactDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);
    ContactDTO toDTO(Contact contact);
    Contact toEntity(ContactDTO contactdto);
    List<ContactDTO> toDTOList(List<Contact> contacts);
}
