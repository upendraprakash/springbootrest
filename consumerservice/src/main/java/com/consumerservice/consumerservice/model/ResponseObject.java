package com.consumerservice.consumerservice.model;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"responseCode",
"message"
})
@Generated("jsonschema2pojo")
public class ResponseObject {

@JsonProperty("id")
private String id;
@JsonProperty("responseCode")
private String responseCode;
@JsonProperty("message")
private String message;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("responseCode")
public String getResponseCode() {
return responseCode;
}

@JsonProperty("responseCode")
public void setResponseCode(String responseCode) {
this.responseCode = responseCode;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}