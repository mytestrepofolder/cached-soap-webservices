/**
 * KadasterOverzichtOnroerendeZaak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterOverzichtOnroerendeZaak  implements java.io.Serializable {
    private java.lang.String object_id;

    private nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding;

    private nl.webservices.www.soap.KadasterLocatieBinnenland locatie;

    private java.lang.String omschrijving;

    private java.lang.String type;

    public KadasterOverzichtOnroerendeZaak() {
    }

    public KadasterOverzichtOnroerendeZaak(
           java.lang.String object_id,
           nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding,
           nl.webservices.www.soap.KadasterLocatieBinnenland locatie,
           java.lang.String omschrijving,
           java.lang.String type) {
           this.object_id = object_id;
           this.kadastrale_aanduiding = kadastrale_aanduiding;
           this.locatie = locatie;
           this.omschrijving = omschrijving;
           this.type = type;
    }


    /**
     * Gets the object_id value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the kadastrale_aanduiding value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @return kadastrale_aanduiding
     */
    public nl.webservices.www.soap.KadastraleAanduiding getKadastrale_aanduiding() {
        return kadastrale_aanduiding;
    }


    /**
     * Sets the kadastrale_aanduiding value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @param kadastrale_aanduiding
     */
    public void setKadastrale_aanduiding(nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding) {
        this.kadastrale_aanduiding = kadastrale_aanduiding;
    }


    /**
     * Gets the locatie value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @return locatie
     */
    public nl.webservices.www.soap.KadasterLocatieBinnenland getLocatie() {
        return locatie;
    }


    /**
     * Sets the locatie value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @param locatie
     */
    public void setLocatie(nl.webservices.www.soap.KadasterLocatieBinnenland locatie) {
        this.locatie = locatie;
    }


    /**
     * Gets the omschrijving value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the type value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this KadasterOverzichtOnroerendeZaak.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterOverzichtOnroerendeZaak)) return false;
        KadasterOverzichtOnroerendeZaak other = (KadasterOverzichtOnroerendeZaak) obj;
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
            ((this.locatie==null && other.getLocatie()==null) || 
             (this.locatie!=null &&
              this.locatie.equals(other.getLocatie()))) &&
            ((this.omschrijving==null && other.getOmschrijving()==null) || 
             (this.omschrijving!=null &&
              this.omschrijving.equals(other.getOmschrijving()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getLocatie() != null) {
            _hashCode += getLocatie().hashCode();
        }
        if (getOmschrijving() != null) {
            _hashCode += getOmschrijving().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterOverzichtOnroerendeZaak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzichtOnroerendeZaak"));
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
        elemField.setFieldName("locatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterLocatieBinnenland"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
