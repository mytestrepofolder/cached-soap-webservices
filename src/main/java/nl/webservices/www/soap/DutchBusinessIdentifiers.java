/**
 * DutchBusinessIdentifiers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessIdentifiers  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.lang.String establishment_number;

    private java.lang.String rsi_number;

    public DutchBusinessIdentifiers() {
    }

    public DutchBusinessIdentifiers(
           java.lang.String dossier_number,
           java.lang.String establishment_number,
           java.lang.String rsi_number) {
           this.dossier_number = dossier_number;
           this.establishment_number = establishment_number;
           this.rsi_number = rsi_number;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessIdentifiers.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessIdentifiers.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the establishment_number value for this DutchBusinessIdentifiers.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this DutchBusinessIdentifiers.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the rsi_number value for this DutchBusinessIdentifiers.
     * 
     * @return rsi_number
     */
    public java.lang.String getRsi_number() {
        return rsi_number;
    }


    /**
     * Sets the rsi_number value for this DutchBusinessIdentifiers.
     * 
     * @param rsi_number
     */
    public void setRsi_number(java.lang.String rsi_number) {
        this.rsi_number = rsi_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessIdentifiers)) return false;
        DutchBusinessIdentifiers other = (DutchBusinessIdentifiers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.rsi_number==null && other.getRsi_number()==null) || 
             (this.rsi_number!=null &&
              this.rsi_number.equals(other.getRsi_number())));
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
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getRsi_number() != null) {
            _hashCode += getRsi_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessIdentifiers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessIdentifiers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsi_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "rsi_number"));
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
