/**
 * GCRHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRHistory  implements java.io.Serializable {
    private nl.webservices.www.soap.GCROriginatedFrom[] originated_from;

    private nl.webservices.www.soap.GCRContinuation[] continuation;

    private nl.webservices.www.soap.GCRCompanyContinuedUnder[] company_continued_under;

    public GCRHistory() {
    }

    public GCRHistory(
           nl.webservices.www.soap.GCROriginatedFrom[] originated_from,
           nl.webservices.www.soap.GCRContinuation[] continuation,
           nl.webservices.www.soap.GCRCompanyContinuedUnder[] company_continued_under) {
           this.originated_from = originated_from;
           this.continuation = continuation;
           this.company_continued_under = company_continued_under;
    }


    /**
     * Gets the originated_from value for this GCRHistory.
     * 
     * @return originated_from
     */
    public nl.webservices.www.soap.GCROriginatedFrom[] getOriginated_from() {
        return originated_from;
    }


    /**
     * Sets the originated_from value for this GCRHistory.
     * 
     * @param originated_from
     */
    public void setOriginated_from(nl.webservices.www.soap.GCROriginatedFrom[] originated_from) {
        this.originated_from = originated_from;
    }


    /**
     * Gets the continuation value for this GCRHistory.
     * 
     * @return continuation
     */
    public nl.webservices.www.soap.GCRContinuation[] getContinuation() {
        return continuation;
    }


    /**
     * Sets the continuation value for this GCRHistory.
     * 
     * @param continuation
     */
    public void setContinuation(nl.webservices.www.soap.GCRContinuation[] continuation) {
        this.continuation = continuation;
    }


    /**
     * Gets the company_continued_under value for this GCRHistory.
     * 
     * @return company_continued_under
     */
    public nl.webservices.www.soap.GCRCompanyContinuedUnder[] getCompany_continued_under() {
        return company_continued_under;
    }


    /**
     * Sets the company_continued_under value for this GCRHistory.
     * 
     * @param company_continued_under
     */
    public void setCompany_continued_under(nl.webservices.www.soap.GCRCompanyContinuedUnder[] company_continued_under) {
        this.company_continued_under = company_continued_under;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRHistory)) return false;
        GCRHistory other = (GCRHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originated_from==null && other.getOriginated_from()==null) || 
             (this.originated_from!=null &&
              java.util.Arrays.equals(this.originated_from, other.getOriginated_from()))) &&
            ((this.continuation==null && other.getContinuation()==null) || 
             (this.continuation!=null &&
              java.util.Arrays.equals(this.continuation, other.getContinuation()))) &&
            ((this.company_continued_under==null && other.getCompany_continued_under()==null) || 
             (this.company_continued_under!=null &&
              java.util.Arrays.equals(this.company_continued_under, other.getCompany_continued_under())));
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
        if (getOriginated_from() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginated_from());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginated_from(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContinuation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContinuation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContinuation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompany_continued_under() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompany_continued_under());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompany_continued_under(), i);
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
        new org.apache.axis.description.TypeDesc(GCRHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originated_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "originated_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCROriginatedFrom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continuation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "continuation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRContinuation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_continued_under");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_continued_under"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanyContinuedUnder"));
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
