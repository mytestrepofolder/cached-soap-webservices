/**
 * CreditsafeNlAdditionalInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeNlAdditionalInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeNlNegativeInformation negative_information;

    private nl.webservices.www.soap.CreditsafeNlMisc misc;

    private nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis industry_quartile_analysis;

    private nl.webservices.www.soap.CreditsafeNlPaymentExpectationsSummary payment_expectations_summary;

    private nl.webservices.www.soap.CreditsafeNlLettersOfLiabilityInformation403 letters_of_liability_information_403;

    public CreditsafeNlAdditionalInformation() {
    }

    public CreditsafeNlAdditionalInformation(
           nl.webservices.www.soap.CreditsafeNlNegativeInformation negative_information,
           nl.webservices.www.soap.CreditsafeNlMisc misc,
           nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis industry_quartile_analysis,
           nl.webservices.www.soap.CreditsafeNlPaymentExpectationsSummary payment_expectations_summary,
           nl.webservices.www.soap.CreditsafeNlLettersOfLiabilityInformation403 letters_of_liability_information_403) {
           this.negative_information = negative_information;
           this.misc = misc;
           this.industry_quartile_analysis = industry_quartile_analysis;
           this.payment_expectations_summary = payment_expectations_summary;
           this.letters_of_liability_information_403 = letters_of_liability_information_403;
    }


    /**
     * Gets the negative_information value for this CreditsafeNlAdditionalInformation.
     * 
     * @return negative_information
     */
    public nl.webservices.www.soap.CreditsafeNlNegativeInformation getNegative_information() {
        return negative_information;
    }


    /**
     * Sets the negative_information value for this CreditsafeNlAdditionalInformation.
     * 
     * @param negative_information
     */
    public void setNegative_information(nl.webservices.www.soap.CreditsafeNlNegativeInformation negative_information) {
        this.negative_information = negative_information;
    }


    /**
     * Gets the misc value for this CreditsafeNlAdditionalInformation.
     * 
     * @return misc
     */
    public nl.webservices.www.soap.CreditsafeNlMisc getMisc() {
        return misc;
    }


    /**
     * Sets the misc value for this CreditsafeNlAdditionalInformation.
     * 
     * @param misc
     */
    public void setMisc(nl.webservices.www.soap.CreditsafeNlMisc misc) {
        this.misc = misc;
    }


    /**
     * Gets the industry_quartile_analysis value for this CreditsafeNlAdditionalInformation.
     * 
     * @return industry_quartile_analysis
     */
    public nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis getIndustry_quartile_analysis() {
        return industry_quartile_analysis;
    }


    /**
     * Sets the industry_quartile_analysis value for this CreditsafeNlAdditionalInformation.
     * 
     * @param industry_quartile_analysis
     */
    public void setIndustry_quartile_analysis(nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis industry_quartile_analysis) {
        this.industry_quartile_analysis = industry_quartile_analysis;
    }


    /**
     * Gets the payment_expectations_summary value for this CreditsafeNlAdditionalInformation.
     * 
     * @return payment_expectations_summary
     */
    public nl.webservices.www.soap.CreditsafeNlPaymentExpectationsSummary getPayment_expectations_summary() {
        return payment_expectations_summary;
    }


    /**
     * Sets the payment_expectations_summary value for this CreditsafeNlAdditionalInformation.
     * 
     * @param payment_expectations_summary
     */
    public void setPayment_expectations_summary(nl.webservices.www.soap.CreditsafeNlPaymentExpectationsSummary payment_expectations_summary) {
        this.payment_expectations_summary = payment_expectations_summary;
    }


    /**
     * Gets the letters_of_liability_information_403 value for this CreditsafeNlAdditionalInformation.
     * 
     * @return letters_of_liability_information_403
     */
    public nl.webservices.www.soap.CreditsafeNlLettersOfLiabilityInformation403 getLetters_of_liability_information_403() {
        return letters_of_liability_information_403;
    }


    /**
     * Sets the letters_of_liability_information_403 value for this CreditsafeNlAdditionalInformation.
     * 
     * @param letters_of_liability_information_403
     */
    public void setLetters_of_liability_information_403(nl.webservices.www.soap.CreditsafeNlLettersOfLiabilityInformation403 letters_of_liability_information_403) {
        this.letters_of_liability_information_403 = letters_of_liability_information_403;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeNlAdditionalInformation)) return false;
        CreditsafeNlAdditionalInformation other = (CreditsafeNlAdditionalInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.negative_information==null && other.getNegative_information()==null) || 
             (this.negative_information!=null &&
              this.negative_information.equals(other.getNegative_information()))) &&
            ((this.misc==null && other.getMisc()==null) || 
             (this.misc!=null &&
              this.misc.equals(other.getMisc()))) &&
            ((this.industry_quartile_analysis==null && other.getIndustry_quartile_analysis()==null) || 
             (this.industry_quartile_analysis!=null &&
              this.industry_quartile_analysis.equals(other.getIndustry_quartile_analysis()))) &&
            ((this.payment_expectations_summary==null && other.getPayment_expectations_summary()==null) || 
             (this.payment_expectations_summary!=null &&
              this.payment_expectations_summary.equals(other.getPayment_expectations_summary()))) &&
            ((this.letters_of_liability_information_403==null && other.getLetters_of_liability_information_403()==null) || 
             (this.letters_of_liability_information_403!=null &&
              this.letters_of_liability_information_403.equals(other.getLetters_of_liability_information_403())));
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
        if (getNegative_information() != null) {
            _hashCode += getNegative_information().hashCode();
        }
        if (getMisc() != null) {
            _hashCode += getMisc().hashCode();
        }
        if (getIndustry_quartile_analysis() != null) {
            _hashCode += getIndustry_quartile_analysis().hashCode();
        }
        if (getPayment_expectations_summary() != null) {
            _hashCode += getPayment_expectations_summary().hashCode();
        }
        if (getLetters_of_liability_information_403() != null) {
            _hashCode += getLetters_of_liability_information_403().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeNlAdditionalInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlAdditionalInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negative_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "negative_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlNegativeInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlMisc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_quartile_analysis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_quartile_analysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeIndustryQuartilyAnalysis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_expectations_summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "payment_expectations_summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlPaymentExpectationsSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letters_of_liability_information_403");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "letters_of_liability_information_403"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlLettersOfLiabilityInformation403"));
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
