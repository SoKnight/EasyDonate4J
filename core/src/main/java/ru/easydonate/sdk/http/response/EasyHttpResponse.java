package ru.easydonate.sdk.http.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class EasyHttpResponse implements HttpResponse {

    private final int code;
    private final String message;
    private final String content;

    @Override
    public boolean isSuccess() {
        return code / 100 == 2;
    }

}