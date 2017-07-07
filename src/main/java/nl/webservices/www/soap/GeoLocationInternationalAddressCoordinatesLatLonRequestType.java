/**
 * GeoLocationInternationalAddressCoordinatesLatLonRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationInternationalAddressCoordinatesLatLonRequestType  implements java.io.Serializable {
    private java.lang.String street;

    private int houseno;

    private java.lang.String city;

    private java.lang.String province;

    private java.lang.String country;

    private java.lang.String language;

    public GeoLocationInternationalAddressCoordinatesLatLonRequestType() {
    }

    public GeoLocationInternationalAddressCoordinatesLatLonRequestType(
           java.lang.String street,
           int houseno,
           java.lang.String city,
           java.lang.String province,
           java.lang.String country,
           java.lang.String language) {
           this.street = street;
           this.houseno = houseno;
           this.city = city;
           this.province = province;
           this.country = country;
           this.language = language;
    }


    /**
     * Gets the street value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the houseno value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @return houseno
     */
    public int getHouseno() {
        return houseno;
    }


    /**
     * Sets the houseno value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @param houseno
     */
    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }


    /**
     * Gets the city value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the province value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the country value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the language value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GeoLocationInternationalAddressCoordinatesLatLonRequestType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationInternationalAddressCoordinatesLatLonRequestType)) return false;
        GeoLocationInternationalAddressCoordinatesLatLonRequestType other = (GeoLocationInternationalAddressCoordinatesLatLonRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            this.houseno == other.getHouseno() &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        _hashCode += getHouseno();
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationInternationalAddressCoordinatesLatLonRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationInternationalAddressCoordinatesLatLonRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "language"));
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
