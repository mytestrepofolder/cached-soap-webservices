/**
 * DutchBusinessDossierReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessDossierReference  implements java.io.Serializable {
    private java.util.Date update_date;

    private nl.webservices.www.soap.DutchBusinessChangeSet change_set;

    public DutchBusinessDossierReference() {
    }

    public DutchBusinessDossierReference(
           java.util.Date update_date,
           nl.webservices.www.soap.DutchBusinessChangeSet change_set) {
           this.update_date = update_date;
           this.change_set = change_set;
    }


    /**
     * Gets the update_date value for this DutchBusinessDossierReference.
     * 
     * @return update_date
     */
    public java.util.Date getUpdate_date() {
        return update_date;
    }


    /**
     * Sets the update_date value for this DutchBusinessDossierReference.
     * 
     * @param update_date
     */
    public void setUpdate_date(java.util.Date update_date) {
        this.update_date = update_date;
    }


    /**
     * Gets the change_set value for this DutchBusinessDossierReference.
     * 
     * @return change_set
     */
    public nl.webservices.www.soap.DutchBusinessChangeSet getChange_set() {
        return change_set;
    }


    /**
     * Sets the change_set value for this DutchBusinessDossierReference.
     * 
     * @param change_set
     */
    public void setChange_set(nl.webservices.www.soap.DutchBusinessChangeSet change_set) {
        this.change_set = change_set;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessDossierReference)) return false;
        DutchBusinessDossierReference other = (DutchBusinessDossierReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.update_date==null && other.getUpdate_date()==null) || 
             (this.update_date!=null &&
              this.update_date.equals(other.getUpdate_date()))) &&
            ((this.change_set==null && other.getChange_set()==null) || 
             (this.change_set!=null &&
              this.change_set.equals(other.getChange_set())));
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
        if (getUpdate_date() != null) {
            _hashCode += getUpdate_date().hashCode();
        }
        if (getChange_set() != null) {
            _hashCode += getChange_set().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessDossierReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessDossierReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "update_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_set");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "change_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessChangeSet"));
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
