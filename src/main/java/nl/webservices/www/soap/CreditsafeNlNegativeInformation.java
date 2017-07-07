/**
 * CreditsafeNlNegativeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeNlNegativeInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeNlCourtData court_data;

    public CreditsafeNlNegativeInformation() {
    }

    public CreditsafeNlNegativeInformation(
           nl.webservices.www.soap.CreditsafeNlCourtData court_data) {
           this.court_data = court_data;
    }


    /**
     * Gets the court_data value for this CreditsafeNlNegativeInformation.
     * 
     * @return court_data
     */
    public nl.webservices.www.soap.CreditsafeNlCourtData getCourt_data() {
        return court_data;
    }


    /**
     * Sets the court_data value for this CreditsafeNlNegativeInformation.
     * 
     * @param court_data
     */
    public void setCourt_data(nl.webservices.www.soap.CreditsafeNlCourtData court_data) {
        this.court_data = court_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeNlNegativeInformation)) return false;
        CreditsafeNlNegativeInformation other = (CreditsafeNlNegativeInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.court_data==null && other.getCourt_data()==null) || 
             (this.court_data!=null &&
              this.court_data.equals(other.getCourt_data())));
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
        if (getCourt_data() != null) {
            _hashCode += getCourt_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeNlNegativeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlNegativeInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("court_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "court_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlCourtData"));
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
