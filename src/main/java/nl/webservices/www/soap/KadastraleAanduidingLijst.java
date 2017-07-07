/**
 * KadastraleAanduidingLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadastraleAanduidingLijst  implements java.io.Serializable {
    private nl.webservices.www.soap.KadastraleAanduiding[] kadastrale_aanduidingen;

    private boolean indicatie_compleet;

    public KadastraleAanduidingLijst() {
    }

    public KadastraleAanduidingLijst(
           nl.webservices.www.soap.KadastraleAanduiding[] kadastrale_aanduidingen,
           boolean indicatie_compleet) {
           this.kadastrale_aanduidingen = kadastrale_aanduidingen;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the kadastrale_aanduidingen value for this KadastraleAanduidingLijst.
     * 
     * @return kadastrale_aanduidingen
     */
    public nl.webservices.www.soap.KadastraleAanduiding[] getKadastrale_aanduidingen() {
        return kadastrale_aanduidingen;
    }


    /**
     * Sets the kadastrale_aanduidingen value for this KadastraleAanduidingLijst.
     * 
     * @param kadastrale_aanduidingen
     */
    public void setKadastrale_aanduidingen(nl.webservices.www.soap.KadastraleAanduiding[] kadastrale_aanduidingen) {
        this.kadastrale_aanduidingen = kadastrale_aanduidingen;
    }


    /**
     * Gets the indicatie_compleet value for this KadastraleAanduidingLijst.
     * 
     * @return indicatie_compleet
     */
    public boolean isIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this KadastraleAanduidingLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadastraleAanduidingLijst)) return false;
        KadastraleAanduidingLijst other = (KadastraleAanduidingLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kadastrale_aanduidingen==null && other.getKadastrale_aanduidingen()==null) || 
             (this.kadastrale_aanduidingen!=null &&
              java.util.Arrays.equals(this.kadastrale_aanduidingen, other.getKadastrale_aanduidingen()))) &&
            this.indicatie_compleet == other.isIndicatie_compleet();
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
        if (getKadastrale_aanduidingen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKadastrale_aanduidingen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKadastrale_aanduidingen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIndicatie_compleet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadastraleAanduidingLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduidingLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_aanduidingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_aanduidingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduiding"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_compleet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_compleet"));
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
