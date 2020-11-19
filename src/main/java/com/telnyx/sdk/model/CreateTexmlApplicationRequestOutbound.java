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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateTexmlApplicationRequestOutbound
 */
@JsonPropertyOrder({
  CreateTexmlApplicationRequestOutbound.JSON_PROPERTY_CHANNEL_LIMIT,
  CreateTexmlApplicationRequestOutbound.JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTexmlApplicationRequestOutbound {
  public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
  private Integer channelLimit;

  public static final String JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID = "outbound_voice_profile_id";
  private String outboundVoiceProfileId;


  public CreateTexmlApplicationRequestOutbound channelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
    return this;
  }

   /**
   * When set, this will limit the total number of outbound calls to phone numbers associated with this connection.
   * @return channelLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "When set, this will limit the total number of outbound calls to phone numbers associated with this connection.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannelLimit() {
    return channelLimit;
  }


  public void setChannelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
  }


  public CreateTexmlApplicationRequestOutbound outboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
    return this;
  }

   /**
   * Identifies the associated outbound voice profile.
   * @return outboundVoiceProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the associated outbound voice profile.")
  @JsonProperty(JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutboundVoiceProfileId() {
    return outboundVoiceProfileId;
  }


  public void setOutboundVoiceProfileId(String outboundVoiceProfileId) {
    this.outboundVoiceProfileId = outboundVoiceProfileId;
  }


  /**
   * Return true if this CreateTexmlApplicationRequest_outbound object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTexmlApplicationRequestOutbound createTexmlApplicationRequestOutbound = (CreateTexmlApplicationRequestOutbound) o;
    return Objects.equals(this.channelLimit, createTexmlApplicationRequestOutbound.channelLimit) &&
        Objects.equals(this.outboundVoiceProfileId, createTexmlApplicationRequestOutbound.outboundVoiceProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLimit, outboundVoiceProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTexmlApplicationRequestOutbound {\n");
    sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
    sb.append("    outboundVoiceProfileId: ").append(toIndentedString(outboundVoiceProfileId)).append("\n");
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
