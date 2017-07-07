/**
 * KadasterDomicilieKeuze.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterDomicilieKeuze  implements java.io.Serializable {
    private java.lang.String voorletters;

    private java.lang.String voorvoegsels;

    private java.lang.String achternaam;

    private java.lang.String adres;

    public KadasterDomicilieKeuze() {
    }

    public KadasterDomicilieKeuze(
           java.lang.String voorletters,
           java.lang.String voorvoegsels,
           java.lang.String achternaam,
           java.lang.String adres) {
           this.voorletters = voorletters;
           this.voorvoegsels = voorvoegsels;
           this.achternaam = achternaam;
           this.adres = adres;
    }


    /**
     * Gets the voorletters value for this KadasterDomicilieKeuze.
     * 
     * @return voorletters
     */
    public java.lang.String getVoorletters() {
        return voorletters;
    }


    /**
     * Sets the voorletters value for this KadasterDomicilieKeuze.
     * 
     * @param voorletters
     */
    public void setVoorletters(java.lang.String voorletters) {
        this.voorletters = voorletters;
    }


    /**
     * Gets the voorvoegsels value for this KadasterDomicilieKeuze.
     * 
     * @return voorvoegsels
     */
    public java.lang.String getVoorvoegsels() {
        return voorvoegsels;
    }


    /**
     * Sets the voorvoegsels value for this KadasterDomicilieKeuze.
     * 
     * @param voorvoegsels
     */
    public void setVoorvoegsels(java.lang.String voorvoegsels) {
        this.voorvoegsels = voorvoegsels;
    }


    /**
     * Gets the achternaam value for this KadasterDomicilieKeuze.
     * 
     * @return achternaam
     */
    public java.lang.String getAchternaam() {
        return achternaam;
    }


    /**
     * Sets the achternaam value for this KadasterDomicilieKeuze.
     * 
     * @param achternaam
     */
    public void setAchternaam(java.lang.String achternaam) {
        this.achternaam = achternaam;
    }


    /**
     * Gets the adres value for this KadasterDomicilieKeuze.
     * 
     * @return adres
     */
    public java.lang.String getAdres() {
        return adres;
    }


    /**
     * Sets the adres value for this KadasterDomicilieKeuze.
     * 
     * @param adres
     */
    public void setAdres(java.lang.String adres) {
        this.adres = adres;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterDomicilieKeuze)) return false;
        KadasterDomicilieKeuze other = (KadasterDomicilieKeuze) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voorletters==null && other.getVoorletters()==null) || 
             (this.voorletters!=null &&
              this.voorletters.equals(other.getVoorletters()))) &&
            ((this.voorvoegsels==null && other.getVoorvoegsels()==null) || 
             (this.voorvoegsels!=null &&
              this.voorvoegsels.equals(other.getVoorvoegsels()))) &&
            ((this.achternaam==null && other.getAchternaam()==null) || 
             (this.achternaam!=null &&
              this.achternaam.equals(other.getAchternaam()))) &&
            ((this.adres==null && other.getAdres()==null) || 
             (this.adres!=null &&
              this.adres.equals(other.getAdres())));
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
        if (getVoorletters() != null) {
            _hashCode += getVoorletters().hashCode();
        }
        if (getVoorvoegsels() != null) {
            _hashCode += getVoorvoegsels().hashCode();
        }
        if (getAchternaam() != null) {
            _hashCode += getAchternaam().hashCode();
        }
        if (getAdres() != null) {
            _hashCode += getAdres().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterDomicilieKeuze.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterDomicilieKeuze"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voorletters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voorletters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voorvoegsels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voorvoegsels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("achternaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "achternaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
