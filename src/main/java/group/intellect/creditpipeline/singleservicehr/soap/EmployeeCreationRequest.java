
package group.intellect.creditpipeline.singleservicehr.soap;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employeeCreationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeeCreationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INTEGRATION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FACEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPARTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESCDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LASTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MIDDLENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNIQUENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRIEFNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BIRTHDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORGNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TABNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERSONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISMANAGER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ISSECMANAGER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ISBLOCKMANAGER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ISCURATOR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SORTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS_DEKRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEKRETDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS_FIO_P" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIO_POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPART_PARENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POST_SHORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POST_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZPHONE_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZPHONE_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZPHONE_MOB_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZPHONE_MOB_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZUSRID_LONG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AEDTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DHIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZFLOOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZZROOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIEWSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PREVUNIQUENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSTRANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RMPRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MVZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SYSMOMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeCreationRequest", propOrder = {
    "integrationid",
    "faceid",
    "departid",
    "status",
    "escdate",
    "lastname",
    "firstname",
    "middlename",
    "uniquename",
    "briefname",
    "birthday",
    "post",
    "orgname",
    "tabnum",
    "personid",
    "ismanager",
    "issecmanager",
    "isblockmanager",
    "iscurator",
    "sortcode",
    "statusdekret",
    "dekretdt",
    "sex",
    "statusfiop",
    "fiopost",
    "departparent",
    "postshort",
    "postid",
    "zphone1",
    "zphone2",
    "zphonemob1",
    "zphonemob2",
    "zusridlong",
    "aedtm",
    "dhire",
    "ktext",
    "zzfloor",
    "zzroom",
    "viewstatus",
    "prevuniquename",
    "postrang",
    "bs",
    "fn",
    "kps",
    "rmprf",
    "mvz",
    "sysmoment"
})
public class EmployeeCreationRequest {

