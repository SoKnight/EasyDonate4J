package ru.easydonate.easydonate4j.api.v3.response.jackson.plugin.vkontakte.news;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.easydonate4j.json.serialization.Implementing;
import ru.easydonate.easydonate4j.api.v3.data.model.plugin.vkontakte.news.VKNewsPluginSettings;
import ru.easydonate.easydonate4j.api.v3.response.jackson.JacksonApiResponse;
import ru.easydonate.easydonate4j.api.v3.response.plugin.vkontakte.news.VKNewsGetSettingsResponse;

@Implementing(VKNewsGetSettingsResponse.class)
public final class JacksonVKNewsGetSettingsResponse extends JacksonApiResponse<VKNewsPluginSettings> implements VKNewsGetSettingsResponse {

    @Override
    public @NotNull String toString() {
        return "JacksonVKNewsGetSettingsResponse{" +
                "success=" + success +
                ", content=" + content +
                '}';
    }

}
