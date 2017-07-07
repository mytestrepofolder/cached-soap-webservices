/**
 * DutchVehicleTechnicalWeight.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleTechnicalWeight  implements java.io.Serializable {
    private java.lang.Integer mass_ready;

    private java.lang.Integer gross_vehicle_mass;

    private java.lang.Integer maximum_mass_payload;

    private java.lang.Integer maximum_mass_unbraked;

    private java.lang.Integer maximum_mass_braked;

    private java.lang.Integer maximum_mass_trailer_braked;

    private java.lang.Integer maximum_mass_self_braked;

    private java.lang.Integer maximum_mass_axle_braked;

    public DutchVehicleTechnicalWeight() {
    }

    public DutchVehicleTechnicalWeight(
           java.lang.Integer mass_ready,
           java.lang.Integer gross_vehicle_mass,
           java.lang.Integer maximum_mass_payload,
           java.lang.Integer maximum_mass_unbraked,
           java.lang.Integer maximum_mass_braked,
           java.lang.Integer maximum_mass_trailer_braked,
           java.lang.Integer maximum_mass_self_braked,
           java.lang.Integer maximum_mass_axle_braked) {
           this.mass_ready = mass_ready;
           this.gross_vehicle_mass = gross_vehicle_mass;
           this.maximum_mass_payload = maximum_mass_payload;
           this.maximum_mass_unbraked = maximum_mass_unbraked;
           this.maximum_mass_braked = maximum_mass_braked;
           this.maximum_mass_trailer_braked = maximum_mass_trailer_braked;
           this.maximum_mass_self_braked = maximum_mass_self_braked;
           this.maximum_mass_axle_braked = maximum_mass_axle_braked;
    }


    /**
     * Gets the mass_ready value for this DutchVehicleTechnicalWeight.
     * 
     * @return mass_ready
     */
    public java.lang.Integer getMass_ready() {
        return mass_ready;
    }


    /**
     * Sets the mass_ready value for this DutchVehicleTechnicalWeight.
     * 
     * @param mass_ready
     */
    public void setMass_ready(java.lang.Integer mass_ready) {
        this.mass_ready = mass_ready;
    }


    /**
     * Gets the gross_vehicle_mass value for this DutchVehicleTechnicalWeight.
     * 
     * @return gross_vehicle_mass
     */
    public java.lang.Integer getGross_vehicle_mass() {
        return gross_vehicle_mass;
    }


    /**
     * Sets the gross_vehicle_mass value for this DutchVehicleTechnicalWeight.
     * 
     * @param gross_vehicle_mass
     */
    public void setGross_vehicle_mass(java.lang.Integer gross_vehicle_mass) {
        this.gross_vehicle_mass = gross_vehicle_mass;
    }


    /**
     * Gets the maximum_mass_payload value for this DutchVehicleTechnicalWeight.
     * 
     * @return maximum_mass_payload
     */
    public java.lang.Integer getMaximum_mass_payload() {
        return maximum_mass_payload;
    }


    /**
     * Sets the maximum_mass_payload value for this DutchVehicleTechnicalWeight.
     * 
     * @param maximum_mass_payload
     */
    public void setMaximum_mass_payload(java.lang.Integer maximum_mass_payload) {
        this.maximum_mass_payload = maximum_mass_payload;
    }


    /**
     * Gets the maximum_mass_unbraked value for this DutchVehicleTechnicalWeight.
     * 
     * @return maximum_mass_unbraked
     */
    public java.lang.Integer getMaximum_mass_unbraked() {
        return maximum_mass_unbraked;
    }


    /**
     * Sets the maximum_mass_unbraked value for this DutchVehicleTechnicalWeight.
     * 
     * @param maximum_mass_unbraked
     */
    public void setMaximum_mass_unbraked(java.lang.Integer maximum_mass_unbraked) {
        this.maximum_mass_unbraked = maximum_mass_unbraked;
    }


    /**
     * Gets the maximum_mass_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @return maximum_mass_braked
     */
    public java.lang.Integer getMaximum_mass_braked() {
        return maximum_mass_braked;
    }


    /**
     * Sets the maximum_mass_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @param maximum_mass_braked
     */
    public void setMaximum_mass_braked(java.lang.Integer maximum_mass_braked) {
        this.maximum_mass_braked = maximum_mass_braked;
    }


    /**
     * Gets the maximum_mass_trailer_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @return maximum_mass_trailer_braked
     */
    public java.lang.Integer getMaximum_mass_trailer_braked() {
        return maximum_mass_trailer_braked;
    }


    /**
     * Sets the maximum_mass_trailer_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @param maximum_mass_trailer_braked
     */
    public void setMaximum_mass_trailer_braked(java.lang.Integer maximum_mass_trailer_braked) {
        this.maximum_mass_trailer_braked = maximum_mass_trailer_braked;
    }


    /**
     * Gets the maximum_mass_self_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @return maximum_mass_self_braked
     */
    public java.lang.Integer getMaximum_mass_self_braked() {
        return maximum_mass_self_braked;
    }


    /**
     * Sets the maximum_mass_self_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @param maximum_mass_self_braked
     */
    public void setMaximum_mass_self_braked(java.lang.Integer maximum_mass_self_braked) {
        this.maximum_mass_self_braked = maximum_mass_self_braked;
    }


    /**
     * Gets the maximum_mass_axle_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @return maximum_mass_axle_braked
     */
    public java.lang.Integer getMaximum_mass_axle_braked() {
        return maximum_mass_axle_braked;
    }


    /**
     * Sets the maximum_mass_axle_braked value for this DutchVehicleTechnicalWeight.
     * 
     * @param maximum_mass_axle_braked
     */
    public void setMaximum_mass_axle_braked(java.lang.Integer maximum_mass_axle_braked) {
        this.maximum_mass_axle_braked = maximum_mass_axle_braked;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleTechnicalWeight)) return false;
        DutchVehicleTechnicalWeight other = (DutchVehicleTechnicalWeight) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mass_ready==null && other.getMass_ready()==null) || 
             (this.mass_ready!=null &&
              this.mass_ready.equals(other.getMass_ready()))) &&
            ((this.gross_vehicle_mass==null && other.getGross_vehicle_mass()==null) || 
             (this.gross_vehicle_mass!=null &&
              this.gross_vehicle_mass.equals(other.getGross_vehicle_mass()))) &&
            ((this.maximum_mass_payload==null && other.getMaximum_mass_payload()==null) || 
             (this.maximum_mass_payload!=null &&
              this.maximum_mass_payload.equals(other.getMaximum_mass_payload()))) &&
            ((this.maximum_mass_unbraked==null && other.getMaximum_mass_unbraked()==null) || 
             (this.maximum_mass_unbraked!=null &&
              this.maximum_mass_unbraked.equals(other.getMaximum_mass_unbraked()))) &&
            ((this.maximum_mass_braked==null && other.getMaximum_mass_braked()==null) || 
             (this.maximum_mass_braked!=null &&
              this.maximum_mass_braked.equals(other.getMaximum_mass_braked()))) &&
            ((this.maximum_mass_trailer_braked==null && other.getMaximum_mass_trailer_braked()==null) || 
             (this.maximum_mass_trailer_braked!=null &&
              this.maximum_mass_trailer_braked.equals(other.getMaximum_mass_trailer_braked()))) &&
            ((this.maximum_mass_self_braked==null && other.getMaximum_mass_self_braked()==null) || 
             (this.maximum_mass_self_braked!=null &&
              this.maximum_mass_self_braked.equals(other.getMaximum_mass_self_braked()))) &&
            ((this.maximum_mass_axle_braked==null && other.getMaximum_mass_axle_braked()==null) || 
             (this.maximum_mass_axle_braked!=null &&
              this.maximum_mass_axle_braked.equals(other.getMaximum_mass_axle_braked())));
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
        if (getMass_ready() != null) {
            _hashCode += getMass_ready().hashCode();
        }
        if (getGross_vehicle_mass() != null) {
            _hashCode += getGross_vehicle_mass().hashCode();
        }
        if (getMaximum_mass_payload() != null) {
            _hashCode += getMaximum_mass_payload().hashCode();
        }
        if (getMaximum_mass_unbraked() != null) {
            _hashCode += getMaximum_mass_unbraked().hashCode();
        }
        if (getMaximum_mass_braked() != null) {
            _hashCode += getMaximum_mass_braked().hashCode();
        }
        if (getMaximum_mass_trailer_braked() != null) {
            _hashCode += getMaximum_mass_trailer_braked().hashCode();
        }
        if (getMaximum_mass_self_braked() != null) {
            _hashCode += getMaximum_mass_self_braked().hashCode();
        }
        if (getMaximum_mass_axle_braked() != null) {
            _hashCode += getMaximum_mass_axle_braked().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleTechnicalWeight.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleTechnicalWeight"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mass_ready");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mass_ready"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gross_vehicle_mass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gross_vehicle_mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_payload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_unbraked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_unbraked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_trailer_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_trailer_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_self_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_self_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_mass_axle_braked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "maximum_mass_axle_braked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
