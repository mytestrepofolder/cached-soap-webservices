/**
 * DutchBusinessPeriod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPeriod  implements java.io.Serializable {
    private java.util.Date start_date;

    private java.util.Date end_date;

    public DutchBusinessPeriod() {
    }

    public DutchBusinessPeriod(
           java.util.Date start_date,
           java.util.Date end_date) {
           this.start_date = start_date;
           this.end_date = end_date;
    }


    /**
     * Gets the start_date value for this DutchBusinessPeriod.
     * 
     * @return start_date
     */
    public java.util.Date getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this DutchBusinessPeriod.
     * 
     * @param start_date
     */
    public void setStart_date(java.util.Date start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this DutchBusinessPeriod.
     * 
     * @return end_date
     */
    public java.util.Date getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this DutchBusinessPeriod.
     * 
     * @param end_date
     */
    public void setEnd_date(java.util.Date end_date) {
        this.end_date = end_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPeriod)) return false;
        DutchBusinessPeriod other = (DutchBusinessPeriod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date())));
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
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPeriod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPeriod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
