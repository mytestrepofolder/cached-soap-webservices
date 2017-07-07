/**
 * DutchVehicleEngine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleEngine  implements java.io.Serializable {
    private java.lang.Integer cylinder_capacity;

    private java.lang.Integer cylinders;

    private java.lang.Boolean g3_indication;

    private java.lang.String energy_label;

    public DutchVehicleEngine() {
    }

    public DutchVehicleEngine(
           java.lang.Integer cylinder_capacity,
           java.lang.Integer cylinders,
           java.lang.Boolean g3_indication,
           java.lang.String energy_label) {
           this.cylinder_capacity = cylinder_capacity;
           this.cylinders = cylinders;
           this.g3_indication = g3_indication;
           this.energy_label = energy_label;
    }


    /**
     * Gets the cylinder_capacity value for this DutchVehicleEngine.
     * 
     * @return cylinder_capacity
     */
    public java.lang.Integer getCylinder_capacity() {
        return cylinder_capacity;
    }


    /**
     * Sets the cylinder_capacity value for this DutchVehicleEngine.
     * 
     * @param cylinder_capacity
     */
    public void setCylinder_capacity(java.lang.Integer cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }


    /**
     * Gets the cylinders value for this DutchVehicleEngine.
     * 
     * @return cylinders
     */
    public java.lang.Integer getCylinders() {
        return cylinders;
    }


    /**
     * Sets the cylinders value for this DutchVehicleEngine.
     * 
     * @param cylinders
     */
    public void setCylinders(java.lang.Integer cylinders) {
        this.cylinders = cylinders;
    }


    /**
     * Gets the g3_indication value for this DutchVehicleEngine.
     * 
     * @return g3_indication
     */
    public java.lang.Boolean getG3_indication() {
        return g3_indication;
    }


    /**
     * Sets the g3_indication value for this DutchVehicleEngine.
     * 
     * @param g3_indication
     */
    public void setG3_indication(java.lang.Boolean g3_indication) {
        this.g3_indication = g3_indication;
    }


    /**
     * Gets the energy_label value for this DutchVehicleEngine.
     * 
     * @return energy_label
     */
    public java.lang.String getEnergy_label() {
        return energy_label;
    }


    /**
     * Sets the energy_label value for this DutchVehicleEngine.
     * 
     * @param energy_label
     */
    public void setEnergy_label(java.lang.String energy_label) {
        this.energy_label = energy_label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleEngine)) return false;
        DutchVehicleEngine other = (DutchVehicleEngine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cylinder_capacity==null && other.getCylinder_capacity()==null) || 
             (this.cylinder_capacity!=null &&
              this.cylinder_capacity.equals(other.getCylinder_capacity()))) &&
            ((this.cylinders==null && other.getCylinders()==null) || 
             (this.cylinders!=null &&
              this.cylinders.equals(other.getCylinders()))) &&
            ((this.g3_indication==null && other.getG3_indication()==null) || 
             (this.g3_indication!=null &&
              this.g3_indication.equals(other.getG3_indication()))) &&
            ((this.energy_label==null && other.getEnergy_label()==null) || 
             (this.energy_label!=null &&
              this.energy_label.equals(other.getEnergy_label())));
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
        if (getCylinder_capacity() != null) {
            _hashCode += getCylinder_capacity().hashCode();
        }
        if (getCylinders() != null) {
            _hashCode += getCylinders().hashCode();
        }
        if (getG3_indication() != null) {
            _hashCode += getG3_indication().hashCode();
        }
        if (getEnergy_label() != null) {
            _hashCode += getEnergy_label().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleEngine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleEngine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinder_capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cylinder_capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cylinders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "cylinders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("g3_indication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "g3_indication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("energy_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "energy_label"));
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
