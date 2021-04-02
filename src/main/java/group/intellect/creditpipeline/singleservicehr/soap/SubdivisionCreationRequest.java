
package group.intellect.creditpipeline.singleservicehr.soap;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subdivisionCreationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subdivisionCreationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="externalParentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subdivisionCreationRequest", propOrder = {
    "externalId",
    "externalParentId",
    "id",
    "name",
    "parentId",
    "source",
    "status"
})
public class SubdivisionCreationRequest {

    protected int externalId;
    protected int externalParentId;
    protected int id;
    protected String name;
    protected int parentId;
    protected String source;
    protected String status;

    /**
     * Gets the value of the externalId property.
     * 
     */
    public int getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     */
    public void setExternalId(int value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalParentId property.
     * 
     */
    public int getExternalParentId() {
        return externalParentId;
    }

    /**
     * Sets the value of the externalParentId property.
     * 
     */
    public void setExternalParentId(int value) {
        this.externalParentId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     */
    public void setParentId(int value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("externalId", externalId).add("externalParentId", externalParentId).add("id", id).add("name", name).add("parentId", parentId).add("source", source).add("status", status).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(externalId, externalParentId, id, name, parentId, source, status);
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
        final SubdivisionCreationRequest o = ((SubdivisionCreationRequest) other);
        return ((((((Objects.equal(this.externalId, o.externalId)&&Objects.equal(this.externalParentId, o.externalParentId))&&Objects.equal(this.id, o.id))&&Objects.equal(this.name, o.name))&&Objects.equal(this.parentId, o.parentId))&&Objects.equal(this.source, o.source))&&Objects.equal(this.status, o.status));
    }

}
