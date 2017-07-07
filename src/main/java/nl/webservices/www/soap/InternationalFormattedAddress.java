/**
 * InternationalFormattedAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InternationalFormattedAddress  implements java.io.Serializable {
    private float matchrate;

    private java.lang.String street;

    private java.lang.String housenr;

    private java.lang.String pobox;

    private java.lang.String locality;

    private java.lang.String postcode;

    private java.lang.String province;

    private java.lang.String country;

    private java.lang.String countryspecific_locality;

    private java.lang.String delivery_address;

    private java.lang.String formatted_address;

    private java.lang.String organization;

    private java.lang.String department;

    private java.lang.String contact;

    private java.lang.String building;

    public InternationalFormattedAddress() {
    }

    public InternationalFormattedAddress(
           float matchrate,
           java.lang.String street,
           java.lang.String housenr,
           java.lang.String pobox,
           java.lang.String locality,
           java.lang.String postcode,
           java.lang.String province,
           java.lang.String country,
           java.lang.String countryspecific_locality,
           java.lang.String delivery_address,
           java.lang.String formatted_address,
           java.lang.String organization,
           java.lang.String department,
           java.lang.String contact,
           java.lang.String building) {
           this.matchrate = matchrate;
           this.street = street;
           this.housenr = housenr;
           this.pobox = pobox;
           this.locality = locality;
           this.postcode = postcode;
           this.province = province;
           this.country = country;
           this.countryspecific_locality = countryspecific_locality;
           this.delivery_address = delivery_address;
           this.formatted_address = formatted_address;
           this.organization = organization;
           this.department = department;
           this.contact = contact;
           this.building = building;
    }


    /**
     * Gets the matchrate value for this InternationalFormattedAddress.
     * 
     * @return matchrate
     */
    public float getMatchrate() {
        return matchrate;
    }


    /**
     * Sets the matchrate value for this InternationalFormattedAddress.
     * 
     * @param matchrate
     */
    public void setMatchrate(float matchrate) {
        this.matchrate = matchrate;
    }


    /**
     * Gets the street value for this InternationalFormattedAddress.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this InternationalFormattedAddress.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the housenr value for this InternationalFormattedAddress.
     * 
     * @return housenr
     */
    public java.lang.String getHousenr() {
        return housenr;
    }


    /**
     * Sets the housenr value for this InternationalFormattedAddress.
     * 
     * @param housenr
     */
    public void setHousenr(java.lang.String housenr) {
        this.housenr = housenr;
    }


    /**
     * Gets the pobox value for this InternationalFormattedAddress.
     * 
     * @return pobox
     */
    public java.lang.String getPobox() {
        return pobox;
    }


    /**
     * Sets the pobox value for this InternationalFormattedAddress.
     * 
     * @param pobox
     */
    public void setPobox(java.lang.String pobox) {
        this.pobox = pobox;
    }


    /**
     * Gets the locality value for this InternationalFormattedAddress.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this InternationalFormattedAddress.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the postcode value for this InternationalFormattedAddress.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this InternationalFormattedAddress.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the province value for this InternationalFormattedAddress.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this InternationalFormattedAddress.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the country value for this InternationalFormattedAddress.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this InternationalFormattedAddress.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the countryspecific_locality value for this InternationalFormattedAddress.
     * 
     * @return countryspecific_locality
     */
    public java.lang.String getCountryspecific_locality() {
        return countryspecific_locality;
    }


    /**
     * Sets the countryspecific_locality value for this InternationalFormattedAddress.
     * 
     * @param countryspecific_locality
     */
    public void setCountryspecific_locality(java.lang.String countryspecific_locality) {
        this.countryspecific_locality = countryspecific_locality;
    }


    /**
     * Gets the delivery_address value for this InternationalFormattedAddress.
     * 
     * @return delivery_address
     */
    public java.lang.String getDelivery_address() {
        return delivery_address;
    }


    /**
     * Sets the delivery_address value for this InternationalFormattedAddress.
     * 
     * @param delivery_address
     */
    public void setDelivery_address(java.lang.String delivery_address) {
        this.delivery_address = delivery_address;
    }


    /**
     * Gets the formatted_address value for this InternationalFormattedAddress.
     * 
     * @return formatted_address
     */
    public java.lang.String getFormatted_address() {
        return formatted_address;
    }


    /**
     * Sets the formatted_address value for this InternationalFormattedAddress.
     * 
     * @param formatted_address
     */
    public void setFormatted_address(java.lang.String formatted_address) {
        this.formatted_address = formatted_address;
    }


    /**
     * Gets the organization value for this InternationalFormattedAddress.
     * 
     * @return organization
     */
    public java.lang.String getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this InternationalFormattedAddress.
     * 
     * @param organization
     */
    public void setOrganization(java.lang.String organization) {
        this.organization = organization;
    }


    /**
     * Gets the department value for this InternationalFormattedAddress.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this InternationalFormattedAddress.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the contact value for this InternationalFormattedAddress.
     * 
     * @return contact
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this InternationalFormattedAddress.
     * 
     * @param contact
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the building value for this InternationalFormattedAddress.
     * 
     * @return building
     */
    public java.lang.String getBuilding() {
        return building;
    }


    /**
     * Sets the building value for this InternationalFormattedAddress.
     * 
     * @param building
     */
    public void setBuilding(java.lang.String building) {
        this.building = building;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalFormattedAddress)) return false;
        InternationalFormattedAddress other = (InternationalFormattedAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.matchrate == other.getMatchrate() &&
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
            ((this.countryspecific_locality==null && other.getCountryspecific_locality()==null) || 
             (this.countryspecific_locality!=null &&
              this.countryspecific_locality.equals(other.getCountryspecific_locality()))) &&
            ((this.delivery_address==null && other.getDelivery_address()==null) || 
             (this.delivery_address!=null &&
              this.delivery_address.equals(other.getDelivery_address()))) &&
            ((this.formatted_address==null && other.getFormatted_address()==null) || 
             (this.formatted_address!=null &&
              this.formatted_address.equals(other.getFormatted_address()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.building==null && other.getBuilding()==null) || 
             (this.building!=null &&
              this.building.equals(other.getBuilding())));
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
        _hashCode += new Float(getMatchrate()).hashCode();
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
        if (getCountryspecific_locality() != null) {
            _hashCode += getCountryspecific_locality().hashCode();
        }
        if (getDelivery_address() != null) {
            _hashCode += getDelivery_address().hashCode();
        }
        if (getFormatted_address() != null) {
            _hashCode += getFormatted_address().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getBuilding() != null) {
            _hashCode += getBuilding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalFormattedAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InternationalFormattedAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "matchrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("countryspecific_locality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "countryspecific_locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "delivery_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatted_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "formatted_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("building");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "building"));
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
