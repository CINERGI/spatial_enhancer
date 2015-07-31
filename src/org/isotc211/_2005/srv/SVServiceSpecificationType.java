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


/**
 * <p>Java class for SV_ServiceSpecification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SV_ServiceSpecification_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/srv}AbstractSV_AbstractServiceSpecification_Type">
 *       &lt;sequence>
 *         &lt;element name="typeSpec" type="{http://www.isotc211.org/2005/srv}SV_PlatformNeutralServiceSpecification_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SV_ServiceSpecification_Type", propOrder = {
    "typeSpec"
})
public class SVServiceSpecificationType
    extends AbstractSVAbstractServiceSpecificationType
{

    @XmlElement(required = true)
    protected List<SVPlatformNeutralServiceSpecificationPropertyType> typeSpec;

    /**
     * Gets the value of the typeSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVPlatformNeutralServiceSpecificationPropertyType }
     * 
     * 
     */
    public List<SVPlatformNeutralServiceSpecificationPropertyType> getTypeSpec() {
        if (typeSpec == null) {
            typeSpec = new ArrayList<SVPlatformNeutralServiceSpecificationPropertyType>();
        }
        return this.typeSpec;
    }

}
