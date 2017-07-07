/**
 * KadasterStukdeel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterStukdeel  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String aard_stukdeel_omschrijving;

    private nl.webservices.www.soap.KadasterHypotheek hypotheek;

    private nl.webservices.www.soap.KadasterPersoonLijst schuldeisers_beslagleggers;

    private nl.webservices.www.soap.KadasterBedrag vordering;

    private nl.webservices.www.soap.KadasterStukdeelRecht[] rechten;

    private nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak[] onroerende_zaken;

    private java.lang.String omschrijving;

    private nl.webservices.www.soap.KadasterStukdeelReferentiesLijst stukdeel_relaties;

    private nl.webservices.www.soap.KadasterGerelateerdStukdeel[] hoort_bij;

    public KadasterStukdeel() {
    }

    public KadasterStukdeel(
           java.lang.String id,
           java.lang.String aard_stukdeel_omschrijving,
           nl.webservices.www.soap.KadasterHypotheek hypotheek,
           nl.webservices.www.soap.KadasterPersoonLijst schuldeisers_beslagleggers,
           nl.webservices.www.soap.KadasterBedrag vordering,
           nl.webservices.www.soap.KadasterStukdeelRecht[] rechten,
           nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak[] onroerende_zaken,
           java.lang.String omschrijving,
           nl.webservices.www.soap.KadasterStukdeelReferentiesLijst stukdeel_relaties,
           nl.webservices.www.soap.KadasterGerelateerdStukdeel[] hoort_bij) {
           this.id = id;
           this.aard_stukdeel_omschrijving = aard_stukdeel_omschrijving;
           this.hypotheek = hypotheek;
           this.schuldeisers_beslagleggers = schuldeisers_beslagleggers;
           this.vordering = vordering;
           this.rechten = rechten;
           this.onroerende_zaken = onroerende_zaken;
           this.omschrijving = omschrijving;
           this.stukdeel_relaties = stukdeel_relaties;
           this.hoort_bij = hoort_bij;
    }


    /**
     * Gets the id value for this KadasterStukdeel.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this KadasterStukdeel.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the aard_stukdeel_omschrijving value for this KadasterStukdeel.
     * 
     * @return aard_stukdeel_omschrijving
     */
    public java.lang.String getAard_stukdeel_omschrijving() {
        return aard_stukdeel_omschrijving;
    }


    /**
     * Sets the aard_stukdeel_omschrijving value for this KadasterStukdeel.
     * 
     * @param aard_stukdeel_omschrijving
     */
    public void setAard_stukdeel_omschrijving(java.lang.String aard_stukdeel_omschrijving) {
        this.aard_stukdeel_omschrijving = aard_stukdeel_omschrijving;
    }


    /**
     * Gets the hypotheek value for this KadasterStukdeel.
     * 
     * @return hypotheek
     */
    public nl.webservices.www.soap.KadasterHypotheek getHypotheek() {
        return hypotheek;
    }


    /**
     * Sets the hypotheek value for this KadasterStukdeel.
     * 
     * @param hypotheek
     */
    public void setHypotheek(nl.webservices.www.soap.KadasterHypotheek hypotheek) {
        this.hypotheek = hypotheek;
    }


    /**
     * Gets the schuldeisers_beslagleggers value for this KadasterStukdeel.
     * 
     * @return schuldeisers_beslagleggers
     */
    public nl.webservices.www.soap.KadasterPersoonLijst getSchuldeisers_beslagleggers() {
        return schuldeisers_beslagleggers;
    }


    /**
     * Sets the schuldeisers_beslagleggers value for this KadasterStukdeel.
     * 
     * @param schuldeisers_beslagleggers
     */
    public void setSchuldeisers_beslagleggers(nl.webservices.www.soap.KadasterPersoonLijst schuldeisers_beslagleggers) {
        this.schuldeisers_beslagleggers = schuldeisers_beslagleggers;
    }


    /**
     * Gets the vordering value for this KadasterStukdeel.
     * 
     * @return vordering
     */
    public nl.webservices.www.soap.KadasterBedrag getVordering() {
        return vordering;
    }


    /**
     * Sets the vordering value for this KadasterStukdeel.
     * 
     * @param vordering
     */
    public void setVordering(nl.webservices.www.soap.KadasterBedrag vordering) {
        this.vordering = vordering;
    }


    /**
     * Gets the rechten value for this KadasterStukdeel.
     * 
     * @return rechten
     */
    public nl.webservices.www.soap.KadasterStukdeelRecht[] getRechten() {
        return rechten;
    }


    /**
     * Sets the rechten value for this KadasterStukdeel.
     * 
     * @param rechten
     */
    public void setRechten(nl.webservices.www.soap.KadasterStukdeelRecht[] rechten) {
        this.rechten = rechten;
    }


    /**
     * Gets the onroerende_zaken value for this KadasterStukdeel.
     * 
     * @return onroerende_zaken
     */
    public nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak[] getOnroerende_zaken() {
        return onroerende_zaken;
    }


    /**
     * Sets the onroerende_zaken value for this KadasterStukdeel.
     * 
     * @param onroerende_zaken
     */
    public void setOnroerende_zaken(nl.webservices.www.soap.KadasterBeknoptOnroerendeZaak[] onroerende_zaken) {
        this.onroerende_zaken = onroerende_zaken;
    }


    /**
     * Gets the omschrijving value for this KadasterStukdeel.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this KadasterStukdeel.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the stukdeel_relaties value for this KadasterStukdeel.
     * 
     * @return stukdeel_relaties
     */
    public nl.webservices.www.soap.KadasterStukdeelReferentiesLijst getStukdeel_relaties() {
        return stukdeel_relaties;
    }


    /**
     * Sets the stukdeel_relaties value for this KadasterStukdeel.
     * 
     * @param stukdeel_relaties
     */
    public void setStukdeel_relaties(nl.webservices.www.soap.KadasterStukdeelReferentiesLijst stukdeel_relaties) {
        this.stukdeel_relaties = stukdeel_relaties;
    }


    /**
     * Gets the hoort_bij value for this KadasterStukdeel.
     * 
     * @return hoort_bij
     */
    public nl.webservices.www.soap.KadasterGerelateerdStukdeel[] getHoort_bij() {
        return hoort_bij;
    }


    /**
     * Sets the hoort_bij value for this KadasterStukdeel.
     * 
     * @param hoort_bij
     */
    public void setHoort_bij(nl.webservices.www.soap.KadasterGerelateerdStukdeel[] hoort_bij) {
        this.hoort_bij = hoort_bij;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterStukdeel)) return false;
        KadasterStukdeel other = (KadasterStukdeel) obj;
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
            ((this.aard_stukdeel_omschrijving==null && other.getAard_stukdeel_omschrijving()==null) || 
             (this.aard_stukdeel_omschrijving!=null &&
              this.aard_stukdeel_omschrijving.equals(other.getAard_stukdeel_omschrijving()))) &&
            ((this.hypotheek==null && other.getHypotheek()==null) || 
             (this.hypotheek!=null &&
              this.hypotheek.equals(other.getHypotheek()))) &&
            ((this.schuldeisers_beslagleggers==null && other.getSchuldeisers_beslagleggers()==null) || 
             (this.schuldeisers_beslagleggers!=null &&
              this.schuldeisers_beslagleggers.equals(other.getSchuldeisers_beslagleggers()))) &&
            ((this.vordering==null && other.getVordering()==null) || 
             (this.vordering!=null &&
              this.vordering.equals(other.getVordering()))) &&
            ((this.rechten==null && other.getRechten()==null) || 
             (this.rechten!=null &&
              java.util.Arrays.equals(this.rechten, other.getRechten()))) &&
            ((this.onroerende_zaken==null && other.getOnroerende_zaken()==null) || 
             (this.onroerende_zaken!=null &&
              java.util.Arrays.equals(this.onroerende_zaken, other.getOnroerende_zaken()))) &&
            ((this.omschrijving==null && other.getOmschrijving()==null) || 
             (this.omschrijving!=null &&
              this.omschrijving.equals(other.getOmschrijving()))) &&
            ((this.stukdeel_relaties==null && other.getStukdeel_relaties()==null) || 
             (this.stukdeel_relaties!=null &&
              this.stukdeel_relaties.equals(other.getStukdeel_relaties()))) &&
            ((this.hoort_bij==null && other.getHoort_bij()==null) || 
             (this.hoort_bij!=null &&
              java.util.Arrays.equals(this.hoort_bij, other.getHoort_bij())));
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
        if (getAard_stukdeel_omschrijving() != null) {
            _hashCode += getAard_stukdeel_omschrijving().hashCode();
        }
        if (getHypotheek() != null) {
            _hashCode += getHypotheek().hashCode();
        }
        if (getSchuldeisers_beslagleggers() != null) {
            _hashCode += getSchuldeisers_beslagleggers().hashCode();
        }
        if (getVordering() != null) {
            _hashCode += getVordering().hashCode();
        }
        if (getRechten() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechten());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRechten(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnroerende_zaken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnroerende_zaken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnroerende_zaken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOmschrijving() != null) {
            _hashCode += getOmschrijving().hashCode();
        }
        if (getStukdeel_relaties() != null) {
            _hashCode += getStukdeel_relaties().hashCode();
        }
        if (getHoort_bij() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHoort_bij());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHoort_bij(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterStukdeel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterStukdeel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aard_stukdeel_omschrijving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aard_stukdeel_omschrijving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hypotheek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hypotheek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypotheek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schuldeisers_beslagleggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "schuldeisers_beslagleggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterPersoonLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vordering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBedrag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechten");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rechten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterStukdeelRecht"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onroerende_zaken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "onroerende_zaken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBeknoptOnroerendeZaak"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stukdeel_relaties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stukdeel_relaties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterStukdeelReferentiesLijst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoort_bij");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hoort_bij"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterGerelateerdStukdeel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
