/**
 * GCRTitle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRTitle  implements java.io.Serializable {
    private int title_code;

    private java.lang.String title_text;

    public GCRTitle() {
    }

    public GCRTitle(
           int title_code,
           java.lang.String title_text) {
           this.title_code = title_code;
           this.title_text = title_text;
    }


    /**
     * Gets the title_code value for this GCRTitle.
     * 
     * @return title_code
     */
    public int getTitle_code() {
        return title_code;
    }


    /**
     * Sets the title_code value for this GCRTitle.
     * 
     * @param title_code
     */
    public void setTitle_code(int title_code) {
        this.title_code = title_code;
    }


    /**
     * Gets the title_text value for this GCRTitle.
     * 
     * @return title_text
     */
    public java.lang.String getTitle_text() {
        return title_text;
    }


    /**
     * Sets the title_text value for this GCRTitle.
     * 
     * @param title_text
     */
    public void setTitle_text(java.lang.String title_text) {
        this.title_text = title_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRTitle)) return false;
        GCRTitle other = (GCRTitle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.title_code == other.getTitle_code() &&
            ((this.title_text==null && other.getTitle_text()==null) || 
             (this.title_text!=null &&
              this.title_text.equals(other.getTitle_text())));
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
        _hashCode += getTitle_code();
        if (getTitle_text() != null) {
            _hashCode += getTitle_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRTitle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRTitle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "title_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "title_text"));
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
