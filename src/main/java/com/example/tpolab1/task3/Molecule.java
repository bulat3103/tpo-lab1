package com.example.tpolab1.task3;

import java.util.List;

public class Molecule implements Law{
    private List<Atom> compound;
    private String name;

    public Molecule(List<Atom> compound, String name) {
        this.compound = compound;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String slavesLaw(String lawName){
        return this + " подчиняется закону " + lawName;
    }
}
