package com.example.tpolab1.task3;

public class Atom implements Law{
    private String nameTable;


    public Atom(String nameTable) {
        this.nameTable = nameTable;
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
