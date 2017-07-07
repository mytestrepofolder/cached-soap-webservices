/**
 * GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GeoLocationInternationalAddressCoordinatesLatLonV2RequestType  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String postalcode;

    private int houseno;

    private java.lang.String street;

    private java.lang.String city;

    private java.lang.String province;

    private float matchrate;

    private java.lang.String language;

    public GeoLocationInternationalAddressCoordinatesLatLonV2RequestType() {
    }

    public GeoLocationInternationalAddressCoordinatesLatLonV2RequestType(
           java.lang.String country,
           java.lang.String postalcode,
           int houseno,
           java.lang.String street,
           java.lang.String city,
           java.lang.String province,
           float matchrate,
           java.lang.String language) {
           this.country = country;
           this.postalcode = postalcode;
           this.houseno = houseno;
           this.street = street;
           this.city = city;
           this.province = province;
           this.matchrate = matchrate;
           this.language = language;
    }


    /**
     * Gets the country value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the postalcode value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return postalcode
     */
    public java.lang.String getPostalcode() {
        return postalcode;
    }


    /**
     * Sets the postalcode value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param postalcode
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }


    /**
     * Gets the houseno value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return houseno
     */
    public int getHouseno() {
        return houseno;
    }


    /**
     * Sets the houseno value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param houseno
     */
    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }


    /**
     * Gets the street value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the city value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the province value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the matchrate value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return matchrate
     */
    public float getMatchrate() {
        return matchrate;
    }


    /**
     * Sets the matchrate value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param matchrate
     */
    public void setMatchrate(float matchrate) {
        this.matchrate = matchrate;
    }


    /**
     * Gets the language value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoLocationInternationalAddressCoordinatesLatLonV2RequestType)) return false;
        GeoLocationInternationalAddressCoordinatesLatLonV2RequestType other = (GeoLocationInternationalAddressCoordinatesLatLonV2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.postalcode==null && other.getPostalcode()==null) || 
             (this.postalcode!=null &&
              this.postalcode.equals(other.getPostalcode()))) &&
            this.houseno == other.getHouseno() &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            this.matchrate == other.getMatchrate() &&
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPostalcode() != null) {
            _hashCode += getPostalcode().hashCode();
        }
        _hashCode += getHouseno();
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        _hashCode += new Float(getMatchrate()).hashCode();
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoLocationInternationalAddressCoordinatesLatLonV2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "geoLocationInternationalAddressCoordinatesLatLonV2RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postalcode"));
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
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
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
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "matchrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
