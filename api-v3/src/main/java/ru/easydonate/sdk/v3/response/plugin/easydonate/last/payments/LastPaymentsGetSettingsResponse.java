package ru.easydonate.sdk.v3.response.plugin.easydonate.last.payments;

import ru.easydonate.sdk.v3.data.model.plugin.PluginType;
import ru.easydonate.sdk.v3.data.model.plugin.easydonate.last.purchases.LastPaymentsPluginSettings;
import ru.easydonate.sdk.v3.response.ApiResponse;
import ru.easydonate.sdk.v3.response.plugin.PluginApiResponse;

@PluginApiResponse(pluginType = PluginType.LAST_PAYMENTS, apiMethod = "getSettings")
public interface LastPaymentsGetSettingsResponse extends ApiResponse<LastPaymentsPluginSettings> {
}
