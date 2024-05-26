package com.library_app.model.dto.dtomapper;

import com.library_app.model.Libro;
import com.library_app.model.dto.LibroDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LibroMapper {

        LibroMapper INSTANCE = Mappers.getMapper(LibroMapper.class);
        LibroDTO toDto(Libro libro);
        Libro toEntity(LibroDTO libroDTO);
        List<LibroDTO> toDtoList(List<Libro> libros);
    }
