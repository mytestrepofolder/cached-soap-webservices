/**
 * InternationalAddressSearchInteractiveRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InternationalAddressSearchInteractiveRequestType  implements java.io.Serializable {
    private java.lang.String organization;

    private java.lang.String building;

    private java.lang.String street;

    private java.lang.String housenr;

    private java.lang.String pobox;

    private java.lang.String locality;

    private java.lang.String postcode;

    private java.lang.String province;

    private java.lang.String country;

    private java.lang.String language;

    private java.lang.String country_format;

    public InternationalAddressSearchInteractiveRequestType() {
    }

    public InternationalAddressSearchInteractiveRequestType(
           java.lang.String organization,
           java.lang.String building,
           java.lang.String street,
           java.lang.String housenr,
           java.lang.String pobox,
           java.lang.String locality,
           java.lang.String postcode,
           java.lang.String province,
           java.lang.String country,
           java.lang.String language,
           java.lang.String country_format) {
           this.organization = organization;
           this.building = building;
           this.street = street;
           this.housenr = housenr;
           this.pobox = pobox;
           this.locality = locality;
           this.postcode = postcode;
           this.province = province;
           this.country = country;
           this.language = language;
           this.country_format = country_format;
    }


    /**
     * Gets the organization value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return organization
     */
    public java.lang.String getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param organization
     */
    public void setOrganization(java.lang.String organization) {
        this.organization = organization;
    }


    /**
     * Gets the building value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return building
     */
    public java.lang.String getBuilding() {
        return building;
    }


    /**
     * Sets the building value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param building
     */
    public void setBuilding(java.lang.String building) {
        this.building = building;
    }


    /**
     * Gets the street value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the housenr value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return housenr
     */
    public java.lang.String getHousenr() {
        return housenr;
    }


    /**
     * Sets the housenr value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param housenr
     */
    public void setHousenr(java.lang.String housenr) {
        this.housenr = housenr;
    }


    /**
     * Gets the pobox value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return pobox
     */
    public java.lang.String getPobox() {
        return pobox;
    }


    /**
     * Sets the pobox value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param pobox
     */
    public void setPobox(java.lang.String pobox) {
        this.pobox = pobox;
    }


    /**
     * Gets the locality value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the postcode value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the province value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the country value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the language value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the country_format value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @return country_format
     */
    public java.lang.String getCountry_format() {
        return country_format;
    }


    /**
     * Sets the country_format value for this InternationalAddressSearchInteractiveRequestType.
     * 
     * @param country_format
     */
    public void setCountry_format(java.lang.String country_format) {
        this.country_format = country_format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalAddressSearchInteractiveRequestType)) return false;
        InternationalAddressSearchInteractiveRequestType other = (InternationalAddressSearchInteractiveRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.building==null && other.getBuilding()==null) || 
             (this.building!=null &&
              this.building.equals(other.getBuilding()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.housenr==null && other.getHousenr()==null) || 
             (this.housenr!=null &&
              this.housenr.equals(other.getHousenr()))) &&
            ((this.pobox==null && other.getPobox()==null) || 
             (this.pobox!=null &&
              this.pobox.equals(other.getPobox()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.country_format==null && other.getCountry_format()==null) || 
             (this.country_format!=null &&
              this.country_format.equals(other.getCountry_format())));
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
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getBuilding() != null) {
            _hashCode += getBuilding().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHousenr() != null) {
            _hashCode += getHousenr().hashCode();
        }
        if (getPobox() != null) {
            _hashCode += getPobox().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
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
        if (getCountry_format() != null) {
            _hashCode += getCountry_format().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalAddressSearchInteractiveRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "internationalAddressSearchInteractiveRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("building");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "building"));
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
        elemField.setFieldName("housenr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "housenr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pobox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pobox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_format"));
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
