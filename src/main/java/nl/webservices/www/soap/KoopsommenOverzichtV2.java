/**
 * KoopsommenOverzichtV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KoopsommenOverzichtV2  implements java.io.Serializable {
    private byte[] document;

    private nl.webservices.www.soap.KoopsommenOverzicht overzicht;

    public KoopsommenOverzichtV2() {
    }

    public KoopsommenOverzichtV2(
           byte[] document,
           nl.webservices.www.soap.KoopsommenOverzicht overzicht) {
           this.document = document;
           this.overzicht = overzicht;
    }


    /**
     * Gets the document value for this KoopsommenOverzichtV2.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this KoopsommenOverzichtV2.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }


    /**
     * Gets the overzicht value for this KoopsommenOverzichtV2.
     * 
     * @return overzicht
     */
    public nl.webservices.www.soap.KoopsommenOverzicht getOverzicht() {
        return overzicht;
    }


    /**
     * Sets the overzicht value for this KoopsommenOverzichtV2.
     * 
     * @param overzicht
     */
    public void setOverzicht(nl.webservices.www.soap.KoopsommenOverzicht overzicht) {
        this.overzicht = overzicht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KoopsommenOverzichtV2)) return false;
        KoopsommenOverzichtV2 other = (KoopsommenOverzichtV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.overzicht==null && other.getOverzicht()==null) || 
             (this.overzicht!=null &&
              this.overzicht.equals(other.getOverzicht())));
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
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverzicht() != null) {
            _hashCode += getOverzicht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KoopsommenOverzichtV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KoopsommenOverzichtV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overzicht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "overzicht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KoopsommenOverzicht"));
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
