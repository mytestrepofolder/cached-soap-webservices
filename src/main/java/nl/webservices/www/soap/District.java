/**
 * District.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class District  implements java.io.Serializable {
    private int gemeenteid;

    private java.lang.String gemeentenaam;

    private int gemeentecode;

    private java.lang.String provinciecode;

    public District() {
    }

    public District(
           int gemeenteid,
           java.lang.String gemeentenaam,
           int gemeentecode,
           java.lang.String provinciecode) {
           this.gemeenteid = gemeenteid;
           this.gemeentenaam = gemeentenaam;
           this.gemeentecode = gemeentecode;
           this.provinciecode = provinciecode;
    }


    /**
     * Gets the gemeenteid value for this District.
     * 
     * @return gemeenteid
     */
    public int getGemeenteid() {
        return gemeenteid;
    }


    /**
     * Sets the gemeenteid value for this District.
     * 
     * @param gemeenteid
     */
    public void setGemeenteid(int gemeenteid) {
        this.gemeenteid = gemeenteid;
    }


    /**
     * Gets the gemeentenaam value for this District.
     * 
     * @return gemeentenaam
     */
    public java.lang.String getGemeentenaam() {
        return gemeentenaam;
    }


    /**
     * Sets the gemeentenaam value for this District.
     * 
     * @param gemeentenaam
     */
    public void setGemeentenaam(java.lang.String gemeentenaam) {
        this.gemeentenaam = gemeentenaam;
    }


    /**
     * Gets the gemeentecode value for this District.
     * 
     * @return gemeentecode
     */
    public int getGemeentecode() {
        return gemeentecode;
    }


    /**
     * Sets the gemeentecode value for this District.
     * 
     * @param gemeentecode
     */
    public void setGemeentecode(int gemeentecode) {
        this.gemeentecode = gemeentecode;
    }


    /**
     * Gets the provinciecode value for this District.
     * 
     * @return provinciecode
     */
    public java.lang.String getProvinciecode() {
        return provinciecode;
    }


    /**
     * Sets the provinciecode value for this District.
     * 
     * @param provinciecode
     */
    public void setProvinciecode(java.lang.String provinciecode) {
        this.provinciecode = provinciecode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof District)) return false;
        District other = (District) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gemeenteid == other.getGemeenteid() &&
            ((this.gemeentenaam==null && other.getGemeentenaam()==null) || 
             (this.gemeentenaam!=null &&
              this.gemeentenaam.equals(other.getGemeentenaam()))) &&
            this.gemeentecode == other.getGemeentecode() &&
            ((this.provinciecode==null && other.getProvinciecode()==null) || 
             (this.provinciecode!=null &&
              this.provinciecode.equals(other.getProvinciecode())));
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
        _hashCode += getGemeenteid();
        if (getGemeentenaam() != null) {
            _hashCode += getGemeentenaam().hashCode();
        }
        _hashCode += getGemeentecode();
        if (getProvinciecode() != null) {
            _hashCode += getProvinciecode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(District.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "District"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("provinciecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provinciecode"));
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
