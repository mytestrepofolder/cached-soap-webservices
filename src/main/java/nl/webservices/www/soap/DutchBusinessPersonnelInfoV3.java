/**
 * DutchBusinessPersonnelInfoV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessPersonnelInfoV3  implements java.io.Serializable {
    private java.lang.Integer fulltime;

    private java.lang.Integer parttime;

    private java.lang.Integer total;

    public DutchBusinessPersonnelInfoV3() {
    }

    public DutchBusinessPersonnelInfoV3(
           java.lang.Integer fulltime,
           java.lang.Integer parttime,
           java.lang.Integer total) {
           this.fulltime = fulltime;
           this.parttime = parttime;
           this.total = total;
    }


    /**
     * Gets the fulltime value for this DutchBusinessPersonnelInfoV3.
     * 
     * @return fulltime
     */
    public java.lang.Integer getFulltime() {
        return fulltime;
    }


    /**
     * Sets the fulltime value for this DutchBusinessPersonnelInfoV3.
     * 
     * @param fulltime
     */
    public void setFulltime(java.lang.Integer fulltime) {
        this.fulltime = fulltime;
    }


    /**
     * Gets the parttime value for this DutchBusinessPersonnelInfoV3.
     * 
     * @return parttime
     */
    public java.lang.Integer getParttime() {
        return parttime;
    }


    /**
     * Sets the parttime value for this DutchBusinessPersonnelInfoV3.
     * 
     * @param parttime
     */
    public void setParttime(java.lang.Integer parttime) {
        this.parttime = parttime;
    }


    /**
     * Gets the total value for this DutchBusinessPersonnelInfoV3.
     * 
     * @return total
     */
    public java.lang.Integer getTotal() {
        return total;
    }


    /**
     * Sets the total value for this DutchBusinessPersonnelInfoV3.
     * 
     * @param total
     */
    public void setTotal(java.lang.Integer total) {
        this.total = total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessPersonnelInfoV3)) return false;
        DutchBusinessPersonnelInfoV3 other = (DutchBusinessPersonnelInfoV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fulltime==null && other.getFulltime()==null) || 
             (this.fulltime!=null &&
              this.fulltime.equals(other.getFulltime()))) &&
            ((this.parttime==null && other.getParttime()==null) || 
             (this.parttime!=null &&
              this.parttime.equals(other.getParttime()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal())));
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
        if (getFulltime() != null) {
            _hashCode += getFulltime().hashCode();
        }
        if (getParttime() != null) {
            _hashCode += getParttime().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessPersonnelInfoV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPersonnelInfoV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulltime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "fulltime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parttime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "parttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
