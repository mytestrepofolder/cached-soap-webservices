/**
 * GCRDebtRestructuringPrivatePersons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRDebtRestructuringPrivatePersons  implements java.io.Serializable {
    private java.math.BigInteger official_registration_number;

    private java.lang.Boolean currently_active;

    private java.util.Date provisional_verdict_date;

    private java.util.Date definite_verdict_date;

    private java.lang.Integer debt_restructuring_term_in_months;

    private java.lang.Integer provisional_discontinuance_code;

    private java.lang.String provisional_discontinuance_text;

    private java.util.Date provisional_discontinuance_date;

    private java.lang.Integer definite_discontinuance_code;

    private java.lang.String definite_discontinuance_text;

    private java.util.Date definite_discontinuance_date;

    private nl.webservices.www.soap.GCRReceiver[] receivers;

    public GCRDebtRestructuringPrivatePersons() {
    }

    public GCRDebtRestructuringPrivatePersons(
           java.math.BigInteger official_registration_number,
           java.lang.Boolean currently_active,
           java.util.Date provisional_verdict_date,
           java.util.Date definite_verdict_date,
           java.lang.Integer debt_restructuring_term_in_months,
           java.lang.Integer provisional_discontinuance_code,
           java.lang.String provisional_discontinuance_text,
           java.util.Date provisional_discontinuance_date,
           java.lang.Integer definite_discontinuance_code,
           java.lang.String definite_discontinuance_text,
           java.util.Date definite_discontinuance_date,
           nl.webservices.www.soap.GCRReceiver[] receivers) {
           this.official_registration_number = official_registration_number;
           this.currently_active = currently_active;
           this.provisional_verdict_date = provisional_verdict_date;
           this.definite_verdict_date = definite_verdict_date;
           this.debt_restructuring_term_in_months = debt_restructuring_term_in_months;
           this.provisional_discontinuance_code = provisional_discontinuance_code;
           this.provisional_discontinuance_text = provisional_discontinuance_text;
           this.provisional_discontinuance_date = provisional_discontinuance_date;
           this.definite_discontinuance_code = definite_discontinuance_code;
           this.definite_discontinuance_text = definite_discontinuance_text;
           this.definite_discontinuance_date = definite_discontinuance_date;
           this.receivers = receivers;
    }


    /**
     * Gets the official_registration_number value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return official_registration_number
     */
    public java.math.BigInteger getOfficial_registration_number() {
        return official_registration_number;
    }


    /**
     * Sets the official_registration_number value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param official_registration_number
     */
    public void setOfficial_registration_number(java.math.BigInteger official_registration_number) {
        this.official_registration_number = official_registration_number;
    }


    /**
     * Gets the currently_active value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return currently_active
     */
    public java.lang.Boolean getCurrently_active() {
        return currently_active;
    }


    /**
     * Sets the currently_active value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param currently_active
     */
    public void setCurrently_active(java.lang.Boolean currently_active) {
        this.currently_active = currently_active;
    }


    /**
     * Gets the provisional_verdict_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return provisional_verdict_date
     */
    public java.util.Date getProvisional_verdict_date() {
        return provisional_verdict_date;
    }


    /**
     * Sets the provisional_verdict_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param provisional_verdict_date
     */
    public void setProvisional_verdict_date(java.util.Date provisional_verdict_date) {
        this.provisional_verdict_date = provisional_verdict_date;
    }


    /**
     * Gets the definite_verdict_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return definite_verdict_date
     */
    public java.util.Date getDefinite_verdict_date() {
        return definite_verdict_date;
    }


    /**
     * Sets the definite_verdict_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param definite_verdict_date
     */
    public void setDefinite_verdict_date(java.util.Date definite_verdict_date) {
        this.definite_verdict_date = definite_verdict_date;
    }


    /**
     * Gets the debt_restructuring_term_in_months value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return debt_restructuring_term_in_months
     */
    public java.lang.Integer getDebt_restructuring_term_in_months() {
        return debt_restructuring_term_in_months;
    }


    /**
     * Sets the debt_restructuring_term_in_months value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param debt_restructuring_term_in_months
     */
    public void setDebt_restructuring_term_in_months(java.lang.Integer debt_restructuring_term_in_months) {
        this.debt_restructuring_term_in_months = debt_restructuring_term_in_months;
    }


    /**
     * Gets the provisional_discontinuance_code value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return provisional_discontinuance_code
     */
    public java.lang.Integer getProvisional_discontinuance_code() {
        return provisional_discontinuance_code;
    }


    /**
     * Sets the provisional_discontinuance_code value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param provisional_discontinuance_code
     */
    public void setProvisional_discontinuance_code(java.lang.Integer provisional_discontinuance_code) {
        this.provisional_discontinuance_code = provisional_discontinuance_code;
    }


    /**
     * Gets the provisional_discontinuance_text value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return provisional_discontinuance_text
     */
    public java.lang.String getProvisional_discontinuance_text() {
        return provisional_discontinuance_text;
    }


    /**
     * Sets the provisional_discontinuance_text value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param provisional_discontinuance_text
     */
    public void setProvisional_discontinuance_text(java.lang.String provisional_discontinuance_text) {
        this.provisional_discontinuance_text = provisional_discontinuance_text;
    }


    /**
     * Gets the provisional_discontinuance_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return provisional_discontinuance_date
     */
    public java.util.Date getProvisional_discontinuance_date() {
        return provisional_discontinuance_date;
    }


    /**
     * Sets the provisional_discontinuance_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param provisional_discontinuance_date
     */
    public void setProvisional_discontinuance_date(java.util.Date provisional_discontinuance_date) {
        this.provisional_discontinuance_date = provisional_discontinuance_date;
    }


    /**
     * Gets the definite_discontinuance_code value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return definite_discontinuance_code
     */
    public java.lang.Integer getDefinite_discontinuance_code() {
        return definite_discontinuance_code;
    }


    /**
     * Sets the definite_discontinuance_code value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param definite_discontinuance_code
     */
    public void setDefinite_discontinuance_code(java.lang.Integer definite_discontinuance_code) {
        this.definite_discontinuance_code = definite_discontinuance_code;
    }


    /**
     * Gets the definite_discontinuance_text value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return definite_discontinuance_text
     */
    public java.lang.String getDefinite_discontinuance_text() {
        return definite_discontinuance_text;
    }


    /**
     * Sets the definite_discontinuance_text value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param definite_discontinuance_text
     */
    public void setDefinite_discontinuance_text(java.lang.String definite_discontinuance_text) {
        this.definite_discontinuance_text = definite_discontinuance_text;
    }


    /**
     * Gets the definite_discontinuance_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return definite_discontinuance_date
     */
    public java.util.Date getDefinite_discontinuance_date() {
        return definite_discontinuance_date;
    }


    /**
     * Sets the definite_discontinuance_date value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param definite_discontinuance_date
     */
    public void setDefinite_discontinuance_date(java.util.Date definite_discontinuance_date) {
        this.definite_discontinuance_date = definite_discontinuance_date;
    }


    /**
     * Gets the receivers value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @return receivers
     */
    public nl.webservices.www.soap.GCRReceiver[] getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this GCRDebtRestructuringPrivatePersons.
     * 
     * @param receivers
     */
    public void setReceivers(nl.webservices.www.soap.GCRReceiver[] receivers) {
        this.receivers = receivers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRDebtRestructuringPrivatePersons)) return false;
        GCRDebtRestructuringPrivatePersons other = (GCRDebtRestructuringPrivatePersons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.official_registration_number==null && other.getOfficial_registration_number()==null) || 
             (this.official_registration_number!=null &&
              this.official_registration_number.equals(other.getOfficial_registration_number()))) &&
            ((this.currently_active==null && other.getCurrently_active()==null) || 
             (this.currently_active!=null &&
              this.currently_active.equals(other.getCurrently_active()))) &&
            ((this.provisional_verdict_date==null && other.getProvisional_verdict_date()==null) || 
             (this.provisional_verdict_date!=null &&
              this.provisional_verdict_date.equals(other.getProvisional_verdict_date()))) &&
            ((this.definite_verdict_date==null && other.getDefinite_verdict_date()==null) || 
             (this.definite_verdict_date!=null &&
              this.definite_verdict_date.equals(other.getDefinite_verdict_date()))) &&
            ((this.debt_restructuring_term_in_months==null && other.getDebt_restructuring_term_in_months()==null) || 
             (this.debt_restructuring_term_in_months!=null &&
              this.debt_restructuring_term_in_months.equals(other.getDebt_restructuring_term_in_months()))) &&
            ((this.provisional_discontinuance_code==null && other.getProvisional_discontinuance_code()==null) || 
             (this.provisional_discontinuance_code!=null &&
              this.provisional_discontinuance_code.equals(other.getProvisional_discontinuance_code()))) &&
            ((this.provisional_discontinuance_text==null && other.getProvisional_discontinuance_text()==null) || 
             (this.provisional_discontinuance_text!=null &&
              this.provisional_discontinuance_text.equals(other.getProvisional_discontinuance_text()))) &&
            ((this.provisional_discontinuance_date==null && other.getProvisional_discontinuance_date()==null) || 
             (this.provisional_discontinuance_date!=null &&
              this.provisional_discontinuance_date.equals(other.getProvisional_discontinuance_date()))) &&
            ((this.definite_discontinuance_code==null && other.getDefinite_discontinuance_code()==null) || 
             (this.definite_discontinuance_code!=null &&
              this.definite_discontinuance_code.equals(other.getDefinite_discontinuance_code()))) &&
            ((this.definite_discontinuance_text==null && other.getDefinite_discontinuance_text()==null) || 
             (this.definite_discontinuance_text!=null &&
              this.definite_discontinuance_text.equals(other.getDefinite_discontinuance_text()))) &&
            ((this.definite_discontinuance_date==null && other.getDefinite_discontinuance_date()==null) || 
             (this.definite_discontinuance_date!=null &&
              this.definite_discontinuance_date.equals(other.getDefinite_discontinuance_date()))) &&
            ((this.receivers==null && other.getReceivers()==null) || 
             (this.receivers!=null &&
              java.util.Arrays.equals(this.receivers, other.getReceivers())));
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
        if (getOfficial_registration_number() != null) {
            _hashCode += getOfficial_registration_number().hashCode();
        }
        if (getCurrently_active() != null) {
            _hashCode += getCurrently_active().hashCode();
        }
        if (getProvisional_verdict_date() != null) {
            _hashCode += getProvisional_verdict_date().hashCode();
        }
        if (getDefinite_verdict_date() != null) {
            _hashCode += getDefinite_verdict_date().hashCode();
        }
        if (getDebt_restructuring_term_in_months() != null) {
            _hashCode += getDebt_restructuring_term_in_months().hashCode();
        }
        if (getProvisional_discontinuance_code() != null) {
            _hashCode += getProvisional_discontinuance_code().hashCode();
        }
        if (getProvisional_discontinuance_text() != null) {
            _hashCode += getProvisional_discontinuance_text().hashCode();
        }
        if (getProvisional_discontinuance_date() != null) {
            _hashCode += getProvisional_discontinuance_date().hashCode();
        }
        if (getDefinite_discontinuance_code() != null) {
            _hashCode += getDefinite_discontinuance_code().hashCode();
        }
        if (getDefinite_discontinuance_text() != null) {
            _hashCode += getDefinite_discontinuance_text().hashCode();
        }
        if (getDefinite_discontinuance_date() != null) {
            _hashCode += getDefinite_discontinuance_date().hashCode();
        }
        if (getReceivers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivers(), i);
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
        new org.apache.axis.description.TypeDesc(GCRDebtRestructuringPrivatePersons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRDebtRestructuringPrivatePersons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("official_registration_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "official_registration_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currently_active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currently_active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisional_verdict_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provisional_verdict_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_verdict_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_verdict_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debt_restructuring_term_in_months");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "debt_restructuring_term_in_months"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisional_discontinuance_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provisional_discontinuance_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisional_discontinuance_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provisional_discontinuance_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisional_discontinuance_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "provisional_discontinuance_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_discontinuance_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_discontinuance_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_discontinuance_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_discontinuance_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_discontinuance_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_discontinuance_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "receivers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRReceiver"));
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
