/**
 * PersoonV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class PersoonV2  implements java.io.Serializable {
    private java.lang.String id;

    private nl.webservices.www.soap.NatuurlijkPersoonV2 natuurlijk_persoon;

    private nl.webservices.www.soap.NietNatuurlijkPersoon niet_natuurlijk_persoon;

    private boolean aantekening_beschikkingsbevoegdheid;

    private boolean indicatie_meer_onroerende_zaken;

    private nl.webservices.www.soap.Locatie woonlocatie;

    private nl.webservices.www.soap.Locatie postlocatie;

    private nl.webservices.www.soap.StukReferentiesLijst niet_volledig_verwerkt_stukken_lijst;

    private nl.webservices.www.soap.StukReferentiesLijst mogelijk_van_belang_stukken_lijst;

    public PersoonV2() {
    }

    public PersoonV2(
           java.lang.String id,
           nl.webservices.www.soap.NatuurlijkPersoonV2 natuurlijk_persoon,
           nl.webservices.www.soap.NietNatuurlijkPersoon niet_natuurlijk_persoon,
           boolean aantekening_beschikkingsbevoegdheid,
           boolean indicatie_meer_onroerende_zaken,
           nl.webservices.www.soap.Locatie woonlocatie,
           nl.webservices.www.soap.Locatie postlocatie,
           nl.webservices.www.soap.StukReferentiesLijst niet_volledig_verwerkt_stukken_lijst,
           nl.webservices.www.soap.StukReferentiesLijst mogelijk_van_belang_stukken_lijst) {
           this.id = id;
           this.natuurlijk_persoon = natuurlijk_persoon;
           this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
           this.aantekening_beschikkingsbevoegdheid = aantekening_beschikkingsbevoegdheid;
           this.indicatie_meer_onroerende_zaken = indicatie_meer_onroerende_zaken;
           this.woonlocatie = woonlocatie;
           this.postlocatie = postlocatie;
           this.niet_volledig_verwerkt_stukken_lijst = niet_volledig_verwerkt_stukken_lijst;
           this.mogelijk_van_belang_stukken_lijst = mogelijk_van_belang_stukken_lijst;
    }


    /**
     * Gets the id value for this PersoonV2.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PersoonV2.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the natuurlijk_persoon value for this PersoonV2.
     * 
     * @return natuurlijk_persoon
     */
    public nl.webservices.www.soap.NatuurlijkPersoonV2 getNatuurlijk_persoon() {
        return natuurlijk_persoon;
    }


    /**
     * Sets the natuurlijk_persoon value for this PersoonV2.
     * 
     * @param natuurlijk_persoon
     */
    public void setNatuurlijk_persoon(nl.webservices.www.soap.NatuurlijkPersoonV2 natuurlijk_persoon) {
        this.natuurlijk_persoon = natuurlijk_persoon;
    }


    /**
     * Gets the niet_natuurlijk_persoon value for this PersoonV2.
     * 
     * @return niet_natuurlijk_persoon
     */
    public nl.webservices.www.soap.NietNatuurlijkPersoon getNiet_natuurlijk_persoon() {
        return niet_natuurlijk_persoon;
    }


    /**
     * Sets the niet_natuurlijk_persoon value for this PersoonV2.
     * 
     * @param niet_natuurlijk_persoon
     */
    public void setNiet_natuurlijk_persoon(nl.webservices.www.soap.NietNatuurlijkPersoon niet_natuurlijk_persoon) {
        this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
    }


    /**
     * Gets the aantekening_beschikkingsbevoegdheid value for this PersoonV2.
     * 
     * @return aantekening_beschikkingsbevoegdheid
     */
    public boolean isAantekening_beschikkingsbevoegdheid() {
        return aantekening_beschikkingsbevoegdheid;
    }


    /**
     * Sets the aantekening_beschikkingsbevoegdheid value for this PersoonV2.
     * 
     * @param aantekening_beschikkingsbevoegdheid
     */
    public void setAantekening_beschikkingsbevoegdheid(boolean aantekening_beschikkingsbevoegdheid) {
        this.aantekening_beschikkingsbevoegdheid = aantekening_beschikkingsbevoegdheid;
    }


    /**
     * Gets the indicatie_meer_onroerende_zaken value for this PersoonV2.
     * 
     * @return indicatie_meer_onroerende_zaken
     */
    public boolean isIndicatie_meer_onroerende_zaken() {
        return indicatie_meer_onroerende_zaken;
    }


    /**
     * Sets the indicatie_meer_onroerende_zaken value for this PersoonV2.
     * 
     * @param indicatie_meer_onroerende_zaken
     */
    public void setIndicatie_meer_onroerende_zaken(boolean indicatie_meer_onroerende_zaken) {
        this.indicatie_meer_onroerende_zaken = indicatie_meer_onroerende_zaken;
    }


    /**
     * Gets the woonlocatie value for this PersoonV2.
     * 
     * @return woonlocatie
     */
    public nl.webservices.www.soap.Locatie getWoonlocatie() {
        return woonlocatie;
    }


    /**
     * Sets the woonlocatie value for this PersoonV2.
     * 
     * @param woonlocatie
     */
    public void setWoonlocatie(nl.webservices.www.soap.Locatie woonlocatie) {
        this.woonlocatie = woonlocatie;
    }


    /**
     * Gets the postlocatie value for this PersoonV2.
     * 
     * @return postlocatie
     */
    public nl.webservices.www.soap.Locatie getPostlocatie() {
        return postlocatie;
    }


    /**
     * Sets the postlocatie value for this PersoonV2.
     * 
     * @param postlocatie
     */
    public void setPostlocatie(nl.webservices.www.soap.Locatie postlocatie) {
        this.postlocatie = postlocatie;
    }


    /**
     * Gets the niet_volledig_verwerkt_stukken_lijst value for this PersoonV2.
     * 
     * @return niet_volledig_verwerkt_stukken_lijst
     */
    public nl.webservices.www.soap.StukReferentiesLijst getNiet_volledig_verwerkt_stukken_lijst() {
        return niet_volledig_verwerkt_stukken_lijst;
    }


    /**
     * Sets the niet_volledig_verwerkt_stukken_lijst value for this PersoonV2.
     * 
     * @param niet_volledig_verwerkt_stukken_lijst
     */
    public void setNiet_volledig_verwerkt_stukken_lijst(nl.webservices.www.soap.StukReferentiesLijst niet_volledig_verwerkt_stukken_lijst) {
        this.niet_volledig_verwerkt_stukken_lijst = niet_volledig_verwerkt_stukken_lijst;
    }


    /**
     * Gets the mogelijk_van_belang_stukken_lijst value for this PersoonV2.
     * 
     * @return mogelijk_van_belang_stukken_lijst
     */
    public nl.webservices.www.soap.StukReferentiesLijst getMogelijk_van_belang_stukken_lijst() {
        return mogelijk_van_belang_stukken_lijst;
    }


    /**
     * Sets the mogelijk_van_belang_stukken_lijst value for this PersoonV2.
     * 
     * @param mogelijk_van_belang_stukken_lijst
     */
    public void setMogelijk_van_belang_stukken_lijst(nl.webservices.www.soap.StukReferentiesLijst mogelijk_van_belang_stukken_lijst) {
        this.mogelijk_van_belang_stukken_lijst = mogelijk_van_belang_stukken_lijst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersoonV2)) return false;
        PersoonV2 other = (PersoonV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.natuurlijk_persoon==null && other.getNatuurlijk_persoon()==null) || 
             (this.natuurlijk_persoon!=null &&
              this.natuurlijk_persoon.equals(other.getNatuurlijk_persoon()))) &&
            ((this.niet_natuurlijk_persoon==null && other.getNiet_natuurlijk_persoon()==null) || 
             (this.niet_natuurlijk_persoon!=null &&
              this.niet_natuurlijk_persoon.equals(other.getNiet_natuurlijk_persoon()))) &&
            this.aantekening_beschikkingsbevoegdheid == other.isAantekening_beschikkingsbevoegdheid() &&
            this.indicatie_meer_onroerende_zaken == other.isIndicatie_meer_onroerende_zaken() &&
            ((this.woonlocatie==null && other.getWoonlocatie()==null) || 
             (this.woonlocatie!=null &&
              this.woonlocatie.equals(other.getWoonlocatie()))) &&
            ((this.postlocatie==null && other.getPostlocatie()==null) || 
             (this.postlocatie!=null &&
              this.postlocatie.equals(other.getPostlocatie()))) &&
            ((this.niet_volledig_verwerkt_stukken_lijst==null && other.getNiet_volledig_verwerkt_stukken_lijst()==null) || 
             (this.niet_volledig_verwerkt_stukken_lijst!=null &&
              this.niet_volledig_verwerkt_stukken_lijst.equals(other.getNiet_volledig_verwerkt_stukken_lijst()))) &&
            ((this.mogelijk_van_belang_stukken_lijst==null && other.getMogelijk_van_belang_stukken_lijst()==null) || 
             (this.mogelijk_van_belang_stukken_lijst!=null &&
              this.mogelijk_van_belang_stukken_lijst.equals(other.getMogelijk_van_belang_stukken_lijst())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNatuurlijk_persoon() != null) {
            _hashCode += getNatuurlijk_persoon().hashCode();
        }
        if (getNiet_natuurlijk_persoon() != null) {
            _hashCode += getNiet_natuurlijk_persoon().hashCode();
        }
        _hashCode += (isAantekening_beschikkingsbevoegdheid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndicatie_meer_onroerende_zaken() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWoonlocatie() != null) {
            _hashCode += getWoonlocatie().hashCode();
        }
        if (getPostlocatie() != null) {
            _hashCode += getPostlocatie().hashCode();
        }
        if (getNiet_volledig_verwerkt_stukken_lijst() != null) {
            _hashCode += getNiet_volledig_verwerkt_stukken_lijst().hashCode();
        }
        if (getMogelijk_van_belang_stukken_lijst() != null) {
            _hashCode += getMogelijk_van_belang_stukken_lijst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersoonV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PersoonV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NatuurlijkPersoonV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niet_natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "niet_natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NietNatuurlijkPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantekening_beschikkingsbevoegdheid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantekening_beschikkingsbevoegdheid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_meer_onroerende_zaken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_meer_onroerende_zaken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("woonlocatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "woonlocatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Locatie"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postlocatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postlocatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Locatie"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niet_volledig_verwerkt_stukken_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "niet_volledig_verwerkt_stukken_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "StukReferentiesLijst"));
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
