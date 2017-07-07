/**
 * CreditsafeBeAdditionalInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBeAdditionalInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeBeNegativeInformation negative_information;

    private nl.webservices.www.soap.CreditsafeBeMisc misc;

    private nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis industry_quartile_analysis;

    private nl.webservices.www.soap.CreditsafeBePaymentExpectationsSummary payment_expectations_summary;

    private nl.webservices.www.soap.CreditsafeBeIndustryComparison industry_comparison;

    private nl.webservices.www.soap.CreditsafeBeRegisteredContractor[] registered_contractors;

    private nl.webservices.www.soap.CreditsafeBeEvent[] events;

    public CreditsafeBeAdditionalInformation() {
    }

    public CreditsafeBeAdditionalInformation(
           nl.webservices.www.soap.CreditsafeBeNegativeInformation negative_information,
           nl.webservices.www.soap.CreditsafeBeMisc misc,
           nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis industry_quartile_analysis,
           nl.webservices.www.soap.CreditsafeBePaymentExpectationsSummary payment_expectations_summary,
           nl.webservices.www.soap.CreditsafeBeIndustryComparison industry_comparison,
           nl.webservices.www.soap.CreditsafeBeRegisteredContractor[] registered_contractors,
           nl.webservices.www.soap.CreditsafeBeEvent[] events) {
           this.negative_information = negative_information;
           this.misc = misc;
           this.industry_quartile_analysis = industry_quartile_analysis;
           this.payment_expectations_summary = payment_expectations_summary;
           this.industry_comparison = industry_comparison;
           this.registered_contractors = registered_contractors;
           this.events = events;
    }


    /**
     * Gets the negative_information value for this CreditsafeBeAdditionalInformation.
     * 
     * @return negative_information
     */
    public nl.webservices.www.soap.CreditsafeBeNegativeInformation getNegative_information() {
        return negative_information;
    }


    /**
     * Sets the negative_information value for this CreditsafeBeAdditionalInformation.
     * 
     * @param negative_information
     */
    public void setNegative_information(nl.webservices.www.soap.CreditsafeBeNegativeInformation negative_information) {
        this.negative_information = negative_information;
    }


    /**
     * Gets the misc value for this CreditsafeBeAdditionalInformation.
     * 
     * @return misc
     */
    public nl.webservices.www.soap.CreditsafeBeMisc getMisc() {
        return misc;
    }


    /**
     * Sets the misc value for this CreditsafeBeAdditionalInformation.
     * 
     * @param misc
     */
    public void setMisc(nl.webservices.www.soap.CreditsafeBeMisc misc) {
        this.misc = misc;
    }


    /**
     * Gets the industry_quartile_analysis value for this CreditsafeBeAdditionalInformation.
     * 
     * @return industry_quartile_analysis
     */
    public nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis getIndustry_quartile_analysis() {
        return industry_quartile_analysis;
    }


    /**
     * Sets the industry_quartile_analysis value for this CreditsafeBeAdditionalInformation.
     * 
     * @param industry_quartile_analysis
     */
    public void setIndustry_quartile_analysis(nl.webservices.www.soap.CreditsafeIndustryQuartilyAnalysis industry_quartile_analysis) {
        this.industry_quartile_analysis = industry_quartile_analysis;
    }


    /**
     * Gets the payment_expectations_summary value for this CreditsafeBeAdditionalInformation.
     * 
     * @return payment_expectations_summary
     */
    public nl.webservices.www.soap.CreditsafeBePaymentExpectationsSummary getPayment_expectations_summary() {
        return payment_expectations_summary;
    }


    /**
     * Sets the payment_expectations_summary value for this CreditsafeBeAdditionalInformation.
     * 
     * @param payment_expectations_summary
     */
    public void setPayment_expectations_summary(nl.webservices.www.soap.CreditsafeBePaymentExpectationsSummary payment_expectations_summary) {
        this.payment_expectations_summary = payment_expectations_summary;
    }


    /**
     * Gets the industry_comparison value for this CreditsafeBeAdditionalInformation.
     * 
     * @return industry_comparison
     */
    public nl.webservices.www.soap.CreditsafeBeIndustryComparison getIndustry_comparison() {
        return industry_comparison;
    }


    /**
     * Sets the industry_comparison value for this CreditsafeBeAdditionalInformation.
     * 
     * @param industry_comparison
     */
    public void setIndustry_comparison(nl.webservices.www.soap.CreditsafeBeIndustryComparison industry_comparison) {
        this.industry_comparison = industry_comparison;
    }


    /**
     * Gets the registered_contractors value for this CreditsafeBeAdditionalInformation.
     * 
     * @return registered_contractors
     */
    public nl.webservices.www.soap.CreditsafeBeRegisteredContractor[] getRegistered_contractors() {
        return registered_contractors;
    }


    /**
     * Sets the registered_contractors value for this CreditsafeBeAdditionalInformation.
     * 
     * @param registered_contractors
     */
    public void setRegistered_contractors(nl.webservices.www.soap.CreditsafeBeRegisteredContractor[] registered_contractors) {
        this.registered_contractors = registered_contractors;
    }


    /**
     * Gets the events value for this CreditsafeBeAdditionalInformation.
     * 
     * @return events
     */
    public nl.webservices.www.soap.CreditsafeBeEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this CreditsafeBeAdditionalInformation.
     * 
     * @param events
     */
    public void setEvents(nl.webservices.www.soap.CreditsafeBeEvent[] events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBeAdditionalInformation)) return false;
        CreditsafeBeAdditionalInformation other = (CreditsafeBeAdditionalInformation) obj;
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
            ((this.industry_comparison==null && other.getIndustry_comparison()==null) || 
             (this.industry_comparison!=null &&
              this.industry_comparison.equals(other.getIndustry_comparison()))) &&
            ((this.registered_contractors==null && other.getRegistered_contractors()==null) || 
             (this.registered_contractors!=null &&
              java.util.Arrays.equals(this.registered_contractors, other.getRegistered_contractors()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getIndustry_comparison() != null) {
            _hashCode += getIndustry_comparison().hashCode();
        }
        if (getRegistered_contractors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistered_contractors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistered_contractors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeBeAdditionalInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeAdditionalInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negative_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "negative_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeNegativeInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeMisc"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBePaymentExpectationsSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_comparison");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_comparison"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeIndustryComparison"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registered_contractors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registered_contractors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeRegisteredContractor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeEvent"));
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
