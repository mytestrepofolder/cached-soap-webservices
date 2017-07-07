/**
 * DutchVehicleStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehicleStatus  implements java.io.Serializable {
    private java.lang.Boolean insured;

    private java.lang.Boolean awaiting_inspection;

    private java.lang.Boolean missed;

    private java.lang.Boolean stolen;

    private java.lang.Boolean exported;

    private java.lang.Boolean suspended;

    public DutchVehicleStatus() {
    }

    public DutchVehicleStatus(
           java.lang.Boolean insured,
           java.lang.Boolean awaiting_inspection,
           java.lang.Boolean missed,
           java.lang.Boolean stolen,
           java.lang.Boolean exported,
           java.lang.Boolean suspended) {
           this.insured = insured;
           this.awaiting_inspection = awaiting_inspection;
           this.missed = missed;
           this.stolen = stolen;
           this.exported = exported;
           this.suspended = suspended;
    }


    /**
     * Gets the insured value for this DutchVehicleStatus.
     * 
     * @return insured
     */
    public java.lang.Boolean getInsured() {
        return insured;
    }


    /**
     * Sets the insured value for this DutchVehicleStatus.
     * 
     * @param insured
     */
    public void setInsured(java.lang.Boolean insured) {
        this.insured = insured;
    }


    /**
     * Gets the awaiting_inspection value for this DutchVehicleStatus.
     * 
     * @return awaiting_inspection
     */
    public java.lang.Boolean getAwaiting_inspection() {
        return awaiting_inspection;
    }


    /**
     * Sets the awaiting_inspection value for this DutchVehicleStatus.
     * 
     * @param awaiting_inspection
     */
    public void setAwaiting_inspection(java.lang.Boolean awaiting_inspection) {
        this.awaiting_inspection = awaiting_inspection;
    }


    /**
     * Gets the missed value for this DutchVehicleStatus.
     * 
     * @return missed
     */
    public java.lang.Boolean getMissed() {
        return missed;
    }


    /**
     * Sets the missed value for this DutchVehicleStatus.
     * 
     * @param missed
     */
    public void setMissed(java.lang.Boolean missed) {
        this.missed = missed;
    }


    /**
     * Gets the stolen value for this DutchVehicleStatus.
     * 
     * @return stolen
     */
    public java.lang.Boolean getStolen() {
        return stolen;
    }


    /**
     * Sets the stolen value for this DutchVehicleStatus.
     * 
     * @param stolen
     */
    public void setStolen(java.lang.Boolean stolen) {
        this.stolen = stolen;
    }


    /**
     * Gets the exported value for this DutchVehicleStatus.
     * 
     * @return exported
     */
    public java.lang.Boolean getExported() {
        return exported;
    }


    /**
     * Sets the exported value for this DutchVehicleStatus.
     * 
     * @param exported
     */
    public void setExported(java.lang.Boolean exported) {
        this.exported = exported;
    }


    /**
     * Gets the suspended value for this DutchVehicleStatus.
     * 
     * @return suspended
     */
    public java.lang.Boolean getSuspended() {
        return suspended;
    }


    /**
     * Sets the suspended value for this DutchVehicleStatus.
     * 
     * @param suspended
     */
    public void setSuspended(java.lang.Boolean suspended) {
        this.suspended = suspended;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehicleStatus)) return false;
        DutchVehicleStatus other = (DutchVehicleStatus) obj;
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
            ((this.missed==null && other.getMissed()==null) || 
             (this.missed!=null &&
              this.missed.equals(other.getMissed()))) &&
            ((this.stolen==null && other.getStolen()==null) || 
             (this.stolen!=null &&
              this.stolen.equals(other.getStolen()))) &&
            ((this.exported==null && other.getExported()==null) || 
             (this.exported!=null &&
              this.exported.equals(other.getExported()))) &&
            ((this.suspended==null && other.getSuspended()==null) || 
             (this.suspended!=null &&
              this.suspended.equals(other.getSuspended())));
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
        if (getMissed() != null) {
            _hashCode += getMissed().hashCode();
        }
        if (getStolen() != null) {
            _hashCode += getStolen().hashCode();
        }
        if (getExported() != null) {
            _hashCode += getExported().hashCode();
        }
        if (getSuspended() != null) {
            _hashCode += getSuspended().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehicleStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleStatus"));
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
        elemField.setFieldName("missed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "missed"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exported");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "exported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspended");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "suspended"));
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
