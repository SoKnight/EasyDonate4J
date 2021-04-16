package ru.soknight.easydonate.sdk.response.deserialize;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectWriter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class JacksonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");

    private final ObjectWriter adapter;

    @Override
    public RequestBody convert(T value) throws IOException {
        byte[] bytes = adapter.writeValueAsBytes(value);
        return RequestBody.create(MEDIA_TYPE, bytes);
    }

}