/**
 * GCRItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRItem  implements java.io.Serializable {
    private java.lang.String main_code;

    private java.lang.String code;

    private java.lang.String sub_code;

    private java.lang.String description;

    private java.math.BigDecimal value;

    private java.lang.String free_text;

    public GCRItem() {
    }

    public GCRItem(
           java.lang.String main_code,
           java.lang.String code,
           java.lang.String sub_code,
           java.lang.String description,
           java.math.BigDecimal value,
           java.lang.String free_text) {
           this.main_code = main_code;
           this.code = code;
           this.sub_code = sub_code;
           this.description = description;
           this.value = value;
           this.free_text = free_text;
    }


    /**
     * Gets the main_code value for this GCRItem.
     * 
     * @return main_code
     */
    public java.lang.String getMain_code() {
        return main_code;
    }


    /**
     * Sets the main_code value for this GCRItem.
     * 
     * @param main_code
     */
    public void setMain_code(java.lang.String main_code) {
        this.main_code = main_code;
    }


    /**
     * Gets the code value for this GCRItem.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this GCRItem.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the sub_code value for this GCRItem.
     * 
     * @return sub_code
     */
    public java.lang.String getSub_code() {
        return sub_code;
    }


    /**
     * Sets the sub_code value for this GCRItem.
     * 
     * @param sub_code
     */
    public void setSub_code(java.lang.String sub_code) {
        this.sub_code = sub_code;
    }


    /**
     * Gets the description value for this GCRItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GCRItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the value value for this GCRItem.
     * 
     * @return value
     */
    public java.math.BigDecimal getValue() {
        return value;
    }


    /**
     * Sets the value value for this GCRItem.
     * 
     * @param value
     */
    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }


    /**
     * Gets the free_text value for this GCRItem.
     * 
     * @return free_text
     */
    public java.lang.String getFree_text() {
        return free_text;
    }


    /**
     * Sets the free_text value for this GCRItem.
     * 
     * @param free_text
     */
    public void setFree_text(java.lang.String free_text) {
        this.free_text = free_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRItem)) return false;
        GCRItem other = (GCRItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.main_code==null && other.getMain_code()==null) || 
             (this.main_code!=null &&
              this.main_code.equals(other.getMain_code()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.sub_code==null && other.getSub_code()==null) || 
             (this.sub_code!=null &&
              this.sub_code.equals(other.getSub_code()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.free_text==null && other.getFree_text()==null) || 
             (this.free_text!=null &&
              this.free_text.equals(other.getFree_text())));
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
        if (getMain_code() != null) {
            _hashCode += getMain_code().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getSub_code() != null) {
            _hashCode += getSub_code().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getFree_text() != null) {
            _hashCode += getFree_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sub_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("free_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "free_text"));
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
