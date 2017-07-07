/**
 * KadasterHypotheekStuk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterHypotheekStuk  implements java.io.Serializable {
    private nl.webservices.www.soap.Stuk stuk;

    private nl.webservices.www.soap.KadasterStukdeel[] stukdelen;

    private java.lang.String datum_aanbieding;

    private java.lang.String datum_ondertekening;

    private java.lang.String omschrijving;

    private java.lang.Boolean rectificatie_verzocht;

    private java.lang.Boolean eenzijdig_opzegbaar;

    private java.lang.Boolean gefiatteerd;

    public KadasterHypotheekStuk() {
    }

    public KadasterHypotheekStuk(
           nl.webservices.www.soap.Stuk stuk,
           nl.webservices.www.soap.KadasterStukdeel[] stukdelen,
           java.lang.String datum_aanbieding,
           java.lang.String datum_ondertekening,
           java.lang.String omschrijving,
           java.lang.Boolean rectificatie_verzocht,
           java.lang.Boolean eenzijdig_opzegbaar,
           java.lang.Boolean gefiatteerd) {
           this.stuk = stuk;
           this.stukdelen = stukdelen;
           this.datum_aanbieding = datum_aanbieding;
           this.datum_ondertekening = datum_ondertekening;
           this.omschrijving = omschrijving;
           this.rectificatie_verzocht = rectificatie_verzocht;
           this.eenzijdig_opzegbaar = eenzijdig_opzegbaar;
           this.gefiatteerd = gefiatteerd;
    }


    /**
     * Gets the stuk value for this KadasterHypotheekStuk.
     * 
     * @return stuk
     */
    public nl.webservices.www.soap.Stuk getStuk() {
        return stuk;
    }


    /**
     * Sets the stuk value for this KadasterHypotheekStuk.
     * 
     * @param stuk
     */
    public void setStuk(nl.webservices.www.soap.Stuk stuk) {
        this.stuk = stuk;
    }


    /**
     * Gets the stukdelen value for this KadasterHypotheekStuk.
     * 
     * @return stukdelen
     */
    public nl.webservices.www.soap.KadasterStukdeel[] getStukdelen() {
        return stukdelen;
    }


    /**
     * Sets the stukdelen value for this KadasterHypotheekStuk.
     * 
     * @param stukdelen
     */
    public void setStukdelen(nl.webservices.www.soap.KadasterStukdeel[] stukdelen) {
        this.stukdelen = stukdelen;
    }


    /**
     * Gets the datum_aanbieding value for this KadasterHypotheekStuk.
     * 
     * @return datum_aanbieding
     */
    public java.lang.String getDatum_aanbieding() {
        return datum_aanbieding;
    }


    /**
     * Sets the datum_aanbieding value for this KadasterHypotheekStuk.
     * 
     * @param datum_aanbieding
     */
    public void setDatum_aanbieding(java.lang.String datum_aanbieding) {
        this.datum_aanbieding = datum_aanbieding;
    }


    /**
     * Gets the datum_ondertekening value for this KadasterHypotheekStuk.
     * 
     * @return datum_ondertekening
     */
    public java.lang.String getDatum_ondertekening() {
        return datum_ondertekening;
    }


    /**
     * Sets the datum_ondertekening value for this KadasterHypotheekStuk.
     * 
     * @param datum_ondertekening
     */
    public void setDatum_ondertekening(java.lang.String datum_ondertekening) {
        this.datum_ondertekening = datum_ondertekening;
    }


    /**
     * Gets the omschrijving value for this KadasterHypotheekStuk.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this KadasterHypotheekStuk.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the rectificatie_verzocht value for this KadasterHypotheekStuk.
     * 
     * @return rectificatie_verzocht
     */
    public java.lang.Boolean getRectificatie_verzocht() {
        return rectificatie_verzocht;
    }


    /**
     * Sets the rectificatie_verzocht value for this KadasterHypotheekStuk.
     * 
     * @param rectificatie_verzocht
     */
    public void setRectificatie_verzocht(java.lang.Boolean rectificatie_verzocht) {
        this.rectificatie_verzocht = rectificatie_verzocht;
    }


    /**
     * Gets the eenzijdig_opzegbaar value for this KadasterHypotheekStuk.
     * 
     * @return eenzijdig_opzegbaar
     */
    public java.lang.Boolean getEenzijdig_opzegbaar() {
        return eenzijdig_opzegbaar;
    }


    /**
     * Sets the eenzijdig_opzegbaar value for this KadasterHypotheekStuk.
     * 
     * @param eenzijdig_opzegbaar
     */
    public void setEenzijdig_opzegbaar(java.lang.Boolean eenzijdig_opzegbaar) {
        this.eenzijdig_opzegbaar = eenzijdig_opzegbaar;
    }


    /**
     * Gets the gefiatteerd value for this KadasterHypotheekStuk.
     * 
     * @return gefiatteerd
     */
    public java.lang.Boolean getGefiatteerd() {
        return gefiatteerd;
    }


    /**
     * Sets the gefiatteerd value for this KadasterHypotheekStuk.
     * 
     * @param gefiatteerd
     */
    public void setGefiatteerd(java.lang.Boolean gefiatteerd) {
        this.gefiatteerd = gefiatteerd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterHypotheekStuk)) return false;
        KadasterHypotheekStuk other = (KadasterHypotheekStuk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stuk==null && other.getStuk()==null) || 
             (this.stuk!=null &&
              this.stuk.equals(other.getStuk()))) &&
            ((this.stukdelen==null && other.getStukdelen()==null) || 
             (this.stukdelen!=null &&
              java.util.Arrays.equals(this.stukdelen, other.getStukdelen()))) &&
            ((this.datum_aanbieding==null && other.getDatum_aanbieding()==null) || 
             (this.datum_aanbieding!=null &&
              this.datum_aanbieding.equals(other.getDatum_aanbieding()))) &&
            ((this.datum_ondertekening==null && other.getDatum_ondertekening()==null) || 
             (this.datum_ondertekening!=null &&
              this.datum_ondertekening.equals(other.getDatum_ondertekening()))) &&
            ((this.omschrijving==null && other.getOmschrijving()==null) || 
             (this.omschrijving!=null &&
              this.omschrijving.equals(other.getOmschrijving()))) &&
            ((this.rectificatie_verzocht==null && other.getRectificatie_verzocht()==null) || 
             (this.rectificatie_verzocht!=null &&
              this.rectificatie_verzocht.equals(other.getRectificatie_verzocht()))) &&
            ((this.eenzijdig_opzegbaar==null && other.getEenzijdig_opzegbaar()==null) || 
             (this.eenzijdig_opzegbaar!=null &&
              this.eenzijdig_opzegbaar.equals(other.getEenzijdig_opzegbaar()))) &&
            ((this.gefiatteerd==null && other.getGefiatteerd()==null) || 
             (this.gefiatteerd!=null &&
              this.gefiatteerd.equals(other.getGefiatteerd())));
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
        if (getStuk() != null) {
            _hashCode += getStuk().hashCode();
        }
        if (getStukdelen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStukdelen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStukdelen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDatum_aanbieding() != null) {
            _hashCode += getDatum_aanbieding().hashCode();
        }
        if (getDatum_ondertekening() != null) {
            _hashCode += getDatum_ondertekening().hashCode();
        }
        if (getOmschrijving() != null) {
            _hashCode += getOmschrijving().hashCode();
        }
        if (getRectificatie_verzocht() != null) {
            _hashCode += getRectificatie_verzocht().hashCode();
        }
        if (getEenzijdig_opzegbaar() != null) {
            _hashCode += getEenzijdig_opzegbaar().hashCode();
        }
        if (getGefiatteerd() != null) {
            _hashCode += getGefiatteerd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterHypotheekStuk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypotheekStuk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stuk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stuk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Stuk"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stukdelen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stukdelen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterStukdeel"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_aanbieding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_aanbieding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_ondertekening");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_ondertekening"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("rectificatie_verzocht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rectificatie_verzocht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eenzijdig_opzegbaar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "eenzijdig_opzegbaar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gefiatteerd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gefiatteerd"));
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
