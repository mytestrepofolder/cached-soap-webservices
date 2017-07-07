/**
 * DocumentOverzicht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DocumentOverzicht  implements java.io.Serializable {
    private nl.webservices.www.soap.OverzichtOnroerendeZaak[] onroerende_zaken;

    public DocumentOverzicht() {
    }

    public DocumentOverzicht(
           nl.webservices.www.soap.OverzichtOnroerendeZaak[] onroerende_zaken) {
           this.onroerende_zaken = onroerende_zaken;
    }


    /**
     * Gets the onroerende_zaken value for this DocumentOverzicht.
     * 
     * @return onroerende_zaken
     */
    public nl.webservices.www.soap.OverzichtOnroerendeZaak[] getOnroerende_zaken() {
        return onroerende_zaken;
    }


    /**
     * Sets the onroerende_zaken value for this DocumentOverzicht.
     * 
     * @param onroerende_zaken
     */
    public void setOnroerende_zaken(nl.webservices.www.soap.OverzichtOnroerendeZaak[] onroerende_zaken) {
        this.onroerende_zaken = onroerende_zaken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentOverzicht)) return false;
        DocumentOverzicht other = (DocumentOverzicht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onroerende_zaken==null && other.getOnroerende_zaken()==null) || 
             (this.onroerende_zaken!=null &&
              java.util.Arrays.equals(this.onroerende_zaken, other.getOnroerende_zaken())));
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
        if (getOnroerende_zaken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnroerende_zaken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnroerende_zaken(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentOverzicht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DocumentOverzicht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onroerende_zaken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "onroerende_zaken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtOnroerendeZaak"));
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
