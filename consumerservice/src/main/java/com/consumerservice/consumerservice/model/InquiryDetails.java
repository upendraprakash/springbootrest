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
"inquiry",
"ProfileData",
"reportOptions"
})
@Generated("jsonschema2pojo")
public class InquiryDetails {

@JsonProperty("inquiry")
private Inquiry inquiry;
@JsonProperty("ProfileData")
private ProfileData profileData;
@JsonProperty("reportOptions")
private ReportOptions reportOptions;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("inquiry")
public Inquiry getInquiry() {
return inquiry;
}

@JsonProperty("inquiry")
public void setInquiry(Inquiry inquiry) {
this.inquiry = inquiry;
}

@JsonProperty("ProfileData")
public ProfileData getProfileData() {
return profileData;
}

@JsonProperty("ProfileData")
public void setProfileData(ProfileData profileData) {
this.profileData = profileData;
}

@JsonProperty("reportOptions")
public ReportOptions getReportOptions() {
return reportOptions;
}

@JsonProperty("reportOptions")
public void setReportOptions(ReportOptions reportOptions) {
this.reportOptions = reportOptions;
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