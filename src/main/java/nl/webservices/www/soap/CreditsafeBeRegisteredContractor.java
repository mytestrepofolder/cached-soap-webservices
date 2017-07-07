/**
 * CreditsafeBeRegisteredContractor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBeRegisteredContractor  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt registration_number;

    private java.lang.String contractor_description;

    private java.util.Calendar striking_off_date;

    public CreditsafeBeRegisteredContractor() {
    }

    public CreditsafeBeRegisteredContractor(
           org.apache.axis.types.UnsignedInt registration_number,
           java.lang.String contractor_description,
           java.util.Calendar striking_off_date) {
           this.registration_number = registration_number;
           this.contractor_description = contractor_description;
           this.striking_off_date = striking_off_date;
    }


    /**
     * Gets the registration_number value for this CreditsafeBeRegisteredContractor.
     * 
     * @return registration_number
     */
    public org.apache.axis.types.UnsignedInt getRegistration_number() {
        return registration_number;
    }


    /**
     * Sets the registration_number value for this CreditsafeBeRegisteredContractor.
     * 
     * @param registration_number
     */
    public void setRegistration_number(org.apache.axis.types.UnsignedInt registration_number) {
        this.registration_number = registration_number;
    }


    /**
     * Gets the contractor_description value for this CreditsafeBeRegisteredContractor.
     * 
     * @return contractor_description
     */
    public java.lang.String getContractor_description() {
        return contractor_description;
    }


    /**
     * Sets the contractor_description value for this CreditsafeBeRegisteredContractor.
     * 
     * @param contractor_description
     */
    public void setContractor_description(java.lang.String contractor_description) {
        this.contractor_description = contractor_description;
    }


    /**
     * Gets the striking_off_date value for this CreditsafeBeRegisteredContractor.
     * 
     * @return striking_off_date
     */
    public java.util.Calendar getStriking_off_date() {
        return striking_off_date;
    }


    /**
     * Sets the striking_off_date value for this CreditsafeBeRegisteredContractor.
     * 
     * @param striking_off_date
     */
    public void setStriking_off_date(java.util.Calendar striking_off_date) {
        this.striking_off_date = striking_off_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBeRegisteredContractor)) return false;
        CreditsafeBeRegisteredContractor other = (CreditsafeBeRegisteredContractor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registration_number==null && other.getRegistration_number()==null) || 
             (this.registration_number!=null &&
              this.registration_number.equals(other.getRegistration_number()))) &&
            ((this.contractor_description==null && other.getContractor_description()==null) || 
             (this.contractor_description!=null &&
              this.contractor_description.equals(other.getContractor_description()))) &&
            ((this.striking_off_date==null && other.getStriking_off_date()==null) || 
             (this.striking_off_date!=null &&
              this.striking_off_date.equals(other.getStriking_off_date())));
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
        if (getRegistration_number() != null) {
            _hashCode += getRegistration_number().hashCode();
        }
        if (getContractor_description() != null) {
            _hashCode += getContractor_description().hashCode();
        }
        if (getStriking_off_date() != null) {
            _hashCode += getStriking_off_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeBeRegisteredContractor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBeRegisteredContractor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractor_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contractor_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("striking_off_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "striking_off_date"));
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
