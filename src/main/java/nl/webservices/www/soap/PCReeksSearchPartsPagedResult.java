/**
 * PCReeksSearchPartsPagedResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class PCReeksSearchPartsPagedResult  implements java.io.Serializable {
    private nl.webservices.www.soap.SearchParts extra;

    private nl.webservices.www.soap.ResultInfo paging;

    private nl.webservices.www.soap.PCReeks[] results;

    public PCReeksSearchPartsPagedResult() {
    }

    public PCReeksSearchPartsPagedResult(
           nl.webservices.www.soap.SearchParts extra,
           nl.webservices.www.soap.ResultInfo paging,
           nl.webservices.www.soap.PCReeks[] results) {
           this.extra = extra;
           this.paging = paging;
           this.results = results;
    }


    /**
     * Gets the extra value for this PCReeksSearchPartsPagedResult.
     * 
     * @return extra
     */
    public nl.webservices.www.soap.SearchParts getExtra() {
        return extra;
    }


    /**
     * Sets the extra value for this PCReeksSearchPartsPagedResult.
     * 
     * @param extra
     */
    public void setExtra(nl.webservices.www.soap.SearchParts extra) {
        this.extra = extra;
    }


    /**
     * Gets the paging value for this PCReeksSearchPartsPagedResult.
     * 
     * @return paging
     */
    public nl.webservices.www.soap.ResultInfo getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this PCReeksSearchPartsPagedResult.
     * 
     * @param paging
     */
    public void setPaging(nl.webservices.www.soap.ResultInfo paging) {
        this.paging = paging;
    }


    /**
     * Gets the results value for this PCReeksSearchPartsPagedResult.
     * 
     * @return results
     */
    public nl.webservices.www.soap.PCReeks[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this PCReeksSearchPartsPagedResult.
     * 
     * @param results
     */
    public void setResults(nl.webservices.www.soap.PCReeks[] results) {
        this.results = results;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCReeksSearchPartsPagedResult)) return false;
        PCReeksSearchPartsPagedResult other = (PCReeksSearchPartsPagedResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extra==null && other.getExtra()==null) || 
             (this.extra!=null &&
              this.extra.equals(other.getExtra()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging()))) &&
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
        if (getExtra() != null) {
            _hashCode += getExtra().hashCode();
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
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
        new org.apache.axis.description.TypeDesc(PCReeksSearchPartsPagedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PCReeksSearchPartsPagedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "extra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SearchParts"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "ResultInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "PCReeks"));
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
