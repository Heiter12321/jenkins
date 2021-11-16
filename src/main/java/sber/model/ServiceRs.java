package sber.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServiceRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRs {

    @XmlElement
    private String StatusCode;
    @XmlElement
    private String CardBalance;

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    public String getCardBalance() {
        return CardBalance;
    }

    public void setCardBalance(String cardBalance) {
        CardBalance = cardBalance;
    }
}
