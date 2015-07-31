//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.20 at 09:34:23 PM PDT 
//


package org.isotc211._2005.srv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211.iso19139.d_2007_04_17.gmd.URLPropertyType;


/**
 * <p>Java class for SV_PortSpecification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SV_PortSpecification_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="binding" type="{http://www.isotc211.org/2005/srv}DCPList_PropertyType"/>
 *         &lt;element name="address" type="{http://www.isotc211.org/2005/gmd}URL_PropertyType"/>
 *         &lt;element name="theSV_Port" type="{http://www.isotc211.org/2005/srv}SV_Port_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SV_PortSpecification_Type", propOrder = {
    "binding",
    "address",
    "theSVPort"
})
public class SVPortSpecificationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DCPListPropertyType binding;
    @XmlElement(required = true)
    protected URLPropertyType address;
    @XmlElement(name = "theSV_Port", required = true)
    protected SVPortPropertyType theSVPort;

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link DCPListPropertyType }
     *     
     */
    public DCPListPropertyType getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCPListPropertyType }
     *     
     */
    public void setBinding(DCPListPropertyType value) {
        this.binding = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link URLPropertyType }
     *     
     */
    public URLPropertyType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLPropertyType }
     *     
     */
    public void setAddress(URLPropertyType value) {
        this.address = value;
    }

    /**
     * Gets the value of the theSVPort property.
     * 
     * @return
     *     possible object is
     *     {@link SVPortPropertyType }
     *     
     */
    public SVPortPropertyType getTheSVPort() {
        return theSVPort;
    }

    /**
     * Sets the value of the theSVPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SVPortPropertyType }
     *     
     */
    public void setTheSVPort(SVPortPropertyType value) {
        this.theSVPort = value;
    }

}
