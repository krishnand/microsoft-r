/*
 * MLServer
 * Integration technology for deploying R and Python analytics inside web, desktop, mobile, and dashboard applications as well as backend systems. Turn your R or Python scripts into analytics web services, so code can be easily executed by applications running on a secure server.  The core APIs can be grouped into several categories, including: [Authentication](#authentication-apis), [Web Services](#services-management-apis), [Sessions](#session-apis), [Snapshots](#snapshot-apis), [Status](#status-apis), and [Centralized Configuration](#centralized-configuration-apis). 
 *
 * OpenAPI spec version: 9.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Session
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-09T05:46:27.738Z")
public class Session {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private String owner = null;

  /**
   * Type of the runtime.
   */
  @JsonAdapter(RuntimeTypeEnum.Adapter.class)
  public enum RuntimeTypeEnum {
    R("R"),
    
    PYTHON("Python");

    private String value;

    RuntimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuntimeTypeEnum fromValue(String text) {
      for (RuntimeTypeEnum b : RuntimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RuntimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuntimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuntimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RuntimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("runtimeType")
  private RuntimeTypeEnum runtimeType = null;

  public Session id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing the session.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing the session.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Session name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the session.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the session.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Session owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Owner of the session.
   * @return owner
  **/
  @ApiModelProperty(value = "Owner of the session.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Session runtimeType(RuntimeTypeEnum runtimeType) {
    this.runtimeType = runtimeType;
    return this;
  }

   /**
   * Type of the runtime.
   * @return runtimeType
  **/
  @ApiModelProperty(value = "Type of the runtime.")
  public RuntimeTypeEnum getRuntimeType() {
    return runtimeType;
  }

  public void setRuntimeType(RuntimeTypeEnum runtimeType) {
    this.runtimeType = runtimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.name, session.name) &&
        Objects.equals(this.owner, session.owner) &&
        Objects.equals(this.runtimeType, session.runtimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, runtimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    runtimeType: ").append(toIndentedString(runtimeType)).append("\n");
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

