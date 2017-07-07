/**
 * GCRFirstDirector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRFirstDirector  implements java.io.Serializable {
    private java.math.BigInteger graydon_person_id;

    private java.lang.Boolean is_current;

    private java.lang.Integer job_title_code;

    private java.lang.String job_title_text;

    private java.util.Date date_from;

    private java.util.Date date_until;

    public GCRFirstDirector() {
    }

    public GCRFirstDirector(
           java.math.BigInteger graydon_person_id,
           java.lang.Boolean is_current,
           java.lang.Integer job_title_code,
           java.lang.String job_title_text,
           java.util.Date date_from,
           java.util.Date date_until) {
           this.graydon_person_id = graydon_person_id;
           this.is_current = is_current;
           this.job_title_code = job_title_code;
           this.job_title_text = job_title_text;
           this.date_from = date_from;
           this.date_until = date_until;
    }


    /**
     * Gets the graydon_person_id value for this GCRFirstDirector.
     * 
     * @return graydon_person_id
     */
    public java.math.BigInteger getGraydon_person_id() {
        return graydon_person_id;
    }


    /**
     * Sets the graydon_person_id value for this GCRFirstDirector.
     * 
     * @param graydon_person_id
     */
    public void setGraydon_person_id(java.math.BigInteger graydon_person_id) {
        this.graydon_person_id = graydon_person_id;
    }


    /**
     * Gets the is_current value for this GCRFirstDirector.
     * 
     * @return is_current
     */
    public java.lang.Boolean getIs_current() {
        return is_current;
    }


    /**
     * Sets the is_current value for this GCRFirstDirector.
     * 
     * @param is_current
     */
    public void setIs_current(java.lang.Boolean is_current) {
        this.is_current = is_current;
    }


    /**
     * Gets the job_title_code value for this GCRFirstDirector.
     * 
     * @return job_title_code
     */
    public java.lang.Integer getJob_title_code() {
        return job_title_code;
    }


    /**
     * Sets the job_title_code value for this GCRFirstDirector.
     * 
     * @param job_title_code
     */
    public void setJob_title_code(java.lang.Integer job_title_code) {
        this.job_title_code = job_title_code;
    }


    /**
     * Gets the job_title_text value for this GCRFirstDirector.
     * 
     * @return job_title_text
     */
    public java.lang.String getJob_title_text() {
        return job_title_text;
    }


    /**
     * Sets the job_title_text value for this GCRFirstDirector.
     * 
     * @param job_title_text
     */
    public void setJob_title_text(java.lang.String job_title_text) {
        this.job_title_text = job_title_text;
    }


    /**
     * Gets the date_from value for this GCRFirstDirector.
     * 
     * @return date_from
     */
    public java.util.Date getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this GCRFirstDirector.
     * 
     * @param date_from
     */
    public void setDate_from(java.util.Date date_from) {
        this.date_from = date_from;
    }


    /**
     * Gets the date_until value for this GCRFirstDirector.
     * 
     * @return date_until
     */
    public java.util.Date getDate_until() {
        return date_until;
    }


    /**
     * Sets the date_until value for this GCRFirstDirector.
     * 
     * @param date_until
     */
    public void setDate_until(java.util.Date date_until) {
        this.date_until = date_until;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRFirstDirector)) return false;
        GCRFirstDirector other = (GCRFirstDirector) obj;
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
            ((this.is_current==null && other.getIs_current()==null) || 
             (this.is_current!=null &&
              this.is_current.equals(other.getIs_current()))) &&
            ((this.job_title_code==null && other.getJob_title_code()==null) || 
             (this.job_title_code!=null &&
              this.job_title_code.equals(other.getJob_title_code()))) &&
            ((this.job_title_text==null && other.getJob_title_text()==null) || 
             (this.job_title_text!=null &&
              this.job_title_text.equals(other.getJob_title_text()))) &&
            ((this.date_from==null && other.getDate_from()==null) || 
             (this.date_from!=null &&
              this.date_from.equals(other.getDate_from()))) &&
            ((this.date_until==null && other.getDate_until()==null) || 
             (this.date_until!=null &&
              this.date_until.equals(other.getDate_until())));
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
        if (getIs_current() != null) {
            _hashCode += getIs_current().hashCode();
        }
        if (getJob_title_code() != null) {
            _hashCode += getJob_title_code().hashCode();
        }
        if (getJob_title_text() != null) {
            _hashCode += getJob_title_text().hashCode();
        }
        if (getDate_from() != null) {
            _hashCode += getDate_from().hashCode();
        }
        if (getDate_until() != null) {
            _hashCode += getDate_until().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRFirstDirector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFirstDirector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_person_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_person_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_current");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job_title_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "job_title_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job_title_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "job_title_text"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_until");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_until"));
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
