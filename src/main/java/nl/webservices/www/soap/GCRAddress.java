/**
 * GCRAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRAddress  implements java.io.Serializable {
    private java.lang.Boolean is_current;

    private java.lang.Integer address_code;

    private java.lang.String address_text;

    private java.util.Date date_from;

    private java.util.Date date_until;

    private java.lang.String street;

    private java.lang.String house_no;

    private java.lang.String house_no_addition;

    private java.lang.String pobox;

    private java.lang.String postcode;

    private java.lang.String residence;

    private java.lang.Integer country_code;

    private java.lang.String country_text;

    public GCRAddress() {
    }

    public GCRAddress(
           java.lang.Boolean is_current,
           java.lang.Integer address_code,
           java.lang.String address_text,
           java.util.Date date_from,
           java.util.Date date_until,
           java.lang.String street,
           java.lang.String house_no,
           java.lang.String house_no_addition,
           java.lang.String pobox,
           java.lang.String postcode,
           java.lang.String residence,
           java.lang.Integer country_code,
           java.lang.String country_text) {
           this.is_current = is_current;
           this.address_code = address_code;
           this.address_text = address_text;
           this.date_from = date_from;
           this.date_until = date_until;
           this.street = street;
           this.house_no = house_no;
           this.house_no_addition = house_no_addition;
           this.pobox = pobox;
           this.postcode = postcode;
           this.residence = residence;
           this.country_code = country_code;
           this.country_text = country_text;
    }


    /**
     * Gets the is_current value for this GCRAddress.
     * 
     * @return is_current
     */
    public java.lang.Boolean getIs_current() {
        return is_current;
    }


    /**
     * Sets the is_current value for this GCRAddress.
     * 
     * @param is_current
     */
    public void setIs_current(java.lang.Boolean is_current) {
        this.is_current = is_current;
    }


    /**
     * Gets the address_code value for this GCRAddress.
     * 
     * @return address_code
     */
    public java.lang.Integer getAddress_code() {
        return address_code;
    }


    /**
     * Sets the address_code value for this GCRAddress.
     * 
     * @param address_code
     */
    public void setAddress_code(java.lang.Integer address_code) {
        this.address_code = address_code;
    }


    /**
     * Gets the address_text value for this GCRAddress.
     * 
     * @return address_text
     */
    public java.lang.String getAddress_text() {
        return address_text;
    }


    /**
     * Sets the address_text value for this GCRAddress.
     * 
     * @param address_text
     */
    public void setAddress_text(java.lang.String address_text) {
        this.address_text = address_text;
    }


    /**
     * Gets the date_from value for this GCRAddress.
     * 
     * @return date_from
     */
    public java.util.Date getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this GCRAddress.
     * 
     * @param date_from
     */
    public void setDate_from(java.util.Date date_from) {
        this.date_from = date_from;
    }


    /**
     * Gets the date_until value for this GCRAddress.
     * 
     * @return date_until
     */
    public java.util.Date getDate_until() {
        return date_until;
    }


    /**
     * Sets the date_until value for this GCRAddress.
     * 
     * @param date_until
     */
    public void setDate_until(java.util.Date date_until) {
        this.date_until = date_until;
    }


    /**
     * Gets the street value for this GCRAddress.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this GCRAddress.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_no value for this GCRAddress.
     * 
     * @return house_no
     */
    public java.lang.String getHouse_no() {
        return house_no;
    }


    /**
     * Sets the house_no value for this GCRAddress.
     * 
     * @param house_no
     */
    public void setHouse_no(java.lang.String house_no) {
        this.house_no = house_no;
    }


    /**
     * Gets the house_no_addition value for this GCRAddress.
     * 
     * @return house_no_addition
     */
    public java.lang.String getHouse_no_addition() {
        return house_no_addition;
    }


    /**
     * Sets the house_no_addition value for this GCRAddress.
     * 
     * @param house_no_addition
     */
    public void setHouse_no_addition(java.lang.String house_no_addition) {
        this.house_no_addition = house_no_addition;
    }


    /**
     * Gets the pobox value for this GCRAddress.
     * 
     * @return pobox
     */
    public java.lang.String getPobox() {
        return pobox;
    }


    /**
     * Sets the pobox value for this GCRAddress.
     * 
     * @param pobox
     */
    public void setPobox(java.lang.String pobox) {
        this.pobox = pobox;
    }


    /**
     * Gets the postcode value for this GCRAddress.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this GCRAddress.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the residence value for this GCRAddress.
     * 
     * @return residence
     */
    public java.lang.String getResidence() {
        return residence;
    }


    /**
     * Sets the residence value for this GCRAddress.
     * 
     * @param residence
     */
    public void setResidence(java.lang.String residence) {
        this.residence = residence;
    }


    /**
     * Gets the country_code value for this GCRAddress.
     * 
     * @return country_code
     */
    public java.lang.Integer getCountry_code() {
        return country_code;
    }


    /**
     * Sets the country_code value for this GCRAddress.
     * 
     * @param country_code
     */
    public void setCountry_code(java.lang.Integer country_code) {
        this.country_code = country_code;
    }


    /**
     * Gets the country_text value for this GCRAddress.
     * 
     * @return country_text
     */
    public java.lang.String getCountry_text() {
        return country_text;
    }


    /**
     * Sets the country_text value for this GCRAddress.
     * 
     * @param country_text
     */
    public void setCountry_text(java.lang.String country_text) {
        this.country_text = country_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRAddress)) return false;
        GCRAddress other = (GCRAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.is_current==null && other.getIs_current()==null) || 
             (this.is_current!=null &&
              this.is_current.equals(other.getIs_current()))) &&
            ((this.address_code==null && other.getAddress_code()==null) || 
             (this.address_code!=null &&
              this.address_code.equals(other.getAddress_code()))) &&
            ((this.address_text==null && other.getAddress_text()==null) || 
             (this.address_text!=null &&
              this.address_text.equals(other.getAddress_text()))) &&
            ((this.date_from==null && other.getDate_from()==null) || 
             (this.date_from!=null &&
              this.date_from.equals(other.getDate_from()))) &&
            ((this.date_until==null && other.getDate_until()==null) || 
             (this.date_until!=null &&
              this.date_until.equals(other.getDate_until()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.house_no==null && other.getHouse_no()==null) || 
             (this.house_no!=null &&
              this.house_no.equals(other.getHouse_no()))) &&
            ((this.house_no_addition==null && other.getHouse_no_addition()==null) || 
             (this.house_no_addition!=null &&
              this.house_no_addition.equals(other.getHouse_no_addition()))) &&
            ((this.pobox==null && other.getPobox()==null) || 
             (this.pobox!=null &&
              this.pobox.equals(other.getPobox()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.residence==null && other.getResidence()==null) || 
             (this.residence!=null &&
              this.residence.equals(other.getResidence()))) &&
            ((this.country_code==null && other.getCountry_code()==null) || 
             (this.country_code!=null &&
              this.country_code.equals(other.getCountry_code()))) &&
            ((this.country_text==null && other.getCountry_text()==null) || 
             (this.country_text!=null &&
              this.country_text.equals(other.getCountry_text())));
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
        if (getIs_current() != null) {
            _hashCode += getIs_current().hashCode();
        }
        if (getAddress_code() != null) {
            _hashCode += getAddress_code().hashCode();
        }
        if (getAddress_text() != null) {
            _hashCode += getAddress_text().hashCode();
        }
        if (getDate_from() != null) {
            _hashCode += getDate_from().hashCode();
        }
        if (getDate_until() != null) {
            _hashCode += getDate_until().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouse_no() != null) {
            _hashCode += getHouse_no().hashCode();
        }
        if (getHouse_no_addition() != null) {
            _hashCode += getHouse_no_addition().hashCode();
        }
        if (getPobox() != null) {
            _hashCode += getPobox().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getResidence() != null) {
            _hashCode += getResidence().hashCode();
        }
        if (getCountry_code() != null) {
            _hashCode += getCountry_code().hashCode();
        }
        if (getCountry_text() != null) {
            _hashCode += getCountry_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_current");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_until");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_until"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pobox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pobox"));
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
        elemField.setFieldName("residence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "residence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
