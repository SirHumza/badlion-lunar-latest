package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IScope {
   @Nullable
   SentryLevel getLevel();

   void setLevel(@Nullable SentryLevel var1);

   @Nullable
   String getTransactionName();

   void setTransaction(@NotNull String var1);

   @Nullable
   ISpan getSpan();

   void setTransaction(@Nullable ITransaction var1);

   @Nullable
   User getUser();

   void setUser(@Nullable User var1);

   @ApiStatus.Internal
   @Nullable
   String getScreen();

   @ApiStatus.Internal
   void setScreen(@Nullable String var1);

   @ApiStatus.Internal
   @NotNull
   SentryId getReplayId();

   @ApiStatus.Internal
   void setReplayId(@NotNull SentryId var1);

   @Nullable
   Request getRequest();

   void setRequest(@Nullable Request var1);

   @ApiStatus.Internal
   @NotNull
   List<String> getFingerprint();

   void setFingerprint(@NotNull List<String> var1);

   @ApiStatus.Internal
   @NotNull
   Queue<Breadcrumb> getBreadcrumbs();

   void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2);

   void addBreadcrumb(@NotNull Breadcrumb var1);

   void clearBreadcrumbs();

   void clearTransaction();

   @Nullable
   ITransaction getTransaction();

   void clear();

   @ApiStatus.Internal
   @NotNull
   Map<String, String> getTags();

   void setTag(@NotNull String var1, @NotNull String var2);

   void removeTag(@NotNull String var1);

   @ApiStatus.Internal
   @NotNull
   Map<String, Object> getExtras();

   void setExtra(@NotNull String var1, @NotNull String var2);

   void removeExtra(@NotNull String var1);

   @NotNull
   Contexts getContexts();

   void setContexts(@NotNull String var1, @NotNull Object var2);

   void setContexts(@NotNull String var1, @NotNull Boolean var2);

   void setContexts(@NotNull String var1, @NotNull String var2);

   void setContexts(@NotNull String var1, @NotNull Number var2);

   void setContexts(@NotNull String var1, @NotNull Collection<?> var2);

   void setContexts(@NotNull String var1, @NotNull Object[] var2);

   void setContexts(@NotNull String var1, @NotNull Character var2);

   void removeContexts(@NotNull String var1);

   @NotNull
   List<Attachment> getAttachments();

   void addAttachment(@NotNull Attachment var1);

   void clearAttachments();

   @NotNull
   List<EventProcessor> getEventProcessors();

   void addEventProcessor(@NotNull EventProcessor var1);

   @Nullable
   Session withSession(@NotNull Scope.IWithSession var1);

   @Nullable
   Scope.SessionPair startSession();

   @Nullable
   Session endSession();

   @ApiStatus.Internal
   void withTransaction(@NotNull Scope.IWithTransaction var1);

   @NotNull
   SentryOptions getOptions();

   @ApiStatus.Internal
   @Nullable
   Session getSession();

   @ApiStatus.Internal
   void clearSession();

   @ApiStatus.Internal
   void setPropagationContext(@NotNull PropagationContext var1);

   @ApiStatus.Internal
   @NotNull
   PropagationContext getPropagationContext();

   @ApiStatus.Internal
   @NotNull
   PropagationContext withPropagationContext(@NotNull Scope.IWithPropagationContext var1);

   @NotNull
   IScope clone();
}
