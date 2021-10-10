package br.com.lucasfuck.vacancy.exception;

public class PersonNotFound extends RuntimeException {

    public PersonNotFound(String message) {
        super(message);
    }
}
