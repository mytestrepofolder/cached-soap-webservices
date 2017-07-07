/**
 * BerichtObjectDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BerichtObjectDocument  implements java.io.Serializable {
    private java.util.Date datum_bijgewerkt;

    private java.lang.String object_id;

    private nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding;

    private java.lang.String omschrijving;

    private nl.webservices.www.soap.LocatieBinnenlandLijst locaties;

    private byte[] document;

    private byte[][] afbeeldingen;

    public BerichtObjectDocument() {
    }

    public BerichtObjectDocument(
           java.util.Date datum_bijgewerkt,
           java.lang.String object_id,
           nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding,
           java.lang.String omschrijving,
           nl.webservices.www.soap.LocatieBinnenlandLijst locaties,
           byte[] document,
           byte[][] afbeeldingen) {
           this.datum_bijgewerkt = datum_bijgewerkt;
           this.object_id = object_id;
           this.kadastrale_aanduiding = kadastrale_aanduiding;
           this.omschrijving = omschrijving;
           this.locaties = locaties;
           this.document = document;
           this.afbeeldingen = afbeeldingen;
    }


    /**
     * Gets the datum_bijgewerkt value for this BerichtObjectDocument.
     * 
     * @return datum_bijgewerkt
     */
    public java.util.Date getDatum_bijgewerkt() {
        return datum_bijgewerkt;
    }


    /**
     * Sets the datum_bijgewerkt value for this BerichtObjectDocument.
     * 
     * @param datum_bijgewerkt
     */
    public void setDatum_bijgewerkt(java.util.Date datum_bijgewerkt) {
        this.datum_bijgewerkt = datum_bijgewerkt;
    }


    /**
     * Gets the object_id value for this BerichtObjectDocument.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this BerichtObjectDocument.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the kadastrale_aanduiding value for this BerichtObjectDocument.
     * 
     * @return kadastrale_aanduiding
     */
    public nl.webservices.www.soap.KadastraleAanduiding getKadastrale_aanduiding() {
        return kadastrale_aanduiding;
    }


    /**
     * Sets the kadastrale_aanduiding value for this BerichtObjectDocument.
     * 
     * @param kadastrale_aanduiding
     */
    public void setKadastrale_aanduiding(nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding) {
        this.kadastrale_aanduiding = kadastrale_aanduiding;
    }


    /**
     * Gets the omschrijving value for this BerichtObjectDocument.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this BerichtObjectDocument.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the locaties value for this BerichtObjectDocument.
     * 
     * @return locaties
     */
    public nl.webservices.www.soap.LocatieBinnenlandLijst getLocaties() {
        return locaties;
    }


    /**
     * Sets the locaties value for this BerichtObjectDocument.
     * 
     * @param locaties
     */
    public void setLocaties(nl.webservices.www.soap.LocatieBinnenlandLijst locaties) {
        this.locaties = locaties;
    }


    /**
     * Gets the document value for this BerichtObjectDocument.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this BerichtObjectDocument.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }


    /**
     * Gets the afbeeldingen value for this BerichtObjectDocument.
     * 
     * @return afbeeldingen
     */
    public byte[][] getAfbeeldingen() {
        return afbeeldingen;
    }


    /**
     * Sets the afbeeldingen value for this BerichtObjectDocument.
     * 
     * @param afbeeldingen
     */
    public void setAfbeeldingen(byte[][] afbeeldingen) {
        this.afbeeldingen = afbeeldingen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BerichtObjectDocument)) return false;
        BerichtObjectDocument other = (BerichtObjectDocument) obj;
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
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.afbeeldingen==null && other.getAfbeeldingen()==null) || 
             (this.afbeeldingen!=null &&
              java.util.Arrays.equals(this.afbeeldingen, other.getAfbeeldingen())));
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
        if (getAfbeeldingen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAfbeeldingen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAfbeeldingen(), i);
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
        new org.apache.axis.description.TypeDesc(BerichtObjectDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BerichtObjectDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_bijgewerkt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_bijgewerkt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afbeeldingen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "afbeeldingen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
