/**
 * GCRFounded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRFounded  implements java.io.Serializable {
    private java.util.Date date_from;

    private java.lang.String residence;

    private java.lang.Integer legal_form_code;

    private java.lang.String legal_form_text;

    private java.util.Date start_date;

    private java.util.Date founded_at;

    public GCRFounded() {
    }

    public GCRFounded(
           java.util.Date date_from,
           java.lang.String residence,
           java.lang.Integer legal_form_code,
           java.lang.String legal_form_text,
           java.util.Date start_date,
           java.util.Date founded_at) {
           this.date_from = date_from;
           this.residence = residence;
           this.legal_form_code = legal_form_code;
           this.legal_form_text = legal_form_text;
           this.start_date = start_date;
           this.founded_at = founded_at;
    }


    /**
     * Gets the date_from value for this GCRFounded.
     * 
     * @return date_from
     */
    public java.util.Date getDate_from() {
        return date_from;
    }


    /**
     * Sets the date_from value for this GCRFounded.
     * 
     * @param date_from
     */
    public void setDate_from(java.util.Date date_from) {
        this.date_from = date_from;
    }


    /**
     * Gets the residence value for this GCRFounded.
     * 
     * @return residence
     */
    public java.lang.String getResidence() {
        return residence;
    }


    /**
     * Sets the residence value for this GCRFounded.
     * 
     * @param residence
     */
    public void setResidence(java.lang.String residence) {
        this.residence = residence;
    }


    /**
     * Gets the legal_form_code value for this GCRFounded.
     * 
     * @return legal_form_code
     */
    public java.lang.Integer getLegal_form_code() {
        return legal_form_code;
    }


    /**
     * Sets the legal_form_code value for this GCRFounded.
     * 
     * @param legal_form_code
     */
    public void setLegal_form_code(java.lang.Integer legal_form_code) {
        this.legal_form_code = legal_form_code;
    }


    /**
     * Gets the legal_form_text value for this GCRFounded.
     * 
     * @return legal_form_text
     */
    public java.lang.String getLegal_form_text() {
        return legal_form_text;
    }


    /**
     * Sets the legal_form_text value for this GCRFounded.
     * 
     * @param legal_form_text
     */
    public void setLegal_form_text(java.lang.String legal_form_text) {
        this.legal_form_text = legal_form_text;
    }


    /**
     * Gets the start_date value for this GCRFounded.
     * 
     * @return start_date
     */
    public java.util.Date getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this GCRFounded.
     * 
     * @param start_date
     */
    public void setStart_date(java.util.Date start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the founded_at value for this GCRFounded.
     * 
     * @return founded_at
     */
    public java.util.Date getFounded_at() {
        return founded_at;
    }


    /**
     * Sets the founded_at value for this GCRFounded.
     * 
     * @param founded_at
     */
    public void setFounded_at(java.util.Date founded_at) {
        this.founded_at = founded_at;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRFounded)) return false;
        GCRFounded other = (GCRFounded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_from==null && other.getDate_from()==null) || 
             (this.date_from!=null &&
              this.date_from.equals(other.getDate_from()))) &&
            ((this.residence==null && other.getResidence()==null) || 
             (this.residence!=null &&
              this.residence.equals(other.getResidence()))) &&
            ((this.legal_form_code==null && other.getLegal_form_code()==null) || 
             (this.legal_form_code!=null &&
              this.legal_form_code.equals(other.getLegal_form_code()))) &&
            ((this.legal_form_text==null && other.getLegal_form_text()==null) || 
             (this.legal_form_text!=null &&
              this.legal_form_text.equals(other.getLegal_form_text()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.founded_at==null && other.getFounded_at()==null) || 
             (this.founded_at!=null &&
              this.founded_at.equals(other.getFounded_at())));
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
        if (getDate_from() != null) {
            _hashCode += getDate_from().hashCode();
        }
        if (getResidence() != null) {
            _hashCode += getResidence().hashCode();
        }
        if (getLegal_form_code() != null) {
            _hashCode += getLegal_form_code().hashCode();
        }
        if (getLegal_form_text() != null) {
            _hashCode += getLegal_form_text().hashCode();
        }
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getFounded_at() != null) {
            _hashCode += getFounded_at().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRFounded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFounded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "residence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_form_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("founded_at");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "founded_at"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
