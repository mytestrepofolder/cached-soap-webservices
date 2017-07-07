/**
 * InsolvencyConcernedPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyConcernedPerson  implements java.io.Serializable {
    private java.lang.String first_name;

    private java.lang.String initials;

    private java.lang.String prefix;

    private java.lang.String last_name;

    private nl.webservices.www.soap.InsolvencyAddresses addresses;

    private java.util.Date birth_date;

    private java.lang.String birth_city;

    private java.lang.String birth_country;

    private java.util.Date deceased_date;

    public InsolvencyConcernedPerson() {
    }

    public InsolvencyConcernedPerson(
           java.lang.String first_name,
           java.lang.String initials,
           java.lang.String prefix,
           java.lang.String last_name,
           nl.webservices.www.soap.InsolvencyAddresses addresses,
           java.util.Date birth_date,
           java.lang.String birth_city,
           java.lang.String birth_country,
           java.util.Date deceased_date) {
           this.first_name = first_name;
           this.initials = initials;
           this.prefix = prefix;
           this.last_name = last_name;
           this.addresses = addresses;
           this.birth_date = birth_date;
           this.birth_city = birth_city;
           this.birth_country = birth_country;
           this.deceased_date = deceased_date;
    }


    /**
     * Gets the first_name value for this InsolvencyConcernedPerson.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this InsolvencyConcernedPerson.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the initials value for this InsolvencyConcernedPerson.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this InsolvencyConcernedPerson.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the prefix value for this InsolvencyConcernedPerson.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this InsolvencyConcernedPerson.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the last_name value for this InsolvencyConcernedPerson.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this InsolvencyConcernedPerson.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the addresses value for this InsolvencyConcernedPerson.
     * 
     * @return addresses
     */
    public nl.webservices.www.soap.InsolvencyAddresses getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this InsolvencyConcernedPerson.
     * 
     * @param addresses
     */
    public void setAddresses(nl.webservices.www.soap.InsolvencyAddresses addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the birth_date value for this InsolvencyConcernedPerson.
     * 
     * @return birth_date
     */
    public java.util.Date getBirth_date() {
        return birth_date;
    }


    /**
     * Sets the birth_date value for this InsolvencyConcernedPerson.
     * 
     * @param birth_date
     */
    public void setBirth_date(java.util.Date birth_date) {
        this.birth_date = birth_date;
    }


    /**
     * Gets the birth_city value for this InsolvencyConcernedPerson.
     * 
     * @return birth_city
     */
    public java.lang.String getBirth_city() {
        return birth_city;
    }


    /**
     * Sets the birth_city value for this InsolvencyConcernedPerson.
     * 
     * @param birth_city
     */
    public void setBirth_city(java.lang.String birth_city) {
        this.birth_city = birth_city;
    }


    /**
     * Gets the birth_country value for this InsolvencyConcernedPerson.
     * 
     * @return birth_country
     */
    public java.lang.String getBirth_country() {
        return birth_country;
    }


    /**
     * Sets the birth_country value for this InsolvencyConcernedPerson.
     * 
     * @param birth_country
     */
    public void setBirth_country(java.lang.String birth_country) {
        this.birth_country = birth_country;
    }


    /**
     * Gets the deceased_date value for this InsolvencyConcernedPerson.
     * 
     * @return deceased_date
     */
    public java.util.Date getDeceased_date() {
        return deceased_date;
    }


    /**
     * Sets the deceased_date value for this InsolvencyConcernedPerson.
     * 
     * @param deceased_date
     */
    public void setDeceased_date(java.util.Date deceased_date) {
        this.deceased_date = deceased_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyConcernedPerson)) return false;
        InsolvencyConcernedPerson other = (InsolvencyConcernedPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              this.addresses.equals(other.getAddresses()))) &&
            ((this.birth_date==null && other.getBirth_date()==null) || 
             (this.birth_date!=null &&
              this.birth_date.equals(other.getBirth_date()))) &&
            ((this.birth_city==null && other.getBirth_city()==null) || 
             (this.birth_city!=null &&
              this.birth_city.equals(other.getBirth_city()))) &&
            ((this.birth_country==null && other.getBirth_country()==null) || 
             (this.birth_country!=null &&
              this.birth_country.equals(other.getBirth_country()))) &&
            ((this.deceased_date==null && other.getDeceased_date()==null) || 
             (this.deceased_date!=null &&
              this.deceased_date.equals(other.getDeceased_date())));
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
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
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
        if (getAddresses() != null) {
            _hashCode += getAddresses().hashCode();
        }
        if (getBirth_date() != null) {
            _hashCode += getBirth_date().hashCode();
        }
        if (getBirth_city() != null) {
            _hashCode += getBirth_city().hashCode();
        }
        if (getBirth_country() != null) {
            _hashCode += getBirth_country().hashCode();
        }
        if (getDeceased_date() != null) {
            _hashCode += getDeceased_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyConcernedPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyConcernedPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAddresses"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "birth_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "birth_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birth_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "birth_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deceased_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deceased_date"));
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
