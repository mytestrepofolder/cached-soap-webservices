/**
 * DutchBusinessFormattedAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessFormattedAddress  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchBusinessAddressV3 original;

    private nl.webservices.www.soap.DutchBusinessAddressV3 official;

    private nl.webservices.www.soap.DutchBusinessAddressV3 formatted;

    public DutchBusinessFormattedAddress() {
    }

    public DutchBusinessFormattedAddress(
           nl.webservices.www.soap.DutchBusinessAddressV3 original,
           nl.webservices.www.soap.DutchBusinessAddressV3 official,
           nl.webservices.www.soap.DutchBusinessAddressV3 formatted) {
           this.original = original;
           this.official = official;
           this.formatted = formatted;
    }


    /**
     * Gets the original value for this DutchBusinessFormattedAddress.
     * 
     * @return original
     */
    public nl.webservices.www.soap.DutchBusinessAddressV3 getOriginal() {
        return original;
    }


    /**
     * Sets the original value for this DutchBusinessFormattedAddress.
     * 
     * @param original
     */
    public void setOriginal(nl.webservices.www.soap.DutchBusinessAddressV3 original) {
        this.original = original;
    }


    /**
     * Gets the official value for this DutchBusinessFormattedAddress.
     * 
     * @return official
     */
    public nl.webservices.www.soap.DutchBusinessAddressV3 getOfficial() {
        return official;
    }


    /**
     * Sets the official value for this DutchBusinessFormattedAddress.
     * 
     * @param official
     */
    public void setOfficial(nl.webservices.www.soap.DutchBusinessAddressV3 official) {
        this.official = official;
    }


    /**
     * Gets the formatted value for this DutchBusinessFormattedAddress.
     * 
     * @return formatted
     */
    public nl.webservices.www.soap.DutchBusinessAddressV3 getFormatted() {
        return formatted;
    }


    /**
     * Sets the formatted value for this DutchBusinessFormattedAddress.
     * 
     * @param formatted
     */
    public void setFormatted(nl.webservices.www.soap.DutchBusinessAddressV3 formatted) {
        this.formatted = formatted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessFormattedAddress)) return false;
        DutchBusinessFormattedAddress other = (DutchBusinessFormattedAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.original==null && other.getOriginal()==null) || 
             (this.original!=null &&
              this.original.equals(other.getOriginal()))) &&
            ((this.official==null && other.getOfficial()==null) || 
             (this.official!=null &&
              this.official.equals(other.getOfficial()))) &&
            ((this.formatted==null && other.getFormatted()==null) || 
             (this.formatted!=null &&
              this.formatted.equals(other.getFormatted())));
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
        if (getOriginal() != null) {
            _hashCode += getOriginal().hashCode();
        }
        if (getOfficial() != null) {
            _hashCode += getOfficial().hashCode();
        }
        if (getFormatted() != null) {
            _hashCode += getFormatted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessFormattedAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessFormattedAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("original");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "original"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("official");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "official"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "formatted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessAddressV3"));
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
