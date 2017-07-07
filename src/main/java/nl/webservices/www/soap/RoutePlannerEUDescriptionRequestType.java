/**
 * RoutePlannerEUDescriptionRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerEUDescriptionRequestType  implements java.io.Serializable {
    private float latitudefrom;

    private float longitudefrom;

    private float latitudeto;

    private float longitudeto;

    private java.lang.String routetype;

    private java.lang.String language;

    public RoutePlannerEUDescriptionRequestType() {
    }

    public RoutePlannerEUDescriptionRequestType(
           float latitudefrom,
           float longitudefrom,
           float latitudeto,
           float longitudeto,
           java.lang.String routetype,
           java.lang.String language) {
           this.latitudefrom = latitudefrom;
           this.longitudefrom = longitudefrom;
           this.latitudeto = latitudeto;
           this.longitudeto = longitudeto;
           this.routetype = routetype;
           this.language = language;
    }


    /**
     * Gets the latitudefrom value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @return latitudefrom
     */
    public float getLatitudefrom() {
        return latitudefrom;
    }


    /**
     * Sets the latitudefrom value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @param latitudefrom
     */
    public void setLatitudefrom(float latitudefrom) {
        this.latitudefrom = latitudefrom;
    }


    /**
     * Gets the longitudefrom value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @return longitudefrom
     */
    public float getLongitudefrom() {
        return longitudefrom;
    }


    /**
     * Sets the longitudefrom value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @param longitudefrom
     */
    public void setLongitudefrom(float longitudefrom) {
        this.longitudefrom = longitudefrom;
    }


    /**
     * Gets the latitudeto value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @return latitudeto
     */
    public float getLatitudeto() {
        return latitudeto;
    }


    /**
     * Sets the latitudeto value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @param latitudeto
     */
    public void setLatitudeto(float latitudeto) {
        this.latitudeto = latitudeto;
    }


    /**
     * Gets the longitudeto value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @return longitudeto
     */
    public float getLongitudeto() {
        return longitudeto;
    }


    /**
     * Sets the longitudeto value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @param longitudeto
     */
    public void setLongitudeto(float longitudeto) {
        this.longitudeto = longitudeto;
    }


    /**
     * Gets the routetype value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @return routetype
     */
    public java.lang.String getRoutetype() {
        return routetype;
    }


    /**
     * Sets the routetype value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @param routetype
     */
    public void setRoutetype(java.lang.String routetype) {
        this.routetype = routetype;
    }


    /**
     * Gets the language value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RoutePlannerEUDescriptionRequestType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerEUDescriptionRequestType)) return false;
        RoutePlannerEUDescriptionRequestType other = (RoutePlannerEUDescriptionRequestType) obj;
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
              this.language.equals(other.getLanguage())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerEUDescriptionRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerEUDescriptionRequestType"));
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
