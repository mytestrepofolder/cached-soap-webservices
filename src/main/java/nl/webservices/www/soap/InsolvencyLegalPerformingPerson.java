/**
 * InsolvencyLegalPerformingPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyLegalPerformingPerson  implements java.io.Serializable {
    private java.lang.String titles;

    private java.lang.String initials;

    private java.lang.String prefix;

    private java.lang.String last_name;

    private nl.webservices.www.soap.InsolvencyAddress contact_info;

    private java.util.Date start_date;

    private java.util.Date end_date;

    public InsolvencyLegalPerformingPerson() {
    }

    public InsolvencyLegalPerformingPerson(
           java.lang.String titles,
           java.lang.String initials,
           java.lang.String prefix,
           java.lang.String last_name,
           nl.webservices.www.soap.InsolvencyAddress contact_info,
           java.util.Date start_date,
           java.util.Date end_date) {
           this.titles = titles;
           this.initials = initials;
           this.prefix = prefix;
           this.last_name = last_name;
           this.contact_info = contact_info;
           this.start_date = start_date;
           this.end_date = end_date;
    }


    /**
     * Gets the titles value for this InsolvencyLegalPerformingPerson.
     * 
     * @return titles
     */
    public java.lang.String getTitles() {
        return titles;
    }


    /**
     * Sets the titles value for this InsolvencyLegalPerformingPerson.
     * 
     * @param titles
     */
    public void setTitles(java.lang.String titles) {
        this.titles = titles;
    }


    /**
     * Gets the initials value for this InsolvencyLegalPerformingPerson.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this InsolvencyLegalPerformingPerson.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the prefix value for this InsolvencyLegalPerformingPerson.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this InsolvencyLegalPerformingPerson.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the last_name value for this InsolvencyLegalPerformingPerson.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this InsolvencyLegalPerformingPerson.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the contact_info value for this InsolvencyLegalPerformingPerson.
     * 
     * @return contact_info
     */
    public nl.webservices.www.soap.InsolvencyAddress getContact_info() {
        return contact_info;
    }


    /**
     * Sets the contact_info value for this InsolvencyLegalPerformingPerson.
     * 
     * @param contact_info
     */
    public void setContact_info(nl.webservices.www.soap.InsolvencyAddress contact_info) {
        this.contact_info = contact_info;
    }


    /**
     * Gets the start_date value for this InsolvencyLegalPerformingPerson.
     * 
     * @return start_date
     */
    public java.util.Date getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this InsolvencyLegalPerformingPerson.
     * 
     * @param start_date
     */
    public void setStart_date(java.util.Date start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this InsolvencyLegalPerformingPerson.
     * 
     * @return end_date
     */
    public java.util.Date getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this InsolvencyLegalPerformingPerson.
     * 
     * @param end_date
     */
    public void setEnd_date(java.util.Date end_date) {
        this.end_date = end_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyLegalPerformingPerson)) return false;
        InsolvencyLegalPerformingPerson other = (InsolvencyLegalPerformingPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titles==null && other.getTitles()==null) || 
             (this.titles!=null &&
              this.titles.equals(other.getTitles()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.contact_info==null && other.getContact_info()==null) || 
             (this.contact_info!=null &&
              this.contact_info.equals(other.getContact_info()))) &&
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
        if (getTitles() != null) {
            _hashCode += getTitles().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getContact_info() != null) {
            _hashCode += getContact_info().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(InsolvencyLegalPerformingPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyLegalPerformingPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "titles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "end_date"));
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
