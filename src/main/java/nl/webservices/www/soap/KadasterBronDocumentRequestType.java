/**
 * KadasterBronDocumentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterBronDocumentRequestType  implements java.io.Serializable {
    private java.lang.String aanduiding_soort_register;

    private java.lang.String deel;

    private java.lang.String nummer;

    private java.lang.String reeks;

    private java.lang.String format;

    public KadasterBronDocumentRequestType() {
    }

    public KadasterBronDocumentRequestType(
           java.lang.String aanduiding_soort_register,
           java.lang.String deel,
           java.lang.String nummer,
           java.lang.String reeks,
           java.lang.String format) {
           this.aanduiding_soort_register = aanduiding_soort_register;
           this.deel = deel;
           this.nummer = nummer;
           this.reeks = reeks;
           this.format = format;
    }


    /**
     * Gets the aanduiding_soort_register value for this KadasterBronDocumentRequestType.
     * 
     * @return aanduiding_soort_register
     */
    public java.lang.String getAanduiding_soort_register() {
        return aanduiding_soort_register;
    }


    /**
     * Sets the aanduiding_soort_register value for this KadasterBronDocumentRequestType.
     * 
     * @param aanduiding_soort_register
     */
    public void setAanduiding_soort_register(java.lang.String aanduiding_soort_register) {
        this.aanduiding_soort_register = aanduiding_soort_register;
    }


    /**
     * Gets the deel value for this KadasterBronDocumentRequestType.
     * 
     * @return deel
     */
    public java.lang.String getDeel() {
        return deel;
    }


    /**
     * Sets the deel value for this KadasterBronDocumentRequestType.
     * 
     * @param deel
     */
    public void setDeel(java.lang.String deel) {
        this.deel = deel;
    }


    /**
     * Gets the nummer value for this KadasterBronDocumentRequestType.
     * 
     * @return nummer
     */
    public java.lang.String getNummer() {
        return nummer;
    }


    /**
     * Sets the nummer value for this KadasterBronDocumentRequestType.
     * 
     * @param nummer
     */
    public void setNummer(java.lang.String nummer) {
        this.nummer = nummer;
    }


    /**
     * Gets the reeks value for this KadasterBronDocumentRequestType.
     * 
     * @return reeks
     */
    public java.lang.String getReeks() {
        return reeks;
    }


    /**
     * Sets the reeks value for this KadasterBronDocumentRequestType.
     * 
     * @param reeks
     */
    public void setReeks(java.lang.String reeks) {
        this.reeks = reeks;
    }


    /**
     * Gets the format value for this KadasterBronDocumentRequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this KadasterBronDocumentRequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterBronDocumentRequestType)) return false;
        KadasterBronDocumentRequestType other = (KadasterBronDocumentRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aanduiding_soort_register==null && other.getAanduiding_soort_register()==null) || 
             (this.aanduiding_soort_register!=null &&
              this.aanduiding_soort_register.equals(other.getAanduiding_soort_register()))) &&
            ((this.deel==null && other.getDeel()==null) || 
             (this.deel!=null &&
              this.deel.equals(other.getDeel()))) &&
            ((this.nummer==null && other.getNummer()==null) || 
             (this.nummer!=null &&
              this.nummer.equals(other.getNummer()))) &&
            ((this.reeks==null && other.getReeks()==null) || 
             (this.reeks!=null &&
              this.reeks.equals(other.getReeks()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat())));
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
        if (getAanduiding_soort_register() != null) {
            _hashCode += getAanduiding_soort_register().hashCode();
        }
        if (getDeel() != null) {
            _hashCode += getDeel().hashCode();
        }
        if (getNummer() != null) {
            _hashCode += getNummer().hashCode();
        }
        if (getReeks() != null) {
            _hashCode += getReeks().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterBronDocumentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterBronDocumentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aanduiding_soort_register");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aanduiding_soort_register"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "deel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nummer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reeks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reeks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "format"));
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
