/**
 * InsolvencyPublicationList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyPublicationList  implements java.io.Serializable {
    private java.util.Date date;

    private java.lang.String[] publications;

    public InsolvencyPublicationList() {
    }

    public InsolvencyPublicationList(
           java.util.Date date,
           java.lang.String[] publications) {
           this.date = date;
           this.publications = publications;
    }


    /**
     * Gets the date value for this InsolvencyPublicationList.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this InsolvencyPublicationList.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the publications value for this InsolvencyPublicationList.
     * 
     * @return publications
     */
    public java.lang.String[] getPublications() {
        return publications;
    }


    /**
     * Sets the publications value for this InsolvencyPublicationList.
     * 
     * @param publications
     */
    public void setPublications(java.lang.String[] publications) {
        this.publications = publications;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyPublicationList)) return false;
        InsolvencyPublicationList other = (InsolvencyPublicationList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.publications==null && other.getPublications()==null) || 
             (this.publications!=null &&
              java.util.Arrays.equals(this.publications, other.getPublications())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getPublications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublications(), i);
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
        new org.apache.axis.description.TypeDesc(InsolvencyPublicationList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyPublicationList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
