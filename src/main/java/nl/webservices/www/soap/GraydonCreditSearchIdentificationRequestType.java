/**
 * GraydonCreditSearchIdentificationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditSearchIdentificationRequestType  implements java.io.Serializable {
    private java.lang.String company_id;

    private java.lang.String company_id_type;

    private java.lang.String country_iso2;

    public GraydonCreditSearchIdentificationRequestType() {
    }

    public GraydonCreditSearchIdentificationRequestType(
           java.lang.String company_id,
           java.lang.String company_id_type,
           java.lang.String country_iso2) {
           this.company_id = company_id;
           this.company_id_type = company_id_type;
           this.country_iso2 = country_iso2;
    }


    /**
     * Gets the company_id value for this GraydonCreditSearchIdentificationRequestType.
     * 
     * @return company_id
     */
    public java.lang.String getCompany_id() {
        return company_id;
    }


    /**
     * Sets the company_id value for this GraydonCreditSearchIdentificationRequestType.
     * 
     * @param company_id
     */
    public void setCompany_id(java.lang.String company_id) {
        this.company_id = company_id;
    }


    /**
     * Gets the company_id_type value for this GraydonCreditSearchIdentificationRequestType.
     * 
     * @return company_id_type
     */
    public java.lang.String getCompany_id_type() {
        return company_id_type;
    }


    /**
     * Sets the company_id_type value for this GraydonCreditSearchIdentificationRequestType.
     * 
     * @param company_id_type
     */
    public void setCompany_id_type(java.lang.String company_id_type) {
        this.company_id_type = company_id_type;
    }


    /**
     * Gets the country_iso2 value for this GraydonCreditSearchIdentificationRequestType.
     * 
     * @return country_iso2
     */
    public java.lang.String getCountry_iso2() {
        return country_iso2;
    }


    /**
     * Sets the country_iso2 value for this GraydonCreditSearchIdentificationRequestType.
     * 
     * @param country_iso2
     */
    public void setCountry_iso2(java.lang.String country_iso2) {
        this.country_iso2 = country_iso2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditSearchIdentificationRequestType)) return false;
        GraydonCreditSearchIdentificationRequestType other = (GraydonCreditSearchIdentificationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_id==null && other.getCompany_id()==null) || 
             (this.company_id!=null &&
              this.company_id.equals(other.getCompany_id()))) &&
            ((this.company_id_type==null && other.getCompany_id_type()==null) || 
             (this.company_id_type!=null &&
              this.company_id_type.equals(other.getCompany_id_type()))) &&
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
        if (getCompany_id() != null) {
            _hashCode += getCompany_id().hashCode();
        }
        if (getCompany_id_type() != null) {
            _hashCode += getCompany_id_type().hashCode();
        }
        if (getCountry_iso2() != null) {
            _hashCode += getCountry_iso2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditSearchIdentificationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydonCreditSearchIdentificationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_id_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_id_type"));
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
