/**
 * GraydonCreditReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditReport  implements java.io.Serializable {
    private nl.webservices.www.soap.GraydonCreditReportNormal report_normal;

    private nl.webservices.www.soap.GraydonCreditReportCalamity report_calamity;

    private nl.webservices.www.soap.GraydonCreditReportAlarm report_alarm;

    private byte[] document;

    private nl.webservices.www.soap.GCRAlarm alarm;

    public GraydonCreditReport() {
    }

    public GraydonCreditReport(
           nl.webservices.www.soap.GraydonCreditReportNormal report_normal,
           nl.webservices.www.soap.GraydonCreditReportCalamity report_calamity,
           nl.webservices.www.soap.GraydonCreditReportAlarm report_alarm,
           byte[] document,
           nl.webservices.www.soap.GCRAlarm alarm) {
           this.report_normal = report_normal;
           this.report_calamity = report_calamity;
           this.report_alarm = report_alarm;
           this.document = document;
           this.alarm = alarm;
    }


    /**
     * Gets the report_normal value for this GraydonCreditReport.
     * 
     * @return report_normal
     */
    public nl.webservices.www.soap.GraydonCreditReportNormal getReport_normal() {
        return report_normal;
    }


    /**
     * Sets the report_normal value for this GraydonCreditReport.
     * 
     * @param report_normal
     */
    public void setReport_normal(nl.webservices.www.soap.GraydonCreditReportNormal report_normal) {
        this.report_normal = report_normal;
    }


    /**
     * Gets the report_calamity value for this GraydonCreditReport.
     * 
     * @return report_calamity
     */
    public nl.webservices.www.soap.GraydonCreditReportCalamity getReport_calamity() {
        return report_calamity;
    }


    /**
     * Sets the report_calamity value for this GraydonCreditReport.
     * 
     * @param report_calamity
     */
    public void setReport_calamity(nl.webservices.www.soap.GraydonCreditReportCalamity report_calamity) {
        this.report_calamity = report_calamity;
    }


    /**
     * Gets the report_alarm value for this GraydonCreditReport.
     * 
     * @return report_alarm
     */
    public nl.webservices.www.soap.GraydonCreditReportAlarm getReport_alarm() {
        return report_alarm;
    }


    /**
     * Sets the report_alarm value for this GraydonCreditReport.
     * 
     * @param report_alarm
     */
    public void setReport_alarm(nl.webservices.www.soap.GraydonCreditReportAlarm report_alarm) {
        this.report_alarm = report_alarm;
    }


    /**
     * Gets the document value for this GraydonCreditReport.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this GraydonCreditReport.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }


    /**
     * Gets the alarm value for this GraydonCreditReport.
     * 
     * @return alarm
     */
    public nl.webservices.www.soap.GCRAlarm getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this GraydonCreditReport.
     * 
     * @param alarm
     */
    public void setAlarm(nl.webservices.www.soap.GCRAlarm alarm) {
        this.alarm = alarm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditReport)) return false;
        GraydonCreditReport other = (GraydonCreditReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.report_normal==null && other.getReport_normal()==null) || 
             (this.report_normal!=null &&
              this.report_normal.equals(other.getReport_normal()))) &&
            ((this.report_calamity==null && other.getReport_calamity()==null) || 
             (this.report_calamity!=null &&
              this.report_calamity.equals(other.getReport_calamity()))) &&
            ((this.report_alarm==null && other.getReport_alarm()==null) || 
             (this.report_alarm!=null &&
              this.report_alarm.equals(other.getReport_alarm()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm())));
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
        if (getReport_normal() != null) {
            _hashCode += getReport_normal().hashCode();
        }
        if (getReport_calamity() != null) {
            _hashCode += getReport_calamity().hashCode();
        }
        if (getReport_alarm() != null) {
            _hashCode += getReport_alarm().hashCode();
        }
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_normal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "report_normal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportNormal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_calamity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "report_calamity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportCalamity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "report_alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GraydonCreditReportAlarm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRAlarm"));
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
