//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.20 at 09:34:23 PM PDT 
//


package org.isotc211._2005.gmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211.iso19139.d_2007_04_17.gmd.DSDataSetType;


/**
 * <p>Java class for MX_DataSet_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MX_DataSet_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}DS_DataSet_Type">
 *       &lt;sequence>
 *         &lt;element name="dataFile" type="{http://www.isotc211.org/2005/gmx}MX_DataFile_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="datasetCatalogue" type="{http://www.isotc211.org/2005/gmx}CT_Catalogue_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportFile" type="{http://www.isotc211.org/2005/gmx}MX_SupportFile_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MX_DataSet_Type", propOrder = {
    "dataFile",
    "datasetCatalogue",
    "supportFile"
})
public class MXDataSetType
    extends DSDataSetType
{

    @XmlElement(required = true)
    protected List<MXDataFilePropertyType> dataFile;
    protected List<CTCataloguePropertyType> datasetCatalogue;
    protected List<MXSupportFilePropertyType> supportFile;

    /**
     * Gets the value of the dataFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXDataFilePropertyType }
     * 
     * 
     */
    public List<MXDataFilePropertyType> getDataFile() {
        if (dataFile == null) {
            dataFile = new ArrayList<MXDataFilePropertyType>();
        }
        return this.dataFile;
    }

    /**
     * Gets the value of the datasetCatalogue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetCatalogue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetCatalogue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCataloguePropertyType }
     * 
     * 
     */
    public List<CTCataloguePropertyType> getDatasetCatalogue() {
        if (datasetCatalogue == null) {
            datasetCatalogue = new ArrayList<CTCataloguePropertyType>();
        }
        return this.datasetCatalogue;
    }

    /**
     * Gets the value of the supportFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXSupportFilePropertyType }
     * 
     * 
     */
    public List<MXSupportFilePropertyType> getSupportFile() {
        if (supportFile == null) {
            supportFile = new ArrayList<MXSupportFilePropertyType>();
        }
        return this.supportFile;
    }

}
