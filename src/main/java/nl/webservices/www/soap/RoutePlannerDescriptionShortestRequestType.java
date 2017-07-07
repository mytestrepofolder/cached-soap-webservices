/**
 * RoutePlannerDescriptionShortestRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerDescriptionShortestRequestType  implements java.io.Serializable {
    private java.lang.String postcodefrom;

    private java.lang.String postcodeto;

    private boolean english;

    public RoutePlannerDescriptionShortestRequestType() {
    }

    public RoutePlannerDescriptionShortestRequestType(
           java.lang.String postcodefrom,
           java.lang.String postcodeto,
           boolean english) {
           this.postcodefrom = postcodefrom;
           this.postcodeto = postcodeto;
           this.english = english;
    }


    /**
     * Gets the postcodefrom value for this RoutePlannerDescriptionShortestRequestType.
     * 
     * @return postcodefrom
     */
    public java.lang.String getPostcodefrom() {
        return postcodefrom;
    }


    /**
     * Sets the postcodefrom value for this RoutePlannerDescriptionShortestRequestType.
     * 
     * @param postcodefrom
     */
    public void setPostcodefrom(java.lang.String postcodefrom) {
        this.postcodefrom = postcodefrom;
    }


    /**
     * Gets the postcodeto value for this RoutePlannerDescriptionShortestRequestType.
     * 
     * @return postcodeto
     */
    public java.lang.String getPostcodeto() {
        return postcodeto;
    }


    /**
     * Sets the postcodeto value for this RoutePlannerDescriptionShortestRequestType.
     * 
     * @param postcodeto
     */
    public void setPostcodeto(java.lang.String postcodeto) {
        this.postcodeto = postcodeto;
    }


    /**
     * Gets the english value for this RoutePlannerDescriptionShortestRequestType.
     * 
     * @return english
     */
    public boolean isEnglish() {
        return english;
    }


    /**
     * Sets the english value for this RoutePlannerDescriptionShortestRequestType.
     * 
     * @param english
     */
    public void setEnglish(boolean english) {
        this.english = english;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerDescriptionShortestRequestType)) return false;
        RoutePlannerDescriptionShortestRequestType other = (RoutePlannerDescriptionShortestRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postcodefrom==null && other.getPostcodefrom()==null) || 
             (this.postcodefrom!=null &&
              this.postcodefrom.equals(other.getPostcodefrom()))) &&
            ((this.postcodeto==null && other.getPostcodeto()==null) || 
             (this.postcodeto!=null &&
              this.postcodeto.equals(other.getPostcodeto()))) &&
            this.english == other.isEnglish();
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
        if (getPostcodefrom() != null) {
            _hashCode += getPostcodefrom().hashCode();
        }
        if (getPostcodeto() != null) {
            _hashCode += getPostcodeto().hashCode();
        }
        _hashCode += (isEnglish() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerDescriptionShortestRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerDescriptionShortestRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcodefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcodefrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcodeto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcodeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("english");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "english"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
