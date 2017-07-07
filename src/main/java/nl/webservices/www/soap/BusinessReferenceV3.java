/**
 * BusinessReferenceV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessReferenceV3  implements java.io.Serializable {
    private java.lang.String dossierNo;

    private java.lang.String subDossierNo;

    private java.lang.String tradename;

    private java.lang.String establishmentStreetname;

    private java.lang.String establishmentCity;

    private java.lang.String correspondenceStreetname;

    private java.lang.String correspondenceCity;

    private boolean indicationEconomicallyActive;

    public BusinessReferenceV3() {
    }

    public BusinessReferenceV3(
           java.lang.String dossierNo,
           java.lang.String subDossierNo,
           java.lang.String tradename,
           java.lang.String establishmentStreetname,
           java.lang.String establishmentCity,
           java.lang.String correspondenceStreetname,
           java.lang.String correspondenceCity,
           boolean indicationEconomicallyActive) {
           this.dossierNo = dossierNo;
           this.subDossierNo = subDossierNo;
           this.tradename = tradename;
           this.establishmentStreetname = establishmentStreetname;
           this.establishmentCity = establishmentCity;
           this.correspondenceStreetname = correspondenceStreetname;
           this.correspondenceCity = correspondenceCity;
           this.indicationEconomicallyActive = indicationEconomicallyActive;
    }


    /**
     * Gets the dossierNo value for this BusinessReferenceV3.
     * 
     * @return dossierNo
     */
    public java.lang.String getDossierNo() {
        return dossierNo;
    }


    /**
     * Sets the dossierNo value for this BusinessReferenceV3.
     * 
     * @param dossierNo
     */
    public void setDossierNo(java.lang.String dossierNo) {
        this.dossierNo = dossierNo;
    }


    /**
     * Gets the subDossierNo value for this BusinessReferenceV3.
     * 
     * @return subDossierNo
     */
    public java.lang.String getSubDossierNo() {
        return subDossierNo;
    }


    /**
     * Sets the subDossierNo value for this BusinessReferenceV3.
     * 
     * @param subDossierNo
     */
    public void setSubDossierNo(java.lang.String subDossierNo) {
        this.subDossierNo = subDossierNo;
    }


    /**
     * Gets the tradename value for this BusinessReferenceV3.
     * 
     * @return tradename
     */
    public java.lang.String getTradename() {
        return tradename;
    }


    /**
     * Sets the tradename value for this BusinessReferenceV3.
     * 
     * @param tradename
     */
    public void setTradename(java.lang.String tradename) {
        this.tradename = tradename;
    }


    /**
     * Gets the establishmentStreetname value for this BusinessReferenceV3.
     * 
     * @return establishmentStreetname
     */
    public java.lang.String getEstablishmentStreetname() {
        return establishmentStreetname;
    }


    /**
     * Sets the establishmentStreetname value for this BusinessReferenceV3.
     * 
     * @param establishmentStreetname
     */
    public void setEstablishmentStreetname(java.lang.String establishmentStreetname) {
        this.establishmentStreetname = establishmentStreetname;
    }


    /**
     * Gets the establishmentCity value for this BusinessReferenceV3.
     * 
     * @return establishmentCity
     */
    public java.lang.String getEstablishmentCity() {
        return establishmentCity;
    }


    /**
     * Sets the establishmentCity value for this BusinessReferenceV3.
     * 
     * @param establishmentCity
     */
    public void setEstablishmentCity(java.lang.String establishmentCity) {
        this.establishmentCity = establishmentCity;
    }


    /**
     * Gets the correspondenceStreetname value for this BusinessReferenceV3.
     * 
     * @return correspondenceStreetname
     */
    public java.lang.String getCorrespondenceStreetname() {
        return correspondenceStreetname;
    }


    /**
     * Sets the correspondenceStreetname value for this BusinessReferenceV3.
     * 
     * @param correspondenceStreetname
     */
    public void setCorrespondenceStreetname(java.lang.String correspondenceStreetname) {
        this.correspondenceStreetname = correspondenceStreetname;
    }


    /**
     * Gets the correspondenceCity value for this BusinessReferenceV3.
     * 
     * @return correspondenceCity
     */
    public java.lang.String getCorrespondenceCity() {
        return correspondenceCity;
    }


    /**
     * Sets the correspondenceCity value for this BusinessReferenceV3.
     * 
     * @param correspondenceCity
     */
    public void setCorrespondenceCity(java.lang.String correspondenceCity) {
        this.correspondenceCity = correspondenceCity;
    }


    /**
     * Gets the indicationEconomicallyActive value for this BusinessReferenceV3.
     * 
     * @return indicationEconomicallyActive
     */
    public boolean isIndicationEconomicallyActive() {
        return indicationEconomicallyActive;
    }


    /**
     * Sets the indicationEconomicallyActive value for this BusinessReferenceV3.
     * 
     * @param indicationEconomicallyActive
     */
    public void setIndicationEconomicallyActive(boolean indicationEconomicallyActive) {
        this.indicationEconomicallyActive = indicationEconomicallyActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessReferenceV3)) return false;
        BusinessReferenceV3 other = (BusinessReferenceV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossierNo==null && other.getDossierNo()==null) || 
             (this.dossierNo!=null &&
              this.dossierNo.equals(other.getDossierNo()))) &&
            ((this.subDossierNo==null && other.getSubDossierNo()==null) || 
             (this.subDossierNo!=null &&
              this.subDossierNo.equals(other.getSubDossierNo()))) &&
            ((this.tradename==null && other.getTradename()==null) || 
             (this.tradename!=null &&
              this.tradename.equals(other.getTradename()))) &&
            ((this.establishmentStreetname==null && other.getEstablishmentStreetname()==null) || 
             (this.establishmentStreetname!=null &&
              this.establishmentStreetname.equals(other.getEstablishmentStreetname()))) &&
            ((this.establishmentCity==null && other.getEstablishmentCity()==null) || 
             (this.establishmentCity!=null &&
              this.establishmentCity.equals(other.getEstablishmentCity()))) &&
            ((this.correspondenceStreetname==null && other.getCorrespondenceStreetname()==null) || 
             (this.correspondenceStreetname!=null &&
              this.correspondenceStreetname.equals(other.getCorrespondenceStreetname()))) &&
            ((this.correspondenceCity==null && other.getCorrespondenceCity()==null) || 
             (this.correspondenceCity!=null &&
              this.correspondenceCity.equals(other.getCorrespondenceCity()))) &&
            this.indicationEconomicallyActive == other.isIndicationEconomicallyActive();
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
        if (getDossierNo() != null) {
            _hashCode += getDossierNo().hashCode();
        }
        if (getSubDossierNo() != null) {
            _hashCode += getSubDossierNo().hashCode();
        }
        if (getTradename() != null) {
            _hashCode += getTradename().hashCode();
        }
        if (getEstablishmentStreetname() != null) {
            _hashCode += getEstablishmentStreetname().hashCode();
        }
        if (getEstablishmentCity() != null) {
            _hashCode += getEstablishmentCity().hashCode();
        }
        if (getCorrespondenceStreetname() != null) {
            _hashCode += getCorrespondenceStreetname().hashCode();
        }
        if (getCorrespondenceCity() != null) {
            _hashCode += getCorrespondenceCity().hashCode();
        }
        _hashCode += (isIndicationEconomicallyActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessReferenceV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessReferenceV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DossierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subDossierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SubDossierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Tradename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentStreetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentStreetname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishmentCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "EstablishmentCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceStreetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondenceStreetname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CorrespondenceCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicationEconomicallyActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "IndicationEconomicallyActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
