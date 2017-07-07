/**
 * GCRShareHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRShareHolder  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private java.math.BigInteger graydon_person_id;

    private java.lang.Boolean is_current;

    private java.lang.Float percentage_of_shares;

    private java.util.Date date_from;

    private java.util.Date date_until;

    public GCRShareHolder() {
    }

    public GCRShareHolder(
           java.math.BigInteger graydon_company_id,
           java.math.BigInteger graydon_person_id,
           java.lang.Boolean is_current,
           java.lang.Float percentage_of_shares,
           java.util.Date date_from,
           java.util.Date date_until) {
           this.graydon_company_id = graydon_company_id;
           this.graydon_person_id = graydon_person_id;
           this.is_current = is_current;
           this.percentage_of_shares = percentage_of_shares;
           this.date_from = date_from;
           this.date_until = date_until;
    }


    /**
     * Gets the graydon_company_id value for this GCRShareHolder.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRShareHolder.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the graydon_person_id value for this GCRShareHolder.
     * 
     * @return graydon_person_id
     */
    public java.math.BigInteger getGraydon_person_id() {
        return graydon_person_id;
    }


    /**
     * Sets the graydon_person_id value for this GCRShareHolder.
     * 
     * @param graydon_person_id
     */
    public void setGraydon_person_id(java.math.BigInteger graydon_person_id) {
        this.graydon_person_id = graydon_person_id;
    }


    /**
     * Gets the is_current value for this GCRShareHolder.
     * 
     * @return is_current
     */
    public java.lang.Boolean getIs_current() {
        return is_current;
    }


    /**
     * Sets the is_current value for this GCRShareHolder.
     * 
     * @param is_current
     */
    public void setIs_current(java.lang.Boolean is_current) {
        this.is_current = is_current;
    }


    /**
     * Gets the percentage_of_shares value for this GCRShareHolder.
     * 
     * @return percentage_of_shares
     */
    public java.lang.Float getPercentage_of_shares() {
        return percentage_of_shares;
    }


    /**
     * Sets the percentage_of_shares value for this GCRShareHolder.
     * 
     * @param percentage_of_shares
     */
    public void setPercentage_of_shares(java.lang.Float percentage_of_shares) {
        this.percentage_of_shares = percentage_of_shares;
    }


    /**
     * Gets the date_from value for this GCRShareHolder.
     * 
     * @return date_from
     */
    public java.util.Date getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this GCRShareHolder.
     * 
     * @param date_from
     */
    public void setDate_from(java.util.Date date_from) {
        this.date_from = date_from;
    }


    /**
     * Gets the date_until value for this GCRShareHolder.
     * 
     * @return date_until
     */
    public java.util.Date getDate_until() {
        return date_until;
    }


    /**
     * Sets the date_until value for this GCRShareHolder.
     * 
     * @param date_until
     */
    public void setDate_until(java.util.Date date_until) {
        this.date_until = date_until;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRShareHolder)) return false;
        GCRShareHolder other = (GCRShareHolder) obj;
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
            ((this.percentage_of_shares==null && other.getPercentage_of_shares()==null) || 
             (this.percentage_of_shares!=null &&
              this.percentage_of_shares.equals(other.getPercentage_of_shares()))) &&
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
        if (getGraydon_company_id() != null) {
            _hashCode += getGraydon_company_id().hashCode();
        }
        if (getGraydon_person_id() != null) {
            _hashCode += getGraydon_person_id().hashCode();
        }
        if (getIs_current() != null) {
            _hashCode += getIs_current().hashCode();
        }
        if (getPercentage_of_shares() != null) {
            _hashCode += getPercentage_of_shares().hashCode();
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
        new org.apache.axis.description.TypeDesc(GCRShareHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRShareHolder"));
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
        elemField.setFieldName("percentage_of_shares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "percentage_of_shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
