/**
 * DutchBusinessGetExtractHistoryDocumentDataV3RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessGetExtractHistoryDocumentDataV3RequestType  implements java.io.Serializable {
    private java.lang.String extract_id;

    private boolean include_source;

    public DutchBusinessGetExtractHistoryDocumentDataV3RequestType() {
    }

    public DutchBusinessGetExtractHistoryDocumentDataV3RequestType(
           java.lang.String extract_id,
           boolean include_source) {
           this.extract_id = extract_id;
           this.include_source = include_source;
    }


    /**
     * Gets the extract_id value for this DutchBusinessGetExtractHistoryDocumentDataV3RequestType.
     * 
     * @return extract_id
     */
    public java.lang.String getExtract_id() {
        return extract_id;
    }


    /**
     * Sets the extract_id value for this DutchBusinessGetExtractHistoryDocumentDataV3RequestType.
     * 
     * @param extract_id
     */
    public void setExtract_id(java.lang.String extract_id) {
        this.extract_id = extract_id;
    }


    /**
     * Gets the include_source value for this DutchBusinessGetExtractHistoryDocumentDataV3RequestType.
     * 
     * @return include_source
     */
    public boolean isInclude_source() {
        return include_source;
    }


    /**
     * Sets the include_source value for this DutchBusinessGetExtractHistoryDocumentDataV3RequestType.
     * 
     * @param include_source
     */
    public void setInclude_source(boolean include_source) {
        this.include_source = include_source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessGetExtractHistoryDocumentDataV3RequestType)) return false;
        DutchBusinessGetExtractHistoryDocumentDataV3RequestType other = (DutchBusinessGetExtractHistoryDocumentDataV3RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extract_id==null && other.getExtract_id()==null) || 
             (this.extract_id!=null &&
              this.extract_id.equals(other.getExtract_id()))) &&
            this.include_source == other.isInclude_source();
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
        if (getExtract_id() != null) {
            _hashCode += getExtract_id().hashCode();
        }
        _hashCode += (isInclude_source() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessGetExtractHistoryDocumentDataV3RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dutchBusinessGetExtractHistoryDocumentDataV3RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extract_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extract_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "include_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
