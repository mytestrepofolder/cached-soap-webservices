/**
 * DutchVehicleTypeApproval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleTypeApproval  implements java.io.Serializable {
    private java.lang.String type_code;

    private java.lang.String version_code;

    private java.lang.String type_approval_mark;

    public DutchVehicleTypeApproval() {
    }

    public DutchVehicleTypeApproval(
           java.lang.String type_code,
           java.lang.String version_code,
           java.lang.String type_approval_mark) {
           this.type_code = type_code;
           this.version_code = version_code;
           this.type_approval_mark = type_approval_mark;
    }


    /**
     * Gets the type_code value for this DutchVehicleTypeApproval.
     * 
     * @return type_code
     */
    public java.lang.String getType_code() {
        return type_code;
    }


    /**
     * Sets the type_code value for this DutchVehicleTypeApproval.
     * 
     * @param type_code
     */
    public void setType_code(java.lang.String type_code) {
        this.type_code = type_code;
    }


    /**
     * Gets the version_code value for this DutchVehicleTypeApproval.
     * 
     * @return version_code
     */
    public java.lang.String getVersion_code() {
        return version_code;
    }


    /**
     * Sets the version_code value for this DutchVehicleTypeApproval.
     * 
     * @param version_code
     */
    public void setVersion_code(java.lang.String version_code) {
        this.version_code = version_code;
    }


    /**
     * Gets the type_approval_mark value for this DutchVehicleTypeApproval.
     * 
     * @return type_approval_mark
     */
    public java.lang.String getType_approval_mark() {
        return type_approval_mark;
    }


    /**
     * Sets the type_approval_mark value for this DutchVehicleTypeApproval.
     * 
     * @param type_approval_mark
     */
    public void setType_approval_mark(java.lang.String type_approval_mark) {
        this.type_approval_mark = type_approval_mark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleTypeApproval)) return false;
        DutchVehicleTypeApproval other = (DutchVehicleTypeApproval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type_code==null && other.getType_code()==null) || 
             (this.type_code!=null &&
              this.type_code.equals(other.getType_code()))) &&
            ((this.version_code==null && other.getVersion_code()==null) || 
             (this.version_code!=null &&
              this.version_code.equals(other.getVersion_code()))) &&
            ((this.type_approval_mark==null && other.getType_approval_mark()==null) || 
             (this.type_approval_mark!=null &&
              this.type_approval_mark.equals(other.getType_approval_mark())));
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
        if (getType_code() != null) {
            _hashCode += getType_code().hashCode();
        }
        if (getVersion_code() != null) {
            _hashCode += getVersion_code().hashCode();
        }
        if (getType_approval_mark() != null) {
            _hashCode += getType_approval_mark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleTypeApproval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleTypeApproval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "version_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_approval_mark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_approval_mark"));
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
