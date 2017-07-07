/**
 * MapViewLatLonRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MapViewLatLonRequestType  implements java.io.Serializable {
    private float center_lat;

    private float center_lon;

    private nl.webservices.www.soap.LatLonCoordinates[] extra_latlon;

    private java.lang.String format;

    private int width;

    private int height;

    private float zoom;

    public MapViewLatLonRequestType() {
    }

    public MapViewLatLonRequestType(
           float center_lat,
           float center_lon,
           nl.webservices.www.soap.LatLonCoordinates[] extra_latlon,
           java.lang.String format,
           int width,
           int height,
           float zoom) {
           this.center_lat = center_lat;
           this.center_lon = center_lon;
           this.extra_latlon = extra_latlon;
           this.format = format;
           this.width = width;
           this.height = height;
           this.zoom = zoom;
    }


    /**
     * Gets the center_lat value for this MapViewLatLonRequestType.
     * 
     * @return center_lat
     */
    public float getCenter_lat() {
        return center_lat;
    }


    /**
     * Sets the center_lat value for this MapViewLatLonRequestType.
     * 
     * @param center_lat
     */
    public void setCenter_lat(float center_lat) {
        this.center_lat = center_lat;
    }


    /**
     * Gets the center_lon value for this MapViewLatLonRequestType.
     * 
     * @return center_lon
     */
    public float getCenter_lon() {
        return center_lon;
    }


    /**
     * Sets the center_lon value for this MapViewLatLonRequestType.
     * 
     * @param center_lon
     */
    public void setCenter_lon(float center_lon) {
        this.center_lon = center_lon;
    }


    /**
     * Gets the extra_latlon value for this MapViewLatLonRequestType.
     * 
     * @return extra_latlon
     */
    public nl.webservices.www.soap.LatLonCoordinates[] getExtra_latlon() {
        return extra_latlon;
    }


    /**
     * Sets the extra_latlon value for this MapViewLatLonRequestType.
     * 
     * @param extra_latlon
     */
    public void setExtra_latlon(nl.webservices.www.soap.LatLonCoordinates[] extra_latlon) {
        this.extra_latlon = extra_latlon;
    }


    /**
     * Gets the format value for this MapViewLatLonRequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this MapViewLatLonRequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the width value for this MapViewLatLonRequestType.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this MapViewLatLonRequestType.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this MapViewLatLonRequestType.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this MapViewLatLonRequestType.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the zoom value for this MapViewLatLonRequestType.
     * 
     * @return zoom
     */
    public float getZoom() {
        return zoom;
    }


    /**
     * Sets the zoom value for this MapViewLatLonRequestType.
     * 
     * @param zoom
     */
    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapViewLatLonRequestType)) return false;
        MapViewLatLonRequestType other = (MapViewLatLonRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.center_lat == other.getCenter_lat() &&
            this.center_lon == other.getCenter_lon() &&
            ((this.extra_latlon==null && other.getExtra_latlon()==null) || 
             (this.extra_latlon!=null &&
              java.util.Arrays.equals(this.extra_latlon, other.getExtra_latlon()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.width == other.getWidth() &&
            this.height == other.getHeight() &&
            this.zoom == other.getZoom();
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
        _hashCode += new Float(getCenter_lat()).hashCode();
        _hashCode += new Float(getCenter_lon()).hashCode();
        if (getExtra_latlon() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtra_latlon());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtra_latlon(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        _hashCode += getWidth();
        _hashCode += getHeight();
        _hashCode += new Float(getZoom()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapViewLatLonRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mapViewLatLonRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("center_lat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "center_lat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("center_lon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "center_lon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra_latlon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extra_latlon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "LatLonCoordinates"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "zoom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
