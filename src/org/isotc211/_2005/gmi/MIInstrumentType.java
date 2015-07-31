//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.20 at 09:34:23 PM PDT 
//


package org.isotc211._2005.gmi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.CICitationPropertyType;
import org.isotc211.iso19139.d_2007_04_17.gmd.MDIdentifierPropertyType;


/**
 * Description: Designations for the measuring instruments - FGDC: Platform_and_Instrument_Identification - shortName: PltfrmInstId
 * 
 * <p>Java class for MI_Instrument_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MI_Instrument_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="citation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/>
 *         &lt;element name="type" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="mountedOn" type="{http://www.isotc211.org/2005/gmi}MI_Platform_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MI_Instrument_Type", propOrder = {
    "citation",
    "identifier",
    "type",
    "description",
    "mountedOn"
})
public class MIInstrumentType
    extends AbstractObjectType
{

    protected List<CICitationPropertyType> citation;
    @XmlElement(required = true)
    protected MDIdentifierPropertyType identifier;
    @XmlElement(required = true)
    protected CharacterStringPropertyType type;
    protected CharacterStringPropertyType description;
    protected MIPlatformPropertyType mountedOn;

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CICitationPropertyType>();
        }
        return this.citation;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setIdentifier(MDIdentifierPropertyType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setType(CharacterStringPropertyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * Gets the value of the mountedOn property.
     * 
     * @return
     *     possible object is
     *     {@link MIPlatformPropertyType }
     *     
     */
    public MIPlatformPropertyType getMountedOn() {
        return mountedOn;
    }

    /**
     * Sets the value of the mountedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIPlatformPropertyType }
     *     
     */
    public void setMountedOn(MIPlatformPropertyType value) {
        this.mountedOn = value;
    }

}
