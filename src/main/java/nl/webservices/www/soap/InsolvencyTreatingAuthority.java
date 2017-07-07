/**
 * InsolvencyTreatingAuthority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyTreatingAuthority  implements java.io.Serializable {
    private java.math.BigInteger code;

    private java.lang.String name;

    private java.math.BigInteger establishment_code;

    private java.lang.String establishment_name;

    public InsolvencyTreatingAuthority() {
    }

    public InsolvencyTreatingAuthority(
           java.math.BigInteger code,
           java.lang.String name,
           java.math.BigInteger establishment_code,
           java.lang.String establishment_name) {
           this.code = code;
           this.name = name;
           this.establishment_code = establishment_code;
           this.establishment_name = establishment_name;
    }


    /**
     * Gets the code value for this InsolvencyTreatingAuthority.
     * 
     * @return code
     */
    public java.math.BigInteger getCode() {
        return code;
    }


    /**
     * Sets the code value for this InsolvencyTreatingAuthority.
     * 
     * @param code
     */
    public void setCode(java.math.BigInteger code) {
        this.code = code;
    }


    /**
     * Gets the name value for this InsolvencyTreatingAuthority.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InsolvencyTreatingAuthority.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the establishment_code value for this InsolvencyTreatingAuthority.
     * 
     * @return establishment_code
     */
    public java.math.BigInteger getEstablishment_code() {
        return establishment_code;
    }


    /**
     * Sets the establishment_code value for this InsolvencyTreatingAuthority.
     * 
     * @param establishment_code
     */
    public void setEstablishment_code(java.math.BigInteger establishment_code) {
        this.establishment_code = establishment_code;
    }


    /**
     * Gets the establishment_name value for this InsolvencyTreatingAuthority.
     * 
     * @return establishment_name
     */
    public java.lang.String getEstablishment_name() {
        return establishment_name;
    }


    /**
     * Sets the establishment_name value for this InsolvencyTreatingAuthority.
     * 
     * @param establishment_name
     */
    public void setEstablishment_name(java.lang.String establishment_name) {
        this.establishment_name = establishment_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyTreatingAuthority)) return false;
        InsolvencyTreatingAuthority other = (InsolvencyTreatingAuthority) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.establishment_code==null && other.getEstablishment_code()==null) || 
             (this.establishment_code!=null &&
              this.establishment_code.equals(other.getEstablishment_code()))) &&
            ((this.establishment_name==null && other.getEstablishment_name()==null) || 
             (this.establishment_name!=null &&
              this.establishment_name.equals(other.getEstablishment_name())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEstablishment_code() != null) {
            _hashCode += getEstablishment_code().hashCode();
        }
        if (getEstablishment_name() != null) {
            _hashCode += getEstablishment_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyTreatingAuthority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyTreatingAuthority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
