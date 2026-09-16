package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpScope implements IScope {
   private static final NoOpScope instance = new NoOpScope();
   @NotNull
   private final SentryOptions emptyOptions = SentryOptions.empty();

   private NoOpScope() {
   }

   public static NoOpScope getInstance() {
      return instance;
   }

   @Nullable
   @Override
   public SentryLevel getLevel() {
      return null;
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
   }

   @Nullable
   @Override
   public String getTransactionName() {
      return null;
   }

   @Override
   public void setTransaction(@NotNull String var1) {
   }

   @Nullable
   @Override
   public ISpan getSpan() {
      return null;
   }

   @Override
   public void setTransaction(@Nullable ITransaction var1) {
   }

   @Nullable
   @Override
   public User getUser() {
      return null;
   }

   @Override
   public void setUser(@Nullable User var1) {
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public String getScreen() {
      return null;
   }

   @ApiStatus.Internal
   @Override
   public void setScreen(@Nullable String var1) {
   }

   @NotNull
   @Override
   public SentryId getReplayId() {
      return SentryId.EMPTY_ID;
   }

   @Override
   public void setReplayId(@Nullable SentryId var1) {
   }

   @Nullable
   @Override
   public Request getRequest() {
      return null;
   }

   @Override
   public void setRequest(@Nullable Request var1) {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public List<String> getFingerprint() {
      return new ArrayList<>();
   }

   @Override
   public void setFingerprint(@NotNull List<String> var1) {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Queue<Breadcrumb> getBreadcrumbs() {
      return new ArrayDeque<>();
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2) {
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1) {
   }

   @Override
   public void clearBreadcrumbs() {
   }

   @Override
   public void clearTransaction() {
   }

   @Nullable
   @Override
   public ITransaction getTransaction() {
      return null;
   }

   @Override
   public void clear() {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Map<String, String> getTags() {
      return new HashMap<>();
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void removeTag(@NotNull String var1) {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Map<String, Object> getExtras() {
      return new HashMap<>();
   }

   @Override
   public void setExtra(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void removeExtra(@NotNull String var1) {
   }

   @NotNull
   @Override
   public Contexts getContexts() {
      return new Contexts();
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Object var2) {
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Boolean var2) {
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull String var2) {
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Number var2) {
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Collection<?> var2) {
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Object[] var2) {
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Character var2) {
   }

   @Override
   public void removeContexts(@NotNull String var1) {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public List<Attachment> getAttachments() {
      return new ArrayList<>();
   }

   @Override
   public void addAttachment(@NotNull Attachment var1) {
   }

   @Override
   public void clearAttachments() {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public List<EventProcessor> getEventProcessors() {
      return new ArrayList<>();
   }

   @Override
   public void addEventProcessor(@NotNull EventProcessor var1) {
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Session withSession(Scope.@NotNull IWithSession var1) {
      return null;
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Scope.SessionPair startSession() {
      return null;
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Session endSession() {
      return null;
   }

   @ApiStatus.Internal
   @Override
   public void withTransaction(Scope.@NotNull IWithTransaction var1) {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public SentryOptions getOptions() {
      return this.emptyOptions;
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Session getSession() {
      return null;
   }

   @ApiStatus.Internal
   @Override
   public void clearSession() {
   }

   @ApiStatus.Internal
   @Override
   public void setPropagationContext(@NotNull PropagationContext var1) {
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public PropagationContext getPropagationContext() {
      return new PropagationContext();
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public PropagationContext withPropagationContext(Scope.@NotNull IWithPropagationContext var1) {
      return new PropagationContext();
   }

   @NotNull
   @Override
   public IScope clone() {
      return getInstance();
   }
}
