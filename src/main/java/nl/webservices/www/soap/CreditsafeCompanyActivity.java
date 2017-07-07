/**
 * CreditsafeCompanyActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeCompanyActivity  implements java.io.Serializable {
    private java.lang.String activity_code;

    private java.lang.String activity_description;

    public CreditsafeCompanyActivity() {
    }

    public CreditsafeCompanyActivity(
           java.lang.String activity_code,
           java.lang.String activity_description) {
           this.activity_code = activity_code;
           this.activity_description = activity_description;
    }


    /**
     * Gets the activity_code value for this CreditsafeCompanyActivity.
     * 
     * @return activity_code
     */
    public java.lang.String getActivity_code() {
        return activity_code;
    }


    /**
     * Sets the activity_code value for this CreditsafeCompanyActivity.
     * 
     * @param activity_code
     */
    public void setActivity_code(java.lang.String activity_code) {
        this.activity_code = activity_code;
    }


    /**
     * Gets the activity_description value for this CreditsafeCompanyActivity.
     * 
     * @return activity_description
     */
    public java.lang.String getActivity_description() {
        return activity_description;
    }


    /**
     * Sets the activity_description value for this CreditsafeCompanyActivity.
     * 
     * @param activity_description
     */
    public void setActivity_description(java.lang.String activity_description) {
        this.activity_description = activity_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeCompanyActivity)) return false;
        CreditsafeCompanyActivity other = (CreditsafeCompanyActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activity_code==null && other.getActivity_code()==null) || 
             (this.activity_code!=null &&
              this.activity_code.equals(other.getActivity_code()))) &&
            ((this.activity_description==null && other.getActivity_description()==null) || 
             (this.activity_description!=null &&
              this.activity_description.equals(other.getActivity_description())));
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
        if (getActivity_code() != null) {
            _hashCode += getActivity_code().hashCode();
        }
        if (getActivity_description() != null) {
            _hashCode += getActivity_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeCompanyActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "activity_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
