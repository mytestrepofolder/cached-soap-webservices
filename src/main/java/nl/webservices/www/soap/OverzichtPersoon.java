/**
 * OverzichtPersoon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class OverzichtPersoon  implements java.io.Serializable {
    private java.lang.String id;

    private nl.webservices.www.soap.OverzichtNatuurlijkPersoon natuurlijk_persoon;

    private nl.webservices.www.soap.OverzichtNietNatuurlijkPersoon niet_natuurlijk_persoon;

    public OverzichtPersoon() {
    }

    public OverzichtPersoon(
           java.lang.String id,
           nl.webservices.www.soap.OverzichtNatuurlijkPersoon natuurlijk_persoon,
           nl.webservices.www.soap.OverzichtNietNatuurlijkPersoon niet_natuurlijk_persoon) {
           this.id = id;
           this.natuurlijk_persoon = natuurlijk_persoon;
           this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
    }


    /**
     * Gets the id value for this OverzichtPersoon.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OverzichtPersoon.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the natuurlijk_persoon value for this OverzichtPersoon.
     * 
     * @return natuurlijk_persoon
     */
    public nl.webservices.www.soap.OverzichtNatuurlijkPersoon getNatuurlijk_persoon() {
        return natuurlijk_persoon;
    }


    /**
     * Sets the natuurlijk_persoon value for this OverzichtPersoon.
     * 
     * @param natuurlijk_persoon
     */
    public void setNatuurlijk_persoon(nl.webservices.www.soap.OverzichtNatuurlijkPersoon natuurlijk_persoon) {
        this.natuurlijk_persoon = natuurlijk_persoon;
    }


    /**
     * Gets the niet_natuurlijk_persoon value for this OverzichtPersoon.
     * 
     * @return niet_natuurlijk_persoon
     */
    public nl.webservices.www.soap.OverzichtNietNatuurlijkPersoon getNiet_natuurlijk_persoon() {
        return niet_natuurlijk_persoon;
    }


    /**
     * Sets the niet_natuurlijk_persoon value for this OverzichtPersoon.
     * 
     * @param niet_natuurlijk_persoon
     */
    public void setNiet_natuurlijk_persoon(nl.webservices.www.soap.OverzichtNietNatuurlijkPersoon niet_natuurlijk_persoon) {
        this.niet_natuurlijk_persoon = niet_natuurlijk_persoon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverzichtPersoon)) return false;
        OverzichtPersoon other = (OverzichtPersoon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.natuurlijk_persoon==null && other.getNatuurlijk_persoon()==null) || 
             (this.natuurlijk_persoon!=null &&
              this.natuurlijk_persoon.equals(other.getNatuurlijk_persoon()))) &&
            ((this.niet_natuurlijk_persoon==null && other.getNiet_natuurlijk_persoon()==null) || 
             (this.niet_natuurlijk_persoon!=null &&
              this.niet_natuurlijk_persoon.equals(other.getNiet_natuurlijk_persoon())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNatuurlijk_persoon() != null) {
            _hashCode += getNatuurlijk_persoon().hashCode();
        }
        if (getNiet_natuurlijk_persoon() != null) {
            _hashCode += getNiet_natuurlijk_persoon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverzichtPersoon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtPersoon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtNatuurlijkPersoon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niet_natuurlijk_persoon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "niet_natuurlijk_persoon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtNietNatuurlijkPersoon"));
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
