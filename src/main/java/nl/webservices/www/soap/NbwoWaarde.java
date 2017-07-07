/**
 * NbwoWaarde.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NbwoWaarde  implements java.io.Serializable {
    private int waarde;

    private java.lang.String betrouwbaarheid;

    private java.util.Date datum_waardebepaling;

    private java.lang.String cultuurcode;

    private java.lang.String woningtype;

    private java.util.Date prijspeil_datum;

    private java.lang.String straat;

    private java.lang.Integer huisnummer;

    private java.lang.String huisnummer_toevoeging;

    private java.lang.String postcode;

    private java.lang.String plaats;

    private java.lang.Integer oppervlak;

    private java.lang.Integer inhoud;

    private java.lang.Integer bouwjaar;

    private java.lang.Integer grootte;

    private java.lang.Boolean garage;

    private java.lang.Boolean tuin;

    private java.lang.Boolean monument;

    private java.lang.Boolean schuur;

    private nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat postcode_model_resultaat;

    private nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat straat_model_resultaat;

    private nl.webservices.www.soap.NbwoVorigeVerkoopModelResultaat vorige_verkoop_model_resultaat;

    private nl.webservices.www.soap.NbwoKenmerkenModelResultaat kenmerken_model_resultaat;

    public NbwoWaarde() {
    }

    public NbwoWaarde(
           int waarde,
           java.lang.String betrouwbaarheid,
           java.util.Date datum_waardebepaling,
           java.lang.String cultuurcode,
           java.lang.String woningtype,
           java.util.Date prijspeil_datum,
           java.lang.String straat,
           java.lang.Integer huisnummer,
           java.lang.String huisnummer_toevoeging,
           java.lang.String postcode,
           java.lang.String plaats,
           java.lang.Integer oppervlak,
           java.lang.Integer inhoud,
           java.lang.Integer bouwjaar,
           java.lang.Integer grootte,
           java.lang.Boolean garage,
           java.lang.Boolean tuin,
           java.lang.Boolean monument,
           java.lang.Boolean schuur,
           nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat postcode_model_resultaat,
           nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat straat_model_resultaat,
           nl.webservices.www.soap.NbwoVorigeVerkoopModelResultaat vorige_verkoop_model_resultaat,
           nl.webservices.www.soap.NbwoKenmerkenModelResultaat kenmerken_model_resultaat) {
           this.waarde = waarde;
           this.betrouwbaarheid = betrouwbaarheid;
           this.datum_waardebepaling = datum_waardebepaling;
           this.cultuurcode = cultuurcode;
           this.woningtype = woningtype;
           this.prijspeil_datum = prijspeil_datum;
           this.straat = straat;
           this.huisnummer = huisnummer;
           this.huisnummer_toevoeging = huisnummer_toevoeging;
           this.postcode = postcode;
           this.plaats = plaats;
           this.oppervlak = oppervlak;
           this.inhoud = inhoud;
           this.bouwjaar = bouwjaar;
           this.grootte = grootte;
           this.garage = garage;
           this.tuin = tuin;
           this.monument = monument;
           this.schuur = schuur;
           this.postcode_model_resultaat = postcode_model_resultaat;
           this.straat_model_resultaat = straat_model_resultaat;
           this.vorige_verkoop_model_resultaat = vorige_verkoop_model_resultaat;
           this.kenmerken_model_resultaat = kenmerken_model_resultaat;
    }


    /**
     * Gets the waarde value for this NbwoWaarde.
     * 
     * @return waarde
     */
    public int getWaarde() {
        return waarde;
    }


    /**
     * Sets the waarde value for this NbwoWaarde.
     * 
     * @param waarde
     */
    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }


    /**
     * Gets the betrouwbaarheid value for this NbwoWaarde.
     * 
     * @return betrouwbaarheid
     */
    public java.lang.String getBetrouwbaarheid() {
        return betrouwbaarheid;
    }


    /**
     * Sets the betrouwbaarheid value for this NbwoWaarde.
     * 
     * @param betrouwbaarheid
     */
    public void setBetrouwbaarheid(java.lang.String betrouwbaarheid) {
        this.betrouwbaarheid = betrouwbaarheid;
    }


    /**
     * Gets the datum_waardebepaling value for this NbwoWaarde.
     * 
     * @return datum_waardebepaling
     */
    public java.util.Date getDatum_waardebepaling() {
        return datum_waardebepaling;
    }


    /**
     * Sets the datum_waardebepaling value for this NbwoWaarde.
     * 
     * @param datum_waardebepaling
     */
    public void setDatum_waardebepaling(java.util.Date datum_waardebepaling) {
        this.datum_waardebepaling = datum_waardebepaling;
    }


    /**
     * Gets the cultuurcode value for this NbwoWaarde.
     * 
     * @return cultuurcode
     */
    public java.lang.String getCultuurcode() {
        return cultuurcode;
    }


    /**
     * Sets the cultuurcode value for this NbwoWaarde.
     * 
     * @param cultuurcode
     */
    public void setCultuurcode(java.lang.String cultuurcode) {
        this.cultuurcode = cultuurcode;
    }


    /**
     * Gets the woningtype value for this NbwoWaarde.
     * 
     * @return woningtype
     */
    public java.lang.String getWoningtype() {
        return woningtype;
    }


    /**
     * Sets the woningtype value for this NbwoWaarde.
     * 
     * @param woningtype
     */
    public void setWoningtype(java.lang.String woningtype) {
        this.woningtype = woningtype;
    }


    /**
     * Gets the prijspeil_datum value for this NbwoWaarde.
     * 
     * @return prijspeil_datum
     */
    public java.util.Date getPrijspeil_datum() {
        return prijspeil_datum;
    }


    /**
     * Sets the prijspeil_datum value for this NbwoWaarde.
     * 
     * @param prijspeil_datum
     */
    public void setPrijspeil_datum(java.util.Date prijspeil_datum) {
        this.prijspeil_datum = prijspeil_datum;
    }


    /**
     * Gets the straat value for this NbwoWaarde.
     * 
     * @return straat
     */
    public java.lang.String getStraat() {
        return straat;
    }


    /**
     * Sets the straat value for this NbwoWaarde.
     * 
     * @param straat
     */
    public void setStraat(java.lang.String straat) {
        this.straat = straat;
    }


    /**
     * Gets the huisnummer value for this NbwoWaarde.
     * 
     * @return huisnummer
     */
    public java.lang.Integer getHuisnummer() {
        return huisnummer;
    }


    /**
     * Sets the huisnummer value for this NbwoWaarde.
     * 
     * @param huisnummer
     */
    public void setHuisnummer(java.lang.Integer huisnummer) {
        this.huisnummer = huisnummer;
    }


    /**
     * Gets the huisnummer_toevoeging value for this NbwoWaarde.
     * 
     * @return huisnummer_toevoeging
     */
    public java.lang.String getHuisnummer_toevoeging() {
        return huisnummer_toevoeging;
    }


    /**
     * Sets the huisnummer_toevoeging value for this NbwoWaarde.
     * 
     * @param huisnummer_toevoeging
     */
    public void setHuisnummer_toevoeging(java.lang.String huisnummer_toevoeging) {
        this.huisnummer_toevoeging = huisnummer_toevoeging;
    }


    /**
     * Gets the postcode value for this NbwoWaarde.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this NbwoWaarde.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the plaats value for this NbwoWaarde.
     * 
     * @return plaats
     */
    public java.lang.String getPlaats() {
        return plaats;
    }


    /**
     * Sets the plaats value for this NbwoWaarde.
     * 
     * @param plaats
     */
    public void setPlaats(java.lang.String plaats) {
        this.plaats = plaats;
    }


    /**
     * Gets the oppervlak value for this NbwoWaarde.
     * 
     * @return oppervlak
     */
    public java.lang.Integer getOppervlak() {
        return oppervlak;
    }


    /**
     * Sets the oppervlak value for this NbwoWaarde.
     * 
     * @param oppervlak
     */
    public void setOppervlak(java.lang.Integer oppervlak) {
        this.oppervlak = oppervlak;
    }


    /**
     * Gets the inhoud value for this NbwoWaarde.
     * 
     * @return inhoud
     */
    public java.lang.Integer getInhoud() {
        return inhoud;
    }


    /**
     * Sets the inhoud value for this NbwoWaarde.
     * 
     * @param inhoud
     */
    public void setInhoud(java.lang.Integer inhoud) {
        this.inhoud = inhoud;
    }


    /**
     * Gets the bouwjaar value for this NbwoWaarde.
     * 
     * @return bouwjaar
     */
    public java.lang.Integer getBouwjaar() {
        return bouwjaar;
    }


    /**
     * Sets the bouwjaar value for this NbwoWaarde.
     * 
     * @param bouwjaar
     */
    public void setBouwjaar(java.lang.Integer bouwjaar) {
        this.bouwjaar = bouwjaar;
    }


    /**
     * Gets the grootte value for this NbwoWaarde.
     * 
     * @return grootte
     */
    public java.lang.Integer getGrootte() {
        return grootte;
    }


    /**
     * Sets the grootte value for this NbwoWaarde.
     * 
     * @param grootte
     */
    public void setGrootte(java.lang.Integer grootte) {
        this.grootte = grootte;
    }


    /**
     * Gets the garage value for this NbwoWaarde.
     * 
     * @return garage
     */
    public java.lang.Boolean getGarage() {
        return garage;
    }


    /**
     * Sets the garage value for this NbwoWaarde.
     * 
     * @param garage
     */
    public void setGarage(java.lang.Boolean garage) {
        this.garage = garage;
    }


    /**
     * Gets the tuin value for this NbwoWaarde.
     * 
     * @return tuin
     */
    public java.lang.Boolean getTuin() {
        return tuin;
    }


    /**
     * Sets the tuin value for this NbwoWaarde.
     * 
     * @param tuin
     */
    public void setTuin(java.lang.Boolean tuin) {
        this.tuin = tuin;
    }


    /**
     * Gets the monument value for this NbwoWaarde.
     * 
     * @return monument
     */
    public java.lang.Boolean getMonument() {
        return monument;
    }


    /**
     * Sets the monument value for this NbwoWaarde.
     * 
     * @param monument
     */
    public void setMonument(java.lang.Boolean monument) {
        this.monument = monument;
    }


    /**
     * Gets the schuur value for this NbwoWaarde.
     * 
     * @return schuur
     */
    public java.lang.Boolean getSchuur() {
        return schuur;
    }


    /**
     * Sets the schuur value for this NbwoWaarde.
     * 
     * @param schuur
     */
    public void setSchuur(java.lang.Boolean schuur) {
        this.schuur = schuur;
    }


    /**
     * Gets the postcode_model_resultaat value for this NbwoWaarde.
     * 
     * @return postcode_model_resultaat
     */
    public nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat getPostcode_model_resultaat() {
        return postcode_model_resultaat;
    }


    /**
     * Sets the postcode_model_resultaat value for this NbwoWaarde.
     * 
     * @param postcode_model_resultaat
     */
    public void setPostcode_model_resultaat(nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat postcode_model_resultaat) {
        this.postcode_model_resultaat = postcode_model_resultaat;
    }


    /**
     * Gets the straat_model_resultaat value for this NbwoWaarde.
     * 
     * @return straat_model_resultaat
     */
    public nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat getStraat_model_resultaat() {
        return straat_model_resultaat;
    }


    /**
     * Sets the straat_model_resultaat value for this NbwoWaarde.
     * 
     * @param straat_model_resultaat
     */
    public void setStraat_model_resultaat(nl.webservices.www.soap.NbwoPostcodeStraatModelResultaat straat_model_resultaat) {
        this.straat_model_resultaat = straat_model_resultaat;
    }


    /**
     * Gets the vorige_verkoop_model_resultaat value for this NbwoWaarde.
     * 
     * @return vorige_verkoop_model_resultaat
     */
    public nl.webservices.www.soap.NbwoVorigeVerkoopModelResultaat getVorige_verkoop_model_resultaat() {
        return vorige_verkoop_model_resultaat;
    }


    /**
     * Sets the vorige_verkoop_model_resultaat value for this NbwoWaarde.
     * 
     * @param vorige_verkoop_model_resultaat
     */
    public void setVorige_verkoop_model_resultaat(nl.webservices.www.soap.NbwoVorigeVerkoopModelResultaat vorige_verkoop_model_resultaat) {
        this.vorige_verkoop_model_resultaat = vorige_verkoop_model_resultaat;
    }


    /**
     * Gets the kenmerken_model_resultaat value for this NbwoWaarde.
     * 
     * @return kenmerken_model_resultaat
     */
    public nl.webservices.www.soap.NbwoKenmerkenModelResultaat getKenmerken_model_resultaat() {
        return kenmerken_model_resultaat;
    }


    /**
     * Sets the kenmerken_model_resultaat value for this NbwoWaarde.
     * 
     * @param kenmerken_model_resultaat
     */
    public void setKenmerken_model_resultaat(nl.webservices.www.soap.NbwoKenmerkenModelResultaat kenmerken_model_resultaat) {
        this.kenmerken_model_resultaat = kenmerken_model_resultaat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbwoWaarde)) return false;
        NbwoWaarde other = (NbwoWaarde) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.waarde == other.getWaarde() &&
            ((this.betrouwbaarheid==null && other.getBetrouwbaarheid()==null) || 
             (this.betrouwbaarheid!=null &&
              this.betrouwbaarheid.equals(other.getBetrouwbaarheid()))) &&
            ((this.datum_waardebepaling==null && other.getDatum_waardebepaling()==null) || 
             (this.datum_waardebepaling!=null &&
              this.datum_waardebepaling.equals(other.getDatum_waardebepaling()))) &&
            ((this.cultuurcode==null && other.getCultuurcode()==null) || 
             (this.cultuurcode!=null &&
              this.cultuurcode.equals(other.getCultuurcode()))) &&
            ((this.woningtype==null && other.getWoningtype()==null) || 
             (this.woningtype!=null &&
              this.woningtype.equals(other.getWoningtype()))) &&
            ((this.prijspeil_datum==null && other.getPrijspeil_datum()==null) || 
             (this.prijspeil_datum!=null &&
              this.prijspeil_datum.equals(other.getPrijspeil_datum()))) &&
            ((this.straat==null && other.getStraat()==null) || 
             (this.straat!=null &&
              this.straat.equals(other.getStraat()))) &&
            ((this.huisnummer==null && other.getHuisnummer()==null) || 
             (this.huisnummer!=null &&
              this.huisnummer.equals(other.getHuisnummer()))) &&
            ((this.huisnummer_toevoeging==null && other.getHuisnummer_toevoeging()==null) || 
             (this.huisnummer_toevoeging!=null &&
              this.huisnummer_toevoeging.equals(other.getHuisnummer_toevoeging()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.plaats==null && other.getPlaats()==null) || 
             (this.plaats!=null &&
              this.plaats.equals(other.getPlaats()))) &&
            ((this.oppervlak==null && other.getOppervlak()==null) || 
             (this.oppervlak!=null &&
              this.oppervlak.equals(other.getOppervlak()))) &&
            ((this.inhoud==null && other.getInhoud()==null) || 
             (this.inhoud!=null &&
              this.inhoud.equals(other.getInhoud()))) &&
            ((this.bouwjaar==null && other.getBouwjaar()==null) || 
             (this.bouwjaar!=null &&
              this.bouwjaar.equals(other.getBouwjaar()))) &&
            ((this.grootte==null && other.getGrootte()==null) || 
             (this.grootte!=null &&
              this.grootte.equals(other.getGrootte()))) &&
            ((this.garage==null && other.getGarage()==null) || 
             (this.garage!=null &&
              this.garage.equals(other.getGarage()))) &&
            ((this.tuin==null && other.getTuin()==null) || 
             (this.tuin!=null &&
              this.tuin.equals(other.getTuin()))) &&
            ((this.monument==null && other.getMonument()==null) || 
             (this.monument!=null &&
              this.monument.equals(other.getMonument()))) &&
            ((this.schuur==null && other.getSchuur()==null) || 
             (this.schuur!=null &&
              this.schuur.equals(other.getSchuur()))) &&
            ((this.postcode_model_resultaat==null && other.getPostcode_model_resultaat()==null) || 
             (this.postcode_model_resultaat!=null &&
              this.postcode_model_resultaat.equals(other.getPostcode_model_resultaat()))) &&
            ((this.straat_model_resultaat==null && other.getStraat_model_resultaat()==null) || 
             (this.straat_model_resultaat!=null &&
              this.straat_model_resultaat.equals(other.getStraat_model_resultaat()))) &&
            ((this.vorige_verkoop_model_resultaat==null && other.getVorige_verkoop_model_resultaat()==null) || 
             (this.vorige_verkoop_model_resultaat!=null &&
              this.vorige_verkoop_model_resultaat.equals(other.getVorige_verkoop_model_resultaat()))) &&
            ((this.kenmerken_model_resultaat==null && other.getKenmerken_model_resultaat()==null) || 
             (this.kenmerken_model_resultaat!=null &&
              this.kenmerken_model_resultaat.equals(other.getKenmerken_model_resultaat())));
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
        _hashCode += getWaarde();
        if (getBetrouwbaarheid() != null) {
            _hashCode += getBetrouwbaarheid().hashCode();
        }
        if (getDatum_waardebepaling() != null) {
            _hashCode += getDatum_waardebepaling().hashCode();
        }
        if (getCultuurcode() != null) {
            _hashCode += getCultuurcode().hashCode();
        }
        if (getWoningtype() != null) {
            _hashCode += getWoningtype().hashCode();
        }
        if (getPrijspeil_datum() != null) {
            _hashCode += getPrijspeil_datum().hashCode();
        }
        if (getStraat() != null) {
            _hashCode += getStraat().hashCode();
        }
        if (getHuisnummer() != null) {
            _hashCode += getHuisnummer().hashCode();
        }
        if (getHuisnummer_toevoeging() != null) {
            _hashCode += getHuisnummer_toevoeging().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getPlaats() != null) {
            _hashCode += getPlaats().hashCode();
        }
        if (getOppervlak() != null) {
            _hashCode += getOppervlak().hashCode();
        }
        if (getInhoud() != null) {
            _hashCode += getInhoud().hashCode();
        }
        if (getBouwjaar() != null) {
            _hashCode += getBouwjaar().hashCode();
        }
        if (getGrootte() != null) {
            _hashCode += getGrootte().hashCode();
        }
        if (getGarage() != null) {
            _hashCode += getGarage().hashCode();
        }
        if (getTuin() != null) {
            _hashCode += getTuin().hashCode();
        }
        if (getMonument() != null) {
            _hashCode += getMonument().hashCode();
        }
        if (getSchuur() != null) {
            _hashCode += getSchuur().hashCode();
        }
        if (getPostcode_model_resultaat() != null) {
            _hashCode += getPostcode_model_resultaat().hashCode();
        }
        if (getStraat_model_resultaat() != null) {
            _hashCode += getStraat_model_resultaat().hashCode();
        }
        if (getVorige_verkoop_model_resultaat() != null) {
            _hashCode += getVorige_verkoop_model_resultaat().hashCode();
        }
        if (getKenmerken_model_resultaat() != null) {
            _hashCode += getKenmerken_model_resultaat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NbwoWaarde.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoWaarde"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waarde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "waarde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betrouwbaarheid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "betrouwbaarheid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_waardebepaling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_waardebepaling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cultuurcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cultuurcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("woningtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "woningtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prijspeil_datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prijspeil_datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("straat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "straat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("huisnummer_toevoeging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "huisnummer_toevoeging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "plaats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oppervlak");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "oppervlak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inhoud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "inhoud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouwjaar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bouwjaar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grootte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "grootte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("garage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "garage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "tuin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "monument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schuur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "schuur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode_model_resultaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode_model_resultaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoPostcodeStraatModelResultaat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("straat_model_resultaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "straat_model_resultaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoPostcodeStraatModelResultaat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorige_verkoop_model_resultaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vorige_verkoop_model_resultaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoVorigeVerkoopModelResultaat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kenmerken_model_resultaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kenmerken_model_resultaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoKenmerkenModelResultaat"));
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
