package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.Action;
import org.openapitools.model.CareEntry;
import org.openapitools.model.DvDateTime;
import org.openapitools.model.Evaluation;
import org.openapitools.model.Instruction;
import org.openapitools.model.InstructionDetails;
import org.openapitools.model.IsmTransition;
import org.openapitools.model.ItemStructure;
import org.openapitools.model.Observation;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Action
 */

@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Action.class, name = "ACTION"),
  @JsonSubTypes.Type(value = Evaluation.class, name = "ACTION"),
  @JsonSubTypes.Type(value = Instruction.class, name = "ACTION"),
  @JsonSubTypes.Type(value = Observation.class, name = "ACTION")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Action extends CareEntry {

  @JsonProperty("_type")
  private String type = "ACTION";

  @JsonProperty("time")
  private DvDateTime time;

  @JsonProperty("ism_transition")
  private IsmTransition ismTransition;

  @JsonProperty("instruction_details")
  private InstructionDetails instructionDetails;

  @JsonProperty("description")
  private ItemStructure description;

  public Action type(String type) {
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

  public Action time(DvDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @NotNull @Valid 
  @Schema(name = "time", required = true)
  public DvDateTime getTime() {
    return time;
  }

  public void setTime(DvDateTime time) {
    this.time = time;
  }

  public Action ismTransition(IsmTransition ismTransition) {
    this.ismTransition = ismTransition;
    return this;
  }

  /**
   * Get ismTransition
   * @return ismTransition
  */
  @NotNull @Valid 
  @Schema(name = "ism_transition", required = true)
  public IsmTransition getIsmTransition() {
    return ismTransition;
  }

  public void setIsmTransition(IsmTransition ismTransition) {
    this.ismTransition = ismTransition;
  }

  public Action instructionDetails(InstructionDetails instructionDetails) {
    this.instructionDetails = instructionDetails;
    return this;
  }

  /**
   * Get instructionDetails
   * @return instructionDetails
  */
  @Valid 
  @Schema(name = "instruction_details", required = false)
  public InstructionDetails getInstructionDetails() {
    return instructionDetails;
  }

  public void setInstructionDetails(InstructionDetails instructionDetails) {
    this.instructionDetails = instructionDetails;
  }

  public Action description(ItemStructure description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull @Valid 
  @Schema(name = "description", required = true)
  public ItemStructure getDescription() {
    return description;
  }

  public void setDescription(ItemStructure description) {
    this.description = description;
  }

  public Action protocol(ItemStructure protocol) {
    super.setProtocol(protocol);
    return this;
  }

  public Action guidelineId(ObjectRef guidelineId) {
    super.setGuidelineId(guidelineId);
    return this;
  }

  public Action language(CodePhrase language) {
    super.setLanguage(language);
    return this;
  }

  public Action encoding(CodePhrase encoding) {
    super.setEncoding(encoding);
    return this;
  }

  public Action otherParticipations(List<Participation> otherParticipations) {
    super.setOtherParticipations(otherParticipations);
    return this;
  }

  public Action addOtherParticipationsItem(Participation otherParticipationsItem) {
    super.addOtherParticipationsItem(otherParticipationsItem);
    return this;
  }

  public Action workflowId(ObjectRef workflowId) {
    super.setWorkflowId(workflowId);
    return this;
  }

  public Action subject(PartyProxy subject) {
    super.setSubject(subject);
    return this;
  }

  public Action provider(PartyProxy provider) {
    super.setProvider(provider);
    return this;
  }

  public Action name(DvText name) {
    super.setName(name);
    return this;
  }

  public Action archetypeNodeId(String archetypeNodeId) {
    super.setArchetypeNodeId(archetypeNodeId);
    return this;
  }

  public Action uid(UidBasedId uid) {
    super.setUid(uid);
    return this;
  }

  public Action links(List<Link> links) {
    super.setLinks(links);
    return this;
  }

  public Action addLinksItem(Link linksItem) {
    super.addLinksItem(linksItem);
    return this;
  }

  public Action archetypeDetails(Archetyped archetypeDetails) {
    super.setArchetypeDetails(archetypeDetails);
    return this;
  }

  public Action feederAudit(FeederAudit feederAudit) {
    super.setFeederAudit(feederAudit);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action action = (Action) o;
    return Objects.equals(this.type, action.type) &&
        Objects.equals(this.time, action.time) &&
        Objects.equals(this.ismTransition, action.ismTransition) &&
        Objects.equals(this.instructionDetails, action.instructionDetails) &&
        Objects.equals(this.description, action.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, time, ismTransition, instructionDetails, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    ismTransition: ").append(toIndentedString(ismTransition)).append("\n");
    sb.append("    instructionDetails: ").append(toIndentedString(instructionDetails)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

