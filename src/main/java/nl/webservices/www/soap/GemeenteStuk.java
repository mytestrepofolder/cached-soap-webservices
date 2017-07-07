/**
 * GemeenteStuk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GemeenteStuk  implements java.io.Serializable {
    private java.lang.String gemeentelijke_registratie_id;

    private java.lang.String nummer;

    private java.util.Date datum_in_werking;

    public GemeenteStuk() {
    }

    public GemeenteStuk(
           java.lang.String gemeentelijke_registratie_id,
           java.lang.String nummer,
           java.util.Date datum_in_werking) {
           this.gemeentelijke_registratie_id = gemeentelijke_registratie_id;
           this.nummer = nummer;
           this.datum_in_werking = datum_in_werking;
    }


    /**
     * Gets the gemeentelijke_registratie_id value for this GemeenteStuk.
     * 
     * @return gemeentelijke_registratie_id
     */
    public java.lang.String getGemeentelijke_registratie_id() {
        return gemeentelijke_registratie_id;
    }


    /**
     * Sets the gemeentelijke_registratie_id value for this GemeenteStuk.
     * 
     * @param gemeentelijke_registratie_id
     */
    public void setGemeentelijke_registratie_id(java.lang.String gemeentelijke_registratie_id) {
        this.gemeentelijke_registratie_id = gemeentelijke_registratie_id;
    }


    /**
     * Gets the nummer value for this GemeenteStuk.
     * 
     * @return nummer
     */
    public java.lang.String getNummer() {
        return nummer;
    }


    /**
     * Sets the nummer value for this GemeenteStuk.
     * 
     * @param nummer
     */
    public void setNummer(java.lang.String nummer) {
        this.nummer = nummer;
    }


    /**
     * Gets the datum_in_werking value for this GemeenteStuk.
     * 
     * @return datum_in_werking
     */
    public java.util.Date getDatum_in_werking() {
        return datum_in_werking;
    }


    /**
     * Sets the datum_in_werking value for this GemeenteStuk.
     * 
     * @param datum_in_werking
     */
    public void setDatum_in_werking(java.util.Date datum_in_werking) {
        this.datum_in_werking = datum_in_werking;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GemeenteStuk)) return false;
        GemeenteStuk other = (GemeenteStuk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gemeentelijke_registratie_id==null && other.getGemeentelijke_registratie_id()==null) || 
             (this.gemeentelijke_registratie_id!=null &&
              this.gemeentelijke_registratie_id.equals(other.getGemeentelijke_registratie_id()))) &&
            ((this.nummer==null && other.getNummer()==null) || 
             (this.nummer!=null &&
              this.nummer.equals(other.getNummer()))) &&
            ((this.datum_in_werking==null && other.getDatum_in_werking()==null) || 
             (this.datum_in_werking!=null &&
              this.datum_in_werking.equals(other.getDatum_in_werking())));
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
        if (getGemeentelijke_registratie_id() != null) {
            _hashCode += getGemeentelijke_registratie_id().hashCode();
        }
        if (getNummer() != null) {
            _hashCode += getNummer().hashCode();
        }
        if (getDatum_in_werking() != null) {
            _hashCode += getDatum_in_werking().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GemeenteStuk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GemeenteStuk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gemeentelijke_registratie_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gemeentelijke_registratie_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_in_werking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "datum_in_werking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
