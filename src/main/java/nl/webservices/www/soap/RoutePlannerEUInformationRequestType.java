/**
 * RoutePlannerEUInformationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerEUInformationRequestType  implements java.io.Serializable {
    private float latitudefrom;

    private float longitudefrom;

    private float latitudeto;

    private float longitudeto;

    private java.lang.String routetype;

    public RoutePlannerEUInformationRequestType() {
    }

    public RoutePlannerEUInformationRequestType(
           float latitudefrom,
           float longitudefrom,
           float latitudeto,
           float longitudeto,
           java.lang.String routetype) {
           this.latitudefrom = latitudefrom;
           this.longitudefrom = longitudefrom;
           this.latitudeto = latitudeto;
           this.longitudeto = longitudeto;
           this.routetype = routetype;
    }


    /**
     * Gets the latitudefrom value for this RoutePlannerEUInformationRequestType.
     * 
     * @return latitudefrom
     */
    public float getLatitudefrom() {
        return latitudefrom;
    }


    /**
     * Sets the latitudefrom value for this RoutePlannerEUInformationRequestType.
     * 
     * @param latitudefrom
     */
    public void setLatitudefrom(float latitudefrom) {
        this.latitudefrom = latitudefrom;
    }


    /**
     * Gets the longitudefrom value for this RoutePlannerEUInformationRequestType.
     * 
     * @return longitudefrom
     */
    public float getLongitudefrom() {
        return longitudefrom;
    }


    /**
     * Sets the longitudefrom value for this RoutePlannerEUInformationRequestType.
     * 
     * @param longitudefrom
     */
    public void setLongitudefrom(float longitudefrom) {
        this.longitudefrom = longitudefrom;
    }


    /**
     * Gets the latitudeto value for this RoutePlannerEUInformationRequestType.
     * 
     * @return latitudeto
     */
    public float getLatitudeto() {
        return latitudeto;
    }


    /**
     * Sets the latitudeto value for this RoutePlannerEUInformationRequestType.
     * 
     * @param latitudeto
     */
    public void setLatitudeto(float latitudeto) {
        this.latitudeto = latitudeto;
    }


    /**
     * Gets the longitudeto value for this RoutePlannerEUInformationRequestType.
     * 
     * @return longitudeto
     */
    public float getLongitudeto() {
        return longitudeto;
    }


    /**
     * Sets the longitudeto value for this RoutePlannerEUInformationRequestType.
     * 
     * @param longitudeto
     */
    public void setLongitudeto(float longitudeto) {
        this.longitudeto = longitudeto;
    }


    /**
     * Gets the routetype value for this RoutePlannerEUInformationRequestType.
     * 
     * @return routetype
     */
    public java.lang.String getRoutetype() {
        return routetype;
    }


    /**
     * Sets the routetype value for this RoutePlannerEUInformationRequestType.
     * 
     * @param routetype
     */
    public void setRoutetype(java.lang.String routetype) {
        this.routetype = routetype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerEUInformationRequestType)) return false;
        RoutePlannerEUInformationRequestType other = (RoutePlannerEUInformationRequestType) obj;
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
              this.routetype.equals(other.getRoutetype())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerEUInformationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerEUInformationRequestType"));
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
