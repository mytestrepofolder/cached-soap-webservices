/**
 * GCRAlarm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRAlarm  implements java.io.Serializable {
    private int alarm_code;

    private java.lang.String alarm_text;

    public GCRAlarm() {
    }

    public GCRAlarm(
           int alarm_code,
           java.lang.String alarm_text) {
           this.alarm_code = alarm_code;
           this.alarm_text = alarm_text;
    }


    /**
     * Gets the alarm_code value for this GCRAlarm.
     * 
     * @return alarm_code
     */
    public int getAlarm_code() {
        return alarm_code;
    }


    /**
     * Sets the alarm_code value for this GCRAlarm.
     * 
     * @param alarm_code
     */
    public void setAlarm_code(int alarm_code) {
        this.alarm_code = alarm_code;
    }


    /**
     * Gets the alarm_text value for this GCRAlarm.
     * 
     * @return alarm_text
     */
    public java.lang.String getAlarm_text() {
        return alarm_text;
    }


    /**
     * Sets the alarm_text value for this GCRAlarm.
     * 
     * @param alarm_text
     */
    public void setAlarm_text(java.lang.String alarm_text) {
        this.alarm_text = alarm_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRAlarm)) return false;
        GCRAlarm other = (GCRAlarm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alarm_code == other.getAlarm_code() &&
            ((this.alarm_text==null && other.getAlarm_text()==null) || 
             (this.alarm_text!=null &&
              this.alarm_text.equals(other.getAlarm_text())));
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
        _hashCode += getAlarm_code();
        if (getAlarm_text() != null) {
            _hashCode += getAlarm_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRAlarm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alarm_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alarm_text"));
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
