package stud.viko.models;

import org.junit.Test;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Root object that stores all other objects
 */
@XmlRootElement(name = "player")
@XmlType(propOrder={"name", "surname","age","accolades","teamList","currentForm","injuries"})
/**
 * Player class with certain elements needed to marshall and unmarshall object
 */
public class Player {
    private String Name;
    private String Surname;
    private String Age;
    private Injuries injuries;
    private List<Team> teamList = new ArrayList<>();
    private Accolades accolades;
    private CurrentForm currentForm;
    @XmlElement(name = "Name")
    /**
     * Getters and setters
     */
    public String getName() {
        return Name;
    }
    /**
     *
     * @param Name sets name of the player
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    /**
     *
     * @return returns player injuries object
     */
    @XmlElement(name="Injuries")
    public Injuries getInjuries() {
        return injuries;
    }
    /**
     *
     * @param injuries sets player injuries object
     */
    public void setInjuries(Injuries injuries) {
        this.injuries = injuries;
    }
    /**
     *
     * @return returns list of a teams object
     */
   @XmlElementWrapper(name = "Teams")
   @XmlElement(name="Team")
    public List<Team> getTeamList() {
        return teamList;
    }
    /**
     *
     * @param teamList sets list of the teams
     */
    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }
    /**
     *
     * @return returns player age
     */
    @XmlElement(name = "Age")
    public String getAge() {
        return Age;
    }
    /**
     *
     * @return returns player achievements object
     */
    @XmlElement(name = "Accolades")
    public Accolades getAccolades() {
        return accolades;
    }
    /**
     *
     * @return returns current for of a player as a separate object
     */
    @XmlElement(name = "Current-form")
    public CurrentForm getCurrentForm() {
        return currentForm;
    }
    /**
     *
     * @param currentForm sets current form of a player
     */
    public void setCurrentForm(CurrentForm currentForm) {
        this.currentForm = currentForm;
    }
    /**
     *
     * @param accolades setting up players achievements
     */
    public void setAccolades(Accolades accolades) {
        this.accolades = accolades;
    }
    /**
     *
     * @param age setting up player age
     */
    public void setAge(String age) {
        Age = age;
    }
    /**
     *
     * @return returns player surname
     */
    @XmlElement(name = "Surname")
    public String getSurname() { return Surname; }
    /**
     *
     * @param Surname sets player surname
     */
    public void setSurname(String Surname) { this.Surname=Surname; }
    /**
     *
     * @return returning printed object
     */
    @Override
    public String toString() {
        return "Player:"+"\t"+"\r\n"
                +"\t"+"Name='" + Name + '\'' +"\r\n"+
                "\t"+"Surname='" + Surname + '\'' +"\r\n"+
                "\t"+"Age='" + Age + '\''+"\r\n"+ "\t" +"Accolades" + accolades +"\r\n"+ "\t" +"Teams" + teamList
                +"\r\n" + "\t" +"\t"+ "Current Form'" + currentForm + '\''+"\r\n"
                + "\t" +"\t"+"Injuries" + injuries +"\r\n"+"Player";
    }


}
