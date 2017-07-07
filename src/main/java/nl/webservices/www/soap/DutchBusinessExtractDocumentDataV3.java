/**
 * DutchBusinessExtractDocumentDataV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessExtractDocumentDataV3  implements java.io.Serializable {
    private byte[] document;

    private nl.webservices.www.soap.DutchBusinessExtractDataV3 data;

    private byte[] source;

    public DutchBusinessExtractDocumentDataV3() {
    }

    public DutchBusinessExtractDocumentDataV3(
           byte[] document,
           nl.webservices.www.soap.DutchBusinessExtractDataV3 data,
           byte[] source) {
           this.document = document;
           this.data = data;
           this.source = source;
    }


    /**
     * Gets the document value for this DutchBusinessExtractDocumentDataV3.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this DutchBusinessExtractDocumentDataV3.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }


    /**
     * Gets the data value for this DutchBusinessExtractDocumentDataV3.
     * 
     * @return data
     */
    public nl.webservices.www.soap.DutchBusinessExtractDataV3 getData() {
        return data;
    }


    /**
     * Sets the data value for this DutchBusinessExtractDocumentDataV3.
     * 
     * @param data
     */
    public void setData(nl.webservices.www.soap.DutchBusinessExtractDataV3 data) {
        this.data = data;
    }


    /**
     * Gets the source value for this DutchBusinessExtractDocumentDataV3.
     * 
     * @return source
     */
    public byte[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this DutchBusinessExtractDocumentDataV3.
     * 
     * @param source
     */
    public void setSource(byte[] source) {
        this.source = source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessExtractDocumentDataV3)) return false;
        DutchBusinessExtractDocumentDataV3 other = (DutchBusinessExtractDocumentDataV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource())));
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
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessExtractDocumentDataV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractDocumentDataV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractDataV3"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
