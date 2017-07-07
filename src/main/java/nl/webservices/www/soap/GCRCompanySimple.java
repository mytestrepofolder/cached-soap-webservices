/**
 * GCRCompanySimple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRCompanySimple  implements java.io.Serializable {
    private java.math.BigInteger graydon_company_id;

    private nl.webservices.www.soap.GCRContactDetails contact_details;

    private nl.webservices.www.soap.GCROfficialData official_data;

    private nl.webservices.www.soap.GCRHistory history;

    private nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry;

    public GCRCompanySimple() {
    }

    public GCRCompanySimple(
           java.math.BigInteger graydon_company_id,
           nl.webservices.www.soap.GCRContactDetails contact_details,
           nl.webservices.www.soap.GCROfficialData official_data,
           nl.webservices.www.soap.GCRHistory history,
           nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry) {
           this.graydon_company_id = graydon_company_id;
           this.contact_details = contact_details;
           this.official_data = official_data;
           this.history = history;
           this.sectors_of_industry = sectors_of_industry;
    }


    /**
     * Gets the graydon_company_id value for this GCRCompanySimple.
     * 
     * @return graydon_company_id
     */
    public java.math.BigInteger getGraydon_company_id() {
        return graydon_company_id;
    }


    /**
     * Sets the graydon_company_id value for this GCRCompanySimple.
     * 
     * @param graydon_company_id
     */
    public void setGraydon_company_id(java.math.BigInteger graydon_company_id) {
        this.graydon_company_id = graydon_company_id;
    }


    /**
     * Gets the contact_details value for this GCRCompanySimple.
     * 
     * @return contact_details
     */
    public nl.webservices.www.soap.GCRContactDetails getContact_details() {
        return contact_details;
    }


    /**
     * Sets the contact_details value for this GCRCompanySimple.
     * 
     * @param contact_details
     */
    public void setContact_details(nl.webservices.www.soap.GCRContactDetails contact_details) {
        this.contact_details = contact_details;
    }


    /**
     * Gets the official_data value for this GCRCompanySimple.
     * 
     * @return official_data
     */
    public nl.webservices.www.soap.GCROfficialData getOfficial_data() {
        return official_data;
    }


    /**
     * Sets the official_data value for this GCRCompanySimple.
     * 
     * @param official_data
     */
    public void setOfficial_data(nl.webservices.www.soap.GCROfficialData official_data) {
        this.official_data = official_data;
    }


    /**
     * Gets the history value for this GCRCompanySimple.
     * 
     * @return history
     */
    public nl.webservices.www.soap.GCRHistory getHistory() {
        return history;
    }


    /**
     * Sets the history value for this GCRCompanySimple.
     * 
     * @param history
     */
    public void setHistory(nl.webservices.www.soap.GCRHistory history) {
        this.history = history;
    }


    /**
     * Gets the sectors_of_industry value for this GCRCompanySimple.
     * 
     * @return sectors_of_industry
     */
    public nl.webservices.www.soap.GCRSectorOfIndustry[] getSectors_of_industry() {
        return sectors_of_industry;
    }


    /**
     * Sets the sectors_of_industry value for this GCRCompanySimple.
     * 
     * @param sectors_of_industry
     */
    public void setSectors_of_industry(nl.webservices.www.soap.GCRSectorOfIndustry[] sectors_of_industry) {
        this.sectors_of_industry = sectors_of_industry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRCompanySimple)) return false;
        GCRCompanySimple other = (GCRCompanySimple) obj;
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
            ((this.contact_details==null && other.getContact_details()==null) || 
             (this.contact_details!=null &&
              this.contact_details.equals(other.getContact_details()))) &&
            ((this.official_data==null && other.getOfficial_data()==null) || 
             (this.official_data!=null &&
              this.official_data.equals(other.getOfficial_data()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              this.history.equals(other.getHistory()))) &&
            ((this.sectors_of_industry==null && other.getSectors_of_industry()==null) || 
             (this.sectors_of_industry!=null &&
              java.util.Arrays.equals(this.sectors_of_industry, other.getSectors_of_industry())));
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
        if (getContact_details() != null) {
            _hashCode += getContact_details().hashCode();
        }
        if (getOfficial_data() != null) {
            _hashCode += getOfficial_data().hashCode();
        }
        if (getHistory() != null) {
            _hashCode += getHistory().hashCode();
        }
        if (getSectors_of_industry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSectors_of_industry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSectors_of_industry(), i);
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
        new org.apache.axis.description.TypeDesc(GCRCompanySimple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCompanySimple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graydon_company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydon_company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "contact_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("official_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "official_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCROfficialData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectors_of_industry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sectors_of_industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRSectorOfIndustry"));
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
