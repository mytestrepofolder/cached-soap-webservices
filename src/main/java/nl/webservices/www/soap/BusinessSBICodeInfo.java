/**
 * BusinessSBICodeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessSBICodeInfo  implements java.io.Serializable {
    private nl.webservices.www.soap.BusinessSBISection section;

    private nl.webservices.www.soap.BusinessSBICode[] sbicodes;

    public BusinessSBICodeInfo() {
    }

    public BusinessSBICodeInfo(
           nl.webservices.www.soap.BusinessSBISection section,
           nl.webservices.www.soap.BusinessSBICode[] sbicodes) {
           this.section = section;
           this.sbicodes = sbicodes;
    }


    /**
     * Gets the section value for this BusinessSBICodeInfo.
     * 
     * @return section
     */
    public nl.webservices.www.soap.BusinessSBISection getSection() {
        return section;
    }


    /**
     * Sets the section value for this BusinessSBICodeInfo.
     * 
     * @param section
     */
    public void setSection(nl.webservices.www.soap.BusinessSBISection section) {
        this.section = section;
    }


    /**
     * Gets the sbicodes value for this BusinessSBICodeInfo.
     * 
     * @return sbicodes
     */
    public nl.webservices.www.soap.BusinessSBICode[] getSbicodes() {
        return sbicodes;
    }


    /**
     * Sets the sbicodes value for this BusinessSBICodeInfo.
     * 
     * @param sbicodes
     */
    public void setSbicodes(nl.webservices.www.soap.BusinessSBICode[] sbicodes) {
        this.sbicodes = sbicodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessSBICodeInfo)) return false;
        BusinessSBICodeInfo other = (BusinessSBICodeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.sbicodes==null && other.getSbicodes()==null) || 
             (this.sbicodes!=null &&
              java.util.Arrays.equals(this.sbicodes, other.getSbicodes())));
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
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getSbicodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSbicodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSbicodes(), i);
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
        new org.apache.axis.description.TypeDesc(BusinessSBICodeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessSBICodeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessSBISection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbicodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbicodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessSBICode"));
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
