/**
 * BusinessReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessReference  implements java.io.Serializable {
    private java.lang.String dossierNo;

    private java.lang.String subDossierNo;

    private java.lang.String tradename;

    private java.lang.String streetname;

    private java.lang.String city;

    public BusinessReference() {
    }

    public BusinessReference(
           java.lang.String dossierNo,
           java.lang.String subDossierNo,
           java.lang.String tradename,
           java.lang.String streetname,
           java.lang.String city) {
           this.dossierNo = dossierNo;
           this.subDossierNo = subDossierNo;
           this.tradename = tradename;
           this.streetname = streetname;
           this.city = city;
    }


    /**
     * Gets the dossierNo value for this BusinessReference.
     * 
     * @return dossierNo
     */
    public java.lang.String getDossierNo() {
        return dossierNo;
    }


    /**
     * Sets the dossierNo value for this BusinessReference.
     * 
     * @param dossierNo
     */
    public void setDossierNo(java.lang.String dossierNo) {
        this.dossierNo = dossierNo;
    }


    /**
     * Gets the subDossierNo value for this BusinessReference.
     * 
     * @return subDossierNo
     */
    public java.lang.String getSubDossierNo() {
        return subDossierNo;
    }


    /**
     * Sets the subDossierNo value for this BusinessReference.
     * 
     * @param subDossierNo
     */
    public void setSubDossierNo(java.lang.String subDossierNo) {
        this.subDossierNo = subDossierNo;
    }


    /**
     * Gets the tradename value for this BusinessReference.
     * 
     * @return tradename
     */
    public java.lang.String getTradename() {
        return tradename;
    }


    /**
     * Sets the tradename value for this BusinessReference.
     * 
     * @param tradename
     */
    public void setTradename(java.lang.String tradename) {
        this.tradename = tradename;
    }


    /**
     * Gets the streetname value for this BusinessReference.
     * 
     * @return streetname
     */
    public java.lang.String getStreetname() {
        return streetname;
    }


    /**
     * Sets the streetname value for this BusinessReference.
     * 
     * @param streetname
     */
    public void setStreetname(java.lang.String streetname) {
        this.streetname = streetname;
    }


    /**
     * Gets the city value for this BusinessReference.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this BusinessReference.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessReference)) return false;
        BusinessReference other = (BusinessReference) obj;
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
            ((this.streetname==null && other.getStreetname()==null) || 
             (this.streetname!=null &&
              this.streetname.equals(other.getStreetname()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity())));
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
        if (getStreetname() != null) {
            _hashCode += getStreetname().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "BusinessReference"));
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
        elemField.setFieldName("streetname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Streetname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
