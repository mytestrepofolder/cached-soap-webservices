/**
 * CreditsafePreviousDirector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafePreviousDirector  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeDirector director;

    private java.util.Calendar resignation_date;

    public CreditsafePreviousDirector() {
    }

    public CreditsafePreviousDirector(
           nl.webservices.www.soap.CreditsafeDirector director,
           java.util.Calendar resignation_date) {
           this.director = director;
           this.resignation_date = resignation_date;
    }


    /**
     * Gets the director value for this CreditsafePreviousDirector.
     * 
     * @return director
     */
    public nl.webservices.www.soap.CreditsafeDirector getDirector() {
        return director;
    }


    /**
     * Sets the director value for this CreditsafePreviousDirector.
     * 
     * @param director
     */
    public void setDirector(nl.webservices.www.soap.CreditsafeDirector director) {
        this.director = director;
    }


    /**
     * Gets the resignation_date value for this CreditsafePreviousDirector.
     * 
     * @return resignation_date
     */
    public java.util.Calendar getResignation_date() {
        return resignation_date;
    }


    /**
     * Sets the resignation_date value for this CreditsafePreviousDirector.
     * 
     * @param resignation_date
     */
    public void setResignation_date(java.util.Calendar resignation_date) {
        this.resignation_date = resignation_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafePreviousDirector)) return false;
        CreditsafePreviousDirector other = (CreditsafePreviousDirector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.director==null && other.getDirector()==null) || 
             (this.director!=null &&
              this.director.equals(other.getDirector()))) &&
            ((this.resignation_date==null && other.getResignation_date()==null) || 
             (this.resignation_date!=null &&
              this.resignation_date.equals(other.getResignation_date())));
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
        if (getDirector() != null) {
            _hashCode += getDirector().hashCode();
        }
        if (getResignation_date() != null) {
            _hashCode += getResignation_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafePreviousDirector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafePreviousDirector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("director");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "director"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeDirector"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resignation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "resignation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
