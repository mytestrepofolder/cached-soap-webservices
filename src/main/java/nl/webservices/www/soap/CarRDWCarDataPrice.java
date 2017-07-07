/**
 * CarRDWCarDataPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarRDWCarDataPrice  implements java.io.Serializable {
    private nl.webservices.www.soap.CarV3 basic_car_data;

    private nl.webservices.www.soap.CarEnvironment environment_data;

    private nl.webservices.www.soap.CarStatus status_data;

    private java.math.BigDecimal power;

    private java.lang.String[] fuel_types;

    private java.lang.Integer top_speed;

    private java.lang.Integer catalog_price;

    private java.lang.Integer bpm;

    private nl.webservices.www.soap.CarBody[] bodies;

    public CarRDWCarDataPrice() {
    }

    public CarRDWCarDataPrice(
           nl.webservices.www.soap.CarV3 basic_car_data,
           nl.webservices.www.soap.CarEnvironment environment_data,
           nl.webservices.www.soap.CarStatus status_data,
           java.math.BigDecimal power,
           java.lang.String[] fuel_types,
           java.lang.Integer top_speed,
           java.lang.Integer catalog_price,
           java.lang.Integer bpm,
           nl.webservices.www.soap.CarBody[] bodies) {
           this.basic_car_data = basic_car_data;
           this.environment_data = environment_data;
           this.status_data = status_data;
           this.power = power;
           this.fuel_types = fuel_types;
           this.top_speed = top_speed;
           this.catalog_price = catalog_price;
           this.bpm = bpm;
           this.bodies = bodies;
    }


    /**
     * Gets the basic_car_data value for this CarRDWCarDataPrice.
     * 
     * @return basic_car_data
     */
    public nl.webservices.www.soap.CarV3 getBasic_car_data() {
        return basic_car_data;
    }


    /**
     * Sets the basic_car_data value for this CarRDWCarDataPrice.
     * 
     * @param basic_car_data
     */
    public void setBasic_car_data(nl.webservices.www.soap.CarV3 basic_car_data) {
        this.basic_car_data = basic_car_data;
    }


    /**
     * Gets the environment_data value for this CarRDWCarDataPrice.
     * 
     * @return environment_data
     */
    public nl.webservices.www.soap.CarEnvironment getEnvironment_data() {
        return environment_data;
    }


    /**
     * Sets the environment_data value for this CarRDWCarDataPrice.
     * 
     * @param environment_data
     */
    public void setEnvironment_data(nl.webservices.www.soap.CarEnvironment environment_data) {
        this.environment_data = environment_data;
    }


    /**
     * Gets the status_data value for this CarRDWCarDataPrice.
     * 
     * @return status_data
     */
    public nl.webservices.www.soap.CarStatus getStatus_data() {
        return status_data;
    }


    /**
     * Sets the status_data value for this CarRDWCarDataPrice.
     * 
     * @param status_data
     */
    public void setStatus_data(nl.webservices.www.soap.CarStatus status_data) {
        this.status_data = status_data;
    }


    /**
     * Gets the power value for this CarRDWCarDataPrice.
     * 
     * @return power
     */
    public java.math.BigDecimal getPower() {
        return power;
    }


    /**
     * Sets the power value for this CarRDWCarDataPrice.
     * 
     * @param power
     */
    public void setPower(java.math.BigDecimal power) {
        this.power = power;
    }


    /**
     * Gets the fuel_types value for this CarRDWCarDataPrice.
     * 
     * @return fuel_types
     */
    public java.lang.String[] getFuel_types() {
        return fuel_types;
    }


    /**
     * Sets the fuel_types value for this CarRDWCarDataPrice.
     * 
     * @param fuel_types
     */
    public void setFuel_types(java.lang.String[] fuel_types) {
        this.fuel_types = fuel_types;
    }


    /**
     * Gets the top_speed value for this CarRDWCarDataPrice.
     * 
     * @return top_speed
     */
    public java.lang.Integer getTop_speed() {
        return top_speed;
    }


    /**
     * Sets the top_speed value for this CarRDWCarDataPrice.
     * 
     * @param top_speed
     */
    public void setTop_speed(java.lang.Integer top_speed) {
        this.top_speed = top_speed;
    }


    /**
     * Gets the catalog_price value for this CarRDWCarDataPrice.
     * 
     * @return catalog_price
     */
    public java.lang.Integer getCatalog_price() {
        return catalog_price;
    }


    /**
     * Sets the catalog_price value for this CarRDWCarDataPrice.
     * 
     * @param catalog_price
     */
    public void setCatalog_price(java.lang.Integer catalog_price) {
        this.catalog_price = catalog_price;
    }


    /**
     * Gets the bpm value for this CarRDWCarDataPrice.
     * 
     * @return bpm
     */
    public java.lang.Integer getBpm() {
        return bpm;
    }


    /**
     * Sets the bpm value for this CarRDWCarDataPrice.
     * 
     * @param bpm
     */
    public void setBpm(java.lang.Integer bpm) {
        this.bpm = bpm;
    }


    /**
     * Gets the bodies value for this CarRDWCarDataPrice.
     * 
     * @return bodies
     */
    public nl.webservices.www.soap.CarBody[] getBodies() {
        return bodies;
    }


    /**
     * Sets the bodies value for this CarRDWCarDataPrice.
     * 
     * @param bodies
     */
    public void setBodies(nl.webservices.www.soap.CarBody[] bodies) {
        this.bodies = bodies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarRDWCarDataPrice)) return false;
        CarRDWCarDataPrice other = (CarRDWCarDataPrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basic_car_data==null && other.getBasic_car_data()==null) || 
             (this.basic_car_data!=null &&
              this.basic_car_data.equals(other.getBasic_car_data()))) &&
            ((this.environment_data==null && other.getEnvironment_data()==null) || 
             (this.environment_data!=null &&
              this.environment_data.equals(other.getEnvironment_data()))) &&
            ((this.status_data==null && other.getStatus_data()==null) || 
             (this.status_data!=null &&
              this.status_data.equals(other.getStatus_data()))) &&
            ((this.power==null && other.getPower()==null) || 
             (this.power!=null &&
              this.power.equals(other.getPower()))) &&
            ((this.fuel_types==null && other.getFuel_types()==null) || 
             (this.fuel_types!=null &&
              java.util.Arrays.equals(this.fuel_types, other.getFuel_types()))) &&
            ((this.top_speed==null && other.getTop_speed()==null) || 
             (this.top_speed!=null &&
              this.top_speed.equals(other.getTop_speed()))) &&
            ((this.catalog_price==null && other.getCatalog_price()==null) || 
             (this.catalog_price!=null &&
              this.catalog_price.equals(other.getCatalog_price()))) &&
            ((this.bpm==null && other.getBpm()==null) || 
             (this.bpm!=null &&
              this.bpm.equals(other.getBpm()))) &&
            ((this.bodies==null && other.getBodies()==null) || 
             (this.bodies!=null &&
              java.util.Arrays.equals(this.bodies, other.getBodies())));
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
        if (getBasic_car_data() != null) {
            _hashCode += getBasic_car_data().hashCode();
        }
        if (getEnvironment_data() != null) {
            _hashCode += getEnvironment_data().hashCode();
        }
        if (getStatus_data() != null) {
            _hashCode += getStatus_data().hashCode();
        }
        if (getPower() != null) {
            _hashCode += getPower().hashCode();
        }
        if (getFuel_types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFuel_types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFuel_types(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTop_speed() != null) {
            _hashCode += getTop_speed().hashCode();
        }
        if (getCatalog_price() != null) {
            _hashCode += getCatalog_price().hashCode();
        }
        if (getBpm() != null) {
            _hashCode += getBpm().hashCode();
        }
        if (getBodies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBodies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBodies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarRDWCarDataPrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarRDWCarDataPrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic_car_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "basic_car_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarV3"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "environment_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarEnvironment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "status_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top_speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "top_speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalog_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "catalog_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bpm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bodies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarBody"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
