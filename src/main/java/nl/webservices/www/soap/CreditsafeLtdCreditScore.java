/**
 * CreditsafeLtdCreditScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdCreditScore  implements java.io.Serializable {
    private java.lang.String current_credit_rating;

    private java.lang.String current_rating_description;

    private java.lang.String current_credit_limit;

    private java.math.BigDecimal current_contract_limit;

    private java.lang.String previous_credit_limit;

    private java.lang.String previous_credit_rating;

    private java.lang.String previous_rating_description;

    private java.util.Calendar date_of_latest_rating_change;

    public CreditsafeLtdCreditScore() {
    }

    public CreditsafeLtdCreditScore(
           java.lang.String current_credit_rating,
           java.lang.String current_rating_description,
           java.lang.String current_credit_limit,
           java.math.BigDecimal current_contract_limit,
           java.lang.String previous_credit_limit,
           java.lang.String previous_credit_rating,
           java.lang.String previous_rating_description,
           java.util.Calendar date_of_latest_rating_change) {
           this.current_credit_rating = current_credit_rating;
           this.current_rating_description = current_rating_description;
           this.current_credit_limit = current_credit_limit;
           this.current_contract_limit = current_contract_limit;
           this.previous_credit_limit = previous_credit_limit;
           this.previous_credit_rating = previous_credit_rating;
           this.previous_rating_description = previous_rating_description;
           this.date_of_latest_rating_change = date_of_latest_rating_change;
    }


    /**
     * Gets the current_credit_rating value for this CreditsafeLtdCreditScore.
     * 
     * @return current_credit_rating
     */
    public java.lang.String getCurrent_credit_rating() {
        return current_credit_rating;
    }


    /**
     * Sets the current_credit_rating value for this CreditsafeLtdCreditScore.
     * 
     * @param current_credit_rating
     */
    public void setCurrent_credit_rating(java.lang.String current_credit_rating) {
        this.current_credit_rating = current_credit_rating;
    }


    /**
     * Gets the current_rating_description value for this CreditsafeLtdCreditScore.
     * 
     * @return current_rating_description
     */
    public java.lang.String getCurrent_rating_description() {
        return current_rating_description;
    }


    /**
     * Sets the current_rating_description value for this CreditsafeLtdCreditScore.
     * 
     * @param current_rating_description
     */
    public void setCurrent_rating_description(java.lang.String current_rating_description) {
        this.current_rating_description = current_rating_description;
    }


    /**
     * Gets the current_credit_limit value for this CreditsafeLtdCreditScore.
     * 
     * @return current_credit_limit
     */
    public java.lang.String getCurrent_credit_limit() {
        return current_credit_limit;
    }


    /**
     * Sets the current_credit_limit value for this CreditsafeLtdCreditScore.
     * 
     * @param current_credit_limit
     */
    public void setCurrent_credit_limit(java.lang.String current_credit_limit) {
        this.current_credit_limit = current_credit_limit;
    }


    /**
     * Gets the current_contract_limit value for this CreditsafeLtdCreditScore.
     * 
     * @return current_contract_limit
     */
    public java.math.BigDecimal getCurrent_contract_limit() {
        return current_contract_limit;
    }


    /**
     * Sets the current_contract_limit value for this CreditsafeLtdCreditScore.
     * 
     * @param current_contract_limit
     */
    public void setCurrent_contract_limit(java.math.BigDecimal current_contract_limit) {
        this.current_contract_limit = current_contract_limit;
    }


    /**
     * Gets the previous_credit_limit value for this CreditsafeLtdCreditScore.
     * 
     * @return previous_credit_limit
     */
    public java.lang.String getPrevious_credit_limit() {
        return previous_credit_limit;
    }


    /**
     * Sets the previous_credit_limit value for this CreditsafeLtdCreditScore.
     * 
     * @param previous_credit_limit
     */
    public void setPrevious_credit_limit(java.lang.String previous_credit_limit) {
        this.previous_credit_limit = previous_credit_limit;
    }


    /**
     * Gets the previous_credit_rating value for this CreditsafeLtdCreditScore.
     * 
     * @return previous_credit_rating
     */
    public java.lang.String getPrevious_credit_rating() {
        return previous_credit_rating;
    }


    /**
     * Sets the previous_credit_rating value for this CreditsafeLtdCreditScore.
     * 
     * @param previous_credit_rating
     */
    public void setPrevious_credit_rating(java.lang.String previous_credit_rating) {
        this.previous_credit_rating = previous_credit_rating;
    }


    /**
     * Gets the previous_rating_description value for this CreditsafeLtdCreditScore.
     * 
     * @return previous_rating_description
     */
    public java.lang.String getPrevious_rating_description() {
        return previous_rating_description;
    }


    /**
     * Sets the previous_rating_description value for this CreditsafeLtdCreditScore.
     * 
     * @param previous_rating_description
     */
    public void setPrevious_rating_description(java.lang.String previous_rating_description) {
        this.previous_rating_description = previous_rating_description;
    }


    /**
     * Gets the date_of_latest_rating_change value for this CreditsafeLtdCreditScore.
     * 
     * @return date_of_latest_rating_change
     */
    public java.util.Calendar getDate_of_latest_rating_change() {
        return date_of_latest_rating_change;
    }


    /**
     * Sets the date_of_latest_rating_change value for this CreditsafeLtdCreditScore.
     * 
     * @param date_of_latest_rating_change
     */
    public void setDate_of_latest_rating_change(java.util.Calendar date_of_latest_rating_change) {
        this.date_of_latest_rating_change = date_of_latest_rating_change;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdCreditScore)) return false;
        CreditsafeLtdCreditScore other = (CreditsafeLtdCreditScore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.current_credit_rating==null && other.getCurrent_credit_rating()==null) || 
             (this.current_credit_rating!=null &&
              this.current_credit_rating.equals(other.getCurrent_credit_rating()))) &&
            ((this.current_rating_description==null && other.getCurrent_rating_description()==null) || 
             (this.current_rating_description!=null &&
              this.current_rating_description.equals(other.getCurrent_rating_description()))) &&
            ((this.current_credit_limit==null && other.getCurrent_credit_limit()==null) || 
             (this.current_credit_limit!=null &&
              this.current_credit_limit.equals(other.getCurrent_credit_limit()))) &&
            ((this.current_contract_limit==null && other.getCurrent_contract_limit()==null) || 
             (this.current_contract_limit!=null &&
              this.current_contract_limit.equals(other.getCurrent_contract_limit()))) &&
            ((this.previous_credit_limit==null && other.getPrevious_credit_limit()==null) || 
             (this.previous_credit_limit!=null &&
              this.previous_credit_limit.equals(other.getPrevious_credit_limit()))) &&
            ((this.previous_credit_rating==null && other.getPrevious_credit_rating()==null) || 
             (this.previous_credit_rating!=null &&
              this.previous_credit_rating.equals(other.getPrevious_credit_rating()))) &&
            ((this.previous_rating_description==null && other.getPrevious_rating_description()==null) || 
             (this.previous_rating_description!=null &&
              this.previous_rating_description.equals(other.getPrevious_rating_description()))) &&
            ((this.date_of_latest_rating_change==null && other.getDate_of_latest_rating_change()==null) || 
             (this.date_of_latest_rating_change!=null &&
              this.date_of_latest_rating_change.equals(other.getDate_of_latest_rating_change())));
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
        if (getCurrent_credit_rating() != null) {
            _hashCode += getCurrent_credit_rating().hashCode();
        }
        if (getCurrent_rating_description() != null) {
            _hashCode += getCurrent_rating_description().hashCode();
        }
        if (getCurrent_credit_limit() != null) {
            _hashCode += getCurrent_credit_limit().hashCode();
        }
        if (getCurrent_contract_limit() != null) {
            _hashCode += getCurrent_contract_limit().hashCode();
        }
        if (getPrevious_credit_limit() != null) {
            _hashCode += getPrevious_credit_limit().hashCode();
        }
        if (getPrevious_credit_rating() != null) {
            _hashCode += getPrevious_credit_rating().hashCode();
        }
        if (getPrevious_rating_description() != null) {
            _hashCode += getPrevious_rating_description().hashCode();
        }
        if (getDate_of_latest_rating_change() != null) {
            _hashCode += getDate_of_latest_rating_change().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeLtdCreditScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCreditScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_credit_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_credit_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_rating_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_rating_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_credit_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_credit_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_contract_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_contract_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_credit_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_credit_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_credit_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_credit_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_rating_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_rating_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_latest_rating_change");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_latest_rating_change"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
