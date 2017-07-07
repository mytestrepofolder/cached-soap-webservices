/**
 * KadasterPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterPersoon  implements java.io.Serializable {
    private java.lang.String akr_subject_nr;

    private java.lang.String kadastrale_identificatie;

    private nl.webservices.www.soap.KadasterNatuurlijkPersoon natuurlijk_persoon;

    private nl.webservices.www.soap.KadasterNietNatuurlijkPersoon niet_natuurlijk_persoon;

    private java.lang.Boolean aantekening_beschikkingsbevoegdheid;

    private nl.webservices.www.soap.KadasterLocatie woonlocatie;

    private nl.webservices.www.soap.KadasterLocatie postlocatie;

    private nl.webservices.www.soap.KadasterDomicilieKeuzeLijst domicilie_keuzes;

    public KadasterPersoon() {
    }

    public KadasterPersoon(
           java.lang.String akr_subject_nr,
           java.lang.String kadastrale_identificatie,
           nl.webservices.www.soap.KadasterNatuurlijkPersoon natuurlijk_persoon,
           nl.webservices.www.soap.KadasterNietNatuurlijkPersoon niet_natuurlijk_persoon,
           java.lang.Boolean aantekening_beschikkingsbevoegdheid,
           nl.webservices.www.soap.KadasterLocatie woonlocatie,
           nl.webservices.www.soap.KadasterLocatie postlocatie,
           nl.webservices.www.soap.KadasterDomicilieKeuzeLijst domicilie_keuzes) {
           this.akr_subject_nr = akr_subject_nr;
           this.kadastrale_identificatie = kadastrale_identificatie;
           this.natuurlijk_persoon = natuurlijk_persoon;
           this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
           this.aantekening_beschikkingsbevoegdheid = aantekening_beschikkingsbevoegdheid;
           this.woonlocatie = woonlocatie;
           this.postlocatie = postlocatie;
           this.domicilie_keuzes = domicilie_keuzes;
    }


    /**
     * Gets the akr_subject_nr value for this KadasterPersoon.
     * 
     * @return akr_subject_nr
     */
    public java.lang.String getAkr_subject_nr() {
        return akr_subject_nr;
    }


    /**
     * Sets the akr_subject_nr value for this KadasterPersoon.
     * 
     * @param akr_subject_nr
     */
    public void setAkr_subject_nr(java.lang.String akr_subject_nr) {
        this.akr_subject_nr = akr_subject_nr;
    }


    /**
     * Gets the kadastrale_identificatie value for this KadasterPersoon.
     * 
     * @return kadastrale_identificatie
     */
    public java.lang.String getKadastrale_identificatie() {
        return kadastrale_identificatie;
    }


    /**
     * Sets the kadastrale_identificatie value for this KadasterPersoon.
     * 
     * @param kadastrale_identificatie
     */
    public void setKadastrale_identificatie(java.lang.String kadastrale_identificatie) {
        this.kadastrale_identificatie = kadastrale_identificatie;
    }


    /**
     * Gets the natuurlijk_persoon value for this KadasterPersoon.
     * 
     * @return natuurlijk_persoon
     */
    public nl.webservices.www.soap.KadasterNatuurlijkPersoon getNatuurlijk_persoon() {
        return natuurlijk_persoon;
    }


    /**
     * Sets the natuurlijk_persoon value for this KadasterPersoon.
     * 
     * @param natuurlijk_persoon
     */
    public void setNatuurlijk_persoon(nl.webservices.www.soap.KadasterNatuurlijkPersoon natuurlijk_persoon) {
        this.natuurlijk_persoon = natuurlijk_persoon;
    }


    /**
     * Gets the niet_natuurlijk_persoon value for this KadasterPersoon.
     * 
     * @return niet_natuurlijk_persoon
     */
    public nl.webservices.www.soap.KadasterNietNatuurlijkPersoon getNiet_natuurlijk_persoon() {
        return niet_natuurlijk_persoon;
    }


    /**
     * Sets the niet_natuurlijk_persoon value for this KadasterPersoon.
     * 
     * @param niet_natuurlijk_persoon
     */
    public void setNiet_natuurlijk_persoon(nl.webservices.www.soap.KadasterNietNatuurlijkPersoon niet_natuurlijk_persoon) {
        this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
    }


    /**
     * Gets the aantekening_beschikkingsbevoegdheid value for this KadasterPersoon.
     * 
     * @return aantekening_beschikkingsbevoegdheid
     */
    public java.lang.Boolean getAantekening_beschikkingsbevoegdheid() {
        return aantekening_beschikkingsbevoegdheid;
    }


    /**
     * Sets the aantekening_beschikkingsbevoegdheid value for this KadasterPersoon.
     * 
     * @param aantekening_beschikkingsbevoegdheid
     */
    public void setAantekening_beschikkingsbevoegdheid(java.lang.Boolean aantekening_beschikkingsbevoegdheid) {
        this.aantekening_beschikkingsbevoegdheid = aantekening_beschikkingsbevoegdheid;
    }


    /**
     * Gets the woonlocatie value for this KadasterPersoon.
     * 
     * @return woonlocatie
     */
    public nl.webservices.www.soap.KadasterLocatie getWoonlocatie() {
        return woonlocatie;
    }


    /**
     * Sets the woonlocatie value for this KadasterPersoon.
     * 
     * @param woonlocatie
     */
    public void setWoonlocatie(nl.webservices.www.soap.KadasterLocatie woonlocatie) {
        this.woonlocatie = woonlocatie;
    }


    /**
     * Gets the postlocatie value for this KadasterPersoon.
     * 
     * @return postlocatie
     */
    public nl.webservices.www.soap.KadasterLocatie getPostlocatie() {
        return postlocatie;
    }


    /**
     * Sets the postlocatie value for this KadasterPersoon.
     * 
     * @param postlocatie
     */
    public void setPostlocatie(nl.webservices.www.soap.KadasterLocatie postlocatie) {
        this.postlocatie = postlocatie;
    }


    /**
     * Gets the domicilie_keuzes value for this KadasterPersoon.
     * 
     * @return domicilie_keuzes
     */
    public nl.webservices.www.soap.KadasterDomicilieKeuzeLijst getDomicilie_keuzes() {
        return domicilie_keuzes;
    }


    /**
     * Sets the domicilie_keuzes value for this KadasterPersoon.
     * 
     * @param domicilie_keuzes
     */
    public void setDomicilie_keuzes(nl.webservices.www.soap.KadasterDomicilieKeuzeLijst domicilie_keuzes) {
        this.domicilie_keuzes = domicilie_keuzes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterPersoon)) return false;
        KadasterPersoon other = (KadasterPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.akr_subject_nr==null && other.getAkr_subject_nr()==null) || 
             (this.akr_subject_nr!=null &&
              this.akr_subject_nr.equals(other.getAkr_subject_nr()))) &&
            ((this.kadastrale_identificatie==null && other.getKadastrale_identificatie()==null) || 
             (this.kadastrale_identificatie!=null &&
              this.kadastrale_identificatie.equals(other.getKadastrale_identificatie()))) &&
            ((this.natuurlijk_persoon==null && other.getNatuurlijk_persoon()==null) || 
             (this.natuurlijk_persoon!=null &&
              this.natuurlijk_persoon.equals(other.getNatuurlijk_persoon()))) &&
            ((this.niet_natuurlijk_persoon==null && other.getNiet_natuurlijk_persoon()==null) || 
             (this.niet_natuurlijk_persoon!=null &&
              this.niet_natuurlijk_persoon.equals(other.getNiet_natuurlijk_persoon()))) &&
            ((this.aantekening_beschikkingsbevoegdheid==null && other.getAantekening_beschikkingsbevoegdheid()==null) || 
             (this.aantekening_beschikkingsbevoegdheid!=null &&
              this.aantekening_beschikkingsbevoegdheid.equals(other.getAantekening_beschikkingsbevoegdheid()))) &&
            ((this.woonlocatie==null && other.getWoonlocatie()==null) || 
             (this.woonlocatie!=null &&
              this.woonlocatie.equals(other.getWoonlocatie()))) &&
            ((this.postlocatie==null && other.getPostlocatie()==null) || 
             (this.postlocatie!=null &&
              this.postlocatie.equals(other.getPostlocatie()))) &&
            ((this.domicilie_keuzes==null && other.getDomicilie_keuzes()==null) || 
             (this.domicilie_keuzes!=null &&
              this.domicilie_keuzes.equals(other.getDomicilie_keuzes())));
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
        if (getAkr_subject_nr() != null) {
            _hashCode += getAkr_subject_nr().hashCode();
        }
        if (getKadastrale_identificatie() != null) {
            _hashCode += getKadastrale_identificatie().hashCode();
        }
        if (getNatuurlijk_persoon() != null) {
            _hashCode += getNatuurlijk_persoon().hashCode();
        }
        if (getNiet_natuurlijk_persoon() != null) {
            _hashCode += getNiet_natuurlijk_persoon().hashCode();
        }
        if (getAantekening_beschikkingsbevoegdheid() != null) {
            _hashCode += getAantekening_beschikkingsbevoegdheid().hashCode();
        }
        if (getWoonlocatie() != null) {
            _hashCode += getWoonlocatie().hashCode();
        }
        if (getPostlocatie() != null) {
            _hashCode += getPostlocatie().hashCode();
        }
        if (getDomicilie_keuzes() != null) {
            _hashCode += getDomicilie_keuzes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("akr_subject_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "akr_subject_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_identificatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_identificatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterNatuurlijkPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niet_natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "niet_natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterNietNatuurlijkPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantekening_beschikkingsbevoegdheid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantekening_beschikkingsbevoegdheid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("woonlocatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "woonlocatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterLocatie"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postlocatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postlocatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterLocatie"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilie_keuzes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domicilie_keuzes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterDomicilieKeuzeLijst"));
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
