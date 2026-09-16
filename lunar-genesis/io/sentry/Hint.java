package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Hint {
   @NotNull
   private static final Map<String, Class<?>> PRIMITIVE_MAPPINGS = new HashMap<>();
   @NotNull
   private final Map<String, Object> internalStorage = new HashMap<>();
   @NotNull
   private final List<Attachment> attachments = new ArrayList<>();
   @Nullable
   private Attachment screenshot = null;
   @Nullable
   private Attachment viewHierarchy = null;
   @Nullable
   private Attachment threadDump = null;
   @Nullable
   private ReplayRecording replayRecording = null;

   @NotNull
   public static Hint withAttachment(@Nullable Attachment var0) {
      Hint var1 = new Hint();
      var1.addAttachment(var0);
      return var1;
   }

   @NotNull
   public static Hint withAttachments(@Nullable List<Attachment> var0) {
      Hint var1 = new Hint();
      var1.addAttachments(var0);
      return var1;
   }

   public synchronized void set(@NotNull String var1, @Nullable Object var2) {
      this.internalStorage.put(var1, var2);
   }

   @Nullable
   public synchronized Object get(@NotNull String var1) {
      return this.internalStorage.get(var1);
   }

   @Nullable
   public synchronized <T> T getAs(@NotNull String var1, @NotNull Class<T> var2) {
      Object var3 = this.internalStorage.get(var1);
      if (var2.isInstance(var3)) {
         return (T)var3;
      } else {
         return (T)(this.isCastablePrimitive(var3, var2) ? var3 : null);
      }
   }

   public synchronized void remove(@NotNull String var1) {
      this.internalStorage.remove(var1);
   }

   public void addAttachment(@Nullable Attachment var1) {
      if (var1 != null) {
         this.attachments.add(var1);
      }
   }

   public void addAttachments(@Nullable List<Attachment> var1) {
      if (var1 != null) {
         this.attachments.addAll(var1);
      }
   }

   @NotNull
   public List<Attachment> getAttachments() {
      return new ArrayList<>(this.attachments);
   }

   public void replaceAttachments(@Nullable List<Attachment> var1) {
      this.clearAttachments();
      this.addAttachments(var1);
   }

   public void clearAttachments() {
      this.attachments.clear();
   }

   @ApiStatus.Internal
   public synchronized void clear() {
      Iterator var1 = this.internalStorage.entrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if (var2.getKey() == null || !((String)var2.getKey()).startsWith("sentry:")) {
            var1.remove();
         }
      }
   }

   public void setScreenshot(@Nullable Attachment var1) {
      this.screenshot = var1;
   }

   @Nullable
   public Attachment getScreenshot() {
      return this.screenshot;
   }

   public void setViewHierarchy(@Nullable Attachment var1) {
      this.viewHierarchy = var1;
   }

   @Nullable
   public Attachment getViewHierarchy() {
      return this.viewHierarchy;
   }

   public void setThreadDump(@Nullable Attachment var1) {
      this.threadDump = var1;
   }

   @Nullable
   public Attachment getThreadDump() {
      return this.threadDump;
   }

   @Nullable
   public ReplayRecording getReplayRecording() {
      return this.replayRecording;
   }

   public void setReplayRecording(@Nullable ReplayRecording var1) {
      this.replayRecording = var1;
   }

   private boolean isCastablePrimitive(@Nullable Object var1, @NotNull Class<?> var2) {
      Class var3 = PRIMITIVE_MAPPINGS.get(var2.getCanonicalName());
      return var1 != null && var2.isPrimitive() && var3 != null && var3.isInstance(var1);
   }

   static {
      PRIMITIVE_MAPPINGS.put("boolean", Boolean.class);
      PRIMITIVE_MAPPINGS.put("char", Character.class);
      PRIMITIVE_MAPPINGS.put("byte", Byte.class);
      PRIMITIVE_MAPPINGS.put("short", Short.class);
      PRIMITIVE_MAPPINGS.put("int", Integer.class);
      PRIMITIVE_MAPPINGS.put("long", Long.class);
      PRIMITIVE_MAPPINGS.put("float", Float.class);
      PRIMITIVE_MAPPINGS.put("double", Double.class);
   }
}
