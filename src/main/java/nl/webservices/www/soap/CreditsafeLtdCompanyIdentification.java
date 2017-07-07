/**
 * CreditsafeLtdCompanyIdentification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdCompanyIdentification  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeLtdCompanyBasicInformation basic_information;

    private nl.webservices.www.soap.CreditsafeCompanyActivity[] activities;

    private nl.webservices.www.soap.CreditsafeChangedString[] previous_names;

    private nl.webservices.www.soap.CreditsafeChangedString[] previous_legal_forms;

    public CreditsafeLtdCompanyIdentification() {
    }

    public CreditsafeLtdCompanyIdentification(
           nl.webservices.www.soap.CreditsafeLtdCompanyBasicInformation basic_information,
           nl.webservices.www.soap.CreditsafeCompanyActivity[] activities,
           nl.webservices.www.soap.CreditsafeChangedString[] previous_names,
           nl.webservices.www.soap.CreditsafeChangedString[] previous_legal_forms) {
           this.basic_information = basic_information;
           this.activities = activities;
           this.previous_names = previous_names;
           this.previous_legal_forms = previous_legal_forms;
    }


    /**
     * Gets the basic_information value for this CreditsafeLtdCompanyIdentification.
     * 
     * @return basic_information
     */
    public nl.webservices.www.soap.CreditsafeLtdCompanyBasicInformation getBasic_information() {
        return basic_information;
    }


    /**
     * Sets the basic_information value for this CreditsafeLtdCompanyIdentification.
     * 
     * @param basic_information
     */
    public void setBasic_information(nl.webservices.www.soap.CreditsafeLtdCompanyBasicInformation basic_information) {
        this.basic_information = basic_information;
    }


    /**
     * Gets the activities value for this CreditsafeLtdCompanyIdentification.
     * 
     * @return activities
     */
    public nl.webservices.www.soap.CreditsafeCompanyActivity[] getActivities() {
        return activities;
    }


    /**
     * Sets the activities value for this CreditsafeLtdCompanyIdentification.
     * 
     * @param activities
     */
    public void setActivities(nl.webservices.www.soap.CreditsafeCompanyActivity[] activities) {
        this.activities = activities;
    }


    /**
     * Gets the previous_names value for this CreditsafeLtdCompanyIdentification.
     * 
     * @return previous_names
     */
    public nl.webservices.www.soap.CreditsafeChangedString[] getPrevious_names() {
        return previous_names;
    }


    /**
     * Sets the previous_names value for this CreditsafeLtdCompanyIdentification.
     * 
     * @param previous_names
     */
    public void setPrevious_names(nl.webservices.www.soap.CreditsafeChangedString[] previous_names) {
        this.previous_names = previous_names;
    }


    /**
     * Gets the previous_legal_forms value for this CreditsafeLtdCompanyIdentification.
     * 
     * @return previous_legal_forms
     */
    public nl.webservices.www.soap.CreditsafeChangedString[] getPrevious_legal_forms() {
        return previous_legal_forms;
    }


    /**
     * Sets the previous_legal_forms value for this CreditsafeLtdCompanyIdentification.
     * 
     * @param previous_legal_forms
     */
    public void setPrevious_legal_forms(nl.webservices.www.soap.CreditsafeChangedString[] previous_legal_forms) {
        this.previous_legal_forms = previous_legal_forms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdCompanyIdentification)) return false;
        CreditsafeLtdCompanyIdentification other = (CreditsafeLtdCompanyIdentification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basic_information==null && other.getBasic_information()==null) || 
             (this.basic_information!=null &&
              this.basic_information.equals(other.getBasic_information()))) &&
            ((this.activities==null && other.getActivities()==null) || 
             (this.activities!=null &&
              java.util.Arrays.equals(this.activities, other.getActivities()))) &&
            ((this.previous_names==null && other.getPrevious_names()==null) || 
             (this.previous_names!=null &&
              java.util.Arrays.equals(this.previous_names, other.getPrevious_names()))) &&
            ((this.previous_legal_forms==null && other.getPrevious_legal_forms()==null) || 
             (this.previous_legal_forms!=null &&
              java.util.Arrays.equals(this.previous_legal_forms, other.getPrevious_legal_forms())));
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
        if (getBasic_information() != null) {
            _hashCode += getBasic_information().hashCode();
        }
        if (getActivities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrevious_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevious_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevious_names(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrevious_legal_forms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevious_legal_forms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevious_legal_forms(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeLtdCompanyIdentification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCompanyIdentification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "basic_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdCompanyBasicInformation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyActivity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeChangedString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_legal_forms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_legal_forms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeChangedString"));
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
