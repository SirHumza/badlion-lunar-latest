package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.resources.FallbackResourceManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SimpleReloadableResourceManager.class)
public abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   @Shadow
   public Map<String, FallbackResourceManager> domainResourceManagers;

   @Shadow
   public abstract IResource getResource(ResourceLocation var1);

   @Shadow
   public abstract void reloadResources(List<IResourcePack> var1);

   @Shadow
   public abstract void registerReloadListener(IResourceManagerReloadListener var1);

   @Shadow
   public abstract Set<String> getResourceDomains();

   @Shadow
   public abstract List<IResource> getAllResources(ResourceLocation var1);

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getResource(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1
   ) {
      IResourceManager var2 = (IResourceManager)this.domainResourceManagers.get(var1.bridge$getDomain());
      if (var2 != null) {
         try {
            return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var2.getResource(
               (ResourceLocation)var1
            );
         } catch (IOException var4) {
            return null;
         }
      } else {
         return null;
      }
   }

   public void bridge$putDomainResourceManager(
      String var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2
   ) {
      this.domainResourceManagers.put(var1, (FallbackResourceManager)var2);
   }

   public void bridge$reloadResources(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var1
   ) {
      ArrayList var2 = new ArrayList(var1.size());

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 : var1) {
         var2.add((IResourcePack)var4);
      }

      this.reloadResources(var2);
   }

   public void bridge$registerReloadListener(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1
   ) {
      this.registerReloadListener(
         var1x -> var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1x
         )
      );
   }

   public Set<String> bridge$getResourceDomains() {
      return this.getResourceDomains();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getResource(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, boolean var2
   ) {
      return this.bridge$getResource(var1);
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO> bridge$getAllResources(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1
   ) {
      List var2 = this.getAllResources((ResourceLocation)var1);
      ArrayList var3 = new ArrayList(var2.size());

      for (IResource var5 : var2) {
         var3.add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var5
         );
      }

      return var3;
   }
}
