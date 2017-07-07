/**
 * KvkDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KvkDate  implements java.io.Serializable {
    private int year;

    private java.lang.Integer month;

    private java.lang.Integer day;

    public KvkDate() {
    }

    public KvkDate(
           int year,
           java.lang.Integer month,
           java.lang.Integer day) {
           this.year = year;
           this.month = month;
           this.day = day;
    }


    /**
     * Gets the year value for this KvkDate.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this KvkDate.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the month value for this KvkDate.
     * 
     * @return month
     */
    public java.lang.Integer getMonth() {
        return month;
    }


    /**
     * Sets the month value for this KvkDate.
     * 
     * @param month
     */
    public void setMonth(java.lang.Integer month) {
        this.month = month;
    }


    /**
     * Gets the day value for this KvkDate.
     * 
     * @return day
     */
    public java.lang.Integer getDay() {
        return day;
    }


    /**
     * Sets the day value for this KvkDate.
     * 
     * @param day
     */
    public void setDay(java.lang.Integer day) {
        this.day = day;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KvkDate)) return false;
        KvkDate other = (KvkDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.year == other.getYear() &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay())));
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
        _hashCode += getYear();
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KvkDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KvkDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
