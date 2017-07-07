/**
 * GCRCapital.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCapital  implements java.io.Serializable {
    private java.lang.Boolean is_current;

    private java.util.Date date_change;

    private java.lang.String social_capital;

    private java.lang.String capital_of_commandite_partnership;

    private java.lang.String issued_capital;

    private java.lang.String paid_up_capital;

    private java.lang.String monetary_amount_specified_in_corporate_deed;

    public GCRCapital() {
    }

    public GCRCapital(
           java.lang.Boolean is_current,
           java.util.Date date_change,
           java.lang.String social_capital,
           java.lang.String capital_of_commandite_partnership,
           java.lang.String issued_capital,
           java.lang.String paid_up_capital,
           java.lang.String monetary_amount_specified_in_corporate_deed) {
           this.is_current = is_current;
           this.date_change = date_change;
           this.social_capital = social_capital;
           this.capital_of_commandite_partnership = capital_of_commandite_partnership;
           this.issued_capital = issued_capital;
           this.paid_up_capital = paid_up_capital;
           this.monetary_amount_specified_in_corporate_deed = monetary_amount_specified_in_corporate_deed;
    }


    /**
     * Gets the is_current value for this GCRCapital.
     * 
     * @return is_current
     */
    public java.lang.Boolean getIs_current() {
        return is_current;
    }


    /**
     * Sets the is_current value for this GCRCapital.
     * 
     * @param is_current
     */
    public void setIs_current(java.lang.Boolean is_current) {
        this.is_current = is_current;
    }


    /**
     * Gets the date_change value for this GCRCapital.
     * 
     * @return date_change
     */
    public java.util.Date getDate_change() {
        return date_change;
    }


    /**
     * Sets the date_change value for this GCRCapital.
     * 
     * @param date_change
     */
    public void setDate_change(java.util.Date date_change) {
        this.date_change = date_change;
    }


    /**
     * Gets the social_capital value for this GCRCapital.
     * 
     * @return social_capital
     */
    public java.lang.String getSocial_capital() {
        return social_capital;
    }


    /**
     * Sets the social_capital value for this GCRCapital.
     * 
     * @param social_capital
     */
    public void setSocial_capital(java.lang.String social_capital) {
        this.social_capital = social_capital;
    }


    /**
     * Gets the capital_of_commandite_partnership value for this GCRCapital.
     * 
     * @return capital_of_commandite_partnership
     */
    public java.lang.String getCapital_of_commandite_partnership() {
        return capital_of_commandite_partnership;
    }


    /**
     * Sets the capital_of_commandite_partnership value for this GCRCapital.
     * 
     * @param capital_of_commandite_partnership
     */
    public void setCapital_of_commandite_partnership(java.lang.String capital_of_commandite_partnership) {
        this.capital_of_commandite_partnership = capital_of_commandite_partnership;
    }


    /**
     * Gets the issued_capital value for this GCRCapital.
     * 
     * @return issued_capital
     */
    public java.lang.String getIssued_capital() {
        return issued_capital;
    }


    /**
     * Sets the issued_capital value for this GCRCapital.
     * 
     * @param issued_capital
     */
    public void setIssued_capital(java.lang.String issued_capital) {
        this.issued_capital = issued_capital;
    }


    /**
     * Gets the paid_up_capital value for this GCRCapital.
     * 
     * @return paid_up_capital
     */
    public java.lang.String getPaid_up_capital() {
        return paid_up_capital;
    }


    /**
     * Sets the paid_up_capital value for this GCRCapital.
     * 
     * @param paid_up_capital
     */
    public void setPaid_up_capital(java.lang.String paid_up_capital) {
        this.paid_up_capital = paid_up_capital;
    }


    /**
     * Gets the monetary_amount_specified_in_corporate_deed value for this GCRCapital.
     * 
     * @return monetary_amount_specified_in_corporate_deed
     */
    public java.lang.String getMonetary_amount_specified_in_corporate_deed() {
        return monetary_amount_specified_in_corporate_deed;
    }


    /**
     * Sets the monetary_amount_specified_in_corporate_deed value for this GCRCapital.
     * 
     * @param monetary_amount_specified_in_corporate_deed
     */
    public void setMonetary_amount_specified_in_corporate_deed(java.lang.String monetary_amount_specified_in_corporate_deed) {
        this.monetary_amount_specified_in_corporate_deed = monetary_amount_specified_in_corporate_deed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCapital)) return false;
        GCRCapital other = (GCRCapital) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.is_current==null && other.getIs_current()==null) || 
             (this.is_current!=null &&
              this.is_current.equals(other.getIs_current()))) &&
            ((this.date_change==null && other.getDate_change()==null) || 
             (this.date_change!=null &&
              this.date_change.equals(other.getDate_change()))) &&
            ((this.social_capital==null && other.getSocial_capital()==null) || 
             (this.social_capital!=null &&
              this.social_capital.equals(other.getSocial_capital()))) &&
            ((this.capital_of_commandite_partnership==null && other.getCapital_of_commandite_partnership()==null) || 
             (this.capital_of_commandite_partnership!=null &&
              this.capital_of_commandite_partnership.equals(other.getCapital_of_commandite_partnership()))) &&
            ((this.issued_capital==null && other.getIssued_capital()==null) || 
             (this.issued_capital!=null &&
              this.issued_capital.equals(other.getIssued_capital()))) &&
            ((this.paid_up_capital==null && other.getPaid_up_capital()==null) || 
             (this.paid_up_capital!=null &&
              this.paid_up_capital.equals(other.getPaid_up_capital()))) &&
            ((this.monetary_amount_specified_in_corporate_deed==null && other.getMonetary_amount_specified_in_corporate_deed()==null) || 
             (this.monetary_amount_specified_in_corporate_deed!=null &&
              this.monetary_amount_specified_in_corporate_deed.equals(other.getMonetary_amount_specified_in_corporate_deed())));
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
        if (getIs_current() != null) {
            _hashCode += getIs_current().hashCode();
        }
        if (getDate_change() != null) {
            _hashCode += getDate_change().hashCode();
        }
        if (getSocial_capital() != null) {
            _hashCode += getSocial_capital().hashCode();
        }
        if (getCapital_of_commandite_partnership() != null) {
            _hashCode += getCapital_of_commandite_partnership().hashCode();
        }
        if (getIssued_capital() != null) {
            _hashCode += getIssued_capital().hashCode();
        }
        if (getPaid_up_capital() != null) {
            _hashCode += getPaid_up_capital().hashCode();
        }
        if (getMonetary_amount_specified_in_corporate_deed() != null) {
            _hashCode += getMonetary_amount_specified_in_corporate_deed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRCapital.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCapital"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_current");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_change");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_change"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("social_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "social_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capital_of_commandite_partnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "capital_of_commandite_partnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "issued_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paid_up_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paid_up_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monetary_amount_specified_in_corporate_deed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "monetary_amount_specified_in_corporate_deed"));
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
