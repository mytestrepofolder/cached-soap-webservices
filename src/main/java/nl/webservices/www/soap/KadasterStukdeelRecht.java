/**
 * KadasterStukdeelRecht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class KadasterStukdeelRecht  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String type;

    private java.lang.String omschrijving;

    private java.lang.String aandeel_in_recht;

    private java.lang.String totaal_aandeel_in_recht;

    private java.lang.String object_id;

    private java.lang.String gerelateerd_recht;

    public KadasterStukdeelRecht() {
    }

    public KadasterStukdeelRecht(
           java.lang.String id,
           java.lang.String type,
           java.lang.String omschrijving,
           java.lang.String aandeel_in_recht,
           java.lang.String totaal_aandeel_in_recht,
           java.lang.String object_id,
           java.lang.String gerelateerd_recht) {
           this.id = id;
           this.type = type;
           this.omschrijving = omschrijving;
           this.aandeel_in_recht = aandeel_in_recht;
           this.totaal_aandeel_in_recht = totaal_aandeel_in_recht;
           this.object_id = object_id;
           this.gerelateerd_recht = gerelateerd_recht;
    }


    /**
     * Gets the id value for this KadasterStukdeelRecht.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this KadasterStukdeelRecht.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the type value for this KadasterStukdeelRecht.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this KadasterStukdeelRecht.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the omschrijving value for this KadasterStukdeelRecht.
     * 
     * @return omschrijving
     */
    public java.lang.String getOmschrijving() {
        return omschrijving;
    }


    /**
     * Sets the omschrijving value for this KadasterStukdeelRecht.
     * 
     * @param omschrijving
     */
    public void setOmschrijving(java.lang.String omschrijving) {
        this.omschrijving = omschrijving;
    }


    /**
     * Gets the aandeel_in_recht value for this KadasterStukdeelRecht.
     * 
     * @return aandeel_in_recht
     */
    public java.lang.String getAandeel_in_recht() {
        return aandeel_in_recht;
    }


    /**
     * Sets the aandeel_in_recht value for this KadasterStukdeelRecht.
     * 
     * @param aandeel_in_recht
     */
    public void setAandeel_in_recht(java.lang.String aandeel_in_recht) {
        this.aandeel_in_recht = aandeel_in_recht;
    }


    /**
     * Gets the totaal_aandeel_in_recht value for this KadasterStukdeelRecht.
     * 
     * @return totaal_aandeel_in_recht
     */
    public java.lang.String getTotaal_aandeel_in_recht() {
        return totaal_aandeel_in_recht;
    }


    /**
     * Sets the totaal_aandeel_in_recht value for this KadasterStukdeelRecht.
     * 
     * @param totaal_aandeel_in_recht
     */
    public void setTotaal_aandeel_in_recht(java.lang.String totaal_aandeel_in_recht) {
        this.totaal_aandeel_in_recht = totaal_aandeel_in_recht;
    }


    /**
     * Gets the object_id value for this KadasterStukdeelRecht.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this KadasterStukdeelRecht.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the gerelateerd_recht value for this KadasterStukdeelRecht.
     * 
     * @return gerelateerd_recht
     */
    public java.lang.String getGerelateerd_recht() {
        return gerelateerd_recht;
    }


    /**
     * Sets the gerelateerd_recht value for this KadasterStukdeelRecht.
     * 
     * @param gerelateerd_recht
     */
    public void setGerelateerd_recht(java.lang.String gerelateerd_recht) {
        this.gerelateerd_recht = gerelateerd_recht;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KadasterStukdeelRecht)) return false;
        KadasterStukdeelRecht other = (KadasterStukdeelRecht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.omschrijving==null && other.getOmschrijving()==null) || 
             (this.omschrijving!=null &&
              this.omschrijving.equals(other.getOmschrijving()))) &&
            ((this.aandeel_in_recht==null && other.getAandeel_in_recht()==null) || 
             (this.aandeel_in_recht!=null &&
              this.aandeel_in_recht.equals(other.getAandeel_in_recht()))) &&
            ((this.totaal_aandeel_in_recht==null && other.getTotaal_aandeel_in_recht()==null) || 
             (this.totaal_aandeel_in_recht!=null &&
              this.totaal_aandeel_in_recht.equals(other.getTotaal_aandeel_in_recht()))) &&
            ((this.object_id==null && other.getObject_id()==null) || 
             (this.object_id!=null &&
              this.object_id.equals(other.getObject_id()))) &&
            ((this.gerelateerd_recht==null && other.getGerelateerd_recht()==null) || 
             (this.gerelateerd_recht!=null &&
              this.gerelateerd_recht.equals(other.getGerelateerd_recht())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOmschrijving() != null) {
            _hashCode += getOmschrijving().hashCode();
        }
        if (getAandeel_in_recht() != null) {
            _hashCode += getAandeel_in_recht().hashCode();
        }
        if (getTotaal_aandeel_in_recht() != null) {
            _hashCode += getTotaal_aandeel_in_recht().hashCode();
        }
        if (getObject_id() != null) {
            _hashCode += getObject_id().hashCode();
        }
        if (getGerelateerd_recht() != null) {
            _hashCode += getGerelateerd_recht().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KadasterStukdeelRecht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "kadasterStukdeelRecht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omschrijving");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "omschrijving"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aandeel_in_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "aandeel_in_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaal_aandeel_in_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "totaal_aandeel_in_recht"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerelateerd_recht");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gerelateerd_recht"));
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
