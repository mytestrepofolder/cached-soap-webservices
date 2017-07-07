/**
 * DutchBusinessExtractDocumentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessExtractDocumentData  implements java.io.Serializable {
    private byte[] document;

    private java.lang.String dossier_number;

    private java.lang.String establishment_number;

    private java.lang.String status;

    private java.util.Calendar document_date;

    private nl.webservices.www.soap.DutchBusinessLegalEntity legal_entity;

    private nl.webservices.www.soap.DutchBusinessEnterprise enterprise;

    private nl.webservices.www.soap.DutchBusinessPartnership[] partnership;

    private nl.webservices.www.soap.DutchBusinessEstablishment[] establishments;

    private nl.webservices.www.soap.DutchBusinessPosition[] positions;

    public DutchBusinessExtractDocumentData() {
    }

    public DutchBusinessExtractDocumentData(
           byte[] document,
           java.lang.String dossier_number,
           java.lang.String establishment_number,
           java.lang.String status,
           java.util.Calendar document_date,
           nl.webservices.www.soap.DutchBusinessLegalEntity legal_entity,
           nl.webservices.www.soap.DutchBusinessEnterprise enterprise,
           nl.webservices.www.soap.DutchBusinessPartnership[] partnership,
           nl.webservices.www.soap.DutchBusinessEstablishment[] establishments,
           nl.webservices.www.soap.DutchBusinessPosition[] positions) {
           this.document = document;
           this.dossier_number = dossier_number;
           this.establishment_number = establishment_number;
           this.status = status;
           this.document_date = document_date;
           this.legal_entity = legal_entity;
           this.enterprise = enterprise;
           this.partnership = partnership;
           this.establishments = establishments;
           this.positions = positions;
    }


    /**
     * Gets the document value for this DutchBusinessExtractDocumentData.
     * 
     * @return document
     */
    public byte[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this DutchBusinessExtractDocumentData.
     * 
     * @param document
     */
    public void setDocument(byte[] document) {
        this.document = document;
    }


    /**
     * Gets the dossier_number value for this DutchBusinessExtractDocumentData.
     * 
     * @return dossier_number
     */
    public java.lang.String getDossier_number() {
        return dossier_number;
    }


    /**
     * Sets the dossier_number value for this DutchBusinessExtractDocumentData.
     * 
     * @param dossier_number
     */
    public void setDossier_number(java.lang.String dossier_number) {
        this.dossier_number = dossier_number;
    }


    /**
     * Gets the establishment_number value for this DutchBusinessExtractDocumentData.
     * 
     * @return establishment_number
     */
    public java.lang.String getEstablishment_number() {
        return establishment_number;
    }


    /**
     * Sets the establishment_number value for this DutchBusinessExtractDocumentData.
     * 
     * @param establishment_number
     */
    public void setEstablishment_number(java.lang.String establishment_number) {
        this.establishment_number = establishment_number;
    }


    /**
     * Gets the status value for this DutchBusinessExtractDocumentData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DutchBusinessExtractDocumentData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the document_date value for this DutchBusinessExtractDocumentData.
     * 
     * @return document_date
     */
    public java.util.Calendar getDocument_date() {
        return document_date;
    }


    /**
     * Sets the document_date value for this DutchBusinessExtractDocumentData.
     * 
     * @param document_date
     */
    public void setDocument_date(java.util.Calendar document_date) {
        this.document_date = document_date;
    }


    /**
     * Gets the legal_entity value for this DutchBusinessExtractDocumentData.
     * 
     * @return legal_entity
     */
    public nl.webservices.www.soap.DutchBusinessLegalEntity getLegal_entity() {
        return legal_entity;
    }


    /**
     * Sets the legal_entity value for this DutchBusinessExtractDocumentData.
     * 
     * @param legal_entity
     */
    public void setLegal_entity(nl.webservices.www.soap.DutchBusinessLegalEntity legal_entity) {
        this.legal_entity = legal_entity;
    }


    /**
     * Gets the enterprise value for this DutchBusinessExtractDocumentData.
     * 
     * @return enterprise
     */
    public nl.webservices.www.soap.DutchBusinessEnterprise getEnterprise() {
        return enterprise;
    }


    /**
     * Sets the enterprise value for this DutchBusinessExtractDocumentData.
     * 
     * @param enterprise
     */
    public void setEnterprise(nl.webservices.www.soap.DutchBusinessEnterprise enterprise) {
        this.enterprise = enterprise;
    }


    /**
     * Gets the partnership value for this DutchBusinessExtractDocumentData.
     * 
     * @return partnership
     */
    public nl.webservices.www.soap.DutchBusinessPartnership[] getPartnership() {
        return partnership;
    }


    /**
     * Sets the partnership value for this DutchBusinessExtractDocumentData.
     * 
     * @param partnership
     */
    public void setPartnership(nl.webservices.www.soap.DutchBusinessPartnership[] partnership) {
        this.partnership = partnership;
    }


    /**
     * Gets the establishments value for this DutchBusinessExtractDocumentData.
     * 
     * @return establishments
     */
    public nl.webservices.www.soap.DutchBusinessEstablishment[] getEstablishments() {
        return establishments;
    }


    /**
     * Sets the establishments value for this DutchBusinessExtractDocumentData.
     * 
     * @param establishments
     */
    public void setEstablishments(nl.webservices.www.soap.DutchBusinessEstablishment[] establishments) {
        this.establishments = establishments;
    }


    /**
     * Gets the positions value for this DutchBusinessExtractDocumentData.
     * 
     * @return positions
     */
    public nl.webservices.www.soap.DutchBusinessPosition[] getPositions() {
        return positions;
    }


    /**
     * Sets the positions value for this DutchBusinessExtractDocumentData.
     * 
     * @param positions
     */
    public void setPositions(nl.webservices.www.soap.DutchBusinessPosition[] positions) {
        this.positions = positions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessExtractDocumentData)) return false;
        DutchBusinessExtractDocumentData other = (DutchBusinessExtractDocumentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.dossier_number==null && other.getDossier_number()==null) || 
             (this.dossier_number!=null &&
              this.dossier_number.equals(other.getDossier_number()))) &&
            ((this.establishment_number==null && other.getEstablishment_number()==null) || 
             (this.establishment_number!=null &&
              this.establishment_number.equals(other.getEstablishment_number()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.document_date==null && other.getDocument_date()==null) || 
             (this.document_date!=null &&
              this.document_date.equals(other.getDocument_date()))) &&
            ((this.legal_entity==null && other.getLegal_entity()==null) || 
             (this.legal_entity!=null &&
              this.legal_entity.equals(other.getLegal_entity()))) &&
            ((this.enterprise==null && other.getEnterprise()==null) || 
             (this.enterprise!=null &&
              this.enterprise.equals(other.getEnterprise()))) &&
            ((this.partnership==null && other.getPartnership()==null) || 
             (this.partnership!=null &&
              java.util.Arrays.equals(this.partnership, other.getPartnership()))) &&
            ((this.establishments==null && other.getEstablishments()==null) || 
             (this.establishments!=null &&
              java.util.Arrays.equals(this.establishments, other.getEstablishments()))) &&
            ((this.positions==null && other.getPositions()==null) || 
             (this.positions!=null &&
              java.util.Arrays.equals(this.positions, other.getPositions())));
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
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDossier_number() != null) {
            _hashCode += getDossier_number().hashCode();
        }
        if (getEstablishment_number() != null) {
            _hashCode += getEstablishment_number().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDocument_date() != null) {
            _hashCode += getDocument_date().hashCode();
        }
        if (getLegal_entity() != null) {
            _hashCode += getLegal_entity().hashCode();
        }
        if (getEnterprise() != null) {
            _hashCode += getEnterprise().hashCode();
        }
        if (getPartnership() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnership());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnership(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessExtractDocumentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessExtractDocumentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("document_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "document_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_entity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessLegalEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterprise");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "enterprise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEnterprise"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnership");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "partnership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPartnership"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "establishments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessEstablishment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "positions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessPosition"));
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
