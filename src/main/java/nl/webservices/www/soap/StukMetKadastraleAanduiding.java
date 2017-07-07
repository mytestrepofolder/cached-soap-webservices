/**
 * StukMetKadastraleAanduiding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class StukMetKadastraleAanduiding  implements java.io.Serializable {
    private java.lang.String id;

    private nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding;

    public StukMetKadastraleAanduiding() {
    }

    public StukMetKadastraleAanduiding(
           java.lang.String id,
           nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding) {
           this.id = id;
           this.kadastrale_aanduiding = kadastrale_aanduiding;
    }


    /**
     * Gets the id value for this StukMetKadastraleAanduiding.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this StukMetKadastraleAanduiding.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the kadastrale_aanduiding value for this StukMetKadastraleAanduiding.
     * 
     * @return kadastrale_aanduiding
     */
    public nl.webservices.www.soap.KadastraleAanduiding getKadastrale_aanduiding() {
        return kadastrale_aanduiding;
    }


    /**
     * Sets the kadastrale_aanduiding value for this StukMetKadastraleAanduiding.
     * 
     * @param kadastrale_aanduiding
     */
    public void setKadastrale_aanduiding(nl.webservices.www.soap.KadastraleAanduiding kadastrale_aanduiding) {
        this.kadastrale_aanduiding = kadastrale_aanduiding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StukMetKadastraleAanduiding)) return false;
        StukMetKadastraleAanduiding other = (StukMetKadastraleAanduiding) obj;
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
            ((this.kadastrale_aanduiding==null && other.getKadastrale_aanduiding()==null) || 
             (this.kadastrale_aanduiding!=null &&
              this.kadastrale_aanduiding.equals(other.getKadastrale_aanduiding())));
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
        if (getKadastrale_aanduiding() != null) {
            _hashCode += getKadastrale_aanduiding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StukMetKadastraleAanduiding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "StukMetKadastraleAanduiding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kadastrale_aanduiding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadastrale_aanduiding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraleAanduiding"));
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
