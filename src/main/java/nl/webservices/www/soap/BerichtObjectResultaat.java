/**
 * BerichtObjectResultaat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BerichtObjectResultaat  implements java.io.Serializable {
    private nl.webservices.www.soap.Overzicht overzicht;

    private nl.webservices.www.soap.BerichtObject eigendomsbericht;

    public BerichtObjectResultaat() {
    }

    public BerichtObjectResultaat(
           nl.webservices.www.soap.Overzicht overzicht,
           nl.webservices.www.soap.BerichtObject eigendomsbericht) {
           this.overzicht = overzicht;
           this.eigendomsbericht = eigendomsbericht;
    }


    /**
     * Gets the overzicht value for this BerichtObjectResultaat.
     * 
     * @return overzicht
     */
    public nl.webservices.www.soap.Overzicht getOverzicht() {
        return overzicht;
    }


    /**
     * Sets the overzicht value for this BerichtObjectResultaat.
     * 
     * @param overzicht
     */
    public void setOverzicht(nl.webservices.www.soap.Overzicht overzicht) {
        this.overzicht = overzicht;
    }


    /**
     * Gets the eigendomsbericht value for this BerichtObjectResultaat.
     * 
     * @return eigendomsbericht
     */
    public nl.webservices.www.soap.BerichtObject getEigendomsbericht() {
        return eigendomsbericht;
    }


    /**
     * Sets the eigendomsbericht value for this BerichtObjectResultaat.
     * 
     * @param eigendomsbericht
     */
    public void setEigendomsbericht(nl.webservices.www.soap.BerichtObject eigendomsbericht) {
        this.eigendomsbericht = eigendomsbericht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BerichtObjectResultaat)) return false;
        BerichtObjectResultaat other = (BerichtObjectResultaat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overzicht==null && other.getOverzicht()==null) || 
             (this.overzicht!=null &&
              this.overzicht.equals(other.getOverzicht()))) &&
            ((this.eigendomsbericht==null && other.getEigendomsbericht()==null) || 
             (this.eigendomsbericht!=null &&
              this.eigendomsbericht.equals(other.getEigendomsbericht())));
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
        if (getOverzicht() != null) {
            _hashCode += getOverzicht().hashCode();
        }
        if (getEigendomsbericht() != null) {
            _hashCode += getEigendomsbericht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BerichtObjectResultaat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BerichtObjectResultaat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overzicht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "overzicht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Overzicht"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eigendomsbericht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "eigendomsbericht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BerichtObject"));
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
