package stud.viko.models;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
System.out.println("Get name");
Player instance = new Player();
String expected_Result= "Kevin";
instance.setName("Kevin");
String results= instance.getName();
assertEquals(expected_Result,results);
//fail("Test case is a prototype");
    }

    @Test
    void setName() {
        System.out.println("Set name");
        String Name=null;
        Player instance = new Player();
        instance.setName(Name);
        String results= instance.getName();
        assertEquals(Name,results);
    }

    @Test
    void getInjuries() {
        System.out.println("Get injuries");
        Player instance = new Player();
        String expected_Result=null;
        String results= String.valueOf(instance.getInjuries());
        assertEquals(String.valueOf(expected_Result),results);
    }

    @Test
    void setInjuries() {
        System.out.println("Set injuries");
Injuries injuries = new Injuries();
        Player instance = new Player();
       instance.setInjuries(injuries);
       String results = String.valueOf(instance.getInjuries());
        assertEquals(String.valueOf(injuries),results);
    }

    @Test
    void getTeamList() {
        System.out.println("Get team list");
        Player instance = new Player();
        String expected_Result="[]";
        String results= String.valueOf(instance.getTeamList());
        assertEquals(expected_Result,results);
    }

    @Test
    void setTeamList() {
        System.out.println("set team list");
        Player instance = new Player();
        Team team = new Team();
        instance.setTeamList(Collections.singletonList(team));
        String results= String.valueOf(instance.getTeamList());
        String remake= results.replace("[","");
        String finalString= remake.replace("]","");

        assertEquals(String.valueOf(team),finalString);
    }

    @Test
    void getAge() {
        System.out.println("Get age");
        Player instance = new Player();
        String expected_Result= "12";
        instance.setAge("12");
        String results= instance.getAge();
        assertEquals(expected_Result,results);

    }

    @Test
    void getAccolades() {
        System.out.println("Get accolades");
        Player instance = new Player();
        String expected_Result=null;
        String results= String.valueOf(instance.getAccolades());
        assertEquals(String.valueOf(expected_Result),results);
    }

    @Test
    void getCurrentForm() {
        System.out.println("Get current form");
        Player instance = new Player();
        String expected_Result=null;
        String results= String.valueOf(instance.getCurrentForm());
        assertEquals(String.valueOf(expected_Result),results);
    }

    @Test
    void setCurrentForm() {
        System.out.println("Set current form");
        CurrentForm currentForm = new CurrentForm();
        Player instance = new Player();
        instance.setCurrentForm(currentForm);
        String results = String.valueOf(instance.getCurrentForm());
        assertEquals(String.valueOf(currentForm),results);
    }

    @Test
    void setAccolades() {
        System.out.println("Set accolades");
        Accolades accolades = new Accolades();
        Player instance = new Player();
        instance.setAccolades(accolades);
        String results = String.valueOf(instance.getAccolades());
        assertEquals(String.valueOf(accolades),results);
    }

    @Test
    void setAge() {
        System.out.println("Set age");
        String Age=null;
        Player instance = new Player();
        instance.setAge(Age);
        String results= instance.getName();
        assertEquals(Age,results);
    }

    @Test
    void getSurname() {
        System.out.println("get surname");
        String Surname=null;
        Player instance = new Player();
        instance.setAge(Surname);
        String results= instance.getSurname();
        assertEquals(Surname,results);
    }

    @Test
    void setSurname() {
        System.out.println("Set Surname");
        String Surname="Bron Bron";
        Player instance = new Player();
        instance.setSurname(Surname);
        String results= instance.getSurname();
        assertEquals(Surname,results);
    }
}