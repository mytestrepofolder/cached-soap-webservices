/**
 * GraydonReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonReference  implements java.io.Serializable {
    private java.lang.String company_id;

    private java.lang.String company_id_type;

    private java.lang.String trade_name;

    private java.lang.String street;

    private int house_no;

    private java.lang.String house_no_addition;

    private java.lang.String postcode;

    private java.lang.String residence;

    private java.lang.String country_iso2;

    private java.lang.String url;

    private java.lang.String email;

    public GraydonReference() {
    }

    public GraydonReference(
           java.lang.String company_id,
           java.lang.String company_id_type,
           java.lang.String trade_name,
           java.lang.String street,
           int house_no,
           java.lang.String house_no_addition,
           java.lang.String postcode,
           java.lang.String residence,
           java.lang.String country_iso2,
           java.lang.String url,
           java.lang.String email) {
           this.company_id = company_id;
           this.company_id_type = company_id_type;
           this.trade_name = trade_name;
           this.street = street;
           this.house_no = house_no;
           this.house_no_addition = house_no_addition;
           this.postcode = postcode;
           this.residence = residence;
           this.country_iso2 = country_iso2;
           this.url = url;
           this.email = email;
    }


    /**
     * Gets the company_id value for this GraydonReference.
     * 
     * @return company_id
     */
    public java.lang.String getCompany_id() {
        return company_id;
    }


    /**
     * Sets the company_id value for this GraydonReference.
     * 
     * @param company_id
     */
    public void setCompany_id(java.lang.String company_id) {
        this.company_id = company_id;
    }


    /**
     * Gets the company_id_type value for this GraydonReference.
     * 
     * @return company_id_type
     */
    public java.lang.String getCompany_id_type() {
        return company_id_type;
    }


    /**
     * Sets the company_id_type value for this GraydonReference.
     * 
     * @param company_id_type
     */
    public void setCompany_id_type(java.lang.String company_id_type) {
        this.company_id_type = company_id_type;
    }


    /**
     * Gets the trade_name value for this GraydonReference.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this GraydonReference.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the street value for this GraydonReference.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this GraydonReference.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_no value for this GraydonReference.
     * 
     * @return house_no
     */
    public int getHouse_no() {
        return house_no;
    }


    /**
     * Sets the house_no value for this GraydonReference.
     * 
     * @param house_no
     */
    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }


    /**
     * Gets the house_no_addition value for this GraydonReference.
     * 
     * @return house_no_addition
     */
    public java.lang.String getHouse_no_addition() {
        return house_no_addition;
    }


    /**
     * Sets the house_no_addition value for this GraydonReference.
     * 
     * @param house_no_addition
     */
    public void setHouse_no_addition(java.lang.String house_no_addition) {
        this.house_no_addition = house_no_addition;
    }


    /**
     * Gets the postcode value for this GraydonReference.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this GraydonReference.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the residence value for this GraydonReference.
     * 
     * @return residence
     */
    public java.lang.String getResidence() {
        return residence;
    }


    /**
     * Sets the residence value for this GraydonReference.
     * 
     * @param residence
     */
    public void setResidence(java.lang.String residence) {
        this.residence = residence;
    }


    /**
     * Gets the country_iso2 value for this GraydonReference.
     * 
     * @return country_iso2
     */
    public java.lang.String getCountry_iso2() {
        return country_iso2;
    }


    /**
     * Sets the country_iso2 value for this GraydonReference.
     * 
     * @param country_iso2
     */
    public void setCountry_iso2(java.lang.String country_iso2) {
        this.country_iso2 = country_iso2;
    }


    /**
     * Gets the url value for this GraydonReference.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this GraydonReference.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the email value for this GraydonReference.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GraydonReference.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonReference)) return false;
        GraydonReference other = (GraydonReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_id==null && other.getCompany_id()==null) || 
             (this.company_id!=null &&
              this.company_id.equals(other.getCompany_id()))) &&
            ((this.company_id_type==null && other.getCompany_id_type()==null) || 
             (this.company_id_type!=null &&
              this.company_id_type.equals(other.getCompany_id_type()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            this.house_no == other.getHouse_no() &&
            ((this.house_no_addition==null && other.getHouse_no_addition()==null) || 
             (this.house_no_addition!=null &&
              this.house_no_addition.equals(other.getHouse_no_addition()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.residence==null && other.getResidence()==null) || 
             (this.residence!=null &&
              this.residence.equals(other.getResidence()))) &&
            ((this.country_iso2==null && other.getCountry_iso2()==null) || 
             (this.country_iso2!=null &&
              this.country_iso2.equals(other.getCountry_iso2()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getCompany_id() != null) {
            _hashCode += getCompany_id().hashCode();
        }
        if (getCompany_id_type() != null) {
            _hashCode += getCompany_id_type().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        _hashCode += getHouse_no();
        if (getHouse_no_addition() != null) {
            _hashCode += getHouse_no_addition().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getResidence() != null) {
            _hashCode += getResidence().hashCode();
        }
        if (getCountry_iso2() != null) {
            _hashCode += getCountry_iso2().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_id_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_id_type"));
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
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no_addition"));
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
        elemField.setFieldName("residence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "residence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "email"));
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
