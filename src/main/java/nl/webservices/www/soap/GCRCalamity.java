/**
 * GCRCalamity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCalamity  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRCalamityEvent[] calamity_events;

    private nl.webservices.www.soap.GCRCalamityOther[] other_calamities;

    public GCRCalamity() {
    }

    public GCRCalamity(
           nl.webservices.www.soap.GCRCalamityEvent[] calamity_events,
           nl.webservices.www.soap.GCRCalamityOther[] other_calamities) {
           this.calamity_events = calamity_events;
           this.other_calamities = other_calamities;
    }


    /**
     * Gets the calamity_events value for this GCRCalamity.
     * 
     * @return calamity_events
     */
    public nl.webservices.www.soap.GCRCalamityEvent[] getCalamity_events() {
        return calamity_events;
    }


    /**
     * Sets the calamity_events value for this GCRCalamity.
     * 
     * @param calamity_events
     */
    public void setCalamity_events(nl.webservices.www.soap.GCRCalamityEvent[] calamity_events) {
        this.calamity_events = calamity_events;
    }


    /**
     * Gets the other_calamities value for this GCRCalamity.
     * 
     * @return other_calamities
     */
    public nl.webservices.www.soap.GCRCalamityOther[] getOther_calamities() {
        return other_calamities;
    }


    /**
     * Sets the other_calamities value for this GCRCalamity.
     * 
     * @param other_calamities
     */
    public void setOther_calamities(nl.webservices.www.soap.GCRCalamityOther[] other_calamities) {
        this.other_calamities = other_calamities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCalamity)) return false;
        GCRCalamity other = (GCRCalamity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calamity_events==null && other.getCalamity_events()==null) || 
             (this.calamity_events!=null &&
              java.util.Arrays.equals(this.calamity_events, other.getCalamity_events()))) &&
            ((this.other_calamities==null && other.getOther_calamities()==null) || 
             (this.other_calamities!=null &&
              java.util.Arrays.equals(this.other_calamities, other.getOther_calamities())));
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
        if (getCalamity_events() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalamity_events());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalamity_events(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOther_calamities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOther_calamities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOther_calamities(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCalamity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCalamity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calamity_events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "calamity_events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCalamityEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_calamities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "other_calamities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCalamityOther"));
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
