package com.example.tpolab1.task3;

public class Atom implements Law{
    private String nameTable;
    private int numberTable;
    private double weightTable;


    public Atom(String nameTable, int numberTable, double weightTable) {
        this.nameTable = nameTable;
        this.numberTable = numberTable;
        this.weightTable = weightTable;
    }

    @Override
    public String toString() {
        return nameTable;
    }

    @Override
    public String slavesLaw(String lawName){
        return this + " подчиняется закону " + lawName;
    }
}
