/**
 * GCRTelephoneNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRTelephoneNumber  implements java.io.Serializable {
    private int telephone_code;

    private java.lang.String telephone_text;

    private java.lang.String country_number;

    private java.lang.String net_number;

    private java.lang.String subscriber_number;

    public GCRTelephoneNumber() {
    }

    public GCRTelephoneNumber(
           int telephone_code,
           java.lang.String telephone_text,
           java.lang.String country_number,
           java.lang.String net_number,
           java.lang.String subscriber_number) {
           this.telephone_code = telephone_code;
           this.telephone_text = telephone_text;
           this.country_number = country_number;
           this.net_number = net_number;
           this.subscriber_number = subscriber_number;
    }


    /**
     * Gets the telephone_code value for this GCRTelephoneNumber.
     * 
     * @return telephone_code
     */
    public int getTelephone_code() {
        return telephone_code;
    }


    /**
     * Sets the telephone_code value for this GCRTelephoneNumber.
     * 
     * @param telephone_code
     */
    public void setTelephone_code(int telephone_code) {
        this.telephone_code = telephone_code;
    }


    /**
     * Gets the telephone_text value for this GCRTelephoneNumber.
     * 
     * @return telephone_text
     */
    public java.lang.String getTelephone_text() {
        return telephone_text;
    }


    /**
     * Sets the telephone_text value for this GCRTelephoneNumber.
     * 
     * @param telephone_text
     */
    public void setTelephone_text(java.lang.String telephone_text) {
        this.telephone_text = telephone_text;
    }


    /**
     * Gets the country_number value for this GCRTelephoneNumber.
     * 
     * @return country_number
     */
    public java.lang.String getCountry_number() {
        return country_number;
    }


    /**
     * Sets the country_number value for this GCRTelephoneNumber.
     * 
     * @param country_number
     */
    public void setCountry_number(java.lang.String country_number) {
        this.country_number = country_number;
    }


    /**
     * Gets the net_number value for this GCRTelephoneNumber.
     * 
     * @return net_number
     */
    public java.lang.String getNet_number() {
        return net_number;
    }


    /**
     * Sets the net_number value for this GCRTelephoneNumber.
     * 
     * @param net_number
     */
    public void setNet_number(java.lang.String net_number) {
        this.net_number = net_number;
    }


    /**
     * Gets the subscriber_number value for this GCRTelephoneNumber.
     * 
     * @return subscriber_number
     */
    public java.lang.String getSubscriber_number() {
        return subscriber_number;
    }


    /**
     * Sets the subscriber_number value for this GCRTelephoneNumber.
     * 
     * @param subscriber_number
     */
    public void setSubscriber_number(java.lang.String subscriber_number) {
        this.subscriber_number = subscriber_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRTelephoneNumber)) return false;
        GCRTelephoneNumber other = (GCRTelephoneNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.telephone_code == other.getTelephone_code() &&
            ((this.telephone_text==null && other.getTelephone_text()==null) || 
             (this.telephone_text!=null &&
              this.telephone_text.equals(other.getTelephone_text()))) &&
            ((this.country_number==null && other.getCountry_number()==null) || 
             (this.country_number!=null &&
              this.country_number.equals(other.getCountry_number()))) &&
            ((this.net_number==null && other.getNet_number()==null) || 
             (this.net_number!=null &&
              this.net_number.equals(other.getNet_number()))) &&
            ((this.subscriber_number==null && other.getSubscriber_number()==null) || 
             (this.subscriber_number!=null &&
              this.subscriber_number.equals(other.getSubscriber_number())));
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
        _hashCode += getTelephone_code();
        if (getTelephone_text() != null) {
            _hashCode += getTelephone_text().hashCode();
        }
        if (getCountry_number() != null) {
            _hashCode += getCountry_number().hashCode();
        }
        if (getNet_number() != null) {
            _hashCode += getNet_number().hashCode();
        }
        if (getSubscriber_number() != null) {
            _hashCode += getSubscriber_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRTelephoneNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTelephoneNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "net_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subscriber_number"));
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
