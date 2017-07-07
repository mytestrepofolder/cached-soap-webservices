/**
 * LocatieBuitenland.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class LocatieBuitenland  implements java.io.Serializable {
    private java.lang.String adres_buitenland1;

    private java.lang.String adres_buitenland2;

    private java.lang.String adres_buitenland3;

    private java.lang.String land;

    public LocatieBuitenland() {
    }

    public LocatieBuitenland(
           java.lang.String adres_buitenland1,
           java.lang.String adres_buitenland2,
           java.lang.String adres_buitenland3,
           java.lang.String land) {
           this.adres_buitenland1 = adres_buitenland1;
           this.adres_buitenland2 = adres_buitenland2;
           this.adres_buitenland3 = adres_buitenland3;
           this.land = land;
    }


    /**
     * Gets the adres_buitenland1 value for this LocatieBuitenland.
     * 
     * @return adres_buitenland1
     */
    public java.lang.String getAdres_buitenland1() {
        return adres_buitenland1;
    }


    /**
     * Sets the adres_buitenland1 value for this LocatieBuitenland.
     * 
     * @param adres_buitenland1
     */
    public void setAdres_buitenland1(java.lang.String adres_buitenland1) {
        this.adres_buitenland1 = adres_buitenland1;
    }


    /**
     * Gets the adres_buitenland2 value for this LocatieBuitenland.
     * 
     * @return adres_buitenland2
     */
    public java.lang.String getAdres_buitenland2() {
        return adres_buitenland2;
    }


    /**
     * Sets the adres_buitenland2 value for this LocatieBuitenland.
     * 
     * @param adres_buitenland2
     */
    public void setAdres_buitenland2(java.lang.String adres_buitenland2) {
        this.adres_buitenland2 = adres_buitenland2;
    }


    /**
     * Gets the adres_buitenland3 value for this LocatieBuitenland.
     * 
     * @return adres_buitenland3
     */
    public java.lang.String getAdres_buitenland3() {
        return adres_buitenland3;
    }


    /**
     * Sets the adres_buitenland3 value for this LocatieBuitenland.
     * 
     * @param adres_buitenland3
     */
    public void setAdres_buitenland3(java.lang.String adres_buitenland3) {
        this.adres_buitenland3 = adres_buitenland3;
    }


    /**
     * Gets the land value for this LocatieBuitenland.
     * 
     * @return land
     */
    public java.lang.String getLand() {
        return land;
    }


    /**
     * Sets the land value for this LocatieBuitenland.
     * 
     * @param land
     */
    public void setLand(java.lang.String land) {
        this.land = land;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocatieBuitenland)) return false;
        LocatieBuitenland other = (LocatieBuitenland) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adres_buitenland1==null && other.getAdres_buitenland1()==null) || 
             (this.adres_buitenland1!=null &&
              this.adres_buitenland1.equals(other.getAdres_buitenland1()))) &&
            ((this.adres_buitenland2==null && other.getAdres_buitenland2()==null) || 
             (this.adres_buitenland2!=null &&
              this.adres_buitenland2.equals(other.getAdres_buitenland2()))) &&
            ((this.adres_buitenland3==null && other.getAdres_buitenland3()==null) || 
             (this.adres_buitenland3!=null &&
              this.adres_buitenland3.equals(other.getAdres_buitenland3()))) &&
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
        if (getAdres_buitenland1() != null) {
            _hashCode += getAdres_buitenland1().hashCode();
        }
        if (getAdres_buitenland2() != null) {
            _hashCode += getAdres_buitenland2().hashCode();
        }
        if (getAdres_buitenland3() != null) {
            _hashCode += getAdres_buitenland3().hashCode();
        }
        if (getLand() != null) {
            _hashCode += getLand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocatieBuitenland.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LocatieBuitenland"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adres_buitenland1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adres_buitenland1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adres_buitenland2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adres_buitenland2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adres_buitenland3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "adres_buitenland3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("land");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "land"));
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
