/**
 * CreditsafeLtdOtherInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeLtdOtherInformation  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeBanker[] bankers;

    private nl.webservices.www.soap.CreditsafeAdvisor[] advisors;

    private nl.webservices.www.soap.CreditsafeEmployeeInformation[] employees_information;

    public CreditsafeLtdOtherInformation() {
    }

    public CreditsafeLtdOtherInformation(
           nl.webservices.www.soap.CreditsafeBanker[] bankers,
           nl.webservices.www.soap.CreditsafeAdvisor[] advisors,
           nl.webservices.www.soap.CreditsafeEmployeeInformation[] employees_information) {
           this.bankers = bankers;
           this.advisors = advisors;
           this.employees_information = employees_information;
    }


    /**
     * Gets the bankers value for this CreditsafeLtdOtherInformation.
     * 
     * @return bankers
     */
    public nl.webservices.www.soap.CreditsafeBanker[] getBankers() {
        return bankers;
    }


    /**
     * Sets the bankers value for this CreditsafeLtdOtherInformation.
     * 
     * @param bankers
     */
    public void setBankers(nl.webservices.www.soap.CreditsafeBanker[] bankers) {
        this.bankers = bankers;
    }


    /**
     * Gets the advisors value for this CreditsafeLtdOtherInformation.
     * 
     * @return advisors
     */
    public nl.webservices.www.soap.CreditsafeAdvisor[] getAdvisors() {
        return advisors;
    }


    /**
     * Sets the advisors value for this CreditsafeLtdOtherInformation.
     * 
     * @param advisors
     */
    public void setAdvisors(nl.webservices.www.soap.CreditsafeAdvisor[] advisors) {
        this.advisors = advisors;
    }


    /**
     * Gets the employees_information value for this CreditsafeLtdOtherInformation.
     * 
     * @return employees_information
     */
    public nl.webservices.www.soap.CreditsafeEmployeeInformation[] getEmployees_information() {
        return employees_information;
    }


    /**
     * Sets the employees_information value for this CreditsafeLtdOtherInformation.
     * 
     * @param employees_information
     */
    public void setEmployees_information(nl.webservices.www.soap.CreditsafeEmployeeInformation[] employees_information) {
        this.employees_information = employees_information;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeLtdOtherInformation)) return false;
        CreditsafeLtdOtherInformation other = (CreditsafeLtdOtherInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankers==null && other.getBankers()==null) || 
             (this.bankers!=null &&
              java.util.Arrays.equals(this.bankers, other.getBankers()))) &&
            ((this.advisors==null && other.getAdvisors()==null) || 
             (this.advisors!=null &&
              java.util.Arrays.equals(this.advisors, other.getAdvisors()))) &&
            ((this.employees_information==null && other.getEmployees_information()==null) || 
             (this.employees_information!=null &&
              java.util.Arrays.equals(this.employees_information, other.getEmployees_information())));
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
        if (getBankers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdvisors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdvisors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdvisors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployees_information() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployees_information());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployees_information(), i);
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
        new org.apache.axis.description.TypeDesc(CreditsafeLtdOtherInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeLtdOtherInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bankers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBanker"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advisors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "advisors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeAdvisor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeEmployeeInformation"));
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
