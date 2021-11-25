package sber.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServiceRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRs {

    @XmlElement
    private String statusCode;
    @XmlElement
    private String cardBalance;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        statusCode = statusCode;
    }

    public String getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(String cardBalance) {
        cardBalance = cardBalance;
    }
}
