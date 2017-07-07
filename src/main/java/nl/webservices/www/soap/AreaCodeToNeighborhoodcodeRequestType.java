/**
 * AreaCodeToNeighborhoodcodeRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AreaCodeToNeighborhoodcodeRequestType  implements java.io.Serializable {
    private java.lang.String areacode;

    private int page;

    public AreaCodeToNeighborhoodcodeRequestType() {
    }

    public AreaCodeToNeighborhoodcodeRequestType(
           java.lang.String areacode,
           int page) {
           this.areacode = areacode;
           this.page = page;
    }


    /**
     * Gets the areacode value for this AreaCodeToNeighborhoodcodeRequestType.
     * 
     * @return areacode
     */
    public java.lang.String getAreacode() {
        return areacode;
    }


    /**
     * Sets the areacode value for this AreaCodeToNeighborhoodcodeRequestType.
     * 
     * @param areacode
     */
    public void setAreacode(java.lang.String areacode) {
        this.areacode = areacode;
    }


    /**
     * Gets the page value for this AreaCodeToNeighborhoodcodeRequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this AreaCodeToNeighborhoodcodeRequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AreaCodeToNeighborhoodcodeRequestType)) return false;
        AreaCodeToNeighborhoodcodeRequestType other = (AreaCodeToNeighborhoodcodeRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.areacode==null && other.getAreacode()==null) || 
             (this.areacode!=null &&
              this.areacode.equals(other.getAreacode()))) &&
            this.page == other.getPage();
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
        if (getAreacode() != null) {
            _hashCode += getAreacode().hashCode();
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AreaCodeToNeighborhoodcodeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "areaCodeToNeighborhoodcodeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areacode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "areacode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
