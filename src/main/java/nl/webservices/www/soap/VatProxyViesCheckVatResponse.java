/**
 * VatProxyViesCheckVatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class VatProxyViesCheckVatResponse  implements java.io.Serializable {
    private java.lang.String country_code;

    private java.lang.String vat_number;

    private java.util.Date request_date;

    private boolean valid;

    private java.lang.String name;

    private java.lang.String address;

    public VatProxyViesCheckVatResponse() {
    }

    public VatProxyViesCheckVatResponse(
           java.lang.String country_code,
           java.lang.String vat_number,
           java.util.Date request_date,
           boolean valid,
           java.lang.String name,
           java.lang.String address) {
           this.country_code = country_code;
           this.vat_number = vat_number;
           this.request_date = request_date;
           this.valid = valid;
           this.name = name;
           this.address = address;
    }


    /**
     * Gets the country_code value for this VatProxyViesCheckVatResponse.
     * 
     * @return country_code
     */
    public java.lang.String getCountry_code() {
        return country_code;
    }


    /**
     * Sets the country_code value for this VatProxyViesCheckVatResponse.
     * 
     * @param country_code
     */
    public void setCountry_code(java.lang.String country_code) {
        this.country_code = country_code;
    }


    /**
     * Gets the vat_number value for this VatProxyViesCheckVatResponse.
     * 
     * @return vat_number
     */
    public java.lang.String getVat_number() {
        return vat_number;
    }


    /**
     * Sets the vat_number value for this VatProxyViesCheckVatResponse.
     * 
     * @param vat_number
     */
    public void setVat_number(java.lang.String vat_number) {
        this.vat_number = vat_number;
    }


    /**
     * Gets the request_date value for this VatProxyViesCheckVatResponse.
     * 
     * @return request_date
     */
    public java.util.Date getRequest_date() {
        return request_date;
    }


    /**
     * Sets the request_date value for this VatProxyViesCheckVatResponse.
     * 
     * @param request_date
     */
    public void setRequest_date(java.util.Date request_date) {
        this.request_date = request_date;
    }


    /**
     * Gets the valid value for this VatProxyViesCheckVatResponse.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this VatProxyViesCheckVatResponse.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the name value for this VatProxyViesCheckVatResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VatProxyViesCheckVatResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the address value for this VatProxyViesCheckVatResponse.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this VatProxyViesCheckVatResponse.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VatProxyViesCheckVatResponse)) return false;
        VatProxyViesCheckVatResponse other = (VatProxyViesCheckVatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country_code==null && other.getCountry_code()==null) || 
             (this.country_code!=null &&
              this.country_code.equals(other.getCountry_code()))) &&
            ((this.vat_number==null && other.getVat_number()==null) || 
             (this.vat_number!=null &&
              this.vat_number.equals(other.getVat_number()))) &&
            ((this.request_date==null && other.getRequest_date()==null) || 
             (this.request_date!=null &&
              this.request_date.equals(other.getRequest_date()))) &&
            this.valid == other.isValid() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getCountry_code() != null) {
            _hashCode += getCountry_code().hashCode();
        }
        if (getVat_number() != null) {
            _hashCode += getVat_number().hashCode();
        }
        if (getRequest_date() != null) {
            _hashCode += getRequest_date().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VatProxyViesCheckVatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "VatProxyViesCheckVatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vat_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "request_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
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
