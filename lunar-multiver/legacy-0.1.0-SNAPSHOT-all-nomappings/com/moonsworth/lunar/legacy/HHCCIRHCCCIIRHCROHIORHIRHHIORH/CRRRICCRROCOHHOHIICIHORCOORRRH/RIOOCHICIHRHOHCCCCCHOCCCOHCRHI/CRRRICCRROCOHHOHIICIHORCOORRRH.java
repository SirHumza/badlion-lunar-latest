package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
import java.util.List;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerList.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public List<ServerData> servers;

   @Shadow
   public abstract ServerData getServerData(int var1);

   @Shadow
   public abstract void loadServerList();

   @Shadow
   public abstract void saveServerList();

   @Inject(method = "swapServers(II)V", at = @At("HEAD"), cancellable = true)
   private void lunar$swapServers(int var1, int var2, CallbackInfo var3) {
      if (!this.bridge$canSwapServers(var1, var2)) {
         var3.cancel();
      }
   }

   @Inject(method = "loadServerList", at = @At(value = "INVOKE", target = "Ljava/util/List;clear()V", shift = Shift.AFTER))
   private void lunar$addPinnedServers(CallbackInfo var1) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .OORRROHOHHOOROORRRCCCOCCOOCCHI();

      for (com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : var2.RCCOHRIIRRIHHHHCRIOHRHRRHIOIOH().values()) {
         ServerData var5 = new ServerData(var4.name(), var4.HHIOHCROORIRCOCICOCIHIIIHOCHIH(), false);
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5;
         var6.bridge$setIsPinned(true);
         var2.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var6);
         this.servers.add(var5);
      }
   }

   @WrapWithCondition(method = "saveServerList", at = @At(value = "INVOKE", target = "Lnet/minecraft/nbt/NBTTagList;appendTag(Lnet/minecraft/nbt/NBTBase;)V"))
   private boolean lunar$dontSavePinnedServer(NBTTagList var1, NBTBase var2, @Local ServerData var3) {
      return !((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3)
         .bridge$isPinned();
   }

   public void bridge$load() {
      this.loadServerList();
   }

   public void bridge$add(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.servers.add((ServerData)var1);
   }

   public void bridge$save() {
      this.saveServerList();
   }

   public boolean bridge$containsUnpinnedAddress(String var1) {
      for (ServerData var3 : this.servers) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3;
         if (!var4.bridge$isPinned() && var1.equalsIgnoreCase(var4.bridge$serverIP())) {
            return true;
         }
      }

      return false;
   }

   public boolean bridge$canSwapServers(int var1, int var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getServerData(
         var1
      );
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getServerData(
         var2
      );
      return !var3.bridge$isPinned() && !var4.bridge$isPinned();
   }
}
