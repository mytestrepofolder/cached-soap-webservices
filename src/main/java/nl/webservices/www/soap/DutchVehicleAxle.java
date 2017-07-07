/**
 * DutchVehicleAxle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleAxle  implements java.io.Serializable {
    private java.lang.Integer number;

    private java.lang.Boolean indication_driven_axle;

    private java.lang.Boolean indication_bogie_lift;

    private java.lang.Integer max_axle_load;

    private java.lang.Integer max_axle_load_technical;

    private java.lang.String location_code;

    private java.lang.Integer track_width;

    private java.lang.String road_behavior_code;

    private java.lang.String road_behavior_description;

    public DutchVehicleAxle() {
    }

    public DutchVehicleAxle(
           java.lang.Integer number,
           java.lang.Boolean indication_driven_axle,
           java.lang.Boolean indication_bogie_lift,
           java.lang.Integer max_axle_load,
           java.lang.Integer max_axle_load_technical,
           java.lang.String location_code,
           java.lang.Integer track_width,
           java.lang.String road_behavior_code,
           java.lang.String road_behavior_description) {
           this.number = number;
           this.indication_driven_axle = indication_driven_axle;
           this.indication_bogie_lift = indication_bogie_lift;
           this.max_axle_load = max_axle_load;
           this.max_axle_load_technical = max_axle_load_technical;
           this.location_code = location_code;
           this.track_width = track_width;
           this.road_behavior_code = road_behavior_code;
           this.road_behavior_description = road_behavior_description;
    }


    /**
     * Gets the number value for this DutchVehicleAxle.
     * 
     * @return number
     */
    public java.lang.Integer getNumber() {
        return number;
    }


    /**
     * Sets the number value for this DutchVehicleAxle.
     * 
     * @param number
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }


    /**
     * Gets the indication_driven_axle value for this DutchVehicleAxle.
     * 
     * @return indication_driven_axle
     */
    public java.lang.Boolean getIndication_driven_axle() {
        return indication_driven_axle;
    }


    /**
     * Sets the indication_driven_axle value for this DutchVehicleAxle.
     * 
     * @param indication_driven_axle
     */
    public void setIndication_driven_axle(java.lang.Boolean indication_driven_axle) {
        this.indication_driven_axle = indication_driven_axle;
    }


    /**
     * Gets the indication_bogie_lift value for this DutchVehicleAxle.
     * 
     * @return indication_bogie_lift
     */
    public java.lang.Boolean getIndication_bogie_lift() {
        return indication_bogie_lift;
    }


    /**
     * Sets the indication_bogie_lift value for this DutchVehicleAxle.
     * 
     * @param indication_bogie_lift
     */
    public void setIndication_bogie_lift(java.lang.Boolean indication_bogie_lift) {
        this.indication_bogie_lift = indication_bogie_lift;
    }


    /**
     * Gets the max_axle_load value for this DutchVehicleAxle.
     * 
     * @return max_axle_load
     */
    public java.lang.Integer getMax_axle_load() {
        return max_axle_load;
    }


    /**
     * Sets the max_axle_load value for this DutchVehicleAxle.
     * 
     * @param max_axle_load
     */
    public void setMax_axle_load(java.lang.Integer max_axle_load) {
        this.max_axle_load = max_axle_load;
    }


    /**
     * Gets the max_axle_load_technical value for this DutchVehicleAxle.
     * 
     * @return max_axle_load_technical
     */
    public java.lang.Integer getMax_axle_load_technical() {
        return max_axle_load_technical;
    }


    /**
     * Sets the max_axle_load_technical value for this DutchVehicleAxle.
     * 
     * @param max_axle_load_technical
     */
    public void setMax_axle_load_technical(java.lang.Integer max_axle_load_technical) {
        this.max_axle_load_technical = max_axle_load_technical;
    }


    /**
     * Gets the location_code value for this DutchVehicleAxle.
     * 
     * @return location_code
     */
    public java.lang.String getLocation_code() {
        return location_code;
    }


    /**
     * Sets the location_code value for this DutchVehicleAxle.
     * 
     * @param location_code
     */
    public void setLocation_code(java.lang.String location_code) {
        this.location_code = location_code;
    }


    /**
     * Gets the track_width value for this DutchVehicleAxle.
     * 
     * @return track_width
     */
    public java.lang.Integer getTrack_width() {
        return track_width;
    }


    /**
     * Sets the track_width value for this DutchVehicleAxle.
     * 
     * @param track_width
     */
    public void setTrack_width(java.lang.Integer track_width) {
        this.track_width = track_width;
    }


    /**
     * Gets the road_behavior_code value for this DutchVehicleAxle.
     * 
     * @return road_behavior_code
     */
    public java.lang.String getRoad_behavior_code() {
        return road_behavior_code;
    }


    /**
     * Sets the road_behavior_code value for this DutchVehicleAxle.
     * 
     * @param road_behavior_code
     */
    public void setRoad_behavior_code(java.lang.String road_behavior_code) {
        this.road_behavior_code = road_behavior_code;
    }


    /**
     * Gets the road_behavior_description value for this DutchVehicleAxle.
     * 
     * @return road_behavior_description
     */
    public java.lang.String getRoad_behavior_description() {
        return road_behavior_description;
    }


    /**
     * Sets the road_behavior_description value for this DutchVehicleAxle.
     * 
     * @param road_behavior_description
     */
    public void setRoad_behavior_description(java.lang.String road_behavior_description) {
        this.road_behavior_description = road_behavior_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleAxle)) return false;
        DutchVehicleAxle other = (DutchVehicleAxle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.indication_driven_axle==null && other.getIndication_driven_axle()==null) || 
             (this.indication_driven_axle!=null &&
              this.indication_driven_axle.equals(other.getIndication_driven_axle()))) &&
            ((this.indication_bogie_lift==null && other.getIndication_bogie_lift()==null) || 
             (this.indication_bogie_lift!=null &&
              this.indication_bogie_lift.equals(other.getIndication_bogie_lift()))) &&
            ((this.max_axle_load==null && other.getMax_axle_load()==null) || 
             (this.max_axle_load!=null &&
              this.max_axle_load.equals(other.getMax_axle_load()))) &&
            ((this.max_axle_load_technical==null && other.getMax_axle_load_technical()==null) || 
             (this.max_axle_load_technical!=null &&
              this.max_axle_load_technical.equals(other.getMax_axle_load_technical()))) &&
            ((this.location_code==null && other.getLocation_code()==null) || 
             (this.location_code!=null &&
              this.location_code.equals(other.getLocation_code()))) &&
            ((this.track_width==null && other.getTrack_width()==null) || 
             (this.track_width!=null &&
              this.track_width.equals(other.getTrack_width()))) &&
            ((this.road_behavior_code==null && other.getRoad_behavior_code()==null) || 
             (this.road_behavior_code!=null &&
              this.road_behavior_code.equals(other.getRoad_behavior_code()))) &&
            ((this.road_behavior_description==null && other.getRoad_behavior_description()==null) || 
             (this.road_behavior_description!=null &&
              this.road_behavior_description.equals(other.getRoad_behavior_description())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getIndication_driven_axle() != null) {
            _hashCode += getIndication_driven_axle().hashCode();
        }
        if (getIndication_bogie_lift() != null) {
            _hashCode += getIndication_bogie_lift().hashCode();
        }
        if (getMax_axle_load() != null) {
            _hashCode += getMax_axle_load().hashCode();
        }
        if (getMax_axle_load_technical() != null) {
            _hashCode += getMax_axle_load_technical().hashCode();
        }
        if (getLocation_code() != null) {
            _hashCode += getLocation_code().hashCode();
        }
        if (getTrack_width() != null) {
            _hashCode += getTrack_width().hashCode();
        }
        if (getRoad_behavior_code() != null) {
            _hashCode += getRoad_behavior_code().hashCode();
        }
        if (getRoad_behavior_description() != null) {
            _hashCode += getRoad_behavior_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleAxle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleAxle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_driven_axle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_driven_axle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_bogie_lift");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indication_bogie_lift"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_axle_load");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "max_axle_load"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_axle_load_technical");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "max_axle_load_technical"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "location_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track_width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "track_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("road_behavior_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "road_behavior_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("road_behavior_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "road_behavior_description"));
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
