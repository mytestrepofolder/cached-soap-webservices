/**
 * BusinessUpdateReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessUpdateReference  implements java.io.Serializable {
    private java.lang.String dossierNo;

    private java.lang.String subDossierNo;

    private java.lang.String[] updateTypes;

    private java.util.Date dateLastUpdate;

    public BusinessUpdateReference() {
    }

    public BusinessUpdateReference(
           java.lang.String dossierNo,
           java.lang.String subDossierNo,
           java.lang.String[] updateTypes,
           java.util.Date dateLastUpdate) {
           this.dossierNo = dossierNo;
           this.subDossierNo = subDossierNo;
           this.updateTypes = updateTypes;
           this.dateLastUpdate = dateLastUpdate;
    }


    /**
     * Gets the dossierNo value for this BusinessUpdateReference.
     * 
     * @return dossierNo
     */
    public java.lang.String getDossierNo() {
        return dossierNo;
    }


    /**
     * Sets the dossierNo value for this BusinessUpdateReference.
     * 
     * @param dossierNo
     */
    public void setDossierNo(java.lang.String dossierNo) {
        this.dossierNo = dossierNo;
    }


    /**
     * Gets the subDossierNo value for this BusinessUpdateReference.
     * 
     * @return subDossierNo
     */
    public java.lang.String getSubDossierNo() {
        return subDossierNo;
    }


    /**
     * Sets the subDossierNo value for this BusinessUpdateReference.
     * 
     * @param subDossierNo
     */
    public void setSubDossierNo(java.lang.String subDossierNo) {
        this.subDossierNo = subDossierNo;
    }


    /**
     * Gets the updateTypes value for this BusinessUpdateReference.
     * 
     * @return updateTypes
     */
    public java.lang.String[] getUpdateTypes() {
        return updateTypes;
    }


    /**
     * Sets the updateTypes value for this BusinessUpdateReference.
     * 
     * @param updateTypes
     */
    public void setUpdateTypes(java.lang.String[] updateTypes) {
        this.updateTypes = updateTypes;
    }


    /**
     * Gets the dateLastUpdate value for this BusinessUpdateReference.
     * 
     * @return dateLastUpdate
     */
    public java.util.Date getDateLastUpdate() {
        return dateLastUpdate;
    }


    /**
     * Sets the dateLastUpdate value for this BusinessUpdateReference.
     * 
     * @param dateLastUpdate
     */
    public void setDateLastUpdate(java.util.Date dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessUpdateReference)) return false;
        BusinessUpdateReference other = (BusinessUpdateReference) obj;
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
            ((this.updateTypes==null && other.getUpdateTypes()==null) || 
             (this.updateTypes!=null &&
              java.util.Arrays.equals(this.updateTypes, other.getUpdateTypes()))) &&
            ((this.dateLastUpdate==null && other.getDateLastUpdate()==null) || 
             (this.dateLastUpdate!=null &&
              this.dateLastUpdate.equals(other.getDateLastUpdate())));
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
        if (getUpdateTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateLastUpdate() != null) {
            _hashCode += getDateLastUpdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessUpdateReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessUpdateReference"));
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
        elemField.setFieldName("updateTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "UpdateTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DateLastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
