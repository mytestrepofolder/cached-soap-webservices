/**
 * NatuurlijkPersoonV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NatuurlijkPersoonV2  implements java.io.Serializable {
    private java.lang.String adellijke_titel_geslachtsnaam;

    private java.lang.String geslachtsnaam;

    private java.lang.String voorvoegsel_geslachtsnaam;

    private java.lang.String adellijke_titel;

    private java.lang.String voornamen;

    private java.lang.String geslacht;

    private java.lang.String geboorteplaats;

    private java.util.Date geboortedatum;

    private java.util.Date datum_overlijden;

    private boolean indicatie_overleden;

    private boolean indicatie_conform_gba;

    private java.lang.String relatie_partnerid;

    private java.lang.String omschrijving_relatie;

    public NatuurlijkPersoonV2() {
    }

    public NatuurlijkPersoonV2(
           java.lang.String adellijke_titel_geslachtsnaam,
           java.lang.String geslachtsnaam,
           java.lang.String voorvoegsel_geslachtsnaam,
           java.lang.String adellijke_titel,
           java.lang.String voornamen,
           java.lang.String geslacht,
           java.lang.String geboorteplaats,
           java.util.Date geboortedatum,
           java.util.Date datum_overlijden,
           boolean indicatie_overleden,
           boolean indicatie_conform_gba,
           java.lang.String relatie_partnerid,
           java.lang.String omschrijving_relatie) {
           this.adellijke_titel_geslachtsnaam = adellijke_titel_geslachtsnaam;
           this.geslachtsnaam = geslachtsnaam;
           this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
           this.adellijke_titel = adellijke_titel;
           this.voornamen = voornamen;
           this.geslacht = geslacht;
           this.geboorteplaats = geboorteplaats;
           this.geboortedatum = geboortedatum;
           this.datum_overlijden = datum_overlijden;
           this.indicatie_overleden = indicatie_overleden;
           this.indicatie_conform_gba = indicatie_conform_gba;
           this.relatie_partnerid = relatie_partnerid;
           this.omschrijving_relatie = omschrijving_relatie;
    }


    /**
     * Gets the adellijke_titel_geslachtsnaam value for this NatuurlijkPersoonV2.
     * 
     * @return adellijke_titel_geslachtsnaam
     */
    public java.lang.String getAdellijke_titel_geslachtsnaam() {
        return adellijke_titel_geslachtsnaam;
    }


    /**
     * Sets the adellijke_titel_geslachtsnaam value for this NatuurlijkPersoonV2.
     * 
     * @param adellijke_titel_geslachtsnaam
     */
    public void setAdellijke_titel_geslachtsnaam(java.lang.String adellijke_titel_geslachtsnaam) {
        this.adellijke_titel_geslachtsnaam = adellijke_titel_geslachtsnaam;
    }


    /**
     * Gets the geslachtsnaam value for this NatuurlijkPersoonV2.
     * 
     * @return geslachtsnaam
     */
    public java.lang.String getGeslachtsnaam() {
        return geslachtsnaam;
    }


    /**
     * Sets the geslachtsnaam value for this NatuurlijkPersoonV2.
     * 
     * @param geslachtsnaam
     */
    public void setGeslachtsnaam(java.lang.String geslachtsnaam) {
        this.geslachtsnaam = geslachtsnaam;
    }


    /**
     * Gets the voorvoegsel_geslachtsnaam value for this NatuurlijkPersoonV2.
     * 
     * @return voorvoegsel_geslachtsnaam
     */
    public java.lang.String getVoorvoegsel_geslachtsnaam() {
        return voorvoegsel_geslachtsnaam;
    }


    /**
     * Sets the voorvoegsel_geslachtsnaam value for this NatuurlijkPersoonV2.
     * 
     * @param voorvoegsel_geslachtsnaam
     */
    public void setVoorvoegsel_geslachtsnaam(java.lang.String voorvoegsel_geslachtsnaam) {
        this.voorvoegsel_geslachtsnaam = voorvoegsel_geslachtsnaam;
    }


    /**
     * Gets the adellijke_titel value for this NatuurlijkPersoonV2.
     * 
     * @return adellijke_titel
     */
    public java.lang.String getAdellijke_titel() {
        return adellijke_titel;
    }


    /**
     * Sets the adellijke_titel value for this NatuurlijkPersoonV2.
     * 
     * @param adellijke_titel
     */
    public void setAdellijke_titel(java.lang.String adellijke_titel) {
        this.adellijke_titel = adellijke_titel;
    }


    /**
     * Gets the voornamen value for this NatuurlijkPersoonV2.
     * 
     * @return voornamen
     */
    public java.lang.String getVoornamen() {
        return voornamen;
    }


    /**
     * Sets the voornamen value for this NatuurlijkPersoonV2.
     * 
     * @param voornamen
     */
    public void setVoornamen(java.lang.String voornamen) {
        this.voornamen = voornamen;
    }


    /**
     * Gets the geslacht value for this NatuurlijkPersoonV2.
     * 
     * @return geslacht
     */
    public java.lang.String getGeslacht() {
        return geslacht;
    }


    /**
     * Sets the geslacht value for this NatuurlijkPersoonV2.
     * 
     * @param geslacht
     */
    public void setGeslacht(java.lang.String geslacht) {
        this.geslacht = geslacht;
    }


    /**
     * Gets the geboorteplaats value for this NatuurlijkPersoonV2.
     * 
     * @return geboorteplaats
     */
    public java.lang.String getGeboorteplaats() {
        return geboorteplaats;
    }


    /**
     * Sets the geboorteplaats value for this NatuurlijkPersoonV2.
     * 
     * @param geboorteplaats
     */
    public void setGeboorteplaats(java.lang.String geboorteplaats) {
        this.geboorteplaats = geboorteplaats;
    }


    /**
     * Gets the geboortedatum value for this NatuurlijkPersoonV2.
     * 
     * @return geboortedatum
     */
    public java.util.Date getGeboortedatum() {
        return geboortedatum;
    }


    /**
     * Sets the geboortedatum value for this NatuurlijkPersoonV2.
     * 
     * @param geboortedatum
     */
    public void setGeboortedatum(java.util.Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }


    /**
     * Gets the datum_overlijden value for this NatuurlijkPersoonV2.
     * 
     * @return datum_overlijden
     */
    public java.util.Date getDatum_overlijden() {
        return datum_overlijden;
    }


    /**
     * Sets the datum_overlijden value for this NatuurlijkPersoonV2.
     * 
     * @param datum_overlijden
     */
    public void setDatum_overlijden(java.util.Date datum_overlijden) {
        this.datum_overlijden = datum_overlijden;
    }


    /**
     * Gets the indicatie_overleden value for this NatuurlijkPersoonV2.
     * 
     * @return indicatie_overleden
     */
    public boolean isIndicatie_overleden() {
        return indicatie_overleden;
    }


    /**
     * Sets the indicatie_overleden value for this NatuurlijkPersoonV2.
     * 
     * @param indicatie_overleden
     */
    public void setIndicatie_overleden(boolean indicatie_overleden) {
        this.indicatie_overleden = indicatie_overleden;
    }


    /**
     * Gets the indicatie_conform_gba value for this NatuurlijkPersoonV2.
     * 
     * @return indicatie_conform_gba
     */
    public boolean isIndicatie_conform_gba() {
        return indicatie_conform_gba;
    }


    /**
     * Sets the indicatie_conform_gba value for this NatuurlijkPersoonV2.
     * 
     * @param indicatie_conform_gba
     */
    public void setIndicatie_conform_gba(boolean indicatie_conform_gba) {
        this.indicatie_conform_gba = indicatie_conform_gba;
    }


    /**
     * Gets the relatie_partnerid value for this NatuurlijkPersoonV2.
     * 
     * @return relatie_partnerid
     */
    public java.lang.String getRelatie_partnerid() {
        return relatie_partnerid;
    }


    /**
     * Sets the relatie_partnerid value for this NatuurlijkPersoonV2.
     * 
     * @param relatie_partnerid
     */
    public void setRelatie_partnerid(java.lang.String relatie_partnerid) {
        this.relatie_partnerid = relatie_partnerid;
    }


    /**
     * Gets the omschrijving_relatie value for this NatuurlijkPersoonV2.
     * 
     * @return omschrijving_relatie
     */
    public java.lang.String getOmschrijving_relatie() {
        return omschrijving_relatie;
    }


    /**
     * Sets the omschrijving_relatie value for this NatuurlijkPersoonV2.
     * 
     * @param omschrijving_relatie
     */
    public void setOmschrijving_relatie(java.lang.String omschrijving_relatie) {
        this.omschrijving_relatie = omschrijving_relatie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NatuurlijkPersoonV2)) return false;
        NatuurlijkPersoonV2 other = (NatuurlijkPersoonV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adellijke_titel_geslachtsnaam==null && other.getAdellijke_titel_geslachtsnaam()==null) || 
             (this.adellijke_titel_geslachtsnaam!=null &&
              this.adellijke_titel_geslachtsnaam.equals(other.getAdellijke_titel_geslachtsnaam()))) &&
            ((this.geslachtsnaam==null && other.getGeslachtsnaam()==null) || 
             (this.geslachtsnaam!=null &&
              this.geslachtsnaam.equals(other.getGeslachtsnaam()))) &&
            ((this.voorvoegsel_geslachtsnaam==null && other.getVoorvoegsel_geslachtsnaam()==null) || 
             (this.voorvoegsel_geslachtsnaam!=null &&
              this.voorvoegsel_geslachtsnaam.equals(other.getVoorvoegsel_geslachtsnaam()))) &&
            ((this.adellijke_titel==null && other.getAdellijke_titel()==null) || 
             (this.adellijke_titel!=null &&
              this.adellijke_titel.equals(other.getAdellijke_titel()))) &&
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
            this.indicatie_overleden == other.isIndicatie_overleden() &&
            this.indicatie_conform_gba == other.isIndicatie_conform_gba() &&
            ((this.relatie_partnerid==null && other.getRelatie_partnerid()==null) || 
             (this.relatie_partnerid!=null &&
              this.relatie_partnerid.equals(other.getRelatie_partnerid()))) &&
            ((this.omschrijving_relatie==null && other.getOmschrijving_relatie()==null) || 
             (this.omschrijving_relatie!=null &&
              this.omschrijving_relatie.equals(other.getOmschrijving_relatie())));
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
        if (getAdellijke_titel_geslachtsnaam() != null) {
            _hashCode += getAdellijke_titel_geslachtsnaam().hashCode();
        }
        if (getGeslachtsnaam() != null) {
            _hashCode += getGeslachtsnaam().hashCode();
        }
        if (getVoorvoegsel_geslachtsnaam() != null) {
            _hashCode += getVoorvoegsel_geslachtsnaam().hashCode();
        }
        if (getAdellijke_titel() != null) {
            _hashCode += getAdellijke_titel().hashCode();
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
        _hashCode += (isIndicatie_overleden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndicatie_conform_gba() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRelatie_partnerid() != null) {
            _hashCode += getRelatie_partnerid().hashCode();
        }
        if (getOmschrijving_relatie() != null) {
            _hashCode += getOmschrijving_relatie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NatuurlijkPersoonV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NatuurlijkPersoonV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adellijke_titel_geslachtsnaam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adellijke_titel_geslachtsnaam"));
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
        elemField.setFieldName("adellijke_titel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adellijke_titel"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_conform_gba");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_conform_gba"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatie_partnerid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "relatie_partnerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving_relatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving_relatie"));
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
