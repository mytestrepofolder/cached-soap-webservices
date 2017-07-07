/**
 * DNBMonetaryAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBMonetaryAmount  implements java.io.Serializable {
    private java.lang.Integer value;

    private java.lang.String value_text;

    private java.lang.Integer estimated;

    private java.lang.Boolean consolidated;

    private java.lang.String currency;

    public DNBMonetaryAmount() {
    }

    public DNBMonetaryAmount(
           java.lang.Integer value,
           java.lang.String value_text,
           java.lang.Integer estimated,
           java.lang.Boolean consolidated,
           java.lang.String currency) {
           this.value = value;
           this.value_text = value_text;
           this.estimated = estimated;
           this.consolidated = consolidated;
           this.currency = currency;
    }


    /**
     * Gets the value value for this DNBMonetaryAmount.
     * 
     * @return value
     */
    public java.lang.Integer getValue() {
        return value;
    }


    /**
     * Sets the value value for this DNBMonetaryAmount.
     * 
     * @param value
     */
    public void setValue(java.lang.Integer value) {
        this.value = value;
    }


    /**
     * Gets the value_text value for this DNBMonetaryAmount.
     * 
     * @return value_text
     */
    public java.lang.String getValue_text() {
        return value_text;
    }


    /**
     * Sets the value_text value for this DNBMonetaryAmount.
     * 
     * @param value_text
     */
    public void setValue_text(java.lang.String value_text) {
        this.value_text = value_text;
    }


    /**
     * Gets the estimated value for this DNBMonetaryAmount.
     * 
     * @return estimated
     */
    public java.lang.Integer getEstimated() {
        return estimated;
    }


    /**
     * Sets the estimated value for this DNBMonetaryAmount.
     * 
     * @param estimated
     */
    public void setEstimated(java.lang.Integer estimated) {
        this.estimated = estimated;
    }


    /**
     * Gets the consolidated value for this DNBMonetaryAmount.
     * 
     * @return consolidated
     */
    public java.lang.Boolean getConsolidated() {
        return consolidated;
    }


    /**
     * Sets the consolidated value for this DNBMonetaryAmount.
     * 
     * @param consolidated
     */
    public void setConsolidated(java.lang.Boolean consolidated) {
        this.consolidated = consolidated;
    }


    /**
     * Gets the currency value for this DNBMonetaryAmount.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DNBMonetaryAmount.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBMonetaryAmount)) return false;
        DNBMonetaryAmount other = (DNBMonetaryAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.value_text==null && other.getValue_text()==null) || 
             (this.value_text!=null &&
              this.value_text.equals(other.getValue_text()))) &&
            ((this.estimated==null && other.getEstimated()==null) || 
             (this.estimated!=null &&
              this.estimated.equals(other.getEstimated()))) &&
            ((this.consolidated==null && other.getConsolidated()==null) || 
             (this.consolidated!=null &&
              this.consolidated.equals(other.getConsolidated()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValue_text() != null) {
            _hashCode += getValue_text().hashCode();
        }
        if (getEstimated() != null) {
            _hashCode += getEstimated().hashCode();
        }
        if (getConsolidated() != null) {
            _hashCode += getConsolidated().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBMonetaryAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBMonetaryAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "value_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "estimated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "consolidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currency"));
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
