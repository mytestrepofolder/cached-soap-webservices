/**
 * BerichtObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BerichtObject  implements java.io.Serializable {
    private java.util.Date datum_bijgewerkt;

    private nl.webservices.www.soap.OnroerendeZaak onroerende_zaak;

    private nl.webservices.www.soap.RechtenLijst rechten_lijst;

    private nl.webservices.www.soap.Persoon[] personen;

    private nl.webservices.www.soap.Stuk[] stukken;

    private nl.webservices.www.soap.GemeenteStuk[] gemeentestukken;

    private byte[] document;

    public BerichtObject() {
    }

    public BerichtObject(
           java.util.Date datum_bijgewerkt,
           nl.webservices.www.soap.OnroerendeZaak onroerende_zaak,
           nl.webservices.www.soap.RechtenLijst rechten_lijst,
           nl.webservices.www.soap.Persoon[] personen,
           nl.webservices.www.soap.Stuk[] stukken,
           nl.webservices.www.soap.GemeenteStuk[] gemeentestukken,
           byte[] document) {
           this.datum_bijgewerkt = datum_bijgewerkt;
           this.onroerende_zaak = onroerende_zaak;
           this.rechten_lijst = rechten_lijst;
           this.personen = personen;
           this.stukken = stukken;
           this.gemeentestukken = gemeentestukken;
           this.document = document;
    }


    /**
     * Gets the datum_bijgewerkt value for this BerichtObject.
     * 
     * @return datum_bijgewerkt
     */
    public java.util.Date getDatum_bijgewerkt() {
        return datum_bijgewerkt;
    }


    /**
     * Sets the datum_bijgewerkt value for this BerichtObject.
     * 
     * @param datum_bijgewerkt
     */
    public void setDatum_bijgewerkt(java.util.Date datum_bijgewerkt) {
        this.datum_bijgewerkt = datum_bijgewerkt;
    }


    /**
     * Gets the onroerende_zaak value for this BerichtObject.
     * 
     * @return onroerende_zaak
     */
    public nl.webservices.www.soap.OnroerendeZaak getOnroerende_zaak() {
        return onroerende_zaak;
    }


    /**
     * Sets the onroerende_zaak value for this BerichtObject.
     * 
     * @param onroerende_zaak
     */
    public void setOnroerende_zaak(nl.webservices.www.soap.OnroerendeZaak onroerende_zaak) {
        this.onroerende_zaak = onroerende_zaak;
    }


    /**
     * Gets the rechten_lijst value for this BerichtObject.
     * 
     * @return rechten_lijst
     */
    public nl.webservices.www.soap.RechtenLijst getRechten_lijst() {
        return rechten_lijst;
    }


    /**
     * Sets the rechten_lijst value for this BerichtObject.
     * 
     * @param rechten_lijst
     */
    public void setRechten_lijst(nl.webservices.www.soap.RechtenLijst rechten_lijst) {
        this.rechten_lijst = rechten_lijst;
    }


    /**
     * Gets the personen value for this BerichtObject.
     * 
     * @return personen
     */
    public nl.webservices.www.soap.Persoon[] getPersonen() {
        return personen;
    }


    /**
     * Sets the personen value for this BerichtObject.
     * 
     * @param personen
     */
    public void setPersonen(nl.webservices.www.soap.Persoon[] personen) {
        this.personen = personen;
    }


    /**
     * Gets the stukken value for this BerichtObject.
     * 
     * @return stukken
     */
    public nl.webservices.www.soap.Stuk[] getStukken() {
        return stukken;
    }


    /**
     * Sets the stukken value for this BerichtObject.
     * 
     * @param stukken
     */
    public void setStukken(nl.webservices.www.soap.Stuk[] stukken) {
        this.stukken = stukken;
    }


    /**
     * Gets the gemeentestukken value for this BerichtObject.
     * 
     * @return gemeentestukken
     */
    public nl.webservices.www.soap.GemeenteStuk[] getGemeentestukken() {
        return gemeentestukken;
    }


    /**
     * Sets the gemeentestukken value for this BerichtObject.
     * 
     * @param gemeentestukken
     */
    public void setGemeentestukken(nl.webservices.www.soap.GemeenteStuk[] gemeentestukken) {
        this.gemeentestukken = gemeentestukken;
    }


    /**
     * Gets the document value for this BerichtObject.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this BerichtObject.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BerichtObject)) return false;
        BerichtObject other = (BerichtObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datum_bijgewerkt==null && other.getDatum_bijgewerkt()==null) || 
             (this.datum_bijgewerkt!=null &&
              this.datum_bijgewerkt.equals(other.getDatum_bijgewerkt()))) &&
            ((this.onroerende_zaak==null && other.getOnroerende_zaak()==null) || 
             (this.onroerende_zaak!=null &&
              this.onroerende_zaak.equals(other.getOnroerende_zaak()))) &&
            ((this.rechten_lijst==null && other.getRechten_lijst()==null) || 
             (this.rechten_lijst!=null &&
              this.rechten_lijst.equals(other.getRechten_lijst()))) &&
            ((this.personen==null && other.getPersonen()==null) || 
             (this.personen!=null &&
              java.util.Arrays.equals(this.personen, other.getPersonen()))) &&
            ((this.stukken==null && other.getStukken()==null) || 
             (this.stukken!=null &&
              java.util.Arrays.equals(this.stukken, other.getStukken()))) &&
            ((this.gemeentestukken==null && other.getGemeentestukken()==null) || 
             (this.gemeentestukken!=null &&
              java.util.Arrays.equals(this.gemeentestukken, other.getGemeentestukken()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument())));
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
        if (getDatum_bijgewerkt() != null) {
            _hashCode += getDatum_bijgewerkt().hashCode();
        }
        if (getOnroerende_zaak() != null) {
            _hashCode += getOnroerende_zaak().hashCode();
        }
        if (getRechten_lijst() != null) {
            _hashCode += getRechten_lijst().hashCode();
        }
        if (getPersonen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStukken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStukken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStukken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGemeentestukken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGemeentestukken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGemeentestukken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
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
        new org.apache.axis.description.TypeDesc(BerichtObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BerichtObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_bijgewerkt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_bijgewerkt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onroerende_zaak");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "onroerende_zaak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OnroerendeZaak"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechten_lijst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rechten_lijst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RechtenLijst"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "personen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Persoon"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stukken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stukken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Stuk"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentestukken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentestukken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GemeenteStuk"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
