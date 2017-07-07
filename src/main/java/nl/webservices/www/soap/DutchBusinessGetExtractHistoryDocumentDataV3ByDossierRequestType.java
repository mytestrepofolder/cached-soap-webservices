/**
 * DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private boolean include_source;

    private java.util.Date period_start;

    private java.util.Date period_end;

    public DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType() {
    }

    public DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType(
           java.lang.String dossier_number,
           boolean include_source,
           java.util.Date period_start,
           java.util.Date period_end) {
           this.dossier_number = dossier_number;
           this.include_source = include_source;
           this.period_start = period_start;
           this.period_end = period_end;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the include_source value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @return include_source
     */
    public boolean isInclude_source() {
        return include_source;
    }


    /**
     * Sets the include_source value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @param include_source
     */
    public void setInclude_source(boolean include_source) {
        this.include_source = include_source;
    }


    /**
     * Gets the period_start value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @return period_start
     */
    public java.util.Date getPeriod_start() {
        return period_start;
    }


    /**
     * Sets the period_start value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @param period_start
     */
    public void setPeriod_start(java.util.Date period_start) {
        this.period_start = period_start;
    }


    /**
     * Gets the period_end value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @return period_end
     */
    public java.util.Date getPeriod_end() {
        return period_end;
    }


    /**
     * Sets the period_end value for this DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.
     * 
     * @param period_end
     */
    public void setPeriod_end(java.util.Date period_end) {
        this.period_end = period_end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType)) return false;
        DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType other = (DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType) obj;
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
            this.include_source == other.isInclude_source() &&
            ((this.period_start==null && other.getPeriod_start()==null) || 
             (this.period_start!=null &&
              this.period_start.equals(other.getPeriod_start()))) &&
            ((this.period_end==null && other.getPeriod_end()==null) || 
             (this.period_end!=null &&
              this.period_end.equals(other.getPeriod_end())));
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
        _hashCode += (isInclude_source() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPeriod_start() != null) {
            _hashCode += getPeriod_start().hashCode();
        }
        if (getPeriod_end() != null) {
            _hashCode += getPeriod_end().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "include_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "period_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "period_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
