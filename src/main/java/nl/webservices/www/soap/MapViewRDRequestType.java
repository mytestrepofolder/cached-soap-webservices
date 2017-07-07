/**
 * MapViewRDRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MapViewRDRequestType  implements java.io.Serializable {
    private int center_x;

    private int center_y;

    private nl.webservices.www.soap.RDCoordinates[] extra_xy;

    private java.lang.String format;

    private int width;

    private int height;

    private float zoom;

    public MapViewRDRequestType() {
    }

    public MapViewRDRequestType(
           int center_x,
           int center_y,
           nl.webservices.www.soap.RDCoordinates[] extra_xy,
           java.lang.String format,
           int width,
           int height,
           float zoom) {
           this.center_x = center_x;
           this.center_y = center_y;
           this.extra_xy = extra_xy;
           this.format = format;
           this.width = width;
           this.height = height;
           this.zoom = zoom;
    }


    /**
     * Gets the center_x value for this MapViewRDRequestType.
     * 
     * @return center_x
     */
    public int getCenter_x() {
        return center_x;
    }


    /**
     * Sets the center_x value for this MapViewRDRequestType.
     * 
     * @param center_x
     */
    public void setCenter_x(int center_x) {
        this.center_x = center_x;
    }


    /**
     * Gets the center_y value for this MapViewRDRequestType.
     * 
     * @return center_y
     */
    public int getCenter_y() {
        return center_y;
    }


    /**
     * Sets the center_y value for this MapViewRDRequestType.
     * 
     * @param center_y
     */
    public void setCenter_y(int center_y) {
        this.center_y = center_y;
    }


    /**
     * Gets the extra_xy value for this MapViewRDRequestType.
     * 
     * @return extra_xy
     */
    public nl.webservices.www.soap.RDCoordinates[] getExtra_xy() {
        return extra_xy;
    }


    /**
     * Sets the extra_xy value for this MapViewRDRequestType.
     * 
     * @param extra_xy
     */
    public void setExtra_xy(nl.webservices.www.soap.RDCoordinates[] extra_xy) {
        this.extra_xy = extra_xy;
    }


    /**
     * Gets the format value for this MapViewRDRequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this MapViewRDRequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the width value for this MapViewRDRequestType.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this MapViewRDRequestType.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this MapViewRDRequestType.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this MapViewRDRequestType.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the zoom value for this MapViewRDRequestType.
     * 
     * @return zoom
     */
    public float getZoom() {
        return zoom;
    }


    /**
     * Sets the zoom value for this MapViewRDRequestType.
     * 
     * @param zoom
     */
    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapViewRDRequestType)) return false;
        MapViewRDRequestType other = (MapViewRDRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.center_x == other.getCenter_x() &&
            this.center_y == other.getCenter_y() &&
            ((this.extra_xy==null && other.getExtra_xy()==null) || 
             (this.extra_xy!=null &&
              java.util.Arrays.equals(this.extra_xy, other.getExtra_xy()))) &&
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
        _hashCode += getCenter_x();
        _hashCode += getCenter_y();
        if (getExtra_xy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtra_xy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtra_xy(), i);
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
        new org.apache.axis.description.TypeDesc(MapViewRDRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mapViewRDRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("center_x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "center_x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("center_y");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "center_y"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra_xy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extra_xy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RDCoordinates"));
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
