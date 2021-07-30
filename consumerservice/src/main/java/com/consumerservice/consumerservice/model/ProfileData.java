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
"firstName",
"lastName",
"phoneNumber",
"alternatePhoneNumber",
"emailAddress",
"line1",
"line2",
"city",
"state",
"zipCode",
"stateCheckBox",
"hasProfileInfo"
})
@Generated("jsonschema2pojo")
public class ProfileData {

@JsonProperty("firstName")
private String firstName;
@JsonProperty("lastName")
private String lastName;
@JsonProperty("phoneNumber")
private Integer phoneNumber;
@JsonProperty("alternatePhoneNumber")
private String alternatePhoneNumber;
@JsonProperty("emailAddress")
private String emailAddress;
@JsonProperty("line1")
private String line1;
@JsonProperty("line2")
private String line2;
@JsonProperty("city")
private String city;
@JsonProperty("state")
private String state;
@JsonProperty("zipCode")
private Integer zipCode;
@JsonProperty("stateCheckBox")
private String stateCheckBox;
@JsonProperty("hasProfileInfo")
private Boolean hasProfileInfo;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("firstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("firstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("lastName")
public String getLastName() {
return lastName;
}

@JsonProperty("lastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("phoneNumber")
public Integer getPhoneNumber() {
return phoneNumber;
}

@JsonProperty("phoneNumber")
public void setPhoneNumber(Integer phoneNumber) {
this.phoneNumber = phoneNumber;
}

@JsonProperty("alternatePhoneNumber")
public String getAlternatePhoneNumber() {
return alternatePhoneNumber;
}

@JsonProperty("alternatePhoneNumber")
public void setAlternatePhoneNumber(String alternatePhoneNumber) {
this.alternatePhoneNumber = alternatePhoneNumber;
}

@JsonProperty("emailAddress")
public String getEmailAddress() {
return emailAddress;
}

@JsonProperty("emailAddress")
public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
}

@JsonProperty("line1")
public String getLine1() {
return line1;
}

@JsonProperty("line1")
public void setLine1(String line1) {
this.line1 = line1;
}

@JsonProperty("line2")
public String getLine2() {
return line2;
}

@JsonProperty("line2")
public void setLine2(String line2) {
this.line2 = line2;
}

@JsonProperty("city")
public String getCity() {
return city;
}

@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("state")
public String getState() {
return state;
}

@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

@JsonProperty("zipCode")
public Integer getZipCode() {
return zipCode;
}

@JsonProperty("zipCode")
public void setZipCode(Integer zipCode) {
this.zipCode = zipCode;
}

@JsonProperty("stateCheckBox")
public String getStateCheckBox() {
return stateCheckBox;
}

@JsonProperty("stateCheckBox")
public void setStateCheckBox(String stateCheckBox) {
this.stateCheckBox = stateCheckBox;
}

@JsonProperty("hasProfileInfo")
public Boolean getHasProfileInfo() {
return hasProfileInfo;
}

@JsonProperty("hasProfileInfo")
public void setHasProfileInfo(Boolean hasProfileInfo) {
this.hasProfileInfo = hasProfileInfo;
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

