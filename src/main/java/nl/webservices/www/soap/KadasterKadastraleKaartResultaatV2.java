/**
 * KadasterKadastraleKaartResultaatV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterKadastraleKaartResultaatV2  implements java.io.Serializable {
    private nl.webservices.www.soap.DocumentOverzicht overzicht;

    private nl.webservices.www.soap.KadasterKadastraleKaart kadastrale_kaart;

    public KadasterKadastraleKaartResultaatV2() {
    }

    public KadasterKadastraleKaartResultaatV2(
           nl.webservices.www.soap.DocumentOverzicht overzicht,
           nl.webservices.www.soap.KadasterKadastraleKaart kadastrale_kaart) {
           this.overzicht = overzicht;
           this.kadastrale_kaart = kadastrale_kaart;
    }


    /**
     * Gets the overzicht value for this KadasterKadastraleKaartResultaatV2.
     * 
     * @return overzicht
     */
    public nl.webservices.www.soap.DocumentOverzicht getOverzicht() {
        return overzicht;
    }


    /**
     * Sets the overzicht value for this KadasterKadastraleKaartResultaatV2.
     * 
     * @param overzicht
     */
    public void setOverzicht(nl.webservices.www.soap.DocumentOverzicht overzicht) {
        this.overzicht = overzicht;
    }


    /**
     * Gets the kadastrale_kaart value for this KadasterKadastraleKaartResultaatV2.
     * 
     * @return kadastrale_kaart
     */
    public nl.webservices.www.soap.KadasterKadastraleKaart getKadastrale_kaart() {
        return kadastrale_kaart;
    }


    /**
     * Sets the kadastrale_kaart value for this KadasterKadastraleKaartResultaatV2.
     * 
     * @param kadastrale_kaart
     */
    public void setKadastrale_kaart(nl.webservices.www.soap.KadasterKadastraleKaart kadastrale_kaart) {
        this.kadastrale_kaart = kadastrale_kaart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterKadastraleKaartResultaatV2)) return false;
        KadasterKadastraleKaartResultaatV2 other = (KadasterKadastraleKaartResultaatV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overzicht==null && other.getOverzicht()==null) || 
             (this.overzicht!=null &&
              this.overzicht.equals(other.getOverzicht()))) &&
            ((this.kadastrale_kaart==null && other.getKadastrale_kaart()==null) || 
             (this.kadastrale_kaart!=null &&
              this.kadastrale_kaart.equals(other.getKadastrale_kaart())));
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
        if (getOverzicht() != null) {
            _hashCode += getOverzicht().hashCode();
        }
        if (getKadastrale_kaart() != null) {
            _hashCode += getKadastrale_kaart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterKadastraleKaartResultaatV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadasterKadastraleKaartResultaatV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overzicht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "overzicht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DocumentOverzicht"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_kaart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_kaart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadasterKadastraleKaart"));
        elemField.setMinOccurs(0);
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
