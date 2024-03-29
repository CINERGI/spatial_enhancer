//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.20 at 09:34:23 PM PDT 
//


package org.isotc211._2005.gmi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.DateTimePropertyType;


/**
 * Description: range of date validity - shortName: ReqstDate
 * 
 * <p>Java class for MI_RequestedDate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_RequestedDate_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="requestedDateOfCollection" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType"/>
 *         &lt;element name="latestAcceptableDate" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_RequestedDate_Type", propOrder = {
    "requestedDateOfCollection",
    "latestAcceptableDate"
})
public class MIRequestedDateType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DateTimePropertyType requestedDateOfCollection;
    @XmlElement(required = true)
    protected DateTimePropertyType latestAcceptableDate;

    /**
     * Gets the value of the requestedDateOfCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getRequestedDateOfCollection() {
        return requestedDateOfCollection;
    }

    /**
     * Sets the value of the requestedDateOfCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setRequestedDateOfCollection(DateTimePropertyType value) {
        this.requestedDateOfCollection = value;
    }

    /**
     * Gets the value of the latestAcceptableDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getLatestAcceptableDate() {
        return latestAcceptableDate;
    }

    /**
     * Sets the value of the latestAcceptableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setLatestAcceptableDate(DateTimePropertyType value) {
        this.latestAcceptableDate = value;
    }

}
