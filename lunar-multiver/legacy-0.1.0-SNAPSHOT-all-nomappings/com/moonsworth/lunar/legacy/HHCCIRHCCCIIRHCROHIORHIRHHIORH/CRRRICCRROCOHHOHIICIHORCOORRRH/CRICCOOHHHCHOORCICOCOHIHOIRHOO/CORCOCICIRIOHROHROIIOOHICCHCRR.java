package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.InputStream;
import net.minecraft.client.resources.SimpleResource;
import net.minecraft.client.resources.data.IMetadataSection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SimpleResource.class)
public abstract class CORCOCICIRIOHROHROIIOOHICCHCRR
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public String resourcePackName$v1_8;

   @Shadow
   public abstract InputStream getInputStream();

   @Shadow
   public abstract boolean hasMetadata();

   @Shadow
   public abstract <T extends IMetadataSection> T getMetadata(String var1);

   public boolean bridge$hasMetadata() {
      return this.hasMetadata();
   }

   public <T extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH> T bridge$getMetadata(
      String var1
   ) {
      return this.getMetadata(var1);
   }

   public String bridge$getResourcePackName() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.resourcePackName$v1_8 : "default";
   }

   public InputStream bridge$getInputStream() {
      return this.getInputStream();
   }
}
