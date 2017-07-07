/**
 * KadasterHypothecairBerichtObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterHypothecairBerichtObject  implements java.io.Serializable {
    private java.lang.String datum_bijgewerkt;

    private nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak onroerende_zaak;

    private nl.webservices.www.soap.KadasterHypotheekStukLijst hypotheek_stuk_lijst;

    private nl.webservices.www.soap.KadasterBerichtObjectDocument hypothecair_document;

    public KadasterHypothecairBerichtObject() {
    }

    public KadasterHypothecairBerichtObject(
           java.lang.String datum_bijgewerkt,
           nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak onroerende_zaak,
           nl.webservices.www.soap.KadasterHypotheekStukLijst hypotheek_stuk_lijst,
           nl.webservices.www.soap.KadasterBerichtObjectDocument hypothecair_document) {
           this.datum_bijgewerkt = datum_bijgewerkt;
           this.onroerende_zaak = onroerende_zaak;
           this.hypotheek_stuk_lijst = hypotheek_stuk_lijst;
           this.hypothecair_document = hypothecair_document;
    }


    /**
     * Gets the datum_bijgewerkt value for this KadasterHypothecairBerichtObject.
     * 
     * @return datum_bijgewerkt
     */
    public java.lang.String getDatum_bijgewerkt() {
        return datum_bijgewerkt;
    }


    /**
     * Sets the datum_bijgewerkt value for this KadasterHypothecairBerichtObject.
     * 
     * @param datum_bijgewerkt
     */
    public void setDatum_bijgewerkt(java.lang.String datum_bijgewerkt) {
        this.datum_bijgewerkt = datum_bijgewerkt;
    }


    /**
     * Gets the onroerende_zaak value for this KadasterHypothecairBerichtObject.
     * 
     * @return onroerende_zaak
     */
    public nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak getOnroerende_zaak() {
        return onroerende_zaak;
    }


    /**
     * Sets the onroerende_zaak value for this KadasterHypothecairBerichtObject.
     * 
     * @param onroerende_zaak
     */
    public void setOnroerende_zaak(nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak onroerende_zaak) {
        this.onroerende_zaak = onroerende_zaak;
    }


    /**
     * Gets the hypotheek_stuk_lijst value for this KadasterHypothecairBerichtObject.
     * 
     * @return hypotheek_stuk_lijst
     */
    public nl.webservices.www.soap.KadasterHypotheekStukLijst getHypotheek_stuk_lijst() {
        return hypotheek_stuk_lijst;
    }


    /**
     * Sets the hypotheek_stuk_lijst value for this KadasterHypothecairBerichtObject.
     * 
     * @param hypotheek_stuk_lijst
     */
    public void setHypotheek_stuk_lijst(nl.webservices.www.soap.KadasterHypotheekStukLijst hypotheek_stuk_lijst) {
        this.hypotheek_stuk_lijst = hypotheek_stuk_lijst;
    }


    /**
     * Gets the hypothecair_document value for this KadasterHypothecairBerichtObject.
     * 
     * @return hypothecair_document
     */
    public nl.webservices.www.soap.KadasterBerichtObjectDocument getHypothecair_document() {
        return hypothecair_document;
    }


    /**
     * Sets the hypothecair_document value for this KadasterHypothecairBerichtObject.
     * 
     * @param hypothecair_document
     */
    public void setHypothecair_document(nl.webservices.www.soap.KadasterBerichtObjectDocument hypothecair_document) {
        this.hypothecair_document = hypothecair_document;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterHypothecairBerichtObject)) return false;
        KadasterHypothecairBerichtObject other = (KadasterHypothecairBerichtObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datum_bijgewerkt==null && other.getDatum_bijgewerkt()==null) || 
             (this.datum_bijgewerkt!=null &&
              this.datum_bijgewerkt.equals(other.getDatum_bijgewerkt()))) &&
            ((this.onroerende_zaak==null && other.getOnroerende_zaak()==null) || 
             (this.onroerende_zaak!=null &&
              this.onroerende_zaak.equals(other.getOnroerende_zaak()))) &&
            ((this.hypotheek_stuk_lijst==null && other.getHypotheek_stuk_lijst()==null) || 
             (this.hypotheek_stuk_lijst!=null &&
              this.hypotheek_stuk_lijst.equals(other.getHypotheek_stuk_lijst()))) &&
            ((this.hypothecair_document==null && other.getHypothecair_document()==null) || 
             (this.hypothecair_document!=null &&
              this.hypothecair_document.equals(other.getHypothecair_document())));
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
        if (getDatum_bijgewerkt() != null) {
            _hashCode += getDatum_bijgewerkt().hashCode();
        }
        if (getOnroerende_zaak() != null) {
            _hashCode += getOnroerende_zaak().hashCode();
        }
        if (getHypotheek_stuk_lijst() != null) {
            _hashCode += getHypotheek_stuk_lijst().hashCode();
        }
        if (getHypothecair_document() != null) {
            _hashCode += getHypothecair_document().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterHypothecairBerichtObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypothecairBerichtObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_bijgewerkt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_bijgewerkt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onroerende_zaak");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "onroerende_zaak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBeknoptOnroerendeZaak"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hypotheek_stuk_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hypotheek_stuk_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypotheekStukLijst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hypothecair_document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hypothecair_document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBerichtObjectDocument"));
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
