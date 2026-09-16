package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RRHHORICORICIRHICOHHROHIIHICCH;
import java.util.List;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.util.ResourceLocation;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ResourcePackListEntry {
   private final String IROOIHRICCHIIHRCRICOICCIIICRHI;
   private final List<ResourcePackListEntry> CHCCCCRRIOHHIROCCOOCHRHRHHHOCH;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(GuiScreenResourcePacks var1, String var2, List<ResourcePackListEntry> var3) {
      super(var1);
      this.IROOIHRICCHIIHRCRICOICCIIICRHI = var2;
      this.CHCCCCRRIOHHIROCCOOCHRHRHHHOCH = var3;
   }

   public int getResourcePackFormat$v1_12() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.v1_11$1_12.getId();
   }

   public int func_183019_a$v1_8() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.v1_6$1_8.getId();
   }

   public String getResourcePackDescription$v1_12() {
      return "Back to " + this.IROOIHRICCHIIHRCRICOICCIIICRHI;
   }

   public String func_148311_a$v1_7() {
      return this.getResourcePackDescription$v1_12();
   }

   public String getResourcePackName$v1_12() {
      return "..";
   }

   public String func_148312_b$v1_7() {
      return this.getResourcePackName$v1_12();
   }

   public void bindResourcePackIcon$v1_12() {
      this.mc.getTextureManager().bindTexture((ResourceLocation)RRHHORICORICIRHICOHHROHIIHICCH.RHIHHRRRICCCCOHICIHROIRIIIIRHH());
   }

   public void func_148313_c$v1_7() {
      this.bindResourcePackIcon$v1_12();
   }

   public boolean mousePressed(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.resourcePacksGUI.availableResourcePacks$v1_8 = this.CHCCCCRRIOHHIROCCOOCHRHRHHHOCH;
      } else {
         this.resourcePacksGUI.field_146966_g$v1_7 = this.CHCCCCRRIOHHIROCCOOCHRHRHHHOCH;
      }

      ((IOIICIRIICICIIOORHCIIIIRRIHRHI)this.resourcePacksGUI.availableResourcePacksList).setUnderlyingList(this.CHCCCCRRIOHHIROCCOOCHRHRHHHOCH);
      this.resourcePacksGUI.keyTyped('\u0000', 0);
      ((RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)this.resourcePacksGUI).bridge$handlePackSwapList();
      return false;
   }
}
