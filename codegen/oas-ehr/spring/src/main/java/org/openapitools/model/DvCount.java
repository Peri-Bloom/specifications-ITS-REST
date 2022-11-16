package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.DvAmount;
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
import java.util.List;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DvCount
 */

@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DvBoolean.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvCodedText.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvCount.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvDateTime.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvDuration.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvEhrUri.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvIdentifier.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvInterval.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvIntervalOfDateTime.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvMultimedia.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvOrdinal.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvParsable.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvProportion.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvQuantity.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvScale.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvText.class, name = "DV_COUNT"),
  @JsonSubTypes.Type(value = DvUri.class, name = "DV_COUNT")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DvCount extends DvAmount {

  @JsonProperty("_type")
  private String type = "DV_COUNT";

  @JsonProperty("magnitude")
  private Integer magnitude;

  public DvCount type(String type) {
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

  public DvCount magnitude(Integer magnitude) {
    this.magnitude = magnitude;
    return this;
  }

  /**
   * Get magnitude
   * @return magnitude
  */
  @NotNull 
  @Schema(name = "magnitude", required = true)
  public Integer getMagnitude() {
    return magnitude;
  }

  public void setMagnitude(Integer magnitude) {
    this.magnitude = magnitude;
  }

  public DvCount accuracyIsPercent(Boolean accuracyIsPercent) {
    super.setAccuracyIsPercent(accuracyIsPercent);
    return this;
  }

  public DvCount accuracy(BigDecimal accuracy) {
    super.setAccuracy(accuracy);
    return this;
  }

  public DvCount magnitudeStatus(String magnitudeStatus) {
    super.setMagnitudeStatus(magnitudeStatus);
    return this;
  }

  public DvCount normalStatus(CodePhrase normalStatus) {
    super.setNormalStatus(normalStatus);
    return this;
  }

  public DvCount normalRange(DvInterval normalRange) {
    super.setNormalRange(normalRange);
    return this;
  }

  public DvCount otherReferenceRanges(List<ReferenceRange> otherReferenceRanges) {
    super.setOtherReferenceRanges(otherReferenceRanges);
    return this;
  }

  public DvCount addOtherReferenceRangesItem(ReferenceRange otherReferenceRangesItem) {
    super.addOtherReferenceRangesItem(otherReferenceRangesItem);
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
    DvCount dvCount = (DvCount) o;
    return Objects.equals(this.type, dvCount.type) &&
        Objects.equals(this.magnitude, dvCount.magnitude) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, magnitude, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvCount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    magnitude: ").append(toIndentedString(magnitude)).append("\n");
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

