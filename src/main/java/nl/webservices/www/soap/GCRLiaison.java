/**
 * GCRLiaison.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRLiaison  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private java.lang.String liaison_code;

    private java.lang.String liaison_text;

    public GCRLiaison() {
    }

    public GCRLiaison(
           java.math.BigInteger graydon_company_id,
           java.lang.String liaison_code,
           java.lang.String liaison_text) {
           this.graydon_company_id = graydon_company_id;
           this.liaison_code = liaison_code;
           this.liaison_text = liaison_text;
    }


    /**
     * Gets the graydon_company_id value for this GCRLiaison.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRLiaison.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the liaison_code value for this GCRLiaison.
     * 
     * @return liaison_code
     */
    public java.lang.String getLiaison_code() {
        return liaison_code;
    }


    /**
     * Sets the liaison_code value for this GCRLiaison.
     * 
     * @param liaison_code
     */
    public void setLiaison_code(java.lang.String liaison_code) {
        this.liaison_code = liaison_code;
    }


    /**
     * Gets the liaison_text value for this GCRLiaison.
     * 
     * @return liaison_text
     */
    public java.lang.String getLiaison_text() {
        return liaison_text;
    }


    /**
     * Sets the liaison_text value for this GCRLiaison.
     * 
     * @param liaison_text
     */
    public void setLiaison_text(java.lang.String liaison_text) {
        this.liaison_text = liaison_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRLiaison)) return false;
        GCRLiaison other = (GCRLiaison) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.graydon_company_id==null && other.getGraydon_company_id()==null) || 
             (this.graydon_company_id!=null &&
              this.graydon_company_id.equals(other.getGraydon_company_id()))) &&
            ((this.liaison_code==null && other.getLiaison_code()==null) || 
             (this.liaison_code!=null &&
              this.liaison_code.equals(other.getLiaison_code()))) &&
            ((this.liaison_text==null && other.getLiaison_text()==null) || 
             (this.liaison_text!=null &&
              this.liaison_text.equals(other.getLiaison_text())));
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
        if (getGraydon_company_id() != null) {
            _hashCode += getGraydon_company_id().hashCode();
        }
        if (getLiaison_code() != null) {
            _hashCode += getLiaison_code().hashCode();
        }
        if (getLiaison_text() != null) {
            _hashCode += getLiaison_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRLiaison.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaison"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liaison_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liaison_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liaison_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "liaison_text"));
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
