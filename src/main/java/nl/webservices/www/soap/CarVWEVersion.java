/**
 * CarVWEVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEVersion  implements java.io.Serializable {
    private int atl_code;

    private java.lang.String version_name;

    private int fuel_type_id;

    private java.lang.String fuel_type;

    private int body_style_id;

    private java.lang.String body_style;

    private int doors;

    private int power;

    private int gear_id;

    private java.lang.String gear;

    private java.util.Date valid_from;

    private java.util.Date valid_until;

    public CarVWEVersion() {
    }

    public CarVWEVersion(
           int atl_code,
           java.lang.String version_name,
           int fuel_type_id,
           java.lang.String fuel_type,
           int body_style_id,
           java.lang.String body_style,
           int doors,
           int power,
           int gear_id,
           java.lang.String gear,
           java.util.Date valid_from,
           java.util.Date valid_until) {
           this.atl_code = atl_code;
           this.version_name = version_name;
           this.fuel_type_id = fuel_type_id;
           this.fuel_type = fuel_type;
           this.body_style_id = body_style_id;
           this.body_style = body_style;
           this.doors = doors;
           this.power = power;
           this.gear_id = gear_id;
           this.gear = gear;
           this.valid_from = valid_from;
           this.valid_until = valid_until;
    }


    /**
     * Gets the atl_code value for this CarVWEVersion.
     * 
     * @return atl_code
     */
    public int getAtl_code() {
        return atl_code;
    }


    /**
     * Sets the atl_code value for this CarVWEVersion.
     * 
     * @param atl_code
     */
    public void setAtl_code(int atl_code) {
        this.atl_code = atl_code;
    }


    /**
     * Gets the version_name value for this CarVWEVersion.
     * 
     * @return version_name
     */
    public java.lang.String getVersion_name() {
        return version_name;
    }


    /**
     * Sets the version_name value for this CarVWEVersion.
     * 
     * @param version_name
     */
    public void setVersion_name(java.lang.String version_name) {
        this.version_name = version_name;
    }


    /**
     * Gets the fuel_type_id value for this CarVWEVersion.
     * 
     * @return fuel_type_id
     */
    public int getFuel_type_id() {
        return fuel_type_id;
    }


    /**
     * Sets the fuel_type_id value for this CarVWEVersion.
     * 
     * @param fuel_type_id
     */
    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }


    /**
     * Gets the fuel_type value for this CarVWEVersion.
     * 
     * @return fuel_type
     */
    public java.lang.String getFuel_type() {
        return fuel_type;
    }


    /**
     * Sets the fuel_type value for this CarVWEVersion.
     * 
     * @param fuel_type
     */
    public void setFuel_type(java.lang.String fuel_type) {
        this.fuel_type = fuel_type;
    }


    /**
     * Gets the body_style_id value for this CarVWEVersion.
     * 
     * @return body_style_id
     */
    public int getBody_style_id() {
        return body_style_id;
    }


    /**
     * Sets the body_style_id value for this CarVWEVersion.
     * 
     * @param body_style_id
     */
    public void setBody_style_id(int body_style_id) {
        this.body_style_id = body_style_id;
    }


    /**
     * Gets the body_style value for this CarVWEVersion.
     * 
     * @return body_style
     */
    public java.lang.String getBody_style() {
        return body_style;
    }


    /**
     * Sets the body_style value for this CarVWEVersion.
     * 
     * @param body_style
     */
    public void setBody_style(java.lang.String body_style) {
        this.body_style = body_style;
    }


    /**
     * Gets the doors value for this CarVWEVersion.
     * 
     * @return doors
     */
    public int getDoors() {
        return doors;
    }


    /**
     * Sets the doors value for this CarVWEVersion.
     * 
     * @param doors
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }


    /**
     * Gets the power value for this CarVWEVersion.
     * 
     * @return power
     */
    public int getPower() {
        return power;
    }


    /**
     * Sets the power value for this CarVWEVersion.
     * 
     * @param power
     */
    public void setPower(int power) {
        this.power = power;
    }


    /**
     * Gets the gear_id value for this CarVWEVersion.
     * 
     * @return gear_id
     */
    public int getGear_id() {
        return gear_id;
    }


    /**
     * Sets the gear_id value for this CarVWEVersion.
     * 
     * @param gear_id
     */
    public void setGear_id(int gear_id) {
        this.gear_id = gear_id;
    }


    /**
     * Gets the gear value for this CarVWEVersion.
     * 
     * @return gear
     */
    public java.lang.String getGear() {
        return gear;
    }


    /**
     * Sets the gear value for this CarVWEVersion.
     * 
     * @param gear
     */
    public void setGear(java.lang.String gear) {
        this.gear = gear;
    }


    /**
     * Gets the valid_from value for this CarVWEVersion.
     * 
     * @return valid_from
     */
    public java.util.Date getValid_from() {
        return valid_from;
    }


    /**
     * Sets the valid_from value for this CarVWEVersion.
     * 
     * @param valid_from
     */
    public void setValid_from(java.util.Date valid_from) {
        this.valid_from = valid_from;
    }


    /**
     * Gets the valid_until value for this CarVWEVersion.
     * 
     * @return valid_until
     */
    public java.util.Date getValid_until() {
        return valid_until;
    }


    /**
     * Sets the valid_until value for this CarVWEVersion.
     * 
     * @param valid_until
     */
    public void setValid_until(java.util.Date valid_until) {
        this.valid_until = valid_until;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEVersion)) return false;
        CarVWEVersion other = (CarVWEVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.atl_code == other.getAtl_code() &&
            ((this.version_name==null && other.getVersion_name()==null) || 
             (this.version_name!=null &&
              this.version_name.equals(other.getVersion_name()))) &&
            this.fuel_type_id == other.getFuel_type_id() &&
            ((this.fuel_type==null && other.getFuel_type()==null) || 
             (this.fuel_type!=null &&
              this.fuel_type.equals(other.getFuel_type()))) &&
            this.body_style_id == other.getBody_style_id() &&
            ((this.body_style==null && other.getBody_style()==null) || 
             (this.body_style!=null &&
              this.body_style.equals(other.getBody_style()))) &&
            this.doors == other.getDoors() &&
            this.power == other.getPower() &&
            this.gear_id == other.getGear_id() &&
            ((this.gear==null && other.getGear()==null) || 
             (this.gear!=null &&
              this.gear.equals(other.getGear()))) &&
            ((this.valid_from==null && other.getValid_from()==null) || 
             (this.valid_from!=null &&
              this.valid_from.equals(other.getValid_from()))) &&
            ((this.valid_until==null && other.getValid_until()==null) || 
             (this.valid_until!=null &&
              this.valid_until.equals(other.getValid_until())));
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
        _hashCode += getAtl_code();
        if (getVersion_name() != null) {
            _hashCode += getVersion_name().hashCode();
        }
        _hashCode += getFuel_type_id();
        if (getFuel_type() != null) {
            _hashCode += getFuel_type().hashCode();
        }
        _hashCode += getBody_style_id();
        if (getBody_style() != null) {
            _hashCode += getBody_style().hashCode();
        }
        _hashCode += getDoors();
        _hashCode += getPower();
        _hashCode += getGear_id();
        if (getGear() != null) {
            _hashCode += getGear().hashCode();
        }
        if (getValid_from() != null) {
            _hashCode += getValid_from().hashCode();
        }
        if (getValid_until() != null) {
            _hashCode += getValid_until().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atl_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "atl_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "version_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body_style_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "body_style_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "body_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "doors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gear_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gear_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "valid_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_until");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "valid_until"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
