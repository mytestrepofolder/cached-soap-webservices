/**
 * BusinessDossierExtended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessDossierExtended  implements java.io.Serializable {
    private nl.webservices.www.soap.BusinessDossierV3 basicDossierPart;

    private nl.webservices.www.soap.BusinessDossierExtendedPart extendedDossierPart;

    public BusinessDossierExtended() {
    }

    public BusinessDossierExtended(
           nl.webservices.www.soap.BusinessDossierV3 basicDossierPart,
           nl.webservices.www.soap.BusinessDossierExtendedPart extendedDossierPart) {
           this.basicDossierPart = basicDossierPart;
           this.extendedDossierPart = extendedDossierPart;
    }


    /**
     * Gets the basicDossierPart value for this BusinessDossierExtended.
     * 
     * @return basicDossierPart
     */
    public nl.webservices.www.soap.BusinessDossierV3 getBasicDossierPart() {
        return basicDossierPart;
    }


    /**
     * Sets the basicDossierPart value for this BusinessDossierExtended.
     * 
     * @param basicDossierPart
     */
    public void setBasicDossierPart(nl.webservices.www.soap.BusinessDossierV3 basicDossierPart) {
        this.basicDossierPart = basicDossierPart;
    }


    /**
     * Gets the extendedDossierPart value for this BusinessDossierExtended.
     * 
     * @return extendedDossierPart
     */
    public nl.webservices.www.soap.BusinessDossierExtendedPart getExtendedDossierPart() {
        return extendedDossierPart;
    }


    /**
     * Sets the extendedDossierPart value for this BusinessDossierExtended.
     * 
     * @param extendedDossierPart
     */
    public void setExtendedDossierPart(nl.webservices.www.soap.BusinessDossierExtendedPart extendedDossierPart) {
        this.extendedDossierPart = extendedDossierPart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessDossierExtended)) return false;
        BusinessDossierExtended other = (BusinessDossierExtended) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basicDossierPart==null && other.getBasicDossierPart()==null) || 
             (this.basicDossierPart!=null &&
              this.basicDossierPart.equals(other.getBasicDossierPart()))) &&
            ((this.extendedDossierPart==null && other.getExtendedDossierPart()==null) || 
             (this.extendedDossierPart!=null &&
              this.extendedDossierPart.equals(other.getExtendedDossierPart())));
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
        if (getBasicDossierPart() != null) {
            _hashCode += getBasicDossierPart().hashCode();
        }
        if (getExtendedDossierPart() != null) {
            _hashCode += getExtendedDossierPart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessDossierExtended.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessDossierExtended"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicDossierPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BasicDossierPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessDossierV3"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedDossierPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ExtendedDossierPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessDossierExtendedPart"));
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
