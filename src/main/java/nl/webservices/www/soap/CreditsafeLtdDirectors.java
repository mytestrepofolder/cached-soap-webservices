/**
 * CreditsafeLtdDirectors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdDirectors  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeDirector[] current_directors;

    private nl.webservices.www.soap.CreditsafePreviousDirector[] previous_directors;

    public CreditsafeLtdDirectors() {
    }

    public CreditsafeLtdDirectors(
           nl.webservices.www.soap.CreditsafeDirector[] current_directors,
           nl.webservices.www.soap.CreditsafePreviousDirector[] previous_directors) {
           this.current_directors = current_directors;
           this.previous_directors = previous_directors;
    }


    /**
     * Gets the current_directors value for this CreditsafeLtdDirectors.
     * 
     * @return current_directors
     */
    public nl.webservices.www.soap.CreditsafeDirector[] getCurrent_directors() {
        return current_directors;
    }


    /**
     * Sets the current_directors value for this CreditsafeLtdDirectors.
     * 
     * @param current_directors
     */
    public void setCurrent_directors(nl.webservices.www.soap.CreditsafeDirector[] current_directors) {
        this.current_directors = current_directors;
    }


    /**
     * Gets the previous_directors value for this CreditsafeLtdDirectors.
     * 
     * @return previous_directors
     */
    public nl.webservices.www.soap.CreditsafePreviousDirector[] getPrevious_directors() {
        return previous_directors;
    }


    /**
     * Sets the previous_directors value for this CreditsafeLtdDirectors.
     * 
     * @param previous_directors
     */
    public void setPrevious_directors(nl.webservices.www.soap.CreditsafePreviousDirector[] previous_directors) {
        this.previous_directors = previous_directors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdDirectors)) return false;
        CreditsafeLtdDirectors other = (CreditsafeLtdDirectors) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.current_directors==null && other.getCurrent_directors()==null) || 
             (this.current_directors!=null &&
              java.util.Arrays.equals(this.current_directors, other.getCurrent_directors()))) &&
            ((this.previous_directors==null && other.getPrevious_directors()==null) || 
             (this.previous_directors!=null &&
              java.util.Arrays.equals(this.previous_directors, other.getPrevious_directors())));
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
        if (getCurrent_directors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrent_directors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrent_directors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrevious_directors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrevious_directors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrevious_directors(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeLtdDirectors.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdDirectors"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_directors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "current_directors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeDirector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_directors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_directors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafePreviousDirector"));
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
