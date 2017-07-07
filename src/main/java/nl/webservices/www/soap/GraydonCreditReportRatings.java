/**
 * GraydonCreditReportRatings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReportRatings  implements java.io.Serializable {
    private java.lang.String credit_advice_amount;

    private java.lang.String credit_advice_currency;

    private nl.webservices.www.soap.GCRCreditFactor[] credit_advice_factors;

    private java.lang.String pd_rating;

    private nl.webservices.www.soap.GCRRating[] ratings;

    private nl.webservices.www.soap.GCRPaymentInformation[] payment_information;

    private nl.webservices.www.soap.GCRAlarm alarm;

    public GraydonCreditReportRatings() {
    }

    public GraydonCreditReportRatings(
           java.lang.String credit_advice_amount,
           java.lang.String credit_advice_currency,
           nl.webservices.www.soap.GCRCreditFactor[] credit_advice_factors,
           java.lang.String pd_rating,
           nl.webservices.www.soap.GCRRating[] ratings,
           nl.webservices.www.soap.GCRPaymentInformation[] payment_information,
           nl.webservices.www.soap.GCRAlarm alarm) {
           this.credit_advice_amount = credit_advice_amount;
           this.credit_advice_currency = credit_advice_currency;
           this.credit_advice_factors = credit_advice_factors;
           this.pd_rating = pd_rating;
           this.ratings = ratings;
           this.payment_information = payment_information;
           this.alarm = alarm;
    }


    /**
     * Gets the credit_advice_amount value for this GraydonCreditReportRatings.
     * 
     * @return credit_advice_amount
     */
    public java.lang.String getCredit_advice_amount() {
        return credit_advice_amount;
    }


    /**
     * Sets the credit_advice_amount value for this GraydonCreditReportRatings.
     * 
     * @param credit_advice_amount
     */
    public void setCredit_advice_amount(java.lang.String credit_advice_amount) {
        this.credit_advice_amount = credit_advice_amount;
    }


    /**
     * Gets the credit_advice_currency value for this GraydonCreditReportRatings.
     * 
     * @return credit_advice_currency
     */
    public java.lang.String getCredit_advice_currency() {
        return credit_advice_currency;
    }


    /**
     * Sets the credit_advice_currency value for this GraydonCreditReportRatings.
     * 
     * @param credit_advice_currency
     */
    public void setCredit_advice_currency(java.lang.String credit_advice_currency) {
        this.credit_advice_currency = credit_advice_currency;
    }


    /**
     * Gets the credit_advice_factors value for this GraydonCreditReportRatings.
     * 
     * @return credit_advice_factors
     */
    public nl.webservices.www.soap.GCRCreditFactor[] getCredit_advice_factors() {
        return credit_advice_factors;
    }


    /**
     * Sets the credit_advice_factors value for this GraydonCreditReportRatings.
     * 
     * @param credit_advice_factors
     */
    public void setCredit_advice_factors(nl.webservices.www.soap.GCRCreditFactor[] credit_advice_factors) {
        this.credit_advice_factors = credit_advice_factors;
    }


    /**
     * Gets the pd_rating value for this GraydonCreditReportRatings.
     * 
     * @return pd_rating
     */
    public java.lang.String getPd_rating() {
        return pd_rating;
    }


    /**
     * Sets the pd_rating value for this GraydonCreditReportRatings.
     * 
     * @param pd_rating
     */
    public void setPd_rating(java.lang.String pd_rating) {
        this.pd_rating = pd_rating;
    }


    /**
     * Gets the ratings value for this GraydonCreditReportRatings.
     * 
     * @return ratings
     */
    public nl.webservices.www.soap.GCRRating[] getRatings() {
        return ratings;
    }


    /**
     * Sets the ratings value for this GraydonCreditReportRatings.
     * 
     * @param ratings
     */
    public void setRatings(nl.webservices.www.soap.GCRRating[] ratings) {
        this.ratings = ratings;
    }


    /**
     * Gets the payment_information value for this GraydonCreditReportRatings.
     * 
     * @return payment_information
     */
    public nl.webservices.www.soap.GCRPaymentInformation[] getPayment_information() {
        return payment_information;
    }


    /**
     * Sets the payment_information value for this GraydonCreditReportRatings.
     * 
     * @param payment_information
     */
    public void setPayment_information(nl.webservices.www.soap.GCRPaymentInformation[] payment_information) {
        this.payment_information = payment_information;
    }


    /**
     * Gets the alarm value for this GraydonCreditReportRatings.
     * 
     * @return alarm
     */
    public nl.webservices.www.soap.GCRAlarm getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this GraydonCreditReportRatings.
     * 
     * @param alarm
     */
    public void setAlarm(nl.webservices.www.soap.GCRAlarm alarm) {
        this.alarm = alarm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReportRatings)) return false;
        GraydonCreditReportRatings other = (GraydonCreditReportRatings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credit_advice_amount==null && other.getCredit_advice_amount()==null) || 
             (this.credit_advice_amount!=null &&
              this.credit_advice_amount.equals(other.getCredit_advice_amount()))) &&
            ((this.credit_advice_currency==null && other.getCredit_advice_currency()==null) || 
             (this.credit_advice_currency!=null &&
              this.credit_advice_currency.equals(other.getCredit_advice_currency()))) &&
            ((this.credit_advice_factors==null && other.getCredit_advice_factors()==null) || 
             (this.credit_advice_factors!=null &&
              java.util.Arrays.equals(this.credit_advice_factors, other.getCredit_advice_factors()))) &&
            ((this.pd_rating==null && other.getPd_rating()==null) || 
             (this.pd_rating!=null &&
              this.pd_rating.equals(other.getPd_rating()))) &&
            ((this.ratings==null && other.getRatings()==null) || 
             (this.ratings!=null &&
              java.util.Arrays.equals(this.ratings, other.getRatings()))) &&
            ((this.payment_information==null && other.getPayment_information()==null) || 
             (this.payment_information!=null &&
              java.util.Arrays.equals(this.payment_information, other.getPayment_information()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm())));
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
        if (getCredit_advice_amount() != null) {
            _hashCode += getCredit_advice_amount().hashCode();
        }
        if (getCredit_advice_currency() != null) {
            _hashCode += getCredit_advice_currency().hashCode();
        }
        if (getCredit_advice_factors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredit_advice_factors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredit_advice_factors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPd_rating() != null) {
            _hashCode += getPd_rating().hashCode();
        }
        if (getRatings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayment_information() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayment_information());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayment_information(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReportRatings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportRatings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_advice_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_advice_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_advice_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_advice_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_advice_factors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_advice_factors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditFactor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pd_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pd_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ratings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "payment_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRPaymentInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarm"));
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
