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
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.CIOnlineResourcePropertyType;


/**
 * <p>Java class for SV_OperationMetadata_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SV_OperationMetadata_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="operationName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="DCP" type="{http://www.isotc211.org/2005/srv}DCPList_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="operationDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="invocationName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.isotc211.org/2005/srv}SV_Parameter_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connectPoint" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="dependsOn" type="{http://www.isotc211.org/2005/srv}SV_OperationMetadata_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SV_OperationMetadata_Type", propOrder = {
    "operationName",
    "dcp",
    "operationDescription",
    "invocationName",
    "parameters",
    "connectPoint",
    "dependsOn"
})
public class SVOperationMetadataType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType operationName;
    @XmlElement(name = "DCP", required = true)
    protected List<DCPListPropertyType> dcp;
    protected CharacterStringPropertyType operationDescription;
    protected CharacterStringPropertyType invocationName;
    protected List<SVParameterPropertyType> parameters;
    @XmlElement(required = true)
    protected List<CIOnlineResourcePropertyType> connectPoint;
    protected List<SVOperationMetadataPropertyType> dependsOn;

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOperationName(CharacterStringPropertyType value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the dcp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCPListPropertyType }
     * 
     * 
     */
    public List<DCPListPropertyType> getDCP() {
        if (dcp == null) {
            dcp = new ArrayList<DCPListPropertyType>();
        }
        return this.dcp;
    }

    /**
     * Gets the value of the operationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOperationDescription() {
        return operationDescription;
    }

    /**
     * Sets the value of the operationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOperationDescription(CharacterStringPropertyType value) {
        this.operationDescription = value;
    }

    /**
     * Gets the value of the invocationName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getInvocationName() {
        return invocationName;
    }

    /**
     * Sets the value of the invocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setInvocationName(CharacterStringPropertyType value) {
        this.invocationName = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVParameterPropertyType }
     * 
     * 
     */
    public List<SVParameterPropertyType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<SVParameterPropertyType>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the connectPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourcePropertyType }
     * 
     * 
     */
    public List<CIOnlineResourcePropertyType> getConnectPoint() {
        if (connectPoint == null) {
            connectPoint = new ArrayList<CIOnlineResourcePropertyType>();
        }
        return this.connectPoint;
    }

    /**
     * Gets the value of the dependsOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependsOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependsOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVOperationMetadataPropertyType }
     * 
     * 
     */
    public List<SVOperationMetadataPropertyType> getDependsOn() {
        if (dependsOn == null) {
            dependsOn = new ArrayList<SVOperationMetadataPropertyType>();
        }
        return this.dependsOn;
    }

}
