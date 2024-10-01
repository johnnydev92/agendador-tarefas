package com.javanauta.agendadortarefas.infrastructure.exceptions;

import com.javanauta.agendadortarefas.infrastructure.repository.TarefasRepository;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (String mensagem){

        super(mensagem);
    }

    public ResourceNotFoundException (String mensagem, Throwable throwable){

        super(mensagem, throwable);
    }
}
