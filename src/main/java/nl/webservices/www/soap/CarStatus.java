/**
 * CarStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarStatus  implements java.io.Serializable {
    private java.lang.Boolean insured;

    private java.lang.Boolean awaiting_inspection;

    private java.lang.Boolean missing;

    private java.lang.Boolean stolen;

    public CarStatus() {
    }

    public CarStatus(
           java.lang.Boolean insured,
           java.lang.Boolean awaiting_inspection,
           java.lang.Boolean missing,
           java.lang.Boolean stolen) {
           this.insured = insured;
           this.awaiting_inspection = awaiting_inspection;
           this.missing = missing;
           this.stolen = stolen;
    }


    /**
     * Gets the insured value for this CarStatus.
     * 
     * @return insured
     */
    public java.lang.Boolean getInsured() {
        return insured;
    }


    /**
     * Sets the insured value for this CarStatus.
     * 
     * @param insured
     */
    public void setInsured(java.lang.Boolean insured) {
        this.insured = insured;
    }


    /**
     * Gets the awaiting_inspection value for this CarStatus.
     * 
     * @return awaiting_inspection
     */
    public java.lang.Boolean getAwaiting_inspection() {
        return awaiting_inspection;
    }


    /**
     * Sets the awaiting_inspection value for this CarStatus.
     * 
     * @param awaiting_inspection
     */
    public void setAwaiting_inspection(java.lang.Boolean awaiting_inspection) {
        this.awaiting_inspection = awaiting_inspection;
    }


    /**
     * Gets the missing value for this CarStatus.
     * 
     * @return missing
     */
    public java.lang.Boolean getMissing() {
        return missing;
    }


    /**
     * Sets the missing value for this CarStatus.
     * 
     * @param missing
     */
    public void setMissing(java.lang.Boolean missing) {
        this.missing = missing;
    }


    /**
     * Gets the stolen value for this CarStatus.
     * 
     * @return stolen
     */
    public java.lang.Boolean getStolen() {
        return stolen;
    }


    /**
     * Sets the stolen value for this CarStatus.
     * 
     * @param stolen
     */
    public void setStolen(java.lang.Boolean stolen) {
        this.stolen = stolen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarStatus)) return false;
        CarStatus other = (CarStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insured==null && other.getInsured()==null) || 
             (this.insured!=null &&
              this.insured.equals(other.getInsured()))) &&
            ((this.awaiting_inspection==null && other.getAwaiting_inspection()==null) || 
             (this.awaiting_inspection!=null &&
              this.awaiting_inspection.equals(other.getAwaiting_inspection()))) &&
            ((this.missing==null && other.getMissing()==null) || 
             (this.missing!=null &&
              this.missing.equals(other.getMissing()))) &&
            ((this.stolen==null && other.getStolen()==null) || 
             (this.stolen!=null &&
              this.stolen.equals(other.getStolen())));
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
        if (getInsured() != null) {
            _hashCode += getInsured().hashCode();
        }
        if (getAwaiting_inspection() != null) {
            _hashCode += getAwaiting_inspection().hashCode();
        }
        if (getMissing() != null) {
            _hashCode += getMissing().hashCode();
        }
        if (getStolen() != null) {
            _hashCode += getStolen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaiting_inspection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "awaiting_inspection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "missing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stolen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stolen"));
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
