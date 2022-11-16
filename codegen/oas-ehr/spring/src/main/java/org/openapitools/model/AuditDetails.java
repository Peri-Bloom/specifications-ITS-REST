package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.Attestation;
import org.openapitools.model.AuditDetails;
import org.openapitools.model.DvCodedText;
import org.openapitools.model.DvDateTime;
import org.openapitools.model.DvText;
import org.openapitools.model.PartyProxy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The set of attributes required to document the committal of an information item to a repository.
 */

@Schema(name = "AuditDetails", description = "The set of attributes required to document the committal of an information item to a repository.")
@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Attestation.class, name = "AUDIT_DETAILS"),
  @JsonSubTypes.Type(value = AuditDetails.class, name = "AUDIT_DETAILS"),
  @JsonSubTypes.Type(value = Attestation.class, name = "AUDIT_DETAILS")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditDetails {

  @JsonProperty("_type")
  private String type = "AUDIT_DETAILS";

  @JsonProperty("system_id")
  private String systemId;

  @JsonProperty("time_committed")
  private DvDateTime timeCommitted;

  @JsonProperty("change_type")
  private DvCodedText changeType;

  @JsonProperty("description")
  private DvText description;

  @JsonProperty("committer")
  private PartyProxy committer;

  public AuditDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "_type", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AuditDetails systemId(String systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * Get systemId
   * @return systemId
  */
  @NotNull 
  @Schema(name = "system_id", required = true)
  public String getSystemId() {
    return systemId;
  }

  public void setSystemId(String systemId) {
    this.systemId = systemId;
  }

  public AuditDetails timeCommitted(DvDateTime timeCommitted) {
    this.timeCommitted = timeCommitted;
    return this;
  }

  /**
   * Get timeCommitted
   * @return timeCommitted
  */
  @NotNull @Valid 
  @Schema(name = "time_committed", required = true)
  public DvDateTime getTimeCommitted() {
    return timeCommitted;
  }

  public void setTimeCommitted(DvDateTime timeCommitted) {
    this.timeCommitted = timeCommitted;
  }

  public AuditDetails changeType(DvCodedText changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
  */
  @NotNull @Valid 
  @Schema(name = "change_type", required = true)
  public DvCodedText getChangeType() {
    return changeType;
  }

  public void setChangeType(DvCodedText changeType) {
    this.changeType = changeType;
  }

  public AuditDetails description(DvText description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Valid 
  @Schema(name = "description", required = false)
  public DvText getDescription() {
    return description;
  }

  public void setDescription(DvText description) {
    this.description = description;
  }

  public AuditDetails committer(PartyProxy committer) {
    this.committer = committer;
    return this;
  }

  /**
   * Get committer
   * @return committer
  */
  @NotNull @Valid 
  @Schema(name = "committer", required = true)
  public PartyProxy getCommitter() {
    return committer;
  }

  public void setCommitter(PartyProxy committer) {
    this.committer = committer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDetails auditDetails = (AuditDetails) o;
    return Objects.equals(this.type, auditDetails.type) &&
        Objects.equals(this.systemId, auditDetails.systemId) &&
        Objects.equals(this.timeCommitted, auditDetails.timeCommitted) &&
        Objects.equals(this.changeType, auditDetails.changeType) &&
        Objects.equals(this.description, auditDetails.description) &&
        Objects.equals(this.committer, auditDetails.committer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, systemId, timeCommitted, changeType, description, committer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    timeCommitted: ").append(toIndentedString(timeCommitted)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
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

