package ru.easydonate.sdk.v3.response.plugin.easydonate.last.payments;

import ru.easydonate.sdk.v3.data.model.plugin.PluginType;
import ru.easydonate.sdk.v3.data.model.shop.payment.PaymentsList;
import ru.easydonate.sdk.v3.response.ApiResponse;
import ru.easydonate.sdk.v3.response.plugin.PluginApiResponse;

@PluginApiResponse(pluginType = PluginType.LAST_PAYMENTS, apiMethod = "getPayments")
public interface LastPaymentsGetPaymentsResponse extends ApiResponse<PaymentsList> {
}