/**
 * DutchBusinessPositions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPositions  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.util.Calendar reference_date;

    private nl.webservices.www.soap.DutchBusinessPositionV2[] positions;

    public DutchBusinessPositions() {
    }

    public DutchBusinessPositions(
           java.lang.String dossier_number,
           java.util.Calendar reference_date,
           nl.webservices.www.soap.DutchBusinessPositionV2[] positions) {
           this.dossier_number = dossier_number;
           this.reference_date = reference_date;
           this.positions = positions;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessPositions.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessPositions.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the reference_date value for this DutchBusinessPositions.
     * 
     * @return reference_date
     */
    public java.util.Calendar getReference_date() {
        return reference_date;
    }


    /**
     * Sets the reference_date value for this DutchBusinessPositions.
     * 
     * @param reference_date
     */
    public void setReference_date(java.util.Calendar reference_date) {
        this.reference_date = reference_date;
    }


    /**
     * Gets the positions value for this DutchBusinessPositions.
     * 
     * @return positions
     */
    public nl.webservices.www.soap.DutchBusinessPositionV2[] getPositions() {
        return positions;
    }


    /**
     * Sets the positions value for this DutchBusinessPositions.
     * 
     * @param positions
     */
    public void setPositions(nl.webservices.www.soap.DutchBusinessPositionV2[] positions) {
        this.positions = positions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPositions)) return false;
        DutchBusinessPositions other = (DutchBusinessPositions) obj;
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
            ((this.reference_date==null && other.getReference_date()==null) || 
             (this.reference_date!=null &&
              this.reference_date.equals(other.getReference_date()))) &&
            ((this.positions==null && other.getPositions()==null) || 
             (this.positions!=null &&
              java.util.Arrays.equals(this.positions, other.getPositions())));
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
        if (getReference_date() != null) {
            _hashCode += getReference_date().hashCode();
        }
        if (getPositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPositions(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessPositions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPositions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reference_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "positions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPositionV2"));
        elemField.setMinOccurs(0);
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
