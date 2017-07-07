/**
 * KadasterGerelateerdStukdeel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterGerelateerdStukdeel  implements java.io.Serializable {
    private java.lang.String aard_stukdeel_omschrijving;

    private nl.webservices.www.soap.Stuk stuk;

    private java.lang.Boolean gefiatteerd;

    public KadasterGerelateerdStukdeel() {
    }

    public KadasterGerelateerdStukdeel(
           java.lang.String aard_stukdeel_omschrijving,
           nl.webservices.www.soap.Stuk stuk,
           java.lang.Boolean gefiatteerd) {
           this.aard_stukdeel_omschrijving = aard_stukdeel_omschrijving;
           this.stuk = stuk;
           this.gefiatteerd = gefiatteerd;
    }


    /**
     * Gets the aard_stukdeel_omschrijving value for this KadasterGerelateerdStukdeel.
     * 
     * @return aard_stukdeel_omschrijving
     */
    public java.lang.String getAard_stukdeel_omschrijving() {
        return aard_stukdeel_omschrijving;
    }


    /**
     * Sets the aard_stukdeel_omschrijving value for this KadasterGerelateerdStukdeel.
     * 
     * @param aard_stukdeel_omschrijving
     */
    public void setAard_stukdeel_omschrijving(java.lang.String aard_stukdeel_omschrijving) {
        this.aard_stukdeel_omschrijving = aard_stukdeel_omschrijving;
    }


    /**
     * Gets the stuk value for this KadasterGerelateerdStukdeel.
     * 
     * @return stuk
     */
    public nl.webservices.www.soap.Stuk getStuk() {
        return stuk;
    }


    /**
     * Sets the stuk value for this KadasterGerelateerdStukdeel.
     * 
     * @param stuk
     */
    public void setStuk(nl.webservices.www.soap.Stuk stuk) {
        this.stuk = stuk;
    }


    /**
     * Gets the gefiatteerd value for this KadasterGerelateerdStukdeel.
     * 
     * @return gefiatteerd
     */
    public java.lang.Boolean getGefiatteerd() {
        return gefiatteerd;
    }


    /**
     * Sets the gefiatteerd value for this KadasterGerelateerdStukdeel.
     * 
     * @param gefiatteerd
     */
    public void setGefiatteerd(java.lang.Boolean gefiatteerd) {
        this.gefiatteerd = gefiatteerd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterGerelateerdStukdeel)) return false;
        KadasterGerelateerdStukdeel other = (KadasterGerelateerdStukdeel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aard_stukdeel_omschrijving==null && other.getAard_stukdeel_omschrijving()==null) || 
             (this.aard_stukdeel_omschrijving!=null &&
              this.aard_stukdeel_omschrijving.equals(other.getAard_stukdeel_omschrijving()))) &&
            ((this.stuk==null && other.getStuk()==null) || 
             (this.stuk!=null &&
              this.stuk.equals(other.getStuk()))) &&
            ((this.gefiatteerd==null && other.getGefiatteerd()==null) || 
             (this.gefiatteerd!=null &&
              this.gefiatteerd.equals(other.getGefiatteerd())));
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
        if (getAard_stukdeel_omschrijving() != null) {
            _hashCode += getAard_stukdeel_omschrijving().hashCode();
        }
        if (getStuk() != null) {
            _hashCode += getStuk().hashCode();
        }
        if (getGefiatteerd() != null) {
            _hashCode += getGefiatteerd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterGerelateerdStukdeel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterGerelateerdStukdeel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aard_stukdeel_omschrijving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aard_stukdeel_omschrijving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stuk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stuk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Stuk"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gefiatteerd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gefiatteerd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
