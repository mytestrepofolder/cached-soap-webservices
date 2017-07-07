/**
 * CarVWEListVersionsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEListVersionsRequestType  implements java.io.Serializable {
    private int production_year;

    private int kind_id;

    private int brand_id;

    private int model_id;

    private int fuel_type_id;

    private int body_style_id;

    private int doors;

    private int gear_id;

    private int page;

    public CarVWEListVersionsRequestType() {
    }

    public CarVWEListVersionsRequestType(
           int production_year,
           int kind_id,
           int brand_id,
           int model_id,
           int fuel_type_id,
           int body_style_id,
           int doors,
           int gear_id,
           int page) {
           this.production_year = production_year;
           this.kind_id = kind_id;
           this.brand_id = brand_id;
           this.model_id = model_id;
           this.fuel_type_id = fuel_type_id;
           this.body_style_id = body_style_id;
           this.doors = doors;
           this.gear_id = gear_id;
           this.page = page;
    }


    /**
     * Gets the production_year value for this CarVWEListVersionsRequestType.
     * 
     * @return production_year
     */
    public int getProduction_year() {
        return production_year;
    }


    /**
     * Sets the production_year value for this CarVWEListVersionsRequestType.
     * 
     * @param production_year
     */
    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }


    /**
     * Gets the kind_id value for this CarVWEListVersionsRequestType.
     * 
     * @return kind_id
     */
    public int getKind_id() {
        return kind_id;
    }


    /**
     * Sets the kind_id value for this CarVWEListVersionsRequestType.
     * 
     * @param kind_id
     */
    public void setKind_id(int kind_id) {
        this.kind_id = kind_id;
    }


    /**
     * Gets the brand_id value for this CarVWEListVersionsRequestType.
     * 
     * @return brand_id
     */
    public int getBrand_id() {
        return brand_id;
    }


    /**
     * Sets the brand_id value for this CarVWEListVersionsRequestType.
     * 
     * @param brand_id
     */
    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }


    /**
     * Gets the model_id value for this CarVWEListVersionsRequestType.
     * 
     * @return model_id
     */
    public int getModel_id() {
        return model_id;
    }


    /**
     * Sets the model_id value for this CarVWEListVersionsRequestType.
     * 
     * @param model_id
     */
    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }


    /**
     * Gets the fuel_type_id value for this CarVWEListVersionsRequestType.
     * 
     * @return fuel_type_id
     */
    public int getFuel_type_id() {
        return fuel_type_id;
    }


    /**
     * Sets the fuel_type_id value for this CarVWEListVersionsRequestType.
     * 
     * @param fuel_type_id
     */
    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }


    /**
     * Gets the body_style_id value for this CarVWEListVersionsRequestType.
     * 
     * @return body_style_id
     */
    public int getBody_style_id() {
        return body_style_id;
    }


    /**
     * Sets the body_style_id value for this CarVWEListVersionsRequestType.
     * 
     * @param body_style_id
     */
    public void setBody_style_id(int body_style_id) {
        this.body_style_id = body_style_id;
    }


    /**
     * Gets the doors value for this CarVWEListVersionsRequestType.
     * 
     * @return doors
     */
    public int getDoors() {
        return doors;
    }


    /**
     * Sets the doors value for this CarVWEListVersionsRequestType.
     * 
     * @param doors
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }


    /**
     * Gets the gear_id value for this CarVWEListVersionsRequestType.
     * 
     * @return gear_id
     */
    public int getGear_id() {
        return gear_id;
    }


    /**
     * Sets the gear_id value for this CarVWEListVersionsRequestType.
     * 
     * @param gear_id
     */
    public void setGear_id(int gear_id) {
        this.gear_id = gear_id;
    }


    /**
     * Gets the page value for this CarVWEListVersionsRequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this CarVWEListVersionsRequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEListVersionsRequestType)) return false;
        CarVWEListVersionsRequestType other = (CarVWEListVersionsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.production_year == other.getProduction_year() &&
            this.kind_id == other.getKind_id() &&
            this.brand_id == other.getBrand_id() &&
            this.model_id == other.getModel_id() &&
            this.fuel_type_id == other.getFuel_type_id() &&
            this.body_style_id == other.getBody_style_id() &&
            this.doors == other.getDoors() &&
            this.gear_id == other.getGear_id() &&
            this.page == other.getPage();
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
        _hashCode += getProduction_year();
        _hashCode += getKind_id();
        _hashCode += getBrand_id();
        _hashCode += getModel_id();
        _hashCode += getFuel_type_id();
        _hashCode += getBody_style_id();
        _hashCode += getDoors();
        _hashCode += getGear_id();
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEListVersionsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "carVWEListVersionsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("production_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "production_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kind_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuel_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fuel_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body_style_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "body_style_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "doors"));
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
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
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
