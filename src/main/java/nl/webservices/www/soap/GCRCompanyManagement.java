/**
 * GCRCompanyManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanyManagement  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRManagement[] management;

    private nl.webservices.www.soap.GCRFirstDirector[] first_directors;

    public GCRCompanyManagement() {
    }

    public GCRCompanyManagement(
           nl.webservices.www.soap.GCRManagement[] management,
           nl.webservices.www.soap.GCRFirstDirector[] first_directors) {
           this.management = management;
           this.first_directors = first_directors;
    }


    /**
     * Gets the management value for this GCRCompanyManagement.
     * 
     * @return management
     */
    public nl.webservices.www.soap.GCRManagement[] getManagement() {
        return management;
    }


    /**
     * Sets the management value for this GCRCompanyManagement.
     * 
     * @param management
     */
    public void setManagement(nl.webservices.www.soap.GCRManagement[] management) {
        this.management = management;
    }


    /**
     * Gets the first_directors value for this GCRCompanyManagement.
     * 
     * @return first_directors
     */
    public nl.webservices.www.soap.GCRFirstDirector[] getFirst_directors() {
        return first_directors;
    }


    /**
     * Sets the first_directors value for this GCRCompanyManagement.
     * 
     * @param first_directors
     */
    public void setFirst_directors(nl.webservices.www.soap.GCRFirstDirector[] first_directors) {
        this.first_directors = first_directors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanyManagement)) return false;
        GCRCompanyManagement other = (GCRCompanyManagement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.management==null && other.getManagement()==null) || 
             (this.management!=null &&
              java.util.Arrays.equals(this.management, other.getManagement()))) &&
            ((this.first_directors==null && other.getFirst_directors()==null) || 
             (this.first_directors!=null &&
              java.util.Arrays.equals(this.first_directors, other.getFirst_directors())));
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
        if (getManagement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirst_directors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirst_directors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirst_directors(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCompanyManagement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyManagement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("management");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "management"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRManagement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_directors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "first_directors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFirstDirector"));
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
