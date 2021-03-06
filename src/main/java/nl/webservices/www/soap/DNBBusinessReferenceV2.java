/**
 * DNBBusinessReferenceV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBBusinessReferenceV2  implements java.io.Serializable {
    private java.lang.String dnb_key;

    private java.lang.String trade_name;

    private java.lang.String[] trade_names;

    private java.lang.String address;

    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String phone_number;

    private int country;

    private java.lang.String country_iso2;

    private boolean main_branch_indication;

    private int confidence_code;

    public DNBBusinessReferenceV2() {
    }

    public DNBBusinessReferenceV2(
           java.lang.String dnb_key,
           java.lang.String trade_name,
           java.lang.String[] trade_names,
           java.lang.String address,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String phone_number,
           int country,
           java.lang.String country_iso2,
           boolean main_branch_indication,
           int confidence_code) {
           this.dnb_key = dnb_key;
           this.trade_name = trade_name;
           this.trade_names = trade_names;
           this.address = address;
           this.postcode = postcode;
           this.city = city;
           this.phone_number = phone_number;
           this.country = country;
           this.country_iso2 = country_iso2;
           this.main_branch_indication = main_branch_indication;
           this.confidence_code = confidence_code;
    }


    /**
     * Gets the dnb_key value for this DNBBusinessReferenceV2.
     * 
     * @return dnb_key
     */
    public java.lang.String getDnb_key() {
        return dnb_key;
    }


    /**
     * Sets the dnb_key value for this DNBBusinessReferenceV2.
     * 
     * @param dnb_key
     */
    public void setDnb_key(java.lang.String dnb_key) {
        this.dnb_key = dnb_key;
    }


    /**
     * Gets the trade_name value for this DNBBusinessReferenceV2.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this DNBBusinessReferenceV2.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the trade_names value for this DNBBusinessReferenceV2.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this DNBBusinessReferenceV2.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the address value for this DNBBusinessReferenceV2.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this DNBBusinessReferenceV2.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the postcode value for this DNBBusinessReferenceV2.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DNBBusinessReferenceV2.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this DNBBusinessReferenceV2.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DNBBusinessReferenceV2.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the phone_number value for this DNBBusinessReferenceV2.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this DNBBusinessReferenceV2.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }


    /**
     * Gets the country value for this DNBBusinessReferenceV2.
     * 
     * @return country
     */
    public int getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DNBBusinessReferenceV2.
     * 
     * @param country
     */
    public void setCountry(int country) {
        this.country = country;
    }


    /**
     * Gets the country_iso2 value for this DNBBusinessReferenceV2.
     * 
     * @return country_iso2
     */
    public java.lang.String getCountry_iso2() {
        return country_iso2;
    }


    /**
     * Sets the country_iso2 value for this DNBBusinessReferenceV2.
     * 
     * @param country_iso2
     */
    public void setCountry_iso2(java.lang.String country_iso2) {
        this.country_iso2 = country_iso2;
    }


    /**
     * Gets the main_branch_indication value for this DNBBusinessReferenceV2.
     * 
     * @return main_branch_indication
     */
    public boolean isMain_branch_indication() {
        return main_branch_indication;
    }


    /**
     * Sets the main_branch_indication value for this DNBBusinessReferenceV2.
     * 
     * @param main_branch_indication
     */
    public void setMain_branch_indication(boolean main_branch_indication) {
        this.main_branch_indication = main_branch_indication;
    }


    /**
     * Gets the confidence_code value for this DNBBusinessReferenceV2.
     * 
     * @return confidence_code
     */
    public int getConfidence_code() {
        return confidence_code;
    }


    /**
     * Sets the confidence_code value for this DNBBusinessReferenceV2.
     * 
     * @param confidence_code
     */
    public void setConfidence_code(int confidence_code) {
        this.confidence_code = confidence_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBBusinessReferenceV2)) return false;
        DNBBusinessReferenceV2 other = (DNBBusinessReferenceV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dnb_key==null && other.getDnb_key()==null) || 
             (this.dnb_key!=null &&
              this.dnb_key.equals(other.getDnb_key()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number()))) &&
            this.country == other.getCountry() &&
            ((this.country_iso2==null && other.getCountry_iso2()==null) || 
             (this.country_iso2!=null &&
              this.country_iso2.equals(other.getCountry_iso2()))) &&
            this.main_branch_indication == other.isMain_branch_indication() &&
            this.confidence_code == other.getConfidence_code();
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
        if (getDnb_key() != null) {
            _hashCode += getDnb_key().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getTrade_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrade_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrade_names(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getPhone_number() != null) {
            _hashCode += getPhone_number().hashCode();
        }
        _hashCode += getCountry();
        if (getCountry_iso2() != null) {
            _hashCode += getCountry_iso2().hashCode();
        }
        _hashCode += (isMain_branch_indication() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getConfidence_code();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBBusinessReferenceV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBBusinessReferenceV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnb_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dnb_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("phone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "phone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_branch_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_branch_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidence_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "confidence_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
