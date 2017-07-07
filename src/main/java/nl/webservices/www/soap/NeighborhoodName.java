/**
 * NeighborhoodName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class NeighborhoodName  implements java.io.Serializable {
    private java.lang.String nbcode;

    private java.lang.String nbname;

    public NeighborhoodName() {
    }

    public NeighborhoodName(
           java.lang.String nbcode,
           java.lang.String nbname) {
           this.nbcode = nbcode;
           this.nbname = nbname;
    }


    /**
     * Gets the nbcode value for this NeighborhoodName.
     * 
     * @return nbcode
     */
    public java.lang.String getNbcode() {
        return nbcode;
    }


    /**
     * Sets the nbcode value for this NeighborhoodName.
     * 
     * @param nbcode
     */
    public void setNbcode(java.lang.String nbcode) {
        this.nbcode = nbcode;
    }


    /**
     * Gets the nbname value for this NeighborhoodName.
     * 
     * @return nbname
     */
    public java.lang.String getNbname() {
        return nbname;
    }


    /**
     * Sets the nbname value for this NeighborhoodName.
     * 
     * @param nbname
     */
    public void setNbname(java.lang.String nbname) {
        this.nbname = nbname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NeighborhoodName)) return false;
        NeighborhoodName other = (NeighborhoodName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nbcode==null && other.getNbcode()==null) || 
             (this.nbcode!=null &&
              this.nbcode.equals(other.getNbcode()))) &&
            ((this.nbname==null && other.getNbname()==null) || 
             (this.nbname!=null &&
              this.nbname.equals(other.getNbname())));
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
        if (getNbcode() != null) {
            _hashCode += getNbcode().hashCode();
        }
        if (getNbname() != null) {
            _hashCode += getNbname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NeighborhoodName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "NeighborhoodName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "nbname"));
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
