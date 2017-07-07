/**
 * OnroerendeZaak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class OnroerendeZaak  implements java.io.Serializable {
    private java.lang.String object_id;

    private nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding;

    private java.lang.String omschrijving;

    private nl.webservices.www.soap.LocatieBinnenlandLijst locaties;

    private java.util.Date datum_ontstaan;

    private nl.webservices.www.soap.KadastraleAanduidingLijst onroerende_zaak_historie;

    private nl.webservices.www.soap.PerceelDetails perceel_details;

    private java.lang.String koopsom;

    private java.lang.String koopjaar;

    private boolean indicatie_meer_onroerende_zaken;

    private nl.webservices.www.soap.Landinrichtingsrente landinrichtingsrente;

    private boolean indicatie_voorgenomen_splitsing;

    private boolean indicatie_voorlopige_aantekening;

    private nl.webservices.www.soap.StukReferentiesLijst niet_volledig_verwerkt_stukken_lijst;

    private nl.webservices.www.soap.Mandeligheid mandeligheid;

    private nl.webservices.www.soap.AantekeningenKadastraalObject aantekeningen_kadastraal_object;

    private nl.webservices.www.soap.PRBeperkingenKadastraalObject pr_beperkingen_kadastraal_object;

    public OnroerendeZaak() {
    }

    public OnroerendeZaak(
           java.lang.String object_id,
           nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding,
           java.lang.String omschrijving,
           nl.webservices.www.soap.LocatieBinnenlandLijst locaties,
           java.util.Date datum_ontstaan,
           nl.webservices.www.soap.KadastraleAanduidingLijst onroerende_zaak_historie,
           nl.webservices.www.soap.PerceelDetails perceel_details,
           java.lang.String koopsom,
           java.lang.String koopjaar,
           boolean indicatie_meer_onroerende_zaken,
           nl.webservices.www.soap.Landinrichtingsrente landinrichtingsrente,
           boolean indicatie_voorgenomen_splitsing,
           boolean indicatie_voorlopige_aantekening,
           nl.webservices.www.soap.StukReferentiesLijst niet_volledig_verwerkt_stukken_lijst,
           nl.webservices.www.soap.Mandeligheid mandeligheid,
           nl.webservices.www.soap.AantekeningenKadastraalObject aantekeningen_kadastraal_object,
           nl.webservices.www.soap.PRBeperkingenKadastraalObject pr_beperkingen_kadastraal_object) {
           this.object_id = object_id;
           this.kadastrale_aanduiding = kadastrale_aanduiding;
           this.omschrijving = omschrijving;
           this.locaties = locaties;
           this.datum_ontstaan = datum_ontstaan;
           this.onroerende_zaak_historie = onroerende_zaak_historie;
           this.perceel_details = perceel_details;
           this.koopsom = koopsom;
           this.koopjaar = koopjaar;
           this.indicatie_meer_onroerende_zaken = indicatie_meer_onroerende_zaken;
           this.landinrichtingsrente = landinrichtingsrente;
           this.indicatie_voorgenomen_splitsing = indicatie_voorgenomen_splitsing;
           this.indicatie_voorlopige_aantekening = indicatie_voorlopige_aantekening;
           this.niet_volledig_verwerkt_stukken_lijst = niet_volledig_verwerkt_stukken_lijst;
           this.mandeligheid = mandeligheid;
           this.aantekeningen_kadastraal_object = aantekeningen_kadastraal_object;
           this.pr_beperkingen_kadastraal_object = pr_beperkingen_kadastraal_object;
    }


    /**
     * Gets the object_id value for this OnroerendeZaak.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this OnroerendeZaak.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the kadastrale_aanduiding value for this OnroerendeZaak.
     * 
     * @return kadastrale_aanduiding
     */
    public nl.webservices.www.soap.KadastraleAanduiding getKadastrale_aanduiding() {
        return kadastrale_aanduiding;
    }


    /**
     * Sets the kadastrale_aanduiding value for this OnroerendeZaak.
     * 
     * @param kadastrale_aanduiding
     */
    public void setKadastrale_aanduiding(nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding) {
        this.kadastrale_aanduiding = kadastrale_aanduiding;
    }


    /**
     * Gets the omschrijving value for this OnroerendeZaak.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this OnroerendeZaak.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the locaties value for this OnroerendeZaak.
     * 
     * @return locaties
     */
    public nl.webservices.www.soap.LocatieBinnenlandLijst getLocaties() {
        return locaties;
    }


    /**
     * Sets the locaties value for this OnroerendeZaak.
     * 
     * @param locaties
     */
    public void setLocaties(nl.webservices.www.soap.LocatieBinnenlandLijst locaties) {
        this.locaties = locaties;
    }


    /**
     * Gets the datum_ontstaan value for this OnroerendeZaak.
     * 
     * @return datum_ontstaan
     */
    public java.util.Date getDatum_ontstaan() {
        return datum_ontstaan;
    }


    /**
     * Sets the datum_ontstaan value for this OnroerendeZaak.
     * 
     * @param datum_ontstaan
     */
    public void setDatum_ontstaan(java.util.Date datum_ontstaan) {
        this.datum_ontstaan = datum_ontstaan;
    }


    /**
     * Gets the onroerende_zaak_historie value for this OnroerendeZaak.
     * 
     * @return onroerende_zaak_historie
     */
    public nl.webservices.www.soap.KadastraleAanduidingLijst getOnroerende_zaak_historie() {
        return onroerende_zaak_historie;
    }


    /**
     * Sets the onroerende_zaak_historie value for this OnroerendeZaak.
     * 
     * @param onroerende_zaak_historie
     */
    public void setOnroerende_zaak_historie(nl.webservices.www.soap.KadastraleAanduidingLijst onroerende_zaak_historie) {
        this.onroerende_zaak_historie = onroerende_zaak_historie;
    }


    /**
     * Gets the perceel_details value for this OnroerendeZaak.
     * 
     * @return perceel_details
     */
    public nl.webservices.www.soap.PerceelDetails getPerceel_details() {
        return perceel_details;
    }


    /**
     * Sets the perceel_details value for this OnroerendeZaak.
     * 
     * @param perceel_details
     */
    public void setPerceel_details(nl.webservices.www.soap.PerceelDetails perceel_details) {
        this.perceel_details = perceel_details;
    }


    /**
     * Gets the koopsom value for this OnroerendeZaak.
     * 
     * @return koopsom
     */
    public java.lang.String getKoopsom() {
        return koopsom;
    }


    /**
     * Sets the koopsom value for this OnroerendeZaak.
     * 
     * @param koopsom
     */
    public void setKoopsom(java.lang.String koopsom) {
        this.koopsom = koopsom;
    }


    /**
     * Gets the koopjaar value for this OnroerendeZaak.
     * 
     * @return koopjaar
     */
    public java.lang.String getKoopjaar() {
        return koopjaar;
    }


    /**
     * Sets the koopjaar value for this OnroerendeZaak.
     * 
     * @param koopjaar
     */
    public void setKoopjaar(java.lang.String koopjaar) {
        this.koopjaar = koopjaar;
    }


    /**
     * Gets the indicatie_meer_onroerende_zaken value for this OnroerendeZaak.
     * 
     * @return indicatie_meer_onroerende_zaken
     */
    public boolean isIndicatie_meer_onroerende_zaken() {
        return indicatie_meer_onroerende_zaken;
    }


    /**
     * Sets the indicatie_meer_onroerende_zaken value for this OnroerendeZaak.
     * 
     * @param indicatie_meer_onroerende_zaken
     */
    public void setIndicatie_meer_onroerende_zaken(boolean indicatie_meer_onroerende_zaken) {
        this.indicatie_meer_onroerende_zaken = indicatie_meer_onroerende_zaken;
    }


    /**
     * Gets the landinrichtingsrente value for this OnroerendeZaak.
     * 
     * @return landinrichtingsrente
     */
    public nl.webservices.www.soap.Landinrichtingsrente getLandinrichtingsrente() {
        return landinrichtingsrente;
    }


    /**
     * Sets the landinrichtingsrente value for this OnroerendeZaak.
     * 
     * @param landinrichtingsrente
     */
    public void setLandinrichtingsrente(nl.webservices.www.soap.Landinrichtingsrente landinrichtingsrente) {
        this.landinrichtingsrente = landinrichtingsrente;
    }


    /**
     * Gets the indicatie_voorgenomen_splitsing value for this OnroerendeZaak.
     * 
     * @return indicatie_voorgenomen_splitsing
     */
    public boolean isIndicatie_voorgenomen_splitsing() {
        return indicatie_voorgenomen_splitsing;
    }


    /**
     * Sets the indicatie_voorgenomen_splitsing value for this OnroerendeZaak.
     * 
     * @param indicatie_voorgenomen_splitsing
     */
    public void setIndicatie_voorgenomen_splitsing(boolean indicatie_voorgenomen_splitsing) {
        this.indicatie_voorgenomen_splitsing = indicatie_voorgenomen_splitsing;
    }


    /**
     * Gets the indicatie_voorlopige_aantekening value for this OnroerendeZaak.
     * 
     * @return indicatie_voorlopige_aantekening
     */
    public boolean isIndicatie_voorlopige_aantekening() {
        return indicatie_voorlopige_aantekening;
    }


    /**
     * Sets the indicatie_voorlopige_aantekening value for this OnroerendeZaak.
     * 
     * @param indicatie_voorlopige_aantekening
     */
    public void setIndicatie_voorlopige_aantekening(boolean indicatie_voorlopige_aantekening) {
        this.indicatie_voorlopige_aantekening = indicatie_voorlopige_aantekening;
    }


    /**
     * Gets the niet_volledig_verwerkt_stukken_lijst value for this OnroerendeZaak.
     * 
     * @return niet_volledig_verwerkt_stukken_lijst
     */
    public nl.webservices.www.soap.StukReferentiesLijst getNiet_volledig_verwerkt_stukken_lijst() {
        return niet_volledig_verwerkt_stukken_lijst;
    }


    /**
     * Sets the niet_volledig_verwerkt_stukken_lijst value for this OnroerendeZaak.
     * 
     * @param niet_volledig_verwerkt_stukken_lijst
     */
    public void setNiet_volledig_verwerkt_stukken_lijst(nl.webservices.www.soap.StukReferentiesLijst niet_volledig_verwerkt_stukken_lijst) {
        this.niet_volledig_verwerkt_stukken_lijst = niet_volledig_verwerkt_stukken_lijst;
    }


    /**
     * Gets the mandeligheid value for this OnroerendeZaak.
     * 
     * @return mandeligheid
     */
    public nl.webservices.www.soap.Mandeligheid getMandeligheid() {
        return mandeligheid;
    }


    /**
     * Sets the mandeligheid value for this OnroerendeZaak.
     * 
     * @param mandeligheid
     */
    public void setMandeligheid(nl.webservices.www.soap.Mandeligheid mandeligheid) {
        this.mandeligheid = mandeligheid;
    }


    /**
     * Gets the aantekeningen_kadastraal_object value for this OnroerendeZaak.
     * 
     * @return aantekeningen_kadastraal_object
     */
    public nl.webservices.www.soap.AantekeningenKadastraalObject getAantekeningen_kadastraal_object() {
        return aantekeningen_kadastraal_object;
    }


    /**
     * Sets the aantekeningen_kadastraal_object value for this OnroerendeZaak.
     * 
     * @param aantekeningen_kadastraal_object
     */
    public void setAantekeningen_kadastraal_object(nl.webservices.www.soap.AantekeningenKadastraalObject aantekeningen_kadastraal_object) {
        this.aantekeningen_kadastraal_object = aantekeningen_kadastraal_object;
    }


    /**
     * Gets the pr_beperkingen_kadastraal_object value for this OnroerendeZaak.
     * 
     * @return pr_beperkingen_kadastraal_object
     */
    public nl.webservices.www.soap.PRBeperkingenKadastraalObject getPr_beperkingen_kadastraal_object() {
        return pr_beperkingen_kadastraal_object;
    }


    /**
     * Sets the pr_beperkingen_kadastraal_object value for this OnroerendeZaak.
     * 
     * @param pr_beperkingen_kadastraal_object
     */
    public void setPr_beperkingen_kadastraal_object(nl.webservices.www.soap.PRBeperkingenKadastraalObject pr_beperkingen_kadastraal_object) {
        this.pr_beperkingen_kadastraal_object = pr_beperkingen_kadastraal_object;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnroerendeZaak)) return false;
        OnroerendeZaak other = (OnroerendeZaak) obj;
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
            ((this.omschrijving==null && other.getOmschrijving()==null) || 
             (this.omschrijving!=null &&
              this.omschrijving.equals(other.getOmschrijving()))) &&
            ((this.locaties==null && other.getLocaties()==null) || 
             (this.locaties!=null &&
              this.locaties.equals(other.getLocaties()))) &&
            ((this.datum_ontstaan==null && other.getDatum_ontstaan()==null) || 
             (this.datum_ontstaan!=null &&
              this.datum_ontstaan.equals(other.getDatum_ontstaan()))) &&
            ((this.onroerende_zaak_historie==null && other.getOnroerende_zaak_historie()==null) || 
             (this.onroerende_zaak_historie!=null &&
              this.onroerende_zaak_historie.equals(other.getOnroerende_zaak_historie()))) &&
            ((this.perceel_details==null && other.getPerceel_details()==null) || 
             (this.perceel_details!=null &&
              this.perceel_details.equals(other.getPerceel_details()))) &&
            ((this.koopsom==null && other.getKoopsom()==null) || 
             (this.koopsom!=null &&
              this.koopsom.equals(other.getKoopsom()))) &&
            ((this.koopjaar==null && other.getKoopjaar()==null) || 
             (this.koopjaar!=null &&
              this.koopjaar.equals(other.getKoopjaar()))) &&
            this.indicatie_meer_onroerende_zaken == other.isIndicatie_meer_onroerende_zaken() &&
            ((this.landinrichtingsrente==null && other.getLandinrichtingsrente()==null) || 
             (this.landinrichtingsrente!=null &&
              this.landinrichtingsrente.equals(other.getLandinrichtingsrente()))) &&
            this.indicatie_voorgenomen_splitsing == other.isIndicatie_voorgenomen_splitsing() &&
            this.indicatie_voorlopige_aantekening == other.isIndicatie_voorlopige_aantekening() &&
            ((this.niet_volledig_verwerkt_stukken_lijst==null && other.getNiet_volledig_verwerkt_stukken_lijst()==null) || 
             (this.niet_volledig_verwerkt_stukken_lijst!=null &&
              this.niet_volledig_verwerkt_stukken_lijst.equals(other.getNiet_volledig_verwerkt_stukken_lijst()))) &&
            ((this.mandeligheid==null && other.getMandeligheid()==null) || 
             (this.mandeligheid!=null &&
              this.mandeligheid.equals(other.getMandeligheid()))) &&
            ((this.aantekeningen_kadastraal_object==null && other.getAantekeningen_kadastraal_object()==null) || 
             (this.aantekeningen_kadastraal_object!=null &&
              this.aantekeningen_kadastraal_object.equals(other.getAantekeningen_kadastraal_object()))) &&
            ((this.pr_beperkingen_kadastraal_object==null && other.getPr_beperkingen_kadastraal_object()==null) || 
             (this.pr_beperkingen_kadastraal_object!=null &&
              this.pr_beperkingen_kadastraal_object.equals(other.getPr_beperkingen_kadastraal_object())));
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
        if (getOmschrijving() != null) {
            _hashCode += getOmschrijving().hashCode();
        }
        if (getLocaties() != null) {
            _hashCode += getLocaties().hashCode();
        }
        if (getDatum_ontstaan() != null) {
            _hashCode += getDatum_ontstaan().hashCode();
        }
        if (getOnroerende_zaak_historie() != null) {
            _hashCode += getOnroerende_zaak_historie().hashCode();
        }
        if (getPerceel_details() != null) {
            _hashCode += getPerceel_details().hashCode();
        }
        if (getKoopsom() != null) {
            _hashCode += getKoopsom().hashCode();
        }
        if (getKoopjaar() != null) {
            _hashCode += getKoopjaar().hashCode();
        }
        _hashCode += (isIndicatie_meer_onroerende_zaken() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLandinrichtingsrente() != null) {
            _hashCode += getLandinrichtingsrente().hashCode();
        }
        _hashCode += (isIndicatie_voorgenomen_splitsing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndicatie_voorlopige_aantekening() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNiet_volledig_verwerkt_stukken_lijst() != null) {
            _hashCode += getNiet_volledig_verwerkt_stukken_lijst().hashCode();
        }
        if (getMandeligheid() != null) {
            _hashCode += getMandeligheid().hashCode();
        }
        if (getAantekeningen_kadastraal_object() != null) {
            _hashCode += getAantekeningen_kadastraal_object().hashCode();
        }
        if (getPr_beperkingen_kadastraal_object() != null) {
            _hashCode += getPr_beperkingen_kadastraal_object().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnroerendeZaak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OnroerendeZaak"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_aanduiding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_aanduiding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduiding"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locaties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locaties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBinnenlandLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_ontstaan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_ontstaan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onroerende_zaak_historie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "onroerende_zaak_historie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduidingLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perceel_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "perceel_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PerceelDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopsom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopsom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopjaar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopjaar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_meer_onroerende_zaken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_meer_onroerende_zaken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landinrichtingsrente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "landinrichtingsrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Landinrichtingsrente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_voorgenomen_splitsing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_voorgenomen_splitsing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_voorlopige_aantekening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_voorlopige_aantekening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("mandeligheid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mandeligheid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Mandeligheid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantekeningen_kadastraal_object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantekeningen_kadastraal_object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "AantekeningenKadastraalObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pr_beperkingen_kadastraal_object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pr_beperkingen_kadastraal_object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PRBeperkingenKadastraalObject"));
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
