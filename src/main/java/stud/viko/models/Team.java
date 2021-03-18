package stud.viko.models;

import stud.viko.models.Stats;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/**
 * Class that is a part of a root class
 */
@XmlType(propOrder={"title", "seazon","stats"})
public class Team {
    private String Title;
    private String Season;
    private Stats stats;

    /**
     *
     * @return returns team title
     */
    @XmlElement(name = "Title")
    public String getTitle() {
        return Title;
    }

    /**
     *
     * @param title sets team title
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     *
     * @return returns season
     */
    @XmlElement(name = "Seazon")
    public String getSeazon() {
        return Season;
    }

    /**
     *
     * @param seazon sets season
     */
    public void setSeazon(String seazon) {
        Season = seazon;
    }

    /**
     *
     * @return returns stats object
     */
    @XmlElement(name = "Stats")
    public Stats getStats() {
        return stats;
    }

    /**
     *
     * @param stats sets stats object
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     *
     * @return returns team list to the root object
     */
    @Override
    public String toString() {
        return"\r\n"+ "\t"+ "\t"+"Team" +
                "\r\n"+
                "\t"+"\t"+ "\t"+"Title'" + Title + '\'' +
                "\r\n"+
                "\t"+"\t"+ "\t"+"Season'" + Season + '\'' +
                "\r\n"+
                "\t"+"\t"+ "\t"+ "Stats" + stats +"\t";
    }
}
