/**
 * InsolvencyPublication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyPublication  implements java.io.Serializable {
    private java.lang.String publication_id;

    private java.util.Date date;

    private java.lang.String description;

    private java.lang.String code;

    private java.math.BigInteger authority_code;

    private nl.webservices.www.soap.InsolvencyCourtSession court_session;

    public InsolvencyPublication() {
    }

    public InsolvencyPublication(
           java.lang.String publication_id,
           java.util.Date date,
           java.lang.String description,
           java.lang.String code,
           java.math.BigInteger authority_code,
           nl.webservices.www.soap.InsolvencyCourtSession court_session) {
           this.publication_id = publication_id;
           this.date = date;
           this.description = description;
           this.code = code;
           this.authority_code = authority_code;
           this.court_session = court_session;
    }


    /**
     * Gets the publication_id value for this InsolvencyPublication.
     * 
     * @return publication_id
     */
    public java.lang.String getPublication_id() {
        return publication_id;
    }


    /**
     * Sets the publication_id value for this InsolvencyPublication.
     * 
     * @param publication_id
     */
    public void setPublication_id(java.lang.String publication_id) {
        this.publication_id = publication_id;
    }


    /**
     * Gets the date value for this InsolvencyPublication.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this InsolvencyPublication.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the description value for this InsolvencyPublication.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InsolvencyPublication.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the code value for this InsolvencyPublication.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this InsolvencyPublication.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the authority_code value for this InsolvencyPublication.
     * 
     * @return authority_code
     */
    public java.math.BigInteger getAuthority_code() {
        return authority_code;
    }


    /**
     * Sets the authority_code value for this InsolvencyPublication.
     * 
     * @param authority_code
     */
    public void setAuthority_code(java.math.BigInteger authority_code) {
        this.authority_code = authority_code;
    }


    /**
     * Gets the court_session value for this InsolvencyPublication.
     * 
     * @return court_session
     */
    public nl.webservices.www.soap.InsolvencyCourtSession getCourt_session() {
        return court_session;
    }


    /**
     * Sets the court_session value for this InsolvencyPublication.
     * 
     * @param court_session
     */
    public void setCourt_session(nl.webservices.www.soap.InsolvencyCourtSession court_session) {
        this.court_session = court_session;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyPublication)) return false;
        InsolvencyPublication other = (InsolvencyPublication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publication_id==null && other.getPublication_id()==null) || 
             (this.publication_id!=null &&
              this.publication_id.equals(other.getPublication_id()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.authority_code==null && other.getAuthority_code()==null) || 
             (this.authority_code!=null &&
              this.authority_code.equals(other.getAuthority_code()))) &&
            ((this.court_session==null && other.getCourt_session()==null) || 
             (this.court_session!=null &&
              this.court_session.equals(other.getCourt_session())));
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
        if (getPublication_id() != null) {
            _hashCode += getPublication_id().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getAuthority_code() != null) {
            _hashCode += getAuthority_code().hashCode();
        }
        if (getCourt_session() != null) {
            _hashCode += getCourt_session().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyPublication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyPublication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publication_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "publication_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authority_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "authority_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("court_session");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "court_session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyCourtSession"));
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
