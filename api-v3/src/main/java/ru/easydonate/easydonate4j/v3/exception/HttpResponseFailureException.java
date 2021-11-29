package ru.easydonate.easydonate4j.v3.exception;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.easydonate4j.exception.HttpResponseException;
import ru.easydonate.easydonate4j.http.response.HttpResponse;

public class HttpResponseFailureException extends HttpResponseException {

    public HttpResponseFailureException(@NotNull HttpResponse response) {
        super(response, String.format(
                "The API server has returned an unsuccessful HTTP response with code #%d (%s): %s",
                response.getCode(), response.getMessage(), response.getContent())
        );
    }

}