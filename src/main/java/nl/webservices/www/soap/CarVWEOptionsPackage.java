/**
 * CarVWEOptionsPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEOptionsPackage  implements java.io.Serializable {
    private java.lang.String license_plate;

    private int atl_code;

    private nl.webservices.www.soap.CarVWEOptionPackage[] packages;

    public CarVWEOptionsPackage() {
    }

    public CarVWEOptionsPackage(
           java.lang.String license_plate,
           int atl_code,
           nl.webservices.www.soap.CarVWEOptionPackage[] packages) {
           this.license_plate = license_plate;
           this.atl_code = atl_code;
           this.packages = packages;
    }


    /**
     * Gets the license_plate value for this CarVWEOptionsPackage.
     * 
     * @return license_plate
     */
    public java.lang.String getLicense_plate() {
        return license_plate;
    }


    /**
     * Sets the license_plate value for this CarVWEOptionsPackage.
     * 
     * @param license_plate
     */
    public void setLicense_plate(java.lang.String license_plate) {
        this.license_plate = license_plate;
    }


    /**
     * Gets the atl_code value for this CarVWEOptionsPackage.
     * 
     * @return atl_code
     */
    public int getAtl_code() {
        return atl_code;
    }


    /**
     * Sets the atl_code value for this CarVWEOptionsPackage.
     * 
     * @param atl_code
     */
    public void setAtl_code(int atl_code) {
        this.atl_code = atl_code;
    }


    /**
     * Gets the packages value for this CarVWEOptionsPackage.
     * 
     * @return packages
     */
    public nl.webservices.www.soap.CarVWEOptionPackage[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this CarVWEOptionsPackage.
     * 
     * @param packages
     */
    public void setPackages(nl.webservices.www.soap.CarVWEOptionPackage[] packages) {
        this.packages = packages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEOptionsPackage)) return false;
        CarVWEOptionsPackage other = (CarVWEOptionsPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.license_plate==null && other.getLicense_plate()==null) || 
             (this.license_plate!=null &&
              this.license_plate.equals(other.getLicense_plate()))) &&
            this.atl_code == other.getAtl_code() &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              java.util.Arrays.equals(this.packages, other.getPackages())));
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
        if (getLicense_plate() != null) {
            _hashCode += getLicense_plate().hashCode();
        }
        _hashCode += getAtl_code();
        if (getPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEOptionsPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptionsPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license_plate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "license_plate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atl_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "atl_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptionPackage"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
