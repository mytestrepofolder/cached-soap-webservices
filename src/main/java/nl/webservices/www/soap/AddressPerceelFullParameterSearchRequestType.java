/**
 * AddressPerceelFullParameterSearchRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AddressPerceelFullParameterSearchRequestType  implements java.io.Serializable {
    private java.lang.String province;

    private java.lang.String district;

    private java.lang.String city;

    private java.lang.String street;

    private int houseNo;

    private java.lang.String houseNoAddition;

    private java.lang.String nbcode;

    private java.lang.String lettercombination;

    private java.lang.String addresstype;

    private int page;

    public AddressPerceelFullParameterSearchRequestType() {
    }

    public AddressPerceelFullParameterSearchRequestType(
           java.lang.String province,
           java.lang.String district,
           java.lang.String city,
           java.lang.String street,
           int houseNo,
           java.lang.String houseNoAddition,
           java.lang.String nbcode,
           java.lang.String lettercombination,
           java.lang.String addresstype,
           int page) {
           this.province = province;
           this.district = district;
           this.city = city;
           this.street = street;
           this.houseNo = houseNo;
           this.houseNoAddition = houseNoAddition;
           this.nbcode = nbcode;
           this.lettercombination = lettercombination;
           this.addresstype = addresstype;
           this.page = page;
    }


    /**
     * Gets the province value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the district value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the city value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the street value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the houseNo value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return houseNo
     */
    public int getHouseNo() {
        return houseNo;
    }


    /**
     * Sets the houseNo value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param houseNo
     */
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }


    /**
     * Gets the houseNoAddition value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return houseNoAddition
     */
    public java.lang.String getHouseNoAddition() {
        return houseNoAddition;
    }


    /**
     * Sets the houseNoAddition value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param houseNoAddition
     */
    public void setHouseNoAddition(java.lang.String houseNoAddition) {
        this.houseNoAddition = houseNoAddition;
    }


    /**
     * Gets the nbcode value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return nbcode
     */
    public java.lang.String getNbcode() {
        return nbcode;
    }


    /**
     * Sets the nbcode value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param nbcode
     */
    public void setNbcode(java.lang.String nbcode) {
        this.nbcode = nbcode;
    }


    /**
     * Gets the lettercombination value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return lettercombination
     */
    public java.lang.String getLettercombination() {
        return lettercombination;
    }


    /**
     * Sets the lettercombination value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param lettercombination
     */
    public void setLettercombination(java.lang.String lettercombination) {
        this.lettercombination = lettercombination;
    }


    /**
     * Gets the addresstype value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return addresstype
     */
    public java.lang.String getAddresstype() {
        return addresstype;
    }


    /**
     * Sets the addresstype value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param addresstype
     */
    public void setAddresstype(java.lang.String addresstype) {
        this.addresstype = addresstype;
    }


    /**
     * Gets the page value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this AddressPerceelFullParameterSearchRequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressPerceelFullParameterSearchRequestType)) return false;
        AddressPerceelFullParameterSearchRequestType other = (AddressPerceelFullParameterSearchRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            this.houseNo == other.getHouseNo() &&
            ((this.houseNoAddition==null && other.getHouseNoAddition()==null) || 
             (this.houseNoAddition!=null &&
              this.houseNoAddition.equals(other.getHouseNoAddition()))) &&
            ((this.nbcode==null && other.getNbcode()==null) || 
             (this.nbcode!=null &&
              this.nbcode.equals(other.getNbcode()))) &&
            ((this.lettercombination==null && other.getLettercombination()==null) || 
             (this.lettercombination!=null &&
              this.lettercombination.equals(other.getLettercombination()))) &&
            ((this.addresstype==null && other.getAddresstype()==null) || 
             (this.addresstype!=null &&
              this.addresstype.equals(other.getAddresstype()))) &&
            this.page == other.getPage();
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
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        _hashCode += getHouseNo();
        if (getHouseNoAddition() != null) {
            _hashCode += getHouseNoAddition().hashCode();
        }
        if (getNbcode() != null) {
            _hashCode += getNbcode().hashCode();
        }
        if (getLettercombination() != null) {
            _hashCode += getLettercombination().hashCode();
        }
        if (getAddresstype() != null) {
            _hashCode += getAddresstype().hashCode();
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressPerceelFullParameterSearchRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addressPerceelFullParameterSearchRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "district"));
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
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "houseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNoAddition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "houseNoAddition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lettercombination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "lettercombination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresstype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addresstype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
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
