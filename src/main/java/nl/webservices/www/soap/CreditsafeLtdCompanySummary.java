/**
 * CreditsafeLtdCompanySummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdCompanySummary  implements java.io.Serializable {
    private java.lang.String business_name;

    private java.lang.String country;

    private java.lang.String number;

    private java.lang.String company_registration_number;

    private nl.webservices.www.soap.CreditsafeCompanyActivity main_activity;

    private java.lang.String company_status;

    private java.math.BigDecimal latest_turnover_figure;

    private java.math.BigDecimal latest_shareholders_equity_figure;

    private java.lang.String credit_rating;

    private java.lang.String credit_limit;

    private java.lang.String rating_description;

    public CreditsafeLtdCompanySummary() {
    }

    public CreditsafeLtdCompanySummary(
           java.lang.String business_name,
           java.lang.String country,
           java.lang.String number,
           java.lang.String company_registration_number,
           nl.webservices.www.soap.CreditsafeCompanyActivity main_activity,
           java.lang.String company_status,
           java.math.BigDecimal latest_turnover_figure,
           java.math.BigDecimal latest_shareholders_equity_figure,
           java.lang.String credit_rating,
           java.lang.String credit_limit,
           java.lang.String rating_description) {
           this.business_name = business_name;
           this.country = country;
           this.number = number;
           this.company_registration_number = company_registration_number;
           this.main_activity = main_activity;
           this.company_status = company_status;
           this.latest_turnover_figure = latest_turnover_figure;
           this.latest_shareholders_equity_figure = latest_shareholders_equity_figure;
           this.credit_rating = credit_rating;
           this.credit_limit = credit_limit;
           this.rating_description = rating_description;
    }


    /**
     * Gets the business_name value for this CreditsafeLtdCompanySummary.
     * 
     * @return business_name
     */
    public java.lang.String getBusiness_name() {
        return business_name;
    }


    /**
     * Sets the business_name value for this CreditsafeLtdCompanySummary.
     * 
     * @param business_name
     */
    public void setBusiness_name(java.lang.String business_name) {
        this.business_name = business_name;
    }


    /**
     * Gets the country value for this CreditsafeLtdCompanySummary.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CreditsafeLtdCompanySummary.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the number value for this CreditsafeLtdCompanySummary.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CreditsafeLtdCompanySummary.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the company_registration_number value for this CreditsafeLtdCompanySummary.
     * 
     * @return company_registration_number
     */
    public java.lang.String getCompany_registration_number() {
        return company_registration_number;
    }


    /**
     * Sets the company_registration_number value for this CreditsafeLtdCompanySummary.
     * 
     * @param company_registration_number
     */
    public void setCompany_registration_number(java.lang.String company_registration_number) {
        this.company_registration_number = company_registration_number;
    }


    /**
     * Gets the main_activity value for this CreditsafeLtdCompanySummary.
     * 
     * @return main_activity
     */
    public nl.webservices.www.soap.CreditsafeCompanyActivity getMain_activity() {
        return main_activity;
    }


    /**
     * Sets the main_activity value for this CreditsafeLtdCompanySummary.
     * 
     * @param main_activity
     */
    public void setMain_activity(nl.webservices.www.soap.CreditsafeCompanyActivity main_activity) {
        this.main_activity = main_activity;
    }


    /**
     * Gets the company_status value for this CreditsafeLtdCompanySummary.
     * 
     * @return company_status
     */
    public java.lang.String getCompany_status() {
        return company_status;
    }


    /**
     * Sets the company_status value for this CreditsafeLtdCompanySummary.
     * 
     * @param company_status
     */
    public void setCompany_status(java.lang.String company_status) {
        this.company_status = company_status;
    }


    /**
     * Gets the latest_turnover_figure value for this CreditsafeLtdCompanySummary.
     * 
     * @return latest_turnover_figure
     */
    public java.math.BigDecimal getLatest_turnover_figure() {
        return latest_turnover_figure;
    }


    /**
     * Sets the latest_turnover_figure value for this CreditsafeLtdCompanySummary.
     * 
     * @param latest_turnover_figure
     */
    public void setLatest_turnover_figure(java.math.BigDecimal latest_turnover_figure) {
        this.latest_turnover_figure = latest_turnover_figure;
    }


    /**
     * Gets the latest_shareholders_equity_figure value for this CreditsafeLtdCompanySummary.
     * 
     * @return latest_shareholders_equity_figure
     */
    public java.math.BigDecimal getLatest_shareholders_equity_figure() {
        return latest_shareholders_equity_figure;
    }


    /**
     * Sets the latest_shareholders_equity_figure value for this CreditsafeLtdCompanySummary.
     * 
     * @param latest_shareholders_equity_figure
     */
    public void setLatest_shareholders_equity_figure(java.math.BigDecimal latest_shareholders_equity_figure) {
        this.latest_shareholders_equity_figure = latest_shareholders_equity_figure;
    }


    /**
     * Gets the credit_rating value for this CreditsafeLtdCompanySummary.
     * 
     * @return credit_rating
     */
    public java.lang.String getCredit_rating() {
        return credit_rating;
    }


    /**
     * Sets the credit_rating value for this CreditsafeLtdCompanySummary.
     * 
     * @param credit_rating
     */
    public void setCredit_rating(java.lang.String credit_rating) {
        this.credit_rating = credit_rating;
    }


    /**
     * Gets the credit_limit value for this CreditsafeLtdCompanySummary.
     * 
     * @return credit_limit
     */
    public java.lang.String getCredit_limit() {
        return credit_limit;
    }


    /**
     * Sets the credit_limit value for this CreditsafeLtdCompanySummary.
     * 
     * @param credit_limit
     */
    public void setCredit_limit(java.lang.String credit_limit) {
        this.credit_limit = credit_limit;
    }


    /**
     * Gets the rating_description value for this CreditsafeLtdCompanySummary.
     * 
     * @return rating_description
     */
    public java.lang.String getRating_description() {
        return rating_description;
    }


    /**
     * Sets the rating_description value for this CreditsafeLtdCompanySummary.
     * 
     * @param rating_description
     */
    public void setRating_description(java.lang.String rating_description) {
        this.rating_description = rating_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdCompanySummary)) return false;
        CreditsafeLtdCompanySummary other = (CreditsafeLtdCompanySummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.business_name==null && other.getBusiness_name()==null) || 
             (this.business_name!=null &&
              this.business_name.equals(other.getBusiness_name()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.company_registration_number==null && other.getCompany_registration_number()==null) || 
             (this.company_registration_number!=null &&
              this.company_registration_number.equals(other.getCompany_registration_number()))) &&
            ((this.main_activity==null && other.getMain_activity()==null) || 
             (this.main_activity!=null &&
              this.main_activity.equals(other.getMain_activity()))) &&
            ((this.company_status==null && other.getCompany_status()==null) || 
             (this.company_status!=null &&
              this.company_status.equals(other.getCompany_status()))) &&
            ((this.latest_turnover_figure==null && other.getLatest_turnover_figure()==null) || 
             (this.latest_turnover_figure!=null &&
              this.latest_turnover_figure.equals(other.getLatest_turnover_figure()))) &&
            ((this.latest_shareholders_equity_figure==null && other.getLatest_shareholders_equity_figure()==null) || 
             (this.latest_shareholders_equity_figure!=null &&
              this.latest_shareholders_equity_figure.equals(other.getLatest_shareholders_equity_figure()))) &&
            ((this.credit_rating==null && other.getCredit_rating()==null) || 
             (this.credit_rating!=null &&
              this.credit_rating.equals(other.getCredit_rating()))) &&
            ((this.credit_limit==null && other.getCredit_limit()==null) || 
             (this.credit_limit!=null &&
              this.credit_limit.equals(other.getCredit_limit()))) &&
            ((this.rating_description==null && other.getRating_description()==null) || 
             (this.rating_description!=null &&
              this.rating_description.equals(other.getRating_description())));
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
        if (getBusiness_name() != null) {
            _hashCode += getBusiness_name().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getCompany_registration_number() != null) {
            _hashCode += getCompany_registration_number().hashCode();
        }
        if (getMain_activity() != null) {
            _hashCode += getMain_activity().hashCode();
        }
        if (getCompany_status() != null) {
            _hashCode += getCompany_status().hashCode();
        }
        if (getLatest_turnover_figure() != null) {
            _hashCode += getLatest_turnover_figure().hashCode();
        }
        if (getLatest_shareholders_equity_figure() != null) {
            _hashCode += getLatest_shareholders_equity_figure().hashCode();
        }
        if (getCredit_rating() != null) {
            _hashCode += getCredit_rating().hashCode();
        }
        if (getCredit_limit() != null) {
            _hashCode += getCredit_limit().hashCode();
        }
        if (getRating_description() != null) {
            _hashCode += getRating_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeLtdCompanySummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCompanySummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "business_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_registration_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_registration_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "main_activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyActivity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latest_turnover_figure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latest_turnover_figure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latest_shareholders_equity_figure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latest_shareholders_equity_figure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rating_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rating_description"));
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
