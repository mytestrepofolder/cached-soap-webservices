/**
 * BusinessSearchDossierNumberRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessSearchDossierNumberRequestType  implements java.io.Serializable {
    private java.lang.String dossierno;

    private java.lang.String subdossierno;

    private int page;

    public BusinessSearchDossierNumberRequestType() {
    }

    public BusinessSearchDossierNumberRequestType(
           java.lang.String dossierno,
           java.lang.String subdossierno,
           int page) {
           this.dossierno = dossierno;
           this.subdossierno = subdossierno;
           this.page = page;
    }


    /**
     * Gets the dossierno value for this BusinessSearchDossierNumberRequestType.
     * 
     * @return dossierno
     */
    public java.lang.String getDossierno() {
        return dossierno;
    }


    /**
     * Sets the dossierno value for this BusinessSearchDossierNumberRequestType.
     * 
     * @param dossierno
     */
    public void setDossierno(java.lang.String dossierno) {
        this.dossierno = dossierno;
    }


    /**
     * Gets the subdossierno value for this BusinessSearchDossierNumberRequestType.
     * 
     * @return subdossierno
     */
    public java.lang.String getSubdossierno() {
        return subdossierno;
    }


    /**
     * Sets the subdossierno value for this BusinessSearchDossierNumberRequestType.
     * 
     * @param subdossierno
     */
    public void setSubdossierno(java.lang.String subdossierno) {
        this.subdossierno = subdossierno;
    }


    /**
     * Gets the page value for this BusinessSearchDossierNumberRequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this BusinessSearchDossierNumberRequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessSearchDossierNumberRequestType)) return false;
        BusinessSearchDossierNumberRequestType other = (BusinessSearchDossierNumberRequestType) obj;
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
            this.page == other.getPage();
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
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessSearchDossierNumberRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "businessSearchDossierNumberRequestType"));
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
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
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
