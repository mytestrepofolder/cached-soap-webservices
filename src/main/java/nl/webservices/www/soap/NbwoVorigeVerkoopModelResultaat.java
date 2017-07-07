/**
 * NbwoVorigeVerkoopModelResultaat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NbwoVorigeVerkoopModelResultaat  implements java.io.Serializable {
    private java.lang.String postcode;

    private int huisnummer;

    private java.lang.String huisnummer_toevoeging;

    private java.util.Date vorige_verkoop_datum;

    private int koopsom;

    private int vorige_verkoop_waarde;

    public NbwoVorigeVerkoopModelResultaat() {
    }

    public NbwoVorigeVerkoopModelResultaat(
           java.lang.String postcode,
           int huisnummer,
           java.lang.String huisnummer_toevoeging,
           java.util.Date vorige_verkoop_datum,
           int koopsom,
           int vorige_verkoop_waarde) {
           this.postcode = postcode;
           this.huisnummer = huisnummer;
           this.huisnummer_toevoeging = huisnummer_toevoeging;
           this.vorige_verkoop_datum = vorige_verkoop_datum;
           this.koopsom = koopsom;
           this.vorige_verkoop_waarde = vorige_verkoop_waarde;
    }


    /**
     * Gets the postcode value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the huisnummer value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @return huisnummer
     */
    public int getHuisnummer() {
        return huisnummer;
    }


    /**
     * Sets the huisnummer value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @param huisnummer
     */
    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }


    /**
     * Gets the huisnummer_toevoeging value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @return huisnummer_toevoeging
     */
    public java.lang.String getHuisnummer_toevoeging() {
        return huisnummer_toevoeging;
    }


    /**
     * Sets the huisnummer_toevoeging value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @param huisnummer_toevoeging
     */
    public void setHuisnummer_toevoeging(java.lang.String huisnummer_toevoeging) {
        this.huisnummer_toevoeging = huisnummer_toevoeging;
    }


    /**
     * Gets the vorige_verkoop_datum value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @return vorige_verkoop_datum
     */
    public java.util.Date getVorige_verkoop_datum() {
        return vorige_verkoop_datum;
    }


    /**
     * Sets the vorige_verkoop_datum value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @param vorige_verkoop_datum
     */
    public void setVorige_verkoop_datum(java.util.Date vorige_verkoop_datum) {
        this.vorige_verkoop_datum = vorige_verkoop_datum;
    }


    /**
     * Gets the koopsom value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @return koopsom
     */
    public int getKoopsom() {
        return koopsom;
    }


    /**
     * Sets the koopsom value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @param koopsom
     */
    public void setKoopsom(int koopsom) {
        this.koopsom = koopsom;
    }


    /**
     * Gets the vorige_verkoop_waarde value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @return vorige_verkoop_waarde
     */
    public int getVorige_verkoop_waarde() {
        return vorige_verkoop_waarde;
    }


    /**
     * Sets the vorige_verkoop_waarde value for this NbwoVorigeVerkoopModelResultaat.
     * 
     * @param vorige_verkoop_waarde
     */
    public void setVorige_verkoop_waarde(int vorige_verkoop_waarde) {
        this.vorige_verkoop_waarde = vorige_verkoop_waarde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbwoVorigeVerkoopModelResultaat)) return false;
        NbwoVorigeVerkoopModelResultaat other = (NbwoVorigeVerkoopModelResultaat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            this.huisnummer == other.getHuisnummer() &&
            ((this.huisnummer_toevoeging==null && other.getHuisnummer_toevoeging()==null) || 
             (this.huisnummer_toevoeging!=null &&
              this.huisnummer_toevoeging.equals(other.getHuisnummer_toevoeging()))) &&
            ((this.vorige_verkoop_datum==null && other.getVorige_verkoop_datum()==null) || 
             (this.vorige_verkoop_datum!=null &&
              this.vorige_verkoop_datum.equals(other.getVorige_verkoop_datum()))) &&
            this.koopsom == other.getKoopsom() &&
            this.vorige_verkoop_waarde == other.getVorige_verkoop_waarde();
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
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        _hashCode += getHuisnummer();
        if (getHuisnummer_toevoeging() != null) {
            _hashCode += getHuisnummer_toevoeging().hashCode();
        }
        if (getVorige_verkoop_datum() != null) {
            _hashCode += getVorige_verkoop_datum().hashCode();
        }
        _hashCode += getKoopsom();
        _hashCode += getVorige_verkoop_waarde();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NbwoVorigeVerkoopModelResultaat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoVorigeVerkoopModelResultaat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer_toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer_toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorige_verkoop_datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vorige_verkoop_datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopsom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopsom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorige_verkoop_waarde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vorige_verkoop_waarde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
