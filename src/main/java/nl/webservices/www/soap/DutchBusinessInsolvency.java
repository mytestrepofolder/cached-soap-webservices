/**
 * DutchBusinessInsolvency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessInsolvency  implements java.io.Serializable {
    private java.lang.String insolvency_id;

    private nl.webservices.www.soap.DutchBusinessInsolvencyPublication[] events;

    public DutchBusinessInsolvency() {
    }

    public DutchBusinessInsolvency(
           java.lang.String insolvency_id,
           nl.webservices.www.soap.DutchBusinessInsolvencyPublication[] events) {
           this.insolvency_id = insolvency_id;
           this.events = events;
    }


    /**
     * Gets the insolvency_id value for this DutchBusinessInsolvency.
     * 
     * @return insolvency_id
     */
    public java.lang.String getInsolvency_id() {
        return insolvency_id;
    }


    /**
     * Sets the insolvency_id value for this DutchBusinessInsolvency.
     * 
     * @param insolvency_id
     */
    public void setInsolvency_id(java.lang.String insolvency_id) {
        this.insolvency_id = insolvency_id;
    }


    /**
     * Gets the events value for this DutchBusinessInsolvency.
     * 
     * @return events
     */
    public nl.webservices.www.soap.DutchBusinessInsolvencyPublication[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this DutchBusinessInsolvency.
     * 
     * @param events
     */
    public void setEvents(nl.webservices.www.soap.DutchBusinessInsolvencyPublication[] events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessInsolvency)) return false;
        DutchBusinessInsolvency other = (DutchBusinessInsolvency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insolvency_id==null && other.getInsolvency_id()==null) || 
             (this.insolvency_id!=null &&
              this.insolvency_id.equals(other.getInsolvency_id()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getInsolvency_id() != null) {
            _hashCode += getInsolvency_id().hashCode();
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessInsolvency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessInsolvency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insolvency_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insolvency_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessInsolvencyPublication"));
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
