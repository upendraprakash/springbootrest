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
"issue",
"details",
"source",
"SubSource",
"type"
})
@Generated("jsonschema2pojo")
public class Inquiry {

@JsonProperty("issue")
private String issue;
@JsonProperty("details")
private String details;
@JsonProperty("source")
private String source;
@JsonProperty("SubSource")
private String subSource;
@JsonProperty("type")
private String type;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("issue")
public String getIssue() {
return issue;
}

@JsonProperty("issue")
public void setIssue(String issue) {
this.issue = issue;
}

@JsonProperty("details")
public String getDetails() {
return details;
}

@JsonProperty("details")
public void setDetails(String details) {
this.details = details;
}

@JsonProperty("source")
public String getSource() {
return source;
}

@JsonProperty("source")
public void setSource(String source) {
this.source = source;
}

@JsonProperty("SubSource")
public String getSubSource() {
return subSource;
}

@JsonProperty("SubSource")
public void setSubSource(String subSource) {
this.subSource = subSource;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
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