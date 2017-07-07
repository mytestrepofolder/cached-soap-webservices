/**
 * NietNatuurlijkPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NietNatuurlijkPersoon  implements java.io.Serializable {
    private java.lang.String naam;

    private java.lang.String code;

    private java.lang.String statutaire_zetel;

    private nl.webservices.www.soap.LidLijst leden_lijst;

    public NietNatuurlijkPersoon() {
    }

    public NietNatuurlijkPersoon(
           java.lang.String naam,
           java.lang.String code,
           java.lang.String statutaire_zetel,
           nl.webservices.www.soap.LidLijst leden_lijst) {
           this.naam = naam;
           this.code = code;
           this.statutaire_zetel = statutaire_zetel;
           this.leden_lijst = leden_lijst;
    }


    /**
     * Gets the naam value for this NietNatuurlijkPersoon.
     * 
     * @return naam
     */
    public java.lang.String getNaam() {
        return naam;
    }


    /**
     * Sets the naam value for this NietNatuurlijkPersoon.
     * 
     * @param naam
     */
    public void setNaam(java.lang.String naam) {
        this.naam = naam;
    }


    /**
     * Gets the code value for this NietNatuurlijkPersoon.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this NietNatuurlijkPersoon.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the statutaire_zetel value for this NietNatuurlijkPersoon.
     * 
     * @return statutaire_zetel
     */
    public java.lang.String getStatutaire_zetel() {
        return statutaire_zetel;
    }


    /**
     * Sets the statutaire_zetel value for this NietNatuurlijkPersoon.
     * 
     * @param statutaire_zetel
     */
    public void setStatutaire_zetel(java.lang.String statutaire_zetel) {
        this.statutaire_zetel = statutaire_zetel;
    }


    /**
     * Gets the leden_lijst value for this NietNatuurlijkPersoon.
     * 
     * @return leden_lijst
     */
    public nl.webservices.www.soap.LidLijst getLeden_lijst() {
        return leden_lijst;
    }


    /**
     * Sets the leden_lijst value for this NietNatuurlijkPersoon.
     * 
     * @param leden_lijst
     */
    public void setLeden_lijst(nl.webservices.www.soap.LidLijst leden_lijst) {
        this.leden_lijst = leden_lijst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NietNatuurlijkPersoon)) return false;
        NietNatuurlijkPersoon other = (NietNatuurlijkPersoon) obj;
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
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.statutaire_zetel==null && other.getStatutaire_zetel()==null) || 
             (this.statutaire_zetel!=null &&
              this.statutaire_zetel.equals(other.getStatutaire_zetel()))) &&
            ((this.leden_lijst==null && other.getLeden_lijst()==null) || 
             (this.leden_lijst!=null &&
              this.leden_lijst.equals(other.getLeden_lijst())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getStatutaire_zetel() != null) {
            _hashCode += getStatutaire_zetel().hashCode();
        }
        if (getLeden_lijst() != null) {
            _hashCode += getLeden_lijst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NietNatuurlijkPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NietNatuurlijkPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "naam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "code"));
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
        elemField.setFieldName("leden_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "leden_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LidLijst"));
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
