/**
 * GCRRatio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRRatio  implements java.io.Serializable {
    private java.lang.String ratio_code;

    private java.lang.String ratio_text;

    private java.math.BigDecimal value;

    public GCRRatio() {
    }

    public GCRRatio(
           java.lang.String ratio_code,
           java.lang.String ratio_text,
           java.math.BigDecimal value) {
           this.ratio_code = ratio_code;
           this.ratio_text = ratio_text;
           this.value = value;
    }


    /**
     * Gets the ratio_code value for this GCRRatio.
     * 
     * @return ratio_code
     */
    public java.lang.String getRatio_code() {
        return ratio_code;
    }


    /**
     * Sets the ratio_code value for this GCRRatio.
     * 
     * @param ratio_code
     */
    public void setRatio_code(java.lang.String ratio_code) {
        this.ratio_code = ratio_code;
    }


    /**
     * Gets the ratio_text value for this GCRRatio.
     * 
     * @return ratio_text
     */
    public java.lang.String getRatio_text() {
        return ratio_text;
    }


    /**
     * Sets the ratio_text value for this GCRRatio.
     * 
     * @param ratio_text
     */
    public void setRatio_text(java.lang.String ratio_text) {
        this.ratio_text = ratio_text;
    }


    /**
     * Gets the value value for this GCRRatio.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this GCRRatio.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRRatio)) return false;
        GCRRatio other = (GCRRatio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ratio_code==null && other.getRatio_code()==null) || 
             (this.ratio_code!=null &&
              this.ratio_code.equals(other.getRatio_code()))) &&
            ((this.ratio_text==null && other.getRatio_text()==null) || 
             (this.ratio_text!=null &&
              this.ratio_text.equals(other.getRatio_text()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getRatio_code() != null) {
            _hashCode += getRatio_code().hashCode();
        }
        if (getRatio_text() != null) {
            _hashCode += getRatio_text().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRRatio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRRatio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratio_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ratio_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratio_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ratio_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
