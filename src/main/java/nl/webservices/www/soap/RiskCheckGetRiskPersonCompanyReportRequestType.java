/**
 * RiskCheckGetRiskPersonCompanyReportRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskCheckGetRiskPersonCompanyReportRequestType  implements java.io.Serializable {
    private java.lang.String gender;

    private java.lang.String initials;

    private java.lang.String prefix;

    private java.lang.String last_name;

    private java.lang.String birth_date;

    private java.lang.String street;

    private int house_number;

    private java.lang.String house_number_addition;

    private java.lang.String postcode;

    private java.lang.String city;

    public RiskCheckGetRiskPersonCompanyReportRequestType() {
    }

    public RiskCheckGetRiskPersonCompanyReportRequestType(
           java.lang.String gender,
           java.lang.String initials,
           java.lang.String prefix,
           java.lang.String last_name,
           java.lang.String birth_date,
           java.lang.String street,
           int house_number,
           java.lang.String house_number_addition,
           java.lang.String postcode,
           java.lang.String city) {
           this.gender = gender;
           this.initials = initials;
           this.prefix = prefix;
           this.last_name = last_name;
           this.birth_date = birth_date;
           this.street = street;
           this.house_number = house_number;
           this.house_number_addition = house_number_addition;
           this.postcode = postcode;
           this.city = city;
    }


    /**
     * Gets the gender value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the initials value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the prefix value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the last_name value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the birth_date value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return birth_date
     */
    public java.lang.String getBirth_date() {
        return birth_date;
    }


    /**
     * Sets the birth_date value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param birth_date
     */
    public void setBirth_date(java.lang.String birth_date) {
        this.birth_date = birth_date;
    }


    /**
     * Gets the street value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_number value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return house_number
     */
    public int getHouse_number() {
        return house_number;
    }


    /**
     * Sets the house_number value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param house_number
     */
    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }


    /**
     * Gets the house_number_addition value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return house_number_addition
     */
    public java.lang.String getHouse_number_addition() {
        return house_number_addition;
    }


    /**
     * Sets the house_number_addition value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param house_number_addition
     */
    public void setHouse_number_addition(java.lang.String house_number_addition) {
        this.house_number_addition = house_number_addition;
    }


    /**
     * Gets the postcode value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this RiskCheckGetRiskPersonCompanyReportRequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskCheckGetRiskPersonCompanyReportRequestType)) return false;
        RiskCheckGetRiskPersonCompanyReportRequestType other = (RiskCheckGetRiskPersonCompanyReportRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.birth_date==null && other.getBirth_date()==null) || 
             (this.birth_date!=null &&
              this.birth_date.equals(other.getBirth_date()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            this.house_number == other.getHouse_number() &&
            ((this.house_number_addition==null && other.getHouse_number_addition()==null) || 
             (this.house_number_addition!=null &&
              this.house_number_addition.equals(other.getHouse_number_addition()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity())));
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
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getBirth_date() != null) {
            _hashCode += getBirth_date().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        _hashCode += getHouse_number();
        if (getHouse_number_addition() != null) {
            _hashCode += getHouse_number_addition().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskCheckGetRiskPersonCompanyReportRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "riskCheckGetRiskPersonCompanyReportRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "birth_date"));
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
        elemField.setFieldName("house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number_addition"));
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
