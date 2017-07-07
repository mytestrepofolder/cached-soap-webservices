/**
 * DutchBusinessGetExtractHistoryChangedRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessGetExtractHistoryChangedRequestType  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.util.Date period_start_date;

    private java.util.Date period_end_date;

    public DutchBusinessGetExtractHistoryChangedRequestType() {
    }

    public DutchBusinessGetExtractHistoryChangedRequestType(
           java.lang.String dossier_number,
           java.util.Date period_start_date,
           java.util.Date period_end_date) {
           this.dossier_number = dossier_number;
           this.period_start_date = period_start_date;
           this.period_end_date = period_end_date;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessGetExtractHistoryChangedRequestType.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessGetExtractHistoryChangedRequestType.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the period_start_date value for this DutchBusinessGetExtractHistoryChangedRequestType.
     * 
     * @return period_start_date
     */
    public java.util.Date getPeriod_start_date() {
        return period_start_date;
    }


    /**
     * Sets the period_start_date value for this DutchBusinessGetExtractHistoryChangedRequestType.
     * 
     * @param period_start_date
     */
    public void setPeriod_start_date(java.util.Date period_start_date) {
        this.period_start_date = period_start_date;
    }


    /**
     * Gets the period_end_date value for this DutchBusinessGetExtractHistoryChangedRequestType.
     * 
     * @return period_end_date
     */
    public java.util.Date getPeriod_end_date() {
        return period_end_date;
    }


    /**
     * Sets the period_end_date value for this DutchBusinessGetExtractHistoryChangedRequestType.
     * 
     * @param period_end_date
     */
    public void setPeriod_end_date(java.util.Date period_end_date) {
        this.period_end_date = period_end_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessGetExtractHistoryChangedRequestType)) return false;
        DutchBusinessGetExtractHistoryChangedRequestType other = (DutchBusinessGetExtractHistoryChangedRequestType) obj;
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
            ((this.period_start_date==null && other.getPeriod_start_date()==null) || 
             (this.period_start_date!=null &&
              this.period_start_date.equals(other.getPeriod_start_date()))) &&
            ((this.period_end_date==null && other.getPeriod_end_date()==null) || 
             (this.period_end_date!=null &&
              this.period_end_date.equals(other.getPeriod_end_date())));
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
        if (getPeriod_start_date() != null) {
            _hashCode += getPeriod_start_date().hashCode();
        }
        if (getPeriod_end_date() != null) {
            _hashCode += getPeriod_end_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessGetExtractHistoryChangedRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dutchBusinessGetExtractHistoryChangedRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "period_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "period_end_date"));
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
