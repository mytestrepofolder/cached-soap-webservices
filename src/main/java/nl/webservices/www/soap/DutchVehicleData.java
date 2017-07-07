/**
 * DutchVehicleData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleData  implements java.io.Serializable {
    private java.lang.String license_plate;

    private java.lang.String location_vin_number;

    private java.lang.Integer catalog_price;

    private java.lang.String category;

    private java.lang.String brand_code;

    private java.lang.String brand;

    private java.lang.String model;

    private java.lang.String type;

    private java.lang.String body_style;

    private java.lang.String color;

    private java.lang.String secondary_color;

    public DutchVehicleData() {
    }

    public DutchVehicleData(
           java.lang.String license_plate,
           java.lang.String location_vin_number,
           java.lang.Integer catalog_price,
           java.lang.String category,
           java.lang.String brand_code,
           java.lang.String brand,
           java.lang.String model,
           java.lang.String type,
           java.lang.String body_style,
           java.lang.String color,
           java.lang.String secondary_color) {
           this.license_plate = license_plate;
           this.location_vin_number = location_vin_number;
           this.catalog_price = catalog_price;
           this.category = category;
           this.brand_code = brand_code;
           this.brand = brand;
           this.model = model;
           this.type = type;
           this.body_style = body_style;
           this.color = color;
           this.secondary_color = secondary_color;
    }


    /**
     * Gets the license_plate value for this DutchVehicleData.
     * 
     * @return license_plate
     */
    public java.lang.String getLicense_plate() {
        return license_plate;
    }


    /**
     * Sets the license_plate value for this DutchVehicleData.
     * 
     * @param license_plate
     */
    public void setLicense_plate(java.lang.String license_plate) {
        this.license_plate = license_plate;
    }


    /**
     * Gets the location_vin_number value for this DutchVehicleData.
     * 
     * @return location_vin_number
     */
    public java.lang.String getLocation_vin_number() {
        return location_vin_number;
    }


    /**
     * Sets the location_vin_number value for this DutchVehicleData.
     * 
     * @param location_vin_number
     */
    public void setLocation_vin_number(java.lang.String location_vin_number) {
        this.location_vin_number = location_vin_number;
    }


    /**
     * Gets the catalog_price value for this DutchVehicleData.
     * 
     * @return catalog_price
     */
    public java.lang.Integer getCatalog_price() {
        return catalog_price;
    }


    /**
     * Sets the catalog_price value for this DutchVehicleData.
     * 
     * @param catalog_price
     */
    public void setCatalog_price(java.lang.Integer catalog_price) {
        this.catalog_price = catalog_price;
    }


    /**
     * Gets the category value for this DutchVehicleData.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this DutchVehicleData.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the brand_code value for this DutchVehicleData.
     * 
     * @return brand_code
     */
    public java.lang.String getBrand_code() {
        return brand_code;
    }


    /**
     * Sets the brand_code value for this DutchVehicleData.
     * 
     * @param brand_code
     */
    public void setBrand_code(java.lang.String brand_code) {
        this.brand_code = brand_code;
    }


    /**
     * Gets the brand value for this DutchVehicleData.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this DutchVehicleData.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the model value for this DutchVehicleData.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this DutchVehicleData.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the type value for this DutchVehicleData.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DutchVehicleData.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the body_style value for this DutchVehicleData.
     * 
     * @return body_style
     */
    public java.lang.String getBody_style() {
        return body_style;
    }


    /**
     * Sets the body_style value for this DutchVehicleData.
     * 
     * @param body_style
     */
    public void setBody_style(java.lang.String body_style) {
        this.body_style = body_style;
    }


    /**
     * Gets the color value for this DutchVehicleData.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this DutchVehicleData.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the secondary_color value for this DutchVehicleData.
     * 
     * @return secondary_color
     */
    public java.lang.String getSecondary_color() {
        return secondary_color;
    }


    /**
     * Sets the secondary_color value for this DutchVehicleData.
     * 
     * @param secondary_color
     */
    public void setSecondary_color(java.lang.String secondary_color) {
        this.secondary_color = secondary_color;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleData)) return false;
        DutchVehicleData other = (DutchVehicleData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.license_plate==null && other.getLicense_plate()==null) || 
             (this.license_plate!=null &&
              this.license_plate.equals(other.getLicense_plate()))) &&
            ((this.location_vin_number==null && other.getLocation_vin_number()==null) || 
             (this.location_vin_number!=null &&
              this.location_vin_number.equals(other.getLocation_vin_number()))) &&
            ((this.catalog_price==null && other.getCatalog_price()==null) || 
             (this.catalog_price!=null &&
              this.catalog_price.equals(other.getCatalog_price()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.brand_code==null && other.getBrand_code()==null) || 
             (this.brand_code!=null &&
              this.brand_code.equals(other.getBrand_code()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.body_style==null && other.getBody_style()==null) || 
             (this.body_style!=null &&
              this.body_style.equals(other.getBody_style()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.secondary_color==null && other.getSecondary_color()==null) || 
             (this.secondary_color!=null &&
              this.secondary_color.equals(other.getSecondary_color())));
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
        if (getLicense_plate() != null) {
            _hashCode += getLicense_plate().hashCode();
        }
        if (getLocation_vin_number() != null) {
            _hashCode += getLocation_vin_number().hashCode();
        }
        if (getCatalog_price() != null) {
            _hashCode += getCatalog_price().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBrand_code() != null) {
            _hashCode += getBrand_code().hashCode();
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
        if (getBody_style() != null) {
            _hashCode += getBody_style().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getSecondary_color() != null) {
            _hashCode += getSecondary_color().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license_plate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "license_plate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_vin_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "location_vin_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "body_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary_color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "secondary_color"));
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
