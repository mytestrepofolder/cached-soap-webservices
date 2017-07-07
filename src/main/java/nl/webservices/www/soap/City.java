/**
 * City.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class City  implements java.io.Serializable {
    private int plaatsid;

    private java.lang.String plaatsnaam;

    private java.lang.String plaatsnaam_ptt;

    private java.lang.String plaatsnaam_extract;

    private int gemeenteid;

    public City() {
    }

    public City(
           int plaatsid,
           java.lang.String plaatsnaam,
           java.lang.String plaatsnaam_ptt,
           java.lang.String plaatsnaam_extract,
           int gemeenteid) {
           this.plaatsid = plaatsid;
           this.plaatsnaam = plaatsnaam;
           this.plaatsnaam_ptt = plaatsnaam_ptt;
           this.plaatsnaam_extract = plaatsnaam_extract;
           this.gemeenteid = gemeenteid;
    }


    /**
     * Gets the plaatsid value for this City.
     * 
     * @return plaatsid
     */
    public int getPlaatsid() {
        return plaatsid;
    }


    /**
     * Sets the plaatsid value for this City.
     * 
     * @param plaatsid
     */
    public void setPlaatsid(int plaatsid) {
        this.plaatsid = plaatsid;
    }


    /**
     * Gets the plaatsnaam value for this City.
     * 
     * @return plaatsnaam
     */
    public java.lang.String getPlaatsnaam() {
        return plaatsnaam;
    }


    /**
     * Sets the plaatsnaam value for this City.
     * 
     * @param plaatsnaam
     */
    public void setPlaatsnaam(java.lang.String plaatsnaam) {
        this.plaatsnaam = plaatsnaam;
    }


    /**
     * Gets the plaatsnaam_ptt value for this City.
     * 
     * @return plaatsnaam_ptt
     */
    public java.lang.String getPlaatsnaam_ptt() {
        return plaatsnaam_ptt;
    }


    /**
     * Sets the plaatsnaam_ptt value for this City.
     * 
     * @param plaatsnaam_ptt
     */
    public void setPlaatsnaam_ptt(java.lang.String plaatsnaam_ptt) {
        this.plaatsnaam_ptt = plaatsnaam_ptt;
    }


    /**
     * Gets the plaatsnaam_extract value for this City.
     * 
     * @return plaatsnaam_extract
     */
    public java.lang.String getPlaatsnaam_extract() {
        return plaatsnaam_extract;
    }


    /**
     * Sets the plaatsnaam_extract value for this City.
     * 
     * @param plaatsnaam_extract
     */
    public void setPlaatsnaam_extract(java.lang.String plaatsnaam_extract) {
        this.plaatsnaam_extract = plaatsnaam_extract;
    }


    /**
     * Gets the gemeenteid value for this City.
     * 
     * @return gemeenteid
     */
    public int getGemeenteid() {
        return gemeenteid;
    }


    /**
     * Sets the gemeenteid value for this City.
     * 
     * @param gemeenteid
     */
    public void setGemeenteid(int gemeenteid) {
        this.gemeenteid = gemeenteid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
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
            this.gemeenteid == other.getGemeenteid();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(City.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "City"));
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
