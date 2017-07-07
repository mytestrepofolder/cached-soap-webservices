/**
 * BusinessSearchSelectionV2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessSearchSelectionV2RequestType  implements java.io.Serializable {
    private java.lang.String[] city;

    private java.lang.String[] postcode;

    private java.lang.String[] sbi;

    private boolean primary_sbi_only;

    private int[] legal_forms;

    private int employees_min;

    private int employees_max;

    private java.lang.String economically_active;

    private java.lang.String financial_status;

    private java.lang.String changed_since;

    private java.lang.String new_since;

    private int page;

    public BusinessSearchSelectionV2RequestType() {
    }

    public BusinessSearchSelectionV2RequestType(
           java.lang.String[] city,
           java.lang.String[] postcode,
           java.lang.String[] sbi,
           boolean primary_sbi_only,
           int[] legal_forms,
           int employees_min,
           int employees_max,
           java.lang.String economically_active,
           java.lang.String financial_status,
           java.lang.String changed_since,
           java.lang.String new_since,
           int page) {
           this.city = city;
           this.postcode = postcode;
           this.sbi = sbi;
           this.primary_sbi_only = primary_sbi_only;
           this.legal_forms = legal_forms;
           this.employees_min = employees_min;
           this.employees_max = employees_max;
           this.economically_active = economically_active;
           this.financial_status = financial_status;
           this.changed_since = changed_since;
           this.new_since = new_since;
           this.page = page;
    }


    /**
     * Gets the city value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return city
     */
    public java.lang.String[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param city
     */
    public void setCity(java.lang.String[] city) {
        this.city = city;
    }


    /**
     * Gets the postcode value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return postcode
     */
    public java.lang.String[] getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String[] postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the sbi value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return sbi
     */
    public java.lang.String[] getSbi() {
        return sbi;
    }


    /**
     * Sets the sbi value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param sbi
     */
    public void setSbi(java.lang.String[] sbi) {
        this.sbi = sbi;
    }


    /**
     * Gets the primary_sbi_only value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return primary_sbi_only
     */
    public boolean isPrimary_sbi_only() {
        return primary_sbi_only;
    }


    /**
     * Sets the primary_sbi_only value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param primary_sbi_only
     */
    public void setPrimary_sbi_only(boolean primary_sbi_only) {
        this.primary_sbi_only = primary_sbi_only;
    }


    /**
     * Gets the legal_forms value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return legal_forms
     */
    public int[] getLegal_forms() {
        return legal_forms;
    }


    /**
     * Sets the legal_forms value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param legal_forms
     */
    public void setLegal_forms(int[] legal_forms) {
        this.legal_forms = legal_forms;
    }


    /**
     * Gets the employees_min value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return employees_min
     */
    public int getEmployees_min() {
        return employees_min;
    }


    /**
     * Sets the employees_min value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param employees_min
     */
    public void setEmployees_min(int employees_min) {
        this.employees_min = employees_min;
    }


    /**
     * Gets the employees_max value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return employees_max
     */
    public int getEmployees_max() {
        return employees_max;
    }


    /**
     * Sets the employees_max value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param employees_max
     */
    public void setEmployees_max(int employees_max) {
        this.employees_max = employees_max;
    }


    /**
     * Gets the economically_active value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return economically_active
     */
    public java.lang.String getEconomically_active() {
        return economically_active;
    }


    /**
     * Sets the economically_active value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param economically_active
     */
    public void setEconomically_active(java.lang.String economically_active) {
        this.economically_active = economically_active;
    }


    /**
     * Gets the financial_status value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return financial_status
     */
    public java.lang.String getFinancial_status() {
        return financial_status;
    }


    /**
     * Sets the financial_status value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param financial_status
     */
    public void setFinancial_status(java.lang.String financial_status) {
        this.financial_status = financial_status;
    }


    /**
     * Gets the changed_since value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return changed_since
     */
    public java.lang.String getChanged_since() {
        return changed_since;
    }


    /**
     * Sets the changed_since value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param changed_since
     */
    public void setChanged_since(java.lang.String changed_since) {
        this.changed_since = changed_since;
    }


    /**
     * Gets the new_since value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return new_since
     */
    public java.lang.String getNew_since() {
        return new_since;
    }


    /**
     * Sets the new_since value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param new_since
     */
    public void setNew_since(java.lang.String new_since) {
        this.new_since = new_since;
    }


    /**
     * Gets the page value for this BusinessSearchSelectionV2RequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this BusinessSearchSelectionV2RequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessSearchSelectionV2RequestType)) return false;
        BusinessSearchSelectionV2RequestType other = (BusinessSearchSelectionV2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              java.util.Arrays.equals(this.postcode, other.getPostcode()))) &&
            ((this.sbi==null && other.getSbi()==null) || 
             (this.sbi!=null &&
              java.util.Arrays.equals(this.sbi, other.getSbi()))) &&
            this.primary_sbi_only == other.isPrimary_sbi_only() &&
            ((this.legal_forms==null && other.getLegal_forms()==null) || 
             (this.legal_forms!=null &&
              java.util.Arrays.equals(this.legal_forms, other.getLegal_forms()))) &&
            this.employees_min == other.getEmployees_min() &&
            this.employees_max == other.getEmployees_max() &&
            ((this.economically_active==null && other.getEconomically_active()==null) || 
             (this.economically_active!=null &&
              this.economically_active.equals(other.getEconomically_active()))) &&
            ((this.financial_status==null && other.getFinancial_status()==null) || 
             (this.financial_status!=null &&
              this.financial_status.equals(other.getFinancial_status()))) &&
            ((this.changed_since==null && other.getChanged_since()==null) || 
             (this.changed_since!=null &&
              this.changed_since.equals(other.getChanged_since()))) &&
            ((this.new_since==null && other.getNew_since()==null) || 
             (this.new_since!=null &&
              this.new_since.equals(other.getNew_since()))) &&
            this.page == other.getPage();
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
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostcode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostcode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostcode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSbi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSbi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSbi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isPrimary_sbi_only() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLegal_forms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegal_forms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegal_forms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getEmployees_min();
        _hashCode += getEmployees_max();
        if (getEconomically_active() != null) {
            _hashCode += getEconomically_active().hashCode();
        }
        if (getFinancial_status() != null) {
            _hashCode += getFinancial_status().hashCode();
        }
        if (getChanged_since() != null) {
            _hashCode += getChanged_since().hashCode();
        }
        if (getNew_since() != null) {
            _hashCode += getNew_since().hashCode();
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessSearchSelectionV2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "businessSearchSelectionV2RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_sbi_only");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "primary_sbi_only"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_forms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_forms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employees_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "employees_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("economically_active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "economically_active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "financial_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changed_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "changed_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_since");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "new_since"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
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
