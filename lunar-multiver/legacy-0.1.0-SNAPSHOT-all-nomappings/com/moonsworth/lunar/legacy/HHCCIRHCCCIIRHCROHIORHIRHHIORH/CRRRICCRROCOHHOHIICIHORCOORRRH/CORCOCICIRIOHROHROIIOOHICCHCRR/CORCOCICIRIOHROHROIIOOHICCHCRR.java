package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.google.common.net.MediaType;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ThreadDownloadImageData.class)
public abstract class CORCOCICIRIOHROHROIIOOHICCHCRR implements IHIRRIIORRHORHRORIHOROIRCORCOO {
   @Shadow
   public boolean textureUploaded;
   @Final
   @Shadow
   public String imageUrl;
   @Final
   @Shadow
   public IImageBuffer imageBuffer;
   @Shadow
   public BufferedImage bufferedImage;
   @Final
   @Shadow
   public File cacheFile;
   private static final ThreadFactory textureThreadFactory = new ThreadFactoryBuilder().setNameFormat("Texture Downloader #%d").setDaemon(true).build();
   private static final ExecutorService textureThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), textureThreadFactory);
   @Unique
   private CompletableFuture<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> requestFuture;
   @Nullable
   private MediaType mimeType = null;

   @Shadow
   public abstract void setBufferedImage(BufferedImage var1);

   @Redirect(
      method = "loadTexture(Lnet/minecraft/client/resources/IResourceManager;)V",
      at = @At(value = "INVOKE", target = "Ljavax/imageio/ImageIO;read(Ljava/io/File;)Ljava/awt/image/BufferedImage;")
   )
   public BufferedImage impl$ImageIOread(File var1) {
      try {
         return HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var1);
      } catch (Throwable var3) {
         throw var3;
      }
   }

   public void setMimeType(@Nullable MediaType var1) {
      this.mimeType = var1;
   }

   @Overwrite
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void func_152433_a$v1_7() {
      this.impl$loadTextureFromServer();
   }

   @Overwrite
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void loadTextureFromServer$v1_8() {
      this.impl$loadTextureFromServer();
   }

   public void impl$loadTextureFromServer() {
      textureThreadPool.submit(() -> {
         HttpURLConnection var1 = null;
         ThreadDownloadImageData.LOGGER.debug("Downloading http texture from {} to {}", this.imageUrl, this.cacheFile);

         try {
            var1 = (HttpURLConnection)new URL(this.imageUrl).openConnection(Minecraft.getMinecraft().getProxy());
            if (this.imageUrl.contains(RIROICHCRROROHCCROOCCCCOCHCCRI.RIHCHIIOIOCHHIRRCORCHROCCHOIIC)) {
               var1.setRequestProperty("Referer", "LunarClient-Java");
            }

            if (this.mimeType != null) {
               var1.setRequestProperty("Accept", this.mimeType.toString());
            }

            try (InputStream var2 = var1.getInputStream()) {
               BufferedImage var3 = HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this.cacheFile);
               if (this.imageBuffer != null) {
                  var3 = this.imageBuffer.parseUserSkin(var3);
               }

               this.setBufferedImage(var3);
            }
         } catch (Exception var27) {
            if (!(var27 instanceof FileNotFoundException)) {
               ThreadDownloadImageData.LOGGER.error("Couldn't download http texture: " + var27.getClass().getName() + ": " + var27.getMessage());
            }
         } finally {
            this.bridge$setImageFound(this.bufferedImage != null);
            if (var1 != null && var1.getErrorStream() != null) {
               try (InputStream var6 = var1.getErrorStream()) {
                  while (var6.skip(2048L) > 0L) {
                  }
               } catch (Exception var25) {
               }
            }
         }
      });
   }

   @Inject(method = "setBufferedImage", at = @At("HEAD"))
   private void impl$setBufferedImage(@Nullable BufferedImage var1, CallbackInfo var2) {
      if (var1 != null) {
         if (this.requestFuture != null) {
            this.requestFuture
               .complete(
                  new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var1
                  )
               );
         }
      }
   }

   public CompletableFuture<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> bridge$requestContent() {
      if (this.bufferedImage != null) {
         return CompletableFuture.completedFuture(
            new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this.bufferedImage
            )
         );
      }

      if (this.requestFuture == null) {
         this.requestFuture = new CompletableFuture<>();
      }

      return this.requestFuture;
   }

   public File bridge$getFile() {
      return this.cacheFile;
   }
}
