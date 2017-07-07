/**
 * GraydonCreditSearchNameRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditSearchNameRequestType  implements java.io.Serializable {
    private java.lang.String company_name;

    private java.lang.String residence;

    private java.lang.String country_iso2;

    public GraydonCreditSearchNameRequestType() {
    }

    public GraydonCreditSearchNameRequestType(
           java.lang.String company_name,
           java.lang.String residence,
           java.lang.String country_iso2) {
           this.company_name = company_name;
           this.residence = residence;
           this.country_iso2 = country_iso2;
    }


    /**
     * Gets the company_name value for this GraydonCreditSearchNameRequestType.
     * 
     * @return company_name
     */
    public java.lang.String getCompany_name() {
        return company_name;
    }


    /**
     * Sets the company_name value for this GraydonCreditSearchNameRequestType.
     * 
     * @param company_name
     */
    public void setCompany_name(java.lang.String company_name) {
        this.company_name = company_name;
    }


    /**
     * Gets the residence value for this GraydonCreditSearchNameRequestType.
     * 
     * @return residence
     */
    public java.lang.String getResidence() {
        return residence;
    }


    /**
     * Sets the residence value for this GraydonCreditSearchNameRequestType.
     * 
     * @param residence
     */
    public void setResidence(java.lang.String residence) {
        this.residence = residence;
    }


    /**
     * Gets the country_iso2 value for this GraydonCreditSearchNameRequestType.
     * 
     * @return country_iso2
     */
    public java.lang.String getCountry_iso2() {
        return country_iso2;
    }


    /**
     * Sets the country_iso2 value for this GraydonCreditSearchNameRequestType.
     * 
     * @param country_iso2
     */
    public void setCountry_iso2(java.lang.String country_iso2) {
        this.country_iso2 = country_iso2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditSearchNameRequestType)) return false;
        GraydonCreditSearchNameRequestType other = (GraydonCreditSearchNameRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_name==null && other.getCompany_name()==null) || 
             (this.company_name!=null &&
              this.company_name.equals(other.getCompany_name()))) &&
            ((this.residence==null && other.getResidence()==null) || 
             (this.residence!=null &&
              this.residence.equals(other.getResidence()))) &&
            ((this.country_iso2==null && other.getCountry_iso2()==null) || 
             (this.country_iso2!=null &&
              this.country_iso2.equals(other.getCountry_iso2())));
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
        if (getCompany_name() != null) {
            _hashCode += getCompany_name().hashCode();
        }
        if (getResidence() != null) {
            _hashCode += getResidence().hashCode();
        }
        if (getCountry_iso2() != null) {
            _hashCode += getCountry_iso2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditSearchNameRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydonCreditSearchNameRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "residence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso2"));
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
