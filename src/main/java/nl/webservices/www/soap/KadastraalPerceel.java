/**
 * KadastraalPerceel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadastraalPerceel  implements java.io.Serializable {
    private java.lang.String x_coordinaat;

    private java.lang.String y_coordinaat;

    private java.lang.String grootte_perceel;

    private boolean indicatie_grootte_geschat;

    public KadastraalPerceel() {
    }

    public KadastraalPerceel(
           java.lang.String x_coordinaat,
           java.lang.String y_coordinaat,
           java.lang.String grootte_perceel,
           boolean indicatie_grootte_geschat) {
           this.x_coordinaat = x_coordinaat;
           this.y_coordinaat = y_coordinaat;
           this.grootte_perceel = grootte_perceel;
           this.indicatie_grootte_geschat = indicatie_grootte_geschat;
    }


    /**
     * Gets the x_coordinaat value for this KadastraalPerceel.
     * 
     * @return x_coordinaat
     */
    public java.lang.String getX_coordinaat() {
        return x_coordinaat;
    }


    /**
     * Sets the x_coordinaat value for this KadastraalPerceel.
     * 
     * @param x_coordinaat
     */
    public void setX_coordinaat(java.lang.String x_coordinaat) {
        this.x_coordinaat = x_coordinaat;
    }


    /**
     * Gets the y_coordinaat value for this KadastraalPerceel.
     * 
     * @return y_coordinaat
     */
    public java.lang.String getY_coordinaat() {
        return y_coordinaat;
    }


    /**
     * Sets the y_coordinaat value for this KadastraalPerceel.
     * 
     * @param y_coordinaat
     */
    public void setY_coordinaat(java.lang.String y_coordinaat) {
        this.y_coordinaat = y_coordinaat;
    }


    /**
     * Gets the grootte_perceel value for this KadastraalPerceel.
     * 
     * @return grootte_perceel
     */
    public java.lang.String getGrootte_perceel() {
        return grootte_perceel;
    }


    /**
     * Sets the grootte_perceel value for this KadastraalPerceel.
     * 
     * @param grootte_perceel
     */
    public void setGrootte_perceel(java.lang.String grootte_perceel) {
        this.grootte_perceel = grootte_perceel;
    }


    /**
     * Gets the indicatie_grootte_geschat value for this KadastraalPerceel.
     * 
     * @return indicatie_grootte_geschat
     */
    public boolean isIndicatie_grootte_geschat() {
        return indicatie_grootte_geschat;
    }


    /**
     * Sets the indicatie_grootte_geschat value for this KadastraalPerceel.
     * 
     * @param indicatie_grootte_geschat
     */
    public void setIndicatie_grootte_geschat(boolean indicatie_grootte_geschat) {
        this.indicatie_grootte_geschat = indicatie_grootte_geschat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadastraalPerceel)) return false;
        KadastraalPerceel other = (KadastraalPerceel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.x_coordinaat==null && other.getX_coordinaat()==null) || 
             (this.x_coordinaat!=null &&
              this.x_coordinaat.equals(other.getX_coordinaat()))) &&
            ((this.y_coordinaat==null && other.getY_coordinaat()==null) || 
             (this.y_coordinaat!=null &&
              this.y_coordinaat.equals(other.getY_coordinaat()))) &&
            ((this.grootte_perceel==null && other.getGrootte_perceel()==null) || 
             (this.grootte_perceel!=null &&
              this.grootte_perceel.equals(other.getGrootte_perceel()))) &&
            this.indicatie_grootte_geschat == other.isIndicatie_grootte_geschat();
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
        if (getX_coordinaat() != null) {
            _hashCode += getX_coordinaat().hashCode();
        }
        if (getY_coordinaat() != null) {
            _hashCode += getY_coordinaat().hashCode();
        }
        if (getGrootte_perceel() != null) {
            _hashCode += getGrootte_perceel().hashCode();
        }
        _hashCode += (isIndicatie_grootte_geschat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadastraalPerceel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraalPerceel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x_coordinaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "x_coordinaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("y_coordinaat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "y_coordinaat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grootte_perceel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "grootte_perceel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_grootte_geschat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_grootte_geschat"));
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
