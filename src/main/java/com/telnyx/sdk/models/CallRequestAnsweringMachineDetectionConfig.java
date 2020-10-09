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


package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Optional configuration parameters to modify &#39;answering_machine_detection&#39; performance.
 */
@ApiModel(description = "Optional configuration parameters to modify 'answering_machine_detection' performance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallRequestAnsweringMachineDetectionConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TOTAL_ANALYSIS_TIME_MILLIS = "total_analysis_time_millis";
  @SerializedName(SERIALIZED_NAME_TOTAL_ANALYSIS_TIME_MILLIS)
  private Integer totalAnalysisTimeMillis = 3500;

  public static final String SERIALIZED_NAME_AFTER_GREETING_SILENCE_MILLIS = "after_greeting_silence_millis";
  @SerializedName(SERIALIZED_NAME_AFTER_GREETING_SILENCE_MILLIS)
  private Integer afterGreetingSilenceMillis = 800;

  public static final String SERIALIZED_NAME_BETWEEN_WORDS_SILENCE_MILLIS = "between_words_silence_millis";
  @SerializedName(SERIALIZED_NAME_BETWEEN_WORDS_SILENCE_MILLIS)
  private Integer betweenWordsSilenceMillis = 50;

  public static final String SERIALIZED_NAME_GREETING_DURATION_MILLIS = "greeting_duration_millis";
  @SerializedName(SERIALIZED_NAME_GREETING_DURATION_MILLIS)
  private Integer greetingDurationMillis = 3500;

  public static final String SERIALIZED_NAME_INITIAL_SILENCE_MILLIS = "initial_silence_millis";
  @SerializedName(SERIALIZED_NAME_INITIAL_SILENCE_MILLIS)
  private Integer initialSilenceMillis = 3500;

  public static final String SERIALIZED_NAME_MAXIMUM_NUMBER_OF_WORDS = "maximum_number_of_words";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_NUMBER_OF_WORDS)
  private Integer maximumNumberOfWords = 5;

  public static final String SERIALIZED_NAME_MAXIMUM_WORD_LENGTH_MILLIS = "maximum_word_length_millis";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_WORD_LENGTH_MILLIS)
  private Integer maximumWordLengthMillis = 3500;

  public static final String SERIALIZED_NAME_SILENCE_THRESHOLD = "silence_threshold";
  @SerializedName(SERIALIZED_NAME_SILENCE_THRESHOLD)
  private Integer silenceThreshold = 256;

  public static final String SERIALIZED_NAME_GREETING_TOTAL_ANALYSIS_TIME_MILLIS = "greeting_total_analysis_time_millis";
  @SerializedName(SERIALIZED_NAME_GREETING_TOTAL_ANALYSIS_TIME_MILLIS)
  private Integer greetingTotalAnalysisTimeMillis = 5000;

  public static final String SERIALIZED_NAME_GREETING_SILENCE_DURATION_MILLIS = "greeting_silence_duration_millis";
  @SerializedName(SERIALIZED_NAME_GREETING_SILENCE_DURATION_MILLIS)
  private Integer greetingSilenceDurationMillis = 1500;


  public CallRequestAnsweringMachineDetectionConfig totalAnalysisTimeMillis(Integer totalAnalysisTimeMillis) {
    
    this.totalAnalysisTimeMillis = totalAnalysisTimeMillis;
    return this;
  }

   /**
   * Maximum timeout threshold for overall detection.
   * @return totalAnalysisTimeMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "Maximum timeout threshold for overall detection.")

  public Integer getTotalAnalysisTimeMillis() {
    return totalAnalysisTimeMillis;
  }


  public void setTotalAnalysisTimeMillis(Integer totalAnalysisTimeMillis) {
    this.totalAnalysisTimeMillis = totalAnalysisTimeMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig afterGreetingSilenceMillis(Integer afterGreetingSilenceMillis) {
    
    this.afterGreetingSilenceMillis = afterGreetingSilenceMillis;
    return this;
  }

   /**
   * Silence duration threshold after a greeting message or voice for it be considered human.
   * @return afterGreetingSilenceMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Silence duration threshold after a greeting message or voice for it be considered human.")

  public Integer getAfterGreetingSilenceMillis() {
    return afterGreetingSilenceMillis;
  }


  public void setAfterGreetingSilenceMillis(Integer afterGreetingSilenceMillis) {
    this.afterGreetingSilenceMillis = afterGreetingSilenceMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig betweenWordsSilenceMillis(Integer betweenWordsSilenceMillis) {
    
    this.betweenWordsSilenceMillis = betweenWordsSilenceMillis;
    return this;
  }

   /**
   * Maximum threshold for silence between words.
   * @return betweenWordsSilenceMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Maximum threshold for silence between words.")

  public Integer getBetweenWordsSilenceMillis() {
    return betweenWordsSilenceMillis;
  }


  public void setBetweenWordsSilenceMillis(Integer betweenWordsSilenceMillis) {
    this.betweenWordsSilenceMillis = betweenWordsSilenceMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig greetingDurationMillis(Integer greetingDurationMillis) {
    
    this.greetingDurationMillis = greetingDurationMillis;
    return this;
  }

   /**
   * Maximum threshold of a human greeting. If greeting longer than this value, considered machine.
   * @return greetingDurationMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1500", value = "Maximum threshold of a human greeting. If greeting longer than this value, considered machine.")

  public Integer getGreetingDurationMillis() {
    return greetingDurationMillis;
  }


  public void setGreetingDurationMillis(Integer greetingDurationMillis) {
    this.greetingDurationMillis = greetingDurationMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig initialSilenceMillis(Integer initialSilenceMillis) {
    
    this.initialSilenceMillis = initialSilenceMillis;
    return this;
  }

   /**
   * If initial silence duration is greater than this value, consider it a machine.
   * @return initialSilenceMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1800", value = "If initial silence duration is greater than this value, consider it a machine.")

  public Integer getInitialSilenceMillis() {
    return initialSilenceMillis;
  }


  public void setInitialSilenceMillis(Integer initialSilenceMillis) {
    this.initialSilenceMillis = initialSilenceMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig maximumNumberOfWords(Integer maximumNumberOfWords) {
    
    this.maximumNumberOfWords = maximumNumberOfWords;
    return this;
  }

   /**
   * If number of detected words is greater than this value, consder it a machine.
   * @return maximumNumberOfWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "If number of detected words is greater than this value, consder it a machine.")

  public Integer getMaximumNumberOfWords() {
    return maximumNumberOfWords;
  }


  public void setMaximumNumberOfWords(Integer maximumNumberOfWords) {
    this.maximumNumberOfWords = maximumNumberOfWords;
  }


  public CallRequestAnsweringMachineDetectionConfig maximumWordLengthMillis(Integer maximumWordLengthMillis) {
    
    this.maximumWordLengthMillis = maximumWordLengthMillis;
    return this;
  }

   /**
   * If a single word lasts longer than this threshold, consider it a machine.
   * @return maximumWordLengthMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "If a single word lasts longer than this threshold, consider it a machine.")

  public Integer getMaximumWordLengthMillis() {
    return maximumWordLengthMillis;
  }


  public void setMaximumWordLengthMillis(Integer maximumWordLengthMillis) {
    this.maximumWordLengthMillis = maximumWordLengthMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig silenceThreshold(Integer silenceThreshold) {
    
    this.silenceThreshold = silenceThreshold;
    return this;
  }

   /**
   * Minimum noise threshold for any analysis.
   * @return silenceThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "512", value = "Minimum noise threshold for any analysis.")

  public Integer getSilenceThreshold() {
    return silenceThreshold;
  }


  public void setSilenceThreshold(Integer silenceThreshold) {
    this.silenceThreshold = silenceThreshold;
  }


  public CallRequestAnsweringMachineDetectionConfig greetingTotalAnalysisTimeMillis(Integer greetingTotalAnalysisTimeMillis) {
    
    this.greetingTotalAnalysisTimeMillis = greetingTotalAnalysisTimeMillis;
    return this;
  }

   /**
   * If machine already detected, maximum timeout threshold to determine the end of the machine greeting.
   * @return greetingTotalAnalysisTimeMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7500", value = "If machine already detected, maximum timeout threshold to determine the end of the machine greeting.")

  public Integer getGreetingTotalAnalysisTimeMillis() {
    return greetingTotalAnalysisTimeMillis;
  }


  public void setGreetingTotalAnalysisTimeMillis(Integer greetingTotalAnalysisTimeMillis) {
    this.greetingTotalAnalysisTimeMillis = greetingTotalAnalysisTimeMillis;
  }


  public CallRequestAnsweringMachineDetectionConfig greetingSilenceDurationMillis(Integer greetingSilenceDurationMillis) {
    
    this.greetingSilenceDurationMillis = greetingSilenceDurationMillis;
    return this;
  }

   /**
   * If machine already detected, maximum threshold for silence between words. If exceeded, the greeting is considered ended.
   * @return greetingSilenceDurationMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "If machine already detected, maximum threshold for silence between words. If exceeded, the greeting is considered ended.")

  public Integer getGreetingSilenceDurationMillis() {
    return greetingSilenceDurationMillis;
  }


  public void setGreetingSilenceDurationMillis(Integer greetingSilenceDurationMillis) {
    this.greetingSilenceDurationMillis = greetingSilenceDurationMillis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallRequestAnsweringMachineDetectionConfig callRequestAnsweringMachineDetectionConfig = (CallRequestAnsweringMachineDetectionConfig) o;
    return Objects.equals(this.totalAnalysisTimeMillis, callRequestAnsweringMachineDetectionConfig.totalAnalysisTimeMillis) &&
        Objects.equals(this.afterGreetingSilenceMillis, callRequestAnsweringMachineDetectionConfig.afterGreetingSilenceMillis) &&
        Objects.equals(this.betweenWordsSilenceMillis, callRequestAnsweringMachineDetectionConfig.betweenWordsSilenceMillis) &&
        Objects.equals(this.greetingDurationMillis, callRequestAnsweringMachineDetectionConfig.greetingDurationMillis) &&
        Objects.equals(this.initialSilenceMillis, callRequestAnsweringMachineDetectionConfig.initialSilenceMillis) &&
        Objects.equals(this.maximumNumberOfWords, callRequestAnsweringMachineDetectionConfig.maximumNumberOfWords) &&
        Objects.equals(this.maximumWordLengthMillis, callRequestAnsweringMachineDetectionConfig.maximumWordLengthMillis) &&
        Objects.equals(this.silenceThreshold, callRequestAnsweringMachineDetectionConfig.silenceThreshold) &&
        Objects.equals(this.greetingTotalAnalysisTimeMillis, callRequestAnsweringMachineDetectionConfig.greetingTotalAnalysisTimeMillis) &&
        Objects.equals(this.greetingSilenceDurationMillis, callRequestAnsweringMachineDetectionConfig.greetingSilenceDurationMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAnalysisTimeMillis, afterGreetingSilenceMillis, betweenWordsSilenceMillis, greetingDurationMillis, initialSilenceMillis, maximumNumberOfWords, maximumWordLengthMillis, silenceThreshold, greetingTotalAnalysisTimeMillis, greetingSilenceDurationMillis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallRequestAnsweringMachineDetectionConfig {\n");
    sb.append("    totalAnalysisTimeMillis: ").append(toIndentedString(totalAnalysisTimeMillis)).append("\n");
    sb.append("    afterGreetingSilenceMillis: ").append(toIndentedString(afterGreetingSilenceMillis)).append("\n");
    sb.append("    betweenWordsSilenceMillis: ").append(toIndentedString(betweenWordsSilenceMillis)).append("\n");
    sb.append("    greetingDurationMillis: ").append(toIndentedString(greetingDurationMillis)).append("\n");
    sb.append("    initialSilenceMillis: ").append(toIndentedString(initialSilenceMillis)).append("\n");
    sb.append("    maximumNumberOfWords: ").append(toIndentedString(maximumNumberOfWords)).append("\n");
    sb.append("    maximumWordLengthMillis: ").append(toIndentedString(maximumWordLengthMillis)).append("\n");
    sb.append("    silenceThreshold: ").append(toIndentedString(silenceThreshold)).append("\n");
    sb.append("    greetingTotalAnalysisTimeMillis: ").append(toIndentedString(greetingTotalAnalysisTimeMillis)).append("\n");
    sb.append("    greetingSilenceDurationMillis: ").append(toIndentedString(greetingSilenceDurationMillis)).append("\n");
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
