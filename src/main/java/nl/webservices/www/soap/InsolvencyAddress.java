/**
 * InsolvencyAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyAddress  implements java.io.Serializable {
    private java.lang.String street;

    private java.math.BigInteger house_number;

    private java.lang.String addition;

    private java.lang.String postcode;

    private java.lang.String city;

    private java.lang.String phone_number;

    private java.lang.String type;

    private java.util.Date start_date;

    public InsolvencyAddress() {
    }

    public InsolvencyAddress(
           java.lang.String street,
           java.math.BigInteger house_number,
           java.lang.String addition,
           java.lang.String postcode,
           java.lang.String city,
           java.lang.String phone_number,
           java.lang.String type,
           java.util.Date start_date) {
           this.street = street;
           this.house_number = house_number;
           this.addition = addition;
           this.postcode = postcode;
           this.city = city;
           this.phone_number = phone_number;
           this.type = type;
           this.start_date = start_date;
    }


    /**
     * Gets the street value for this InsolvencyAddress.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this InsolvencyAddress.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_number value for this InsolvencyAddress.
     * 
     * @return house_number
     */
    public java.math.BigInteger getHouse_number() {
        return house_number;
    }


    /**
     * Sets the house_number value for this InsolvencyAddress.
     * 
     * @param house_number
     */
    public void setHouse_number(java.math.BigInteger house_number) {
        this.house_number = house_number;
    }


    /**
     * Gets the addition value for this InsolvencyAddress.
     * 
     * @return addition
     */
    public java.lang.String getAddition() {
        return addition;
    }


    /**
     * Sets the addition value for this InsolvencyAddress.
     * 
     * @param addition
     */
    public void setAddition(java.lang.String addition) {
        this.addition = addition;
    }


    /**
     * Gets the postcode value for this InsolvencyAddress.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this InsolvencyAddress.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the city value for this InsolvencyAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this InsolvencyAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the phone_number value for this InsolvencyAddress.
     * 
     * @return phone_number
     */
    public java.lang.String getPhone_number() {
        return phone_number;
    }


    /**
     * Sets the phone_number value for this InsolvencyAddress.
     * 
     * @param phone_number
     */
    public void setPhone_number(java.lang.String phone_number) {
        this.phone_number = phone_number;
    }


    /**
     * Gets the type value for this InsolvencyAddress.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this InsolvencyAddress.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the start_date value for this InsolvencyAddress.
     * 
     * @return start_date
     */
    public java.util.Date getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this InsolvencyAddress.
     * 
     * @param start_date
     */
    public void setStart_date(java.util.Date start_date) {
        this.start_date = start_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyAddress)) return false;
        InsolvencyAddress other = (InsolvencyAddress) obj;
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
            ((this.house_number==null && other.getHouse_number()==null) || 
             (this.house_number!=null &&
              this.house_number.equals(other.getHouse_number()))) &&
            ((this.addition==null && other.getAddition()==null) || 
             (this.addition!=null &&
              this.addition.equals(other.getAddition()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.phone_number==null && other.getPhone_number()==null) || 
             (this.phone_number!=null &&
              this.phone_number.equals(other.getPhone_number()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date())));
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
        if (getHouse_number() != null) {
            _hashCode += getHouse_number().hashCode();
        }
        if (getAddition() != null) {
            _hashCode += getAddition().hashCode();
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "phone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
