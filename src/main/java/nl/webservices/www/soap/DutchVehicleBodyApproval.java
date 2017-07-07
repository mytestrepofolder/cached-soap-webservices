/**
 * DutchVehicleBodyApproval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleBodyApproval  implements java.io.Serializable {
    private java.lang.Integer type_id;

    private java.lang.String type_code;

    private java.lang.String description;

    public DutchVehicleBodyApproval() {
    }

    public DutchVehicleBodyApproval(
           java.lang.Integer type_id,
           java.lang.String type_code,
           java.lang.String description) {
           this.type_id = type_id;
           this.type_code = type_code;
           this.description = description;
    }


    /**
     * Gets the type_id value for this DutchVehicleBodyApproval.
     * 
     * @return type_id
     */
    public java.lang.Integer getType_id() {
        return type_id;
    }


    /**
     * Sets the type_id value for this DutchVehicleBodyApproval.
     * 
     * @param type_id
     */
    public void setType_id(java.lang.Integer type_id) {
        this.type_id = type_id;
    }


    /**
     * Gets the type_code value for this DutchVehicleBodyApproval.
     * 
     * @return type_code
     */
    public java.lang.String getType_code() {
        return type_code;
    }


    /**
     * Sets the type_code value for this DutchVehicleBodyApproval.
     * 
     * @param type_code
     */
    public void setType_code(java.lang.String type_code) {
        this.type_code = type_code;
    }


    /**
     * Gets the description value for this DutchVehicleBodyApproval.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchVehicleBodyApproval.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleBodyApproval)) return false;
        DutchVehicleBodyApproval other = (DutchVehicleBodyApproval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type_id==null && other.getType_id()==null) || 
             (this.type_id!=null &&
              this.type_id.equals(other.getType_id()))) &&
            ((this.type_code==null && other.getType_code()==null) || 
             (this.type_code!=null &&
              this.type_code.equals(other.getType_code()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getType_id() != null) {
            _hashCode += getType_id().hashCode();
        }
        if (getType_code() != null) {
            _hashCode += getType_code().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleBodyApproval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleBodyApproval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
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
