/**
 * CreditsafeLtdGroupStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdGroupStructure  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeCompanyListEntry ultimate_parent;

    private nl.webservices.www.soap.CreditsafeCompanyListEntry immediate_parent;

    private nl.webservices.www.soap.CreditsafeCompanyListEntry[] subsidiary_companies;

    private nl.webservices.www.soap.CreditsafeCompanyListEntry[] affiliated_companies;

    public CreditsafeLtdGroupStructure() {
    }

    public CreditsafeLtdGroupStructure(
           nl.webservices.www.soap.CreditsafeCompanyListEntry ultimate_parent,
           nl.webservices.www.soap.CreditsafeCompanyListEntry immediate_parent,
           nl.webservices.www.soap.CreditsafeCompanyListEntry[] subsidiary_companies,
           nl.webservices.www.soap.CreditsafeCompanyListEntry[] affiliated_companies) {
           this.ultimate_parent = ultimate_parent;
           this.immediate_parent = immediate_parent;
           this.subsidiary_companies = subsidiary_companies;
           this.affiliated_companies = affiliated_companies;
    }


    /**
     * Gets the ultimate_parent value for this CreditsafeLtdGroupStructure.
     * 
     * @return ultimate_parent
     */
    public nl.webservices.www.soap.CreditsafeCompanyListEntry getUltimate_parent() {
        return ultimate_parent;
    }


    /**
     * Sets the ultimate_parent value for this CreditsafeLtdGroupStructure.
     * 
     * @param ultimate_parent
     */
    public void setUltimate_parent(nl.webservices.www.soap.CreditsafeCompanyListEntry ultimate_parent) {
        this.ultimate_parent = ultimate_parent;
    }


    /**
     * Gets the immediate_parent value for this CreditsafeLtdGroupStructure.
     * 
     * @return immediate_parent
     */
    public nl.webservices.www.soap.CreditsafeCompanyListEntry getImmediate_parent() {
        return immediate_parent;
    }


    /**
     * Sets the immediate_parent value for this CreditsafeLtdGroupStructure.
     * 
     * @param immediate_parent
     */
    public void setImmediate_parent(nl.webservices.www.soap.CreditsafeCompanyListEntry immediate_parent) {
        this.immediate_parent = immediate_parent;
    }


    /**
     * Gets the subsidiary_companies value for this CreditsafeLtdGroupStructure.
     * 
     * @return subsidiary_companies
     */
    public nl.webservices.www.soap.CreditsafeCompanyListEntry[] getSubsidiary_companies() {
        return subsidiary_companies;
    }


    /**
     * Sets the subsidiary_companies value for this CreditsafeLtdGroupStructure.
     * 
     * @param subsidiary_companies
     */
    public void setSubsidiary_companies(nl.webservices.www.soap.CreditsafeCompanyListEntry[] subsidiary_companies) {
        this.subsidiary_companies = subsidiary_companies;
    }


    /**
     * Gets the affiliated_companies value for this CreditsafeLtdGroupStructure.
     * 
     * @return affiliated_companies
     */
    public nl.webservices.www.soap.CreditsafeCompanyListEntry[] getAffiliated_companies() {
        return affiliated_companies;
    }


    /**
     * Sets the affiliated_companies value for this CreditsafeLtdGroupStructure.
     * 
     * @param affiliated_companies
     */
    public void setAffiliated_companies(nl.webservices.www.soap.CreditsafeCompanyListEntry[] affiliated_companies) {
        this.affiliated_companies = affiliated_companies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdGroupStructure)) return false;
        CreditsafeLtdGroupStructure other = (CreditsafeLtdGroupStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ultimate_parent==null && other.getUltimate_parent()==null) || 
             (this.ultimate_parent!=null &&
              this.ultimate_parent.equals(other.getUltimate_parent()))) &&
            ((this.immediate_parent==null && other.getImmediate_parent()==null) || 
             (this.immediate_parent!=null &&
              this.immediate_parent.equals(other.getImmediate_parent()))) &&
            ((this.subsidiary_companies==null && other.getSubsidiary_companies()==null) || 
             (this.subsidiary_companies!=null &&
              java.util.Arrays.equals(this.subsidiary_companies, other.getSubsidiary_companies()))) &&
            ((this.affiliated_companies==null && other.getAffiliated_companies()==null) || 
             (this.affiliated_companies!=null &&
              java.util.Arrays.equals(this.affiliated_companies, other.getAffiliated_companies())));
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
        if (getUltimate_parent() != null) {
            _hashCode += getUltimate_parent().hashCode();
        }
        if (getImmediate_parent() != null) {
            _hashCode += getImmediate_parent().hashCode();
        }
        if (getSubsidiary_companies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary_companies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary_companies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAffiliated_companies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffiliated_companies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffiliated_companies(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeLtdGroupStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdGroupStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimate_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ultimate_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyListEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immediate_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "immediate_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyListEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary_companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "subsidiary_companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyListEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliated_companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "affiliated_companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyListEntry"));
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
