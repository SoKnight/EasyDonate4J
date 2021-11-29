package ru.easydonate.sdk.v3.response.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import ru.easydonate.sdk.json.serialization.Implementing;
import ru.easydonate.sdk.v3.response.ErrorResponse;

@Getter
@Implementing(ErrorResponse.class)
public final class JacksonErrorResponse extends JacksonApiResponse<String> implements ErrorResponse {

    @JsonProperty("error_code")
    private int errorCode;

    @Override
    public @NotNull String toString() {
        return "JacksonErrorResponse{" +
                "success=" + success +
                ", content=" + content +
                ", errorCode=" + errorCode +
                '}';
    }

}
