package ru.soknight.easydonate.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractResponse<T> {

    @JsonProperty("success")
    protected boolean success;
    @JsonProperty("response")
    protected T responseObject;
    
}
