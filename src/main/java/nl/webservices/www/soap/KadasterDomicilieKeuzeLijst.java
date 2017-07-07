/**
 * KadasterDomicilieKeuzeLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterDomicilieKeuzeLijst  implements java.io.Serializable {
    private nl.webservices.www.soap.KadasterDomicilieKeuze[] domicilie_keuzes;

    private java.lang.Boolean indicatie_compleet;

    public KadasterDomicilieKeuzeLijst() {
    }

    public KadasterDomicilieKeuzeLijst(
           nl.webservices.www.soap.KadasterDomicilieKeuze[] domicilie_keuzes,
           java.lang.Boolean indicatie_compleet) {
           this.domicilie_keuzes = domicilie_keuzes;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the domicilie_keuzes value for this KadasterDomicilieKeuzeLijst.
     * 
     * @return domicilie_keuzes
     */
    public nl.webservices.www.soap.KadasterDomicilieKeuze[] getDomicilie_keuzes() {
        return domicilie_keuzes;
    }


    /**
     * Sets the domicilie_keuzes value for this KadasterDomicilieKeuzeLijst.
     * 
     * @param domicilie_keuzes
     */
    public void setDomicilie_keuzes(nl.webservices.www.soap.KadasterDomicilieKeuze[] domicilie_keuzes) {
        this.domicilie_keuzes = domicilie_keuzes;
    }


    /**
     * Gets the indicatie_compleet value for this KadasterDomicilieKeuzeLijst.
     * 
     * @return indicatie_compleet
     */
    public java.lang.Boolean getIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this KadasterDomicilieKeuzeLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(java.lang.Boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterDomicilieKeuzeLijst)) return false;
        KadasterDomicilieKeuzeLijst other = (KadasterDomicilieKeuzeLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domicilie_keuzes==null && other.getDomicilie_keuzes()==null) || 
             (this.domicilie_keuzes!=null &&
              java.util.Arrays.equals(this.domicilie_keuzes, other.getDomicilie_keuzes()))) &&
            ((this.indicatie_compleet==null && other.getIndicatie_compleet()==null) || 
             (this.indicatie_compleet!=null &&
              this.indicatie_compleet.equals(other.getIndicatie_compleet())));
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
        if (getDomicilie_keuzes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomicilie_keuzes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomicilie_keuzes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndicatie_compleet() != null) {
            _hashCode += getIndicatie_compleet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterDomicilieKeuzeLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterDomicilieKeuzeLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilie_keuzes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domicilie_keuzes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterDomicilieKeuze"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_compleet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_compleet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
