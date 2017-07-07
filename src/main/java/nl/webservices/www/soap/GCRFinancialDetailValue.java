/**
 * GCRFinancialDetailValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRFinancialDetailValue  implements java.io.Serializable {
    private java.lang.String financial_code;

    private java.lang.String financial_text;

    private int year;

    private java.math.BigDecimal amount;

    private java.lang.String amount_currency;

    private java.math.BigDecimal forecast;

    public GCRFinancialDetailValue() {
    }

    public GCRFinancialDetailValue(
           java.lang.String financial_code,
           java.lang.String financial_text,
           int year,
           java.math.BigDecimal amount,
           java.lang.String amount_currency,
           java.math.BigDecimal forecast) {
           this.financial_code = financial_code;
           this.financial_text = financial_text;
           this.year = year;
           this.amount = amount;
           this.amount_currency = amount_currency;
           this.forecast = forecast;
    }


    /**
     * Gets the financial_code value for this GCRFinancialDetailValue.
     * 
     * @return financial_code
     */
    public java.lang.String getFinancial_code() {
        return financial_code;
    }


    /**
     * Sets the financial_code value for this GCRFinancialDetailValue.
     * 
     * @param financial_code
     */
    public void setFinancial_code(java.lang.String financial_code) {
        this.financial_code = financial_code;
    }


    /**
     * Gets the financial_text value for this GCRFinancialDetailValue.
     * 
     * @return financial_text
     */
    public java.lang.String getFinancial_text() {
        return financial_text;
    }


    /**
     * Sets the financial_text value for this GCRFinancialDetailValue.
     * 
     * @param financial_text
     */
    public void setFinancial_text(java.lang.String financial_text) {
        this.financial_text = financial_text;
    }


    /**
     * Gets the year value for this GCRFinancialDetailValue.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this GCRFinancialDetailValue.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the amount value for this GCRFinancialDetailValue.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this GCRFinancialDetailValue.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the amount_currency value for this GCRFinancialDetailValue.
     * 
     * @return amount_currency
     */
    public java.lang.String getAmount_currency() {
        return amount_currency;
    }


    /**
     * Sets the amount_currency value for this GCRFinancialDetailValue.
     * 
     * @param amount_currency
     */
    public void setAmount_currency(java.lang.String amount_currency) {
        this.amount_currency = amount_currency;
    }


    /**
     * Gets the forecast value for this GCRFinancialDetailValue.
     * 
     * @return forecast
     */
    public java.math.BigDecimal getForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this GCRFinancialDetailValue.
     * 
     * @param forecast
     */
    public void setForecast(java.math.BigDecimal forecast) {
        this.forecast = forecast;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRFinancialDetailValue)) return false;
        GCRFinancialDetailValue other = (GCRFinancialDetailValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.financial_code==null && other.getFinancial_code()==null) || 
             (this.financial_code!=null &&
              this.financial_code.equals(other.getFinancial_code()))) &&
            ((this.financial_text==null && other.getFinancial_text()==null) || 
             (this.financial_text!=null &&
              this.financial_text.equals(other.getFinancial_text()))) &&
            this.year == other.getYear() &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amount_currency==null && other.getAmount_currency()==null) || 
             (this.amount_currency!=null &&
              this.amount_currency.equals(other.getAmount_currency()))) &&
            ((this.forecast==null && other.getForecast()==null) || 
             (this.forecast!=null &&
              this.forecast.equals(other.getForecast())));
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
        if (getFinancial_code() != null) {
            _hashCode += getFinancial_code().hashCode();
        }
        if (getFinancial_text() != null) {
            _hashCode += getFinancial_text().hashCode();
        }
        _hashCode += getYear();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmount_currency() != null) {
            _hashCode += getAmount_currency().hashCode();
        }
        if (getForecast() != null) {
            _hashCode += getForecast().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRFinancialDetailValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialDetailValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "amount_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "forecast"));
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
