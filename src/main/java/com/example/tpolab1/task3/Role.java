package com.example.tpolab1.task3;

public enum Role {
    CAPITAN("Капитан"),
    DOCTOR("Доктор"),
    SAILOR("Матрос"),
    PASSENGER("Пассажир"),
    ENGINEER("Инженер");

    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
