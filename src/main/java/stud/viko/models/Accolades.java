package stud.viko.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Class that is a part of a root class returning players achievements
 **/
@XmlType(propOrder={"nba_Champ", "nba_All_Star","first_team","second_team","nba_Finals_Mvp"})
public class Accolades {

    private String Nba_Champ;
    private String Nba_All_Star;
    private String First_team;
    private String Second_team;
    private String Nba_Finals_Mvp;

    /**
     *
     * @return returning player achievement nr.1
     */
    @XmlElement(name = "NBA-Champ")
    public String getNba_Champ() {
        return Nba_Champ;
    }

    /**
     *
     * @param nba_Champ sets player achievement nr.1
     */
    public void setNba_Champ(String nba_Champ) {
        Nba_Champ = nba_Champ;
    }

    /**
     *
     * @return returning player achievement nr.2
     */
    @XmlElement(name = "NBA-All-Star")
    public String getNba_All_Star() {
        return Nba_All_Star;
    }

    /**
     *
     * @param nba_All_Star sets player achievement nr.2
     */
    public void setNba_All_Star(String nba_All_Star) {
        Nba_All_Star = nba_All_Star;
    }

    /**
     *
     * @return returning player achievement nr.3
     */
    @XmlElement(name = "First-team")
    public String getFirst_team() {
        return First_team;
    }

    /**
     *
     * @param first_team sets player achievement nr.3
     */
    public void setFirst_team(String first_team) {
        First_team = first_team;
    }

    /**
     *
     * @return returning player achievement nr.4
     */
    @XmlElement(name = "Seccond-team")
    public String getSecond_team() {
        return Second_team;
    }

    /**
     *
     * @param second_team sets player achievement nr.4
     */
    public void setSecond_team(String second_team) {
        Second_team = second_team;
    }

    /**
     *
     * @return returning player achievement nr.5
     */
    @XmlElement(name = "NBA-Finals-MVP")
    public String getNba_Finals_Mvp() {
        return Nba_Finals_Mvp;
    }

    /**
     *
     * @param nba_Finals_Mvp sets player achievement nr.5
     */
    public void setNba_Finals_Mvp(String nba_Finals_Mvp) {
        Nba_Finals_Mvp = nba_Finals_Mvp;
    }

    /**
     *
     * @return returns to the root element printed accolades part
     */
    @Override
    public String toString() {
        return "\r\n"+
                "\t"+ "\t"+"Nba_Champ='" + Nba_Champ + '\'' +
                "\r\n"+
                "\t"+ "\t"+"Nba_All_Star='" + Nba_All_Star + '\'' +
                "\r\n"+
                "\t"+ "\t"+"First_team='" + First_team + '\'' +
                "\r\n"+
                "\t"+ "\t"+"Second_team='" + Second_team + '\'' +
                "\r\n"+
                "\t"+ "\t"+"Nba_Finals_Mvp='" + Nba_Finals_Mvp + '\'' ;
    }
}
