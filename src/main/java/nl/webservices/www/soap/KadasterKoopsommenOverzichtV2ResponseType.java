/**
 * KadasterKoopsommenOverzichtV2ResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterKoopsommenOverzichtV2ResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.KoopsommenOverzichtV2 koopsommenoverzicht;

    public KadasterKoopsommenOverzichtV2ResponseType() {
    }

    public KadasterKoopsommenOverzichtV2ResponseType(
           nl.webservices.www.soap.KoopsommenOverzichtV2 koopsommenoverzicht) {
           this.koopsommenoverzicht = koopsommenoverzicht;
    }


    /**
     * Gets the koopsommenoverzicht value for this KadasterKoopsommenOverzichtV2ResponseType.
     * 
     * @return koopsommenoverzicht
     */
    public nl.webservices.www.soap.KoopsommenOverzichtV2 getKoopsommenoverzicht() {
        return koopsommenoverzicht;
    }


    /**
     * Sets the koopsommenoverzicht value for this KadasterKoopsommenOverzichtV2ResponseType.
     * 
     * @param koopsommenoverzicht
     */
    public void setKoopsommenoverzicht(nl.webservices.www.soap.KoopsommenOverzichtV2 koopsommenoverzicht) {
        this.koopsommenoverzicht = koopsommenoverzicht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterKoopsommenOverzichtV2ResponseType)) return false;
        KadasterKoopsommenOverzichtV2ResponseType other = (KadasterKoopsommenOverzichtV2ResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.koopsommenoverzicht==null && other.getKoopsommenoverzicht()==null) || 
             (this.koopsommenoverzicht!=null &&
              this.koopsommenoverzicht.equals(other.getKoopsommenoverzicht())));
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
        if (getKoopsommenoverzicht() != null) {
            _hashCode += getKoopsommenoverzicht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterKoopsommenOverzichtV2ResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterKoopsommenOverzichtV2ResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopsommenoverzicht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopsommenoverzicht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KoopsommenOverzichtV2"));
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
