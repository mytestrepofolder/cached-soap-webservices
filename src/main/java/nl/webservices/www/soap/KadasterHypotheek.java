/**
 * KadasterHypotheek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterHypotheek  implements java.io.Serializable {
    private nl.webservices.www.soap.KadasterBedrag hoofdsom;

    private java.lang.Float rentevoet;

    private java.lang.Boolean meerdere_rentevoet;

    public KadasterHypotheek() {
    }

    public KadasterHypotheek(
           nl.webservices.www.soap.KadasterBedrag hoofdsom,
           java.lang.Float rentevoet,
           java.lang.Boolean meerdere_rentevoet) {
           this.hoofdsom = hoofdsom;
           this.rentevoet = rentevoet;
           this.meerdere_rentevoet = meerdere_rentevoet;
    }


    /**
     * Gets the hoofdsom value for this KadasterHypotheek.
     * 
     * @return hoofdsom
     */
    public nl.webservices.www.soap.KadasterBedrag getHoofdsom() {
        return hoofdsom;
    }


    /**
     * Sets the hoofdsom value for this KadasterHypotheek.
     * 
     * @param hoofdsom
     */
    public void setHoofdsom(nl.webservices.www.soap.KadasterBedrag hoofdsom) {
        this.hoofdsom = hoofdsom;
    }


    /**
     * Gets the rentevoet value for this KadasterHypotheek.
     * 
     * @return rentevoet
     */
    public java.lang.Float getRentevoet() {
        return rentevoet;
    }


    /**
     * Sets the rentevoet value for this KadasterHypotheek.
     * 
     * @param rentevoet
     */
    public void setRentevoet(java.lang.Float rentevoet) {
        this.rentevoet = rentevoet;
    }


    /**
     * Gets the meerdere_rentevoet value for this KadasterHypotheek.
     * 
     * @return meerdere_rentevoet
     */
    public java.lang.Boolean getMeerdere_rentevoet() {
        return meerdere_rentevoet;
    }


    /**
     * Sets the meerdere_rentevoet value for this KadasterHypotheek.
     * 
     * @param meerdere_rentevoet
     */
    public void setMeerdere_rentevoet(java.lang.Boolean meerdere_rentevoet) {
        this.meerdere_rentevoet = meerdere_rentevoet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterHypotheek)) return false;
        KadasterHypotheek other = (KadasterHypotheek) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hoofdsom==null && other.getHoofdsom()==null) || 
             (this.hoofdsom!=null &&
              this.hoofdsom.equals(other.getHoofdsom()))) &&
            ((this.rentevoet==null && other.getRentevoet()==null) || 
             (this.rentevoet!=null &&
              this.rentevoet.equals(other.getRentevoet()))) &&
            ((this.meerdere_rentevoet==null && other.getMeerdere_rentevoet()==null) || 
             (this.meerdere_rentevoet!=null &&
              this.meerdere_rentevoet.equals(other.getMeerdere_rentevoet())));
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
        if (getHoofdsom() != null) {
            _hashCode += getHoofdsom().hashCode();
        }
        if (getRentevoet() != null) {
            _hashCode += getRentevoet().hashCode();
        }
        if (getMeerdere_rentevoet() != null) {
            _hashCode += getMeerdere_rentevoet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterHypotheek.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterHypotheek"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoofdsom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hoofdsom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBedrag"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentevoet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rentevoet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meerdere_rentevoet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "meerdere_rentevoet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
