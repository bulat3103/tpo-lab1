package com.example.tpolab1.task3;

public enum Feeling {
    SCARE("страх"),
    LOVE("любовь"),
    UNCOMFORTABLE("дискомфорт"),
    COMFORTABLE("уют"),
    HAPPY("счастье");

    private final String description;

    Feeling(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
