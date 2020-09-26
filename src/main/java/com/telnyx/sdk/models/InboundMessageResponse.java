/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.telnyx.sdk.models.Error;
import com.telnyx.sdk.models.InboundMessageResponseCost;
import com.telnyx.sdk.models.InboundMessageResponseFrom;
import com.telnyx.sdk.models.InboundMessageResponseMedia;
import com.telnyx.sdk.models.InboundMessageResponseTo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * InboundMessageResponse
 */


public class InboundMessageResponse {
  /**
   * Identifies the type of the resource.
   */
  @JsonAdapter(RecordTypeEnum.Adapter.class)
  public enum RecordTypeEnum {
    MESSAGE("message");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RecordTypeEnum fromValue(String text) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RecordTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecordTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecordTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecordTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("record_type")
  private RecordTypeEnum recordType = null;

  /**
   * The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INBOUND("inbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("id")
  private UUID id = null;

  /**
   * The type of message. This value can be either &#x27;sms&#x27; or &#x27;mms&#x27;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SMS("SMS"),
    MMS("MMS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("messaging_profile_id")
  private UUID messagingProfileId = null;

  @SerializedName("to")
  private List<InboundMessageResponseTo> to = null;

  @SerializedName("cc")
  private List<InboundMessageResponseTo> cc = null;

  @SerializedName("from")
  private InboundMessageResponseFrom from = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("media")
  private List<InboundMessageResponseMedia> media = null;

  @SerializedName("webhook_url")
  private String webhookUrl = null;

  @SerializedName("webhook_failover_url")
  private String webhookFailoverUrl = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("parts")
  private Integer parts = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("cost")
  private InboundMessageResponseCost cost = null;

  @SerializedName("received_at")
  private OffsetDateTime receivedAt = null;

  @SerializedName("sent_at")
  private OffsetDateTime sentAt = null;

  @SerializedName("completed_at")
  private OffsetDateTime completedAt = null;

  @SerializedName("valid_until")
  private OffsetDateTime validUntil = null;

  @SerializedName("errors")
  private List<Error> errors = null;

  public InboundMessageResponse recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "message", description = "Identifies the type of the resource.")
  public RecordTypeEnum getRecordType() {
    return recordType;
  }

  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }

  public InboundMessageResponse direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.
   * @return direction
  **/
  @Schema(example = "inbound", description = "The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public InboundMessageResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @Schema(description = "Identifies the type of resource.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public InboundMessageResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of message. This value can be either &#x27;sms&#x27; or &#x27;mms&#x27;.
   * @return type
  **/
  @Schema(description = "The type of message. This value can be either 'sms' or 'mms'.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InboundMessageResponse messagingProfileId(UUID messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Unique identifier for a messaging profile.
   * @return messagingProfileId
  **/
  @Schema(description = "Unique identifier for a messaging profile.")
  public UUID getMessagingProfileId() {
    return messagingProfileId;
  }

  public void setMessagingProfileId(UUID messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }

  public InboundMessageResponse to(List<InboundMessageResponseTo> to) {
    this.to = to;
    return this;
  }

  public InboundMessageResponse addToItem(InboundMessageResponseTo toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(description = "")
  public List<InboundMessageResponseTo> getTo() {
    return to;
  }

  public void setTo(List<InboundMessageResponseTo> to) {
    this.to = to;
  }

  public InboundMessageResponse cc(List<InboundMessageResponseTo> cc) {
    this.cc = cc;
    return this;
  }

  public InboundMessageResponse addCcItem(InboundMessageResponseTo ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @Schema(description = "")
  public List<InboundMessageResponseTo> getCc() {
    return cc;
  }

  public void setCc(List<InboundMessageResponseTo> cc) {
    this.cc = cc;
  }

  public InboundMessageResponse from(InboundMessageResponseFrom from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(description = "")
  public InboundMessageResponseFrom getFrom() {
    return from;
  }

  public void setFrom(InboundMessageResponseFrom from) {
    this.from = from;
  }

  public InboundMessageResponse text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message body (i.e., content) as a non-empty string.  **Required for SMS**
   * @return text
  **/
  @Schema(description = "Message body (i.e., content) as a non-empty string.  **Required for SMS**")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public InboundMessageResponse media(List<InboundMessageResponseMedia> media) {
    this.media = media;
    return this;
  }

  public InboundMessageResponse addMediaItem(InboundMessageResponseMedia mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @Schema(description = "")
  public List<InboundMessageResponseMedia> getMedia() {
    return media;
  }

  public void setMedia(List<InboundMessageResponseMedia> media) {
    this.media = media;
  }

  public InboundMessageResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this message will be sent.
   * @return webhookUrl
  **/
  @Schema(description = "The URL where webhooks related to this message will be sent.")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public InboundMessageResponse webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
    return this;
  }

   /**
   * The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.
   * @return webhookFailoverUrl
  **/
  @Schema(description = "The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.")
  public String getWebhookFailoverUrl() {
    return webhookFailoverUrl;
  }

  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }

  public InboundMessageResponse encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding scheme used for the message body.
   * @return encoding
  **/
  @Schema(description = "Encoding scheme used for the message body.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public InboundMessageResponse parts(Integer parts) {
    this.parts = parts;
    return this;
  }

   /**
   * Number of parts into which the message&#x27;s body must be split.
   * minimum: 1
   * maximum: 10
   * @return parts
  **/
  @Schema(description = "Number of parts into which the message's body must be split.")
  public Integer getParts() {
    return parts;
  }

  public void setParts(Integer parts) {
    this.parts = parts;
  }

  public InboundMessageResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public InboundMessageResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags associated with the resource.
   * @return tags
  **/
  @Schema(description = "Tags associated with the resource.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public InboundMessageResponse cost(InboundMessageResponseCost cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @Schema(description = "")
  public InboundMessageResponseCost getCost() {
    return cost;
  }

  public void setCost(InboundMessageResponseCost cost) {
    this.cost = cost;
  }

  public InboundMessageResponse receivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the message request was received.
   * @return receivedAt
  **/
  @Schema(description = "ISO 8601 formatted date indicating when the message request was received.")
  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }

  public InboundMessageResponse sentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
    return this;
  }

   /**
   * Not used for inbound messages.
   * @return sentAt
  **/
  @Schema(description = "Not used for inbound messages.")
  public OffsetDateTime getSentAt() {
    return sentAt;
  }

  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }

  public InboundMessageResponse completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Not used for inbound messages.
   * @return completedAt
  **/
  @Schema(description = "Not used for inbound messages.")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public InboundMessageResponse validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Not used for inbound messages.
   * @return validUntil
  **/
  @Schema(description = "Not used for inbound messages.")
  public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }

  public InboundMessageResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public InboundMessageResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses.
   * @return errors
  **/
  @Schema(description = "These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessageResponse inboundMessageResponse = (InboundMessageResponse) o;
    return Objects.equals(this.recordType, inboundMessageResponse.recordType) &&
        Objects.equals(this.direction, inboundMessageResponse.direction) &&
        Objects.equals(this.id, inboundMessageResponse.id) &&
        Objects.equals(this.type, inboundMessageResponse.type) &&
        Objects.equals(this.messagingProfileId, inboundMessageResponse.messagingProfileId) &&
        Objects.equals(this.to, inboundMessageResponse.to) &&
        Objects.equals(this.cc, inboundMessageResponse.cc) &&
        Objects.equals(this.from, inboundMessageResponse.from) &&
        Objects.equals(this.text, inboundMessageResponse.text) &&
        Objects.equals(this.media, inboundMessageResponse.media) &&
        Objects.equals(this.webhookUrl, inboundMessageResponse.webhookUrl) &&
        Objects.equals(this.webhookFailoverUrl, inboundMessageResponse.webhookFailoverUrl) &&
        Objects.equals(this.encoding, inboundMessageResponse.encoding) &&
        Objects.equals(this.parts, inboundMessageResponse.parts) &&
        Objects.equals(this.tags, inboundMessageResponse.tags) &&
        Objects.equals(this.cost, inboundMessageResponse.cost) &&
        Objects.equals(this.receivedAt, inboundMessageResponse.receivedAt) &&
        Objects.equals(this.sentAt, inboundMessageResponse.sentAt) &&
        Objects.equals(this.completedAt, inboundMessageResponse.completedAt) &&
        Objects.equals(this.validUntil, inboundMessageResponse.validUntil) &&
        Objects.equals(this.errors, inboundMessageResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, direction, id, type, messagingProfileId, to, cc, from, text, media, webhookUrl, webhookFailoverUrl, encoding, parts, tags, cost, receivedAt, sentAt, completedAt, validUntil, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessageResponse {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}