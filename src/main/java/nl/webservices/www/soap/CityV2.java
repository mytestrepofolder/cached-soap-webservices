/**
 * CityV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CityV2  implements java.io.Serializable {
    private int plaatsid;

    private java.lang.String plaatsnaam;

    private java.lang.String plaatsnaam_ptt;

    private java.lang.String plaatsnaam_extract;

    private int gemeenteid;

    private java.lang.String gemeentenaam;

    private int gemeentecode;

    private int cebucocode;

    private java.lang.String provinciecode;

    private java.lang.String provincienaam;

    public CityV2() {
    }

    public CityV2(
           int plaatsid,
           java.lang.String plaatsnaam,
           java.lang.String plaatsnaam_ptt,
           java.lang.String plaatsnaam_extract,
           int gemeenteid,
           java.lang.String gemeentenaam,
           int gemeentecode,
           int cebucocode,
           java.lang.String provinciecode,
           java.lang.String provincienaam) {
           this.plaatsid = plaatsid;
           this.plaatsnaam = plaatsnaam;
           this.plaatsnaam_ptt = plaatsnaam_ptt;
           this.plaatsnaam_extract = plaatsnaam_extract;
           this.gemeenteid = gemeenteid;
           this.gemeentenaam = gemeentenaam;
           this.gemeentecode = gemeentecode;
           this.cebucocode = cebucocode;
           this.provinciecode = provinciecode;
           this.provincienaam = provincienaam;
    }


    /**
     * Gets the plaatsid value for this CityV2.
     * 
     * @return plaatsid
     */
    public int getPlaatsid() {
        return plaatsid;
    }


    /**
     * Sets the plaatsid value for this CityV2.
     * 
     * @param plaatsid
     */
    public void setPlaatsid(int plaatsid) {
        this.plaatsid = plaatsid;
    }


    /**
     * Gets the plaatsnaam value for this CityV2.
     * 
     * @return plaatsnaam
     */
    public java.lang.String getPlaatsnaam() {
        return plaatsnaam;
    }


    /**
     * Sets the plaatsnaam value for this CityV2.
     * 
     * @param plaatsnaam
     */
    public void setPlaatsnaam(java.lang.String plaatsnaam) {
        this.plaatsnaam = plaatsnaam;
    }


    /**
     * Gets the plaatsnaam_ptt value for this CityV2.
     * 
     * @return plaatsnaam_ptt
     */
    public java.lang.String getPlaatsnaam_ptt() {
        return plaatsnaam_ptt;
    }


    /**
     * Sets the plaatsnaam_ptt value for this CityV2.
     * 
     * @param plaatsnaam_ptt
     */
    public void setPlaatsnaam_ptt(java.lang.String plaatsnaam_ptt) {
        this.plaatsnaam_ptt = plaatsnaam_ptt;
    }


    /**
     * Gets the plaatsnaam_extract value for this CityV2.
     * 
     * @return plaatsnaam_extract
     */
    public java.lang.String getPlaatsnaam_extract() {
        return plaatsnaam_extract;
    }


    /**
     * Sets the plaatsnaam_extract value for this CityV2.
     * 
     * @param plaatsnaam_extract
     */
    public void setPlaatsnaam_extract(java.lang.String plaatsnaam_extract) {
        this.plaatsnaam_extract = plaatsnaam_extract;
    }


    /**
     * Gets the gemeenteid value for this CityV2.
     * 
     * @return gemeenteid
     */
    public int getGemeenteid() {
        return gemeenteid;
    }


    /**
     * Sets the gemeenteid value for this CityV2.
     * 
     * @param gemeenteid
     */
    public void setGemeenteid(int gemeenteid) {
        this.gemeenteid = gemeenteid;
    }


    /**
     * Gets the gemeentenaam value for this CityV2.
     * 
     * @return gemeentenaam
     */
    public java.lang.String getGemeentenaam() {
        return gemeentenaam;
    }


    /**
     * Sets the gemeentenaam value for this CityV2.
     * 
     * @param gemeentenaam
     */
    public void setGemeentenaam(java.lang.String gemeentenaam) {
        this.gemeentenaam = gemeentenaam;
    }


    /**
     * Gets the gemeentecode value for this CityV2.
     * 
     * @return gemeentecode
     */
    public int getGemeentecode() {
        return gemeentecode;
    }


    /**
     * Sets the gemeentecode value for this CityV2.
     * 
     * @param gemeentecode
     */
    public void setGemeentecode(int gemeentecode) {
        this.gemeentecode = gemeentecode;
    }


    /**
     * Gets the cebucocode value for this CityV2.
     * 
     * @return cebucocode
     */
    public int getCebucocode() {
        return cebucocode;
    }


    /**
     * Sets the cebucocode value for this CityV2.
     * 
     * @param cebucocode
     */
    public void setCebucocode(int cebucocode) {
        this.cebucocode = cebucocode;
    }


    /**
     * Gets the provinciecode value for this CityV2.
     * 
     * @return provinciecode
     */
    public java.lang.String getProvinciecode() {
        return provinciecode;
    }


    /**
     * Sets the provinciecode value for this CityV2.
     * 
     * @param provinciecode
     */
    public void setProvinciecode(java.lang.String provinciecode) {
        this.provinciecode = provinciecode;
    }


    /**
     * Gets the provincienaam value for this CityV2.
     * 
     * @return provincienaam
     */
    public java.lang.String getProvincienaam() {
        return provincienaam;
    }


    /**
     * Sets the provincienaam value for this CityV2.
     * 
     * @param provincienaam
     */
    public void setProvincienaam(java.lang.String provincienaam) {
        this.provincienaam = provincienaam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CityV2)) return false;
        CityV2 other = (CityV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.plaatsid == other.getPlaatsid() &&
            ((this.plaatsnaam==null && other.getPlaatsnaam()==null) || 
             (this.plaatsnaam!=null &&
              this.plaatsnaam.equals(other.getPlaatsnaam()))) &&
            ((this.plaatsnaam_ptt==null && other.getPlaatsnaam_ptt()==null) || 
             (this.plaatsnaam_ptt!=null &&
              this.plaatsnaam_ptt.equals(other.getPlaatsnaam_ptt()))) &&
            ((this.plaatsnaam_extract==null && other.getPlaatsnaam_extract()==null) || 
             (this.plaatsnaam_extract!=null &&
              this.plaatsnaam_extract.equals(other.getPlaatsnaam_extract()))) &&
            this.gemeenteid == other.getGemeenteid() &&
            ((this.gemeentenaam==null && other.getGemeentenaam()==null) || 
             (this.gemeentenaam!=null &&
              this.gemeentenaam.equals(other.getGemeentenaam()))) &&
            this.gemeentecode == other.getGemeentecode() &&
            this.cebucocode == other.getCebucocode() &&
            ((this.provinciecode==null && other.getProvinciecode()==null) || 
             (this.provinciecode!=null &&
              this.provinciecode.equals(other.getProvinciecode()))) &&
            ((this.provincienaam==null && other.getProvincienaam()==null) || 
             (this.provincienaam!=null &&
              this.provincienaam.equals(other.getProvincienaam())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getPlaatsid();
        if (getPlaatsnaam() != null) {
            _hashCode += getPlaatsnaam().hashCode();
        }
        if (getPlaatsnaam_ptt() != null) {
            _hashCode += getPlaatsnaam_ptt().hashCode();
        }
        if (getPlaatsnaam_extract() != null) {
            _hashCode += getPlaatsnaam_extract().hashCode();
        }
        _hashCode += getGemeenteid();
        if (getGemeentenaam() != null) {
            _hashCode += getGemeentenaam().hashCode();
        }
        _hashCode += getGemeentecode();
        _hashCode += getCebucocode();
        if (getProvinciecode() != null) {
            _hashCode += getProvinciecode().hashCode();
        }
        if (getProvincienaam() != null) {
            _hashCode += getProvincienaam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CityV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CityV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaatsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaatsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaatsnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaatsnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaatsnaam_ptt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaatsnaam_ptt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaatsnaam_extract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaatsnaam_extract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeenteid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeenteid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentenaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentenaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cebucocode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cebucocode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provinciecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincienaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provincienaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
