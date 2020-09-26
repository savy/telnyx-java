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
 * NumberOrderDocument
 */


public class NumberOrderDocument {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("file_id")
  private String fileId = null;

  @SerializedName("requirements_id")
  private String requirementsId = null;

  @SerializedName("customer_reference")
  private String customerReference = null;

  /**
   * Gets or Sets requirementType
   */
  @JsonAdapter(RequirementTypeEnum.Adapter.class)
  public enum RequirementTypeEnum {
    ADDRESS_PROOF("address_proof"),
    IDENTIFICATION("identification"),
    REG_FORM("reg_form");

    private String value;

    RequirementTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RequirementTypeEnum fromValue(String text) {
      for (RequirementTypeEnum b : RequirementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RequirementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequirementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequirementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RequirementTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("requirement_type")
  private RequirementTypeEnum requirementType = null;

  @SerializedName("created_at")
  private String createdAt = null;

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "387d1e31-a218-4375-8151-103f2d5e2d2c", description = "")
  public UUID getId() {
    return id;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @Schema(example = "number_order_document", description = "")
  public String getRecordType() {
    return recordType;
  }

  public NumberOrderDocument fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The id of the file to associate as a number order document.
   * @return fileId
  **/
  @Schema(example = "1e3c5822-0362-4702-8e46-5a129f0d3976", description = "The id of the file to associate as a number order document.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public NumberOrderDocument requirementsId(String requirementsId) {
    this.requirementsId = requirementsId;
    return this;
  }

   /**
   * Unique id for a requirement.
   * @return requirementsId
  **/
  @Schema(example = "36aaf27d-986b-493c-bd1b-de16af2e4292", description = "Unique id for a requirement.")
  public String getRequirementsId() {
    return requirementsId;
  }

  public void setRequirementsId(String requirementsId) {
    this.requirementsId = requirementsId;
  }

  public NumberOrderDocument customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @Schema(example = "MY REF 001", description = "A customer reference string for customer look ups.")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

   /**
   * Get requirementType
   * @return requirementType
  **/
  @Schema(description = "")
  public RequirementTypeEnum getRequirementType() {
    return requirementType;
  }

   /**
   * An ISO 8901 datetime string denoting when the number order document was uploaded.
   * @return createdAt
  **/
  @Schema(example = "2018-01-01T00:00:00.000000Z", description = "An ISO 8901 datetime string denoting when the number order document was uploaded.")
  public String getCreatedAt() {
    return createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOrderDocument numberOrderDocument = (NumberOrderDocument) o;
    return Objects.equals(this.id, numberOrderDocument.id) &&
        Objects.equals(this.recordType, numberOrderDocument.recordType) &&
        Objects.equals(this.fileId, numberOrderDocument.fileId) &&
        Objects.equals(this.requirementsId, numberOrderDocument.requirementsId) &&
        Objects.equals(this.customerReference, numberOrderDocument.customerReference) &&
        Objects.equals(this.requirementType, numberOrderDocument.requirementType) &&
        Objects.equals(this.createdAt, numberOrderDocument.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, fileId, requirementsId, customerReference, requirementType, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOrderDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    requirementsId: ").append(toIndentedString(requirementsId)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    requirementType: ").append(toIndentedString(requirementType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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