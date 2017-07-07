/**
 * UserAddGroupRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class UserAddGroupRequestType  implements java.io.Serializable {
    private int userid;

    private int usergroupid;

    public UserAddGroupRequestType() {
    }

    public UserAddGroupRequestType(
           int userid,
           int usergroupid) {
           this.userid = userid;
           this.usergroupid = usergroupid;
    }


    /**
     * Gets the userid value for this UserAddGroupRequestType.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserAddGroupRequestType.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }


    /**
     * Gets the usergroupid value for this UserAddGroupRequestType.
     * 
     * @return usergroupid
     */
    public int getUsergroupid() {
        return usergroupid;
    }


    /**
     * Sets the usergroupid value for this UserAddGroupRequestType.
     * 
     * @param usergroupid
     */
    public void setUsergroupid(int usergroupid) {
        this.usergroupid = usergroupid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAddGroupRequestType)) return false;
        UserAddGroupRequestType other = (UserAddGroupRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userid == other.getUserid() &&
            this.usergroupid == other.getUsergroupid();
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
        _hashCode += getUsergroupid();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAddGroupRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userAddGroupRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usergroupid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "usergroupid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
