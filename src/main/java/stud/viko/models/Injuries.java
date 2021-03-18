package stud.viko.models;

import stud.viko.models.CovidProtocol;

import javax.xml.bind.annotation.XmlElement;
/**
 * Class that is a part of a root class
 */
public class Injuries {
    private CovidProtocol covidProtocol;

    /**
     *
     * @return returns specific covid-19 injury type to this class
     */
    @XmlElement(name="COVID-protocol")
    public CovidProtocol getCovidProtocol() {
        return covidProtocol;
    }

    /**
     *
     * @param covidProtocol sets specific covid-19 injury type to this class
     */
    public void setCovidProtocol(CovidProtocol covidProtocol) {
        this.covidProtocol = covidProtocol;
    }

    /**
     *
     * @return returns printed injuries to root element
     */
    @Override
    public String toString() {
        return "\r\n"+"\t"+"\t"+"\t"+
                "covidProtocol" + covidProtocol ;
    }
}
