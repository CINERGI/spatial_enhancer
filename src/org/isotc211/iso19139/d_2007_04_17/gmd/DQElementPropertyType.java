//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.20 at 09:34:23 PM PDT 
//


package org.isotc211.iso19139.d_2007_04_17.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gmi.QEUsabilityType;


/**
 * <p>Java class for DQ_Element_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DQ_Element_PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}AbstractDQ_Element"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectReference"/>
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Element_PropertyType", propOrder = {
    "abstractDQElement"
})
public class DQElementPropertyType {

    @XmlElementRef(name = "AbstractDQ_Element", namespace = "http://www.isotc211.org/2005/gmd", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractDQElementType> abstractDQElement;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;
    @XmlAttribute(name = "uuidref")
    protected String uuidref;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected String actuate;

    /**
     * Gets the value of the abstractDQElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DQRelativeInternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAccuracyOfATimeMeasurementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTemporalValidityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAbsoluteExternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQDomainConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQFormatConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQGriddedDataPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQConceptualConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQLogicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessCommissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQCompletenessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQNonQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessOmissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTopologicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QEUsabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQThematicAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTemporalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQThematicClassificationCorrectnessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQTemporalAccuracyType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractDQElementType> getAbstractDQElement() {
        return abstractDQElement;
    }

    /**
     * Sets the value of the abstractDQElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DQRelativeInternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAccuracyOfATimeMeasurementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTemporalValidityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQAbsoluteExternalPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQDomainConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQFormatConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQGriddedDataPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQConceptualConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQLogicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessCommissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQCompletenessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQNonQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQCompletenessOmissionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQPositionalAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTopologicalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QEUsabilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQThematicAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQTemporalConsistencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQThematicClassificationCorrectnessType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DQQuantitativeAttributeAccuracyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDQTemporalAccuracyType }{@code >}
     *     
     */
    public void setAbstractDQElement(JAXBElement<? extends AbstractDQElementType> value) {
        this.abstractDQElement = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Gets the value of the uuidref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidref() {
        return uuidref;
    }

    /**
     * Sets the value of the uuidref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidref(String value) {
        this.uuidref = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "simple";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
