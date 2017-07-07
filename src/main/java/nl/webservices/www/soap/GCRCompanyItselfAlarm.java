/**
 * GCRCompanyItselfAlarm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanyItselfAlarm  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRAlarmContactDetails contact_details;

    private nl.webservices.www.soap.GCRDiscontinuance discontinuance;

    private nl.webservices.www.soap.GCRSpecialCompanyInformation[] special_company_information;

    public GCRCompanyItselfAlarm() {
    }

    public GCRCompanyItselfAlarm(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRAlarmContactDetails contact_details,
           nl.webservices.www.soap.GCRDiscontinuance discontinuance,
           nl.webservices.www.soap.GCRSpecialCompanyInformation[] special_company_information) {
           this.graydon_company_id = graydon_company_id;
           this.contact_details = contact_details;
           this.discontinuance = discontinuance;
           this.special_company_information = special_company_information;
    }


    /**
     * Gets the graydon_company_id value for this GCRCompanyItselfAlarm.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCompanyItselfAlarm.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the contact_details value for this GCRCompanyItselfAlarm.
     * 
     * @return contact_details
     */
    public nl.webservices.www.soap.GCRAlarmContactDetails getContact_details() {
        return contact_details;
    }


    /**
     * Sets the contact_details value for this GCRCompanyItselfAlarm.
     * 
     * @param contact_details
     */
    public void setContact_details(nl.webservices.www.soap.GCRAlarmContactDetails contact_details) {
        this.contact_details = contact_details;
    }


    /**
     * Gets the discontinuance value for this GCRCompanyItselfAlarm.
     * 
     * @return discontinuance
     */
    public nl.webservices.www.soap.GCRDiscontinuance getDiscontinuance() {
        return discontinuance;
    }


    /**
     * Sets the discontinuance value for this GCRCompanyItselfAlarm.
     * 
     * @param discontinuance
     */
    public void setDiscontinuance(nl.webservices.www.soap.GCRDiscontinuance discontinuance) {
        this.discontinuance = discontinuance;
    }


    /**
     * Gets the special_company_information value for this GCRCompanyItselfAlarm.
     * 
     * @return special_company_information
     */
    public nl.webservices.www.soap.GCRSpecialCompanyInformation[] getSpecial_company_information() {
        return special_company_information;
    }


    /**
     * Sets the special_company_information value for this GCRCompanyItselfAlarm.
     * 
     * @param special_company_information
     */
    public void setSpecial_company_information(nl.webservices.www.soap.GCRSpecialCompanyInformation[] special_company_information) {
        this.special_company_information = special_company_information;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanyItselfAlarm)) return false;
        GCRCompanyItselfAlarm other = (GCRCompanyItselfAlarm) obj;
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
            ((this.contact_details==null && other.getContact_details()==null) || 
             (this.contact_details!=null &&
              this.contact_details.equals(other.getContact_details()))) &&
            ((this.discontinuance==null && other.getDiscontinuance()==null) || 
             (this.discontinuance!=null &&
              this.discontinuance.equals(other.getDiscontinuance()))) &&
            ((this.special_company_information==null && other.getSpecial_company_information()==null) || 
             (this.special_company_information!=null &&
              java.util.Arrays.equals(this.special_company_information, other.getSpecial_company_information())));
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
        if (getContact_details() != null) {
            _hashCode += getContact_details().hashCode();
        }
        if (getDiscontinuance() != null) {
            _hashCode += getDiscontinuance().hashCode();
        }
        if (getSpecial_company_information() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecial_company_information());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecial_company_information(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCompanyItselfAlarm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyItselfAlarm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarmContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discontinuance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "discontinuance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRDiscontinuance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special_company_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "special_company_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRSpecialCompanyInformation"));
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
