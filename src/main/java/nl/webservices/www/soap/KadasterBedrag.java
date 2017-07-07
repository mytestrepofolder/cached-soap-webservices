/**
 * KadasterBedrag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterBedrag  implements java.io.Serializable {
    private java.lang.String valuta;

    private long bedrag;

    public KadasterBedrag() {
    }

    public KadasterBedrag(
           java.lang.String valuta,
           long bedrag) {
           this.valuta = valuta;
           this.bedrag = bedrag;
    }


    /**
     * Gets the valuta value for this KadasterBedrag.
     * 
     * @return valuta
     */
    public java.lang.String getValuta() {
        return valuta;
    }


    /**
     * Sets the valuta value for this KadasterBedrag.
     * 
     * @param valuta
     */
    public void setValuta(java.lang.String valuta) {
        this.valuta = valuta;
    }


    /**
     * Gets the bedrag value for this KadasterBedrag.
     * 
     * @return bedrag
     */
    public long getBedrag() {
        return bedrag;
    }


    /**
     * Sets the bedrag value for this KadasterBedrag.
     * 
     * @param bedrag
     */
    public void setBedrag(long bedrag) {
        this.bedrag = bedrag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterBedrag)) return false;
        KadasterBedrag other = (KadasterBedrag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valuta==null && other.getValuta()==null) || 
             (this.valuta!=null &&
              this.valuta.equals(other.getValuta()))) &&
            this.bedrag == other.getBedrag();
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
        if (getValuta() != null) {
            _hashCode += getValuta().hashCode();
        }
        _hashCode += new Long(getBedrag()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterBedrag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBedrag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "valuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bedrag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bedrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
