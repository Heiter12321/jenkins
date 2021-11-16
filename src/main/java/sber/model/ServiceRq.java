package sber.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServiceRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRq {

    @XmlElement
    private String SystemName;
    @XmlElement
    private String CardNumber;
    @XmlElement
    private String ClientName;

    public String getSystemName() {
        return SystemName;
    }

    public void setSystemName(String systemName) {
        this.SystemName = systemName;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        this.ClientName = clientName;
    }
}
