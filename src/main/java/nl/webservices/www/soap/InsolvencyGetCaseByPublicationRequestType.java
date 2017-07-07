/**
 * InsolvencyGetCaseByPublicationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyGetCaseByPublicationRequestType  implements java.io.Serializable {
    private java.lang.String publication_id;

    public InsolvencyGetCaseByPublicationRequestType() {
    }

    public InsolvencyGetCaseByPublicationRequestType(
           java.lang.String publication_id) {
           this.publication_id = publication_id;
    }


    /**
     * Gets the publication_id value for this InsolvencyGetCaseByPublicationRequestType.
     * 
     * @return publication_id
     */
    public java.lang.String getPublication_id() {
        return publication_id;
    }


    /**
     * Sets the publication_id value for this InsolvencyGetCaseByPublicationRequestType.
     * 
     * @param publication_id
     */
    public void setPublication_id(java.lang.String publication_id) {
        this.publication_id = publication_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyGetCaseByPublicationRequestType)) return false;
        InsolvencyGetCaseByPublicationRequestType other = (InsolvencyGetCaseByPublicationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publication_id==null && other.getPublication_id()==null) || 
             (this.publication_id!=null &&
              this.publication_id.equals(other.getPublication_id())));
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
        if (getPublication_id() != null) {
            _hashCode += getPublication_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyGetCaseByPublicationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insolvencyGetCaseByPublicationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publication_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publication_id"));
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
