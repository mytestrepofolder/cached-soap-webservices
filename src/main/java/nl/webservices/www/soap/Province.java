/**
 * Province.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Province  implements java.io.Serializable {
    private java.lang.String provinciecode;

    private java.lang.String provincienaam;

    public Province() {
    }

    public Province(
           java.lang.String provinciecode,
           java.lang.String provincienaam) {
           this.provinciecode = provinciecode;
           this.provincienaam = provincienaam;
    }


    /**
     * Gets the provinciecode value for this Province.
     * 
     * @return provinciecode
     */
    public java.lang.String getProvinciecode() {
        return provinciecode;
    }


    /**
     * Sets the provinciecode value for this Province.
     * 
     * @param provinciecode
     */
    public void setProvinciecode(java.lang.String provinciecode) {
        this.provinciecode = provinciecode;
    }


    /**
     * Gets the provincienaam value for this Province.
     * 
     * @return provincienaam
     */
    public java.lang.String getProvincienaam() {
        return provincienaam;
    }


    /**
     * Sets the provincienaam value for this Province.
     * 
     * @param provincienaam
     */
    public void setProvincienaam(java.lang.String provincienaam) {
        this.provincienaam = provincienaam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Province)) return false;
        Province other = (Province) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(Province.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Province"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
