package com.library_app.model.dto.dtomapper;

import com.library_app.model.Socio;
import com.library_app.model.dto.SocioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SocioMapper {
    SocioMapper INSTANCE = Mappers.getMapper(SocioMapper.class);
    SocioDTO toDto(Socio socio);
    Socio toEntity(SocioDTO socioDTO);
    List<SocioDTO>toDtoList(List<Socio> socios);
}
