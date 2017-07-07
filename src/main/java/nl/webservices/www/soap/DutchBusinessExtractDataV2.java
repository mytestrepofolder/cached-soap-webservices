/**
 * DutchBusinessExtractDataV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessExtractDataV2  implements java.io.Serializable {
    private java.lang.String dossier_number;

    private java.util.Calendar reference_date;

    private nl.webservices.www.soap.DutchBusinessLegalEntityV2 legal_entity;

    private nl.webservices.www.soap.DutchBusinessPartnershipV2 partnership;

    private nl.webservices.www.soap.DutchBusinessEnterpriseV2 enterprise;

    private nl.webservices.www.soap.DutchBusinessEstablishmentV2[] establishments;

    private nl.webservices.www.soap.DutchBusinessPositionV2[] positions;

    private java.lang.String[] remarks;

    public DutchBusinessExtractDataV2() {
    }

    public DutchBusinessExtractDataV2(
           java.lang.String dossier_number,
           java.util.Calendar reference_date,
           nl.webservices.www.soap.DutchBusinessLegalEntityV2 legal_entity,
           nl.webservices.www.soap.DutchBusinessPartnershipV2 partnership,
           nl.webservices.www.soap.DutchBusinessEnterpriseV2 enterprise,
           nl.webservices.www.soap.DutchBusinessEstablishmentV2[] establishments,
           nl.webservices.www.soap.DutchBusinessPositionV2[] positions,
           java.lang.String[] remarks) {
           this.dossier_number = dossier_number;
           this.reference_date = reference_date;
           this.legal_entity = legal_entity;
           this.partnership = partnership;
           this.enterprise = enterprise;
           this.establishments = establishments;
           this.positions = positions;
           this.remarks = remarks;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessExtractDataV2.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessExtractDataV2.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the reference_date value for this DutchBusinessExtractDataV2.
     * 
     * @return reference_date
     */
    public java.util.Calendar getReference_date() {
        return reference_date;
    }


    /**
     * Sets the reference_date value for this DutchBusinessExtractDataV2.
     * 
     * @param reference_date
     */
    public void setReference_date(java.util.Calendar reference_date) {
        this.reference_date = reference_date;
    }


    /**
     * Gets the legal_entity value for this DutchBusinessExtractDataV2.
     * 
     * @return legal_entity
     */
    public nl.webservices.www.soap.DutchBusinessLegalEntityV2 getLegal_entity() {
        return legal_entity;
    }


    /**
     * Sets the legal_entity value for this DutchBusinessExtractDataV2.
     * 
     * @param legal_entity
     */
    public void setLegal_entity(nl.webservices.www.soap.DutchBusinessLegalEntityV2 legal_entity) {
        this.legal_entity = legal_entity;
    }


    /**
     * Gets the partnership value for this DutchBusinessExtractDataV2.
     * 
     * @return partnership
     */
    public nl.webservices.www.soap.DutchBusinessPartnershipV2 getPartnership() {
        return partnership;
    }


    /**
     * Sets the partnership value for this DutchBusinessExtractDataV2.
     * 
     * @param partnership
     */
    public void setPartnership(nl.webservices.www.soap.DutchBusinessPartnershipV2 partnership) {
        this.partnership = partnership;
    }


    /**
     * Gets the enterprise value for this DutchBusinessExtractDataV2.
     * 
     * @return enterprise
     */
    public nl.webservices.www.soap.DutchBusinessEnterpriseV2 getEnterprise() {
        return enterprise;
    }


    /**
     * Sets the enterprise value for this DutchBusinessExtractDataV2.
     * 
     * @param enterprise
     */
    public void setEnterprise(nl.webservices.www.soap.DutchBusinessEnterpriseV2 enterprise) {
        this.enterprise = enterprise;
    }


    /**
     * Gets the establishments value for this DutchBusinessExtractDataV2.
     * 
     * @return establishments
     */
    public nl.webservices.www.soap.DutchBusinessEstablishmentV2[] getEstablishments() {
        return establishments;
    }


    /**
     * Sets the establishments value for this DutchBusinessExtractDataV2.
     * 
     * @param establishments
     */
    public void setEstablishments(nl.webservices.www.soap.DutchBusinessEstablishmentV2[] establishments) {
        this.establishments = establishments;
    }


    /**
     * Gets the positions value for this DutchBusinessExtractDataV2.
     * 
     * @return positions
     */
    public nl.webservices.www.soap.DutchBusinessPositionV2[] getPositions() {
        return positions;
    }


    /**
     * Sets the positions value for this DutchBusinessExtractDataV2.
     * 
     * @param positions
     */
    public void setPositions(nl.webservices.www.soap.DutchBusinessPositionV2[] positions) {
        this.positions = positions;
    }


    /**
     * Gets the remarks value for this DutchBusinessExtractDataV2.
     * 
     * @return remarks
     */
    public java.lang.String[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DutchBusinessExtractDataV2.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String[] remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessExtractDataV2)) return false;
        DutchBusinessExtractDataV2 other = (DutchBusinessExtractDataV2) obj;
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
            ((this.reference_date==null && other.getReference_date()==null) || 
             (this.reference_date!=null &&
              this.reference_date.equals(other.getReference_date()))) &&
            ((this.legal_entity==null && other.getLegal_entity()==null) || 
             (this.legal_entity!=null &&
              this.legal_entity.equals(other.getLegal_entity()))) &&
            ((this.partnership==null && other.getPartnership()==null) || 
             (this.partnership!=null &&
              this.partnership.equals(other.getPartnership()))) &&
            ((this.enterprise==null && other.getEnterprise()==null) || 
             (this.enterprise!=null &&
              this.enterprise.equals(other.getEnterprise()))) &&
            ((this.establishments==null && other.getEstablishments()==null) || 
             (this.establishments!=null &&
              java.util.Arrays.equals(this.establishments, other.getEstablishments()))) &&
            ((this.positions==null && other.getPositions()==null) || 
             (this.positions!=null &&
              java.util.Arrays.equals(this.positions, other.getPositions()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks())));
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
        if (getReference_date() != null) {
            _hashCode += getReference_date().hashCode();
        }
        if (getLegal_entity() != null) {
            _hashCode += getLegal_entity().hashCode();
        }
        if (getPartnership() != null) {
            _hashCode += getPartnership().hashCode();
        }
        if (getEnterprise() != null) {
            _hashCode += getEnterprise().hashCode();
        }
        if (getEstablishments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstablishments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstablishments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPositions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
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
        new org.apache.axis.description.TypeDesc(DutchBusinessExtractDataV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractDataV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reference_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_entity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessLegalEntityV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "partnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPartnershipV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterprise");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "enterprise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEnterpriseV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEstablishmentV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "positions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPositionV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
