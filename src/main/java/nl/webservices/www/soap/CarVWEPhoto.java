/**
 * CarVWEPhoto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEPhoto  implements java.io.Serializable {
    private byte[] image;

    private java.lang.String side;

    private java.lang.String size;

    public CarVWEPhoto() {
    }

    public CarVWEPhoto(
           byte[] image,
           java.lang.String side,
           java.lang.String size) {
           this.image = image;
           this.side = side;
           this.size = size;
    }


    /**
     * Gets the image value for this CarVWEPhoto.
     * 
     * @return image
     */
    public byte[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this CarVWEPhoto.
     * 
     * @param image
     */
    public void setImage(byte[] image) {
        this.image = image;
    }


    /**
     * Gets the side value for this CarVWEPhoto.
     * 
     * @return side
     */
    public java.lang.String getSide() {
        return side;
    }


    /**
     * Sets the side value for this CarVWEPhoto.
     * 
     * @param side
     */
    public void setSide(java.lang.String side) {
        this.side = side;
    }


    /**
     * Gets the size value for this CarVWEPhoto.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this CarVWEPhoto.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEPhoto)) return false;
        CarVWEPhoto other = (CarVWEPhoto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.side==null && other.getSide()==null) || 
             (this.side!=null &&
              this.side.equals(other.getSide()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSide() != null) {
            _hashCode += getSide().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEPhoto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEPhoto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("side");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "side"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "size"));
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
