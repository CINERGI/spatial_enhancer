//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.20 at 09:34:23 PM PDT 
//


package org.isotc211._2005.srv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.GenericNamePropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.AbstractMDIdentificationType;
import org.isotc211.iso19139.d_2007_04_17.gmd.EXExtentPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.MDConstraintsPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.MDDataIdentificationPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.MDKeywordsPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.MDStandardOrderProcessPropertyType;


/**
 * <p>Java class for SV_ServiceIdentification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SV_ServiceIdentification_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_Identification_Type">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{http://www.isotc211.org/2005/gco}GenericName_PropertyType"/>
 *         &lt;element name="serviceTypeVersion" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accessProperties" type="{http://www.isotc211.org/2005/gmd}MD_StandardOrderProcess_PropertyType" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{http://www.isotc211.org/2005/gmd}MD_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.isotc211.org/2005/gmd}MD_Keywords_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="couplingType" type="{http://www.isotc211.org/2005/srv}SV_CouplingType_PropertyType"/>
 *         &lt;element name="coupledResource" type="{http://www.isotc211.org/2005/srv}SV_CoupledResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="containsOperations" type="{http://www.isotc211.org/2005/srv}SV_OperationMetadata_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="operatesOn" type="{http://www.isotc211.org/2005/gmd}MD_DataIdentification_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SV_ServiceIdentification_Type", propOrder = {
    "serviceType",
    "serviceTypeVersion",
    "accessProperties",
    "restrictions",
    "keywords",
    "extent",
    "couplingType",
    "coupledResource",
    "containsOperations",
    "operatesOn"
})
public class SVServiceIdentificationType
    extends AbstractMDIdentificationType
{

    @XmlElement(required = true)
    protected GenericNamePropertyType serviceType;
    protected List<CharacterStringPropertyType> serviceTypeVersion;
    protected MDStandardOrderProcessPropertyType accessProperties;
    protected List<MDConstraintsPropertyType> restrictions;
    protected List<MDKeywordsPropertyType> keywords;
    protected List<EXExtentPropertyType> extent;
    @XmlElement(required = true)
    protected SVCouplingTypePropertyType couplingType;
    protected List<SVCoupledResourcePropertyType> coupledResource;
    @XmlElement(required = true)
    protected List<SVOperationMetadataPropertyType> containsOperations;
    protected List<MDDataIdentificationPropertyType> operatesOn;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link GenericNamePropertyType }
     *     
     */
    public GenericNamePropertyType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericNamePropertyType }
     *     
     */
    public void setServiceType(GenericNamePropertyType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceTypeVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTypeVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTypeVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getServiceTypeVersion() {
        if (serviceTypeVersion == null) {
            serviceTypeVersion = new ArrayList<CharacterStringPropertyType>();
        }
        return this.serviceTypeVersion;
    }

    /**
     * Gets the value of the accessProperties property.
     * 
     * @return
     *     possible object is
     *     {@link MDStandardOrderProcessPropertyType }
     *     
     */
    public MDStandardOrderProcessPropertyType getAccessProperties() {
        return accessProperties;
    }

    /**
     * Sets the value of the accessProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDStandardOrderProcessPropertyType }
     *     
     */
    public void setAccessProperties(MDStandardOrderProcessPropertyType value) {
        this.accessProperties = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDConstraintsPropertyType }
     * 
     * 
     */
    public List<MDConstraintsPropertyType> getRestrictions() {
        if (restrictions == null) {
            restrictions = new ArrayList<MDConstraintsPropertyType>();
        }
        return this.restrictions;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDKeywordsPropertyType }
     * 
     * 
     */
    public List<MDKeywordsPropertyType> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<MDKeywordsPropertyType>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<EXExtentPropertyType>();
        }
        return this.extent;
    }

    /**
     * Gets the value of the couplingType property.
     * 
     * @return
     *     possible object is
     *     {@link SVCouplingTypePropertyType }
     *     
     */
    public SVCouplingTypePropertyType getCouplingType() {
        return couplingType;
    }

    /**
     * Sets the value of the couplingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SVCouplingTypePropertyType }
     *     
     */
    public void setCouplingType(SVCouplingTypePropertyType value) {
        this.couplingType = value;
    }

    /**
     * Gets the value of the coupledResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupledResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupledResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVCoupledResourcePropertyType }
     * 
     * 
     */
    public List<SVCoupledResourcePropertyType> getCoupledResource() {
        if (coupledResource == null) {
            coupledResource = new ArrayList<SVCoupledResourcePropertyType>();
        }
        return this.coupledResource;
    }

    /**
     * Gets the value of the containsOperations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containsOperations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainsOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVOperationMetadataPropertyType }
     * 
     * 
     */
    public List<SVOperationMetadataPropertyType> getContainsOperations() {
        if (containsOperations == null) {
            containsOperations = new ArrayList<SVOperationMetadataPropertyType>();
        }
        return this.containsOperations;
    }

    /**
     * Gets the value of the operatesOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatesOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatesOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDataIdentificationPropertyType }
     * 
     * 
     */
    public List<MDDataIdentificationPropertyType> getOperatesOn() {
        if (operatesOn == null) {
            operatesOn = new ArrayList<MDDataIdentificationPropertyType>();
        }
        return this.operatesOn;
    }

}
