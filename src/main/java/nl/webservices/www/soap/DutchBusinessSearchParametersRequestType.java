/**
 * DutchBusinessSearchParametersRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessSearchParametersRequestType  implements java.io.Serializable {
    private java.lang.String trade_name;

    private java.lang.String city;

    private java.lang.String street;

    private java.lang.String postcode;

    private int house_number;

    private java.lang.String house_number_addition;

    private java.lang.String telephone_number;

    private java.lang.String domain_name;

    private boolean strict_search;

    private int page;

    public DutchBusinessSearchParametersRequestType() {
    }

    public DutchBusinessSearchParametersRequestType(
           java.lang.String trade_name,
           java.lang.String city,
           java.lang.String street,
           java.lang.String postcode,
           int house_number,
           java.lang.String house_number_addition,
           java.lang.String telephone_number,
           java.lang.String domain_name,
           boolean strict_search,
           int page) {
           this.trade_name = trade_name;
           this.city = city;
           this.street = street;
           this.postcode = postcode;
           this.house_number = house_number;
           this.house_number_addition = house_number_addition;
           this.telephone_number = telephone_number;
           this.domain_name = domain_name;
           this.strict_search = strict_search;
           this.page = page;
    }


    /**
     * Gets the trade_name value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the city value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the street value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the postcode value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the house_number value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return house_number
     */
    public int getHouse_number() {
        return house_number;
    }


    /**
     * Sets the house_number value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param house_number
     */
    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }


    /**
     * Gets the house_number_addition value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return house_number_addition
     */
    public java.lang.String getHouse_number_addition() {
        return house_number_addition;
    }


    /**
     * Sets the house_number_addition value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param house_number_addition
     */
    public void setHouse_number_addition(java.lang.String house_number_addition) {
        this.house_number_addition = house_number_addition;
    }


    /**
     * Gets the telephone_number value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return telephone_number
     */
    public java.lang.String getTelephone_number() {
        return telephone_number;
    }


    /**
     * Sets the telephone_number value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param telephone_number
     */
    public void setTelephone_number(java.lang.String telephone_number) {
        this.telephone_number = telephone_number;
    }


    /**
     * Gets the domain_name value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the strict_search value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return strict_search
     */
    public boolean isStrict_search() {
        return strict_search;
    }


    /**
     * Sets the strict_search value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param strict_search
     */
    public void setStrict_search(boolean strict_search) {
        this.strict_search = strict_search;
    }


    /**
     * Gets the page value for this DutchBusinessSearchParametersRequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this DutchBusinessSearchParametersRequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessSearchParametersRequestType)) return false;
        DutchBusinessSearchParametersRequestType other = (DutchBusinessSearchParametersRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            this.house_number == other.getHouse_number() &&
            ((this.house_number_addition==null && other.getHouse_number_addition()==null) || 
             (this.house_number_addition!=null &&
              this.house_number_addition.equals(other.getHouse_number_addition()))) &&
            ((this.telephone_number==null && other.getTelephone_number()==null) || 
             (this.telephone_number!=null &&
              this.telephone_number.equals(other.getTelephone_number()))) &&
            ((this.domain_name==null && other.getDomain_name()==null) || 
             (this.domain_name!=null &&
              this.domain_name.equals(other.getDomain_name()))) &&
            this.strict_search == other.isStrict_search() &&
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
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        _hashCode += getHouse_number();
        if (getHouse_number_addition() != null) {
            _hashCode += getHouse_number_addition().hashCode();
        }
        if (getTelephone_number() != null) {
            _hashCode += getTelephone_number().hashCode();
        }
        if (getDomain_name() != null) {
            _hashCode += getDomain_name().hashCode();
        }
        _hashCode += (isStrict_search() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessSearchParametersRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dutchBusinessSearchParametersRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
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
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
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
        elemField.setFieldName("telephone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strict_search");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "strict_search"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
