/**
 * OverzichtNietNatuurlijkPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class OverzichtNietNatuurlijkPersoon  implements java.io.Serializable {
    private java.lang.String naam;

    private java.lang.String code;

    public OverzichtNietNatuurlijkPersoon() {
    }

    public OverzichtNietNatuurlijkPersoon(
           java.lang.String naam,
           java.lang.String code) {
           this.naam = naam;
           this.code = code;
    }


    /**
     * Gets the naam value for this OverzichtNietNatuurlijkPersoon.
     * 
     * @return naam
     */
    public java.lang.String getNaam() {
        return naam;
    }


    /**
     * Sets the naam value for this OverzichtNietNatuurlijkPersoon.
     * 
     * @param naam
     */
    public void setNaam(java.lang.String naam) {
        this.naam = naam;
    }


    /**
     * Gets the code value for this OverzichtNietNatuurlijkPersoon.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this OverzichtNietNatuurlijkPersoon.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverzichtNietNatuurlijkPersoon)) return false;
        OverzichtNietNatuurlijkPersoon other = (OverzichtNietNatuurlijkPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.naam==null && other.getNaam()==null) || 
             (this.naam!=null &&
              this.naam.equals(other.getNaam()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode())));
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
        if (getNaam() != null) {
            _hashCode += getNaam().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverzichtNietNatuurlijkPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtNietNatuurlijkPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "naam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "code"));
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
