package com.mundipagg.api.service.creditcard.delete;

import com.mundipagg.api.response.creditcard.delete.CreditCardDeleteResponse;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Path;

/**
 * Created by jcosilva on 19/12/16.
 */

public interface DeleteCreditCardService {

    @DELETE("core/v1/customers/{customer_id}/cards/{credit_card_id}")
    Call<CreditCardDeleteResponse> delete(@Path("customer_id") String customerId, @Path("credit_card_id") String creditCardId);
}
