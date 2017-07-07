/**
 * KadasterNietNatuurlijkPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterNietNatuurlijkPersoon  implements java.io.Serializable {
    private java.lang.String naam;

    private java.lang.String rechtsvorm;

    private java.lang.String statutaire_zetel;

    private java.lang.String bedrijven_nummer;

    public KadasterNietNatuurlijkPersoon() {
    }

    public KadasterNietNatuurlijkPersoon(
           java.lang.String naam,
           java.lang.String rechtsvorm,
           java.lang.String statutaire_zetel,
           java.lang.String bedrijven_nummer) {
           this.naam = naam;
           this.rechtsvorm = rechtsvorm;
           this.statutaire_zetel = statutaire_zetel;
           this.bedrijven_nummer = bedrijven_nummer;
    }


    /**
     * Gets the naam value for this KadasterNietNatuurlijkPersoon.
     * 
     * @return naam
     */
    public java.lang.String getNaam() {
        return naam;
    }


    /**
     * Sets the naam value for this KadasterNietNatuurlijkPersoon.
     * 
     * @param naam
     */
    public void setNaam(java.lang.String naam) {
        this.naam = naam;
    }


    /**
     * Gets the rechtsvorm value for this KadasterNietNatuurlijkPersoon.
     * 
     * @return rechtsvorm
     */
    public java.lang.String getRechtsvorm() {
        return rechtsvorm;
    }


    /**
     * Sets the rechtsvorm value for this KadasterNietNatuurlijkPersoon.
     * 
     * @param rechtsvorm
     */
    public void setRechtsvorm(java.lang.String rechtsvorm) {
        this.rechtsvorm = rechtsvorm;
    }


    /**
     * Gets the statutaire_zetel value for this KadasterNietNatuurlijkPersoon.
     * 
     * @return statutaire_zetel
     */
    public java.lang.String getStatutaire_zetel() {
        return statutaire_zetel;
    }


    /**
     * Sets the statutaire_zetel value for this KadasterNietNatuurlijkPersoon.
     * 
     * @param statutaire_zetel
     */
    public void setStatutaire_zetel(java.lang.String statutaire_zetel) {
        this.statutaire_zetel = statutaire_zetel;
    }


    /**
     * Gets the bedrijven_nummer value for this KadasterNietNatuurlijkPersoon.
     * 
     * @return bedrijven_nummer
     */
    public java.lang.String getBedrijven_nummer() {
        return bedrijven_nummer;
    }


    /**
     * Sets the bedrijven_nummer value for this KadasterNietNatuurlijkPersoon.
     * 
     * @param bedrijven_nummer
     */
    public void setBedrijven_nummer(java.lang.String bedrijven_nummer) {
        this.bedrijven_nummer = bedrijven_nummer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterNietNatuurlijkPersoon)) return false;
        KadasterNietNatuurlijkPersoon other = (KadasterNietNatuurlijkPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.naam==null && other.getNaam()==null) || 
             (this.naam!=null &&
              this.naam.equals(other.getNaam()))) &&
            ((this.rechtsvorm==null && other.getRechtsvorm()==null) || 
             (this.rechtsvorm!=null &&
              this.rechtsvorm.equals(other.getRechtsvorm()))) &&
            ((this.statutaire_zetel==null && other.getStatutaire_zetel()==null) || 
             (this.statutaire_zetel!=null &&
              this.statutaire_zetel.equals(other.getStatutaire_zetel()))) &&
            ((this.bedrijven_nummer==null && other.getBedrijven_nummer()==null) || 
             (this.bedrijven_nummer!=null &&
              this.bedrijven_nummer.equals(other.getBedrijven_nummer())));
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
        if (getNaam() != null) {
            _hashCode += getNaam().hashCode();
        }
        if (getRechtsvorm() != null) {
            _hashCode += getRechtsvorm().hashCode();
        }
        if (getStatutaire_zetel() != null) {
            _hashCode += getStatutaire_zetel().hashCode();
        }
        if (getBedrijven_nummer() != null) {
            _hashCode += getBedrijven_nummer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterNietNatuurlijkPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterNietNatuurlijkPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "naam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechtsvorm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rechtsvorm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statutaire_zetel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "statutaire_zetel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bedrijven_nummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bedrijven_nummer"));
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
