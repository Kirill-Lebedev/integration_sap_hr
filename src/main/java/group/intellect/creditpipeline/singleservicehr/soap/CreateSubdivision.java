
package group.intellect.creditpipeline.singleservicehr.soap;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSubdivision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSubdivision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://soap.singleservicehr.creditpipeline.intellect.group/}subdivisionCreationRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubdivision", propOrder = {
    "arg0"
})
public class CreateSubdivision {

    protected SubdivisionCreationRequest arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link SubdivisionCreationRequest }
     *     
     */
    public SubdivisionCreationRequest getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubdivisionCreationRequest }
     *     
     */
    public void setArg0(SubdivisionCreationRequest value) {
        this.arg0 = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("arg0", arg0).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(arg0);
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
        final CreateSubdivision o = ((CreateSubdivision) other);
        return Objects.equal(this.arg0, o.arg0);
    }

}
