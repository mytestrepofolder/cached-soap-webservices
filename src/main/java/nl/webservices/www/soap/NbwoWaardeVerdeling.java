/**
 * NbwoWaardeVerdeling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NbwoWaardeVerdeling  implements java.io.Serializable {
    private int koopsom_van;

    private int koopsom_tot;

    private int aantal;

    public NbwoWaardeVerdeling() {
    }

    public NbwoWaardeVerdeling(
           int koopsom_van,
           int koopsom_tot,
           int aantal) {
           this.koopsom_van = koopsom_van;
           this.koopsom_tot = koopsom_tot;
           this.aantal = aantal;
    }


    /**
     * Gets the koopsom_van value for this NbwoWaardeVerdeling.
     * 
     * @return koopsom_van
     */
    public int getKoopsom_van() {
        return koopsom_van;
    }


    /**
     * Sets the koopsom_van value for this NbwoWaardeVerdeling.
     * 
     * @param koopsom_van
     */
    public void setKoopsom_van(int koopsom_van) {
        this.koopsom_van = koopsom_van;
    }


    /**
     * Gets the koopsom_tot value for this NbwoWaardeVerdeling.
     * 
     * @return koopsom_tot
     */
    public int getKoopsom_tot() {
        return koopsom_tot;
    }


    /**
     * Sets the koopsom_tot value for this NbwoWaardeVerdeling.
     * 
     * @param koopsom_tot
     */
    public void setKoopsom_tot(int koopsom_tot) {
        this.koopsom_tot = koopsom_tot;
    }


    /**
     * Gets the aantal value for this NbwoWaardeVerdeling.
     * 
     * @return aantal
     */
    public int getAantal() {
        return aantal;
    }


    /**
     * Sets the aantal value for this NbwoWaardeVerdeling.
     * 
     * @param aantal
     */
    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NbwoWaardeVerdeling)) return false;
        NbwoWaardeVerdeling other = (NbwoWaardeVerdeling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.koopsom_van == other.getKoopsom_van() &&
            this.koopsom_tot == other.getKoopsom_tot() &&
            this.aantal == other.getAantal();
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
        _hashCode += getKoopsom_van();
        _hashCode += getKoopsom_tot();
        _hashCode += getAantal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NbwoWaardeVerdeling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NbwoWaardeVerdeling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopsom_van");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopsom_van"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koopsom_tot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "koopsom_tot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aantal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aantal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
