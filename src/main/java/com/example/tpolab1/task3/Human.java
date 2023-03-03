package com.example.tpolab1.task3;

public class Human implements Law{
    private String name;
    private Integer age;
    private Role role;
    private Feeling feeling;
    private Integer grade;

    public Human(String name, Integer age, Role role, Feeling feeling, Integer grade) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.feeling = feeling;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getFeeling() {
        return this.getName() + "чувствует" + feeling.getDescription();
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String slavesLaw(String lawName){
        return this.getName() + " подчиняется закону " + lawName;
    }
}
