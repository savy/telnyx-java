/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.ConnectionRtcpSettings;
import com.telnyx.sdk.model.InboundIp;
import com.telnyx.sdk.model.OutboundIp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * IpConnection
 */
@JsonPropertyOrder({
  IpConnection.JSON_PROPERTY_ID,
  IpConnection.JSON_PROPERTY_RECORD_TYPE,
  IpConnection.JSON_PROPERTY_ACTIVE,
  IpConnection.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
  IpConnection.JSON_PROPERTY_CONNECTION_NAME,
  IpConnection.JSON_PROPERTY_TRANSPORT_PROTOCOL,
  IpConnection.JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED,
  IpConnection.JSON_PROPERTY_DTMF_TYPE,
  IpConnection.JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED,
  IpConnection.JSON_PROPERTY_ENCRYPTED_MEDIA,
  IpConnection.JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED,
  IpConnection.JSON_PROPERTY_RTCP_SETTINGS,
  IpConnection.JSON_PROPERTY_CREATED_AT,
  IpConnection.JSON_PROPERTY_UPDATED_AT,
  IpConnection.JSON_PROPERTY_INBOUND,
  IpConnection.JSON_PROPERTY_OUTBOUND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IpConnection {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   */
  public enum AnchorsiteOverrideEnum {
    LATENCY("Latency"),
    
    CHICAGO_IL("Chicago, IL"),
    
    ASHBURN_VA("Ashburn, VA"),
    
    SAN_JOSE_CA("San Jose, CA"),
    
    SYDNEY_AUSTRALIA("Sydney, Australia"),
    
    AMSTERDAM_NETHERLANDS("Amsterdam, Netherlands"),
    
    LONDON_UK("London, UK"),
    
    TORONTO_CANADA("Toronto, Canada"),
    
    VANCOUVER_CANADA("Vancouver, Canada"),
    
    FRANKFURT_GERMANY("Frankfurt, Germany");

    private String value;

    AnchorsiteOverrideEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnchorsiteOverrideEnum fromValue(String value) {
      for (AnchorsiteOverrideEnum b : AnchorsiteOverrideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE = "anchorsite_override";
  private AnchorsiteOverrideEnum anchorsiteOverride;

  public static final String JSON_PROPERTY_CONNECTION_NAME = "connection_name";
  private String connectionName;

  /**
   * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.
   */
  public enum TransportProtocolEnum {
    UDP("UDP"),
    
    TCP("TCP"),
    
    TLS("TLS");

    private String value;

    TransportProtocolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransportProtocolEnum fromValue(String value) {
      for (TransportProtocolEnum b : TransportProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSPORT_PROTOCOL = "transport_protocol";
  private TransportProtocolEnum transportProtocol = TransportProtocolEnum.UDP;

  public static final String JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED = "default_on_hold_comfort_noise_enabled";
  private Boolean defaultOnHoldComfortNoiseEnabled = true;

  /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   */
  public enum DtmfTypeEnum {
    RFC_2833("RFC 2833"),
    
    INBAND("Inband"),
    
    SIP_INFO("SIP INFO");

    private String value;

    DtmfTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DtmfTypeEnum fromValue(String value) {
      for (DtmfTypeEnum b : DtmfTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
  private DtmfTypeEnum dtmfType = DtmfTypeEnum.RFC_2833;

  public static final String JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED = "encode_contact_header_enabled";
  private Boolean encodeContactHeaderEnabled = false;

  /**
   * Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.
   */
  public enum EncryptedMediaEnum {
    SRTP("SRTP"),
    
    ZRTP("ZRTP");

    private String value;

    EncryptedMediaEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EncryptedMediaEnum fromValue(String value) {
      for (EncryptedMediaEnum b : EncryptedMediaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENCRYPTED_MEDIA = "encrypted_media";
  private EncryptedMediaEnum encryptedMedia;

  public static final String JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED = "onnet_t38_passthrough_enabled";
  private Boolean onnetT38PassthroughEnabled = false;

  public static final String JSON_PROPERTY_RTCP_SETTINGS = "rtcp_settings";
  private ConnectionRtcpSettings rtcpSettings;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_INBOUND = "inbound";
  private InboundIp inbound;

  public static final String JSON_PROPERTY_OUTBOUND = "outbound";
  private OutboundIp outbound;


  public IpConnection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IpConnection recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ip_connection", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public IpConnection active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Defaults to true
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Defaults to true")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public IpConnection anchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
    return this;
  }

   /**
   * &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.
   * @return anchorsiteOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "latency", value = "`Latency` directs Telnyx to route media through the site with the lowest round-trip time to the user's connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.")
  @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnchorsiteOverrideEnum getAnchorsiteOverride() {
    return anchorsiteOverride;
  }


  public void setAnchorsiteOverride(AnchorsiteOverrideEnum anchorsiteOverride) {
    this.anchorsiteOverride = anchorsiteOverride;
  }


  public IpConnection connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionName() {
    return connectionName;
  }


  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }


  public IpConnection transportProtocol(TransportProtocolEnum transportProtocol) {
    this.transportProtocol = transportProtocol;
    return this;
  }

   /**
   * One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.
   * @return transportProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UDP", value = "One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication.")
  @JsonProperty(JSON_PROPERTY_TRANSPORT_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransportProtocolEnum getTransportProtocol() {
    return transportProtocol;
  }


  public void setTransportProtocol(TransportProtocolEnum transportProtocol) {
    this.transportProtocol = transportProtocol;
  }


  public IpConnection defaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
    return this;
  }

   /**
   * When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.
   * @return defaultOnHoldComfortNoiseEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_ON_HOLD_COMFORT_NOISE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultOnHoldComfortNoiseEnabled() {
    return defaultOnHoldComfortNoiseEnabled;
  }


  public void setDefaultOnHoldComfortNoiseEnabled(Boolean defaultOnHoldComfortNoiseEnabled) {
    this.defaultOnHoldComfortNoiseEnabled = defaultOnHoldComfortNoiseEnabled;
  }


  public IpConnection dtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
    return this;
  }

   /**
   * Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.
   * @return dtmfType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RFC 2833", value = "Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats.")
  @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DtmfTypeEnum getDtmfType() {
    return dtmfType;
  }


  public void setDtmfType(DtmfTypeEnum dtmfType) {
    this.dtmfType = dtmfType;
  }


  public IpConnection encodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
    return this;
  }

   /**
   * Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.
   * @return encodeContactHeaderEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios.")
  @JsonProperty(JSON_PROPERTY_ENCODE_CONTACT_HEADER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncodeContactHeaderEnabled() {
    return encodeContactHeaderEnabled;
  }


  public void setEncodeContactHeaderEnabled(Boolean encodeContactHeaderEnabled) {
    this.encodeContactHeaderEnabled = encodeContactHeaderEnabled;
  }


  public IpConnection encryptedMedia(EncryptedMediaEnum encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
    return this;
  }

   /**
   * Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.
   * @return encryptedMedia
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SRTP", value = "Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EncryptedMediaEnum getEncryptedMedia() {
    return encryptedMedia;
  }


  public void setEncryptedMedia(EncryptedMediaEnum encryptedMedia) {
    this.encryptedMedia = encryptedMedia;
  }


  public IpConnection onnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
    return this;
  }

   /**
   * Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings.
   * @return onnetT38PassthroughEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg's settings.")
  @JsonProperty(JSON_PROPERTY_ONNET_T38_PASSTHROUGH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnnetT38PassthroughEnabled() {
    return onnetT38PassthroughEnabled;
  }


  public void setOnnetT38PassthroughEnabled(Boolean onnetT38PassthroughEnabled) {
    this.onnetT38PassthroughEnabled = onnetT38PassthroughEnabled;
  }


  public IpConnection rtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
    return this;
  }

   /**
   * Get rtcpSettings
   * @return rtcpSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RTCP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionRtcpSettings getRtcpSettings() {
    return rtcpSettings;
  }


  public void setRtcpSettings(ConnectionRtcpSettings rtcpSettings) {
    this.rtcpSettings = rtcpSettings;
  }


  public IpConnection createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public IpConnection updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public IpConnection inbound(InboundIp inbound) {
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InboundIp getInbound() {
    return inbound;
  }


  public void setInbound(InboundIp inbound) {
    this.inbound = inbound;
  }


  public IpConnection outbound(OutboundIp outbound) {
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutboundIp getOutbound() {
    return outbound;
  }


  public void setOutbound(OutboundIp outbound) {
    this.outbound = outbound;
  }


  /**
   * Return true if this IpConnection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpConnection ipConnection = (IpConnection) o;
    return Objects.equals(this.id, ipConnection.id) &&
        Objects.equals(this.recordType, ipConnection.recordType) &&
        Objects.equals(this.active, ipConnection.active) &&
        Objects.equals(this.anchorsiteOverride, ipConnection.anchorsiteOverride) &&
        Objects.equals(this.connectionName, ipConnection.connectionName) &&
        Objects.equals(this.transportProtocol, ipConnection.transportProtocol) &&
        Objects.equals(this.defaultOnHoldComfortNoiseEnabled, ipConnection.defaultOnHoldComfortNoiseEnabled) &&
        Objects.equals(this.dtmfType, ipConnection.dtmfType) &&
        Objects.equals(this.encodeContactHeaderEnabled, ipConnection.encodeContactHeaderEnabled) &&
        Objects.equals(this.encryptedMedia, ipConnection.encryptedMedia) &&
        Objects.equals(this.onnetT38PassthroughEnabled, ipConnection.onnetT38PassthroughEnabled) &&
        Objects.equals(this.rtcpSettings, ipConnection.rtcpSettings) &&
        Objects.equals(this.createdAt, ipConnection.createdAt) &&
        Objects.equals(this.updatedAt, ipConnection.updatedAt) &&
        Objects.equals(this.inbound, ipConnection.inbound) &&
        Objects.equals(this.outbound, ipConnection.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, active, anchorsiteOverride, connectionName, transportProtocol, defaultOnHoldComfortNoiseEnabled, dtmfType, encodeContactHeaderEnabled, encryptedMedia, onnetT38PassthroughEnabled, rtcpSettings, createdAt, updatedAt, inbound, outbound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpConnection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    anchorsiteOverride: ").append(toIndentedString(anchorsiteOverride)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    transportProtocol: ").append(toIndentedString(transportProtocol)).append("\n");
    sb.append("    defaultOnHoldComfortNoiseEnabled: ").append(toIndentedString(defaultOnHoldComfortNoiseEnabled)).append("\n");
    sb.append("    dtmfType: ").append(toIndentedString(dtmfType)).append("\n");
    sb.append("    encodeContactHeaderEnabled: ").append(toIndentedString(encodeContactHeaderEnabled)).append("\n");
    sb.append("    encryptedMedia: ").append(toIndentedString(encryptedMedia)).append("\n");
    sb.append("    onnetT38PassthroughEnabled: ").append(toIndentedString(onnetT38PassthroughEnabled)).append("\n");
    sb.append("    rtcpSettings: ").append(toIndentedString(rtcpSettings)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
