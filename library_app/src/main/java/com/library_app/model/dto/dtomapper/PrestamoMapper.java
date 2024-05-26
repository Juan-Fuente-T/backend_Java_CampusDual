package com.library_app.model.dto.dtomapper;


import com.library_app.model.Prestamo;
import com.library_app.model.dto.PrestamoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PrestamoMapper {
    PrestamoMapper INSTANCE = Mappers.getMapper(PrestamoMapper.class);
    PrestamoDTO toDto(Prestamo prestamo);
    Prestamo toEntity(PrestamoDTO prestamoDTO);
    List<PrestamoDTO> toDtoList(List<Prestamo> prestamos);

}
