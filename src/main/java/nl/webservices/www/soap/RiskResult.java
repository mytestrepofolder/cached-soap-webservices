/**
 * RiskResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskResult  implements java.io.Serializable {
    private java.math.BigInteger person_score;

    private java.math.BigInteger address_score;

    private java.math.BigInteger postcode_score;

    public RiskResult() {
    }

    public RiskResult(
           java.math.BigInteger person_score,
           java.math.BigInteger address_score,
           java.math.BigInteger postcode_score) {
           this.person_score = person_score;
           this.address_score = address_score;
           this.postcode_score = postcode_score;
    }


    /**
     * Gets the person_score value for this RiskResult.
     * 
     * @return person_score
     */
    public java.math.BigInteger getPerson_score() {
        return person_score;
    }


    /**
     * Sets the person_score value for this RiskResult.
     * 
     * @param person_score
     */
    public void setPerson_score(java.math.BigInteger person_score) {
        this.person_score = person_score;
    }


    /**
     * Gets the address_score value for this RiskResult.
     * 
     * @return address_score
     */
    public java.math.BigInteger getAddress_score() {
        return address_score;
    }


    /**
     * Sets the address_score value for this RiskResult.
     * 
     * @param address_score
     */
    public void setAddress_score(java.math.BigInteger address_score) {
        this.address_score = address_score;
    }


    /**
     * Gets the postcode_score value for this RiskResult.
     * 
     * @return postcode_score
     */
    public java.math.BigInteger getPostcode_score() {
        return postcode_score;
    }


    /**
     * Sets the postcode_score value for this RiskResult.
     * 
     * @param postcode_score
     */
    public void setPostcode_score(java.math.BigInteger postcode_score) {
        this.postcode_score = postcode_score;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskResult)) return false;
        RiskResult other = (RiskResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.person_score==null && other.getPerson_score()==null) || 
             (this.person_score!=null &&
              this.person_score.equals(other.getPerson_score()))) &&
            ((this.address_score==null && other.getAddress_score()==null) || 
             (this.address_score!=null &&
              this.address_score.equals(other.getAddress_score()))) &&
            ((this.postcode_score==null && other.getPostcode_score()==null) || 
             (this.postcode_score!=null &&
              this.postcode_score.equals(other.getPostcode_score())));
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
        if (getPerson_score() != null) {
            _hashCode += getPerson_score().hashCode();
        }
        if (getAddress_score() != null) {
            _hashCode += getAddress_score().hashCode();
        }
        if (getPostcode_score() != null) {
            _hashCode += getPostcode_score().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "person_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
