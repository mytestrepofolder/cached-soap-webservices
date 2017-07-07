/**
 * DutchVehicleRemark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleRemark  implements java.io.Serializable {
    private java.lang.String vehicle_code;

    private java.lang.String variable_code;

    private java.lang.String description;

    public DutchVehicleRemark() {
    }

    public DutchVehicleRemark(
           java.lang.String vehicle_code,
           java.lang.String variable_code,
           java.lang.String description) {
           this.vehicle_code = vehicle_code;
           this.variable_code = variable_code;
           this.description = description;
    }


    /**
     * Gets the vehicle_code value for this DutchVehicleRemark.
     * 
     * @return vehicle_code
     */
    public java.lang.String getVehicle_code() {
        return vehicle_code;
    }


    /**
     * Sets the vehicle_code value for this DutchVehicleRemark.
     * 
     * @param vehicle_code
     */
    public void setVehicle_code(java.lang.String vehicle_code) {
        this.vehicle_code = vehicle_code;
    }


    /**
     * Gets the variable_code value for this DutchVehicleRemark.
     * 
     * @return variable_code
     */
    public java.lang.String getVariable_code() {
        return variable_code;
    }


    /**
     * Sets the variable_code value for this DutchVehicleRemark.
     * 
     * @param variable_code
     */
    public void setVariable_code(java.lang.String variable_code) {
        this.variable_code = variable_code;
    }


    /**
     * Gets the description value for this DutchVehicleRemark.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchVehicleRemark.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleRemark)) return false;
        DutchVehicleRemark other = (DutchVehicleRemark) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vehicle_code==null && other.getVehicle_code()==null) || 
             (this.vehicle_code!=null &&
              this.vehicle_code.equals(other.getVehicle_code()))) &&
            ((this.variable_code==null && other.getVariable_code()==null) || 
             (this.variable_code!=null &&
              this.variable_code.equals(other.getVariable_code()))) &&
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
        if (getVehicle_code() != null) {
            _hashCode += getVehicle_code().hashCode();
        }
        if (getVariable_code() != null) {
            _hashCode += getVariable_code().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleRemark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleRemark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vehicle_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variable_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "variable_code"));
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
