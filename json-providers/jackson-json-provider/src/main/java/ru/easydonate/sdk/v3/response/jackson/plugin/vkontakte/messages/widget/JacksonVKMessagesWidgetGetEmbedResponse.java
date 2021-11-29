package ru.easydonate.sdk.v3.response.jackson.plugin.vkontakte.messages.widget;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.sdk.json.serialization.Implementing;
import ru.easydonate.sdk.v3.response.jackson.JacksonApiResponse;
import ru.easydonate.sdk.v3.response.plugin.vkontakte.messages.widget.VKMessagesWidgetGetEmbedResponse;

@Implementing(VKMessagesWidgetGetEmbedResponse.class)
public final class JacksonVKMessagesWidgetGetEmbedResponse extends JacksonApiResponse<String> implements VKMessagesWidgetGetEmbedResponse {

    @Override
    public @NotNull String toString() {
        return "JacksonVKMessagesWidgetGetEmbedResponse{" +
                "success=" + success +
                ", content=" + content +
                '}';
    }

}