    @XmlElement(name = "INTEGRATION_ID")
    protected String integrationid;
    @XmlElement(name = "FACEID")
    protected String faceid;
    @XmlElement(name = "DEPARTID")
    protected String departid;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "ESCDATE")
    protected String escdate;
    @XmlElement(name = "LASTNAME")
    protected String lastname;
    @XmlElement(name = "FIRSTNAME")
    protected String firstname;
    @XmlElement(name = "MIDDLENAME")
    protected String middlename;
    @XmlElement(name = "UNIQUENAME")
    protected String uniquename;
    @XmlElement(name = "BRIEFNAME")
    protected String briefname;
    @XmlElement(name = "BIRTHDAY")
    protected String birthday;
    @XmlElement(name = "POST")
    protected String post;
    @XmlElement(name = "ORGNAME")
    protected String orgname;
    @XmlElement(name = "TABNUM")
    protected String tabnum;
    @XmlElement(name = "PERSONID")
    protected String personid;
    @XmlElement(name = "ISMANAGER")
    protected boolean ismanager;
    @XmlElement(name = "ISSECMANAGER")
    protected boolean issecmanager;
    @XmlElement(name = "ISBLOCKMANAGER")
    protected boolean isblockmanager;
    @XmlElement(name = "ISCURATOR")
    protected boolean iscurator;
    @XmlElement(name = "SORTCODE")
    protected String sortcode;
    @XmlElement(name = "STATUS_DEKRET")
    protected String statusdekret;
    @XmlElement(name = "DEKRETDT")
    protected String dekretdt;
    @XmlElement(name = "SEX")
    protected String sex;
    @XmlElement(name = "STATUS_FIO_P")
    protected String statusfiop;
    @XmlElement(name = "FIO_POST")
    protected String fiopost;
    @XmlElement(name = "DEPART_PARENT")
    protected String departparent;
    @XmlElement(name = "POST_SHORT")
    protected String postshort;
    @XmlElement(name = "POST_ID")
    protected String postid;
    @XmlElement(name = "ZPHONE_1")
    protected String zphone1;
    @XmlElement(name = "ZPHONE_2")
    protected String zphone2;
    @XmlElement(name = "ZPHONE_MOB_1")
    protected String zphonemob1;
    @XmlElement(name = "ZPHONE_MOB_2")
    protected String zphonemob2;
    @XmlElement(name = "ZUSRID_LONG")
    protected String zusridlong;
    @XmlElement(name = "AEDTM")
    protected String aedtm;
    @XmlElement(name = "DHIRE")
    protected String dhire;
    @XmlElement(name = "KTEXT")
    protected String ktext;
    @XmlElement(name = "ZZFLOOR")
    protected String zzfloor;
    @XmlElement(name = "ZZROOM")
    protected String zzroom;
    @XmlElement(name = "VIEWSTATUS")
    protected String viewstatus;
    @XmlElement(name = "PREVUNIQUENAME")
    protected String prevuniquename;
    @XmlElement(name = "POSTRANG")
    protected String postrang;
    @XmlElement(name = "BS")
    protected String bs;
    @XmlElement(name = "FN")
    protected String fn;
    @XmlElement(name = "KPS")
    protected String kps;
    @XmlElement(name = "RMPRF")
    protected String rmprf;
    @XmlElement(name = "MVZ")
    protected String mvz;
    @XmlElement(name = "SYSMOMENT")
    protected String sysmoment;

    /**
     * Gets the value of the integrationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTEGRATIONID() {
        return integrationid;
    }

    /**
     * Sets the value of the integrationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTEGRATIONID(String value) {
        this.integrationid = value;
    }

    /**
     * Gets the value of the faceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACEID() {
        return faceid;
    }

    /**
     * Sets the value of the faceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACEID(String value) {
        this.faceid = value;
    }

    /**
     * Gets the value of the departid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPARTID() {
        return departid;
    }

    /**
     * Sets the value of the departid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPARTID(String value) {
        this.departid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
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
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the escdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESCDATE() {
        return escdate;
    }

    /**
     * Sets the value of the escdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESCDATE(String value) {
        this.escdate = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDDLENAME() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDDLENAME(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the uniquename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIQUENAME() {
        return uniquename;
    }

    /**
     * Sets the value of the uniquename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIQUENAME(String value) {
        this.uniquename = value;
    }

    /**
     * Gets the value of the briefname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRIEFNAME() {
        return briefname;
    }

    /**
     * Sets the value of the briefname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRIEFNAME(String value) {
        this.briefname = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHDAY() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHDAY(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOST() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOST(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGNAME() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGNAME(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the tabnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABNUM() {
        return tabnum;
    }

    /**
     * Sets the value of the tabnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABNUM(String value) {
        this.tabnum = value;
    }

    /**
     * Gets the value of the personid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONID() {
        return personid;
    }

    /**
     * Sets the value of the personid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONID(String value) {
        this.personid = value;
    }

    /**
     * Gets the value of the ismanager property.
     * 
     */
    public boolean isISMANAGER() {
        return ismanager;
    }

    /**
     * Sets the value of the ismanager property.
     * 
     */
    public void setISMANAGER(boolean value) {
        this.ismanager = value;
    }

    /**
     * Gets the value of the issecmanager property.
     * 
     */
    public boolean isISSECMANAGER() {
        return issecmanager;
    }

    /**
     * Sets the value of the issecmanager property.
     * 
     */
    public void setISSECMANAGER(boolean value) {
        this.issecmanager = value;
    }

    /**
     * Gets the value of the isblockmanager property.
     * 
     */
    public boolean isISBLOCKMANAGER() {
        return isblockmanager;
    }

    /**
     * Sets the value of the isblockmanager property.
     * 
     */
    public void setISBLOCKMANAGER(boolean value) {
        this.isblockmanager = value;
    }

    /**
     * Gets the value of the iscurator property.
     * 
     */
    public boolean isISCURATOR() {
        return iscurator;
    }

    /**
     * Sets the value of the iscurator property.
     * 
     */
    public void setISCURATOR(boolean value) {
        this.iscurator = value;
    }

    /**
     * Gets the value of the sortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTCODE() {
        return sortcode;
    }

    /**
     * Sets the value of the sortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTCODE(String value) {
        this.sortcode = value;
    }

    /**
     * Gets the value of the statusdekret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSDEKRET() {
        return statusdekret;
    }

    /**
     * Sets the value of the statusdekret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSDEKRET(String value) {
        this.statusdekret = value;
    }

    /**
     * Gets the value of the dekretdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEKRETDT() {
        return dekretdt;
    }

    /**
     * Sets the value of the dekretdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEKRETDT(String value) {
        this.dekretdt = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEX() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEX(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the statusfiop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSFIOP() {
        return statusfiop;
    }

    /**
     * Sets the value of the statusfiop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSFIOP(String value) {
        this.statusfiop = value;
    }

    /**
     * Gets the value of the fiopost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOPOST() {
        return fiopost;
    }

    /**
     * Sets the value of the fiopost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOPOST(String value) {
        this.fiopost = value;
    }

    /**
     * Gets the value of the departparent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPARTPARENT() {
        return departparent;
    }

    /**
     * Sets the value of the departparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPARTPARENT(String value) {
        this.departparent = value;
    }

    /**
     * Gets the value of the postshort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTSHORT() {
        return postshort;
    }

    /**
     * Sets the value of the postshort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTSHORT(String value) {
        this.postshort = value;
    }

    /**
     * Gets the value of the postid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTID() {
        return postid;
    }

    /**
     * Sets the value of the postid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTID(String value) {
        this.postid = value;
    }

    /**
     * Gets the value of the zphone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZPHONE1() {
        return zphone1;
    }

    /**
     * Sets the value of the zphone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZPHONE1(String value) {
        this.zphone1 = value;
    }

    /**
     * Gets the value of the zphone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZPHONE2() {
        return zphone2;
    }

    /**
     * Sets the value of the zphone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZPHONE2(String value) {
        this.zphone2 = value;
    }

    /**
     * Gets the value of the zphonemob1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZPHONEMOB1() {
        return zphonemob1;
    }

    /**
     * Sets the value of the zphonemob1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZPHONEMOB1(String value) {
        this.zphonemob1 = value;
    }

    /**
     * Gets the value of the zphonemob2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZPHONEMOB2() {
        return zphonemob2;
    }

    /**
     * Sets the value of the zphonemob2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZPHONEMOB2(String value) {
        this.zphonemob2 = value;
    }

    /**
     * Gets the value of the zusridlong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZUSRIDLONG() {
        return zusridlong;
    }

    /**
     * Sets the value of the zusridlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZUSRIDLONG(String value) {
        this.zusridlong = value;
    }

    /**
     * Gets the value of the aedtm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDTM() {
        return aedtm;
    }

    /**
     * Sets the value of the aedtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDTM(String value) {
        this.aedtm = value;
    }

    /**
     * Gets the value of the dhire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHIRE() {
        return dhire;
    }

    /**
     * Sets the value of the dhire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHIRE(String value) {
        this.dhire = value;
    }

    /**
     * Gets the value of the ktext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKTEXT() {
        return ktext;
    }

    /**
     * Sets the value of the ktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKTEXT(String value) {
        this.ktext = value;
    }

    /**
     * Gets the value of the zzfloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZFLOOR() {
        return zzfloor;
    }

    /**
     * Sets the value of the zzfloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZFLOOR(String value) {
        this.zzfloor = value;
    }

    /**
     * Gets the value of the zzroom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZROOM() {
        return zzroom;
    }

    /**
     * Sets the value of the zzroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZROOM(String value) {
        this.zzroom = value;
    }

    /**
     * Gets the value of the viewstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIEWSTATUS() {
        return viewstatus;
    }

    /**
     * Sets the value of the viewstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIEWSTATUS(String value) {
        this.viewstatus = value;
    }

    /**
     * Gets the value of the prevuniquename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVUNIQUENAME() {
        return prevuniquename;
    }

    /**
     * Sets the value of the prevuniquename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVUNIQUENAME(String value) {
        this.prevuniquename = value;
    }

    /**
     * Gets the value of the postrang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTRANG() {
        return postrang;
    }

    /**
     * Sets the value of the postrang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTRANG(String value) {
        this.postrang = value;
    }

    /**
     * Gets the value of the bs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBS() {
        return bs;
    }

    /**
     * Sets the value of the bs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBS(String value) {
        this.bs = value;
    }

    /**
     * Gets the value of the fn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFN() {
        return fn;
    }

    /**
     * Sets the value of the fn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFN(String value) {
        this.fn = value;
    }

    /**
     * Gets the value of the kps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPS() {
        return kps;
    }

    /**
     * Sets the value of the kps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPS(String value) {
        this.kps = value;
    }

    /**
     * Gets the value of the rmprf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMPRF() {
        return rmprf;
    }

    /**
     * Sets the value of the rmprf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMPRF(String value) {
        this.rmprf = value;
    }

    /**
     * Gets the value of the mvz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVZ() {
        return mvz;
    }

    /**
     * Sets the value of the mvz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVZ(String value) {
        this.mvz = value;
    }

    /**
     * Gets the value of the sysmoment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSMOMENT() {
        return sysmoment;
    }

    /**
     * Sets the value of the sysmoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSMOMENT(String value) {
        this.sysmoment = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("integrationid", integrationid).add("faceid", faceid).add("departid", departid).add("status", status).add("escdate", escdate).add("lastname", lastname).add("firstname", firstname).add("middlename", middlename).add("uniquename", uniquename).add("briefname", briefname).add("birthday", birthday).add("post", post).add("orgname", orgname).add("tabnum", tabnum).add("personid", personid).add("ismanager", ismanager).add("issecmanager", issecmanager).add("isblockmanager", isblockmanager).add("iscurator", iscurator).add("sortcode", sortcode).add("statusdekret", statusdekret).add("dekretdt", dekretdt).add("sex", sex).add("statusfiop", statusfiop).add("fiopost", fiopost).add("departparent", departparent).add("postshort", postshort).add("postid", postid).add("zphone1", zphone1).add("zphone2", zphone2).add("zphonemob1", zphonemob1).add("zphonemob2", zphonemob2).add("zusridlong", zusridlong).add("aedtm", aedtm).add("dhire", dhire).add("ktext", ktext).add("zzfloor", zzfloor).add("zzroom", zzroom).add("viewstatus", viewstatus).add("prevuniquename", prevuniquename).add("postrang", postrang).add("bs", bs).add("fn", fn).add("kps", kps).add("rmprf", rmprf).add("mvz", mvz).add("sysmoment", sysmoment).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(integrationid, faceid, departid, status, escdate, lastname, firstname, middlename, uniquename, briefname, birthday, post, orgname, tabnum, personid, ismanager, issecmanager, isblockmanager, iscurator, sortcode, statusdekret, dekretdt, sex, statusfiop, fiopost, departparent, postshort, postid, zphone1, zphone2, zphonemob1, zphonemob2, zusridlong, aedtm, dhire, ktext, zzfloor, zzroom, viewstatus, prevuniquename, postrang, bs, fn, kps, rmprf, mvz, sysmoment);
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
        final EmployeeCreationRequest o = ((EmployeeCreationRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((Objects.equal(this.integrationid, o.integrationid)&&Objects.equal(this.faceid, o.faceid))&&Objects.equal(this.departid, o.departid))&&Objects.equal(this.status, o.status))&&Objects.equal(this.escdate, o.escdate))&&Objects.equal(this.lastname, o.lastname))&&Objects.equal(this.firstname, o.firstname))&&Objects.equal(this.middlename, o.middlename))&&Objects.equal(this.uniquename, o.uniquename))&&Objects.equal(this.briefname, o.briefname))&&Objects.equal(this.birthday, o.birthday))&&Objects.equal(this.post, o.post))&&Objects.equal(this.orgname, o.orgname))&&Objects.equal(this.tabnum, o.tabnum))&&Objects.equal(this.personid, o.personid))&&Objects.equal(this.ismanager, o.ismanager))&&Objects.equal(this.issecmanager, o.issecmanager))&&Objects.equal(this.isblockmanager, o.isblockmanager))&&Objects.equal(this.iscurator, o.iscurator))&&Objects.equal(this.sortcode, o.sortcode))&&Objects.equal(this.statusdekret, o.statusdekret))&&Objects.equal(this.dekretdt, o.dekretdt))&&Objects.equal(this.sex, o.sex))&&Objects.equal(this.statusfiop, o.statusfiop))&&Objects.equal(this.fiopost, o.fiopost))&&Objects.equal(this.departparent, o.departparent))&&Objects.equal(this.postshort, o.postshort))&&Objects.equal(this.postid, o.postid))&&Objects.equal(this.zphone1, o.zphone1))&&Objects.equal(this.zphone2, o.zphone2))&&Objects.equal(this.zphonemob1, o.zphonemob1))&&Objects.equal(this.zphonemob2, o.zphonemob2))&&Objects.equal(this.zusridlong, o.zusridlong))&&Objects.equal(this.aedtm, o.aedtm))&&Objects.equal(this.dhire, o.dhire))&&Objects.equal(this.ktext, o.ktext))&&Objects.equal(this.zzfloor, o.zzfloor))&&Objects.equal(this.zzroom, o.zzroom))&&Objects.equal(this.viewstatus, o.viewstatus))&&Objects.equal(this.prevuniquename, o.prevuniquename))&&Objects.equal(this.postrang, o.postrang))&&Objects.equal(this.bs, o.bs))&&Objects.equal(this.fn, o.fn))&&Objects.equal(this.kps, o.kps))&&Objects.equal(this.rmprf, o.rmprf))&&Objects.equal(this.mvz, o.mvz))&&Objects.equal(this.sysmoment, o.sysmoment));
    }

}
