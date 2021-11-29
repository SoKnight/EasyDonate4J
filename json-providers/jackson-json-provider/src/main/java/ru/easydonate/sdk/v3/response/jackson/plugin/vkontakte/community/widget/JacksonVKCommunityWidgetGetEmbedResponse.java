package ru.easydonate.sdk.v3.response.jackson.plugin.vkontakte.community.widget;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.sdk.json.serialization.Implementing;
import ru.easydonate.sdk.v3.response.jackson.JacksonApiResponse;
import ru.easydonate.sdk.v3.response.plugin.vkontakte.community.widget.VKCommunityWidgetGetEmbedResponse;

@Implementing(VKCommunityWidgetGetEmbedResponse.class)
public final class JacksonVKCommunityWidgetGetEmbedResponse extends JacksonApiResponse<String> implements VKCommunityWidgetGetEmbedResponse {

    @Override
    public @NotNull String toString() {
        return "JacksonVKCommunityWidgetGetEmbedResponse{" +
                "success=" + success +
                ", content=" + content +
                '}';
    }

}
