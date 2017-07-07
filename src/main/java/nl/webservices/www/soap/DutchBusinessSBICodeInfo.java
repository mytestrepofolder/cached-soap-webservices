/**
 * DutchBusinessSBICodeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessSBICodeInfo  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchBusinessSBISection section;

    private nl.webservices.www.soap.DutchBusinessSBICode[] sbi_codes;

    public DutchBusinessSBICodeInfo() {
    }

    public DutchBusinessSBICodeInfo(
           nl.webservices.www.soap.DutchBusinessSBISection section,
           nl.webservices.www.soap.DutchBusinessSBICode[] sbi_codes) {
           this.section = section;
           this.sbi_codes = sbi_codes;
    }


    /**
     * Gets the section value for this DutchBusinessSBICodeInfo.
     * 
     * @return section
     */
    public nl.webservices.www.soap.DutchBusinessSBISection getSection() {
        return section;
    }


    /**
     * Sets the section value for this DutchBusinessSBICodeInfo.
     * 
     * @param section
     */
    public void setSection(nl.webservices.www.soap.DutchBusinessSBISection section) {
        this.section = section;
    }


    /**
     * Gets the sbi_codes value for this DutchBusinessSBICodeInfo.
     * 
     * @return sbi_codes
     */
    public nl.webservices.www.soap.DutchBusinessSBICode[] getSbi_codes() {
        return sbi_codes;
    }


    /**
     * Sets the sbi_codes value for this DutchBusinessSBICodeInfo.
     * 
     * @param sbi_codes
     */
    public void setSbi_codes(nl.webservices.www.soap.DutchBusinessSBICode[] sbi_codes) {
        this.sbi_codes = sbi_codes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessSBICodeInfo)) return false;
        DutchBusinessSBICodeInfo other = (DutchBusinessSBICodeInfo) obj;
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
            ((this.sbi_codes==null && other.getSbi_codes()==null) || 
             (this.sbi_codes!=null &&
              java.util.Arrays.equals(this.sbi_codes, other.getSbi_codes())));
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
        if (getSbi_codes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSbi_codes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSbi_codes(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessSBICodeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSBICodeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSBISection"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSBICode"));
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
