/**
 * BusinessUpdateCheckDossierRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessUpdateCheckDossierRequestType  implements java.io.Serializable {
    private java.lang.String dossierno;

    private java.lang.String subdossierno;

    private java.lang.String[] update_types;

    public BusinessUpdateCheckDossierRequestType() {
    }

    public BusinessUpdateCheckDossierRequestType(
           java.lang.String dossierno,
           java.lang.String subdossierno,
           java.lang.String[] update_types) {
           this.dossierno = dossierno;
           this.subdossierno = subdossierno;
           this.update_types = update_types;
    }


    /**
     * Gets the dossierno value for this BusinessUpdateCheckDossierRequestType.
     * 
     * @return dossierno
     */
    public java.lang.String getDossierno() {
        return dossierno;
    }


    /**
     * Sets the dossierno value for this BusinessUpdateCheckDossierRequestType.
     * 
     * @param dossierno
     */
    public void setDossierno(java.lang.String dossierno) {
        this.dossierno = dossierno;
    }


    /**
     * Gets the subdossierno value for this BusinessUpdateCheckDossierRequestType.
     * 
     * @return subdossierno
     */
    public java.lang.String getSubdossierno() {
        return subdossierno;
    }


    /**
     * Sets the subdossierno value for this BusinessUpdateCheckDossierRequestType.
     * 
     * @param subdossierno
     */
    public void setSubdossierno(java.lang.String subdossierno) {
        this.subdossierno = subdossierno;
    }


    /**
     * Gets the update_types value for this BusinessUpdateCheckDossierRequestType.
     * 
     * @return update_types
     */
    public java.lang.String[] getUpdate_types() {
        return update_types;
    }


    /**
     * Sets the update_types value for this BusinessUpdateCheckDossierRequestType.
     * 
     * @param update_types
     */
    public void setUpdate_types(java.lang.String[] update_types) {
        this.update_types = update_types;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessUpdateCheckDossierRequestType)) return false;
        BusinessUpdateCheckDossierRequestType other = (BusinessUpdateCheckDossierRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossierno==null && other.getDossierno()==null) || 
             (this.dossierno!=null &&
              this.dossierno.equals(other.getDossierno()))) &&
            ((this.subdossierno==null && other.getSubdossierno()==null) || 
             (this.subdossierno!=null &&
              this.subdossierno.equals(other.getSubdossierno()))) &&
            ((this.update_types==null && other.getUpdate_types()==null) || 
             (this.update_types!=null &&
              java.util.Arrays.equals(this.update_types, other.getUpdate_types())));
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
        if (getDossierno() != null) {
            _hashCode += getDossierno().hashCode();
        }
        if (getSubdossierno() != null) {
            _hashCode += getSubdossierno().hashCode();
        }
        if (getUpdate_types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdate_types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdate_types(), i);
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
        new org.apache.axis.description.TypeDesc(BusinessUpdateCheckDossierRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "businessUpdateCheckDossierRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossierno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdossierno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subdossierno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "update_types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
