/**
 * RiskLegalRestraintDecision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskLegalRestraintDecision  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String cause;

    private java.util.Date date;

    private java.lang.String court;

    private java.lang.String jurisdiction;

    private java.lang.String district;

    private nl.webservices.www.soap.RiskLegalRestraintAdministrator administrator;

    public RiskLegalRestraintDecision() {
    }

    public RiskLegalRestraintDecision(
           java.lang.String number,
           java.lang.String cause,
           java.util.Date date,
           java.lang.String court,
           java.lang.String jurisdiction,
           java.lang.String district,
           nl.webservices.www.soap.RiskLegalRestraintAdministrator administrator) {
           this.number = number;
           this.cause = cause;
           this.date = date;
           this.court = court;
           this.jurisdiction = jurisdiction;
           this.district = district;
           this.administrator = administrator;
    }


    /**
     * Gets the number value for this RiskLegalRestraintDecision.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this RiskLegalRestraintDecision.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the cause value for this RiskLegalRestraintDecision.
     * 
     * @return cause
     */
    public java.lang.String getCause() {
        return cause;
    }


    /**
     * Sets the cause value for this RiskLegalRestraintDecision.
     * 
     * @param cause
     */
    public void setCause(java.lang.String cause) {
        this.cause = cause;
    }


    /**
     * Gets the date value for this RiskLegalRestraintDecision.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this RiskLegalRestraintDecision.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the court value for this RiskLegalRestraintDecision.
     * 
     * @return court
     */
    public java.lang.String getCourt() {
        return court;
    }


    /**
     * Sets the court value for this RiskLegalRestraintDecision.
     * 
     * @param court
     */
    public void setCourt(java.lang.String court) {
        this.court = court;
    }


    /**
     * Gets the jurisdiction value for this RiskLegalRestraintDecision.
     * 
     * @return jurisdiction
     */
    public java.lang.String getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this RiskLegalRestraintDecision.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the district value for this RiskLegalRestraintDecision.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this RiskLegalRestraintDecision.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the administrator value for this RiskLegalRestraintDecision.
     * 
     * @return administrator
     */
    public nl.webservices.www.soap.RiskLegalRestraintAdministrator getAdministrator() {
        return administrator;
    }


    /**
     * Sets the administrator value for this RiskLegalRestraintDecision.
     * 
     * @param administrator
     */
    public void setAdministrator(nl.webservices.www.soap.RiskLegalRestraintAdministrator administrator) {
        this.administrator = administrator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskLegalRestraintDecision)) return false;
        RiskLegalRestraintDecision other = (RiskLegalRestraintDecision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.court==null && other.getCourt()==null) || 
             (this.court!=null &&
              this.court.equals(other.getCourt()))) &&
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.administrator==null && other.getAdministrator()==null) || 
             (this.administrator!=null &&
              this.administrator.equals(other.getAdministrator())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCourt() != null) {
            _hashCode += getCourt().hashCode();
        }
        if (getJurisdiction() != null) {
            _hashCode += getJurisdiction().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getAdministrator() != null) {
            _hashCode += getAdministrator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskLegalRestraintDecision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintDecision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("court");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "court"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "jurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administrator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "administrator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintAdministrator"));
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
