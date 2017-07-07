/**
 * RiskInsolvencyRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskInsolvencyRegistration  implements java.io.Serializable {
    private java.lang.String case_number;

    private java.lang.String previous_number;

    private java.lang.String court;

    private java.lang.String jurisdiction;

    private java.lang.String district;

    private java.lang.String deptor;

    private java.lang.String partner;

    public RiskInsolvencyRegistration() {
    }

    public RiskInsolvencyRegistration(
           java.lang.String case_number,
           java.lang.String previous_number,
           java.lang.String court,
           java.lang.String jurisdiction,
           java.lang.String district,
           java.lang.String deptor,
           java.lang.String partner) {
           this.case_number = case_number;
           this.previous_number = previous_number;
           this.court = court;
           this.jurisdiction = jurisdiction;
           this.district = district;
           this.deptor = deptor;
           this.partner = partner;
    }


    /**
     * Gets the case_number value for this RiskInsolvencyRegistration.
     * 
     * @return case_number
     */
    public java.lang.String getCase_number() {
        return case_number;
    }


    /**
     * Sets the case_number value for this RiskInsolvencyRegistration.
     * 
     * @param case_number
     */
    public void setCase_number(java.lang.String case_number) {
        this.case_number = case_number;
    }


    /**
     * Gets the previous_number value for this RiskInsolvencyRegistration.
     * 
     * @return previous_number
     */
    public java.lang.String getPrevious_number() {
        return previous_number;
    }


    /**
     * Sets the previous_number value for this RiskInsolvencyRegistration.
     * 
     * @param previous_number
     */
    public void setPrevious_number(java.lang.String previous_number) {
        this.previous_number = previous_number;
    }


    /**
     * Gets the court value for this RiskInsolvencyRegistration.
     * 
     * @return court
     */
    public java.lang.String getCourt() {
        return court;
    }


    /**
     * Sets the court value for this RiskInsolvencyRegistration.
     * 
     * @param court
     */
    public void setCourt(java.lang.String court) {
        this.court = court;
    }


    /**
     * Gets the jurisdiction value for this RiskInsolvencyRegistration.
     * 
     * @return jurisdiction
     */
    public java.lang.String getJurisdiction() {
        return jurisdiction;
    }


    /**
     * Sets the jurisdiction value for this RiskInsolvencyRegistration.
     * 
     * @param jurisdiction
     */
    public void setJurisdiction(java.lang.String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    /**
     * Gets the district value for this RiskInsolvencyRegistration.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this RiskInsolvencyRegistration.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the deptor value for this RiskInsolvencyRegistration.
     * 
     * @return deptor
     */
    public java.lang.String getDeptor() {
        return deptor;
    }


    /**
     * Sets the deptor value for this RiskInsolvencyRegistration.
     * 
     * @param deptor
     */
    public void setDeptor(java.lang.String deptor) {
        this.deptor = deptor;
    }


    /**
     * Gets the partner value for this RiskInsolvencyRegistration.
     * 
     * @return partner
     */
    public java.lang.String getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this RiskInsolvencyRegistration.
     * 
     * @param partner
     */
    public void setPartner(java.lang.String partner) {
        this.partner = partner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskInsolvencyRegistration)) return false;
        RiskInsolvencyRegistration other = (RiskInsolvencyRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.case_number==null && other.getCase_number()==null) || 
             (this.case_number!=null &&
              this.case_number.equals(other.getCase_number()))) &&
            ((this.previous_number==null && other.getPrevious_number()==null) || 
             (this.previous_number!=null &&
              this.previous_number.equals(other.getPrevious_number()))) &&
            ((this.court==null && other.getCourt()==null) || 
             (this.court!=null &&
              this.court.equals(other.getCourt()))) &&
            ((this.jurisdiction==null && other.getJurisdiction()==null) || 
             (this.jurisdiction!=null &&
              this.jurisdiction.equals(other.getJurisdiction()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.deptor==null && other.getDeptor()==null) || 
             (this.deptor!=null &&
              this.deptor.equals(other.getDeptor()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner())));
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
        if (getCase_number() != null) {
            _hashCode += getCase_number().hashCode();
        }
        if (getPrevious_number() != null) {
            _hashCode += getPrevious_number().hashCode();
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
        if (getDeptor() != null) {
            _hashCode += getDeptor().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskInsolvencyRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvencyRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("case_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "case_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("deptor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "partner"));
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
