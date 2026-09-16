package io.sentry;

import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Scope implements IScope {
   @Nullable
   private SentryLevel level;
   @Nullable
   private ITransaction transaction;
   @Nullable
   private String transactionName;
   @Nullable
   private User user;
   @Nullable
   private String screen;
   @Nullable
   private Request request;
   @NotNull
   private List<String> fingerprint = new ArrayList<>();
   @NotNull
   private final Queue<Breadcrumb> breadcrumbs;
   @NotNull
   private Map<String, String> tags = new ConcurrentHashMap<>();
   @NotNull
   private Map<String, Object> extra = new ConcurrentHashMap<>();
   @NotNull
   private List<EventProcessor> eventProcessors = new CopyOnWriteArrayList<>();
   @NotNull
   private final SentryOptions options;
   @Nullable
   private volatile Session session;
   @NotNull
   private final Object sessionLock = new Object();
   @NotNull
   private final Object transactionLock = new Object();
   @NotNull
   private final Object propagationContextLock = new Object();
   @NotNull
   private Contexts contexts = new Contexts();
   @NotNull
   private List<Attachment> attachments = new CopyOnWriteArrayList<>();
   @NotNull
   private PropagationContext propagationContext;
   @NotNull
   private SentryId replayId = SentryId.EMPTY_ID;

   public Scope(@NotNull SentryOptions var1) {
      this.options = Objects.requireNonNull(var1, "SentryOptions is required.");
      this.breadcrumbs = this.createBreadcrumbsList(this.options.getMaxBreadcrumbs());
      this.propagationContext = new PropagationContext();
   }

   private Scope(@NotNull Scope var1) {
      this.transaction = var1.transaction;
      this.transactionName = var1.transactionName;
      this.session = var1.session;
      this.options = var1.options;
      this.level = var1.level;
      User var2 = var1.user;
      this.user = var2 != null ? new User(var2) : null;
      this.screen = var1.screen;
      this.replayId = var1.replayId;
      Request var3 = var1.request;
      this.request = var3 != null ? new Request(var3) : null;
      this.fingerprint = new ArrayList<>(var1.fingerprint);
      this.eventProcessors = new CopyOnWriteArrayList<>(var1.eventProcessors);
      Breadcrumb[] var4 = var1.breadcrumbs.toArray(new Breadcrumb[0]);
      Queue var5 = this.createBreadcrumbsList(var1.options.getMaxBreadcrumbs());

      for (Breadcrumb var9 : var4) {
         Breadcrumb var10 = new Breadcrumb(var9);
         var5.add(var10);
      }

      this.breadcrumbs = var5;
      Map var12 = var1.tags;
      ConcurrentHashMap var13 = new ConcurrentHashMap();

      for (Entry var16 : var12.entrySet()) {
         if (var16 != null) {
            var13.put((String)var16.getKey(), (String)var16.getValue());
         }
      }

      this.tags = var13;
      Map var15 = var1.extra;
      ConcurrentHashMap var17 = new ConcurrentHashMap();

      for (Entry var11 : var15.entrySet()) {
         if (var11 != null) {
            var17.put((String)var11.getKey(), var11.getValue());
         }
      }

      this.extra = var17;
      this.contexts = new Contexts(var1.contexts);
      this.attachments = new CopyOnWriteArrayList<>(var1.attachments);
      this.propagationContext = new PropagationContext(var1.propagationContext);
   }

   @Nullable
   @Override
   public SentryLevel getLevel() {
      return this.level;
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
      this.level = var1;

      for (IScopeObserver var3 : this.options.getScopeObservers()) {
         var3.setLevel(var1);
      }
   }

   @Nullable
   @Override
   public String getTransactionName() {
      ITransaction var1 = this.transaction;
      return var1 != null ? var1.getName() : this.transactionName;
   }

   @Override
   public void setTransaction(@NotNull String var1) {
      if (var1 != null) {
         ITransaction var2 = this.transaction;
         if (var2 != null) {
            var2.setName(var1, TransactionNameSource.CUSTOM);
         }

         this.transactionName = var1;

         for (IScopeObserver var4 : this.options.getScopeObservers()) {
            var4.setTransaction(var1);
         }
      } else {
         this.options.getLogger().log(SentryLevel.WARNING, "Transaction cannot be null");
      }
   }

   @Nullable
   @Override
   public ISpan getSpan() {
      ITransaction var1 = this.transaction;
      if (var1 != null) {
         Span var2 = var1.getLatestActiveSpan();
         if (var2 != null) {
            return var2;
         }
      }

      return var1;
   }

   @Override
   public void setTransaction(@Nullable ITransaction var1) {
      synchronized (this.transactionLock) {
         this.transaction = var1;

         for (IScopeObserver var4 : this.options.getScopeObservers()) {
            if (var1 != null) {
               var4.setTransaction(var1.getName());
               var4.setTrace(var1.getSpanContext(), this);
            } else {
               var4.setTransaction(null);
               var4.setTrace(null, this);
            }
         }
      }
   }

   @Nullable
   @Override
   public User getUser() {
      return this.user;
   }

   @Override
   public void setUser(@Nullable User var1) {
      this.user = var1;

      for (IScopeObserver var3 : this.options.getScopeObservers()) {
         var3.setUser(var1);
      }
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public String getScreen() {
      return this.screen;
   }

   @ApiStatus.Internal
   @Override
   public void setScreen(@Nullable String var1) {
      this.screen = var1;
      Contexts var2 = this.getContexts();
      App var3 = var2.getApp();
      if (var3 == null) {
         var3 = new App();
         var2.setApp(var3);
      }

      if (var1 == null) {
         var3.setViewNames(null);
      } else {
         ArrayList var4 = new ArrayList(1);
         var4.add(var1);
         var3.setViewNames(var4);
      }

      for (IScopeObserver var5 : this.options.getScopeObservers()) {
         var5.setContexts(var2);
      }
   }

   @NotNull
   @Override
   public SentryId getReplayId() {
      return this.replayId;
   }

   @Override
   public void setReplayId(@NotNull SentryId var1) {
      this.replayId = var1;

      for (IScopeObserver var3 : this.options.getScopeObservers()) {
         var3.setReplayId(var1);
      }
   }

   @Nullable
   @Override
   public Request getRequest() {
      return this.request;
   }

   @Override
   public void setRequest(@Nullable Request var1) {
      this.request = var1;

      for (IScopeObserver var3 : this.options.getScopeObservers()) {
         var3.setRequest(var1);
      }
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public List<String> getFingerprint() {
      return this.fingerprint;
   }

   @Override
   public void setFingerprint(@NotNull List<String> var1) {
      if (var1 != null) {
         this.fingerprint = new ArrayList<>(var1);

         for (IScopeObserver var3 : this.options.getScopeObservers()) {
            var3.setFingerprint(var1);
         }
      }
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Queue<Breadcrumb> getBreadcrumbs() {
      return this.breadcrumbs;
   }

   @Nullable
   private Breadcrumb executeBeforeBreadcrumb(@NotNull SentryOptions.BeforeBreadcrumbCallback var1, @NotNull Breadcrumb var2, @NotNull Hint var3) {
      try {
         var2 = var1.execute(var2, var3);
      } catch (Throwable var5) {
         this.options
            .getLogger()
            .log(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", var5);
         if (var5.getMessage() != null) {
            var2.setData("sentry:message", var5.getMessage());
         }
      }

      return var2;
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1, @Nullable Hint var2) {
      if (var1 != null) {
         if (var2 == null) {
            var2 = new Hint();
         }

         SentryOptions.BeforeBreadcrumbCallback var3 = this.options.getBeforeBreadcrumb();
         if (var3 != null) {
            var1 = this.executeBeforeBreadcrumb(var3, var1, var2);
         }

         if (var1 != null) {
            this.breadcrumbs.add(var1);

            for (IScopeObserver var5 : this.options.getScopeObservers()) {
               var5.addBreadcrumb(var1);
               var5.setBreadcrumbs(this.breadcrumbs);
            }
         } else {
            this.options.getLogger().log(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb");
         }
      }
   }

   @Override
   public void addBreadcrumb(@NotNull Breadcrumb var1) {
      this.addBreadcrumb(var1, null);
   }

   @Override
   public void clearBreadcrumbs() {
      this.breadcrumbs.clear();

      for (IScopeObserver var2 : this.options.getScopeObservers()) {
         var2.setBreadcrumbs(this.breadcrumbs);
      }
   }

   @Override
   public void clearTransaction() {
      synchronized (this.transactionLock) {
         this.transaction = null;
      }

      this.transactionName = null;

      for (IScopeObserver var2 : this.options.getScopeObservers()) {
         var2.setTransaction(null);
         var2.setTrace(null, this);
      }
   }

   @Nullable
   @Override
   public ITransaction getTransaction() {
      return this.transaction;
   }

   @Override
   public void clear() {
      this.level = null;
      this.user = null;
      this.request = null;
      this.screen = null;
      this.fingerprint.clear();
      this.clearBreadcrumbs();
      this.tags.clear();
      this.extra.clear();
      this.eventProcessors.clear();
      this.clearTransaction();
      this.clearAttachments();
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Map<String, String> getTags() {
      return CollectionUtils.newConcurrentHashMap(this.tags);
   }

   @Override
   public void setTag(@NotNull String var1, @NotNull String var2) {
      this.tags.put(var1, var2);

      for (IScopeObserver var4 : this.options.getScopeObservers()) {
         var4.setTag(var1, var2);
         var4.setTags(this.tags);
      }
   }

   @Override
   public void removeTag(@NotNull String var1) {
      this.tags.remove(var1);

      for (IScopeObserver var3 : this.options.getScopeObservers()) {
         var3.removeTag(var1);
         var3.setTags(this.tags);
      }
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public Map<String, Object> getExtras() {
      return this.extra;
   }

   @Override
   public void setExtra(@NotNull String var1, @NotNull String var2) {
      this.extra.put(var1, var2);

      for (IScopeObserver var4 : this.options.getScopeObservers()) {
         var4.setExtra(var1, var2);
         var4.setExtras(this.extra);
      }
   }

   @Override
   public void removeExtra(@NotNull String var1) {
      this.extra.remove(var1);

      for (IScopeObserver var3 : this.options.getScopeObservers()) {
         var3.removeExtra(var1);
         var3.setExtras(this.extra);
      }
   }

   @NotNull
   @Override
   public Contexts getContexts() {
      return this.contexts;
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Object var2) {
      this.contexts.put(var1, var2);

      for (IScopeObserver var4 : this.options.getScopeObservers()) {
         var4.setContexts(this.contexts);
      }
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Boolean var2) {
      HashMap var3 = new HashMap();
      var3.put("value", var2);
      this.setContexts(var1, var3);
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull String var2) {
      HashMap var3 = new HashMap();
      var3.put("value", var2);
      this.setContexts(var1, var3);
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Number var2) {
      HashMap var3 = new HashMap();
      var3.put("value", var2);
      this.setContexts(var1, var3);
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Collection<?> var2) {
      HashMap var3 = new HashMap();
      var3.put("value", var2);
      this.setContexts(var1, var3);
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Object[] var2) {
      HashMap var3 = new HashMap();
      var3.put("value", var2);
      this.setContexts(var1, var3);
   }

   @Override
   public void setContexts(@NotNull String var1, @NotNull Character var2) {
      HashMap var3 = new HashMap();
      var3.put("value", var2);
      this.setContexts(var1, var3);
   }

   @Override
   public void removeContexts(@NotNull String var1) {
      this.contexts.remove(var1);
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public List<Attachment> getAttachments() {
      return new CopyOnWriteArrayList<>(this.attachments);
   }

   @Override
   public void addAttachment(@NotNull Attachment var1) {
      this.attachments.add(var1);
   }

   @Override
   public void clearAttachments() {
      this.attachments.clear();
   }

   @NotNull
   private Queue<Breadcrumb> createBreadcrumbsList(int var1) {
      return var1 > 0 ? SynchronizedQueue.synchronizedQueue(new CircularFifoQueue<>(var1)) : SynchronizedQueue.synchronizedQueue(new DisabledQueue<>());
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public List<EventProcessor> getEventProcessors() {
      return this.eventProcessors;
   }

   @Override
   public void addEventProcessor(@NotNull EventProcessor var1) {
      this.eventProcessors.add(var1);
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Session withSession(@NotNull Scope.IWithSession var1) {
      Session var2 = null;
      synchronized (this.sessionLock) {
         var1.accept(this.session);
         if (this.session != null) {
            var2 = this.session.clone();
         }

         return var2;
      }
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Scope.SessionPair startSession() {
      Scope.SessionPair var2 = null;
      synchronized (this.sessionLock) {
         if (this.session != null) {
            this.session.end();
         }

         Session var1 = this.session;
         if (this.options.getRelease() != null) {
            this.session = new Session(this.options.getDistinctId(), this.user, this.options.getEnvironment(), this.options.getRelease());
            Session var4 = var1 != null ? var1.clone() : null;
            var2 = new Scope.SessionPair(this.session.clone(), var4);
         } else {
            this.options.getLogger().log(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started");
         }

         return var2;
      }
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Session endSession() {
      Session var1 = null;
      synchronized (this.sessionLock) {
         if (this.session != null) {
            this.session.end();
            var1 = this.session.clone();
            this.session = null;
         }

         return var1;
      }
   }

   @ApiStatus.Internal
   @Override
   public void withTransaction(@NotNull Scope.IWithTransaction var1) {
      synchronized (this.transactionLock) {
         var1.accept(this.transaction);
      }
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public SentryOptions getOptions() {
      return this.options;
   }

   @ApiStatus.Internal
   @Nullable
   @Override
   public Session getSession() {
      return this.session;
   }

   @ApiStatus.Internal
   @Override
   public void clearSession() {
      this.session = null;
   }

   @ApiStatus.Internal
   @Override
   public void setPropagationContext(@NotNull PropagationContext var1) {
      this.propagationContext = var1;
      SpanContext var2 = var1.toSpanContext();

      for (IScopeObserver var4 : this.options.getScopeObservers()) {
         var4.setTrace(var2, this);
      }
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public PropagationContext getPropagationContext() {
      return this.propagationContext;
   }

   @ApiStatus.Internal
   @NotNull
   @Override
   public PropagationContext withPropagationContext(@NotNull Scope.IWithPropagationContext var1) {
      synchronized (this.propagationContextLock) {
         var1.accept(this.propagationContext);
         return new PropagationContext(this.propagationContext);
      }
   }

   @NotNull
   @Override
   public IScope clone() {
      return new Scope(this);
   }

   @ApiStatus.Internal
   public interface IWithPropagationContext {
      void accept(@NotNull PropagationContext var1);
   }

   interface IWithSession {
      void accept(@Nullable Session var1);
   }

   @ApiStatus.Internal
   public interface IWithTransaction {
      void accept(@Nullable ITransaction var1);
   }

   static final class SessionPair {
      @Nullable
      private final Session previous;
      @NotNull
      private final Session current;

      public SessionPair(@NotNull Session var1, @Nullable Session var2) {
         this.current = var1;
         this.previous = var2;
      }

      @Nullable
      public Session getPrevious() {
         return this.previous;
      }

      @NotNull
      public Session getCurrent() {
         return this.current;
      }
   }
}
