/**
 * GCRMoratorium.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRMoratorium  implements java.io.Serializable {
    private java.math.BigInteger official_registration_number;

    private java.lang.Boolean currently_active;

    private java.util.Date date_from;

    private java.util.Date provisional_verdict_date;

    private java.util.Date definite_verdict_date;

    private java.lang.Integer moratorium_term_in_months;

    private java.util.Date prolongation_date;

    private java.lang.Integer prolongation_in_months;

    private java.lang.Integer vote_code;

    private java.lang.String vote_text;

    private java.util.Date vote_date;

    private java.lang.Integer definite_discontinuance_code;

    private java.lang.String definite_discontinuance_text;

    private java.util.Date definite_discontinuance_date;

    private nl.webservices.www.soap.GCRReceiver[] receivers;

    public GCRMoratorium() {
    }

    public GCRMoratorium(
           java.math.BigInteger official_registration_number,
           java.lang.Boolean currently_active,
           java.util.Date date_from,
           java.util.Date provisional_verdict_date,
           java.util.Date definite_verdict_date,
           java.lang.Integer moratorium_term_in_months,
           java.util.Date prolongation_date,
           java.lang.Integer prolongation_in_months,
           java.lang.Integer vote_code,
           java.lang.String vote_text,
           java.util.Date vote_date,
           java.lang.Integer definite_discontinuance_code,
           java.lang.String definite_discontinuance_text,
           java.util.Date definite_discontinuance_date,
           nl.webservices.www.soap.GCRReceiver[] receivers) {
           this.official_registration_number = official_registration_number;
           this.currently_active = currently_active;
           this.date_from = date_from;
           this.provisional_verdict_date = provisional_verdict_date;
           this.definite_verdict_date = definite_verdict_date;
           this.moratorium_term_in_months = moratorium_term_in_months;
           this.prolongation_date = prolongation_date;
           this.prolongation_in_months = prolongation_in_months;
           this.vote_code = vote_code;
           this.vote_text = vote_text;
           this.vote_date = vote_date;
           this.definite_discontinuance_code = definite_discontinuance_code;
           this.definite_discontinuance_text = definite_discontinuance_text;
           this.definite_discontinuance_date = definite_discontinuance_date;
           this.receivers = receivers;
    }


    /**
     * Gets the official_registration_number value for this GCRMoratorium.
     * 
     * @return official_registration_number
     */
    public java.math.BigInteger getOfficial_registration_number() {
        return official_registration_number;
    }


    /**
     * Sets the official_registration_number value for this GCRMoratorium.
     * 
     * @param official_registration_number
     */
    public void setOfficial_registration_number(java.math.BigInteger official_registration_number) {
        this.official_registration_number = official_registration_number;
    }


    /**
     * Gets the currently_active value for this GCRMoratorium.
     * 
     * @return currently_active
     */
    public java.lang.Boolean getCurrently_active() {
        return currently_active;
    }


    /**
     * Sets the currently_active value for this GCRMoratorium.
     * 
     * @param currently_active
     */
    public void setCurrently_active(java.lang.Boolean currently_active) {
        this.currently_active = currently_active;
    }


    /**
     * Gets the date_from value for this GCRMoratorium.
     * 
     * @return date_from
     */
    public java.util.Date getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this GCRMoratorium.
     * 
     * @param date_from
     */
    public void setDate_from(java.util.Date date_from) {
        this.date_from = date_from;
    }


    /**
     * Gets the provisional_verdict_date value for this GCRMoratorium.
     * 
     * @return provisional_verdict_date
     */
    public java.util.Date getProvisional_verdict_date() {
        return provisional_verdict_date;
    }


    /**
     * Sets the provisional_verdict_date value for this GCRMoratorium.
     * 
     * @param provisional_verdict_date
     */
    public void setProvisional_verdict_date(java.util.Date provisional_verdict_date) {
        this.provisional_verdict_date = provisional_verdict_date;
    }


    /**
     * Gets the definite_verdict_date value for this GCRMoratorium.
     * 
     * @return definite_verdict_date
     */
    public java.util.Date getDefinite_verdict_date() {
        return definite_verdict_date;
    }


    /**
     * Sets the definite_verdict_date value for this GCRMoratorium.
     * 
     * @param definite_verdict_date
     */
    public void setDefinite_verdict_date(java.util.Date definite_verdict_date) {
        this.definite_verdict_date = definite_verdict_date;
    }


    /**
     * Gets the moratorium_term_in_months value for this GCRMoratorium.
     * 
     * @return moratorium_term_in_months
     */
    public java.lang.Integer getMoratorium_term_in_months() {
        return moratorium_term_in_months;
    }


    /**
     * Sets the moratorium_term_in_months value for this GCRMoratorium.
     * 
     * @param moratorium_term_in_months
     */
    public void setMoratorium_term_in_months(java.lang.Integer moratorium_term_in_months) {
        this.moratorium_term_in_months = moratorium_term_in_months;
    }


    /**
     * Gets the prolongation_date value for this GCRMoratorium.
     * 
     * @return prolongation_date
     */
    public java.util.Date getProlongation_date() {
        return prolongation_date;
    }


    /**
     * Sets the prolongation_date value for this GCRMoratorium.
     * 
     * @param prolongation_date
     */
    public void setProlongation_date(java.util.Date prolongation_date) {
        this.prolongation_date = prolongation_date;
    }


    /**
     * Gets the prolongation_in_months value for this GCRMoratorium.
     * 
     * @return prolongation_in_months
     */
    public java.lang.Integer getProlongation_in_months() {
        return prolongation_in_months;
    }


    /**
     * Sets the prolongation_in_months value for this GCRMoratorium.
     * 
     * @param prolongation_in_months
     */
    public void setProlongation_in_months(java.lang.Integer prolongation_in_months) {
        this.prolongation_in_months = prolongation_in_months;
    }


    /**
     * Gets the vote_code value for this GCRMoratorium.
     * 
     * @return vote_code
     */
    public java.lang.Integer getVote_code() {
        return vote_code;
    }


    /**
     * Sets the vote_code value for this GCRMoratorium.
     * 
     * @param vote_code
     */
    public void setVote_code(java.lang.Integer vote_code) {
        this.vote_code = vote_code;
    }


    /**
     * Gets the vote_text value for this GCRMoratorium.
     * 
     * @return vote_text
     */
    public java.lang.String getVote_text() {
        return vote_text;
    }


    /**
     * Sets the vote_text value for this GCRMoratorium.
     * 
     * @param vote_text
     */
    public void setVote_text(java.lang.String vote_text) {
        this.vote_text = vote_text;
    }


    /**
     * Gets the vote_date value for this GCRMoratorium.
     * 
     * @return vote_date
     */
    public java.util.Date getVote_date() {
        return vote_date;
    }


    /**
     * Sets the vote_date value for this GCRMoratorium.
     * 
     * @param vote_date
     */
    public void setVote_date(java.util.Date vote_date) {
        this.vote_date = vote_date;
    }


    /**
     * Gets the definite_discontinuance_code value for this GCRMoratorium.
     * 
     * @return definite_discontinuance_code
     */
    public java.lang.Integer getDefinite_discontinuance_code() {
        return definite_discontinuance_code;
    }


    /**
     * Sets the definite_discontinuance_code value for this GCRMoratorium.
     * 
     * @param definite_discontinuance_code
     */
    public void setDefinite_discontinuance_code(java.lang.Integer definite_discontinuance_code) {
        this.definite_discontinuance_code = definite_discontinuance_code;
    }


    /**
     * Gets the definite_discontinuance_text value for this GCRMoratorium.
     * 
     * @return definite_discontinuance_text
     */
    public java.lang.String getDefinite_discontinuance_text() {
        return definite_discontinuance_text;
    }


    /**
     * Sets the definite_discontinuance_text value for this GCRMoratorium.
     * 
     * @param definite_discontinuance_text
     */
    public void setDefinite_discontinuance_text(java.lang.String definite_discontinuance_text) {
        this.definite_discontinuance_text = definite_discontinuance_text;
    }


    /**
     * Gets the definite_discontinuance_date value for this GCRMoratorium.
     * 
     * @return definite_discontinuance_date
     */
    public java.util.Date getDefinite_discontinuance_date() {
        return definite_discontinuance_date;
    }


    /**
     * Sets the definite_discontinuance_date value for this GCRMoratorium.
     * 
     * @param definite_discontinuance_date
     */
    public void setDefinite_discontinuance_date(java.util.Date definite_discontinuance_date) {
        this.definite_discontinuance_date = definite_discontinuance_date;
    }


    /**
     * Gets the receivers value for this GCRMoratorium.
     * 
     * @return receivers
     */
    public nl.webservices.www.soap.GCRReceiver[] getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this GCRMoratorium.
     * 
     * @param receivers
     */
    public void setReceivers(nl.webservices.www.soap.GCRReceiver[] receivers) {
        this.receivers = receivers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRMoratorium)) return false;
        GCRMoratorium other = (GCRMoratorium) obj;
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
            ((this.date_from==null && other.getDate_from()==null) || 
             (this.date_from!=null &&
              this.date_from.equals(other.getDate_from()))) &&
            ((this.provisional_verdict_date==null && other.getProvisional_verdict_date()==null) || 
             (this.provisional_verdict_date!=null &&
              this.provisional_verdict_date.equals(other.getProvisional_verdict_date()))) &&
            ((this.definite_verdict_date==null && other.getDefinite_verdict_date()==null) || 
             (this.definite_verdict_date!=null &&
              this.definite_verdict_date.equals(other.getDefinite_verdict_date()))) &&
            ((this.moratorium_term_in_months==null && other.getMoratorium_term_in_months()==null) || 
             (this.moratorium_term_in_months!=null &&
              this.moratorium_term_in_months.equals(other.getMoratorium_term_in_months()))) &&
            ((this.prolongation_date==null && other.getProlongation_date()==null) || 
             (this.prolongation_date!=null &&
              this.prolongation_date.equals(other.getProlongation_date()))) &&
            ((this.prolongation_in_months==null && other.getProlongation_in_months()==null) || 
             (this.prolongation_in_months!=null &&
              this.prolongation_in_months.equals(other.getProlongation_in_months()))) &&
            ((this.vote_code==null && other.getVote_code()==null) || 
             (this.vote_code!=null &&
              this.vote_code.equals(other.getVote_code()))) &&
            ((this.vote_text==null && other.getVote_text()==null) || 
             (this.vote_text!=null &&
              this.vote_text.equals(other.getVote_text()))) &&
            ((this.vote_date==null && other.getVote_date()==null) || 
             (this.vote_date!=null &&
              this.vote_date.equals(other.getVote_date()))) &&
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
        if (getDate_from() != null) {
            _hashCode += getDate_from().hashCode();
        }
        if (getProvisional_verdict_date() != null) {
            _hashCode += getProvisional_verdict_date().hashCode();
        }
        if (getDefinite_verdict_date() != null) {
            _hashCode += getDefinite_verdict_date().hashCode();
        }
        if (getMoratorium_term_in_months() != null) {
            _hashCode += getMoratorium_term_in_months().hashCode();
        }
        if (getProlongation_date() != null) {
            _hashCode += getProlongation_date().hashCode();
        }
        if (getProlongation_in_months() != null) {
            _hashCode += getProlongation_in_months().hashCode();
        }
        if (getVote_code() != null) {
            _hashCode += getVote_code().hashCode();
        }
        if (getVote_text() != null) {
            _hashCode += getVote_text().hashCode();
        }
        if (getVote_date() != null) {
            _hashCode += getVote_date().hashCode();
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
        new org.apache.axis.description.TypeDesc(GCRMoratorium.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRMoratorium"));
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
        elemField.setFieldName("date_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("moratorium_term_in_months");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "moratorium_term_in_months"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prolongation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prolongation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prolongation_in_months");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prolongation_in_months"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vote_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vote_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vote_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vote_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vote_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vote_date"));
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
