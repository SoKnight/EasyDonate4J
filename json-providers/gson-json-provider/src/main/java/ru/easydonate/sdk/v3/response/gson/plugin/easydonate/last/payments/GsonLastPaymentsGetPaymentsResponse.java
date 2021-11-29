package ru.easydonate.sdk.v3.response.gson.plugin.easydonate.last.payments;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.sdk.json.serialization.Implementing;
import ru.easydonate.sdk.v3.data.model.shop.payment.PaymentsList;
import ru.easydonate.sdk.v3.response.gson.GsonApiResponse;
import ru.easydonate.sdk.v3.response.plugin.easydonate.last.payments.LastPaymentsGetPaymentsResponse;

@Implementing(LastPaymentsGetPaymentsResponse.class)
public final class GsonLastPaymentsGetPaymentsResponse extends GsonApiResponse<PaymentsList> implements LastPaymentsGetPaymentsResponse {

    @Override
    public @NotNull String toString() {
        return "GsonLastPaymentsGetPaymentsResponse{" +
                "success=" + success +
                ", content=" + content +
                '}';
    }

}
