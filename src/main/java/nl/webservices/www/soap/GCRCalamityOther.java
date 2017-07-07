/**
 * GCRCalamityOther.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCalamityOther  implements java.io.Serializable {
    private int calamity_code;

    private java.lang.String calamity_text;

    private java.util.Date expiration_date;

    public GCRCalamityOther() {
    }

    public GCRCalamityOther(
           int calamity_code,
           java.lang.String calamity_text,
           java.util.Date expiration_date) {
           this.calamity_code = calamity_code;
           this.calamity_text = calamity_text;
           this.expiration_date = expiration_date;
    }


    /**
     * Gets the calamity_code value for this GCRCalamityOther.
     * 
     * @return calamity_code
     */
    public int getCalamity_code() {
        return calamity_code;
    }


    /**
     * Sets the calamity_code value for this GCRCalamityOther.
     * 
     * @param calamity_code
     */
    public void setCalamity_code(int calamity_code) {
        this.calamity_code = calamity_code;
    }


    /**
     * Gets the calamity_text value for this GCRCalamityOther.
     * 
     * @return calamity_text
     */
    public java.lang.String getCalamity_text() {
        return calamity_text;
    }


    /**
     * Sets the calamity_text value for this GCRCalamityOther.
     * 
     * @param calamity_text
     */
    public void setCalamity_text(java.lang.String calamity_text) {
        this.calamity_text = calamity_text;
    }


    /**
     * Gets the expiration_date value for this GCRCalamityOther.
     * 
     * @return expiration_date
     */
    public java.util.Date getExpiration_date() {
        return expiration_date;
    }


    /**
     * Sets the expiration_date value for this GCRCalamityOther.
     * 
     * @param expiration_date
     */
    public void setExpiration_date(java.util.Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCalamityOther)) return false;
        GCRCalamityOther other = (GCRCalamityOther) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.calamity_code == other.getCalamity_code() &&
            ((this.calamity_text==null && other.getCalamity_text()==null) || 
             (this.calamity_text!=null &&
              this.calamity_text.equals(other.getCalamity_text()))) &&
            ((this.expiration_date==null && other.getExpiration_date()==null) || 
             (this.expiration_date!=null &&
              this.expiration_date.equals(other.getExpiration_date())));
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
        _hashCode += getCalamity_code();
        if (getCalamity_text() != null) {
            _hashCode += getCalamity_text().hashCode();
        }
        if (getExpiration_date() != null) {
            _hashCode += getExpiration_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRCalamityOther.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCalamityOther"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calamity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "calamity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calamity_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "calamity_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "expiration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
