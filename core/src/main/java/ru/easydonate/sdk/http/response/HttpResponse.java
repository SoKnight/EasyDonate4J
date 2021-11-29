package ru.easydonate.sdk.http.response;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface HttpResponse {

    int getCode();

    @NotNull String getMessage();

    @Nullable String getContent();

    boolean isSuccess();

}