/**
 * GCRCreditAdviceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCreditAdviceData  implements java.io.Serializable {
    private boolean including_personal_judgement;

    private nl.webservices.www.soap.GCRCreditAdvice credit_advice;

    private nl.webservices.www.soap.GCRCreditAdviceMother credit_advice_mother;

    private nl.webservices.www.soap.GCRCreditRating credit_rating;

    public GCRCreditAdviceData() {
    }

    public GCRCreditAdviceData(
           boolean including_personal_judgement,
           nl.webservices.www.soap.GCRCreditAdvice credit_advice,
           nl.webservices.www.soap.GCRCreditAdviceMother credit_advice_mother,
           nl.webservices.www.soap.GCRCreditRating credit_rating) {
           this.including_personal_judgement = including_personal_judgement;
           this.credit_advice = credit_advice;
           this.credit_advice_mother = credit_advice_mother;
           this.credit_rating = credit_rating;
    }


    /**
     * Gets the including_personal_judgement value for this GCRCreditAdviceData.
     * 
     * @return including_personal_judgement
     */
    public boolean isIncluding_personal_judgement() {
        return including_personal_judgement;
    }


    /**
     * Sets the including_personal_judgement value for this GCRCreditAdviceData.
     * 
     * @param including_personal_judgement
     */
    public void setIncluding_personal_judgement(boolean including_personal_judgement) {
        this.including_personal_judgement = including_personal_judgement;
    }


    /**
     * Gets the credit_advice value for this GCRCreditAdviceData.
     * 
     * @return credit_advice
     */
    public nl.webservices.www.soap.GCRCreditAdvice getCredit_advice() {
        return credit_advice;
    }


    /**
     * Sets the credit_advice value for this GCRCreditAdviceData.
     * 
     * @param credit_advice
     */
    public void setCredit_advice(nl.webservices.www.soap.GCRCreditAdvice credit_advice) {
        this.credit_advice = credit_advice;
    }


    /**
     * Gets the credit_advice_mother value for this GCRCreditAdviceData.
     * 
     * @return credit_advice_mother
     */
    public nl.webservices.www.soap.GCRCreditAdviceMother getCredit_advice_mother() {
        return credit_advice_mother;
    }


    /**
     * Sets the credit_advice_mother value for this GCRCreditAdviceData.
     * 
     * @param credit_advice_mother
     */
    public void setCredit_advice_mother(nl.webservices.www.soap.GCRCreditAdviceMother credit_advice_mother) {
        this.credit_advice_mother = credit_advice_mother;
    }


    /**
     * Gets the credit_rating value for this GCRCreditAdviceData.
     * 
     * @return credit_rating
     */
    public nl.webservices.www.soap.GCRCreditRating getCredit_rating() {
        return credit_rating;
    }


    /**
     * Sets the credit_rating value for this GCRCreditAdviceData.
     * 
     * @param credit_rating
     */
    public void setCredit_rating(nl.webservices.www.soap.GCRCreditRating credit_rating) {
        this.credit_rating = credit_rating;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCreditAdviceData)) return false;
        GCRCreditAdviceData other = (GCRCreditAdviceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.including_personal_judgement == other.isIncluding_personal_judgement() &&
            ((this.credit_advice==null && other.getCredit_advice()==null) || 
             (this.credit_advice!=null &&
              this.credit_advice.equals(other.getCredit_advice()))) &&
            ((this.credit_advice_mother==null && other.getCredit_advice_mother()==null) || 
             (this.credit_advice_mother!=null &&
              this.credit_advice_mother.equals(other.getCredit_advice_mother()))) &&
            ((this.credit_rating==null && other.getCredit_rating()==null) || 
             (this.credit_rating!=null &&
              this.credit_rating.equals(other.getCredit_rating())));
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
        _hashCode += (isIncluding_personal_judgement() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCredit_advice() != null) {
            _hashCode += getCredit_advice().hashCode();
        }
        if (getCredit_advice_mother() != null) {
            _hashCode += getCredit_advice_mother().hashCode();
        }
        if (getCredit_rating() != null) {
            _hashCode += getCredit_rating().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRCreditAdviceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditAdviceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("including_personal_judgement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "including_personal_judgement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_advice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_advice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditAdvice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_advice_mother");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_advice_mother"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditAdviceMother"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_rating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "credit_rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCreditRating"));
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
