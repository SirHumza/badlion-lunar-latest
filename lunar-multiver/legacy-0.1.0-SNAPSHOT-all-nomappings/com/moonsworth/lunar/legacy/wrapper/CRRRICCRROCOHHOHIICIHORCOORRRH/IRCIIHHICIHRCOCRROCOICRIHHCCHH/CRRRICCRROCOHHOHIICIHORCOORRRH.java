package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.Lists;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RRHHORICORICIRHICOHHROHIIHICCH;
import java.io.File;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import net.minecraft.util.ResourceLocation;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends ResourcePackListEntry {
   private final File HHCOIHIROHHCHIOCHIROHHIIOOORIH;
   public final Entry OCOHRIOIRRIHCIICOHIOHCIHOOCCOR;
   private final List<ResourcePackListEntry> ICIHHORICIRCHCORCROOCICRCICRIO = Lists.newArrayList();
   private int OOHHHCIROCCIOIHOHRCHHIICORHICI;
   private int OCCIIOORRRORCCOIRRHHHOCRICROHO;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      GuiScreenResourcePacks var1, File var2, File var3, Entry var4, List<ResourcePackListEntry> var5, Map<File, CRRRICCRROCOHHOHIICIHORCOORRRH> var6
   ) {
      super(var1);
      this.HHCOIHIROHHCHIOCHIROHHIIOOORIH = var2;
      this.OCOHRIOIRRIHCIICOHIOHCIHOOCCOR = var4;
      var6.put(var2, this);
      this.ICIHHORICIRCHCORCROOCICRCICRIO.add(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var3.getName(), var5));
      String[] var7 = var2.list(RRHHORICORICIRHICOHHROHIIHICCH.IOHRORHRHCIOCOOCHHROOIHOCICRHI());

      for (String var11 : var7) {
         File var12 = new File(var2, var11);
         this.ICIHHORICIRCHCORCROOCICRCICRIO.add(new CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var12, var2, null, this.ICIHHORICIRCHCORCROOCICRCICRIO, var6));
      }

      ResourcePackRepository var15 = new ResourcePackRepository(
         var2,
         new File(this.mc.gameDir, "server-resource-packs"),
         this.mc.defaultResourcePack,
         this.mc.metadataSerializer,
         Minecraft.getMinecraft().gameSettings
      );
      int var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? 3 : 1;

      for (Entry var19 : IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var15.repositoryEntriesAll$v1_8 : var15.repositoryEntriesAll$v1_7) {
         List var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.mc.gameSettings.resourcePacks$v1_8 : this.mc.gameSettings.resourcePacks$v1_7;
         if (!var13.contains(var19.getResourcePack().getPackName())) {
            int var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
               ? var19.getPackFormat$v1_12()
               : (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var19.func_183027_f$v1_8() : var19.rePackMetadataSection.getPackFormat());
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
               || var14 == var16
               || (Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .COIIIHRHRRRHIRHRHHCCOOCCRHICHC()
                  .HIRCCOIRHRIHRCOIORROICRHHIRRCC()
                  .get()) {
               this.ICIHHORICIRCHCORCROOCICRCICRIO.add(new ResourcePackListEntryFound(var1, var19));
            }
         }
      }

      this.IHIRCRRIHICOHHCCOIHRHOORRIIIHC();
   }

   public void IHIRCRRIHICOHHCCOIHRHOORRIIIHC() {
      this.OCCIIOORRRORCCOIRRHHHOCRICROHO = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
      this.OOHHHCIROCCIOIHOHRCHHIICORHICI = IRCIIHHICIHRCOCRROCOICRIHHCCHH(this);
   }

   public int func_183019_a$v1_8() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.v1_6$1_8.getId();
   }

   public int getResourcePackFormat$v1_12() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.v1_11$1_12.getId();
   }

   public String getResourcePackDescription$v1_12() {
      return this.OCCIIOORRRORCCOIRRHHHOCRICROHO
         + " "
         + (this.OCCIIOORRRORCCOIRRHHHOCRICROHO != 0 && this.OCCIIOORRRORCCOIRRHHHOCRICROHO <= 1 ? "Folder" : "Folders")
         + " / "
         + this.OOHHHCIROCCIOIHOHRCHHIICORHICI
         + " "
         + (this.OOHHHCIROCCIOIHOHRCHHIICORHICI != 0 && this.OOHHHCIROCCIOIHOHRCHHIICORHICI <= 1 ? "Pack" : "Packs");
   }

   public String func_148311_a$v1_7() {
      return this.getResourcePackDescription$v1_12();
   }

   public String getResourcePackName$v1_12() {
      return this.HHCOIHIROHHCHIOCHIROHHIIOOORIH.getName();
   }

   public String func_148312_b$v1_7() {
      return this.getResourcePackName$v1_12();
   }

   public void bindResourcePackIcon$v1_12() {
      this.mc.getTextureManager().bindTexture((ResourceLocation)RRHHORICORICIRHICOHHROHIIHICCH.HIHCCHHCOOROHCRCORRIOHOIRHHICR());
   }

   public void func_148313_c$v1_7() {
      this.bindResourcePackIcon$v1_12();
   }

   public boolean mousePressed(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.resourcePacksGUI.availableResourcePacks$v1_8 = this.ICIHHORICIRCHCORCROOCICRCICRIO;
      } else {
         this.resourcePacksGUI.field_146966_g$v1_7 = this.ICIHHORICIRCHCORCROOCICRCICRIO;
      }

      ((IOIICIRIICICIIOORHCIIIIRRIHRHI)this.resourcePacksGUI.availableResourcePacksList).setUnderlyingList(this.ICIHHORICIRCHCORCROOCICRCICRIO);
      this.resourcePacksGUI.keyTyped('\u0000', 0);
      ((RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)this.resourcePacksGUI).bridge$handlePackSwapList();
      return false;
   }

   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0) {
      int var1 = 0;

      for (ResourcePackListEntry var3 : var0.ICIHHORICIRCHCORCROOCICRCICRIO) {
         if (var3 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH) {
            var1 += 1 + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((CRRRICCRROCOHHOHIICIHORCOORRRH)var3);
         }
      }

      return var1;
   }

   private static int IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0) {
      int var1 = 0;

      for (ResourcePackListEntry var3 : var0.ICIHHORICIRCHCORCROOCICRCICRIO) {
         if (var3 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH) {
            var1 += IRCIIHHICIHRCOCRROCOICRIHHCCHH((CRRRICCRROCOHHOHIICIHORCOORRRH)var3);
         } else if (!(var3 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH)) {
            var1++;
         }
      }

      return var1;
   }

   @Generated
   public List<ResourcePackListEntry> OOHOCROIHRIIRCCHCIIOHHOHIHICOO() {
      return this.ICIHHORICIRCHCORCROOCICRCICRIO;
   }
}
