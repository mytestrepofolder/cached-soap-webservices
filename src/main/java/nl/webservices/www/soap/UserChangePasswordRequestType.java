/**
 * UserChangePasswordRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class UserChangePasswordRequestType  implements java.io.Serializable {
    private int userid;

    private java.lang.String old_password;

    private java.lang.String new_password;

    public UserChangePasswordRequestType() {
    }

    public UserChangePasswordRequestType(
           int userid,
           java.lang.String old_password,
           java.lang.String new_password) {
           this.userid = userid;
           this.old_password = old_password;
           this.new_password = new_password;
    }


    /**
     * Gets the userid value for this UserChangePasswordRequestType.
     * 
     * @return userid
     */
    public int getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserChangePasswordRequestType.
     * 
     * @param userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }


    /**
     * Gets the old_password value for this UserChangePasswordRequestType.
     * 
     * @return old_password
     */
    public java.lang.String getOld_password() {
        return old_password;
    }


    /**
     * Sets the old_password value for this UserChangePasswordRequestType.
     * 
     * @param old_password
     */
    public void setOld_password(java.lang.String old_password) {
        this.old_password = old_password;
    }


    /**
     * Gets the new_password value for this UserChangePasswordRequestType.
     * 
     * @return new_password
     */
    public java.lang.String getNew_password() {
        return new_password;
    }


    /**
     * Sets the new_password value for this UserChangePasswordRequestType.
     * 
     * @param new_password
     */
    public void setNew_password(java.lang.String new_password) {
        this.new_password = new_password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserChangePasswordRequestType)) return false;
        UserChangePasswordRequestType other = (UserChangePasswordRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userid == other.getUserid() &&
            ((this.old_password==null && other.getOld_password()==null) || 
             (this.old_password!=null &&
              this.old_password.equals(other.getOld_password()))) &&
            ((this.new_password==null && other.getNew_password()==null) || 
             (this.new_password!=null &&
              this.new_password.equals(other.getNew_password())));
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
        if (getOld_password() != null) {
            _hashCode += getOld_password().hashCode();
        }
        if (getNew_password() != null) {
            _hashCode += getNew_password().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserChangePasswordRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userChangePasswordRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("old_password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "old_password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "new_password"));
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
