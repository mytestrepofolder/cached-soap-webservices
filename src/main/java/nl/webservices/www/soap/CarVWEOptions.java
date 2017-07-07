/**
 * CarVWEOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEOptions  implements java.io.Serializable {
    private nl.webservices.www.soap.CarVWEOptionsStandard options_standard;

    private nl.webservices.www.soap.CarVWEOptionsManufacture options_manufacture;

    private nl.webservices.www.soap.CarVWEOptionsPackage options_package;

    public CarVWEOptions() {
    }

    public CarVWEOptions(
           nl.webservices.www.soap.CarVWEOptionsStandard options_standard,
           nl.webservices.www.soap.CarVWEOptionsManufacture options_manufacture,
           nl.webservices.www.soap.CarVWEOptionsPackage options_package) {
           this.options_standard = options_standard;
           this.options_manufacture = options_manufacture;
           this.options_package = options_package;
    }


    /**
     * Gets the options_standard value for this CarVWEOptions.
     * 
     * @return options_standard
     */
    public nl.webservices.www.soap.CarVWEOptionsStandard getOptions_standard() {
        return options_standard;
    }


    /**
     * Sets the options_standard value for this CarVWEOptions.
     * 
     * @param options_standard
     */
    public void setOptions_standard(nl.webservices.www.soap.CarVWEOptionsStandard options_standard) {
        this.options_standard = options_standard;
    }


    /**
     * Gets the options_manufacture value for this CarVWEOptions.
     * 
     * @return options_manufacture
     */
    public nl.webservices.www.soap.CarVWEOptionsManufacture getOptions_manufacture() {
        return options_manufacture;
    }


    /**
     * Sets the options_manufacture value for this CarVWEOptions.
     * 
     * @param options_manufacture
     */
    public void setOptions_manufacture(nl.webservices.www.soap.CarVWEOptionsManufacture options_manufacture) {
        this.options_manufacture = options_manufacture;
    }


    /**
     * Gets the options_package value for this CarVWEOptions.
     * 
     * @return options_package
     */
    public nl.webservices.www.soap.CarVWEOptionsPackage getOptions_package() {
        return options_package;
    }


    /**
     * Sets the options_package value for this CarVWEOptions.
     * 
     * @param options_package
     */
    public void setOptions_package(nl.webservices.www.soap.CarVWEOptionsPackage options_package) {
        this.options_package = options_package;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEOptions)) return false;
        CarVWEOptions other = (CarVWEOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.options_standard==null && other.getOptions_standard()==null) || 
             (this.options_standard!=null &&
              this.options_standard.equals(other.getOptions_standard()))) &&
            ((this.options_manufacture==null && other.getOptions_manufacture()==null) || 
             (this.options_manufacture!=null &&
              this.options_manufacture.equals(other.getOptions_manufacture()))) &&
            ((this.options_package==null && other.getOptions_package()==null) || 
             (this.options_package!=null &&
              this.options_package.equals(other.getOptions_package())));
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
        if (getOptions_standard() != null) {
            _hashCode += getOptions_standard().hashCode();
        }
        if (getOptions_manufacture() != null) {
            _hashCode += getOptions_manufacture().hashCode();
        }
        if (getOptions_package() != null) {
            _hashCode += getOptions_package().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options_standard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "options_standard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptionsStandard"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options_manufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "options_manufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptionsManufacture"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options_package");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "options_package"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptionsPackage"));
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
