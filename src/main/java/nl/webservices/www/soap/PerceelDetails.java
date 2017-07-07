/**
 * PerceelDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class PerceelDetails  implements java.io.Serializable {
    private nl.webservices.www.soap.KadastraalPerceel perceel;

    private nl.webservices.www.soap.VerenigingVanEigenaren appartementsrecht;

    public PerceelDetails() {
    }

    public PerceelDetails(
           nl.webservices.www.soap.KadastraalPerceel perceel,
           nl.webservices.www.soap.VerenigingVanEigenaren appartementsrecht) {
           this.perceel = perceel;
           this.appartementsrecht = appartementsrecht;
    }


    /**
     * Gets the perceel value for this PerceelDetails.
     * 
     * @return perceel
     */
    public nl.webservices.www.soap.KadastraalPerceel getPerceel() {
        return perceel;
    }


    /**
     * Sets the perceel value for this PerceelDetails.
     * 
     * @param perceel
     */
    public void setPerceel(nl.webservices.www.soap.KadastraalPerceel perceel) {
        this.perceel = perceel;
    }


    /**
     * Gets the appartementsrecht value for this PerceelDetails.
     * 
     * @return appartementsrecht
     */
    public nl.webservices.www.soap.VerenigingVanEigenaren getAppartementsrecht() {
        return appartementsrecht;
    }


    /**
     * Sets the appartementsrecht value for this PerceelDetails.
     * 
     * @param appartementsrecht
     */
    public void setAppartementsrecht(nl.webservices.www.soap.VerenigingVanEigenaren appartementsrecht) {
        this.appartementsrecht = appartementsrecht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerceelDetails)) return false;
        PerceelDetails other = (PerceelDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perceel==null && other.getPerceel()==null) || 
             (this.perceel!=null &&
              this.perceel.equals(other.getPerceel()))) &&
            ((this.appartementsrecht==null && other.getAppartementsrecht()==null) || 
             (this.appartementsrecht!=null &&
              this.appartementsrecht.equals(other.getAppartementsrecht())));
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
        if (getPerceel() != null) {
            _hashCode += getPerceel().hashCode();
        }
        if (getAppartementsrecht() != null) {
            _hashCode += getAppartementsrecht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerceelDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PerceelDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perceel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "perceel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "KadastraalPerceel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appartementsrecht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "appartementsrecht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "VerenigingVanEigenaren"));
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
