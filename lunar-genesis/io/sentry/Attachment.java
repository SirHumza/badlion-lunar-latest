package io.sentry;

import io.sentry.protocol.ViewHierarchy;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Attachment {
   @Nullable
   private byte[] bytes;
   @Nullable
   private final JsonSerializable serializable;
   @Nullable
   private String pathname;
   @NotNull
   private final String filename;
   @Nullable
   private final String contentType;
   private final boolean addToTransactions;
   @Nullable
   private String attachmentType = "event.attachment";
   private static final String DEFAULT_ATTACHMENT_TYPE = "event.attachment";
   private static final String VIEW_HIERARCHY_ATTACHMENT_TYPE = "event.view_hierarchy";

   public Attachment(@NotNull byte[] var1, @NotNull String var2) {
      this(var1, var2, null);
   }

   public Attachment(@NotNull byte[] var1, @NotNull String var2, @Nullable String var3) {
      this(var1, var2, var3, false);
   }

   public Attachment(@NotNull byte[] var1, @NotNull String var2, @Nullable String var3, boolean var4) {
      this(var1, var2, var3, "event.attachment", var4);
   }

   public Attachment(@NotNull byte[] var1, @NotNull String var2, @Nullable String var3, @Nullable String var4, boolean var5) {
      this.bytes = var1;
      this.serializable = null;
      this.filename = var2;
      this.contentType = var3;
      this.attachmentType = var4;
      this.addToTransactions = var5;
   }

   public Attachment(@NotNull JsonSerializable var1, @NotNull String var2, @Nullable String var3, @Nullable String var4, boolean var5) {
      this.bytes = null;
      this.serializable = var1;
      this.filename = var2;
      this.contentType = var3;
      this.attachmentType = var4;
      this.addToTransactions = var5;
   }

   public Attachment(@NotNull String var1) {
      this(var1, new File(var1).getName());
   }

   public Attachment(@NotNull String var1, @NotNull String var2) {
      this(var1, var2, null);
   }

   public Attachment(@NotNull String var1, @NotNull String var2, @Nullable String var3) {
      this(var1, var2, var3, "event.attachment", false);
   }

   public Attachment(@NotNull String var1, @NotNull String var2, @Nullable String var3, @Nullable String var4, boolean var5) {
      this.pathname = var1;
      this.filename = var2;
      this.serializable = null;
      this.contentType = var3;
      this.attachmentType = var4;
      this.addToTransactions = var5;
   }

   public Attachment(@NotNull String var1, @NotNull String var2, @Nullable String var3, boolean var4) {
      this.pathname = var1;
      this.filename = var2;
      this.serializable = null;
      this.contentType = var3;
      this.addToTransactions = var4;
   }

   public Attachment(@NotNull String var1, @NotNull String var2, @Nullable String var3, boolean var4, @Nullable String var5) {
      this.pathname = var1;
      this.filename = var2;
      this.serializable = null;
      this.contentType = var3;
      this.addToTransactions = var4;
      this.attachmentType = var5;
   }

   @Nullable
   public byte[] getBytes() {
      return this.bytes;
   }

   @Nullable
   public JsonSerializable getSerializable() {
      return this.serializable;
   }

   @Nullable
   public String getPathname() {
      return this.pathname;
   }

   @NotNull
   public String getFilename() {
      return this.filename;
   }

   @Nullable
   public String getContentType() {
      return this.contentType;
   }

   boolean isAddToTransactions() {
      return this.addToTransactions;
   }

   @Nullable
   public String getAttachmentType() {
      return this.attachmentType;
   }

   @NotNull
   public static Attachment fromScreenshot(byte[] var0) {
      return new Attachment(var0, "screenshot.png", "image/png", false);
   }

   @NotNull
   public static Attachment fromViewHierarchy(ViewHierarchy var0) {
      return new Attachment(var0, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
   }

   @NotNull
   public static Attachment fromThreadDump(byte[] var0) {
      return new Attachment(var0, "thread-dump.txt", "text/plain", false);
   }
}
