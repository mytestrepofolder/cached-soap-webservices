/**
 * GraydonCreditReportQuickscan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReportQuickscan  implements java.io.Serializable {
    private java.lang.String pd_rating;

    private java.lang.String credit_flag_code;

    private java.lang.String credit_flag_text;

    private nl.webservices.www.soap.GCRAlarm alarm;

    public GraydonCreditReportQuickscan() {
    }

    public GraydonCreditReportQuickscan(
           java.lang.String pd_rating,
           java.lang.String credit_flag_code,
           java.lang.String credit_flag_text,
           nl.webservices.www.soap.GCRAlarm alarm) {
           this.pd_rating = pd_rating;
           this.credit_flag_code = credit_flag_code;
           this.credit_flag_text = credit_flag_text;
           this.alarm = alarm;
    }


    /**
     * Gets the pd_rating value for this GraydonCreditReportQuickscan.
     * 
     * @return pd_rating
     */
    public java.lang.String getPd_rating() {
        return pd_rating;
    }


    /**
     * Sets the pd_rating value for this GraydonCreditReportQuickscan.
     * 
     * @param pd_rating
     */
    public void setPd_rating(java.lang.String pd_rating) {
        this.pd_rating = pd_rating;
    }


    /**
     * Gets the credit_flag_code value for this GraydonCreditReportQuickscan.
     * 
     * @return credit_flag_code
     */
    public java.lang.String getCredit_flag_code() {
        return credit_flag_code;
    }


    /**
     * Sets the credit_flag_code value for this GraydonCreditReportQuickscan.
     * 
     * @param credit_flag_code
     */
    public void setCredit_flag_code(java.lang.String credit_flag_code) {
        this.credit_flag_code = credit_flag_code;
    }


    /**
     * Gets the credit_flag_text value for this GraydonCreditReportQuickscan.
     * 
     * @return credit_flag_text
     */
    public java.lang.String getCredit_flag_text() {
        return credit_flag_text;
    }


    /**
     * Sets the credit_flag_text value for this GraydonCreditReportQuickscan.
     * 
     * @param credit_flag_text
     */
    public void setCredit_flag_text(java.lang.String credit_flag_text) {
        this.credit_flag_text = credit_flag_text;
    }


    /**
     * Gets the alarm value for this GraydonCreditReportQuickscan.
     * 
     * @return alarm
     */
    public nl.webservices.www.soap.GCRAlarm getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this GraydonCreditReportQuickscan.
     * 
     * @param alarm
     */
    public void setAlarm(nl.webservices.www.soap.GCRAlarm alarm) {
        this.alarm = alarm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReportQuickscan)) return false;
        GraydonCreditReportQuickscan other = (GraydonCreditReportQuickscan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pd_rating==null && other.getPd_rating()==null) || 
             (this.pd_rating!=null &&
              this.pd_rating.equals(other.getPd_rating()))) &&
            ((this.credit_flag_code==null && other.getCredit_flag_code()==null) || 
             (this.credit_flag_code!=null &&
              this.credit_flag_code.equals(other.getCredit_flag_code()))) &&
            ((this.credit_flag_text==null && other.getCredit_flag_text()==null) || 
             (this.credit_flag_text!=null &&
              this.credit_flag_text.equals(other.getCredit_flag_text()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm())));
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
        if (getPd_rating() != null) {
            _hashCode += getPd_rating().hashCode();
        }
        if (getCredit_flag_code() != null) {
            _hashCode += getCredit_flag_code().hashCode();
        }
        if (getCredit_flag_text() != null) {
            _hashCode += getCredit_flag_text().hashCode();
        }
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReportQuickscan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportQuickscan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pd_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pd_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_flag_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_flag_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_flag_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_flag_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarm"));
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
