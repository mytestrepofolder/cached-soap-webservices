/**
 * RiskCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskCompany  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.lang.String establishment_number;

    private java.lang.String status;

    private java.lang.String[] trade_names;

    private nl.webservices.www.soap.RiskCompanyAddress[] addresses;

    private java.lang.String function_title;

    private java.lang.String function_authorization;

    private java.util.Date function_end_date;

    private nl.webservices.www.soap.RiskInsolvency[] insolvencies;

    private java.util.Date mutation_date;

    public RiskCompany() {
    }

    public RiskCompany(
           java.lang.String dossier_number,
           java.lang.String establishment_number,
           java.lang.String status,
           java.lang.String[] trade_names,
           nl.webservices.www.soap.RiskCompanyAddress[] addresses,
           java.lang.String function_title,
           java.lang.String function_authorization,
           java.util.Date function_end_date,
           nl.webservices.www.soap.RiskInsolvency[] insolvencies,
           java.util.Date mutation_date) {
           this.dossier_number = dossier_number;
           this.establishment_number = establishment_number;
           this.status = status;
           this.trade_names = trade_names;
           this.addresses = addresses;
           this.function_title = function_title;
           this.function_authorization = function_authorization;
           this.function_end_date = function_end_date;
           this.insolvencies = insolvencies;
           this.mutation_date = mutation_date;
    }


    /**
     * Gets the dossier_number value for this RiskCompany.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this RiskCompany.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the establishment_number value for this RiskCompany.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this RiskCompany.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the status value for this RiskCompany.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RiskCompany.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the trade_names value for this RiskCompany.
     * 
     * @return trade_names
     */
    public java.lang.String[] getTrade_names() {
        return trade_names;
    }


    /**
     * Sets the trade_names value for this RiskCompany.
     * 
     * @param trade_names
     */
    public void setTrade_names(java.lang.String[] trade_names) {
        this.trade_names = trade_names;
    }


    /**
     * Gets the addresses value for this RiskCompany.
     * 
     * @return addresses
     */
    public nl.webservices.www.soap.RiskCompanyAddress[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this RiskCompany.
     * 
     * @param addresses
     */
    public void setAddresses(nl.webservices.www.soap.RiskCompanyAddress[] addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the function_title value for this RiskCompany.
     * 
     * @return function_title
     */
    public java.lang.String getFunction_title() {
        return function_title;
    }


    /**
     * Sets the function_title value for this RiskCompany.
     * 
     * @param function_title
     */
    public void setFunction_title(java.lang.String function_title) {
        this.function_title = function_title;
    }


    /**
     * Gets the function_authorization value for this RiskCompany.
     * 
     * @return function_authorization
     */
    public java.lang.String getFunction_authorization() {
        return function_authorization;
    }


    /**
     * Sets the function_authorization value for this RiskCompany.
     * 
     * @param function_authorization
     */
    public void setFunction_authorization(java.lang.String function_authorization) {
        this.function_authorization = function_authorization;
    }


    /**
     * Gets the function_end_date value for this RiskCompany.
     * 
     * @return function_end_date
     */
    public java.util.Date getFunction_end_date() {
        return function_end_date;
    }


    /**
     * Sets the function_end_date value for this RiskCompany.
     * 
     * @param function_end_date
     */
    public void setFunction_end_date(java.util.Date function_end_date) {
        this.function_end_date = function_end_date;
    }


    /**
     * Gets the insolvencies value for this RiskCompany.
     * 
     * @return insolvencies
     */
    public nl.webservices.www.soap.RiskInsolvency[] getInsolvencies() {
        return insolvencies;
    }


    /**
     * Sets the insolvencies value for this RiskCompany.
     * 
     * @param insolvencies
     */
    public void setInsolvencies(nl.webservices.www.soap.RiskInsolvency[] insolvencies) {
        this.insolvencies = insolvencies;
    }


    /**
     * Gets the mutation_date value for this RiskCompany.
     * 
     * @return mutation_date
     */
    public java.util.Date getMutation_date() {
        return mutation_date;
    }


    /**
     * Sets the mutation_date value for this RiskCompany.
     * 
     * @param mutation_date
     */
    public void setMutation_date(java.util.Date mutation_date) {
        this.mutation_date = mutation_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskCompany)) return false;
        RiskCompany other = (RiskCompany) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trade_names==null && other.getTrade_names()==null) || 
             (this.trade_names!=null &&
              java.util.Arrays.equals(this.trade_names, other.getTrade_names()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.function_title==null && other.getFunction_title()==null) || 
             (this.function_title!=null &&
              this.function_title.equals(other.getFunction_title()))) &&
            ((this.function_authorization==null && other.getFunction_authorization()==null) || 
             (this.function_authorization!=null &&
              this.function_authorization.equals(other.getFunction_authorization()))) &&
            ((this.function_end_date==null && other.getFunction_end_date()==null) || 
             (this.function_end_date!=null &&
              this.function_end_date.equals(other.getFunction_end_date()))) &&
            ((this.insolvencies==null && other.getInsolvencies()==null) || 
             (this.insolvencies!=null &&
              java.util.Arrays.equals(this.insolvencies, other.getInsolvencies()))) &&
            ((this.mutation_date==null && other.getMutation_date()==null) || 
             (this.mutation_date!=null &&
              this.mutation_date.equals(other.getMutation_date())));
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
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrade_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrade_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrade_names(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFunction_title() != null) {
            _hashCode += getFunction_title().hashCode();
        }
        if (getFunction_authorization() != null) {
            _hashCode += getFunction_authorization().hashCode();
        }
        if (getFunction_end_date() != null) {
            _hashCode += getFunction_end_date().hashCode();
        }
        if (getInsolvencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsolvencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsolvencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMutation_date() != null) {
            _hashCode += getMutation_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishment_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskCompanyAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "function_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insolvencies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insolvencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskInsolvency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutation_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "mutation_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
