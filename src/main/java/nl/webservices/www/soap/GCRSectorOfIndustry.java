/**
 * GCRSectorOfIndustry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRSectorOfIndustry  implements java.io.Serializable {
    private java.lang.Boolean is_primary;

    private java.lang.String sector_code;

    private java.lang.String sector_text;

    public GCRSectorOfIndustry() {
    }

    public GCRSectorOfIndustry(
           java.lang.Boolean is_primary,
           java.lang.String sector_code,
           java.lang.String sector_text) {
           this.is_primary = is_primary;
           this.sector_code = sector_code;
           this.sector_text = sector_text;
    }


    /**
     * Gets the is_primary value for this GCRSectorOfIndustry.
     * 
     * @return is_primary
     */
    public java.lang.Boolean getIs_primary() {
        return is_primary;
    }


    /**
     * Sets the is_primary value for this GCRSectorOfIndustry.
     * 
     * @param is_primary
     */
    public void setIs_primary(java.lang.Boolean is_primary) {
        this.is_primary = is_primary;
    }


    /**
     * Gets the sector_code value for this GCRSectorOfIndustry.
     * 
     * @return sector_code
     */
    public java.lang.String getSector_code() {
        return sector_code;
    }


    /**
     * Sets the sector_code value for this GCRSectorOfIndustry.
     * 
     * @param sector_code
     */
    public void setSector_code(java.lang.String sector_code) {
        this.sector_code = sector_code;
    }


    /**
     * Gets the sector_text value for this GCRSectorOfIndustry.
     * 
     * @return sector_text
     */
    public java.lang.String getSector_text() {
        return sector_text;
    }


    /**
     * Sets the sector_text value for this GCRSectorOfIndustry.
     * 
     * @param sector_text
     */
    public void setSector_text(java.lang.String sector_text) {
        this.sector_text = sector_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRSectorOfIndustry)) return false;
        GCRSectorOfIndustry other = (GCRSectorOfIndustry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.is_primary==null && other.getIs_primary()==null) || 
             (this.is_primary!=null &&
              this.is_primary.equals(other.getIs_primary()))) &&
            ((this.sector_code==null && other.getSector_code()==null) || 
             (this.sector_code!=null &&
              this.sector_code.equals(other.getSector_code()))) &&
            ((this.sector_text==null && other.getSector_text()==null) || 
             (this.sector_text!=null &&
              this.sector_text.equals(other.getSector_text())));
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
        if (getIs_primary() != null) {
            _hashCode += getIs_primary().hashCode();
        }
        if (getSector_code() != null) {
            _hashCode += getSector_code().hashCode();
        }
        if (getSector_text() != null) {
            _hashCode += getSector_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRSectorOfIndustry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRSectorOfIndustry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_primary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sector_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sector_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
