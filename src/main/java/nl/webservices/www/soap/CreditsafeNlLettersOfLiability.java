/**
 * CreditsafeNlLettersOfLiability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeNlLettersOfLiability  implements java.io.Serializable {
    private java.util.Calendar start_date;

    private java.util.Calendar submitted_date;

    private java.util.Calendar removal_submitted_date;

    private java.util.Calendar removal_date;

    public CreditsafeNlLettersOfLiability() {
    }

    public CreditsafeNlLettersOfLiability(
           java.util.Calendar start_date,
           java.util.Calendar submitted_date,
           java.util.Calendar removal_submitted_date,
           java.util.Calendar removal_date) {
           this.start_date = start_date;
           this.submitted_date = submitted_date;
           this.removal_submitted_date = removal_submitted_date;
           this.removal_date = removal_date;
    }


    /**
     * Gets the start_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @return start_date
     */
    public java.util.Calendar getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @param start_date
     */
    public void setStart_date(java.util.Calendar start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the submitted_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @return submitted_date
     */
    public java.util.Calendar getSubmitted_date() {
        return submitted_date;
    }


    /**
     * Sets the submitted_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @param submitted_date
     */
    public void setSubmitted_date(java.util.Calendar submitted_date) {
        this.submitted_date = submitted_date;
    }


    /**
     * Gets the removal_submitted_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @return removal_submitted_date
     */
    public java.util.Calendar getRemoval_submitted_date() {
        return removal_submitted_date;
    }


    /**
     * Sets the removal_submitted_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @param removal_submitted_date
     */
    public void setRemoval_submitted_date(java.util.Calendar removal_submitted_date) {
        this.removal_submitted_date = removal_submitted_date;
    }


    /**
     * Gets the removal_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @return removal_date
     */
    public java.util.Calendar getRemoval_date() {
        return removal_date;
    }


    /**
     * Sets the removal_date value for this CreditsafeNlLettersOfLiability.
     * 
     * @param removal_date
     */
    public void setRemoval_date(java.util.Calendar removal_date) {
        this.removal_date = removal_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeNlLettersOfLiability)) return false;
        CreditsafeNlLettersOfLiability other = (CreditsafeNlLettersOfLiability) obj;
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
            ((this.submitted_date==null && other.getSubmitted_date()==null) || 
             (this.submitted_date!=null &&
              this.submitted_date.equals(other.getSubmitted_date()))) &&
            ((this.removal_submitted_date==null && other.getRemoval_submitted_date()==null) || 
             (this.removal_submitted_date!=null &&
              this.removal_submitted_date.equals(other.getRemoval_submitted_date()))) &&
            ((this.removal_date==null && other.getRemoval_date()==null) || 
             (this.removal_date!=null &&
              this.removal_date.equals(other.getRemoval_date())));
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
        if (getSubmitted_date() != null) {
            _hashCode += getSubmitted_date().hashCode();
        }
        if (getRemoval_submitted_date() != null) {
            _hashCode += getRemoval_submitted_date().hashCode();
        }
        if (getRemoval_date() != null) {
            _hashCode += getRemoval_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeNlLettersOfLiability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlLettersOfLiability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitted_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "submitted_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removal_submitted_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "removal_submitted_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removal_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "removal_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
