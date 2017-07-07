/**
 * CreditsafeCompanyUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeCompanyUpdate  implements java.io.Serializable {
    private java.lang.String company_id;

    private java.lang.String[] changes;

    private java.util.Date date_last_update;

    public CreditsafeCompanyUpdate() {
    }

    public CreditsafeCompanyUpdate(
           java.lang.String company_id,
           java.lang.String[] changes,
           java.util.Date date_last_update) {
           this.company_id = company_id;
           this.changes = changes;
           this.date_last_update = date_last_update;
    }


    /**
     * Gets the company_id value for this CreditsafeCompanyUpdate.
     * 
     * @return company_id
     */
    public java.lang.String getCompany_id() {
        return company_id;
    }


    /**
     * Sets the company_id value for this CreditsafeCompanyUpdate.
     * 
     * @param company_id
     */
    public void setCompany_id(java.lang.String company_id) {
        this.company_id = company_id;
    }


    /**
     * Gets the changes value for this CreditsafeCompanyUpdate.
     * 
     * @return changes
     */
    public java.lang.String[] getChanges() {
        return changes;
    }


    /**
     * Sets the changes value for this CreditsafeCompanyUpdate.
     * 
     * @param changes
     */
    public void setChanges(java.lang.String[] changes) {
        this.changes = changes;
    }


    /**
     * Gets the date_last_update value for this CreditsafeCompanyUpdate.
     * 
     * @return date_last_update
     */
    public java.util.Date getDate_last_update() {
        return date_last_update;
    }


    /**
     * Sets the date_last_update value for this CreditsafeCompanyUpdate.
     * 
     * @param date_last_update
     */
    public void setDate_last_update(java.util.Date date_last_update) {
        this.date_last_update = date_last_update;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeCompanyUpdate)) return false;
        CreditsafeCompanyUpdate other = (CreditsafeCompanyUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company_id==null && other.getCompany_id()==null) || 
             (this.company_id!=null &&
              this.company_id.equals(other.getCompany_id()))) &&
            ((this.changes==null && other.getChanges()==null) || 
             (this.changes!=null &&
              java.util.Arrays.equals(this.changes, other.getChanges()))) &&
            ((this.date_last_update==null && other.getDate_last_update()==null) || 
             (this.date_last_update!=null &&
              this.date_last_update.equals(other.getDate_last_update())));
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
        if (getCompany_id() != null) {
            _hashCode += getCompany_id().hashCode();
        }
        if (getChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDate_last_update() != null) {
            _hashCode += getDate_last_update().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeCompanyUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeCompanyUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "company_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "changes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_last_update");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date_last_update"));
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
