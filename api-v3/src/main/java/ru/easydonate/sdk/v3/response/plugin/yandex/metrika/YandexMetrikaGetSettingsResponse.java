package ru.easydonate.sdk.v3.response.plugin.yandex.metrika;

import ru.easydonate.sdk.v3.data.model.plugin.PluginType;
import ru.easydonate.sdk.v3.data.model.plugin.yandex.metrika.YandexMetrikaPluginSettings;
import ru.easydonate.sdk.v3.response.ApiResponse;
import ru.easydonate.sdk.v3.response.plugin.PluginApiResponse;

@PluginApiResponse(pluginType = PluginType.YANDEX_METRIKA, apiMethod = "getSettings")
public interface YandexMetrikaGetSettingsResponse extends ApiResponse<YandexMetrikaPluginSettings> {
}
