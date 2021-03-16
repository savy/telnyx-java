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
import com.telnyx.sdk.model.OutboundCallRecording;
import com.telnyx.sdk.model.ServicePlan;
import com.telnyx.sdk.model.TrafficType;
import com.telnyx.sdk.model.UsagePaymentMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * OutboundVoiceProfile
 */
@JsonPropertyOrder({
  OutboundVoiceProfile.JSON_PROPERTY_ID,
  OutboundVoiceProfile.JSON_PROPERTY_RECORD_TYPE,
  OutboundVoiceProfile.JSON_PROPERTY_NAME,
  OutboundVoiceProfile.JSON_PROPERTY_CONNECTIONS_COUNT,
  OutboundVoiceProfile.JSON_PROPERTY_TRAFFIC_TYPE,
  OutboundVoiceProfile.JSON_PROPERTY_SERVICE_PLAN,
  OutboundVoiceProfile.JSON_PROPERTY_CONCURRENT_CALL_LIMIT,
  OutboundVoiceProfile.JSON_PROPERTY_ENABLED,
  OutboundVoiceProfile.JSON_PROPERTY_TAGS,
  OutboundVoiceProfile.JSON_PROPERTY_USAGE_PAYMENT_METHOD,
  OutboundVoiceProfile.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
  OutboundVoiceProfile.JSON_PROPERTY_MAX_DESTINATION_RATE,
  OutboundVoiceProfile.JSON_PROPERTY_DAILY_SPEND_LIMIT,
  OutboundVoiceProfile.JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED,
  OutboundVoiceProfile.JSON_PROPERTY_CALL_RECORDING,
  OutboundVoiceProfile.JSON_PROPERTY_BILLING_GROUP_ID,
  OutboundVoiceProfile.JSON_PROPERTY_CREATED_AT,
  OutboundVoiceProfile.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutboundVoiceProfile {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONNECTIONS_COUNT = "connections_count";
  private Integer connectionsCount;

  public static final String JSON_PROPERTY_TRAFFIC_TYPE = "traffic_type";
  private TrafficType trafficType = TrafficType.CONVERSATIONAL;

  public static final String JSON_PROPERTY_SERVICE_PLAN = "service_plan";
  private ServicePlan servicePlan = ServicePlan.GLOBAL;

  public static final String JSON_PROPERTY_CONCURRENT_CALL_LIMIT = "concurrent_call_limit";
  private JsonNullable<Integer> concurrentCallLimit = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_USAGE_PAYMENT_METHOD = "usage_payment_method";
  private UsagePaymentMethod usagePaymentMethod = UsagePaymentMethod.RATE_DECK;

  public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS = "whitelisted_destinations";
  private List<String> whitelistedDestinations = null;

  public static final String JSON_PROPERTY_MAX_DESTINATION_RATE = "max_destination_rate";
  private BigDecimal maxDestinationRate;

  public static final String JSON_PROPERTY_DAILY_SPEND_LIMIT = "daily_spend_limit";
  private String dailySpendLimit;

  public static final String JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED = "daily_spend_limit_enabled";
  private Boolean dailySpendLimitEnabled = false;

  public static final String JSON_PROPERTY_CALL_RECORDING = "call_recording";
  private OutboundCallRecording callRecording;

  public static final String JSON_PROPERTY_BILLING_GROUP_ID = "billing_group_id";
  private JsonNullable<UUID> billingGroupId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;


  public OutboundVoiceProfile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293384261075731499", value = "Identifies the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OutboundVoiceProfile recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound_voice_profile", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public OutboundVoiceProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user-supplied name to help with organization.
   * @return name
  **/
  @ApiModelProperty(example = "office", required = true, value = "A user-supplied name to help with organization.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OutboundVoiceProfile connectionsCount(Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
    return this;
  }

   /**
   * Amount of connections associated with this outbound voice profile.
   * @return connectionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "Amount of connections associated with this outbound voice profile.")
  @JsonProperty(JSON_PROPERTY_CONNECTIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConnectionsCount() {
    return connectionsCount;
  }


  public void setConnectionsCount(Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
  }


  public OutboundVoiceProfile trafficType(TrafficType trafficType) {
    this.trafficType = trafficType;
    return this;
  }

   /**
   * Get trafficType
   * @return trafficType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrafficType getTrafficType() {
    return trafficType;
  }


  public void setTrafficType(TrafficType trafficType) {
    this.trafficType = trafficType;
  }


  public OutboundVoiceProfile servicePlan(ServicePlan servicePlan) {
    this.servicePlan = servicePlan;
    return this;
  }

   /**
   * Get servicePlan
   * @return servicePlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServicePlan getServicePlan() {
    return servicePlan;
  }


  public void setServicePlan(ServicePlan servicePlan) {
    this.servicePlan = servicePlan;
  }


  public OutboundVoiceProfile concurrentCallLimit(Integer concurrentCallLimit) {
    this.concurrentCallLimit = JsonNullable.<Integer>of(concurrentCallLimit);
    return this;
  }

   /**
   * Must be no more than your global concurrent call limit. Null means no limit.
   * @return concurrentCallLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Must be no more than your global concurrent call limit. Null means no limit.")
  @JsonIgnore

  public Integer getConcurrentCallLimit() {
        return concurrentCallLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONCURRENT_CALL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getConcurrentCallLimit_JsonNullable() {
    return concurrentCallLimit;
  }
  
  @JsonProperty(JSON_PROPERTY_CONCURRENT_CALL_LIMIT)
  public void setConcurrentCallLimit_JsonNullable(JsonNullable<Integer> concurrentCallLimit) {
    this.concurrentCallLimit = concurrentCallLimit;
  }

  public void setConcurrentCallLimit(Integer concurrentCallLimit) {
    this.concurrentCallLimit = JsonNullable.<Integer>of(concurrentCallLimit);
  }


  public OutboundVoiceProfile enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Specifies whether the outbound voice profile can be used. Disabled profiles will result in outbound calls being blocked for the associated Connections.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether the outbound voice profile can be used. Disabled profiles will result in outbound calls being blocked for the associated Connections.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public OutboundVoiceProfile tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public OutboundVoiceProfile addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"office-profile\"]", value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public OutboundVoiceProfile usagePaymentMethod(UsagePaymentMethod usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
    return this;
  }

   /**
   * Get usagePaymentMethod
   * @return usagePaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USAGE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsagePaymentMethod getUsagePaymentMethod() {
    return usagePaymentMethod;
  }


  public void setUsagePaymentMethod(UsagePaymentMethod usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
  }


  public OutboundVoiceProfile whitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
    return this;
  }

  public OutboundVoiceProfile addWhitelistedDestinationsItem(String whitelistedDestinationsItem) {
    if (this.whitelistedDestinations == null) {
      this.whitelistedDestinations = new ArrayList<>();
    }
    this.whitelistedDestinations.add(whitelistedDestinationsItem);
    return this;
  }

   /**
   * The list of destinations you want to be able to call using this outbound voice profile formatted in alpha2.
   * @return whitelistedDestinations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"US\",\"BR\",\"AU\"]", value = "The list of destinations you want to be able to call using this outbound voice profile formatted in alpha2.")
  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWhitelistedDestinations() {
    return whitelistedDestinations;
  }


  public void setWhitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
  }


  public OutboundVoiceProfile maxDestinationRate(BigDecimal maxDestinationRate) {
    this.maxDestinationRate = maxDestinationRate;
    return this;
  }

   /**
   * Maximum rate (price per minute) for a Destination to be allowed when making outbound calls.
   * @return maxDestinationRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum rate (price per minute) for a Destination to be allowed when making outbound calls.")
  @JsonProperty(JSON_PROPERTY_MAX_DESTINATION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxDestinationRate() {
    return maxDestinationRate;
  }


  public void setMaxDestinationRate(BigDecimal maxDestinationRate) {
    this.maxDestinationRate = maxDestinationRate;
  }


  public OutboundVoiceProfile dailySpendLimit(String dailySpendLimit) {
    this.dailySpendLimit = dailySpendLimit;
    return this;
  }

   /**
   * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice profile in a day before disallowing new calls.
   * @return dailySpendLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice profile in a day before disallowing new calls.")
  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDailySpendLimit() {
    return dailySpendLimit;
  }


  public void setDailySpendLimit(String dailySpendLimit) {
    this.dailySpendLimit = dailySpendLimit;
  }


  public OutboundVoiceProfile dailySpendLimitEnabled(Boolean dailySpendLimitEnabled) {
    this.dailySpendLimitEnabled = dailySpendLimitEnabled;
    return this;
  }

   /**
   * Specifies whether to enforce the daily_spend_limit on this outbound voice profile.
   * @return dailySpendLimitEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether to enforce the daily_spend_limit on this outbound voice profile.")
  @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDailySpendLimitEnabled() {
    return dailySpendLimitEnabled;
  }


  public void setDailySpendLimitEnabled(Boolean dailySpendLimitEnabled) {
    this.dailySpendLimitEnabled = dailySpendLimitEnabled;
  }


  public OutboundVoiceProfile callRecording(OutboundCallRecording callRecording) {
    this.callRecording = callRecording;
    return this;
  }

   /**
   * Get callRecording
   * @return callRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutboundCallRecording getCallRecording() {
    return callRecording;
  }


  public void setCallRecording(OutboundCallRecording callRecording) {
    this.callRecording = callRecording;
  }


  public OutboundVoiceProfile billingGroupId(UUID billingGroupId) {
    this.billingGroupId = JsonNullable.<UUID>of(billingGroupId);
    return this;
  }

   /**
   * The ID of the billing group associated with the outbound proflile. Defaults to null (for no group assigned).
   * @return billingGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The ID of the billing group associated with the outbound proflile. Defaults to null (for no group assigned).")
  @JsonIgnore

  public UUID getBillingGroupId() {
        return billingGroupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getBillingGroupId_JsonNullable() {
    return billingGroupId;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  public void setBillingGroupId_JsonNullable(JsonNullable<UUID> billingGroupId) {
    this.billingGroupId = billingGroupId;
  }

  public void setBillingGroupId(UUID billingGroupId) {
    this.billingGroupId = JsonNullable.<UUID>of(billingGroupId);
  }


  public OutboundVoiceProfile createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date-time indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public OutboundVoiceProfile updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date-time indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this OutboundVoiceProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundVoiceProfile outboundVoiceProfile = (OutboundVoiceProfile) o;
    return Objects.equals(this.id, outboundVoiceProfile.id) &&
        Objects.equals(this.recordType, outboundVoiceProfile.recordType) &&
        Objects.equals(this.name, outboundVoiceProfile.name) &&
        Objects.equals(this.connectionsCount, outboundVoiceProfile.connectionsCount) &&
        Objects.equals(this.trafficType, outboundVoiceProfile.trafficType) &&
        Objects.equals(this.servicePlan, outboundVoiceProfile.servicePlan) &&
        Objects.equals(this.concurrentCallLimit, outboundVoiceProfile.concurrentCallLimit) &&
        Objects.equals(this.enabled, outboundVoiceProfile.enabled) &&
        Objects.equals(this.tags, outboundVoiceProfile.tags) &&
        Objects.equals(this.usagePaymentMethod, outboundVoiceProfile.usagePaymentMethod) &&
        Objects.equals(this.whitelistedDestinations, outboundVoiceProfile.whitelistedDestinations) &&
        Objects.equals(this.maxDestinationRate, outboundVoiceProfile.maxDestinationRate) &&
        Objects.equals(this.dailySpendLimit, outboundVoiceProfile.dailySpendLimit) &&
        Objects.equals(this.dailySpendLimitEnabled, outboundVoiceProfile.dailySpendLimitEnabled) &&
        Objects.equals(this.callRecording, outboundVoiceProfile.callRecording) &&
        Objects.equals(this.billingGroupId, outboundVoiceProfile.billingGroupId) &&
        Objects.equals(this.createdAt, outboundVoiceProfile.createdAt) &&
        Objects.equals(this.updatedAt, outboundVoiceProfile.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, name, connectionsCount, trafficType, servicePlan, concurrentCallLimit, enabled, tags, usagePaymentMethod, whitelistedDestinations, maxDestinationRate, dailySpendLimit, dailySpendLimitEnabled, callRecording, billingGroupId, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundVoiceProfile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectionsCount: ").append(toIndentedString(connectionsCount)).append("\n");
    sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    concurrentCallLimit: ").append(toIndentedString(concurrentCallLimit)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    usagePaymentMethod: ").append(toIndentedString(usagePaymentMethod)).append("\n");
    sb.append("    whitelistedDestinations: ").append(toIndentedString(whitelistedDestinations)).append("\n");
    sb.append("    maxDestinationRate: ").append(toIndentedString(maxDestinationRate)).append("\n");
    sb.append("    dailySpendLimit: ").append(toIndentedString(dailySpendLimit)).append("\n");
    sb.append("    dailySpendLimitEnabled: ").append(toIndentedString(dailySpendLimitEnabled)).append("\n");
    sb.append("    callRecording: ").append(toIndentedString(callRecording)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

