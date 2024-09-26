package com.javanauta.agendadortarefas.infrastructure.entity;


import com.javanauta.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import jdk.jshell.Snippet;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("tarefa")
public class TarefasEntity {

    @Id
    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
