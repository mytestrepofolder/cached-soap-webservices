/**
 * InsolvencyAffectedCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyAffectedCompany  implements java.io.Serializable {
    private java.lang.String trade_name;

    private java.lang.String coc_number;

    private java.lang.String coc_registered_city;

    private nl.webservices.www.soap.InsolvencyAddresses addresses;

    private java.lang.Boolean is_former;

    public InsolvencyAffectedCompany() {
    }

    public InsolvencyAffectedCompany(
           java.lang.String trade_name,
           java.lang.String coc_number,
           java.lang.String coc_registered_city,
           nl.webservices.www.soap.InsolvencyAddresses addresses,
           java.lang.Boolean is_former) {
           this.trade_name = trade_name;
           this.coc_number = coc_number;
           this.coc_registered_city = coc_registered_city;
           this.addresses = addresses;
           this.is_former = is_former;
    }


    /**
     * Gets the trade_name value for this InsolvencyAffectedCompany.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this InsolvencyAffectedCompany.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the coc_number value for this InsolvencyAffectedCompany.
     * 
     * @return coc_number
     */
    public java.lang.String getCoc_number() {
        return coc_number;
    }


    /**
     * Sets the coc_number value for this InsolvencyAffectedCompany.
     * 
     * @param coc_number
     */
    public void setCoc_number(java.lang.String coc_number) {
        this.coc_number = coc_number;
    }


    /**
     * Gets the coc_registered_city value for this InsolvencyAffectedCompany.
     * 
     * @return coc_registered_city
     */
    public java.lang.String getCoc_registered_city() {
        return coc_registered_city;
    }


    /**
     * Sets the coc_registered_city value for this InsolvencyAffectedCompany.
     * 
     * @param coc_registered_city
     */
    public void setCoc_registered_city(java.lang.String coc_registered_city) {
        this.coc_registered_city = coc_registered_city;
    }


    /**
     * Gets the addresses value for this InsolvencyAffectedCompany.
     * 
     * @return addresses
     */
    public nl.webservices.www.soap.InsolvencyAddresses getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this InsolvencyAffectedCompany.
     * 
     * @param addresses
     */
    public void setAddresses(nl.webservices.www.soap.InsolvencyAddresses addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the is_former value for this InsolvencyAffectedCompany.
     * 
     * @return is_former
     */
    public java.lang.Boolean getIs_former() {
        return is_former;
    }


    /**
     * Sets the is_former value for this InsolvencyAffectedCompany.
     * 
     * @param is_former
     */
    public void setIs_former(java.lang.Boolean is_former) {
        this.is_former = is_former;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyAffectedCompany)) return false;
        InsolvencyAffectedCompany other = (InsolvencyAffectedCompany) obj;
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
            ((this.coc_number==null && other.getCoc_number()==null) || 
             (this.coc_number!=null &&
              this.coc_number.equals(other.getCoc_number()))) &&
            ((this.coc_registered_city==null && other.getCoc_registered_city()==null) || 
             (this.coc_registered_city!=null &&
              this.coc_registered_city.equals(other.getCoc_registered_city()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              this.addresses.equals(other.getAddresses()))) &&
            ((this.is_former==null && other.getIs_former()==null) || 
             (this.is_former!=null &&
              this.is_former.equals(other.getIs_former())));
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
        if (getCoc_number() != null) {
            _hashCode += getCoc_number().hashCode();
        }
        if (getCoc_registered_city() != null) {
            _hashCode += getCoc_registered_city().hashCode();
        }
        if (getAddresses() != null) {
            _hashCode += getAddresses().hashCode();
        }
        if (getIs_former() != null) {
            _hashCode += getIs_former().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyAffectedCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAffectedCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coc_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coc_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coc_registered_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "coc_registered_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("is_former");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_former"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
