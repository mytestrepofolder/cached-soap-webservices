/**
 * KadasterOverzichtRecht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterOverzichtRecht  implements java.io.Serializable {
    private java.lang.String object_id;

    private java.lang.String gerechtigde_akr;

    private java.lang.String gerechtigde_kadastrale_identificatie;

    public KadasterOverzichtRecht() {
    }

    public KadasterOverzichtRecht(
           java.lang.String object_id,
           java.lang.String gerechtigde_akr,
           java.lang.String gerechtigde_kadastrale_identificatie) {
           this.object_id = object_id;
           this.gerechtigde_akr = gerechtigde_akr;
           this.gerechtigde_kadastrale_identificatie = gerechtigde_kadastrale_identificatie;
    }


    /**
     * Gets the object_id value for this KadasterOverzichtRecht.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this KadasterOverzichtRecht.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the gerechtigde_akr value for this KadasterOverzichtRecht.
     * 
     * @return gerechtigde_akr
     */
    public java.lang.String getGerechtigde_akr() {
        return gerechtigde_akr;
    }


    /**
     * Sets the gerechtigde_akr value for this KadasterOverzichtRecht.
     * 
     * @param gerechtigde_akr
     */
    public void setGerechtigde_akr(java.lang.String gerechtigde_akr) {
        this.gerechtigde_akr = gerechtigde_akr;
    }


    /**
     * Gets the gerechtigde_kadastrale_identificatie value for this KadasterOverzichtRecht.
     * 
     * @return gerechtigde_kadastrale_identificatie
     */
    public java.lang.String getGerechtigde_kadastrale_identificatie() {
        return gerechtigde_kadastrale_identificatie;
    }


    /**
     * Sets the gerechtigde_kadastrale_identificatie value for this KadasterOverzichtRecht.
     * 
     * @param gerechtigde_kadastrale_identificatie
     */
    public void setGerechtigde_kadastrale_identificatie(java.lang.String gerechtigde_kadastrale_identificatie) {
        this.gerechtigde_kadastrale_identificatie = gerechtigde_kadastrale_identificatie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterOverzichtRecht)) return false;
        KadasterOverzichtRecht other = (KadasterOverzichtRecht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.object_id==null && other.getObject_id()==null) || 
             (this.object_id!=null &&
              this.object_id.equals(other.getObject_id()))) &&
            ((this.gerechtigde_akr==null && other.getGerechtigde_akr()==null) || 
             (this.gerechtigde_akr!=null &&
              this.gerechtigde_akr.equals(other.getGerechtigde_akr()))) &&
            ((this.gerechtigde_kadastrale_identificatie==null && other.getGerechtigde_kadastrale_identificatie()==null) || 
             (this.gerechtigde_kadastrale_identificatie!=null &&
              this.gerechtigde_kadastrale_identificatie.equals(other.getGerechtigde_kadastrale_identificatie())));
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
        if (getObject_id() != null) {
            _hashCode += getObject_id().hashCode();
        }
        if (getGerechtigde_akr() != null) {
            _hashCode += getGerechtigde_akr().hashCode();
        }
        if (getGerechtigde_kadastrale_identificatie() != null) {
            _hashCode += getGerechtigde_kadastrale_identificatie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterOverzichtRecht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterOverzichtRecht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerechtigde_akr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gerechtigde_akr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerechtigde_kadastrale_identificatie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gerechtigde_kadastrale_identificatie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
