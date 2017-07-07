/**
 * RiskInsolvency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskInsolvency  implements java.io.Serializable {
    private nl.webservices.www.soap.RiskInsolvencyRegistration registration;

    private nl.webservices.www.soap.RiskInsolvencyPublication[] publications;

    private nl.webservices.www.soap.RiskInsolvencyCurator[] curators;

    private nl.webservices.www.soap.RiskInsolvencyJudge judge;

    public RiskInsolvency() {
    }

    public RiskInsolvency(
           nl.webservices.www.soap.RiskInsolvencyRegistration registration,
           nl.webservices.www.soap.RiskInsolvencyPublication[] publications,
           nl.webservices.www.soap.RiskInsolvencyCurator[] curators,
           nl.webservices.www.soap.RiskInsolvencyJudge judge) {
           this.registration = registration;
           this.publications = publications;
           this.curators = curators;
           this.judge = judge;
    }


    /**
     * Gets the registration value for this RiskInsolvency.
     * 
     * @return registration
     */
    public nl.webservices.www.soap.RiskInsolvencyRegistration getRegistration() {
        return registration;
    }


    /**
     * Sets the registration value for this RiskInsolvency.
     * 
     * @param registration
     */
    public void setRegistration(nl.webservices.www.soap.RiskInsolvencyRegistration registration) {
        this.registration = registration;
    }


    /**
     * Gets the publications value for this RiskInsolvency.
     * 
     * @return publications
     */
    public nl.webservices.www.soap.RiskInsolvencyPublication[] getPublications() {
        return publications;
    }


    /**
     * Sets the publications value for this RiskInsolvency.
     * 
     * @param publications
     */
    public void setPublications(nl.webservices.www.soap.RiskInsolvencyPublication[] publications) {
        this.publications = publications;
    }


    /**
     * Gets the curators value for this RiskInsolvency.
     * 
     * @return curators
     */
    public nl.webservices.www.soap.RiskInsolvencyCurator[] getCurators() {
        return curators;
    }


    /**
     * Sets the curators value for this RiskInsolvency.
     * 
     * @param curators
     */
    public void setCurators(nl.webservices.www.soap.RiskInsolvencyCurator[] curators) {
        this.curators = curators;
    }


    /**
     * Gets the judge value for this RiskInsolvency.
     * 
     * @return judge
     */
    public nl.webservices.www.soap.RiskInsolvencyJudge getJudge() {
        return judge;
    }


    /**
     * Sets the judge value for this RiskInsolvency.
     * 
     * @param judge
     */
    public void setJudge(nl.webservices.www.soap.RiskInsolvencyJudge judge) {
        this.judge = judge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskInsolvency)) return false;
        RiskInsolvency other = (RiskInsolvency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registration==null && other.getRegistration()==null) || 
             (this.registration!=null &&
              this.registration.equals(other.getRegistration()))) &&
            ((this.publications==null && other.getPublications()==null) || 
             (this.publications!=null &&
              java.util.Arrays.equals(this.publications, other.getPublications()))) &&
            ((this.curators==null && other.getCurators()==null) || 
             (this.curators!=null &&
              java.util.Arrays.equals(this.curators, other.getCurators()))) &&
            ((this.judge==null && other.getJudge()==null) || 
             (this.judge!=null &&
              this.judge.equals(other.getJudge())));
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
        if (getRegistration() != null) {
            _hashCode += getRegistration().hashCode();
        }
        if (getPublications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJudge() != null) {
            _hashCode += getJudge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskInsolvency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "registration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvencyRegistration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvencyPublication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvencyCurator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("judge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "judge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvencyJudge"));
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
