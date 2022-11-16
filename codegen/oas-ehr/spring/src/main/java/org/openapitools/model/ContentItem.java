package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.AbstractEntry;
import org.openapitools.model.Action;
import org.openapitools.model.AdminEntry;
import org.openapitools.model.CareEntry;
import org.openapitools.model.Evaluation;
import org.openapitools.model.Instruction;
import org.openapitools.model.Locatable;
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
 * ContentItem
 */

@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Action.class, name = "ACTION"),
  @JsonSubTypes.Type(value = AdminEntry.class, name = "ADMIN_ENTRY"),
  @JsonSubTypes.Type(value = AbstractEntry.class, name = "AbstractEntry"),
  @JsonSubTypes.Type(value = Action.class, name = "Action"),
  @JsonSubTypes.Type(value = AdminEntry.class, name = "AdminEntry"),
  @JsonSubTypes.Type(value = CareEntry.class, name = "CareEntry"),
  @JsonSubTypes.Type(value = Evaluation.class, name = "EVALUATION"),
  @JsonSubTypes.Type(value = Evaluation.class, name = "Evaluation"),
  @JsonSubTypes.Type(value = Instruction.class, name = "INSTRUCTION"),
  @JsonSubTypes.Type(value = Instruction.class, name = "Instruction"),
  @JsonSubTypes.Type(value = Observation.class, name = "OBSERVATION"),
  @JsonSubTypes.Type(value = Observation.class, name = "Observation")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ContentItem extends Locatable {

  public ContentItem name(DvText name) {
    super.setName(name);
    return this;
  }

  public ContentItem archetypeNodeId(String archetypeNodeId) {
    super.setArchetypeNodeId(archetypeNodeId);
    return this;
  }

  public ContentItem uid(UidBasedId uid) {
    super.setUid(uid);
    return this;
  }

  public ContentItem links(List<Link> links) {
    super.setLinks(links);
    return this;
  }

  public ContentItem addLinksItem(Link linksItem) {
    super.addLinksItem(linksItem);
    return this;
  }

  public ContentItem archetypeDetails(Archetyped archetypeDetails) {
    super.setArchetypeDetails(archetypeDetails);
    return this;
  }

  public ContentItem feederAudit(FeederAudit feederAudit) {
    super.setFeederAudit(feederAudit);
    return this;
  }

  public ContentItem type(String type) {
    super.setType(type);
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

