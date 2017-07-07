/**
 * InternationalAddressSearchV2Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InternationalAddressSearchV2Result  implements java.io.Serializable {
    private java.lang.String validation_status;

    private nl.webservices.www.soap.InternationalV2[] result;

    private java.lang.String country_iso3;

    public InternationalAddressSearchV2Result() {
    }

    public InternationalAddressSearchV2Result(
           java.lang.String validation_status,
           nl.webservices.www.soap.InternationalV2[] result,
           java.lang.String country_iso3) {
           this.validation_status = validation_status;
           this.result = result;
           this.country_iso3 = country_iso3;
    }


    /**
     * Gets the validation_status value for this InternationalAddressSearchV2Result.
     * 
     * @return validation_status
     */
    public java.lang.String getValidation_status() {
        return validation_status;
    }


    /**
     * Sets the validation_status value for this InternationalAddressSearchV2Result.
     * 
     * @param validation_status
     */
    public void setValidation_status(java.lang.String validation_status) {
        this.validation_status = validation_status;
    }


    /**
     * Gets the result value for this InternationalAddressSearchV2Result.
     * 
     * @return result
     */
    public nl.webservices.www.soap.InternationalV2[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this InternationalAddressSearchV2Result.
     * 
     * @param result
     */
    public void setResult(nl.webservices.www.soap.InternationalV2[] result) {
        this.result = result;
    }


    /**
     * Gets the country_iso3 value for this InternationalAddressSearchV2Result.
     * 
     * @return country_iso3
     */
    public java.lang.String getCountry_iso3() {
        return country_iso3;
    }


    /**
     * Sets the country_iso3 value for this InternationalAddressSearchV2Result.
     * 
     * @param country_iso3
     */
    public void setCountry_iso3(java.lang.String country_iso3) {
        this.country_iso3 = country_iso3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalAddressSearchV2Result)) return false;
        InternationalAddressSearchV2Result other = (InternationalAddressSearchV2Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validation_status==null && other.getValidation_status()==null) || 
             (this.validation_status!=null &&
              this.validation_status.equals(other.getValidation_status()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult()))) &&
            ((this.country_iso3==null && other.getCountry_iso3()==null) || 
             (this.country_iso3!=null &&
              this.country_iso3.equals(other.getCountry_iso3())));
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
        if (getValidation_status() != null) {
            _hashCode += getValidation_status().hashCode();
        }
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry_iso3() != null) {
            _hashCode += getCountry_iso3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalAddressSearchV2Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InternationalAddressSearchV2Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "validation_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InternationalV2"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso3"));
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
