package stud.viko.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//@XmlAccessorType(XmlAccessType.FIELD)

/**
 * Class that is a part of a root class, showing current player form
 */
@XmlType(propOrder={"pointS","assistS","reboundS"})
public class CurrentForm {
    private double PtS;
    private Double AssistS;
    private Double ReboundS;

    /**
     *
     * @return current form players points
     */
    @XmlElement(name ="PointS")
    public double getPointS() {
        return PtS;
    }

    /**
     *
     * @param Pts sets current form players points
     */
    public void setPointS(double Pts) { PtS = Pts;
    }

    /**
     *
     * @return returns current form player assists stats
     */
    public Double getAssistS() {
        return AssistS;
    }

    /**
     *
     * @param assistS sets assists for current player form
     */
    @XmlElement(name = "AssistS")
    public void setAssistS(Double assistS) {
        AssistS = assistS;
    }
    /**
     *
     * @return returns current rebounds stats
     */
    public Double getReboundS() {
        return ReboundS;
    }

    /**
     *
     * @param reboundS sets current rebounds for player
     */
    @XmlElement(name = "ReboundS")
    public void setReboundS(Double reboundS) {
        ReboundS = reboundS;
    }

    /**
     *
     * @return returns part of a current form for root object
     */
    @Override
    public String toString() {
        return "\r\n"+"\t"+"\t"+"\t"+
                "PointS=" + PtS + "\r\n"+"\t"+"\t"+"\t"+
                "AssistS=" + AssistS + '\'' +"\r\n"+"\t"+"\t"+"\t"+
                "ReboundS=" + ReboundS  ;
    }
}
