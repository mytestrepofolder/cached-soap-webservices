/**
 * GCRManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRManagement  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private java.math.BigInteger graydon_person_id;

    private java.lang.Boolean is_current;

    private nl.webservices.www.soap.GCRJobTitle[] job_titles;

    public GCRManagement() {
    }

    public GCRManagement(
           java.math.BigInteger graydon_company_id,
           java.math.BigInteger graydon_person_id,
           java.lang.Boolean is_current,
           nl.webservices.www.soap.GCRJobTitle[] job_titles) {
           this.graydon_company_id = graydon_company_id;
           this.graydon_person_id = graydon_person_id;
           this.is_current = is_current;
           this.job_titles = job_titles;
    }


    /**
     * Gets the graydon_company_id value for this GCRManagement.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRManagement.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the graydon_person_id value for this GCRManagement.
     * 
     * @return graydon_person_id
     */
    public java.math.BigInteger getGraydon_person_id() {
        return graydon_person_id;
    }


    /**
     * Sets the graydon_person_id value for this GCRManagement.
     * 
     * @param graydon_person_id
     */
    public void setGraydon_person_id(java.math.BigInteger graydon_person_id) {
        this.graydon_person_id = graydon_person_id;
    }


    /**
     * Gets the is_current value for this GCRManagement.
     * 
     * @return is_current
     */
    public java.lang.Boolean getIs_current() {
        return is_current;
    }


    /**
     * Sets the is_current value for this GCRManagement.
     * 
     * @param is_current
     */
    public void setIs_current(java.lang.Boolean is_current) {
        this.is_current = is_current;
    }


    /**
     * Gets the job_titles value for this GCRManagement.
     * 
     * @return job_titles
     */
    public nl.webservices.www.soap.GCRJobTitle[] getJob_titles() {
        return job_titles;
    }


    /**
     * Sets the job_titles value for this GCRManagement.
     * 
     * @param job_titles
     */
    public void setJob_titles(nl.webservices.www.soap.GCRJobTitle[] job_titles) {
        this.job_titles = job_titles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRManagement)) return false;
        GCRManagement other = (GCRManagement) obj;
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
            ((this.graydon_person_id==null && other.getGraydon_person_id()==null) || 
             (this.graydon_person_id!=null &&
              this.graydon_person_id.equals(other.getGraydon_person_id()))) &&
            ((this.is_current==null && other.getIs_current()==null) || 
             (this.is_current!=null &&
              this.is_current.equals(other.getIs_current()))) &&
            ((this.job_titles==null && other.getJob_titles()==null) || 
             (this.job_titles!=null &&
              java.util.Arrays.equals(this.job_titles, other.getJob_titles())));
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
        if (getGraydon_person_id() != null) {
            _hashCode += getGraydon_person_id().hashCode();
        }
        if (getIs_current() != null) {
            _hashCode += getIs_current().hashCode();
        }
        if (getJob_titles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJob_titles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJob_titles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRManagement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRManagement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("job_titles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "job_titles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRJobTitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
