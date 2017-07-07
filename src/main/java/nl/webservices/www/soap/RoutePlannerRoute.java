/**
 * RoutePlannerRoute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RoutePlannerRoute  implements java.io.Serializable {
    private nl.webservices.www.soap.RouteLocation start;

    private nl.webservices.www.soap.RouteLocation destination;

    private nl.webservices.www.soap.RouteSummary summary;

    private nl.webservices.www.soap.RoutePart[] description;

    private byte[] map;

    public RoutePlannerRoute() {
    }

    public RoutePlannerRoute(
           nl.webservices.www.soap.RouteLocation start,
           nl.webservices.www.soap.RouteLocation destination,
           nl.webservices.www.soap.RouteSummary summary,
           nl.webservices.www.soap.RoutePart[] description,
           byte[] map) {
           this.start = start;
           this.destination = destination;
           this.summary = summary;
           this.description = description;
           this.map = map;
    }


    /**
     * Gets the start value for this RoutePlannerRoute.
     * 
     * @return start
     */
    public nl.webservices.www.soap.RouteLocation getStart() {
        return start;
    }


    /**
     * Sets the start value for this RoutePlannerRoute.
     * 
     * @param start
     */
    public void setStart(nl.webservices.www.soap.RouteLocation start) {
        this.start = start;
    }


    /**
     * Gets the destination value for this RoutePlannerRoute.
     * 
     * @return destination
     */
    public nl.webservices.www.soap.RouteLocation getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this RoutePlannerRoute.
     * 
     * @param destination
     */
    public void setDestination(nl.webservices.www.soap.RouteLocation destination) {
        this.destination = destination;
    }


    /**
     * Gets the summary value for this RoutePlannerRoute.
     * 
     * @return summary
     */
    public nl.webservices.www.soap.RouteSummary getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this RoutePlannerRoute.
     * 
     * @param summary
     */
    public void setSummary(nl.webservices.www.soap.RouteSummary summary) {
        this.summary = summary;
    }


    /**
     * Gets the description value for this RoutePlannerRoute.
     * 
     * @return description
     */
    public nl.webservices.www.soap.RoutePart[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RoutePlannerRoute.
     * 
     * @param description
     */
    public void setDescription(nl.webservices.www.soap.RoutePart[] description) {
        this.description = description;
    }


    /**
     * Gets the map value for this RoutePlannerRoute.
     * 
     * @return map
     */
    public byte[] getMap() {
        return map;
    }


    /**
     * Sets the map value for this RoutePlannerRoute.
     * 
     * @param map
     */
    public void setMap(byte[] map) {
        this.map = map;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoutePlannerRoute)) return false;
        RoutePlannerRoute other = (RoutePlannerRoute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.map==null && other.getMap()==null) || 
             (this.map!=null &&
              java.util.Arrays.equals(this.map, other.getMap())));
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
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMap(), i);
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
        new org.apache.axis.description.TypeDesc(RoutePlannerRoute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RoutePlannerRoute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteLocation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteLocation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RouteSummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RoutePart"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "map"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
