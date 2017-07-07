/**
 * KadasterBeknoptOnroerendeZaak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterBeknoptOnroerendeZaak  implements java.io.Serializable {
    private java.lang.String object_id;

    private nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding;

    private java.lang.String type;

    private java.lang.Boolean voorlopige_aantekening;

    private java.lang.Boolean meerdere_splitsingen;

    private nl.webservices.www.soap.KadasterPersoon gerechtigde;

    private nl.webservices.www.soap.KadasterHypotheekStukLijst onverwerkte_documenten;

    private java.math.BigDecimal grootte;

    private java.lang.Boolean vastgestelde_grootte;

    public KadasterBeknoptOnroerendeZaak() {
    }

    public KadasterBeknoptOnroerendeZaak(
           java.lang.String object_id,
           nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding,
           java.lang.String type,
           java.lang.Boolean voorlopige_aantekening,
           java.lang.Boolean meerdere_splitsingen,
           nl.webservices.www.soap.KadasterPersoon gerechtigde,
           nl.webservices.www.soap.KadasterHypotheekStukLijst onverwerkte_documenten,
           java.math.BigDecimal grootte,
           java.lang.Boolean vastgestelde_grootte) {
           this.object_id = object_id;
           this.kadastrale_aanduiding = kadastrale_aanduiding;
           this.type = type;
           this.voorlopige_aantekening = voorlopige_aantekening;
           this.meerdere_splitsingen = meerdere_splitsingen;
           this.gerechtigde = gerechtigde;
           this.onverwerkte_documenten = onverwerkte_documenten;
           this.grootte = grootte;
           this.vastgestelde_grootte = vastgestelde_grootte;
    }


    /**
     * Gets the object_id value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the kadastrale_aanduiding value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return kadastrale_aanduiding
     */
    public nl.webservices.www.soap.KadastraleAanduiding getKadastrale_aanduiding() {
        return kadastrale_aanduiding;
    }


    /**
     * Sets the kadastrale_aanduiding value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param kadastrale_aanduiding
     */
    public void setKadastrale_aanduiding(nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding) {
        this.kadastrale_aanduiding = kadastrale_aanduiding;
    }


    /**
     * Gets the type value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the voorlopige_aantekening value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return voorlopige_aantekening
     */
    public java.lang.Boolean getVoorlopige_aantekening() {
        return voorlopige_aantekening;
    }


    /**
     * Sets the voorlopige_aantekening value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param voorlopige_aantekening
     */
    public void setVoorlopige_aantekening(java.lang.Boolean voorlopige_aantekening) {
        this.voorlopige_aantekening = voorlopige_aantekening;
    }


    /**
     * Gets the meerdere_splitsingen value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return meerdere_splitsingen
     */
    public java.lang.Boolean getMeerdere_splitsingen() {
        return meerdere_splitsingen;
    }


    /**
     * Sets the meerdere_splitsingen value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param meerdere_splitsingen
     */
    public void setMeerdere_splitsingen(java.lang.Boolean meerdere_splitsingen) {
        this.meerdere_splitsingen = meerdere_splitsingen;
    }


    /**
     * Gets the gerechtigde value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return gerechtigde
     */
    public nl.webservices.www.soap.KadasterPersoon getGerechtigde() {
        return gerechtigde;
    }


    /**
     * Sets the gerechtigde value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param gerechtigde
     */
    public void setGerechtigde(nl.webservices.www.soap.KadasterPersoon gerechtigde) {
        this.gerechtigde = gerechtigde;
    }


    /**
     * Gets the onverwerkte_documenten value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return onverwerkte_documenten
     */
    public nl.webservices.www.soap.KadasterHypotheekStukLijst getOnverwerkte_documenten() {
        return onverwerkte_documenten;
    }


    /**
     * Sets the onverwerkte_documenten value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param onverwerkte_documenten
     */
    public void setOnverwerkte_documenten(nl.webservices.www.soap.KadasterHypotheekStukLijst onverwerkte_documenten) {
        this.onverwerkte_documenten = onverwerkte_documenten;
    }


    /**
     * Gets the grootte value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return grootte
     */
    public java.math.BigDecimal getGrootte() {
        return grootte;
    }


    /**
     * Sets the grootte value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param grootte
     */
    public void setGrootte(java.math.BigDecimal grootte) {
        this.grootte = grootte;
    }


    /**
     * Gets the vastgestelde_grootte value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @return vastgestelde_grootte
     */
    public java.lang.Boolean getVastgestelde_grootte() {
        return vastgestelde_grootte;
    }


    /**
     * Sets the vastgestelde_grootte value for this KadasterBeknoptOnroerendeZaak.
     * 
     * @param vastgestelde_grootte
     */
    public void setVastgestelde_grootte(java.lang.Boolean vastgestelde_grootte) {
        this.vastgestelde_grootte = vastgestelde_grootte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterBeknoptOnroerendeZaak)) return false;
        KadasterBeknoptOnroerendeZaak other = (KadasterBeknoptOnroerendeZaak) obj;
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
            ((this.kadastrale_aanduiding==null && other.getKadastrale_aanduiding()==null) || 
             (this.kadastrale_aanduiding!=null &&
              this.kadastrale_aanduiding.equals(other.getKadastrale_aanduiding()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.voorlopige_aantekening==null && other.getVoorlopige_aantekening()==null) || 
             (this.voorlopige_aantekening!=null &&
              this.voorlopige_aantekening.equals(other.getVoorlopige_aantekening()))) &&
            ((this.meerdere_splitsingen==null && other.getMeerdere_splitsingen()==null) || 
             (this.meerdere_splitsingen!=null &&
              this.meerdere_splitsingen.equals(other.getMeerdere_splitsingen()))) &&
            ((this.gerechtigde==null && other.getGerechtigde()==null) || 
             (this.gerechtigde!=null &&
              this.gerechtigde.equals(other.getGerechtigde()))) &&
            ((this.onverwerkte_documenten==null && other.getOnverwerkte_documenten()==null) || 
             (this.onverwerkte_documenten!=null &&
              this.onverwerkte_documenten.equals(other.getOnverwerkte_documenten()))) &&
            ((this.grootte==null && other.getGrootte()==null) || 
             (this.grootte!=null &&
              this.grootte.equals(other.getGrootte()))) &&
            ((this.vastgestelde_grootte==null && other.getVastgestelde_grootte()==null) || 
             (this.vastgestelde_grootte!=null &&
              this.vastgestelde_grootte.equals(other.getVastgestelde_grootte())));
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
        if (getKadastrale_aanduiding() != null) {
            _hashCode += getKadastrale_aanduiding().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getVoorlopige_aantekening() != null) {
            _hashCode += getVoorlopige_aantekening().hashCode();
        }
        if (getMeerdere_splitsingen() != null) {
            _hashCode += getMeerdere_splitsingen().hashCode();
        }
        if (getGerechtigde() != null) {
            _hashCode += getGerechtigde().hashCode();
        }
        if (getOnverwerkte_documenten() != null) {
            _hashCode += getOnverwerkte_documenten().hashCode();
        }
        if (getGrootte() != null) {
            _hashCode += getGrootte().hashCode();
        }
        if (getVastgestelde_grootte() != null) {
            _hashCode += getVastgestelde_grootte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterBeknoptOnroerendeZaak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBeknoptOnroerendeZaak"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_aanduiding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_aanduiding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduiding"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voorlopige_aantekening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voorlopige_aantekening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meerdere_splitsingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "meerdere_splitsingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerechtigde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gerechtigde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onverwerkte_documenten");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "onverwerkte_documenten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypotheekStukLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grootte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "grootte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastgestelde_grootte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vastgestelde_grootte"));
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
