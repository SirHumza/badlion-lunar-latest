package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.common.collect.ImmutableSet;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Set;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DefaultResourcePack.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Shadow
   public abstract InputStream getResourceStream(ResourceLocation var1);

   @Shadow
   public abstract String getPackName();

   @Shadow
   public abstract BufferedImage getPackImage();

   @Overwrite
   public Set<String> getResourceDomains() {
      return ImmutableSet.of("minecraft", "realms", "lunar");
   }

   public InputStream bridge$getInputStream(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      return this.getResourceStream((ResourceLocation)var1);
   }

   @Inject(
      method = "getResourceStream",
      at = @At(value = "INVOKE", target = "Ljava/lang/Class;getResource(Ljava/lang/String;)Ljava/net/URL;"),
      cancellable = true
   )
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private void impl$getResourceAsStream(ResourceLocation var1, CallbackInfoReturnable<InputStream> var2) {
      String var3 = "/assets/" + var1.getNamespace$v1_12() + "/" + var1.getPath$v1_12();
      InputStream var4 = DefaultResourcePack.class.getResourceAsStream(var3);
      if (var4 != null) {
         var2.setReturnValue(var4);
      }
   }

   public String bridge$getPackName() {
      return this.getPackName();
   }

   public Optional<BufferedImage> bridge$getPackImage() {
      try {
         try {
            return Optional.ofNullable(this.getPackImage());
         } catch (IOException var2) {
            return Optional.empty();
         }
      } catch (Throwable var3) {
         throw var3;
      }
   }
}
