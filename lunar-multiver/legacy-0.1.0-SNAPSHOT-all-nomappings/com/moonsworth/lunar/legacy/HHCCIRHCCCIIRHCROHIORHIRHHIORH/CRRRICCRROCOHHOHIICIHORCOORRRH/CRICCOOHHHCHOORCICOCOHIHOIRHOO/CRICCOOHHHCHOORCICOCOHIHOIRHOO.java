package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SkinManager.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements IIHRRHORCRCROCHHOHORCHCROCIHRO {
   @Shadow
   public Map<Type, MinecraftProfileTexture> loadSkinFromCache(GameProfile var1) {
      throw new AssertionError();
   }

   @Shadow
   public ResourceLocation loadSkin(MinecraftProfileTexture var1, Type var2) {
      throw new AssertionError();
   }

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$registerTexture(MinecraftProfileTexture var1, Type var2) {
      return (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.loadSkin(var1, var2);
   }

   public Optional<RCIROOOOICRHCCRRCIORHHIRCOIIIC> bridge$getSkinLocation(GameProfile var1, Type var2) {
      MinecraftProfileTexture var3 = this.loadSkinFromCache(var1).get(var2);
      return var3 != null ? Optional.of((RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.loadSkin(var3, var2)) : Optional.empty();
   }

   public boolean bridge$isSkinLoaded(GameProfile var1) {
      return !this.loadSkinFromCache(var1).isEmpty();
   }
}
