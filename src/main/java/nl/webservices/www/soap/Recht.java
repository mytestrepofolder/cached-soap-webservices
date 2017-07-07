/**
 * Recht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class Recht  implements java.io.Serializable {
    private java.lang.String object_id;

    private java.lang.String gerechtigde_id;

    private java.lang.String omschrijving_recht;

    private java.lang.String aandeel_in_recht;

    private java.lang.String totaal_aandeel_in_recht;

    private java.util.Date einddatum_recht;

    private boolean indicatie_recht_betrokken_in_splitsing;

    private nl.webservices.www.soap.StukMetKadastraleAanduidingLijst ontleend_aan_stukken_lijst;

    private nl.webservices.www.soap.StukReferentiesLijst mogelijk_van_belang_stukken_lijst;

    private nl.webservices.www.soap.AantekeningRechtLijst aantekeningen_recht_lijst;

    public Recht() {
    }

    public Recht(
           java.lang.String object_id,
           java.lang.String gerechtigde_id,
           java.lang.String omschrijving_recht,
           java.lang.String aandeel_in_recht,
           java.lang.String totaal_aandeel_in_recht,
           java.util.Date einddatum_recht,
           boolean indicatie_recht_betrokken_in_splitsing,
           nl.webservices.www.soap.StukMetKadastraleAanduidingLijst ontleend_aan_stukken_lijst,
           nl.webservices.www.soap.StukReferentiesLijst mogelijk_van_belang_stukken_lijst,
           nl.webservices.www.soap.AantekeningRechtLijst aantekeningen_recht_lijst) {
           this.object_id = object_id;
           this.gerechtigde_id = gerechtigde_id;
           this.omschrijving_recht = omschrijving_recht;
           this.aandeel_in_recht = aandeel_in_recht;
           this.totaal_aandeel_in_recht = totaal_aandeel_in_recht;
           this.einddatum_recht = einddatum_recht;
           this.indicatie_recht_betrokken_in_splitsing = indicatie_recht_betrokken_in_splitsing;
           this.ontleend_aan_stukken_lijst = ontleend_aan_stukken_lijst;
           this.mogelijk_van_belang_stukken_lijst = mogelijk_van_belang_stukken_lijst;
           this.aantekeningen_recht_lijst = aantekeningen_recht_lijst;
    }


    /**
     * Gets the object_id value for this Recht.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this Recht.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the gerechtigde_id value for this Recht.
     * 
     * @return gerechtigde_id
     */
    public java.lang.String getGerechtigde_id() {
        return gerechtigde_id;
    }


    /**
     * Sets the gerechtigde_id value for this Recht.
     * 
     * @param gerechtigde_id
     */
    public void setGerechtigde_id(java.lang.String gerechtigde_id) {
        this.gerechtigde_id = gerechtigde_id;
    }


    /**
     * Gets the omschrijving_recht value for this Recht.
     * 
     * @return omschrijving_recht
     */
    public java.lang.String getOmschrijving_recht() {
        return omschrijving_recht;
    }


    /**
     * Sets the omschrijving_recht value for this Recht.
     * 
     * @param omschrijving_recht
     */
    public void setOmschrijving_recht(java.lang.String omschrijving_recht) {
        this.omschrijving_recht = omschrijving_recht;
    }


    /**
     * Gets the aandeel_in_recht value for this Recht.
     * 
     * @return aandeel_in_recht
     */
    public java.lang.String getAandeel_in_recht() {
        return aandeel_in_recht;
    }


    /**
     * Sets the aandeel_in_recht value for this Recht.
     * 
     * @param aandeel_in_recht
     */
    public void setAandeel_in_recht(java.lang.String aandeel_in_recht) {
        this.aandeel_in_recht = aandeel_in_recht;
    }


    /**
     * Gets the totaal_aandeel_in_recht value for this Recht.
     * 
     * @return totaal_aandeel_in_recht
     */
    public java.lang.String getTotaal_aandeel_in_recht() {
        return totaal_aandeel_in_recht;
    }


    /**
     * Sets the totaal_aandeel_in_recht value for this Recht.
     * 
     * @param totaal_aandeel_in_recht
     */
    public void setTotaal_aandeel_in_recht(java.lang.String totaal_aandeel_in_recht) {
        this.totaal_aandeel_in_recht = totaal_aandeel_in_recht;
    }


    /**
     * Gets the einddatum_recht value for this Recht.
     * 
     * @return einddatum_recht
     */
    public java.util.Date getEinddatum_recht() {
        return einddatum_recht;
    }


    /**
     * Sets the einddatum_recht value for this Recht.
     * 
     * @param einddatum_recht
     */
    public void setEinddatum_recht(java.util.Date einddatum_recht) {
        this.einddatum_recht = einddatum_recht;
    }


    /**
     * Gets the indicatie_recht_betrokken_in_splitsing value for this Recht.
     * 
     * @return indicatie_recht_betrokken_in_splitsing
     */
    public boolean isIndicatie_recht_betrokken_in_splitsing() {
        return indicatie_recht_betrokken_in_splitsing;
    }


    /**
     * Sets the indicatie_recht_betrokken_in_splitsing value for this Recht.
     * 
     * @param indicatie_recht_betrokken_in_splitsing
     */
    public void setIndicatie_recht_betrokken_in_splitsing(boolean indicatie_recht_betrokken_in_splitsing) {
        this.indicatie_recht_betrokken_in_splitsing = indicatie_recht_betrokken_in_splitsing;
    }


    /**
     * Gets the ontleend_aan_stukken_lijst value for this Recht.
     * 
     * @return ontleend_aan_stukken_lijst
     */
    public nl.webservices.www.soap.StukMetKadastraleAanduidingLijst getOntleend_aan_stukken_lijst() {
        return ontleend_aan_stukken_lijst;
    }


    /**
     * Sets the ontleend_aan_stukken_lijst value for this Recht.
     * 
     * @param ontleend_aan_stukken_lijst
     */
    public void setOntleend_aan_stukken_lijst(nl.webservices.www.soap.StukMetKadastraleAanduidingLijst ontleend_aan_stukken_lijst) {
        this.ontleend_aan_stukken_lijst = ontleend_aan_stukken_lijst;
    }


    /**
     * Gets the mogelijk_van_belang_stukken_lijst value for this Recht.
     * 
     * @return mogelijk_van_belang_stukken_lijst
     */
    public nl.webservices.www.soap.StukReferentiesLijst getMogelijk_van_belang_stukken_lijst() {
        return mogelijk_van_belang_stukken_lijst;
    }


    /**
     * Sets the mogelijk_van_belang_stukken_lijst value for this Recht.
     * 
     * @param mogelijk_van_belang_stukken_lijst
     */
    public void setMogelijk_van_belang_stukken_lijst(nl.webservices.www.soap.StukReferentiesLijst mogelijk_van_belang_stukken_lijst) {
        this.mogelijk_van_belang_stukken_lijst = mogelijk_van_belang_stukken_lijst;
    }


    /**
     * Gets the aantekeningen_recht_lijst value for this Recht.
     * 
     * @return aantekeningen_recht_lijst
     */
    public nl.webservices.www.soap.AantekeningRechtLijst getAantekeningen_recht_lijst() {
        return aantekeningen_recht_lijst;
    }


    /**
     * Sets the aantekeningen_recht_lijst value for this Recht.
     * 
     * @param aantekeningen_recht_lijst
     */
    public void setAantekeningen_recht_lijst(nl.webservices.www.soap.AantekeningRechtLijst aantekeningen_recht_lijst) {
        this.aantekeningen_recht_lijst = aantekeningen_recht_lijst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recht)) return false;
        Recht other = (Recht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.object_id==null && other.getObject_id()==null) || 
             (this.object_id!=null &&
              this.object_id.equals(other.getObject_id()))) &&
            ((this.gerechtigde_id==null && other.getGerechtigde_id()==null) || 
             (this.gerechtigde_id!=null &&
              this.gerechtigde_id.equals(other.getGerechtigde_id()))) &&
            ((this.omschrijving_recht==null && other.getOmschrijving_recht()==null) || 
             (this.omschrijving_recht!=null &&
              this.omschrijving_recht.equals(other.getOmschrijving_recht()))) &&
            ((this.aandeel_in_recht==null && other.getAandeel_in_recht()==null) || 
             (this.aandeel_in_recht!=null &&
              this.aandeel_in_recht.equals(other.getAandeel_in_recht()))) &&
            ((this.totaal_aandeel_in_recht==null && other.getTotaal_aandeel_in_recht()==null) || 
             (this.totaal_aandeel_in_recht!=null &&
              this.totaal_aandeel_in_recht.equals(other.getTotaal_aandeel_in_recht()))) &&
            ((this.einddatum_recht==null && other.getEinddatum_recht()==null) || 
             (this.einddatum_recht!=null &&
              this.einddatum_recht.equals(other.getEinddatum_recht()))) &&
            this.indicatie_recht_betrokken_in_splitsing == other.isIndicatie_recht_betrokken_in_splitsing() &&
            ((this.ontleend_aan_stukken_lijst==null && other.getOntleend_aan_stukken_lijst()==null) || 
             (this.ontleend_aan_stukken_lijst!=null &&
              this.ontleend_aan_stukken_lijst.equals(other.getOntleend_aan_stukken_lijst()))) &&
            ((this.mogelijk_van_belang_stukken_lijst==null && other.getMogelijk_van_belang_stukken_lijst()==null) || 
             (this.mogelijk_van_belang_stukken_lijst!=null &&
              this.mogelijk_van_belang_stukken_lijst.equals(other.getMogelijk_van_belang_stukken_lijst()))) &&
            ((this.aantekeningen_recht_lijst==null && other.getAantekeningen_recht_lijst()==null) || 
             (this.aantekeningen_recht_lijst!=null &&
              this.aantekeningen_recht_lijst.equals(other.getAantekeningen_recht_lijst())));
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
        if (getObject_id() != null) {
            _hashCode += getObject_id().hashCode();
        }
        if (getGerechtigde_id() != null) {
            _hashCode += getGerechtigde_id().hashCode();
        }
        if (getOmschrijving_recht() != null) {
            _hashCode += getOmschrijving_recht().hashCode();
        }
        if (getAandeel_in_recht() != null) {
            _hashCode += getAandeel_in_recht().hashCode();
        }
        if (getTotaal_aandeel_in_recht() != null) {
            _hashCode += getTotaal_aandeel_in_recht().hashCode();
        }
        if (getEinddatum_recht() != null) {
            _hashCode += getEinddatum_recht().hashCode();
        }
        _hashCode += (isIndicatie_recht_betrokken_in_splitsing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOntleend_aan_stukken_lijst() != null) {
            _hashCode += getOntleend_aan_stukken_lijst().hashCode();
        }
        if (getMogelijk_van_belang_stukken_lijst() != null) {
            _hashCode += getMogelijk_van_belang_stukken_lijst().hashCode();
        }
        if (getAantekeningen_recht_lijst() != null) {
            _hashCode += getAantekeningen_recht_lijst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Recht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerechtigde_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gerechtigde_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aandeel_in_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aandeel_in_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaal_aandeel_in_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "totaal_aandeel_in_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einddatum_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "einddatum_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_recht_betrokken_in_splitsing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_recht_betrokken_in_splitsing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ontleend_aan_stukken_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ontleend_aan_stukken_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "StukMetKadastraleAanduidingLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mogelijk_van_belang_stukken_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mogelijk_van_belang_stukken_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "StukReferentiesLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantekeningen_recht_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantekeningen_recht_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "AantekeningRechtLijst"));
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
