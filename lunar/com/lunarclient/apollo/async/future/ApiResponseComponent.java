package com.lunarclient.apollo.async.future;

import com.lunarclient.apollo.api.ApiResponse;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.async.Handler;
import java.util.HashSet;
import java.util.Set;
import lombok.Generated;

public final class UncertainFuture<T extends ApiResponse> implements Future<T> {
   private final Set<Handler<T>> success = new HashSet<>();
   private final Set<Handler<Throwable>> failure = new HashSet<>();

   public UncertainFuture<T> onSuccess(Handler<T> var1) {
      this.success.add(var1);
      return this;
   }

   public UncertainFuture<T> onFailure(Handler<Throwable> var1) {
      this.failure.add(var1);
      return this;
   }

   @Override
   public void handleSuccess(T var1) {
      this.success.forEach(var1x -> var1x.handle((T)var1));
   }

   @Override
   public void handleFailure(Throwable var1) {
      this.failure.forEach(var1x -> var1x.handle(var1));
   }
}
