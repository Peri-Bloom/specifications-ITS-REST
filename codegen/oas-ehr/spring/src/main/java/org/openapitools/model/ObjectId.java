package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.ArchetypeId;
import org.openapitools.model.GenericId;
import org.openapitools.model.HierObjectId;
import org.openapitools.model.ObjectVersionId;
import org.openapitools.model.TemplateId;
import org.openapitools.model.TerminologyId;
import org.openapitools.model.UidBasedId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ObjectId
 */

@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ArchetypeId.class, name = "ARCHETYPE_ID"),
  @JsonSubTypes.Type(value = ArchetypeId.class, name = "ArchetypeId"),
  @JsonSubTypes.Type(value = GenericId.class, name = "GENERIC_ID"),
  @JsonSubTypes.Type(value = GenericId.class, name = "GenericId"),
  @JsonSubTypes.Type(value = HierObjectId.class, name = "HIER_OBJECT_ID"),
  @JsonSubTypes.Type(value = HierObjectId.class, name = "HierObjectId"),
  @JsonSubTypes.Type(value = ObjectVersionId.class, name = "OBJECT_VERSION_ID"),
  @JsonSubTypes.Type(value = ObjectVersionId.class, name = "ObjectVersionId"),
  @JsonSubTypes.Type(value = TemplateId.class, name = "TEMPLATE_ID"),
  @JsonSubTypes.Type(value = TerminologyId.class, name = "TERMINOLOGY_ID"),
  @JsonSubTypes.Type(value = TemplateId.class, name = "TemplateId"),
  @JsonSubTypes.Type(value = TerminologyId.class, name = "TerminologyId"),
  @JsonSubTypes.Type(value = UidBasedId.class, name = "UID_BASED_ID"),
  @JsonSubTypes.Type(value = UidBasedId.class, name = "UidBasedId")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ObjectId {

  @JsonProperty("_type")
  private String type;

  @JsonProperty("value")
  private String value;

  public ObjectId type(String type) {
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

  public ObjectId value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", required = true)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectId objectId = (ObjectId) o;
    return Objects.equals(this.type, objectId.type) &&
        Objects.equals(this.value, objectId.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectId {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

