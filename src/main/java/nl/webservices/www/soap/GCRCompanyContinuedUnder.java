/**
 * GCRCompanyContinuedUnder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanyContinuedUnder  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private java.lang.Integer continued_under_code;

    private java.lang.String continued_under_text;

    private java.util.Date date_from;

    public GCRCompanyContinuedUnder() {
    }

    public GCRCompanyContinuedUnder(
           java.math.BigInteger graydon_company_id,
           java.lang.Integer continued_under_code,
           java.lang.String continued_under_text,
           java.util.Date date_from) {
           this.graydon_company_id = graydon_company_id;
           this.continued_under_code = continued_under_code;
           this.continued_under_text = continued_under_text;
           this.date_from = date_from;
    }


    /**
     * Gets the graydon_company_id value for this GCRCompanyContinuedUnder.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCompanyContinuedUnder.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the continued_under_code value for this GCRCompanyContinuedUnder.
     * 
     * @return continued_under_code
     */
    public java.lang.Integer getContinued_under_code() {
        return continued_under_code;
    }


    /**
     * Sets the continued_under_code value for this GCRCompanyContinuedUnder.
     * 
     * @param continued_under_code
     */
    public void setContinued_under_code(java.lang.Integer continued_under_code) {
        this.continued_under_code = continued_under_code;
    }


    /**
     * Gets the continued_under_text value for this GCRCompanyContinuedUnder.
     * 
     * @return continued_under_text
     */
    public java.lang.String getContinued_under_text() {
        return continued_under_text;
    }


    /**
     * Sets the continued_under_text value for this GCRCompanyContinuedUnder.
     * 
     * @param continued_under_text
     */
    public void setContinued_under_text(java.lang.String continued_under_text) {
        this.continued_under_text = continued_under_text;
    }


    /**
     * Gets the date_from value for this GCRCompanyContinuedUnder.
     * 
     * @return date_from
     */
    public java.util.Date getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this GCRCompanyContinuedUnder.
     * 
     * @param date_from
     */
    public void setDate_from(java.util.Date date_from) {
        this.date_from = date_from;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanyContinuedUnder)) return false;
        GCRCompanyContinuedUnder other = (GCRCompanyContinuedUnder) obj;
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
            ((this.continued_under_code==null && other.getContinued_under_code()==null) || 
             (this.continued_under_code!=null &&
              this.continued_under_code.equals(other.getContinued_under_code()))) &&
            ((this.continued_under_text==null && other.getContinued_under_text()==null) || 
             (this.continued_under_text!=null &&
              this.continued_under_text.equals(other.getContinued_under_text()))) &&
            ((this.date_from==null && other.getDate_from()==null) || 
             (this.date_from!=null &&
              this.date_from.equals(other.getDate_from())));
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
        if (getContinued_under_code() != null) {
            _hashCode += getContinued_under_code().hashCode();
        }
        if (getContinued_under_text() != null) {
            _hashCode += getContinued_under_text().hashCode();
        }
        if (getDate_from() != null) {
            _hashCode += getDate_from().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRCompanyContinuedUnder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyContinuedUnder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continued_under_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "continued_under_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continued_under_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "continued_under_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_from"));
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
