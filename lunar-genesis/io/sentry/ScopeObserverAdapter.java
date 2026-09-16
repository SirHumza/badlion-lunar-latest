package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ScopeObserverAdapter implements IScopeObserver {
   @Override
   public void setUser(@Nullable User var1) {
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1) {
   }

   @Override
   public void setBreadcrumbs(@NotNull Collection<Breadcrumb> var1) {
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void removeTag(@NotNull String var1) {
   }

   @Override
   public void setTags(@NotNull Map<String, String> var1) {
   }

   @Override
   public void setExtra(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void removeExtra(@NotNull String var1) {
   }

   @Override
   public void setExtras(@NotNull Map<String, Object> var1) {
   }

   @Override
   public void setRequest(@Nullable Request var1) {
   }

   @Override
   public void setFingerprint(@NotNull Collection<String> var1) {
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
   }

   @Override
   public void setContexts(@NotNull Contexts var1) {
   }

   @Override
   public void setTransaction(@Nullable String var1) {
   }

   @Override
   public void setTrace(@Nullable SpanContext var1, @NotNull IScope var2) {
   }

   @Override
   public void setReplayId(@NotNull SentryId var1) {
   }
}
