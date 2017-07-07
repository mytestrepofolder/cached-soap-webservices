/**
 * CreateTestUserResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreateTestUserResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.UserCredentials user_credentials;

    public CreateTestUserResponseType() {
    }

    public CreateTestUserResponseType(
           nl.webservices.www.soap.UserCredentials user_credentials) {
           this.user_credentials = user_credentials;
    }


    /**
     * Gets the user_credentials value for this CreateTestUserResponseType.
     * 
     * @return user_credentials
     */
    public nl.webservices.www.soap.UserCredentials getUser_credentials() {
        return user_credentials;
    }


    /**
     * Sets the user_credentials value for this CreateTestUserResponseType.
     * 
     * @param user_credentials
     */
    public void setUser_credentials(nl.webservices.www.soap.UserCredentials user_credentials) {
        this.user_credentials = user_credentials;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTestUserResponseType)) return false;
        CreateTestUserResponseType other = (CreateTestUserResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_credentials==null && other.getUser_credentials()==null) || 
             (this.user_credentials!=null &&
              this.user_credentials.equals(other.getUser_credentials())));
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
        if (getUser_credentials() != null) {
            _hashCode += getUser_credentials().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTestUserResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "createTestUserResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "user_credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "UserCredentials"));
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
