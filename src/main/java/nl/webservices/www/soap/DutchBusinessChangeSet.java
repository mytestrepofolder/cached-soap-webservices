/**
 * DutchBusinessChangeSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessChangeSet  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchBusinessPeriod period;

    private java.lang.String[] changes;

    public DutchBusinessChangeSet() {
    }

    public DutchBusinessChangeSet(
           nl.webservices.www.soap.DutchBusinessPeriod period,
           java.lang.String[] changes) {
           this.period = period;
           this.changes = changes;
    }


    /**
     * Gets the period value for this DutchBusinessChangeSet.
     * 
     * @return period
     */
    public nl.webservices.www.soap.DutchBusinessPeriod getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this DutchBusinessChangeSet.
     * 
     * @param period
     */
    public void setPeriod(nl.webservices.www.soap.DutchBusinessPeriod period) {
        this.period = period;
    }


    /**
     * Gets the changes value for this DutchBusinessChangeSet.
     * 
     * @return changes
     */
    public java.lang.String[] getChanges() {
        return changes;
    }


    /**
     * Sets the changes value for this DutchBusinessChangeSet.
     * 
     * @param changes
     */
    public void setChanges(java.lang.String[] changes) {
        this.changes = changes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessChangeSet)) return false;
        DutchBusinessChangeSet other = (DutchBusinessChangeSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.changes==null && other.getChanges()==null) || 
             (this.changes!=null &&
              java.util.Arrays.equals(this.changes, other.getChanges())));
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChanges(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessChangeSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessChangeSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPeriod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "changes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
