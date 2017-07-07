/**
 * GCRReceiver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRReceiver  implements java.io.Serializable {
    private java.math.BigInteger graydon_person_id;

    private java.util.Date date_when_active_in_job_title;

    public GCRReceiver() {
    }

    public GCRReceiver(
           java.math.BigInteger graydon_person_id,
           java.util.Date date_when_active_in_job_title) {
           this.graydon_person_id = graydon_person_id;
           this.date_when_active_in_job_title = date_when_active_in_job_title;
    }


    /**
     * Gets the graydon_person_id value for this GCRReceiver.
     * 
     * @return graydon_person_id
     */
    public java.math.BigInteger getGraydon_person_id() {
        return graydon_person_id;
    }


    /**
     * Sets the graydon_person_id value for this GCRReceiver.
     * 
     * @param graydon_person_id
     */
    public void setGraydon_person_id(java.math.BigInteger graydon_person_id) {
        this.graydon_person_id = graydon_person_id;
    }


    /**
     * Gets the date_when_active_in_job_title value for this GCRReceiver.
     * 
     * @return date_when_active_in_job_title
     */
    public java.util.Date getDate_when_active_in_job_title() {
        return date_when_active_in_job_title;
    }


    /**
     * Sets the date_when_active_in_job_title value for this GCRReceiver.
     * 
     * @param date_when_active_in_job_title
     */
    public void setDate_when_active_in_job_title(java.util.Date date_when_active_in_job_title) {
        this.date_when_active_in_job_title = date_when_active_in_job_title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRReceiver)) return false;
        GCRReceiver other = (GCRReceiver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.graydon_person_id==null && other.getGraydon_person_id()==null) || 
             (this.graydon_person_id!=null &&
              this.graydon_person_id.equals(other.getGraydon_person_id()))) &&
            ((this.date_when_active_in_job_title==null && other.getDate_when_active_in_job_title()==null) || 
             (this.date_when_active_in_job_title!=null &&
              this.date_when_active_in_job_title.equals(other.getDate_when_active_in_job_title())));
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
        if (getGraydon_person_id() != null) {
            _hashCode += getGraydon_person_id().hashCode();
        }
        if (getDate_when_active_in_job_title() != null) {
            _hashCode += getDate_when_active_in_job_title().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRReceiver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRReceiver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_person_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_person_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_when_active_in_job_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_when_active_in_job_title"));
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
