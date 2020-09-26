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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * CallHangupPayload
 */


public class CallHangupPayload {
  @SerializedName("call_control_id")
  private UUID callControlId = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_session_id")
  private String callSessionId = null;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  /**
   * State received from a command.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    HANGUP("hangup");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("state")
  private StateEnum state = null;

  /**
   * The reason the call was ended (&#x60;call_rejected&#x60;, &#x60;normal_clearing&#x60;, &#x60;originator_cancel&#x60;, &#x60;timeout&#x60;, &#x60;time_limit&#x60;, &#x60;user_busy&#x60;, &#x60;not_found&#x60; or &#x60;unspecified&#x60;).
   */
  @JsonAdapter(HangupCauseEnum.Adapter.class)
  public enum HangupCauseEnum {
    CALL_REJECTED("call_rejected"),
    NORMAL_CLEARING("normal_clearing"),
    ORIGINATOR_CANCEL("originator_cancel"),
    TIMEOUT("timeout"),
    TIME_LIMIT("time_limit"),
    USER_BUSY("user_busy"),
    NOT_FOUND("not_found"),
    UNSPECIFIED("unspecified");

    private String value;

    HangupCauseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HangupCauseEnum fromValue(String text) {
      for (HangupCauseEnum b : HangupCauseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HangupCauseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HangupCauseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HangupCauseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HangupCauseEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("hangup_cause")
  private HangupCauseEnum hangupCause = null;

  /**
   * The party who ended the call (&#x60;callee&#x60;, &#x60;caller&#x60;, &#x60;unknown&#x60;).
   */
  @JsonAdapter(HangupSourceEnum.Adapter.class)
  public enum HangupSourceEnum {
    CALLER("caller"),
    CALLEE("callee"),
    UNKNOWN("unknown");

    private String value;

    HangupSourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HangupSourceEnum fromValue(String text) {
      for (HangupSourceEnum b : HangupSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HangupSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HangupSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HangupSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HangupSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("hangup_source")
  private HangupSourceEnum hangupSource = null;

  @SerializedName("sip_hangup_cause")
  private String sipHangupCause = null;

  public CallHangupPayload callControlId(UUID callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @Schema(description = "Call ID used to issue commands via Call Control API.")
  public UUID getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(UUID callControlId) {
    this.callControlId = callControlId;
  }

  public CallHangupPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @Schema(example = "7267xxxxxxxxxxxxxx", description = "Telnyx connection ID used in the call.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public CallHangupPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @Schema(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", description = "ID that is unique to the call and can be used to correlate webhook events.")
  public String getCallLegId() {
    return callLegId;
  }

  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }

  public CallHangupPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "ID that is unique to the call session and can be used to correlate webhook events.")
  public String getCallSessionId() {
    return callSessionId;
  }

  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }

  public CallHangupPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @Schema(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", description = "State received from a command.")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public CallHangupPayload from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Number or SIP URI placing the call.
   * @return from
  **/
  @Schema(example = "+35319605860", description = "Number or SIP URI placing the call.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public CallHangupPayload to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Destination number or SIP URI of the call.
   * @return to
  **/
  @Schema(example = "+13129457420", description = "Destination number or SIP URI of the call.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public CallHangupPayload state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State received from a command.
   * @return state
  **/
  @Schema(example = "hangup", description = "State received from a command.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CallHangupPayload hangupCause(HangupCauseEnum hangupCause) {
    this.hangupCause = hangupCause;
    return this;
  }

   /**
   * The reason the call was ended (&#x60;call_rejected&#x60;, &#x60;normal_clearing&#x60;, &#x60;originator_cancel&#x60;, &#x60;timeout&#x60;, &#x60;time_limit&#x60;, &#x60;user_busy&#x60;, &#x60;not_found&#x60; or &#x60;unspecified&#x60;).
   * @return hangupCause
  **/
  @Schema(example = "call_rejected", description = "The reason the call was ended (`call_rejected`, `normal_clearing`, `originator_cancel`, `timeout`, `time_limit`, `user_busy`, `not_found` or `unspecified`).")
  public HangupCauseEnum getHangupCause() {
    return hangupCause;
  }

  public void setHangupCause(HangupCauseEnum hangupCause) {
    this.hangupCause = hangupCause;
  }

  public CallHangupPayload hangupSource(HangupSourceEnum hangupSource) {
    this.hangupSource = hangupSource;
    return this;
  }

   /**
   * The party who ended the call (&#x60;callee&#x60;, &#x60;caller&#x60;, &#x60;unknown&#x60;).
   * @return hangupSource
  **/
  @Schema(example = "caller", description = "The party who ended the call (`callee`, `caller`, `unknown`).")
  public HangupSourceEnum getHangupSource() {
    return hangupSource;
  }

  public void setHangupSource(HangupSourceEnum hangupSource) {
    this.hangupSource = hangupSource;
  }

  public CallHangupPayload sipHangupCause(String sipHangupCause) {
    this.sipHangupCause = sipHangupCause;
    return this;
  }

   /**
   * The reason the call was ended (SIP response code). If the SIP response is unavailable (in inbound calls for example) this is set to &#x60;unspecified&#x60;.
   * @return sipHangupCause
  **/
  @Schema(example = "603", description = "The reason the call was ended (SIP response code). If the SIP response is unavailable (in inbound calls for example) this is set to `unspecified`.")
  public String getSipHangupCause() {
    return sipHangupCause;
  }

  public void setSipHangupCause(String sipHangupCause) {
    this.sipHangupCause = sipHangupCause;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallHangupPayload callHangupPayload = (CallHangupPayload) o;
    return Objects.equals(this.callControlId, callHangupPayload.callControlId) &&
        Objects.equals(this.connectionId, callHangupPayload.connectionId) &&
        Objects.equals(this.callLegId, callHangupPayload.callLegId) &&
        Objects.equals(this.callSessionId, callHangupPayload.callSessionId) &&
        Objects.equals(this.clientState, callHangupPayload.clientState) &&
        Objects.equals(this.from, callHangupPayload.from) &&
        Objects.equals(this.to, callHangupPayload.to) &&
        Objects.equals(this.state, callHangupPayload.state) &&
        Objects.equals(this.hangupCause, callHangupPayload.hangupCause) &&
        Objects.equals(this.hangupSource, callHangupPayload.hangupSource) &&
        Objects.equals(this.sipHangupCause, callHangupPayload.sipHangupCause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, from, to, state, hangupCause, hangupSource, sipHangupCause);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallHangupPayload {\n");
    
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    hangupCause: ").append(toIndentedString(hangupCause)).append("\n");
    sb.append("    hangupSource: ").append(toIndentedString(hangupSource)).append("\n");
    sb.append("    sipHangupCause: ").append(toIndentedString(sipHangupCause)).append("\n");
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