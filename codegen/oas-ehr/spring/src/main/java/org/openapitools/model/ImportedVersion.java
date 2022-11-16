package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.AuditDetails;
import org.openapitools.model.ImportedVersion;
import org.openapitools.model.ObjectRef;
import org.openapitools.model.OriginalVersion;
import org.openapitools.model.Version;
import org.openapitools.model.Versionable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ImportedVersion
 */

@JsonIgnoreProperties(
  value = "_type", // ignore manually set _type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ImportedVersion.class, name = "IMPORTED_VERSION"),
  @JsonSubTypes.Type(value = OriginalVersion.class, name = "IMPORTED_VERSION")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ImportedVersion extends Version {

  @JsonProperty("_type")
  private String type = "IMPORTED_VERSION";

  @JsonProperty("item")
  private OriginalVersion item;

  public ImportedVersion type(String type) {
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

  public ImportedVersion item(OriginalVersion item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @NotNull @Valid 
  @Schema(name = "item", required = true)
  public OriginalVersion getItem() {
    return item;
  }

  public void setItem(OriginalVersion item) {
    this.item = item;
  }

  public ImportedVersion contribution(ObjectRef contribution) {
    super.setContribution(contribution);
    return this;
  }

  public ImportedVersion signature(String signature) {
    super.setSignature(signature);
    return this;
  }

  public ImportedVersion commitAudit(AuditDetails commitAudit) {
    super.setCommitAudit(commitAudit);
    return this;
  }

  public ImportedVersion data(Versionable data) {
    super.setData(data);
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
    ImportedVersion importedVersion = (ImportedVersion) o;
    return Objects.equals(this.type, importedVersion.type) &&
        Objects.equals(this.item, importedVersion.item) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, item, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportedVersion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

