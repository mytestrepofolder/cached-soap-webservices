/**
 * InsolvencyCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyCase  implements java.io.Serializable {
    private java.lang.String insolvency_id;

    private java.lang.String magistrate;

    private java.lang.String previous_insolvency_id;

    private java.lang.String previous_magistrate;

    private boolean is_pre_hgk_published;

    private java.lang.String pre_hgk_insolvency_id;

    private java.lang.String dept_restructuring_number;

    private java.util.Date removal_date;

    private nl.webservices.www.soap.InsolvencyLegalSubject legal_subject;

    private nl.webservices.www.soap.InsolvencyTreatingAuthority treating_authority;

    private nl.webservices.www.soap.InsolvencyCurators curators;

    private nl.webservices.www.soap.InsolvencyReceivers receivers;

    private nl.webservices.www.soap.InsolvencyPublications events;

    private nl.webservices.www.soap.InsolvencyReport[] reports;

    private nl.webservices.www.soap.InsolvencyAffectedCompany[] affected_companies;

    public InsolvencyCase() {
    }

    public InsolvencyCase(
           java.lang.String insolvency_id,
           java.lang.String magistrate,
           java.lang.String previous_insolvency_id,
           java.lang.String previous_magistrate,
           boolean is_pre_hgk_published,
           java.lang.String pre_hgk_insolvency_id,
           java.lang.String dept_restructuring_number,
           java.util.Date removal_date,
           nl.webservices.www.soap.InsolvencyLegalSubject legal_subject,
           nl.webservices.www.soap.InsolvencyTreatingAuthority treating_authority,
           nl.webservices.www.soap.InsolvencyCurators curators,
           nl.webservices.www.soap.InsolvencyReceivers receivers,
           nl.webservices.www.soap.InsolvencyPublications events,
           nl.webservices.www.soap.InsolvencyReport[] reports,
           nl.webservices.www.soap.InsolvencyAffectedCompany[] affected_companies) {
           this.insolvency_id = insolvency_id;
           this.magistrate = magistrate;
           this.previous_insolvency_id = previous_insolvency_id;
           this.previous_magistrate = previous_magistrate;
           this.is_pre_hgk_published = is_pre_hgk_published;
           this.pre_hgk_insolvency_id = pre_hgk_insolvency_id;
           this.dept_restructuring_number = dept_restructuring_number;
           this.removal_date = removal_date;
           this.legal_subject = legal_subject;
           this.treating_authority = treating_authority;
           this.curators = curators;
           this.receivers = receivers;
           this.events = events;
           this.reports = reports;
           this.affected_companies = affected_companies;
    }


    /**
     * Gets the insolvency_id value for this InsolvencyCase.
     * 
     * @return insolvency_id
     */
    public java.lang.String getInsolvency_id() {
        return insolvency_id;
    }


    /**
     * Sets the insolvency_id value for this InsolvencyCase.
     * 
     * @param insolvency_id
     */
    public void setInsolvency_id(java.lang.String insolvency_id) {
        this.insolvency_id = insolvency_id;
    }


    /**
     * Gets the magistrate value for this InsolvencyCase.
     * 
     * @return magistrate
     */
    public java.lang.String getMagistrate() {
        return magistrate;
    }


    /**
     * Sets the magistrate value for this InsolvencyCase.
     * 
     * @param magistrate
     */
    public void setMagistrate(java.lang.String magistrate) {
        this.magistrate = magistrate;
    }


    /**
     * Gets the previous_insolvency_id value for this InsolvencyCase.
     * 
     * @return previous_insolvency_id
     */
    public java.lang.String getPrevious_insolvency_id() {
        return previous_insolvency_id;
    }


    /**
     * Sets the previous_insolvency_id value for this InsolvencyCase.
     * 
     * @param previous_insolvency_id
     */
    public void setPrevious_insolvency_id(java.lang.String previous_insolvency_id) {
        this.previous_insolvency_id = previous_insolvency_id;
    }


    /**
     * Gets the previous_magistrate value for this InsolvencyCase.
     * 
     * @return previous_magistrate
     */
    public java.lang.String getPrevious_magistrate() {
        return previous_magistrate;
    }


    /**
     * Sets the previous_magistrate value for this InsolvencyCase.
     * 
     * @param previous_magistrate
     */
    public void setPrevious_magistrate(java.lang.String previous_magistrate) {
        this.previous_magistrate = previous_magistrate;
    }


    /**
     * Gets the is_pre_hgk_published value for this InsolvencyCase.
     * 
     * @return is_pre_hgk_published
     */
    public boolean isIs_pre_hgk_published() {
        return is_pre_hgk_published;
    }


    /**
     * Sets the is_pre_hgk_published value for this InsolvencyCase.
     * 
     * @param is_pre_hgk_published
     */
    public void setIs_pre_hgk_published(boolean is_pre_hgk_published) {
        this.is_pre_hgk_published = is_pre_hgk_published;
    }


    /**
     * Gets the pre_hgk_insolvency_id value for this InsolvencyCase.
     * 
     * @return pre_hgk_insolvency_id
     */
    public java.lang.String getPre_hgk_insolvency_id() {
        return pre_hgk_insolvency_id;
    }


    /**
     * Sets the pre_hgk_insolvency_id value for this InsolvencyCase.
     * 
     * @param pre_hgk_insolvency_id
     */
    public void setPre_hgk_insolvency_id(java.lang.String pre_hgk_insolvency_id) {
        this.pre_hgk_insolvency_id = pre_hgk_insolvency_id;
    }


    /**
     * Gets the dept_restructuring_number value for this InsolvencyCase.
     * 
     * @return dept_restructuring_number
     */
    public java.lang.String getDept_restructuring_number() {
        return dept_restructuring_number;
    }


    /**
     * Sets the dept_restructuring_number value for this InsolvencyCase.
     * 
     * @param dept_restructuring_number
     */
    public void setDept_restructuring_number(java.lang.String dept_restructuring_number) {
        this.dept_restructuring_number = dept_restructuring_number;
    }


    /**
     * Gets the removal_date value for this InsolvencyCase.
     * 
     * @return removal_date
     */
    public java.util.Date getRemoval_date() {
        return removal_date;
    }


    /**
     * Sets the removal_date value for this InsolvencyCase.
     * 
     * @param removal_date
     */
    public void setRemoval_date(java.util.Date removal_date) {
        this.removal_date = removal_date;
    }


    /**
     * Gets the legal_subject value for this InsolvencyCase.
     * 
     * @return legal_subject
     */
    public nl.webservices.www.soap.InsolvencyLegalSubject getLegal_subject() {
        return legal_subject;
    }


    /**
     * Sets the legal_subject value for this InsolvencyCase.
     * 
     * @param legal_subject
     */
    public void setLegal_subject(nl.webservices.www.soap.InsolvencyLegalSubject legal_subject) {
        this.legal_subject = legal_subject;
    }


    /**
     * Gets the treating_authority value for this InsolvencyCase.
     * 
     * @return treating_authority
     */
    public nl.webservices.www.soap.InsolvencyTreatingAuthority getTreating_authority() {
        return treating_authority;
    }


    /**
     * Sets the treating_authority value for this InsolvencyCase.
     * 
     * @param treating_authority
     */
    public void setTreating_authority(nl.webservices.www.soap.InsolvencyTreatingAuthority treating_authority) {
        this.treating_authority = treating_authority;
    }


    /**
     * Gets the curators value for this InsolvencyCase.
     * 
     * @return curators
     */
    public nl.webservices.www.soap.InsolvencyCurators getCurators() {
        return curators;
    }


    /**
     * Sets the curators value for this InsolvencyCase.
     * 
     * @param curators
     */
    public void setCurators(nl.webservices.www.soap.InsolvencyCurators curators) {
        this.curators = curators;
    }


    /**
     * Gets the receivers value for this InsolvencyCase.
     * 
     * @return receivers
     */
    public nl.webservices.www.soap.InsolvencyReceivers getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this InsolvencyCase.
     * 
     * @param receivers
     */
    public void setReceivers(nl.webservices.www.soap.InsolvencyReceivers receivers) {
        this.receivers = receivers;
    }


    /**
     * Gets the events value for this InsolvencyCase.
     * 
     * @return events
     */
    public nl.webservices.www.soap.InsolvencyPublications getEvents() {
        return events;
    }


    /**
     * Sets the events value for this InsolvencyCase.
     * 
     * @param events
     */
    public void setEvents(nl.webservices.www.soap.InsolvencyPublications events) {
        this.events = events;
    }


    /**
     * Gets the reports value for this InsolvencyCase.
     * 
     * @return reports
     */
    public nl.webservices.www.soap.InsolvencyReport[] getReports() {
        return reports;
    }


    /**
     * Sets the reports value for this InsolvencyCase.
     * 
     * @param reports
     */
    public void setReports(nl.webservices.www.soap.InsolvencyReport[] reports) {
        this.reports = reports;
    }


    /**
     * Gets the affected_companies value for this InsolvencyCase.
     * 
     * @return affected_companies
     */
    public nl.webservices.www.soap.InsolvencyAffectedCompany[] getAffected_companies() {
        return affected_companies;
    }


    /**
     * Sets the affected_companies value for this InsolvencyCase.
     * 
     * @param affected_companies
     */
    public void setAffected_companies(nl.webservices.www.soap.InsolvencyAffectedCompany[] affected_companies) {
        this.affected_companies = affected_companies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyCase)) return false;
        InsolvencyCase other = (InsolvencyCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insolvency_id==null && other.getInsolvency_id()==null) || 
             (this.insolvency_id!=null &&
              this.insolvency_id.equals(other.getInsolvency_id()))) &&
            ((this.magistrate==null && other.getMagistrate()==null) || 
             (this.magistrate!=null &&
              this.magistrate.equals(other.getMagistrate()))) &&
            ((this.previous_insolvency_id==null && other.getPrevious_insolvency_id()==null) || 
             (this.previous_insolvency_id!=null &&
              this.previous_insolvency_id.equals(other.getPrevious_insolvency_id()))) &&
            ((this.previous_magistrate==null && other.getPrevious_magistrate()==null) || 
             (this.previous_magistrate!=null &&
              this.previous_magistrate.equals(other.getPrevious_magistrate()))) &&
            this.is_pre_hgk_published == other.isIs_pre_hgk_published() &&
            ((this.pre_hgk_insolvency_id==null && other.getPre_hgk_insolvency_id()==null) || 
             (this.pre_hgk_insolvency_id!=null &&
              this.pre_hgk_insolvency_id.equals(other.getPre_hgk_insolvency_id()))) &&
            ((this.dept_restructuring_number==null && other.getDept_restructuring_number()==null) || 
             (this.dept_restructuring_number!=null &&
              this.dept_restructuring_number.equals(other.getDept_restructuring_number()))) &&
            ((this.removal_date==null && other.getRemoval_date()==null) || 
             (this.removal_date!=null &&
              this.removal_date.equals(other.getRemoval_date()))) &&
            ((this.legal_subject==null && other.getLegal_subject()==null) || 
             (this.legal_subject!=null &&
              this.legal_subject.equals(other.getLegal_subject()))) &&
            ((this.treating_authority==null && other.getTreating_authority()==null) || 
             (this.treating_authority!=null &&
              this.treating_authority.equals(other.getTreating_authority()))) &&
            ((this.curators==null && other.getCurators()==null) || 
             (this.curators!=null &&
              this.curators.equals(other.getCurators()))) &&
            ((this.receivers==null && other.getReceivers()==null) || 
             (this.receivers!=null &&
              this.receivers.equals(other.getReceivers()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.reports==null && other.getReports()==null) || 
             (this.reports!=null &&
              java.util.Arrays.equals(this.reports, other.getReports()))) &&
            ((this.affected_companies==null && other.getAffected_companies()==null) || 
             (this.affected_companies!=null &&
              java.util.Arrays.equals(this.affected_companies, other.getAffected_companies())));
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
        if (getInsolvency_id() != null) {
            _hashCode += getInsolvency_id().hashCode();
        }
        if (getMagistrate() != null) {
            _hashCode += getMagistrate().hashCode();
        }
        if (getPrevious_insolvency_id() != null) {
            _hashCode += getPrevious_insolvency_id().hashCode();
        }
        if (getPrevious_magistrate() != null) {
            _hashCode += getPrevious_magistrate().hashCode();
        }
        _hashCode += (isIs_pre_hgk_published() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPre_hgk_insolvency_id() != null) {
            _hashCode += getPre_hgk_insolvency_id().hashCode();
        }
        if (getDept_restructuring_number() != null) {
            _hashCode += getDept_restructuring_number().hashCode();
        }
        if (getRemoval_date() != null) {
            _hashCode += getRemoval_date().hashCode();
        }
        if (getLegal_subject() != null) {
            _hashCode += getLegal_subject().hashCode();
        }
        if (getTreating_authority() != null) {
            _hashCode += getTreating_authority().hashCode();
        }
        if (getCurators() != null) {
            _hashCode += getCurators().hashCode();
        }
        if (getReceivers() != null) {
            _hashCode += getReceivers().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getReports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAffected_companies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffected_companies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffected_companies(), i);
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
        new org.apache.axis.description.TypeDesc(InsolvencyCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insolvency_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "insolvency_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magistrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "magistrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_insolvency_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_insolvency_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previous_magistrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "previous_magistrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_pre_hgk_published");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "is_pre_hgk_published"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pre_hgk_insolvency_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "pre_hgk_insolvency_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dept_restructuring_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dept_restructuring_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removal_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "removal_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal_subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "legal_subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyLegalSubject"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treating_authority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "treating_authority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyTreatingAuthority"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "curators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyCurators"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "receivers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyReceivers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyPublications"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyReport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affected_companies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "affected_companies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAffectedCompany"));
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
