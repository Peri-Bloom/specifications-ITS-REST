package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.DataValue;
import org.openapitools.model.DvBoolean;
import org.openapitools.model.DvCodedText;
import org.openapitools.model.DvCount;
import org.openapitools.model.DvDateTime;
import org.openapitools.model.DvDuration;
import org.openapitools.model.DvEhrUri;
import org.openapitools.model.DvIdentifier;
import org.openapitools.model.DvInterval;
import org.openapitools.model.DvIntervalOfDateTime;
import org.openapitools.model.DvMultimedia;
import org.openapitools.model.DvOrdinal;
import org.openapitools.model.DvParsable;
import org.openapitools.model.DvProportion;
import org.openapitools.model.DvQuantity;
import org.openapitools.model.DvScale;
import org.openapitools.model.DvText;
import org.openapitools.model.DvUri;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DvBoolean
 */

@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DvBoolean.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvCodedText.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvCount.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvDateTime.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvDuration.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvEhrUri.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvIdentifier.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvInterval.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvIntervalOfDateTime.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvMultimedia.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvOrdinal.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvParsable.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvProportion.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvQuantity.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvScale.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvText.class, name = "DV_BOOLEAN"),
  @JsonSubTypes.Type(value = DvUri.class, name = "DV_BOOLEAN")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DvBoolean extends DataValue {

  @JsonProperty("_type")
  private String type = "DV_BOOLEAN";

  @JsonProperty("value")
  private Boolean value;

  public DvBoolean type(String type) {
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

  public DvBoolean value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", required = true)
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
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
    DvBoolean dvBoolean = (DvBoolean) o;
    return Objects.equals(this.type, dvBoolean.type) &&
        Objects.equals(this.value, dvBoolean.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvBoolean {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

