/**
 * RoutePlannerRDDescriptionRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerRDDescriptionRequestType  implements java.io.Serializable {
    private int xfrom;

    private int yfrom;

    private int xto;

    private int yto;

    private java.lang.String routetype;

    private boolean english;

    public RoutePlannerRDDescriptionRequestType() {
    }

    public RoutePlannerRDDescriptionRequestType(
           int xfrom,
           int yfrom,
           int xto,
           int yto,
           java.lang.String routetype,
           boolean english) {
           this.xfrom = xfrom;
           this.yfrom = yfrom;
           this.xto = xto;
           this.yto = yto;
           this.routetype = routetype;
           this.english = english;
    }


    /**
     * Gets the xfrom value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @return xfrom
     */
    public int getXfrom() {
        return xfrom;
    }


    /**
     * Sets the xfrom value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @param xfrom
     */
    public void setXfrom(int xfrom) {
        this.xfrom = xfrom;
    }


    /**
     * Gets the yfrom value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @return yfrom
     */
    public int getYfrom() {
        return yfrom;
    }


    /**
     * Sets the yfrom value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @param yfrom
     */
    public void setYfrom(int yfrom) {
        this.yfrom = yfrom;
    }


    /**
     * Gets the xto value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @return xto
     */
    public int getXto() {
        return xto;
    }


    /**
     * Sets the xto value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @param xto
     */
    public void setXto(int xto) {
        this.xto = xto;
    }


    /**
     * Gets the yto value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @return yto
     */
    public int getYto() {
        return yto;
    }


    /**
     * Sets the yto value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @param yto
     */
    public void setYto(int yto) {
        this.yto = yto;
    }


    /**
     * Gets the routetype value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @return routetype
     */
    public java.lang.String getRoutetype() {
        return routetype;
    }


    /**
     * Sets the routetype value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @param routetype
     */
    public void setRoutetype(java.lang.String routetype) {
        this.routetype = routetype;
    }


    /**
     * Gets the english value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @return english
     */
    public boolean isEnglish() {
        return english;
    }


    /**
     * Sets the english value for this RoutePlannerRDDescriptionRequestType.
     * 
     * @param english
     */
    public void setEnglish(boolean english) {
        this.english = english;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerRDDescriptionRequestType)) return false;
        RoutePlannerRDDescriptionRequestType other = (RoutePlannerRDDescriptionRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.xfrom == other.getXfrom() &&
            this.yfrom == other.getYfrom() &&
            this.xto == other.getXto() &&
            this.yto == other.getYto() &&
            ((this.routetype==null && other.getRoutetype()==null) || 
             (this.routetype!=null &&
              this.routetype.equals(other.getRoutetype()))) &&
            this.english == other.isEnglish();
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
        _hashCode += getXfrom();
        _hashCode += getYfrom();
        _hashCode += getXto();
        _hashCode += getYto();
        if (getRoutetype() != null) {
            _hashCode += getRoutetype().hashCode();
        }
        _hashCode += (isEnglish() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerRDDescriptionRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerRDDescriptionRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "xfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "yfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "xto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "yto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("english");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "english"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
