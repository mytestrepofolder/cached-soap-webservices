/**
 * GCRFinancialDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRFinancialDetails  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRFinancialDetailValue[] turnovers;

    private nl.webservices.www.soap.GCRFinancialDetailValue[] results;

    public GCRFinancialDetails() {
    }

    public GCRFinancialDetails(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRFinancialDetailValue[] turnovers,
           nl.webservices.www.soap.GCRFinancialDetailValue[] results) {
           this.graydon_company_id = graydon_company_id;
           this.turnovers = turnovers;
           this.results = results;
    }


    /**
     * Gets the graydon_company_id value for this GCRFinancialDetails.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRFinancialDetails.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the turnovers value for this GCRFinancialDetails.
     * 
     * @return turnovers
     */
    public nl.webservices.www.soap.GCRFinancialDetailValue[] getTurnovers() {
        return turnovers;
    }


    /**
     * Sets the turnovers value for this GCRFinancialDetails.
     * 
     * @param turnovers
     */
    public void setTurnovers(nl.webservices.www.soap.GCRFinancialDetailValue[] turnovers) {
        this.turnovers = turnovers;
    }


    /**
     * Gets the results value for this GCRFinancialDetails.
     * 
     * @return results
     */
    public nl.webservices.www.soap.GCRFinancialDetailValue[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this GCRFinancialDetails.
     * 
     * @param results
     */
    public void setResults(nl.webservices.www.soap.GCRFinancialDetailValue[] results) {
        this.results = results;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRFinancialDetails)) return false;
        GCRFinancialDetails other = (GCRFinancialDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.graydon_company_id==null && other.getGraydon_company_id()==null) || 
             (this.graydon_company_id!=null &&
              this.graydon_company_id.equals(other.getGraydon_company_id()))) &&
            ((this.turnovers==null && other.getTurnovers()==null) || 
             (this.turnovers!=null &&
              java.util.Arrays.equals(this.turnovers, other.getTurnovers()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults())));
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
        if (getGraydon_company_id() != null) {
            _hashCode += getGraydon_company_id().hashCode();
        }
        if (getTurnovers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTurnovers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTurnovers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
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
        new org.apache.axis.description.TypeDesc(GCRFinancialDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turnovers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "turnovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialDetailValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRFinancialDetailValue"));
        elemField.setMinOccurs(0);
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
