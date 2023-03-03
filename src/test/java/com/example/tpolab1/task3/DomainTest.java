package com.example.tpolab1.task3;


import com.example.tpolab1.task3.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Arrays;


public class DomainTest {
    static Human capitanShipGoldHeart;
    static Human engineerShipGoldHeart;
    static Human capitanShipNoName;
    static Human engineerShipNoName;
    static Human passengerShipGoldHeart;
    static Ship shipGoldHeart;
    static Atom atom;
    static Molecule molecule;

    @BeforeAll
    public static void createAll(){
        shipGoldHeart = new Ship("Золотое сердце", Engine.PHOTONIAN);
        capitanShipGoldHeart = new Human("Виктор", 46, Role.CAPITAN, Feeling.SCARE, 5);
        engineerShipGoldHeart = new Human("Саша", 56, Role.ENGINEER, Feeling.SCARE, 4);
        passengerShipGoldHeart = new Human("Даня", 19, Role.PASSENGER, Feeling.SCARE, 1);
        capitanShipNoName = new Human("Толя", 40, Role.CAPITAN, Feeling.HAPPY, 5);
        engineerShipNoName = new Human("Вася", 29, Role.ENGINEER, Feeling.LOVE, 4);
        atom = new Atom("Водород", 1, 1);
        molecule = new Molecule(Arrays.asList(atom, atom), "Водород");
    }

    @Test
    public void testSetCrew() {
        assertEquals(shipGoldHeart.setCrew(capitanShipGoldHeart), capitanShipGoldHeart.getName() + " успешно добавлен в экипаж");
        assertEquals(shipGoldHeart.setCrew(capitanShipGoldHeart), "Этот человек уже в экипаже");
    }

    @Test
    public void testChangeShipEngine() {
        shipGoldHeart.setCrew(engineerShipGoldHeart);
        assertEquals(shipGoldHeart.setEngine(Engine.REACTIVE, engineerShipNoName), "Вы не являетесь инженером этого корабля");
        assertEquals(shipGoldHeart.setEngine(Engine.REACTIVE, capitanShipGoldHeart), "Вы не инженер. У вас нет прав");
        shipGoldHeart.setCurrentSpeed(0.0, capitanShipGoldHeart);
        assertEquals(shipGoldHeart.setEngine(Engine.REACTIVE, engineerShipGoldHeart), "Двигатель заменен на " + Engine.REACTIVE);
        shipGoldHeart.setCurrentSpeed(10.0, capitanShipGoldHeart);
        assertEquals(shipGoldHeart.setEngine(Engine.REACTIVE, engineerShipGoldHeart), "Нельзя менять двигатель на ходу");
    }

    @Test
    public void testChangeShipSpeed() {
        shipGoldHeart.setCrew(capitanShipGoldHeart);
        assertEquals(shipGoldHeart.setCurrentSpeed(1.0, engineerShipGoldHeart), "Вы не капитан. У вас нет прав");
        assertEquals(shipGoldHeart.setCurrentSpeed(1.0, capitanShipNoName), "Вы не являетесь капитаном этого корабля");
        assertEquals(shipGoldHeart.setCurrentSpeed(50.0, capitanShipGoldHeart), "Ошибка двигателя. Недопустимая скорость");
        assertEquals(shipGoldHeart.setCurrentSpeed(-1.0, capitanShipGoldHeart), "Ошибка двигателя. Недопустимая скорость");
        assertEquals(shipGoldHeart.setCurrentSpeed(5.0, capitanShipGoldHeart), "Ваша текущая скорость 5.0");
    }

    @Test
    public void testLaw(){
        assertEquals(atom.slavesLaw("молекул"), "Водород подчиняется закону молекул");
        assertEquals(molecule.slavesLaw("физический закон"), "Водород подчиняется закону физический закон");
        assertEquals(capitanShipGoldHeart.slavesLaw("природы"), "Виктор подчиняется закону природы");
    }
}
