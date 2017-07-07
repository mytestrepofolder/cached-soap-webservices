/**
 * InsolvencyPublications.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyPublications  implements java.io.Serializable {
    private boolean is_legacy;

    private nl.webservices.www.soap.InsolvencyPublication[] event;

    public InsolvencyPublications() {
    }

    public InsolvencyPublications(
           boolean is_legacy,
           nl.webservices.www.soap.InsolvencyPublication[] event) {
           this.is_legacy = is_legacy;
           this.event = event;
    }


    /**
     * Gets the is_legacy value for this InsolvencyPublications.
     * 
     * @return is_legacy
     */
    public boolean isIs_legacy() {
        return is_legacy;
    }


    /**
     * Sets the is_legacy value for this InsolvencyPublications.
     * 
     * @param is_legacy
     */
    public void setIs_legacy(boolean is_legacy) {
        this.is_legacy = is_legacy;
    }


    /**
     * Gets the event value for this InsolvencyPublications.
     * 
     * @return event
     */
    public nl.webservices.www.soap.InsolvencyPublication[] getEvent() {
        return event;
    }


    /**
     * Sets the event value for this InsolvencyPublications.
     * 
     * @param event
     */
    public void setEvent(nl.webservices.www.soap.InsolvencyPublication[] event) {
        this.event = event;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyPublications)) return false;
        InsolvencyPublications other = (InsolvencyPublications) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.is_legacy == other.isIs_legacy() &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              java.util.Arrays.equals(this.event, other.getEvent())));
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
        _hashCode += (isIs_legacy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent(), i);
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
        new org.apache.axis.description.TypeDesc(InsolvencyPublications.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyPublications"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_legacy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_legacy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyPublication"));
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
