/**
 * CreditsafeNlMisc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeNlMisc  implements java.io.Serializable {
    private java.util.Calendar ceased_trading_date;

    private java.lang.Boolean exporter;

    private java.lang.Boolean importer;

    public CreditsafeNlMisc() {
    }

    public CreditsafeNlMisc(
           java.util.Calendar ceased_trading_date,
           java.lang.Boolean exporter,
           java.lang.Boolean importer) {
           this.ceased_trading_date = ceased_trading_date;
           this.exporter = exporter;
           this.importer = importer;
    }


    /**
     * Gets the ceased_trading_date value for this CreditsafeNlMisc.
     * 
     * @return ceased_trading_date
     */
    public java.util.Calendar getCeased_trading_date() {
        return ceased_trading_date;
    }


    /**
     * Sets the ceased_trading_date value for this CreditsafeNlMisc.
     * 
     * @param ceased_trading_date
     */
    public void setCeased_trading_date(java.util.Calendar ceased_trading_date) {
        this.ceased_trading_date = ceased_trading_date;
    }


    /**
     * Gets the exporter value for this CreditsafeNlMisc.
     * 
     * @return exporter
     */
    public java.lang.Boolean getExporter() {
        return exporter;
    }


    /**
     * Sets the exporter value for this CreditsafeNlMisc.
     * 
     * @param exporter
     */
    public void setExporter(java.lang.Boolean exporter) {
        this.exporter = exporter;
    }


    /**
     * Gets the importer value for this CreditsafeNlMisc.
     * 
     * @return importer
     */
    public java.lang.Boolean getImporter() {
        return importer;
    }


    /**
     * Sets the importer value for this CreditsafeNlMisc.
     * 
     * @param importer
     */
    public void setImporter(java.lang.Boolean importer) {
        this.importer = importer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeNlMisc)) return false;
        CreditsafeNlMisc other = (CreditsafeNlMisc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ceased_trading_date==null && other.getCeased_trading_date()==null) || 
             (this.ceased_trading_date!=null &&
              this.ceased_trading_date.equals(other.getCeased_trading_date()))) &&
            ((this.exporter==null && other.getExporter()==null) || 
             (this.exporter!=null &&
              this.exporter.equals(other.getExporter()))) &&
            ((this.importer==null && other.getImporter()==null) || 
             (this.importer!=null &&
              this.importer.equals(other.getImporter())));
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
        if (getCeased_trading_date() != null) {
            _hashCode += getCeased_trading_date().hashCode();
        }
        if (getExporter() != null) {
            _hashCode += getExporter().hashCode();
        }
        if (getImporter() != null) {
            _hashCode += getImporter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeNlMisc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeNlMisc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceased_trading_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ceased_trading_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exporter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "exporter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "importer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
