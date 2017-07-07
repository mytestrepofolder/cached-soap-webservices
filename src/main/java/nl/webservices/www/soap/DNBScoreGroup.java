/**
 * DNBScoreGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBScoreGroup  implements java.io.Serializable {
    private java.lang.Integer score;

    private nl.webservices.www.soap.DNBCommentary[] score_commentaries;

    private java.lang.Boolean score_class;

    private java.lang.Integer national_percentile;

    private java.lang.String score_override_code;

    private java.lang.Integer incidence_of_default;

    private java.lang.String score_date;

    private java.lang.String industry_norm;

    private java.lang.String industry_incidence_of_default;

    private java.lang.Integer industry_percentile;

    private java.lang.String unnormalized_score;

    private java.lang.String algorithm_id;

    public DNBScoreGroup() {
    }

    public DNBScoreGroup(
           java.lang.Integer score,
           nl.webservices.www.soap.DNBCommentary[] score_commentaries,
           java.lang.Boolean score_class,
           java.lang.Integer national_percentile,
           java.lang.String score_override_code,
           java.lang.Integer incidence_of_default,
           java.lang.String score_date,
           java.lang.String industry_norm,
           java.lang.String industry_incidence_of_default,
           java.lang.Integer industry_percentile,
           java.lang.String unnormalized_score,
           java.lang.String algorithm_id) {
           this.score = score;
           this.score_commentaries = score_commentaries;
           this.score_class = score_class;
           this.national_percentile = national_percentile;
           this.score_override_code = score_override_code;
           this.incidence_of_default = incidence_of_default;
           this.score_date = score_date;
           this.industry_norm = industry_norm;
           this.industry_incidence_of_default = industry_incidence_of_default;
           this.industry_percentile = industry_percentile;
           this.unnormalized_score = unnormalized_score;
           this.algorithm_id = algorithm_id;
    }


    /**
     * Gets the score value for this DNBScoreGroup.
     * 
     * @return score
     */
    public java.lang.Integer getScore() {
        return score;
    }


    /**
     * Sets the score value for this DNBScoreGroup.
     * 
     * @param score
     */
    public void setScore(java.lang.Integer score) {
        this.score = score;
    }


    /**
     * Gets the score_commentaries value for this DNBScoreGroup.
     * 
     * @return score_commentaries
     */
    public nl.webservices.www.soap.DNBCommentary[] getScore_commentaries() {
        return score_commentaries;
    }


    /**
     * Sets the score_commentaries value for this DNBScoreGroup.
     * 
     * @param score_commentaries
     */
    public void setScore_commentaries(nl.webservices.www.soap.DNBCommentary[] score_commentaries) {
        this.score_commentaries = score_commentaries;
    }


    /**
     * Gets the score_class value for this DNBScoreGroup.
     * 
     * @return score_class
     */
    public java.lang.Boolean getScore_class() {
        return score_class;
    }


    /**
     * Sets the score_class value for this DNBScoreGroup.
     * 
     * @param score_class
     */
    public void setScore_class(java.lang.Boolean score_class) {
        this.score_class = score_class;
    }


    /**
     * Gets the national_percentile value for this DNBScoreGroup.
     * 
     * @return national_percentile
     */
    public java.lang.Integer getNational_percentile() {
        return national_percentile;
    }


    /**
     * Sets the national_percentile value for this DNBScoreGroup.
     * 
     * @param national_percentile
     */
    public void setNational_percentile(java.lang.Integer national_percentile) {
        this.national_percentile = national_percentile;
    }


    /**
     * Gets the score_override_code value for this DNBScoreGroup.
     * 
     * @return score_override_code
     */
    public java.lang.String getScore_override_code() {
        return score_override_code;
    }


    /**
     * Sets the score_override_code value for this DNBScoreGroup.
     * 
     * @param score_override_code
     */
    public void setScore_override_code(java.lang.String score_override_code) {
        this.score_override_code = score_override_code;
    }


    /**
     * Gets the incidence_of_default value for this DNBScoreGroup.
     * 
     * @return incidence_of_default
     */
    public java.lang.Integer getIncidence_of_default() {
        return incidence_of_default;
    }


    /**
     * Sets the incidence_of_default value for this DNBScoreGroup.
     * 
     * @param incidence_of_default
     */
    public void setIncidence_of_default(java.lang.Integer incidence_of_default) {
        this.incidence_of_default = incidence_of_default;
    }


    /**
     * Gets the score_date value for this DNBScoreGroup.
     * 
     * @return score_date
     */
    public java.lang.String getScore_date() {
        return score_date;
    }


    /**
     * Sets the score_date value for this DNBScoreGroup.
     * 
     * @param score_date
     */
    public void setScore_date(java.lang.String score_date) {
        this.score_date = score_date;
    }


    /**
     * Gets the industry_norm value for this DNBScoreGroup.
     * 
     * @return industry_norm
     */
    public java.lang.String getIndustry_norm() {
        return industry_norm;
    }


    /**
     * Sets the industry_norm value for this DNBScoreGroup.
     * 
     * @param industry_norm
     */
    public void setIndustry_norm(java.lang.String industry_norm) {
        this.industry_norm = industry_norm;
    }


    /**
     * Gets the industry_incidence_of_default value for this DNBScoreGroup.
     * 
     * @return industry_incidence_of_default
     */
    public java.lang.String getIndustry_incidence_of_default() {
        return industry_incidence_of_default;
    }


    /**
     * Sets the industry_incidence_of_default value for this DNBScoreGroup.
     * 
     * @param industry_incidence_of_default
     */
    public void setIndustry_incidence_of_default(java.lang.String industry_incidence_of_default) {
        this.industry_incidence_of_default = industry_incidence_of_default;
    }


    /**
     * Gets the industry_percentile value for this DNBScoreGroup.
     * 
     * @return industry_percentile
     */
    public java.lang.Integer getIndustry_percentile() {
        return industry_percentile;
    }


    /**
     * Sets the industry_percentile value for this DNBScoreGroup.
     * 
     * @param industry_percentile
     */
    public void setIndustry_percentile(java.lang.Integer industry_percentile) {
        this.industry_percentile = industry_percentile;
    }


    /**
     * Gets the unnormalized_score value for this DNBScoreGroup.
     * 
     * @return unnormalized_score
     */
    public java.lang.String getUnnormalized_score() {
        return unnormalized_score;
    }


    /**
     * Sets the unnormalized_score value for this DNBScoreGroup.
     * 
     * @param unnormalized_score
     */
    public void setUnnormalized_score(java.lang.String unnormalized_score) {
        this.unnormalized_score = unnormalized_score;
    }


    /**
     * Gets the algorithm_id value for this DNBScoreGroup.
     * 
     * @return algorithm_id
     */
    public java.lang.String getAlgorithm_id() {
        return algorithm_id;
    }


    /**
     * Sets the algorithm_id value for this DNBScoreGroup.
     * 
     * @param algorithm_id
     */
    public void setAlgorithm_id(java.lang.String algorithm_id) {
        this.algorithm_id = algorithm_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBScoreGroup)) return false;
        DNBScoreGroup other = (DNBScoreGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.score_commentaries==null && other.getScore_commentaries()==null) || 
             (this.score_commentaries!=null &&
              java.util.Arrays.equals(this.score_commentaries, other.getScore_commentaries()))) &&
            ((this.score_class==null && other.getScore_class()==null) || 
             (this.score_class!=null &&
              this.score_class.equals(other.getScore_class()))) &&
            ((this.national_percentile==null && other.getNational_percentile()==null) || 
             (this.national_percentile!=null &&
              this.national_percentile.equals(other.getNational_percentile()))) &&
            ((this.score_override_code==null && other.getScore_override_code()==null) || 
             (this.score_override_code!=null &&
              this.score_override_code.equals(other.getScore_override_code()))) &&
            ((this.incidence_of_default==null && other.getIncidence_of_default()==null) || 
             (this.incidence_of_default!=null &&
              this.incidence_of_default.equals(other.getIncidence_of_default()))) &&
            ((this.score_date==null && other.getScore_date()==null) || 
             (this.score_date!=null &&
              this.score_date.equals(other.getScore_date()))) &&
            ((this.industry_norm==null && other.getIndustry_norm()==null) || 
             (this.industry_norm!=null &&
              this.industry_norm.equals(other.getIndustry_norm()))) &&
            ((this.industry_incidence_of_default==null && other.getIndustry_incidence_of_default()==null) || 
             (this.industry_incidence_of_default!=null &&
              this.industry_incidence_of_default.equals(other.getIndustry_incidence_of_default()))) &&
            ((this.industry_percentile==null && other.getIndustry_percentile()==null) || 
             (this.industry_percentile!=null &&
              this.industry_percentile.equals(other.getIndustry_percentile()))) &&
            ((this.unnormalized_score==null && other.getUnnormalized_score()==null) || 
             (this.unnormalized_score!=null &&
              this.unnormalized_score.equals(other.getUnnormalized_score()))) &&
            ((this.algorithm_id==null && other.getAlgorithm_id()==null) || 
             (this.algorithm_id!=null &&
              this.algorithm_id.equals(other.getAlgorithm_id())));
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
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getScore_commentaries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScore_commentaries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScore_commentaries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScore_class() != null) {
            _hashCode += getScore_class().hashCode();
        }
        if (getNational_percentile() != null) {
            _hashCode += getNational_percentile().hashCode();
        }
        if (getScore_override_code() != null) {
            _hashCode += getScore_override_code().hashCode();
        }
        if (getIncidence_of_default() != null) {
            _hashCode += getIncidence_of_default().hashCode();
        }
        if (getScore_date() != null) {
            _hashCode += getScore_date().hashCode();
        }
        if (getIndustry_norm() != null) {
            _hashCode += getIndustry_norm().hashCode();
        }
        if (getIndustry_incidence_of_default() != null) {
            _hashCode += getIndustry_incidence_of_default().hashCode();
        }
        if (getIndustry_percentile() != null) {
            _hashCode += getIndustry_percentile().hashCode();
        }
        if (getUnnormalized_score() != null) {
            _hashCode += getUnnormalized_score().hashCode();
        }
        if (getAlgorithm_id() != null) {
            _hashCode += getAlgorithm_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBScoreGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBScoreGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_commentaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "score_commentaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBCommentary"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_class");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "score_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("national_percentile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "national_percentile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_override_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "score_override_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidence_of_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "incidence_of_default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "score_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_norm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_norm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_incidence_of_default");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_incidence_of_default"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry_percentile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "industry_percentile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unnormalized_score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "unnormalized_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("algorithm_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "algorithm_id"));
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
