/**
 * BusinessUpdateAddDossierRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessUpdateAddDossierRequestType  implements java.io.Serializable {
    private java.lang.String dossierno;

    private java.lang.String subdossierno;

    public BusinessUpdateAddDossierRequestType() {
    }

    public BusinessUpdateAddDossierRequestType(
           java.lang.String dossierno,
           java.lang.String subdossierno) {
           this.dossierno = dossierno;
           this.subdossierno = subdossierno;
    }


    /**
     * Gets the dossierno value for this BusinessUpdateAddDossierRequestType.
     * 
     * @return dossierno
     */
    public java.lang.String getDossierno() {
        return dossierno;
    }


    /**
     * Sets the dossierno value for this BusinessUpdateAddDossierRequestType.
     * 
     * @param dossierno
     */
    public void setDossierno(java.lang.String dossierno) {
        this.dossierno = dossierno;
    }


    /**
     * Gets the subdossierno value for this BusinessUpdateAddDossierRequestType.
     * 
     * @return subdossierno
     */
    public java.lang.String getSubdossierno() {
        return subdossierno;
    }


    /**
     * Sets the subdossierno value for this BusinessUpdateAddDossierRequestType.
     * 
     * @param subdossierno
     */
    public void setSubdossierno(java.lang.String subdossierno) {
        this.subdossierno = subdossierno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessUpdateAddDossierRequestType)) return false;
        BusinessUpdateAddDossierRequestType other = (BusinessUpdateAddDossierRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossierno==null && other.getDossierno()==null) || 
             (this.dossierno!=null &&
              this.dossierno.equals(other.getDossierno()))) &&
            ((this.subdossierno==null && other.getSubdossierno()==null) || 
             (this.subdossierno!=null &&
              this.subdossierno.equals(other.getSubdossierno())));
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
        if (getDossierno() != null) {
            _hashCode += getDossierno().hashCode();
        }
        if (getSubdossierno() != null) {
            _hashCode += getSubdossierno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessUpdateAddDossierRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "businessUpdateAddDossierRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossierno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdossierno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subdossierno"));
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
