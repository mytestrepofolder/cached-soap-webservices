/**
 * DutchBusinessGetExtractHistoryDocumentDataRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessGetExtractHistoryDocumentDataRequestType  implements java.io.Serializable {
    private java.lang.String extract_id;

    public DutchBusinessGetExtractHistoryDocumentDataRequestType() {
    }

    public DutchBusinessGetExtractHistoryDocumentDataRequestType(
           java.lang.String extract_id) {
           this.extract_id = extract_id;
    }


    /**
     * Gets the extract_id value for this DutchBusinessGetExtractHistoryDocumentDataRequestType.
     * 
     * @return extract_id
     */
    public java.lang.String getExtract_id() {
        return extract_id;
    }


    /**
     * Sets the extract_id value for this DutchBusinessGetExtractHistoryDocumentDataRequestType.
     * 
     * @param extract_id
     */
    public void setExtract_id(java.lang.String extract_id) {
        this.extract_id = extract_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessGetExtractHistoryDocumentDataRequestType)) return false;
        DutchBusinessGetExtractHistoryDocumentDataRequestType other = (DutchBusinessGetExtractHistoryDocumentDataRequestType) obj;
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
              this.extract_id.equals(other.getExtract_id())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessGetExtractHistoryDocumentDataRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dutchBusinessGetExtractHistoryDocumentDataRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extract_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extract_id"));
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
