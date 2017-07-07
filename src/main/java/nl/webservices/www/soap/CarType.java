/**
 * CarType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarType  implements java.io.Serializable {
    private java.lang.String car_id;

    private java.lang.String brand;

    private java.lang.String model;

    private java.lang.String type;

    private java.lang.String gearbox;

    private int first_year;

    private int last_year;

    public CarType() {
    }

    public CarType(
           java.lang.String car_id,
           java.lang.String brand,
           java.lang.String model,
           java.lang.String type,
           java.lang.String gearbox,
           int first_year,
           int last_year) {
           this.car_id = car_id;
           this.brand = brand;
           this.model = model;
           this.type = type;
           this.gearbox = gearbox;
           this.first_year = first_year;
           this.last_year = last_year;
    }


    /**
     * Gets the car_id value for this CarType.
     * 
     * @return car_id
     */
    public java.lang.String getCar_id() {
        return car_id;
    }


    /**
     * Sets the car_id value for this CarType.
     * 
     * @param car_id
     */
    public void setCar_id(java.lang.String car_id) {
        this.car_id = car_id;
    }


    /**
     * Gets the brand value for this CarType.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this CarType.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the model value for this CarType.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this CarType.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the type value for this CarType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CarType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the gearbox value for this CarType.
     * 
     * @return gearbox
     */
    public java.lang.String getGearbox() {
        return gearbox;
    }


    /**
     * Sets the gearbox value for this CarType.
     * 
     * @param gearbox
     */
    public void setGearbox(java.lang.String gearbox) {
        this.gearbox = gearbox;
    }


    /**
     * Gets the first_year value for this CarType.
     * 
     * @return first_year
     */
    public int getFirst_year() {
        return first_year;
    }


    /**
     * Sets the first_year value for this CarType.
     * 
     * @param first_year
     */
    public void setFirst_year(int first_year) {
        this.first_year = first_year;
    }


    /**
     * Gets the last_year value for this CarType.
     * 
     * @return last_year
     */
    public int getLast_year() {
        return last_year;
    }


    /**
     * Sets the last_year value for this CarType.
     * 
     * @param last_year
     */
    public void setLast_year(int last_year) {
        this.last_year = last_year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarType)) return false;
        CarType other = (CarType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.car_id==null && other.getCar_id()==null) || 
             (this.car_id!=null &&
              this.car_id.equals(other.getCar_id()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.gearbox==null && other.getGearbox()==null) || 
             (this.gearbox!=null &&
              this.gearbox.equals(other.getGearbox()))) &&
            this.first_year == other.getFirst_year() &&
            this.last_year == other.getLast_year();
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
        if (getCar_id() != null) {
            _hashCode += getCar_id().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGearbox() != null) {
            _hashCode += getGearbox().hashCode();
        }
        _hashCode += getFirst_year();
        _hashCode += getLast_year();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("car_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "car_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gearbox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gearbox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "first_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "last_year"));
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
