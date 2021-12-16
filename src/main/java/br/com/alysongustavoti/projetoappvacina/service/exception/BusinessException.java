package br.com.alysongustavoti.projetoappvacina.service.exception;

public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }
}
