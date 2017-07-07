/**
 * GCRBankruptcy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRBankruptcy  implements java.io.Serializable {
    private java.math.BigInteger official_registration_number;

    private java.lang.Boolean currently_active;

    private java.util.Date date_of_verdict;

    private java.lang.Integer definite_discontinuance_code;

    private java.lang.String definite_discontinuance_text;

    private java.util.Date definite_discontinuance_date;

    private nl.webservices.www.soap.GCRCurator[] curators;

    public GCRBankruptcy() {
    }

    public GCRBankruptcy(
           java.math.BigInteger official_registration_number,
           java.lang.Boolean currently_active,
           java.util.Date date_of_verdict,
           java.lang.Integer definite_discontinuance_code,
           java.lang.String definite_discontinuance_text,
           java.util.Date definite_discontinuance_date,
           nl.webservices.www.soap.GCRCurator[] curators) {
           this.official_registration_number = official_registration_number;
           this.currently_active = currently_active;
           this.date_of_verdict = date_of_verdict;
           this.definite_discontinuance_code = definite_discontinuance_code;
           this.definite_discontinuance_text = definite_discontinuance_text;
           this.definite_discontinuance_date = definite_discontinuance_date;
           this.curators = curators;
    }


    /**
     * Gets the official_registration_number value for this GCRBankruptcy.
     * 
     * @return official_registration_number
     */
    public java.math.BigInteger getOfficial_registration_number() {
        return official_registration_number;
    }


    /**
     * Sets the official_registration_number value for this GCRBankruptcy.
     * 
     * @param official_registration_number
     */
    public void setOfficial_registration_number(java.math.BigInteger official_registration_number) {
        this.official_registration_number = official_registration_number;
    }


    /**
     * Gets the currently_active value for this GCRBankruptcy.
     * 
     * @return currently_active
     */
    public java.lang.Boolean getCurrently_active() {
        return currently_active;
    }


    /**
     * Sets the currently_active value for this GCRBankruptcy.
     * 
     * @param currently_active
     */
    public void setCurrently_active(java.lang.Boolean currently_active) {
        this.currently_active = currently_active;
    }


    /**
     * Gets the date_of_verdict value for this GCRBankruptcy.
     * 
     * @return date_of_verdict
     */
    public java.util.Date getDate_of_verdict() {
        return date_of_verdict;
    }


    /**
     * Sets the date_of_verdict value for this GCRBankruptcy.
     * 
     * @param date_of_verdict
     */
    public void setDate_of_verdict(java.util.Date date_of_verdict) {
        this.date_of_verdict = date_of_verdict;
    }


    /**
     * Gets the definite_discontinuance_code value for this GCRBankruptcy.
     * 
     * @return definite_discontinuance_code
     */
    public java.lang.Integer getDefinite_discontinuance_code() {
        return definite_discontinuance_code;
    }


    /**
     * Sets the definite_discontinuance_code value for this GCRBankruptcy.
     * 
     * @param definite_discontinuance_code
     */
    public void setDefinite_discontinuance_code(java.lang.Integer definite_discontinuance_code) {
        this.definite_discontinuance_code = definite_discontinuance_code;
    }


    /**
     * Gets the definite_discontinuance_text value for this GCRBankruptcy.
     * 
     * @return definite_discontinuance_text
     */
    public java.lang.String getDefinite_discontinuance_text() {
        return definite_discontinuance_text;
    }


    /**
     * Sets the definite_discontinuance_text value for this GCRBankruptcy.
     * 
     * @param definite_discontinuance_text
     */
    public void setDefinite_discontinuance_text(java.lang.String definite_discontinuance_text) {
        this.definite_discontinuance_text = definite_discontinuance_text;
    }


    /**
     * Gets the definite_discontinuance_date value for this GCRBankruptcy.
     * 
     * @return definite_discontinuance_date
     */
    public java.util.Date getDefinite_discontinuance_date() {
        return definite_discontinuance_date;
    }


    /**
     * Sets the definite_discontinuance_date value for this GCRBankruptcy.
     * 
     * @param definite_discontinuance_date
     */
    public void setDefinite_discontinuance_date(java.util.Date definite_discontinuance_date) {
        this.definite_discontinuance_date = definite_discontinuance_date;
    }


    /**
     * Gets the curators value for this GCRBankruptcy.
     * 
     * @return curators
     */
    public nl.webservices.www.soap.GCRCurator[] getCurators() {
        return curators;
    }


    /**
     * Sets the curators value for this GCRBankruptcy.
     * 
     * @param curators
     */
    public void setCurators(nl.webservices.www.soap.GCRCurator[] curators) {
        this.curators = curators;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRBankruptcy)) return false;
        GCRBankruptcy other = (GCRBankruptcy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.official_registration_number==null && other.getOfficial_registration_number()==null) || 
             (this.official_registration_number!=null &&
              this.official_registration_number.equals(other.getOfficial_registration_number()))) &&
            ((this.currently_active==null && other.getCurrently_active()==null) || 
             (this.currently_active!=null &&
              this.currently_active.equals(other.getCurrently_active()))) &&
            ((this.date_of_verdict==null && other.getDate_of_verdict()==null) || 
             (this.date_of_verdict!=null &&
              this.date_of_verdict.equals(other.getDate_of_verdict()))) &&
            ((this.definite_discontinuance_code==null && other.getDefinite_discontinuance_code()==null) || 
             (this.definite_discontinuance_code!=null &&
              this.definite_discontinuance_code.equals(other.getDefinite_discontinuance_code()))) &&
            ((this.definite_discontinuance_text==null && other.getDefinite_discontinuance_text()==null) || 
             (this.definite_discontinuance_text!=null &&
              this.definite_discontinuance_text.equals(other.getDefinite_discontinuance_text()))) &&
            ((this.definite_discontinuance_date==null && other.getDefinite_discontinuance_date()==null) || 
             (this.definite_discontinuance_date!=null &&
              this.definite_discontinuance_date.equals(other.getDefinite_discontinuance_date()))) &&
            ((this.curators==null && other.getCurators()==null) || 
             (this.curators!=null &&
              java.util.Arrays.equals(this.curators, other.getCurators())));
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
        if (getOfficial_registration_number() != null) {
            _hashCode += getOfficial_registration_number().hashCode();
        }
        if (getCurrently_active() != null) {
            _hashCode += getCurrently_active().hashCode();
        }
        if (getDate_of_verdict() != null) {
            _hashCode += getDate_of_verdict().hashCode();
        }
        if (getDefinite_discontinuance_code() != null) {
            _hashCode += getDefinite_discontinuance_code().hashCode();
        }
        if (getDefinite_discontinuance_text() != null) {
            _hashCode += getDefinite_discontinuance_text().hashCode();
        }
        if (getDefinite_discontinuance_date() != null) {
            _hashCode += getDefinite_discontinuance_date().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRBankruptcy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBankruptcy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("official_registration_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "official_registration_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currently_active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "currently_active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_verdict");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_of_verdict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_discontinuance_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_discontinuance_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_discontinuance_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_discontinuance_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definite_discontinuance_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "definite_discontinuance_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRCurator"));
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
