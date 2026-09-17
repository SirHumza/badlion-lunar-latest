package com.moonsworth.lunar.lib.adventure.resource;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ResourcePackInfoImpl implements ResourcePackInfo {
   private final UUID id;
   private final URI uri;
   private final String hash;

   ResourcePackInfoImpl(@NotNull UUID var1, @NotNull URI var2, @NotNull String var3) {
      this.id = Objects.requireNonNull(var1, "id");
      this.uri = Objects.requireNonNull(var2, "uri");
      this.hash = Objects.requireNonNull(var3, "hash");
   }

   @NotNull
   @Override
   public UUID id() {
      return this.id;
   }

   @NotNull
   @Override
   public URI uri() {
      return this.uri;
   }

   @NotNull
   @Override
   public String hash() {
      return this.hash;
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("id", this.id), ExaminableProperty.of("uri", this.uri), ExaminableProperty.of("hash", this.hash));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ResourcePackInfoImpl)) {
         return false;
      }

      ResourcePackInfoImpl var2 = (ResourcePackInfoImpl)var1;
      return this.id.equals(var2.id) && this.uri.equals(var2.uri) && this.hash.equals(var2.hash);
   }

   @Override
   public int hashCode() {
      int var1 = this.id.hashCode();
      var1 = 31 * var1 + this.uri.hashCode();
      return 31 * var1 + this.hash.hashCode();
   }

   static CompletableFuture<String> computeHash(URI var0, Executor var1) {
      CompletableFuture var2 = new CompletableFuture();
      var1.execute(() -> {
         try {
            URL var2x = var0.toURL();
            URLConnection var3 = var2x.openConnection();
            var3.addRequestProperty("User-Agent", "adventure/" + ResourcePackInfoImpl.class.getPackage().getSpecificationVersion() + " (pack-fetcher)");
            InputStream var4 = var3.getInputStream();

            try {
               MessageDigest var5 = MessageDigest.getInstance("SHA-1");
               byte[] var6 = new byte[8192];

               int var7;
               while ((var7 = var4.read(var6)) != -1) {
                  var5.update(var6, 0, var7);
               }

               var2.complete(bytesToString(var5.digest()));
            } catch (Throwable var9) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }
               }

               throw var9;
            }

            if (var4 != null) {
               var4.close();
            }
         } catch (IOException | NoSuchAlgorithmException var10) {
            var2.completeExceptionally(var10);
         }
      });
      return var2;
   }

   static String bytesToString(byte[] var0) {
      StringBuilder var1 = new StringBuilder(var0.length * 2);
      Formatter var2 = new Formatter(var1, Locale.ROOT);

      for (int var3 = 0; var3 < var0.length; var3++) {
         var2.format("%02x", var0[var3] & 255);
      }

      return var1.toString();
   }

   static final class BuilderImpl implements ResourcePackInfo.Builder {
      private UUID id;
      private URI uri;
      private String hash;

      @NotNull
      @Override
      public ResourcePackInfo.Builder id(@NotNull UUID var1) {
         this.id = Objects.requireNonNull(var1, "id");
         return this;
      }

      @NotNull
      @Override
      public ResourcePackInfo.Builder uri(@NotNull URI var1) {
         this.uri = Objects.requireNonNull(var1, "uri");
         if (this.id == null) {
            this.id = UUID.nameUUIDFromBytes(var1.toString().getBytes(StandardCharsets.UTF_8));
         }

         return this;
      }

      @NotNull
      @Override
      public ResourcePackInfo.Builder hash(@NotNull String var1) {
         this.hash = Objects.requireNonNull(var1, "hash");
         return this;
      }

      @NotNull
      @Override
      public ResourcePackInfo build() {
         return new ResourcePackInfoImpl(this.id, this.uri, this.hash);
      }

      @NotNull
      @Override
      public CompletableFuture<ResourcePackInfo> computeHashAndBuild(@NotNull Executor var1) {
         return ResourcePackInfoImpl.computeHash(Objects.requireNonNull(this.uri, "uri"), var1).thenApply(var1x -> {
            this.hash(var1x);
            return this.build();
         });
      }
   }
}
