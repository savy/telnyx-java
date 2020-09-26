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
import com.telnyx.sdk.models.RegulatoryRequirement;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * PhoneNumberRegulatoryGroup
 */


public class PhoneNumberRegulatoryGroup {
  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("regulatory_group_id")
  private UUID regulatoryGroupId = null;

  @SerializedName("regulatory_requirements")
  private List<RegulatoryRequirement> regulatoryRequirements = null;

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(example = "phone_number_regulatory_requirement", description = "")
  public String getRecordType() {
    return recordType;
  }

  public PhoneNumberRegulatoryGroup phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(example = "+19705555098", description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PhoneNumberRegulatoryGroup regulatoryGroupId(UUID regulatoryGroupId) {
    this.regulatoryGroupId = regulatoryGroupId;
    return this;
  }

   /**
   * Get regulatoryGroupId
   * @return regulatoryGroupId
  **/
  @Schema(example = "d70873cd-7c98-401a-81b6-b1ae08246995", description = "")
  public UUID getRegulatoryGroupId() {
    return regulatoryGroupId;
  }

  public void setRegulatoryGroupId(UUID regulatoryGroupId) {
    this.regulatoryGroupId = regulatoryGroupId;
  }

  public PhoneNumberRegulatoryGroup regulatoryRequirements(List<RegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public PhoneNumberRegulatoryGroup addRegulatoryRequirementsItem(RegulatoryRequirement regulatoryRequirementsItem) {
    if (this.regulatoryRequirements == null) {
      this.regulatoryRequirements = new ArrayList<>();
    }
    this.regulatoryRequirements.add(regulatoryRequirementsItem);
    return this;
  }

   /**
   * Get regulatoryRequirements
   * @return regulatoryRequirements
  **/
  @Schema(description = "")
  public List<RegulatoryRequirement> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }

  public void setRegulatoryRequirements(List<RegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberRegulatoryGroup phoneNumberRegulatoryGroup = (PhoneNumberRegulatoryGroup) o;
    return Objects.equals(this.recordType, phoneNumberRegulatoryGroup.recordType) &&
        Objects.equals(this.phoneNumber, phoneNumberRegulatoryGroup.phoneNumber) &&
        Objects.equals(this.regulatoryGroupId, phoneNumberRegulatoryGroup.regulatoryGroupId) &&
        Objects.equals(this.regulatoryRequirements, phoneNumberRegulatoryGroup.regulatoryRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, phoneNumber, regulatoryGroupId, regulatoryRequirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberRegulatoryGroup {\n");
    
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    regulatoryGroupId: ").append(toIndentedString(regulatoryGroupId)).append("\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
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