
package group.intellect.creditpipeline.singleservicehr.soap;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSubdivisionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSubdivisionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap.singleservicehr.creditpipeline.intellect.group/}subdivisionCreationResponce" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubdivisionResponse", propOrder = {
    "_return"
})
public class CreateSubdivisionResponse {

    @XmlElement(name = "return")
    protected SubdivisionCreationResponce _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SubdivisionCreationResponce }
     *     
     */
    public SubdivisionCreationResponce getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubdivisionCreationResponce }
     *     
     */
    public void setReturn(SubdivisionCreationResponce value) {
        this._return = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("_return", _return).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(_return);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass()!= other.getClass()) {
            return false;
        }
        final CreateSubdivisionResponse o = ((CreateSubdivisionResponse) other);
        return Objects.equal(this._return, o._return);
    }

}
