/**
 * EDRScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class EDRScore  implements java.io.Serializable {
    private int person_score;

    private int region_score;

    private int edr_region_score;

    private int weighted_score;

    public EDRScore() {
    }

    public EDRScore(
           int person_score,
           int region_score,
           int edr_region_score,
           int weighted_score) {
           this.person_score = person_score;
           this.region_score = region_score;
           this.edr_region_score = edr_region_score;
           this.weighted_score = weighted_score;
    }


    /**
     * Gets the person_score value for this EDRScore.
     * 
     * @return person_score
     */
    public int getPerson_score() {
        return person_score;
    }


    /**
     * Sets the person_score value for this EDRScore.
     * 
     * @param person_score
     */
    public void setPerson_score(int person_score) {
        this.person_score = person_score;
    }


    /**
     * Gets the region_score value for this EDRScore.
     * 
     * @return region_score
     */
    public int getRegion_score() {
        return region_score;
    }


    /**
     * Sets the region_score value for this EDRScore.
     * 
     * @param region_score
     */
    public void setRegion_score(int region_score) {
        this.region_score = region_score;
    }


    /**
     * Gets the edr_region_score value for this EDRScore.
     * 
     * @return edr_region_score
     */
    public int getEdr_region_score() {
        return edr_region_score;
    }


    /**
     * Sets the edr_region_score value for this EDRScore.
     * 
     * @param edr_region_score
     */
    public void setEdr_region_score(int edr_region_score) {
        this.edr_region_score = edr_region_score;
    }


    /**
     * Gets the weighted_score value for this EDRScore.
     * 
     * @return weighted_score
     */
    public int getWeighted_score() {
        return weighted_score;
    }


    /**
     * Sets the weighted_score value for this EDRScore.
     * 
     * @param weighted_score
     */
    public void setWeighted_score(int weighted_score) {
        this.weighted_score = weighted_score;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EDRScore)) return false;
        EDRScore other = (EDRScore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.person_score == other.getPerson_score() &&
            this.region_score == other.getRegion_score() &&
            this.edr_region_score == other.getEdr_region_score() &&
            this.weighted_score == other.getWeighted_score();
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
        _hashCode += getPerson_score();
        _hashCode += getRegion_score();
        _hashCode += getEdr_region_score();
        _hashCode += getWeighted_score();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EDRScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EDRScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "person_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "region_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edr_region_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "edr_region_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weighted_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "weighted_score"));
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
