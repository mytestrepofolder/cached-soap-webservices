/**
 * DutchBusinessInsolvencyPublication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessInsolvencyPublication  implements java.io.Serializable {
    private java.lang.String publication_id;

    private java.lang.String description;

    private nl.webservices.www.soap.DutchBusinessDateV3 date;

    public DutchBusinessInsolvencyPublication() {
    }

    public DutchBusinessInsolvencyPublication(
           java.lang.String publication_id,
           java.lang.String description,
           nl.webservices.www.soap.DutchBusinessDateV3 date) {
           this.publication_id = publication_id;
           this.description = description;
           this.date = date;
    }


    /**
     * Gets the publication_id value for this DutchBusinessInsolvencyPublication.
     * 
     * @return publication_id
     */
    public java.lang.String getPublication_id() {
        return publication_id;
    }


    /**
     * Sets the publication_id value for this DutchBusinessInsolvencyPublication.
     * 
     * @param publication_id
     */
    public void setPublication_id(java.lang.String publication_id) {
        this.publication_id = publication_id;
    }


    /**
     * Gets the description value for this DutchBusinessInsolvencyPublication.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchBusinessInsolvencyPublication.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the date value for this DutchBusinessInsolvencyPublication.
     * 
     * @return date
     */
    public nl.webservices.www.soap.DutchBusinessDateV3 getDate() {
        return date;
    }


    /**
     * Sets the date value for this DutchBusinessInsolvencyPublication.
     * 
     * @param date
     */
    public void setDate(nl.webservices.www.soap.DutchBusinessDateV3 date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessInsolvencyPublication)) return false;
        DutchBusinessInsolvencyPublication other = (DutchBusinessInsolvencyPublication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publication_id==null && other.getPublication_id()==null) || 
             (this.publication_id!=null &&
              this.publication_id.equals(other.getPublication_id()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getPublication_id() != null) {
            _hashCode += getPublication_id().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessInsolvencyPublication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessInsolvencyPublication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publication_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publication_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDateV3"));
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
