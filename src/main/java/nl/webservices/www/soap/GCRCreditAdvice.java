/**
 * GCRCreditAdvice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCreditAdvice  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private java.lang.String credit_amount;

    private java.lang.String credit_currency;

    private nl.webservices.www.soap.GCRHistoryAdvisedLimit[] history_advised_limits;

    private nl.webservices.www.soap.GCRCreditFactor[] credit_factors;

    public GCRCreditAdvice() {
    }

    public GCRCreditAdvice(
           java.math.BigInteger graydon_company_id,
           java.lang.String credit_amount,
           java.lang.String credit_currency,
           nl.webservices.www.soap.GCRHistoryAdvisedLimit[] history_advised_limits,
           nl.webservices.www.soap.GCRCreditFactor[] credit_factors) {
           this.graydon_company_id = graydon_company_id;
           this.credit_amount = credit_amount;
           this.credit_currency = credit_currency;
           this.history_advised_limits = history_advised_limits;
           this.credit_factors = credit_factors;
    }


    /**
     * Gets the graydon_company_id value for this GCRCreditAdvice.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCreditAdvice.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the credit_amount value for this GCRCreditAdvice.
     * 
     * @return credit_amount
     */
    public java.lang.String getCredit_amount() {
        return credit_amount;
    }


    /**
     * Sets the credit_amount value for this GCRCreditAdvice.
     * 
     * @param credit_amount
     */
    public void setCredit_amount(java.lang.String credit_amount) {
        this.credit_amount = credit_amount;
    }


    /**
     * Gets the credit_currency value for this GCRCreditAdvice.
     * 
     * @return credit_currency
     */
    public java.lang.String getCredit_currency() {
        return credit_currency;
    }


    /**
     * Sets the credit_currency value for this GCRCreditAdvice.
     * 
     * @param credit_currency
     */
    public void setCredit_currency(java.lang.String credit_currency) {
        this.credit_currency = credit_currency;
    }


    /**
     * Gets the history_advised_limits value for this GCRCreditAdvice.
     * 
     * @return history_advised_limits
     */
    public nl.webservices.www.soap.GCRHistoryAdvisedLimit[] getHistory_advised_limits() {
        return history_advised_limits;
    }


    /**
     * Sets the history_advised_limits value for this GCRCreditAdvice.
     * 
     * @param history_advised_limits
     */
    public void setHistory_advised_limits(nl.webservices.www.soap.GCRHistoryAdvisedLimit[] history_advised_limits) {
        this.history_advised_limits = history_advised_limits;
    }


    /**
     * Gets the credit_factors value for this GCRCreditAdvice.
     * 
     * @return credit_factors
     */
    public nl.webservices.www.soap.GCRCreditFactor[] getCredit_factors() {
        return credit_factors;
    }


    /**
     * Sets the credit_factors value for this GCRCreditAdvice.
     * 
     * @param credit_factors
     */
    public void setCredit_factors(nl.webservices.www.soap.GCRCreditFactor[] credit_factors) {
        this.credit_factors = credit_factors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCreditAdvice)) return false;
        GCRCreditAdvice other = (GCRCreditAdvice) obj;
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
            ((this.credit_amount==null && other.getCredit_amount()==null) || 
             (this.credit_amount!=null &&
              this.credit_amount.equals(other.getCredit_amount()))) &&
            ((this.credit_currency==null && other.getCredit_currency()==null) || 
             (this.credit_currency!=null &&
              this.credit_currency.equals(other.getCredit_currency()))) &&
            ((this.history_advised_limits==null && other.getHistory_advised_limits()==null) || 
             (this.history_advised_limits!=null &&
              java.util.Arrays.equals(this.history_advised_limits, other.getHistory_advised_limits()))) &&
            ((this.credit_factors==null && other.getCredit_factors()==null) || 
             (this.credit_factors!=null &&
              java.util.Arrays.equals(this.credit_factors, other.getCredit_factors())));
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
        if (getCredit_amount() != null) {
            _hashCode += getCredit_amount().hashCode();
        }
        if (getCredit_currency() != null) {
            _hashCode += getCredit_currency().hashCode();
        }
        if (getHistory_advised_limits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory_advised_limits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistory_advised_limits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCredit_factors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredit_factors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredit_factors(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCreditAdvice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditAdvice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history_advised_limits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "history_advised_limits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRHistoryAdvisedLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_factors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_factors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditFactor"));
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
