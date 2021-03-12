package com.zc.GenericClass;

public class GenericClass<E> {
    private E name;
    private String password;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
