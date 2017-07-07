/**
 * DutchBusinessPersonV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPersonV3  implements java.io.Serializable {
    private java.lang.String full_name;

    private java.lang.String first_name;

    private java.lang.String title;

    private java.lang.String initials;

    private java.lang.String last_name;

    private java.lang.String gender;

    private nl.webservices.www.soap.DutchBusinessDateV3 date_deceased;

    private nl.webservices.www.soap.DutchBusinessDateV3 date_of_birth;

    private java.lang.String place_of_birth;

    private java.lang.String country_of_birth;

    public DutchBusinessPersonV3() {
    }

    public DutchBusinessPersonV3(
           java.lang.String full_name,
           java.lang.String first_name,
           java.lang.String title,
           java.lang.String initials,
           java.lang.String last_name,
           java.lang.String gender,
           nl.webservices.www.soap.DutchBusinessDateV3 date_deceased,
           nl.webservices.www.soap.DutchBusinessDateV3 date_of_birth,
           java.lang.String place_of_birth,
           java.lang.String country_of_birth) {
           this.full_name = full_name;
           this.first_name = first_name;
           this.title = title;
           this.initials = initials;
           this.last_name = last_name;
           this.gender = gender;
           this.date_deceased = date_deceased;
           this.date_of_birth = date_of_birth;
           this.place_of_birth = place_of_birth;
           this.country_of_birth = country_of_birth;
    }


    /**
     * Gets the full_name value for this DutchBusinessPersonV3.
     * 
     * @return full_name
     */
    public java.lang.String getFull_name() {
        return full_name;
    }


    /**
     * Sets the full_name value for this DutchBusinessPersonV3.
     * 
     * @param full_name
     */
    public void setFull_name(java.lang.String full_name) {
        this.full_name = full_name;
    }


    /**
     * Gets the first_name value for this DutchBusinessPersonV3.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this DutchBusinessPersonV3.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the title value for this DutchBusinessPersonV3.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DutchBusinessPersonV3.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the initials value for this DutchBusinessPersonV3.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this DutchBusinessPersonV3.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the last_name value for this DutchBusinessPersonV3.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this DutchBusinessPersonV3.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the gender value for this DutchBusinessPersonV3.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this DutchBusinessPersonV3.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the date_deceased value for this DutchBusinessPersonV3.
     * 
     * @return date_deceased
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getDate_deceased() {
        return date_deceased;
    }


    /**
     * Sets the date_deceased value for this DutchBusinessPersonV3.
     * 
     * @param date_deceased
     */
    public void setDate_deceased(nl.webservices.www.soap.DutchBusinessDateV3 date_deceased) {
        this.date_deceased = date_deceased;
    }


    /**
     * Gets the date_of_birth value for this DutchBusinessPersonV3.
     * 
     * @return date_of_birth
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getDate_of_birth() {
        return date_of_birth;
    }


    /**
     * Sets the date_of_birth value for this DutchBusinessPersonV3.
     * 
     * @param date_of_birth
     */
    public void setDate_of_birth(nl.webservices.www.soap.DutchBusinessDateV3 date_of_birth) {
        this.date_of_birth = date_of_birth;
    }


    /**
     * Gets the place_of_birth value for this DutchBusinessPersonV3.
     * 
     * @return place_of_birth
     */
    public java.lang.String getPlace_of_birth() {
        return place_of_birth;
    }


    /**
     * Sets the place_of_birth value for this DutchBusinessPersonV3.
     * 
     * @param place_of_birth
     */
    public void setPlace_of_birth(java.lang.String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }


    /**
     * Gets the country_of_birth value for this DutchBusinessPersonV3.
     * 
     * @return country_of_birth
     */
    public java.lang.String getCountry_of_birth() {
        return country_of_birth;
    }


    /**
     * Sets the country_of_birth value for this DutchBusinessPersonV3.
     * 
     * @param country_of_birth
     */
    public void setCountry_of_birth(java.lang.String country_of_birth) {
        this.country_of_birth = country_of_birth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPersonV3)) return false;
        DutchBusinessPersonV3 other = (DutchBusinessPersonV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.full_name==null && other.getFull_name()==null) || 
             (this.full_name!=null &&
              this.full_name.equals(other.getFull_name()))) &&
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.date_deceased==null && other.getDate_deceased()==null) || 
             (this.date_deceased!=null &&
              this.date_deceased.equals(other.getDate_deceased()))) &&
            ((this.date_of_birth==null && other.getDate_of_birth()==null) || 
             (this.date_of_birth!=null &&
              this.date_of_birth.equals(other.getDate_of_birth()))) &&
            ((this.place_of_birth==null && other.getPlace_of_birth()==null) || 
             (this.place_of_birth!=null &&
              this.place_of_birth.equals(other.getPlace_of_birth()))) &&
            ((this.country_of_birth==null && other.getCountry_of_birth()==null) || 
             (this.country_of_birth!=null &&
              this.country_of_birth.equals(other.getCountry_of_birth())));
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
        if (getFull_name() != null) {
            _hashCode += getFull_name().hashCode();
        }
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getDate_deceased() != null) {
            _hashCode += getDate_deceased().hashCode();
        }
        if (getDate_of_birth() != null) {
            _hashCode += getDate_of_birth().hashCode();
        }
        if (getPlace_of_birth() != null) {
            _hashCode += getPlace_of_birth().hashCode();
        }
        if (getCountry_of_birth() != null) {
            _hashCode += getCountry_of_birth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPersonV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPersonV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("full_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "full_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "title"));
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
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_deceased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_deceased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "place_of_birth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_of_birth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_of_birth"));
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
