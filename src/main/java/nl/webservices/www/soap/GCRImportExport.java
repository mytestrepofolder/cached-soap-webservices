/**
 * GCRImportExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRImportExport  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRCountry[] import_countries;

    private nl.webservices.www.soap.GCRCountry[] export_countries;

    public GCRImportExport() {
    }

    public GCRImportExport(
           nl.webservices.www.soap.GCRCountry[] import_countries,
           nl.webservices.www.soap.GCRCountry[] export_countries) {
           this.import_countries = import_countries;
           this.export_countries = export_countries;
    }


    /**
     * Gets the import_countries value for this GCRImportExport.
     * 
     * @return import_countries
     */
    public nl.webservices.www.soap.GCRCountry[] getImport_countries() {
        return import_countries;
    }


    /**
     * Sets the import_countries value for this GCRImportExport.
     * 
     * @param import_countries
     */
    public void setImport_countries(nl.webservices.www.soap.GCRCountry[] import_countries) {
        this.import_countries = import_countries;
    }


    /**
     * Gets the export_countries value for this GCRImportExport.
     * 
     * @return export_countries
     */
    public nl.webservices.www.soap.GCRCountry[] getExport_countries() {
        return export_countries;
    }


    /**
     * Sets the export_countries value for this GCRImportExport.
     * 
     * @param export_countries
     */
    public void setExport_countries(nl.webservices.www.soap.GCRCountry[] export_countries) {
        this.export_countries = export_countries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRImportExport)) return false;
        GCRImportExport other = (GCRImportExport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.import_countries==null && other.getImport_countries()==null) || 
             (this.import_countries!=null &&
              java.util.Arrays.equals(this.import_countries, other.getImport_countries()))) &&
            ((this.export_countries==null && other.getExport_countries()==null) || 
             (this.export_countries!=null &&
              java.util.Arrays.equals(this.export_countries, other.getExport_countries())));
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
        if (getImport_countries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImport_countries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImport_countries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExport_countries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExport_countries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExport_countries(), i);
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
        new org.apache.axis.description.TypeDesc(GCRImportExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRImportExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("import_countries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "import_countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCountry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export_countries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "export_countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCountry"));
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
