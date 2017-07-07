/**
 * RoutePlannerEUMapRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerEUMapRequestType  implements java.io.Serializable {
    private float latitudefrom;

    private float longitudefrom;

    private float latitudeto;

    private float longitudeto;

    private java.lang.String routetype;

    private java.lang.String language;

    private java.lang.String format;

    private int width;

    private int height;

    private java.lang.String view;

    public RoutePlannerEUMapRequestType() {
    }

    public RoutePlannerEUMapRequestType(
           float latitudefrom,
           float longitudefrom,
           float latitudeto,
           float longitudeto,
           java.lang.String routetype,
           java.lang.String language,
           java.lang.String format,
           int width,
           int height,
           java.lang.String view) {
           this.latitudefrom = latitudefrom;
           this.longitudefrom = longitudefrom;
           this.latitudeto = latitudeto;
           this.longitudeto = longitudeto;
           this.routetype = routetype;
           this.language = language;
           this.format = format;
           this.width = width;
           this.height = height;
           this.view = view;
    }


    /**
     * Gets the latitudefrom value for this RoutePlannerEUMapRequestType.
     * 
     * @return latitudefrom
     */
    public float getLatitudefrom() {
        return latitudefrom;
    }


    /**
     * Sets the latitudefrom value for this RoutePlannerEUMapRequestType.
     * 
     * @param latitudefrom
     */
    public void setLatitudefrom(float latitudefrom) {
        this.latitudefrom = latitudefrom;
    }


    /**
     * Gets the longitudefrom value for this RoutePlannerEUMapRequestType.
     * 
     * @return longitudefrom
     */
    public float getLongitudefrom() {
        return longitudefrom;
    }


    /**
     * Sets the longitudefrom value for this RoutePlannerEUMapRequestType.
     * 
     * @param longitudefrom
     */
    public void setLongitudefrom(float longitudefrom) {
        this.longitudefrom = longitudefrom;
    }


    /**
     * Gets the latitudeto value for this RoutePlannerEUMapRequestType.
     * 
     * @return latitudeto
     */
    public float getLatitudeto() {
        return latitudeto;
    }


    /**
     * Sets the latitudeto value for this RoutePlannerEUMapRequestType.
     * 
     * @param latitudeto
     */
    public void setLatitudeto(float latitudeto) {
        this.latitudeto = latitudeto;
    }


    /**
     * Gets the longitudeto value for this RoutePlannerEUMapRequestType.
     * 
     * @return longitudeto
     */
    public float getLongitudeto() {
        return longitudeto;
    }


    /**
     * Sets the longitudeto value for this RoutePlannerEUMapRequestType.
     * 
     * @param longitudeto
     */
    public void setLongitudeto(float longitudeto) {
        this.longitudeto = longitudeto;
    }


    /**
     * Gets the routetype value for this RoutePlannerEUMapRequestType.
     * 
     * @return routetype
     */
    public java.lang.String getRoutetype() {
        return routetype;
    }


    /**
     * Sets the routetype value for this RoutePlannerEUMapRequestType.
     * 
     * @param routetype
     */
    public void setRoutetype(java.lang.String routetype) {
        this.routetype = routetype;
    }


    /**
     * Gets the language value for this RoutePlannerEUMapRequestType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RoutePlannerEUMapRequestType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the format value for this RoutePlannerEUMapRequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RoutePlannerEUMapRequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the width value for this RoutePlannerEUMapRequestType.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RoutePlannerEUMapRequestType.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this RoutePlannerEUMapRequestType.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this RoutePlannerEUMapRequestType.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the view value for this RoutePlannerEUMapRequestType.
     * 
     * @return view
     */
    public java.lang.String getView() {
        return view;
    }


    /**
     * Sets the view value for this RoutePlannerEUMapRequestType.
     * 
     * @param view
     */
    public void setView(java.lang.String view) {
        this.view = view;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerEUMapRequestType)) return false;
        RoutePlannerEUMapRequestType other = (RoutePlannerEUMapRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitudefrom == other.getLatitudefrom() &&
            this.longitudefrom == other.getLongitudefrom() &&
            this.latitudeto == other.getLatitudeto() &&
            this.longitudeto == other.getLongitudeto() &&
            ((this.routetype==null && other.getRoutetype()==null) || 
             (this.routetype!=null &&
              this.routetype.equals(other.getRoutetype()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.width == other.getWidth() &&
            this.height == other.getHeight() &&
            ((this.view==null && other.getView()==null) || 
             (this.view!=null &&
              this.view.equals(other.getView())));
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
        _hashCode += new Float(getLatitudefrom()).hashCode();
        _hashCode += new Float(getLongitudefrom()).hashCode();
        _hashCode += new Float(getLatitudeto()).hashCode();
        _hashCode += new Float(getLongitudeto()).hashCode();
        if (getRoutetype() != null) {
            _hashCode += getRoutetype().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        _hashCode += getWidth();
        _hashCode += getHeight();
        if (getView() != null) {
            _hashCode += getView().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerEUMapRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerEUMapRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitudefrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitudefrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "latitudeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudeto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "longitudeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("view");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "view"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
