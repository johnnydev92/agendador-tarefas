package com.javanauta.agendadortarefas.business.mapper;


import com.javanauta.agendadortarefas.business.dto.TarefasDTO;
import com.javanauta.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    @Mapping(source = "descricao", target = "descricao")
    @Mapping(source = "emailUsuario", target = "emailUsuario")
    @Mapping(source = "statusNotificacaoEnum", target = "statusNotificacaoEnum")

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    @Mapping(target = "dataAlteracao", source = "dataAlteracao")
    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListasTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities);

}
