package ru.easydonate.sdk.v3.response.gson.plugin.easydonate.custom.messages;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.sdk.json.serialization.Implementing;
import ru.easydonate.sdk.v3.data.model.plugin.easydonate.custom.messages.CustomMessagesPluginSettings;
import ru.easydonate.sdk.v3.response.gson.GsonApiResponse;
import ru.easydonate.sdk.v3.response.plugin.easydonate.custom.messages.CustomMessagesGetSettingsResponse;

@Implementing(CustomMessagesGetSettingsResponse.class)
public final class GsonCustomMessagesGetSettingsResponse extends GsonApiResponse<CustomMessagesPluginSettings> implements CustomMessagesGetSettingsResponse {

    @Override
    public @NotNull String toString() {
        return "GsonCustomMessagesGetSettingsResponse{" +
                "success=" + success +
                ", content=" + content +
                '}';
    }

}
