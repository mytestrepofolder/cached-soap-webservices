/**
 * CreditsafeBeNSSODetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBeNSSODetail  implements java.io.Serializable {
    private java.lang.String business_number;

    private java.lang.String name_of_defendant;

    private java.lang.String legal_form_of_defendant;

    private java.util.Date date_of_summons;

    private java.lang.String labour_court;

    public CreditsafeBeNSSODetail() {
    }

    public CreditsafeBeNSSODetail(
           java.lang.String business_number,
           java.lang.String name_of_defendant,
           java.lang.String legal_form_of_defendant,
           java.util.Date date_of_summons,
           java.lang.String labour_court) {
           this.business_number = business_number;
           this.name_of_defendant = name_of_defendant;
           this.legal_form_of_defendant = legal_form_of_defendant;
           this.date_of_summons = date_of_summons;
           this.labour_court = labour_court;
    }


    /**
     * Gets the business_number value for this CreditsafeBeNSSODetail.
     * 
     * @return business_number
     */
    public java.lang.String getBusiness_number() {
        return business_number;
    }


    /**
     * Sets the business_number value for this CreditsafeBeNSSODetail.
     * 
     * @param business_number
     */
    public void setBusiness_number(java.lang.String business_number) {
        this.business_number = business_number;
    }


    /**
     * Gets the name_of_defendant value for this CreditsafeBeNSSODetail.
     * 
     * @return name_of_defendant
     */
    public java.lang.String getName_of_defendant() {
        return name_of_defendant;
    }


    /**
     * Sets the name_of_defendant value for this CreditsafeBeNSSODetail.
     * 
     * @param name_of_defendant
     */
    public void setName_of_defendant(java.lang.String name_of_defendant) {
        this.name_of_defendant = name_of_defendant;
    }


    /**
     * Gets the legal_form_of_defendant value for this CreditsafeBeNSSODetail.
     * 
     * @return legal_form_of_defendant
     */
    public java.lang.String getLegal_form_of_defendant() {
        return legal_form_of_defendant;
    }


    /**
     * Sets the legal_form_of_defendant value for this CreditsafeBeNSSODetail.
     * 
     * @param legal_form_of_defendant
     */
    public void setLegal_form_of_defendant(java.lang.String legal_form_of_defendant) {
        this.legal_form_of_defendant = legal_form_of_defendant;
    }


    /**
     * Gets the date_of_summons value for this CreditsafeBeNSSODetail.
     * 
     * @return date_of_summons
     */
    public java.util.Date getDate_of_summons() {
        return date_of_summons;
    }


    /**
     * Sets the date_of_summons value for this CreditsafeBeNSSODetail.
     * 
     * @param date_of_summons
     */
    public void setDate_of_summons(java.util.Date date_of_summons) {
        this.date_of_summons = date_of_summons;
    }


    /**
     * Gets the labour_court value for this CreditsafeBeNSSODetail.
     * 
     * @return labour_court
     */
    public java.lang.String getLabour_court() {
        return labour_court;
    }


    /**
     * Sets the labour_court value for this CreditsafeBeNSSODetail.
     * 
     * @param labour_court
     */
    public void setLabour_court(java.lang.String labour_court) {
        this.labour_court = labour_court;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBeNSSODetail)) return false;
        CreditsafeBeNSSODetail other = (CreditsafeBeNSSODetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.business_number==null && other.getBusiness_number()==null) || 
             (this.business_number!=null &&
              this.business_number.equals(other.getBusiness_number()))) &&
            ((this.name_of_defendant==null && other.getName_of_defendant()==null) || 
             (this.name_of_defendant!=null &&
              this.name_of_defendant.equals(other.getName_of_defendant()))) &&
            ((this.legal_form_of_defendant==null && other.getLegal_form_of_defendant()==null) || 
             (this.legal_form_of_defendant!=null &&
              this.legal_form_of_defendant.equals(other.getLegal_form_of_defendant()))) &&
            ((this.date_of_summons==null && other.getDate_of_summons()==null) || 
             (this.date_of_summons!=null &&
              this.date_of_summons.equals(other.getDate_of_summons()))) &&
            ((this.labour_court==null && other.getLabour_court()==null) || 
             (this.labour_court!=null &&
              this.labour_court.equals(other.getLabour_court())));
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
        if (getBusiness_number() != null) {
            _hashCode += getBusiness_number().hashCode();
        }
        if (getName_of_defendant() != null) {
            _hashCode += getName_of_defendant().hashCode();
        }
        if (getLegal_form_of_defendant() != null) {
            _hashCode += getLegal_form_of_defendant().hashCode();
        }
        if (getDate_of_summons() != null) {
            _hashCode += getDate_of_summons().hashCode();
        }
        if (getLabour_court() != null) {
            _hashCode += getLabour_court().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeBeNSSODetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeNSSODetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name_of_defendant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name_of_defendant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_of_defendant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_of_defendant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_summons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_summons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labour_court");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "labour_court"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
