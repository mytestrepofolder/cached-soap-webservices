/**
 * BusinessBIKCodeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessBIKCodeInfo  implements java.io.Serializable {
    private nl.webservices.www.soap.BusinessBIKSection[] sections;

    private nl.webservices.www.soap.BusinessBIKCode[] bikcodes;

    public BusinessBIKCodeInfo() {
    }

    public BusinessBIKCodeInfo(
           nl.webservices.www.soap.BusinessBIKSection[] sections,
           nl.webservices.www.soap.BusinessBIKCode[] bikcodes) {
           this.sections = sections;
           this.bikcodes = bikcodes;
    }


    /**
     * Gets the sections value for this BusinessBIKCodeInfo.
     * 
     * @return sections
     */
    public nl.webservices.www.soap.BusinessBIKSection[] getSections() {
        return sections;
    }


    /**
     * Sets the sections value for this BusinessBIKCodeInfo.
     * 
     * @param sections
     */
    public void setSections(nl.webservices.www.soap.BusinessBIKSection[] sections) {
        this.sections = sections;
    }


    /**
     * Gets the bikcodes value for this BusinessBIKCodeInfo.
     * 
     * @return bikcodes
     */
    public nl.webservices.www.soap.BusinessBIKCode[] getBikcodes() {
        return bikcodes;
    }


    /**
     * Sets the bikcodes value for this BusinessBIKCodeInfo.
     * 
     * @param bikcodes
     */
    public void setBikcodes(nl.webservices.www.soap.BusinessBIKCode[] bikcodes) {
        this.bikcodes = bikcodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessBIKCodeInfo)) return false;
        BusinessBIKCodeInfo other = (BusinessBIKCodeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sections==null && other.getSections()==null) || 
             (this.sections!=null &&
              java.util.Arrays.equals(this.sections, other.getSections()))) &&
            ((this.bikcodes==null && other.getBikcodes()==null) || 
             (this.bikcodes!=null &&
              java.util.Arrays.equals(this.bikcodes, other.getBikcodes())));
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
        if (getSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBikcodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBikcodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBikcodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessBIKCodeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessBIKCodeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessBIKSection"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bikcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bikcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessBIKCode"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
