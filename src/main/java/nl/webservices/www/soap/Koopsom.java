/**
 * Koopsom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Koopsom  implements java.io.Serializable {
    private java.util.Date koopdatum;

    private int huisnummer;

    private java.lang.String huisnummer_toevoeging;

    private int bedrag;

    private int oppervlakte;

    private java.lang.String omschrijving;

    private boolean meer_onroerende_goederen;

    public Koopsom() {
    }

    public Koopsom(
           java.util.Date koopdatum,
           int huisnummer,
           java.lang.String huisnummer_toevoeging,
           int bedrag,
           int oppervlakte,
           java.lang.String omschrijving,
           boolean meer_onroerende_goederen) {
           this.koopdatum = koopdatum;
           this.huisnummer = huisnummer;
           this.huisnummer_toevoeging = huisnummer_toevoeging;
           this.bedrag = bedrag;
           this.oppervlakte = oppervlakte;
           this.omschrijving = omschrijving;
           this.meer_onroerende_goederen = meer_onroerende_goederen;
    }


    /**
     * Gets the koopdatum value for this Koopsom.
     * 
     * @return koopdatum
     */
    public java.util.Date getKoopdatum() {
        return koopdatum;
    }


    /**
     * Sets the koopdatum value for this Koopsom.
     * 
     * @param koopdatum
     */
    public void setKoopdatum(java.util.Date koopdatum) {
        this.koopdatum = koopdatum;
    }


    /**
     * Gets the huisnummer value for this Koopsom.
     * 
     * @return huisnummer
     */
    public int getHuisnummer() {
        return huisnummer;
    }


    /**
     * Sets the huisnummer value for this Koopsom.
     * 
     * @param huisnummer
     */
    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }


    /**
     * Gets the huisnummer_toevoeging value for this Koopsom.
     * 
     * @return huisnummer_toevoeging
     */
    public java.lang.String getHuisnummer_toevoeging() {
        return huisnummer_toevoeging;
    }


    /**
     * Sets the huisnummer_toevoeging value for this Koopsom.
     * 
     * @param huisnummer_toevoeging
     */
    public void setHuisnummer_toevoeging(java.lang.String huisnummer_toevoeging) {
        this.huisnummer_toevoeging = huisnummer_toevoeging;
    }


    /**
     * Gets the bedrag value for this Koopsom.
     * 
     * @return bedrag
     */
    public int getBedrag() {
        return bedrag;
    }


    /**
     * Sets the bedrag value for this Koopsom.
     * 
     * @param bedrag
     */
    public void setBedrag(int bedrag) {
        this.bedrag = bedrag;
    }


    /**
     * Gets the oppervlakte value for this Koopsom.
     * 
     * @return oppervlakte
     */
    public int getOppervlakte() {
        return oppervlakte;
    }


    /**
     * Sets the oppervlakte value for this Koopsom.
     * 
     * @param oppervlakte
     */
    public void setOppervlakte(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }


    /**
     * Gets the omschrijving value for this Koopsom.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this Koopsom.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the meer_onroerende_goederen value for this Koopsom.
     * 
     * @return meer_onroerende_goederen
     */
    public boolean isMeer_onroerende_goederen() {
        return meer_onroerende_goederen;
    }


    /**
     * Sets the meer_onroerende_goederen value for this Koopsom.
     * 
     * @param meer_onroerende_goederen
     */
    public void setMeer_onroerende_goederen(boolean meer_onroerende_goederen) {
        this.meer_onroerende_goederen = meer_onroerende_goederen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Koopsom)) return false;
        Koopsom other = (Koopsom) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.koopdatum==null && other.getKoopdatum()==null) || 
             (this.koopdatum!=null &&
              this.koopdatum.equals(other.getKoopdatum()))) &&
            this.huisnummer == other.getHuisnummer() &&
            ((this.huisnummer_toevoeging==null && other.getHuisnummer_toevoeging()==null) || 
             (this.huisnummer_toevoeging!=null &&
              this.huisnummer_toevoeging.equals(other.getHuisnummer_toevoeging()))) &&
            this.bedrag == other.getBedrag() &&
            this.oppervlakte == other.getOppervlakte() &&
            ((this.omschrijving==null && other.getOmschrijving()==null) || 
             (this.omschrijving!=null &&
              this.omschrijving.equals(other.getOmschrijving()))) &&
            this.meer_onroerende_goederen == other.isMeer_onroerende_goederen();
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
        if (getKoopdatum() != null) {
            _hashCode += getKoopdatum().hashCode();
        }
        _hashCode += getHuisnummer();
        if (getHuisnummer_toevoeging() != null) {
            _hashCode += getHuisnummer_toevoeging().hashCode();
        }
        _hashCode += getBedrag();
        _hashCode += getOppervlakte();
        if (getOmschrijving() != null) {
            _hashCode += getOmschrijving().hashCode();
        }
        _hashCode += (isMeer_onroerende_goederen() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Koopsom.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Koopsom"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("bedrag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bedrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oppervlakte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "oppervlakte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meer_onroerende_goederen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "meer_onroerende_goederen"));
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
