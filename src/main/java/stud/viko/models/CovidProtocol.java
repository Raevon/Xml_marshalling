package stud.viko.models;

import javax.xml.bind.annotation.XmlElement;
/**
 * Class that is a part of a root class, made specific class for covid-19 because it's one of the mostly happening injury time now days
 */
public class CovidProtocol {
    private String CurrentProtocol;
    private Boolean CurrentProtocolValidation;

    /**
     *
     * @return returns current Covid-19 protocol
     */
    @XmlElement(name = "Current-Protocol")
    public String getCurrentProtocol() {
        return CurrentProtocol;
    }

    /**
     *
     * @param currentProtocol sets up current protocol
     */
    public void setCurrentProtocol(String currentProtocol) {
        CurrentProtocol = currentProtocol;
    }

    /**
     *
     * @return returns validation of current protocol
     */
    @XmlElement(name = "Current-protocol-validation")
    public Boolean getCurrentProtocolValidation() {
        return CurrentProtocolValidation;
    }

    /**
     *
     * @param currentProtocolValidation sets up validation for current protocol
     */
    public void setCurrentProtocolValidation(Boolean currentProtocolValidation) {
        CurrentProtocolValidation = currentProtocolValidation;
    }

    /**
     *
     * @return returns part of covid protocol to the root element
     */
    @Override
    public String toString() {
        return "\r\n"+"\t"+"\t"+"\t"+"\t"+
                "CurrentProtocol='" + CurrentProtocol + '\'' +"\r\n"+"\t"+"\t"+"\t"+"\t"+
                "CurrentProtocolValidation=" + CurrentProtocolValidation;
    }
}
