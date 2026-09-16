package com.lunarclient.apollo.async;

import com.lunarclient.apollo.api.ApiResponse;

public interface Future<T extends ApiResponse> {
   Future<T> onSuccess(Handler<T> var1);

   Future<T> onFailure(Handler<Throwable> var1);

   void handleSuccess(T var1);

   void handleFailure(Throwable var1);
}
