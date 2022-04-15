package net.proselyte.springsecuritydemo.exeption;

public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(String id) {
        super("entity not found" + id);
    }

}