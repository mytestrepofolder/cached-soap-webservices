/**
 * RoutePlannerGetRouteRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerGetRouteRequestType  implements java.io.Serializable {
    private java.lang.String start_postcode;

    private int start_house_number;

    private java.lang.String start_house_number_addition;

    private java.lang.String start_street;

    private java.lang.String start_city;

    private java.lang.String start_country;

    private java.lang.String destination_postcode;

    private int destination_house_number;

    private java.lang.String destination_house_number_addition;

    private java.lang.String destination_street;

    private java.lang.String destination_city;

    private java.lang.String destination_country;

    private java.lang.String route_type;

    private java.lang.String language;

    public RoutePlannerGetRouteRequestType() {
    }

    public RoutePlannerGetRouteRequestType(
           java.lang.String start_postcode,
           int start_house_number,
           java.lang.String start_house_number_addition,
           java.lang.String start_street,
           java.lang.String start_city,
           java.lang.String start_country,
           java.lang.String destination_postcode,
           int destination_house_number,
           java.lang.String destination_house_number_addition,
           java.lang.String destination_street,
           java.lang.String destination_city,
           java.lang.String destination_country,
           java.lang.String route_type,
           java.lang.String language) {
           this.start_postcode = start_postcode;
           this.start_house_number = start_house_number;
           this.start_house_number_addition = start_house_number_addition;
           this.start_street = start_street;
           this.start_city = start_city;
           this.start_country = start_country;
           this.destination_postcode = destination_postcode;
           this.destination_house_number = destination_house_number;
           this.destination_house_number_addition = destination_house_number_addition;
           this.destination_street = destination_street;
           this.destination_city = destination_city;
           this.destination_country = destination_country;
           this.route_type = route_type;
           this.language = language;
    }


    /**
     * Gets the start_postcode value for this RoutePlannerGetRouteRequestType.
     * 
     * @return start_postcode
     */
    public java.lang.String getStart_postcode() {
        return start_postcode;
    }


    /**
     * Sets the start_postcode value for this RoutePlannerGetRouteRequestType.
     * 
     * @param start_postcode
     */
    public void setStart_postcode(java.lang.String start_postcode) {
        this.start_postcode = start_postcode;
    }


    /**
     * Gets the start_house_number value for this RoutePlannerGetRouteRequestType.
     * 
     * @return start_house_number
     */
    public int getStart_house_number() {
        return start_house_number;
    }


    /**
     * Sets the start_house_number value for this RoutePlannerGetRouteRequestType.
     * 
     * @param start_house_number
     */
    public void setStart_house_number(int start_house_number) {
        this.start_house_number = start_house_number;
    }


    /**
     * Gets the start_house_number_addition value for this RoutePlannerGetRouteRequestType.
     * 
     * @return start_house_number_addition
     */
    public java.lang.String getStart_house_number_addition() {
        return start_house_number_addition;
    }


    /**
     * Sets the start_house_number_addition value for this RoutePlannerGetRouteRequestType.
     * 
     * @param start_house_number_addition
     */
    public void setStart_house_number_addition(java.lang.String start_house_number_addition) {
        this.start_house_number_addition = start_house_number_addition;
    }


    /**
     * Gets the start_street value for this RoutePlannerGetRouteRequestType.
     * 
     * @return start_street
     */
    public java.lang.String getStart_street() {
        return start_street;
    }


    /**
     * Sets the start_street value for this RoutePlannerGetRouteRequestType.
     * 
     * @param start_street
     */
    public void setStart_street(java.lang.String start_street) {
        this.start_street = start_street;
    }


    /**
     * Gets the start_city value for this RoutePlannerGetRouteRequestType.
     * 
     * @return start_city
     */
    public java.lang.String getStart_city() {
        return start_city;
    }


    /**
     * Sets the start_city value for this RoutePlannerGetRouteRequestType.
     * 
     * @param start_city
     */
    public void setStart_city(java.lang.String start_city) {
        this.start_city = start_city;
    }


    /**
     * Gets the start_country value for this RoutePlannerGetRouteRequestType.
     * 
     * @return start_country
     */
    public java.lang.String getStart_country() {
        return start_country;
    }


    /**
     * Sets the start_country value for this RoutePlannerGetRouteRequestType.
     * 
     * @param start_country
     */
    public void setStart_country(java.lang.String start_country) {
        this.start_country = start_country;
    }


    /**
     * Gets the destination_postcode value for this RoutePlannerGetRouteRequestType.
     * 
     * @return destination_postcode
     */
    public java.lang.String getDestination_postcode() {
        return destination_postcode;
    }


    /**
     * Sets the destination_postcode value for this RoutePlannerGetRouteRequestType.
     * 
     * @param destination_postcode
     */
    public void setDestination_postcode(java.lang.String destination_postcode) {
        this.destination_postcode = destination_postcode;
    }


    /**
     * Gets the destination_house_number value for this RoutePlannerGetRouteRequestType.
     * 
     * @return destination_house_number
     */
    public int getDestination_house_number() {
        return destination_house_number;
    }


    /**
     * Sets the destination_house_number value for this RoutePlannerGetRouteRequestType.
     * 
     * @param destination_house_number
     */
    public void setDestination_house_number(int destination_house_number) {
        this.destination_house_number = destination_house_number;
    }


    /**
     * Gets the destination_house_number_addition value for this RoutePlannerGetRouteRequestType.
     * 
     * @return destination_house_number_addition
     */
    public java.lang.String getDestination_house_number_addition() {
        return destination_house_number_addition;
    }


    /**
     * Sets the destination_house_number_addition value for this RoutePlannerGetRouteRequestType.
     * 
     * @param destination_house_number_addition
     */
    public void setDestination_house_number_addition(java.lang.String destination_house_number_addition) {
        this.destination_house_number_addition = destination_house_number_addition;
    }


    /**
     * Gets the destination_street value for this RoutePlannerGetRouteRequestType.
     * 
     * @return destination_street
     */
    public java.lang.String getDestination_street() {
        return destination_street;
    }


    /**
     * Sets the destination_street value for this RoutePlannerGetRouteRequestType.
     * 
     * @param destination_street
     */
    public void setDestination_street(java.lang.String destination_street) {
        this.destination_street = destination_street;
    }


    /**
     * Gets the destination_city value for this RoutePlannerGetRouteRequestType.
     * 
     * @return destination_city
     */
    public java.lang.String getDestination_city() {
        return destination_city;
    }


    /**
     * Sets the destination_city value for this RoutePlannerGetRouteRequestType.
     * 
     * @param destination_city
     */
    public void setDestination_city(java.lang.String destination_city) {
        this.destination_city = destination_city;
    }


    /**
     * Gets the destination_country value for this RoutePlannerGetRouteRequestType.
     * 
     * @return destination_country
     */
    public java.lang.String getDestination_country() {
        return destination_country;
    }


    /**
     * Sets the destination_country value for this RoutePlannerGetRouteRequestType.
     * 
     * @param destination_country
     */
    public void setDestination_country(java.lang.String destination_country) {
        this.destination_country = destination_country;
    }


    /**
     * Gets the route_type value for this RoutePlannerGetRouteRequestType.
     * 
     * @return route_type
     */
    public java.lang.String getRoute_type() {
        return route_type;
    }


    /**
     * Sets the route_type value for this RoutePlannerGetRouteRequestType.
     * 
     * @param route_type
     */
    public void setRoute_type(java.lang.String route_type) {
        this.route_type = route_type;
    }


    /**
     * Gets the language value for this RoutePlannerGetRouteRequestType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RoutePlannerGetRouteRequestType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerGetRouteRequestType)) return false;
        RoutePlannerGetRouteRequestType other = (RoutePlannerGetRouteRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start_postcode==null && other.getStart_postcode()==null) || 
             (this.start_postcode!=null &&
              this.start_postcode.equals(other.getStart_postcode()))) &&
            this.start_house_number == other.getStart_house_number() &&
            ((this.start_house_number_addition==null && other.getStart_house_number_addition()==null) || 
             (this.start_house_number_addition!=null &&
              this.start_house_number_addition.equals(other.getStart_house_number_addition()))) &&
            ((this.start_street==null && other.getStart_street()==null) || 
             (this.start_street!=null &&
              this.start_street.equals(other.getStart_street()))) &&
            ((this.start_city==null && other.getStart_city()==null) || 
             (this.start_city!=null &&
              this.start_city.equals(other.getStart_city()))) &&
            ((this.start_country==null && other.getStart_country()==null) || 
             (this.start_country!=null &&
              this.start_country.equals(other.getStart_country()))) &&
            ((this.destination_postcode==null && other.getDestination_postcode()==null) || 
             (this.destination_postcode!=null &&
              this.destination_postcode.equals(other.getDestination_postcode()))) &&
            this.destination_house_number == other.getDestination_house_number() &&
            ((this.destination_house_number_addition==null && other.getDestination_house_number_addition()==null) || 
             (this.destination_house_number_addition!=null &&
              this.destination_house_number_addition.equals(other.getDestination_house_number_addition()))) &&
            ((this.destination_street==null && other.getDestination_street()==null) || 
             (this.destination_street!=null &&
              this.destination_street.equals(other.getDestination_street()))) &&
            ((this.destination_city==null && other.getDestination_city()==null) || 
             (this.destination_city!=null &&
              this.destination_city.equals(other.getDestination_city()))) &&
            ((this.destination_country==null && other.getDestination_country()==null) || 
             (this.destination_country!=null &&
              this.destination_country.equals(other.getDestination_country()))) &&
            ((this.route_type==null && other.getRoute_type()==null) || 
             (this.route_type!=null &&
              this.route_type.equals(other.getRoute_type()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getStart_postcode() != null) {
            _hashCode += getStart_postcode().hashCode();
        }
        _hashCode += getStart_house_number();
        if (getStart_house_number_addition() != null) {
            _hashCode += getStart_house_number_addition().hashCode();
        }
        if (getStart_street() != null) {
            _hashCode += getStart_street().hashCode();
        }
        if (getStart_city() != null) {
            _hashCode += getStart_city().hashCode();
        }
        if (getStart_country() != null) {
            _hashCode += getStart_country().hashCode();
        }
        if (getDestination_postcode() != null) {
            _hashCode += getDestination_postcode().hashCode();
        }
        _hashCode += getDestination_house_number();
        if (getDestination_house_number_addition() != null) {
            _hashCode += getDestination_house_number_addition().hashCode();
        }
        if (getDestination_street() != null) {
            _hashCode += getDestination_street().hashCode();
        }
        if (getDestination_city() != null) {
            _hashCode += getDestination_city().hashCode();
        }
        if (getDestination_country() != null) {
            _hashCode += getDestination_country().hashCode();
        }
        if (getRoute_type() != null) {
            _hashCode += getRoute_type().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoutePlannerGetRouteRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "routePlannerGetRouteRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination_postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination_postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination_house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination_house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination_house_number_addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination_house_number_addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination_street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination_street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination_city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "route_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "language"));
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
