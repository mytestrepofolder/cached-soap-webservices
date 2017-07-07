/**
 * KadasterNatuurlijkPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterNatuurlijkPersoon  implements java.io.Serializable {
    private java.lang.String bsn;

    private java.lang.String geslachtsnaam;

    private java.lang.String voorvoegsel_geslachtsnaam;

    private java.lang.String voornamen;

    private java.lang.String geslacht;

    private java.lang.String geboorteplaats;

    private java.util.Date geboortedatum;

    private java.util.Date datum_overlijden;

    private java.lang.Boolean indicatie_overleden;

    private java.lang.String burgerlijke_staat;

    public KadasterNatuurlijkPersoon() {
    }

    public KadasterNatuurlijkPersoon(
           java.lang.String bsn,
           java.lang.String geslachtsnaam,
           java.lang.String voorvoegsel_geslachtsnaam,
           java.lang.String voornamen,
           java.lang.String geslacht,
           java.lang.String geboorteplaats,
           java.util.Date geboortedatum,
           java.util.Date datum_overlijden,
           java.lang.Boolean indicatie_overleden,
           java.lang.String burgerlijke_staat) {
           this.bsn = bsn;
           this.geslachtsnaam = geslachtsnaam;
           this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
           this.voornamen = voornamen;
           this.geslacht = geslacht;
           this.geboorteplaats = geboorteplaats;
           this.geboortedatum = geboortedatum;
           this.datum_overlijden = datum_overlijden;
           this.indicatie_overleden = indicatie_overleden;
           this.burgerlijke_staat = burgerlijke_staat;
    }


    /**
     * Gets the bsn value for this KadasterNatuurlijkPersoon.
     * 
     * @return bsn
     */
    public java.lang.String getBsn() {
        return bsn;
    }


    /**
     * Sets the bsn value for this KadasterNatuurlijkPersoon.
     * 
     * @param bsn
     */
    public void setBsn(java.lang.String bsn) {
        this.bsn = bsn;
    }


    /**
     * Gets the geslachtsnaam value for this KadasterNatuurlijkPersoon.
     * 
     * @return geslachtsnaam
     */
    public java.lang.String getGeslachtsnaam() {
        return geslachtsnaam;
    }


    /**
     * Sets the geslachtsnaam value for this KadasterNatuurlijkPersoon.
     * 
     * @param geslachtsnaam
     */
    public void setGeslachtsnaam(java.lang.String geslachtsnaam) {
        this.geslachtsnaam = geslachtsnaam;
    }


    /**
     * Gets the voorvoegsel_geslachtsnaam value for this KadasterNatuurlijkPersoon.
     * 
     * @return voorvoegsel_geslachtsnaam
     */
    public java.lang.String getVoorvoegsel_geslachtsnaam() {
        return voorvoegsel_geslachtsnaam;
    }


    /**
     * Sets the voorvoegsel_geslachtsnaam value for this KadasterNatuurlijkPersoon.
     * 
     * @param voorvoegsel_geslachtsnaam
     */
    public void setVoorvoegsel_geslachtsnaam(java.lang.String voorvoegsel_geslachtsnaam) {
        this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
    }


    /**
     * Gets the voornamen value for this KadasterNatuurlijkPersoon.
     * 
     * @return voornamen
     */
    public java.lang.String getVoornamen() {
        return voornamen;
    }


    /**
     * Sets the voornamen value for this KadasterNatuurlijkPersoon.
     * 
     * @param voornamen
     */
    public void setVoornamen(java.lang.String voornamen) {
        this.voornamen = voornamen;
    }


    /**
     * Gets the geslacht value for this KadasterNatuurlijkPersoon.
     * 
     * @return geslacht
     */
    public java.lang.String getGeslacht() {
        return geslacht;
    }


    /**
     * Sets the geslacht value for this KadasterNatuurlijkPersoon.
     * 
     * @param geslacht
     */
    public void setGeslacht(java.lang.String geslacht) {
        this.geslacht = geslacht;
    }


    /**
     * Gets the geboorteplaats value for this KadasterNatuurlijkPersoon.
     * 
     * @return geboorteplaats
     */
    public java.lang.String getGeboorteplaats() {
        return geboorteplaats;
    }


    /**
     * Sets the geboorteplaats value for this KadasterNatuurlijkPersoon.
     * 
     * @param geboorteplaats
     */
    public void setGeboorteplaats(java.lang.String geboorteplaats) {
        this.geboorteplaats = geboorteplaats;
    }


    /**
     * Gets the geboortedatum value for this KadasterNatuurlijkPersoon.
     * 
     * @return geboortedatum
     */
    public java.util.Date getGeboortedatum() {
        return geboortedatum;
    }


    /**
     * Sets the geboortedatum value for this KadasterNatuurlijkPersoon.
     * 
     * @param geboortedatum
     */
    public void setGeboortedatum(java.util.Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }


    /**
     * Gets the datum_overlijden value for this KadasterNatuurlijkPersoon.
     * 
     * @return datum_overlijden
     */
    public java.util.Date getDatum_overlijden() {
        return datum_overlijden;
    }


    /**
     * Sets the datum_overlijden value for this KadasterNatuurlijkPersoon.
     * 
     * @param datum_overlijden
     */
    public void setDatum_overlijden(java.util.Date datum_overlijden) {
        this.datum_overlijden = datum_overlijden;
    }


    /**
     * Gets the indicatie_overleden value for this KadasterNatuurlijkPersoon.
     * 
     * @return indicatie_overleden
     */
    public java.lang.Boolean getIndicatie_overleden() {
        return indicatie_overleden;
    }


    /**
     * Sets the indicatie_overleden value for this KadasterNatuurlijkPersoon.
     * 
     * @param indicatie_overleden
     */
    public void setIndicatie_overleden(java.lang.Boolean indicatie_overleden) {
        this.indicatie_overleden = indicatie_overleden;
    }


    /**
     * Gets the burgerlijke_staat value for this KadasterNatuurlijkPersoon.
     * 
     * @return burgerlijke_staat
     */
    public java.lang.String getBurgerlijke_staat() {
        return burgerlijke_staat;
    }


    /**
     * Sets the burgerlijke_staat value for this KadasterNatuurlijkPersoon.
     * 
     * @param burgerlijke_staat
     */
    public void setBurgerlijke_staat(java.lang.String burgerlijke_staat) {
        this.burgerlijke_staat = burgerlijke_staat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterNatuurlijkPersoon)) return false;
        KadasterNatuurlijkPersoon other = (KadasterNatuurlijkPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bsn==null && other.getBsn()==null) || 
             (this.bsn!=null &&
              this.bsn.equals(other.getBsn()))) &&
            ((this.geslachtsnaam==null && other.getGeslachtsnaam()==null) || 
             (this.geslachtsnaam!=null &&
              this.geslachtsnaam.equals(other.getGeslachtsnaam()))) &&
            ((this.voorvoegsel_geslachtsnaam==null && other.getVoorvoegsel_geslachtsnaam()==null) || 
             (this.voorvoegsel_geslachtsnaam!=null &&
              this.voorvoegsel_geslachtsnaam.equals(other.getVoorvoegsel_geslachtsnaam()))) &&
            ((this.voornamen==null && other.getVoornamen()==null) || 
             (this.voornamen!=null &&
              this.voornamen.equals(other.getVoornamen()))) &&
            ((this.geslacht==null && other.getGeslacht()==null) || 
             (this.geslacht!=null &&
              this.geslacht.equals(other.getGeslacht()))) &&
            ((this.geboorteplaats==null && other.getGeboorteplaats()==null) || 
             (this.geboorteplaats!=null &&
              this.geboorteplaats.equals(other.getGeboorteplaats()))) &&
            ((this.geboortedatum==null && other.getGeboortedatum()==null) || 
             (this.geboortedatum!=null &&
              this.geboortedatum.equals(other.getGeboortedatum()))) &&
            ((this.datum_overlijden==null && other.getDatum_overlijden()==null) || 
             (this.datum_overlijden!=null &&
              this.datum_overlijden.equals(other.getDatum_overlijden()))) &&
            ((this.indicatie_overleden==null && other.getIndicatie_overleden()==null) || 
             (this.indicatie_overleden!=null &&
              this.indicatie_overleden.equals(other.getIndicatie_overleden()))) &&
            ((this.burgerlijke_staat==null && other.getBurgerlijke_staat()==null) || 
             (this.burgerlijke_staat!=null &&
              this.burgerlijke_staat.equals(other.getBurgerlijke_staat())));
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
        if (getBsn() != null) {
            _hashCode += getBsn().hashCode();
        }
        if (getGeslachtsnaam() != null) {
            _hashCode += getGeslachtsnaam().hashCode();
        }
        if (getVoorvoegsel_geslachtsnaam() != null) {
            _hashCode += getVoorvoegsel_geslachtsnaam().hashCode();
        }
        if (getVoornamen() != null) {
            _hashCode += getVoornamen().hashCode();
        }
        if (getGeslacht() != null) {
            _hashCode += getGeslacht().hashCode();
        }
        if (getGeboorteplaats() != null) {
            _hashCode += getGeboorteplaats().hashCode();
        }
        if (getGeboortedatum() != null) {
            _hashCode += getGeboortedatum().hashCode();
        }
        if (getDatum_overlijden() != null) {
            _hashCode += getDatum_overlijden().hashCode();
        }
        if (getIndicatie_overleden() != null) {
            _hashCode += getIndicatie_overleden().hashCode();
        }
        if (getBurgerlijke_staat() != null) {
            _hashCode += getBurgerlijke_staat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterNatuurlijkPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterNatuurlijkPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bsn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bsn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geslachtsnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geslachtsnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voorvoegsel_geslachtsnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voorvoegsel_geslachtsnaam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voornamen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "voornamen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geslacht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geslacht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geboorteplaats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geboorteplaats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geboortedatum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geboortedatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_overlijden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_overlijden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_overleden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_overleden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("burgerlijke_staat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "burgerlijke_staat"));
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
