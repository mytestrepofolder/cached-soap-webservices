/**
 * KadasterAddressCoordinatesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterAddressCoordinatesRequestType  implements java.io.Serializable {
    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String street;

    private int houseno;

    private java.lang.String housenoaddition;

    public KadasterAddressCoordinatesRequestType() {
    }

    public KadasterAddressCoordinatesRequestType(
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String street,
           int houseno,
           java.lang.String housenoaddition) {
           this.postcode = postcode;
           this.city = city;
           this.street = street;
           this.houseno = houseno;
           this.housenoaddition = housenoaddition;
    }


    /**
     * Gets the postcode value for this KadasterAddressCoordinatesRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this KadasterAddressCoordinatesRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this KadasterAddressCoordinatesRequestType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this KadasterAddressCoordinatesRequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the street value for this KadasterAddressCoordinatesRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this KadasterAddressCoordinatesRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the houseno value for this KadasterAddressCoordinatesRequestType.
     * 
     * @return houseno
     */
    public int getHouseno() {
        return houseno;
    }


    /**
     * Sets the houseno value for this KadasterAddressCoordinatesRequestType.
     * 
     * @param houseno
     */
    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }


    /**
     * Gets the housenoaddition value for this KadasterAddressCoordinatesRequestType.
     * 
     * @return housenoaddition
     */
    public java.lang.String getHousenoaddition() {
        return housenoaddition;
    }


    /**
     * Sets the housenoaddition value for this KadasterAddressCoordinatesRequestType.
     * 
     * @param housenoaddition
     */
    public void setHousenoaddition(java.lang.String housenoaddition) {
        this.housenoaddition = housenoaddition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterAddressCoordinatesRequestType)) return false;
        KadasterAddressCoordinatesRequestType other = (KadasterAddressCoordinatesRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            this.houseno == other.getHouseno() &&
            ((this.housenoaddition==null && other.getHousenoaddition()==null) || 
             (this.housenoaddition!=null &&
              this.housenoaddition.equals(other.getHousenoaddition())));
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
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        _hashCode += getHouseno();
        if (getHousenoaddition() != null) {
            _hashCode += getHousenoaddition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterAddressCoordinatesRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterAddressCoordinatesRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "houseno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("housenoaddition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "housenoaddition"));
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
