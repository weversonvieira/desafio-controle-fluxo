package org.example.exceptions;

public class ParametrosInvalidosException extends Exception {


    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    public String message(String message) {
        return message;
    }


}
