package stud.viko.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Class that is a part of a root class
 **/
@XmlType(propOrder={"points","rebound","assists","steal","blocks"})
public class Stats {
    private Double points;
    private Double Rebound;
    private Double Assists;
    private Double Steal;
    private Double Blocks;

    /**
     *
     * @return returns player points average
     */
    @XmlElement(name = "Points")
    public Double getPoints() {
        return points;
    }

    /**
     *
     * @param points sets player points average
     */
    public void setPoints(Double points) {
        this.points = points;
    }

    /**
     *
     * @return returns player rebounds average
     */
    @XmlElement(name = "Rebounds")
    public Double getRebound() {
        return Rebound;
    }

    /**
     *
     * @param rebound sets player rebounds average
     */
    public void setRebound(Double rebound) {
        Rebound = rebound;
    }

    /**
     *
     * @return returns player assists average
     */
    @XmlElement(name = "Assists")
    public Double getAssists() {
        return Assists;
    }

    /**
     *
     * @param assists sets player assists average
     */
    public void setAssists(Double assists) {
        Assists = assists;
    }

    /**
     *
     * @return returns player block average
     */
    @XmlElement(name = "Steals")
    public Double getSteal() {
        return Steal;
    }

    /**
     *
     * @param steal sets player steals average
     */
    public void setSteal(Double steal) {
        Steal = steal;
    }

    /**
     *
     * @return returns player blocks average
     */
    @XmlElement(name = "Blocks")
    public Double getBlocks() {
        return Blocks;
    }

    /**
     *
     * @param blocks sets player block average
     */
    public void setBlocks(Double blocks) {
        Blocks = blocks;
    }

    /**
     *
     * @return returns stats part to the root object
     */
    @Override
    public String toString() {
        return "\r\n"+"\t"+"\t"+"\t"+"\t"+
                "points='" + points + '\'' +"\r\n"+"\t"+"\t"+"\t"+"\t"+
                "Rebound='" + Rebound + '\'' +"\r\n"+"\t"+"\t"+"\t"+"\t"+
                "Assists='" + Assists + '\'' +"\r\n"+"\t"+"\t"+"\t"+"\t"+
                "Steal='" + Steal + '\'' +"\r\n"+"\t"+"\t"+"\t"+"\t"+
                "Blocks='" + Blocks + '\'';
    }
}
