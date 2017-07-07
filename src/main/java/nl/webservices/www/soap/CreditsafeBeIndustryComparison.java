/**
 * CreditsafeBeIndustryComparison.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBeIndustryComparison  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt activity_code;

    private java.lang.String activity_description;

    private java.math.BigDecimal industry_average_payment_expectation_days;

    private java.math.BigDecimal industry_average_day_sales_outstanding;

    private java.math.BigDecimal industry_average_credit_rating;

    public CreditsafeBeIndustryComparison() {
    }

    public CreditsafeBeIndustryComparison(
           org.apache.axis.types.UnsignedInt activity_code,
           java.lang.String activity_description,
           java.math.BigDecimal industry_average_payment_expectation_days,
           java.math.BigDecimal industry_average_day_sales_outstanding,
           java.math.BigDecimal industry_average_credit_rating) {
           this.activity_code = activity_code;
           this.activity_description = activity_description;
           this.industry_average_payment_expectation_days = industry_average_payment_expectation_days;
           this.industry_average_day_sales_outstanding = industry_average_day_sales_outstanding;
           this.industry_average_credit_rating = industry_average_credit_rating;
    }


    /**
     * Gets the activity_code value for this CreditsafeBeIndustryComparison.
     * 
     * @return activity_code
     */
    public org.apache.axis.types.UnsignedInt getActivity_code() {
        return activity_code;
    }


    /**
     * Sets the activity_code value for this CreditsafeBeIndustryComparison.
     * 
     * @param activity_code
     */
    public void setActivity_code(org.apache.axis.types.UnsignedInt activity_code) {
        this.activity_code = activity_code;
    }


    /**
     * Gets the activity_description value for this CreditsafeBeIndustryComparison.
     * 
     * @return activity_description
     */
    public java.lang.String getActivity_description() {
        return activity_description;
    }


    /**
     * Sets the activity_description value for this CreditsafeBeIndustryComparison.
     * 
     * @param activity_description
     */
    public void setActivity_description(java.lang.String activity_description) {
        this.activity_description = activity_description;
    }


    /**
     * Gets the industry_average_payment_expectation_days value for this CreditsafeBeIndustryComparison.
     * 
     * @return industry_average_payment_expectation_days
     */
    public java.math.BigDecimal getIndustry_average_payment_expectation_days() {
        return industry_average_payment_expectation_days;
    }


    /**
     * Sets the industry_average_payment_expectation_days value for this CreditsafeBeIndustryComparison.
     * 
     * @param industry_average_payment_expectation_days
     */
    public void setIndustry_average_payment_expectation_days(java.math.BigDecimal industry_average_payment_expectation_days) {
        this.industry_average_payment_expectation_days = industry_average_payment_expectation_days;
    }


    /**
     * Gets the industry_average_day_sales_outstanding value for this CreditsafeBeIndustryComparison.
     * 
     * @return industry_average_day_sales_outstanding
     */
    public java.math.BigDecimal getIndustry_average_day_sales_outstanding() {
        return industry_average_day_sales_outstanding;
    }


    /**
     * Sets the industry_average_day_sales_outstanding value for this CreditsafeBeIndustryComparison.
     * 
     * @param industry_average_day_sales_outstanding
     */
    public void setIndustry_average_day_sales_outstanding(java.math.BigDecimal industry_average_day_sales_outstanding) {
        this.industry_average_day_sales_outstanding = industry_average_day_sales_outstanding;
    }


    /**
     * Gets the industry_average_credit_rating value for this CreditsafeBeIndustryComparison.
     * 
     * @return industry_average_credit_rating
     */
    public java.math.BigDecimal getIndustry_average_credit_rating() {
        return industry_average_credit_rating;
    }


    /**
     * Sets the industry_average_credit_rating value for this CreditsafeBeIndustryComparison.
     * 
     * @param industry_average_credit_rating
     */
    public void setIndustry_average_credit_rating(java.math.BigDecimal industry_average_credit_rating) {
        this.industry_average_credit_rating = industry_average_credit_rating;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBeIndustryComparison)) return false;
        CreditsafeBeIndustryComparison other = (CreditsafeBeIndustryComparison) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activity_code==null && other.getActivity_code()==null) || 
             (this.activity_code!=null &&
              this.activity_code.equals(other.getActivity_code()))) &&
            ((this.activity_description==null && other.getActivity_description()==null) || 
             (this.activity_description!=null &&
              this.activity_description.equals(other.getActivity_description()))) &&
            ((this.industry_average_payment_expectation_days==null && other.getIndustry_average_payment_expectation_days()==null) || 
             (this.industry_average_payment_expectation_days!=null &&
              this.industry_average_payment_expectation_days.equals(other.getIndustry_average_payment_expectation_days()))) &&
            ((this.industry_average_day_sales_outstanding==null && other.getIndustry_average_day_sales_outstanding()==null) || 
             (this.industry_average_day_sales_outstanding!=null &&
              this.industry_average_day_sales_outstanding.equals(other.getIndustry_average_day_sales_outstanding()))) &&
            ((this.industry_average_credit_rating==null && other.getIndustry_average_credit_rating()==null) || 
             (this.industry_average_credit_rating!=null &&
              this.industry_average_credit_rating.equals(other.getIndustry_average_credit_rating())));
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
        if (getActivity_code() != null) {
            _hashCode += getActivity_code().hashCode();
        }
        if (getActivity_description() != null) {
            _hashCode += getActivity_description().hashCode();
        }
        if (getIndustry_average_payment_expectation_days() != null) {
            _hashCode += getIndustry_average_payment_expectation_days().hashCode();
        }
        if (getIndustry_average_day_sales_outstanding() != null) {
            _hashCode += getIndustry_average_day_sales_outstanding().hashCode();
        }
        if (getIndustry_average_credit_rating() != null) {
            _hashCode += getIndustry_average_credit_rating().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeBeIndustryComparison.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeIndustryComparison"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_average_payment_expectation_days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_average_payment_expectation_days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_average_day_sales_outstanding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_average_day_sales_outstanding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_average_credit_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_average_credit_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
