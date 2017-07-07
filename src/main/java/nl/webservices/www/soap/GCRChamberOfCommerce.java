/**
 * GCRChamberOfCommerce.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRChamberOfCommerce  implements java.io.Serializable {
    private java.lang.String chamber_no;

    private java.lang.String dossier_no;

    private java.lang.String sub_dossier_no;

    private java.lang.String administering_chamber_no;

    private java.lang.String trade_register_location;

    public GCRChamberOfCommerce() {
    }

    public GCRChamberOfCommerce(
           java.lang.String chamber_no,
           java.lang.String dossier_no,
           java.lang.String sub_dossier_no,
           java.lang.String administering_chamber_no,
           java.lang.String trade_register_location) {
           this.chamber_no = chamber_no;
           this.dossier_no = dossier_no;
           this.sub_dossier_no = sub_dossier_no;
           this.administering_chamber_no = administering_chamber_no;
           this.trade_register_location = trade_register_location;
    }


    /**
     * Gets the chamber_no value for this GCRChamberOfCommerce.
     * 
     * @return chamber_no
     */
    public java.lang.String getChamber_no() {
        return chamber_no;
    }


    /**
     * Sets the chamber_no value for this GCRChamberOfCommerce.
     * 
     * @param chamber_no
     */
    public void setChamber_no(java.lang.String chamber_no) {
        this.chamber_no = chamber_no;
    }


    /**
     * Gets the dossier_no value for this GCRChamberOfCommerce.
     * 
     * @return dossier_no
     */
    public java.lang.String getDossier_no() {
        return dossier_no;
    }


    /**
     * Sets the dossier_no value for this GCRChamberOfCommerce.
     * 
     * @param dossier_no
     */
    public void setDossier_no(java.lang.String dossier_no) {
        this.dossier_no = dossier_no;
    }


    /**
     * Gets the sub_dossier_no value for this GCRChamberOfCommerce.
     * 
     * @return sub_dossier_no
     */
    public java.lang.String getSub_dossier_no() {
        return sub_dossier_no;
    }


    /**
     * Sets the sub_dossier_no value for this GCRChamberOfCommerce.
     * 
     * @param sub_dossier_no
     */
    public void setSub_dossier_no(java.lang.String sub_dossier_no) {
        this.sub_dossier_no = sub_dossier_no;
    }


    /**
     * Gets the administering_chamber_no value for this GCRChamberOfCommerce.
     * 
     * @return administering_chamber_no
     */
    public java.lang.String getAdministering_chamber_no() {
        return administering_chamber_no;
    }


    /**
     * Sets the administering_chamber_no value for this GCRChamberOfCommerce.
     * 
     * @param administering_chamber_no
     */
    public void setAdministering_chamber_no(java.lang.String administering_chamber_no) {
        this.administering_chamber_no = administering_chamber_no;
    }


    /**
     * Gets the trade_register_location value for this GCRChamberOfCommerce.
     * 
     * @return trade_register_location
     */
    public java.lang.String getTrade_register_location() {
        return trade_register_location;
    }


    /**
     * Sets the trade_register_location value for this GCRChamberOfCommerce.
     * 
     * @param trade_register_location
     */
    public void setTrade_register_location(java.lang.String trade_register_location) {
        this.trade_register_location = trade_register_location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRChamberOfCommerce)) return false;
        GCRChamberOfCommerce other = (GCRChamberOfCommerce) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chamber_no==null && other.getChamber_no()==null) || 
             (this.chamber_no!=null &&
              this.chamber_no.equals(other.getChamber_no()))) &&
            ((this.dossier_no==null && other.getDossier_no()==null) || 
             (this.dossier_no!=null &&
              this.dossier_no.equals(other.getDossier_no()))) &&
            ((this.sub_dossier_no==null && other.getSub_dossier_no()==null) || 
             (this.sub_dossier_no!=null &&
              this.sub_dossier_no.equals(other.getSub_dossier_no()))) &&
            ((this.administering_chamber_no==null && other.getAdministering_chamber_no()==null) || 
             (this.administering_chamber_no!=null &&
              this.administering_chamber_no.equals(other.getAdministering_chamber_no()))) &&
            ((this.trade_register_location==null && other.getTrade_register_location()==null) || 
             (this.trade_register_location!=null &&
              this.trade_register_location.equals(other.getTrade_register_location())));
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
        if (getChamber_no() != null) {
            _hashCode += getChamber_no().hashCode();
        }
        if (getDossier_no() != null) {
            _hashCode += getDossier_no().hashCode();
        }
        if (getSub_dossier_no() != null) {
            _hashCode += getSub_dossier_no().hashCode();
        }
        if (getAdministering_chamber_no() != null) {
            _hashCode += getAdministering_chamber_no().hashCode();
        }
        if (getTrade_register_location() != null) {
            _hashCode += getTrade_register_location().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRChamberOfCommerce.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRChamberOfCommerce"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chamber_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "chamber_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossier_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dossier_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_dossier_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sub_dossier_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administering_chamber_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "administering_chamber_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_register_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_register_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
