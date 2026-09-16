package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends RenderLivingBase<EntityLivingBase> implements IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(RenderManager var1, ModelBase var2, float var3) {
      super(var1, var2, var3);
   }

   public int getColorMultiplier(EntityLivingBase var1, float var2, float var3) {
      return 0;
   }

   public ResourceLocation RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EntityLivingBase var1) {
      return null;
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1
   ) {
      return this.canRenderName((EntityLivingBase)var1);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1, float var2
   ) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? super.setBrightness((EntityLivingBase)var1, var2, true) : false;
   }

   public void RHIRIIORHCHHOIOROHORCOHIIIOOCH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         super.unsetBrightness();
      }
   }

   public void RORHHOOCRCHHCORIROOIRRCORIRRCO() {
   }
}
