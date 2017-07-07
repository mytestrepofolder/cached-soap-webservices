/**
 * DNBAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBAddress  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String region;

    private java.lang.String region_short;

    private java.lang.Integer region_code;

    private java.lang.String country;

    private int country_dnb;

    private java.lang.String country_iso;

    public DNBAddress() {
    }

    public DNBAddress(
           java.lang.String address,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String region,
           java.lang.String region_short,
           java.lang.Integer region_code,
           java.lang.String country,
           int country_dnb,
           java.lang.String country_iso) {
           this.address = address;
           this.postcode = postcode;
           this.city = city;
           this.region = region;
           this.region_short = region_short;
           this.region_code = region_code;
           this.country = country;
           this.country_dnb = country_dnb;
           this.country_iso = country_iso;
    }


    /**
     * Gets the address value for this DNBAddress.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this DNBAddress.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the postcode value for this DNBAddress.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DNBAddress.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this DNBAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DNBAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the region value for this DNBAddress.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DNBAddress.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the region_short value for this DNBAddress.
     * 
     * @return region_short
     */
    public java.lang.String getRegion_short() {
        return region_short;
    }


    /**
     * Sets the region_short value for this DNBAddress.
     * 
     * @param region_short
     */
    public void setRegion_short(java.lang.String region_short) {
        this.region_short = region_short;
    }


    /**
     * Gets the region_code value for this DNBAddress.
     * 
     * @return region_code
     */
    public java.lang.Integer getRegion_code() {
        return region_code;
    }


    /**
     * Sets the region_code value for this DNBAddress.
     * 
     * @param region_code
     */
    public void setRegion_code(java.lang.Integer region_code) {
        this.region_code = region_code;
    }


    /**
     * Gets the country value for this DNBAddress.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DNBAddress.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the country_dnb value for this DNBAddress.
     * 
     * @return country_dnb
     */
    public int getCountry_dnb() {
        return country_dnb;
    }


    /**
     * Sets the country_dnb value for this DNBAddress.
     * 
     * @param country_dnb
     */
    public void setCountry_dnb(int country_dnb) {
        this.country_dnb = country_dnb;
    }


    /**
     * Gets the country_iso value for this DNBAddress.
     * 
     * @return country_iso
     */
    public java.lang.String getCountry_iso() {
        return country_iso;
    }


    /**
     * Sets the country_iso value for this DNBAddress.
     * 
     * @param country_iso
     */
    public void setCountry_iso(java.lang.String country_iso) {
        this.country_iso = country_iso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBAddress)) return false;
        DNBAddress other = (DNBAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.region_short==null && other.getRegion_short()==null) || 
             (this.region_short!=null &&
              this.region_short.equals(other.getRegion_short()))) &&
            ((this.region_code==null && other.getRegion_code()==null) || 
             (this.region_code!=null &&
              this.region_code.equals(other.getRegion_code()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.country_dnb == other.getCountry_dnb() &&
            ((this.country_iso==null && other.getCountry_iso()==null) || 
             (this.country_iso!=null &&
              this.country_iso.equals(other.getCountry_iso())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getRegion_short() != null) {
            _hashCode += getRegion_short().hashCode();
        }
        if (getRegion_code() != null) {
            _hashCode += getRegion_code().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += getCountry_dnb();
        if (getCountry_iso() != null) {
            _hashCode += getCountry_iso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
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
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region_short");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region_short"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_dnb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_dnb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso"));
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
