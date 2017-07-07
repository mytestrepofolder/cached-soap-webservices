/**
 * GCRFiling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRFiling  implements java.io.Serializable {
    private java.lang.String filing_code;

    private java.lang.String filing_text;

    private java.util.Date filing_date;

    private nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce;

    public GCRFiling() {
    }

    public GCRFiling(
           java.lang.String filing_code,
           java.lang.String filing_text,
           java.util.Date filing_date,
           nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce) {
           this.filing_code = filing_code;
           this.filing_text = filing_text;
           this.filing_date = filing_date;
           this.chamber_of_commerce = chamber_of_commerce;
    }


    /**
     * Gets the filing_code value for this GCRFiling.
     * 
     * @return filing_code
     */
    public java.lang.String getFiling_code() {
        return filing_code;
    }


    /**
     * Sets the filing_code value for this GCRFiling.
     * 
     * @param filing_code
     */
    public void setFiling_code(java.lang.String filing_code) {
        this.filing_code = filing_code;
    }


    /**
     * Gets the filing_text value for this GCRFiling.
     * 
     * @return filing_text
     */
    public java.lang.String getFiling_text() {
        return filing_text;
    }


    /**
     * Sets the filing_text value for this GCRFiling.
     * 
     * @param filing_text
     */
    public void setFiling_text(java.lang.String filing_text) {
        this.filing_text = filing_text;
    }


    /**
     * Gets the filing_date value for this GCRFiling.
     * 
     * @return filing_date
     */
    public java.util.Date getFiling_date() {
        return filing_date;
    }


    /**
     * Sets the filing_date value for this GCRFiling.
     * 
     * @param filing_date
     */
    public void setFiling_date(java.util.Date filing_date) {
        this.filing_date = filing_date;
    }


    /**
     * Gets the chamber_of_commerce value for this GCRFiling.
     * 
     * @return chamber_of_commerce
     */
    public nl.webservices.www.soap.GCRChamberOfCommerce getChamber_of_commerce() {
        return chamber_of_commerce;
    }


    /**
     * Sets the chamber_of_commerce value for this GCRFiling.
     * 
     * @param chamber_of_commerce
     */
    public void setChamber_of_commerce(nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce) {
        this.chamber_of_commerce = chamber_of_commerce;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRFiling)) return false;
        GCRFiling other = (GCRFiling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filing_code==null && other.getFiling_code()==null) || 
             (this.filing_code!=null &&
              this.filing_code.equals(other.getFiling_code()))) &&
            ((this.filing_text==null && other.getFiling_text()==null) || 
             (this.filing_text!=null &&
              this.filing_text.equals(other.getFiling_text()))) &&
            ((this.filing_date==null && other.getFiling_date()==null) || 
             (this.filing_date!=null &&
              this.filing_date.equals(other.getFiling_date()))) &&
            ((this.chamber_of_commerce==null && other.getChamber_of_commerce()==null) || 
             (this.chamber_of_commerce!=null &&
              this.chamber_of_commerce.equals(other.getChamber_of_commerce())));
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
        if (getFiling_code() != null) {
            _hashCode += getFiling_code().hashCode();
        }
        if (getFiling_text() != null) {
            _hashCode += getFiling_text().hashCode();
        }
        if (getFiling_date() != null) {
            _hashCode += getFiling_date().hashCode();
        }
        if (getChamber_of_commerce() != null) {
            _hashCode += getChamber_of_commerce().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRFiling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFiling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filing_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "filing_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filing_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "filing_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filing_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "filing_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamber_of_commerce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "chamber_of_commerce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRChamberOfCommerce"));
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
