/**
 * MapViewInternationalLatLonRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MapViewInternationalLatLonRequestType  implements java.io.Serializable {
    private float latitude;

    private float longitude;

    private java.lang.String format;

    private int width;

    private int height;

    private float zoom;

    public MapViewInternationalLatLonRequestType() {
    }

    public MapViewInternationalLatLonRequestType(
           float latitude,
           float longitude,
           java.lang.String format,
           int width,
           int height,
           float zoom) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.format = format;
           this.width = width;
           this.height = height;
           this.zoom = zoom;
    }


    /**
     * Gets the latitude value for this MapViewInternationalLatLonRequestType.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this MapViewInternationalLatLonRequestType.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this MapViewInternationalLatLonRequestType.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this MapViewInternationalLatLonRequestType.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the format value for this MapViewInternationalLatLonRequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this MapViewInternationalLatLonRequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the width value for this MapViewInternationalLatLonRequestType.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this MapViewInternationalLatLonRequestType.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this MapViewInternationalLatLonRequestType.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this MapViewInternationalLatLonRequestType.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the zoom value for this MapViewInternationalLatLonRequestType.
     * 
     * @return zoom
     */
    public float getZoom() {
        return zoom;
    }


    /**
     * Sets the zoom value for this MapViewInternationalLatLonRequestType.
     * 
     * @param zoom
     */
    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapViewInternationalLatLonRequestType)) return false;
        MapViewInternationalLatLonRequestType other = (MapViewInternationalLatLonRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
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
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
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
        new org.apache.axis.description.TypeDesc(MapViewInternationalLatLonRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mapViewInternationalLatLonRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
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
