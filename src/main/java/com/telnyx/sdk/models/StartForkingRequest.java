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
/**
 * StartForkingRequest
 */


public class StartForkingRequest {
  @SerializedName("target")
  private String target = null;

  @SerializedName("rx")
  private String rx = null;

  @SerializedName("tx")
  private String tx = null;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("command_id")
  private String commandId = null;

  public StartForkingRequest target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The network target, &lt;udp:ip_address:port&gt;, where the call&#x27;s RTP media packets should be forwarded. Both incoming and outgoing media packets will be delivered to the specified target, and information about the stream will be included in the encapsulation protocol header, including the direction (0 &#x3D; inbound; 1 &#x3D; outbound), leg (0 &#x3D; A-leg; 1 &#x3D; B-leg), and call_leg_id.
   * @return target
  **/
  @Schema(example = "udp:192.0.2.1:9000", description = "The network target, <udp:ip_address:port>, where the call's RTP media packets should be forwarded. Both incoming and outgoing media packets will be delivered to the specified target, and information about the stream will be included in the encapsulation protocol header, including the direction (0 = inbound; 1 = outbound), leg (0 = A-leg; 1 = B-leg), and call_leg_id.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public StartForkingRequest rx(String rx) {
    this.rx = rx;
    return this;
  }

   /**
   * The network target, &lt;udp:ip_address:port&gt;, where the call&#x27;s incoming RTP media packets should be forwarded.
   * @return rx
  **/
  @Schema(example = "192.0.2.1:9000", description = "The network target, <udp:ip_address:port>, where the call's incoming RTP media packets should be forwarded.")
  public String getRx() {
    return rx;
  }

  public void setRx(String rx) {
    this.rx = rx;
  }

  public StartForkingRequest tx(String tx) {
    this.tx = tx;
    return this;
  }

   /**
   * The network target, &lt;udp:ip_address:port&gt;, where the call&#x27;s outgoing RTP media packets should be forwarded.
   * @return tx
  **/
  @Schema(example = "192.0.2.1:9001", description = "The network target, <udp:ip_address:port>, where the call's outgoing RTP media packets should be forwarded.")
  public String getTx() {
    return tx;
  }

  public void setTx(String tx) {
    this.tx = tx;
  }

  public StartForkingRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @Schema(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", description = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public StartForkingRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;.
   * @return commandId
  **/
  @Schema(example = "891510ac-f3e4-11e8-af5b-de00688a4901", description = "Use this field to avoid duplicate commands. Telnyx will ignore commands with the same `command_id`.")
  public String getCommandId() {
    return commandId;
  }

  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartForkingRequest startForkingRequest = (StartForkingRequest) o;
    return Objects.equals(this.target, startForkingRequest.target) &&
        Objects.equals(this.rx, startForkingRequest.rx) &&
        Objects.equals(this.tx, startForkingRequest.tx) &&
        Objects.equals(this.clientState, startForkingRequest.clientState) &&
        Objects.equals(this.commandId, startForkingRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, rx, tx, clientState, commandId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartForkingRequest {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    rx: ").append(toIndentedString(rx)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
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