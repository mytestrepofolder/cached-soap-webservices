/**
 * CarOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarOption  implements java.io.Serializable {
    private java.lang.Boolean standaard;

    private java.lang.Integer pakket;

    private org.apache.axis.types.YearMonth standaard_sinds_datum;

    private java.lang.Integer prijs;

    public CarOption() {
    }

    public CarOption(
           java.lang.Boolean standaard,
           java.lang.Integer pakket,
           org.apache.axis.types.YearMonth standaard_sinds_datum,
           java.lang.Integer prijs) {
           this.standaard = standaard;
           this.pakket = pakket;
           this.standaard_sinds_datum = standaard_sinds_datum;
           this.prijs = prijs;
    }


    /**
     * Gets the standaard value for this CarOption.
     * 
     * @return standaard
     */
    public java.lang.Boolean getStandaard() {
        return standaard;
    }


    /**
     * Sets the standaard value for this CarOption.
     * 
     * @param standaard
     */
    public void setStandaard(java.lang.Boolean standaard) {
        this.standaard = standaard;
    }


    /**
     * Gets the pakket value for this CarOption.
     * 
     * @return pakket
     */
    public java.lang.Integer getPakket() {
        return pakket;
    }


    /**
     * Sets the pakket value for this CarOption.
     * 
     * @param pakket
     */
    public void setPakket(java.lang.Integer pakket) {
        this.pakket = pakket;
    }


    /**
     * Gets the standaard_sinds_datum value for this CarOption.
     * 
     * @return standaard_sinds_datum
     */
    public org.apache.axis.types.YearMonth getStandaard_sinds_datum() {
        return standaard_sinds_datum;
    }


    /**
     * Sets the standaard_sinds_datum value for this CarOption.
     * 
     * @param standaard_sinds_datum
     */
    public void setStandaard_sinds_datum(org.apache.axis.types.YearMonth standaard_sinds_datum) {
        this.standaard_sinds_datum = standaard_sinds_datum;
    }


    /**
     * Gets the prijs value for this CarOption.
     * 
     * @return prijs
     */
    public java.lang.Integer getPrijs() {
        return prijs;
    }


    /**
     * Sets the prijs value for this CarOption.
     * 
     * @param prijs
     */
    public void setPrijs(java.lang.Integer prijs) {
        this.prijs = prijs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarOption)) return false;
        CarOption other = (CarOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.standaard==null && other.getStandaard()==null) || 
             (this.standaard!=null &&
              this.standaard.equals(other.getStandaard()))) &&
            ((this.pakket==null && other.getPakket()==null) || 
             (this.pakket!=null &&
              this.pakket.equals(other.getPakket()))) &&
            ((this.standaard_sinds_datum==null && other.getStandaard_sinds_datum()==null) || 
             (this.standaard_sinds_datum!=null &&
              this.standaard_sinds_datum.equals(other.getStandaard_sinds_datum()))) &&
            ((this.prijs==null && other.getPrijs()==null) || 
             (this.prijs!=null &&
              this.prijs.equals(other.getPrijs())));
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
        if (getStandaard() != null) {
            _hashCode += getStandaard().hashCode();
        }
        if (getPakket() != null) {
            _hashCode += getPakket().hashCode();
        }
        if (getStandaard_sinds_datum() != null) {
            _hashCode += getStandaard_sinds_datum().hashCode();
        }
        if (getPrijs() != null) {
            _hashCode += getPrijs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standaard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "standaard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pakket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pakket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standaard_sinds_datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "standaard_sinds_datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prijs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "prijs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
