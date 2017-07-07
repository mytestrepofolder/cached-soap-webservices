/**
 * InsolvencySearchPublicationsByCoCNumberRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencySearchPublicationsByCoCNumberRequestType  implements java.io.Serializable {
    private java.lang.String coc_number;

    public InsolvencySearchPublicationsByCoCNumberRequestType() {
    }

    public InsolvencySearchPublicationsByCoCNumberRequestType(
           java.lang.String coc_number) {
           this.coc_number = coc_number;
    }


    /**
     * Gets the coc_number value for this InsolvencySearchPublicationsByCoCNumberRequestType.
     * 
     * @return coc_number
     */
    public java.lang.String getCoc_number() {
        return coc_number;
    }


    /**
     * Sets the coc_number value for this InsolvencySearchPublicationsByCoCNumberRequestType.
     * 
     * @param coc_number
     */
    public void setCoc_number(java.lang.String coc_number) {
        this.coc_number = coc_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencySearchPublicationsByCoCNumberRequestType)) return false;
        InsolvencySearchPublicationsByCoCNumberRequestType other = (InsolvencySearchPublicationsByCoCNumberRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coc_number==null && other.getCoc_number()==null) || 
             (this.coc_number!=null &&
              this.coc_number.equals(other.getCoc_number())));
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
        if (getCoc_number() != null) {
            _hashCode += getCoc_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencySearchPublicationsByCoCNumberRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insolvencySearchPublicationsByCoCNumberRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coc_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coc_number"));
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
