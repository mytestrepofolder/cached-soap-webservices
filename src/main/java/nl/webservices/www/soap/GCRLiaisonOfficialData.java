/**
 * GCRLiaisonOfficialData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRLiaisonOfficialData  implements java.io.Serializable {
    private nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce;

    private java.lang.Integer present_legal_form_code;

    private java.lang.String present_legal_form_text;

    public GCRLiaisonOfficialData() {
    }

    public GCRLiaisonOfficialData(
           nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce,
           java.lang.Integer present_legal_form_code,
           java.lang.String present_legal_form_text) {
           this.chamber_of_commerce = chamber_of_commerce;
           this.present_legal_form_code = present_legal_form_code;
           this.present_legal_form_text = present_legal_form_text;
    }


    /**
     * Gets the chamber_of_commerce value for this GCRLiaisonOfficialData.
     * 
     * @return chamber_of_commerce
     */
    public nl.webservices.www.soap.GCRChamberOfCommerce getChamber_of_commerce() {
        return chamber_of_commerce;
    }


    /**
     * Sets the chamber_of_commerce value for this GCRLiaisonOfficialData.
     * 
     * @param chamber_of_commerce
     */
    public void setChamber_of_commerce(nl.webservices.www.soap.GCRChamberOfCommerce chamber_of_commerce) {
        this.chamber_of_commerce = chamber_of_commerce;
    }


    /**
     * Gets the present_legal_form_code value for this GCRLiaisonOfficialData.
     * 
     * @return present_legal_form_code
     */
    public java.lang.Integer getPresent_legal_form_code() {
        return present_legal_form_code;
    }


    /**
     * Sets the present_legal_form_code value for this GCRLiaisonOfficialData.
     * 
     * @param present_legal_form_code
     */
    public void setPresent_legal_form_code(java.lang.Integer present_legal_form_code) {
        this.present_legal_form_code = present_legal_form_code;
    }


    /**
     * Gets the present_legal_form_text value for this GCRLiaisonOfficialData.
     * 
     * @return present_legal_form_text
     */
    public java.lang.String getPresent_legal_form_text() {
        return present_legal_form_text;
    }


    /**
     * Sets the present_legal_form_text value for this GCRLiaisonOfficialData.
     * 
     * @param present_legal_form_text
     */
    public void setPresent_legal_form_text(java.lang.String present_legal_form_text) {
        this.present_legal_form_text = present_legal_form_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRLiaisonOfficialData)) return false;
        GCRLiaisonOfficialData other = (GCRLiaisonOfficialData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chamber_of_commerce==null && other.getChamber_of_commerce()==null) || 
             (this.chamber_of_commerce!=null &&
              this.chamber_of_commerce.equals(other.getChamber_of_commerce()))) &&
            ((this.present_legal_form_code==null && other.getPresent_legal_form_code()==null) || 
             (this.present_legal_form_code!=null &&
              this.present_legal_form_code.equals(other.getPresent_legal_form_code()))) &&
            ((this.present_legal_form_text==null && other.getPresent_legal_form_text()==null) || 
             (this.present_legal_form_text!=null &&
              this.present_legal_form_text.equals(other.getPresent_legal_form_text())));
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
        if (getChamber_of_commerce() != null) {
            _hashCode += getChamber_of_commerce().hashCode();
        }
        if (getPresent_legal_form_code() != null) {
            _hashCode += getPresent_legal_form_code().hashCode();
        }
        if (getPresent_legal_form_text() != null) {
            _hashCode += getPresent_legal_form_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRLiaisonOfficialData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRLiaisonOfficialData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamber_of_commerce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "chamber_of_commerce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRChamberOfCommerce"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present_legal_form_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "present_legal_form_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present_legal_form_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "present_legal_form_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
