/**
 * EdrGetScoreRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class EdrGetScoreRequestType  implements java.io.Serializable {
    private java.lang.String last_name;

    private java.lang.String initials;

    private java.lang.String surname_prefix;

    private java.lang.String gender;

    private java.lang.String birth_date;

    private java.lang.String street;

    private java.lang.String house_number;

    private java.lang.String postcode;

    private java.lang.String phone_number;

    public EdrGetScoreRequestType() {
    }

    public EdrGetScoreRequestType(
           java.lang.String last_name,
           java.lang.String initials,
           java.lang.String surname_prefix,
           java.lang.String gender,
           java.lang.String birth_date,
           java.lang.String street,
           java.lang.String house_number,
           java.lang.String postcode,
           java.lang.String phone_number) {
           this.last_name = last_name;
           this.initials = initials;
           this.surname_prefix = surname_prefix;
           this.gender = gender;
           this.birth_date = birth_date;
           this.street = street;
           this.house_number = house_number;
           this.postcode = postcode;
           this.phone_number = phone_number;
    }


    /**
     * Gets the last_name value for this EdrGetScoreRequestType.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this EdrGetScoreRequestType.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the initials value for this EdrGetScoreRequestType.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this EdrGetScoreRequestType.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the surname_prefix value for this EdrGetScoreRequestType.
     * 
     * @return surname_prefix
     */
    public java.lang.String getSurname_prefix() {
        return surname_prefix;
    }


    /**
     * Sets the surname_prefix value for this EdrGetScoreRequestType.
     * 
     * @param surname_prefix
     */
    public void setSurname_prefix(java.lang.String surname_prefix) {
        this.surname_prefix = surname_prefix;
    }


    /**
     * Gets the gender value for this EdrGetScoreRequestType.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this EdrGetScoreRequestType.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the birth_date value for this EdrGetScoreRequestType.
     * 
     * @return birth_date
     */
    public java.lang.String getBirth_date() {
        return birth_date;
    }


    /**
     * Sets the birth_date value for this EdrGetScoreRequestType.
     * 
     * @param birth_date
     */
    public void setBirth_date(java.lang.String birth_date) {
        this.birth_date = birth_date;
    }


    /**
     * Gets the street value for this EdrGetScoreRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this EdrGetScoreRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_number value for this EdrGetScoreRequestType.
     * 
     * @return house_number
     */
    public java.lang.String getHouse_number() {
        return house_number;
    }


    /**
     * Sets the house_number value for this EdrGetScoreRequestType.
     * 
     * @param house_number
     */
    public void setHouse_number(java.lang.String house_number) {
        this.house_number = house_number;
    }


    /**
     * Gets the postcode value for this EdrGetScoreRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this EdrGetScoreRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the phone_number value for this EdrGetScoreRequestType.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this EdrGetScoreRequestType.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EdrGetScoreRequestType)) return false;
        EdrGetScoreRequestType other = (EdrGetScoreRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.surname_prefix==null && other.getSurname_prefix()==null) || 
             (this.surname_prefix!=null &&
              this.surname_prefix.equals(other.getSurname_prefix()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.birth_date==null && other.getBirth_date()==null) || 
             (this.birth_date!=null &&
              this.birth_date.equals(other.getBirth_date()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.house_number==null && other.getHouse_number()==null) || 
             (this.house_number!=null &&
              this.house_number.equals(other.getHouse_number()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number())));
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
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getSurname_prefix() != null) {
            _hashCode += getSurname_prefix().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getBirth_date() != null) {
            _hashCode += getBirth_date().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouse_number() != null) {
            _hashCode += getHouse_number().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getPhone_number() != null) {
            _hashCode += getPhone_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EdrGetScoreRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "edrGetScoreRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
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
        elemField.setFieldName("surname_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "surname_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gender"));
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
        elemField.setFieldName("phone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "phone_number"));
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
