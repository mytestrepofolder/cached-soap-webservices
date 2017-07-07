/**
 * KadasterStukdeelReferentiesLijst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterStukdeelReferentiesLijst  implements java.io.Serializable {
    private java.lang.String[] stukdelen;

    private java.lang.Boolean indicatie_compleet;

    public KadasterStukdeelReferentiesLijst() {
    }

    public KadasterStukdeelReferentiesLijst(
           java.lang.String[] stukdelen,
           java.lang.Boolean indicatie_compleet) {
           this.stukdelen = stukdelen;
           this.indicatie_compleet = indicatie_compleet;
    }


    /**
     * Gets the stukdelen value for this KadasterStukdeelReferentiesLijst.
     * 
     * @return stukdelen
     */
    public java.lang.String[] getStukdelen() {
        return stukdelen;
    }


    /**
     * Sets the stukdelen value for this KadasterStukdeelReferentiesLijst.
     * 
     * @param stukdelen
     */
    public void setStukdelen(java.lang.String[] stukdelen) {
        this.stukdelen = stukdelen;
    }


    /**
     * Gets the indicatie_compleet value for this KadasterStukdeelReferentiesLijst.
     * 
     * @return indicatie_compleet
     */
    public java.lang.Boolean getIndicatie_compleet() {
        return indicatie_compleet;
    }


    /**
     * Sets the indicatie_compleet value for this KadasterStukdeelReferentiesLijst.
     * 
     * @param indicatie_compleet
     */
    public void setIndicatie_compleet(java.lang.Boolean indicatie_compleet) {
        this.indicatie_compleet = indicatie_compleet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterStukdeelReferentiesLijst)) return false;
        KadasterStukdeelReferentiesLijst other = (KadasterStukdeelReferentiesLijst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stukdelen==null && other.getStukdelen()==null) || 
             (this.stukdelen!=null &&
              java.util.Arrays.equals(this.stukdelen, other.getStukdelen()))) &&
            ((this.indicatie_compleet==null && other.getIndicatie_compleet()==null) || 
             (this.indicatie_compleet!=null &&
              this.indicatie_compleet.equals(other.getIndicatie_compleet())));
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
        if (getStukdelen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStukdelen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStukdelen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndicatie_compleet() != null) {
            _hashCode += getIndicatie_compleet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterStukdeelReferentiesLijst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterStukdeelReferentiesLijst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stukdelen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "stukdelen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatie_compleet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "indicatie_compleet"));
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
