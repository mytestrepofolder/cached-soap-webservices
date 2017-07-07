/**
 * KadasterLocatieBuitenland.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterLocatieBuitenland  implements java.io.Serializable {
    private java.lang.String adres;

    private java.lang.String woonplaats;

    private java.lang.String regio;

    private java.lang.String land;

    public KadasterLocatieBuitenland() {
    }

    public KadasterLocatieBuitenland(
           java.lang.String adres,
           java.lang.String woonplaats,
           java.lang.String regio,
           java.lang.String land) {
           this.adres = adres;
           this.woonplaats = woonplaats;
           this.regio = regio;
           this.land = land;
    }


    /**
     * Gets the adres value for this KadasterLocatieBuitenland.
     * 
     * @return adres
     */
    public java.lang.String getAdres() {
        return adres;
    }


    /**
     * Sets the adres value for this KadasterLocatieBuitenland.
     * 
     * @param adres
     */
    public void setAdres(java.lang.String adres) {
        this.adres = adres;
    }


    /**
     * Gets the woonplaats value for this KadasterLocatieBuitenland.
     * 
     * @return woonplaats
     */
    public java.lang.String getWoonplaats() {
        return woonplaats;
    }


    /**
     * Sets the woonplaats value for this KadasterLocatieBuitenland.
     * 
     * @param woonplaats
     */
    public void setWoonplaats(java.lang.String woonplaats) {
        this.woonplaats = woonplaats;
    }


    /**
     * Gets the regio value for this KadasterLocatieBuitenland.
     * 
     * @return regio
     */
    public java.lang.String getRegio() {
        return regio;
    }


    /**
     * Sets the regio value for this KadasterLocatieBuitenland.
     * 
     * @param regio
     */
    public void setRegio(java.lang.String regio) {
        this.regio = regio;
    }


    /**
     * Gets the land value for this KadasterLocatieBuitenland.
     * 
     * @return land
     */
    public java.lang.String getLand() {
        return land;
    }


    /**
     * Sets the land value for this KadasterLocatieBuitenland.
     * 
     * @param land
     */
    public void setLand(java.lang.String land) {
        this.land = land;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterLocatieBuitenland)) return false;
        KadasterLocatieBuitenland other = (KadasterLocatieBuitenland) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adres==null && other.getAdres()==null) || 
             (this.adres!=null &&
              this.adres.equals(other.getAdres()))) &&
            ((this.woonplaats==null && other.getWoonplaats()==null) || 
             (this.woonplaats!=null &&
              this.woonplaats.equals(other.getWoonplaats()))) &&
            ((this.regio==null && other.getRegio()==null) || 
             (this.regio!=null &&
              this.regio.equals(other.getRegio()))) &&
            ((this.land==null && other.getLand()==null) || 
             (this.land!=null &&
              this.land.equals(other.getLand())));
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
        if (getAdres() != null) {
            _hashCode += getAdres().hashCode();
        }
        if (getWoonplaats() != null) {
            _hashCode += getWoonplaats().hashCode();
        }
        if (getRegio() != null) {
            _hashCode += getRegio().hashCode();
        }
        if (getLand() != null) {
            _hashCode += getLand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterLocatieBuitenland.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterLocatieBuitenland"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("woonplaats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "woonplaats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "regio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("land");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "land"));
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
