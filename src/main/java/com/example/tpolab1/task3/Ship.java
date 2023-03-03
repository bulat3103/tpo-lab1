package com.example.tpolab1.task3;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;
    private Engine engine;
    private double currentSpeed;
    private final List<Human> crew;
    private final double eps = 0.0000001;

    public Ship(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
        this.currentSpeed = 0.0;
        this.crew = new ArrayList<>();
    }

    public String setCurrentSpeed(double currentSpeed, Human human){
        if (!human.getRole().equals(Role.CAPITAN)) {
            return "Вы не капитан. У вас нет прав";
        }
        if (!this.crew.contains(human)) {
            return "Вы не являетесь капитаном этого корабля";
        }
        if (currentSpeed - engine.getMaxSpeed() > eps || currentSpeed <  (-1) * eps){
            return "Ошибка двигателя. Недопустимая скорость";
        }
        this.currentSpeed = currentSpeed;
        return "Ваша текущая скорость " + currentSpeed;
    }

    public String getName() {
        return name;
    }

    public String setEngine(Engine engine, Human human) {
        if (!human.getRole().equals(Role.ENGINEER)) {
            return "Вы не инженер. У вас нет прав";
        }
        if (!this.crew.contains(human)) {
            return "Вы не являетесь инженером этого корабля";
        }
        if (this.currentSpeed < eps) {
            this.engine = engine;
            return "Двигатель заменен на " + engine.toString();
        }
        return "Нельзя менять двигатель на ходу";
    }

    public List<Human> getCrew() {
        return crew;
    }

    public String setCrew(Human human) {
        if (this.crew.contains(human)) {
            return "Этот человек уже в экипаже";
        }
        this.crew.add(human);
        return human.getName() + " успешно добавлен в экипаж";
    }
}
