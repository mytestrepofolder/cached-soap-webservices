/**
 * UserSessionRemoveRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class UserSessionRemoveRequestType  implements java.io.Serializable {
    private int userid;

    private java.lang.String reactid;

    public UserSessionRemoveRequestType() {
    }

    public UserSessionRemoveRequestType(
           int userid,
           java.lang.String reactid) {
           this.userid = userid;
           this.reactid = reactid;
    }


    /**
     * Gets the userid value for this UserSessionRemoveRequestType.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserSessionRemoveRequestType.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }


    /**
     * Gets the reactid value for this UserSessionRemoveRequestType.
     * 
     * @return reactid
     */
    public java.lang.String getReactid() {
        return reactid;
    }


    /**
     * Sets the reactid value for this UserSessionRemoveRequestType.
     * 
     * @param reactid
     */
    public void setReactid(java.lang.String reactid) {
        this.reactid = reactid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSessionRemoveRequestType)) return false;
        UserSessionRemoveRequestType other = (UserSessionRemoveRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userid == other.getUserid() &&
            ((this.reactid==null && other.getReactid()==null) || 
             (this.reactid!=null &&
              this.reactid.equals(other.getReactid())));
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
        _hashCode += getUserid();
        if (getReactid() != null) {
            _hashCode += getReactid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSessionRemoveRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userSessionRemoveRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reactid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reactid"));
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
