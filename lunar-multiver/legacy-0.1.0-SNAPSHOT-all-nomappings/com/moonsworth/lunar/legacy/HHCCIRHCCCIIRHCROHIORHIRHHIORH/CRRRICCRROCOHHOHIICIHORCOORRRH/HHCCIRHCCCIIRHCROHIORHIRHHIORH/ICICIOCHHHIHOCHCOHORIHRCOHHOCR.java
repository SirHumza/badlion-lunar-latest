package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.collect.Lists;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest.Initiator;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IORRORCRRHRRORHIRHRROHCRRIHRII;
import com.moonsworth.lunar.client.util.RRHHORICORICIRHICOHHROHIIHICCH;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiResourcePackAvailable;
import net.minecraft.client.gui.GuiResourcePackSelected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackListEntryDefault;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraft.client.resources.ResourcePackListEntryServer;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiScreenResourcePacks.class)
public abstract class ICICIOCHHHIHOCHCOHORIHRCOHHOCR
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO {
   @Unique
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC lunar$rpggIcon = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar", "logo/logo-rpgg.png"
   );
   @Shadow
   public List<ResourcePackListEntry> availableResourcePacks$v1_8;
   public List<ResourcePackListEntry> baseAvailableResourcePacks;
   @Shadow
   public List<ResourcePackListEntry> selectedResourcePacks$v1_8;
   @Shadow
   public GuiResourcePackAvailable availableResourcePacksList;
   @Shadow
   public GuiResourcePackSelected selectedResourcePacksList;
   @Shadow
   public boolean changed$v1_8;
   @Shadow
   public List field_146966_g$v1_7;
   @Shadow
   public List field_146969_h$v1_7;
   private GuiTextField searchField;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   private com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> showIncompatible;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private GuiOptionButton doneButton;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private boolean loaded;
   private final List<com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?>> components = new ArrayList<>();
   private final Map<File, com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH> resourcePackFolderEntries = new HashMap<>();
   private boolean discoveredResourcePacks;

   @Shadow
   public abstract void markChanged$v1_8();

   @Overwrite
   public void initGui() {
      List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.buttonList$v1_8 : this.buttonList$v1_7;
      var1.add(new GuiOptionButton(2, this.width / 2 - 154, this.height - 48, I18n.format("resourcePack.openFolder", new Object[0])));
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         var1.add(this.doneButton = new GuiOptionButton(1, this.width / 2 + 4, this.height - 48, I18n.format("gui.done", new Object[0])));
      } else {
         var1.add(new GuiOptionButton(1, this.width / 2 + 4, this.height - 48, I18n.format("gui.done", new Object[0])));
      }

      this.components.clear();
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      this.components
         .add(
            new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               var3.RIRHIHIORRHORRCICCHCOCCHRIOHHO(),
               null,
               var1x -> {
                  if ((Boolean)var1x.get() && !var3.isEnabled()) {
                     var3.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
                           com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        )
                        .ifPresent(var0x -> var0x.setEnabled(true));
                  }
               }
            )
         );
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.components
            .add(
               this.showIncompatible = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .COIIIHRHRRRHIRHRHHCCOOCCRHICHC()
                  .HIRCCOIRHRIHRCOIORROICRHHIRRCC()
                  .OCOHORHCROHICRRIHCIHHRRCIHICRI(null)
            );
      }

      this.components
         .add(
            new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               var3.IHCROIRRIICRRCOICOCOCCRHORHOOI(),
               null,
               var1x -> {
                  if ((Boolean)var1x.get() && !var3.isEnabled()) {
                     var3.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
                           com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                        )
                        .ifPresent(var0x -> var0x.setEnabled(true));
                  }
               }
            )
         );
      this.components.add(var2.RCCHCHHRRIIRIOOHHIRIHHICOCRHRR().OCOHORHCROHICRRIHCIHHRRCIHICRI(null));
      this.components.add(var2.RRCORRRCHHOHRRORHRHRHCRHORIOII().OCOHORHCROHICRRIHCIHHRRCIHICRI(null));
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         this.doneButton.enabled = false;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 || !this.changed$v1_8) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
            this.field_146966_g$v1_7 = this.baseAvailableResourcePacks = Lists.newArrayList();
            this.field_146969_h$v1_7 = Lists.newArrayList();
         } else {
            this.availableResourcePacks$v1_8 = this.baseAvailableResourcePacks = Lists.newArrayList();
            this.selectedResourcePacks$v1_8 = Lists.newArrayList();
         }

         this.discoverResourcePacks();
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.availableResourcePacksList = GuiResourcePackAvailable.newInstance$v1_8(this.mc, 200, this.height - 20, this.availableResourcePacks$v1_8);
         this.selectedResourcePacksList = GuiResourcePackSelected.newInstance$v1_8(this.mc, 200, this.height - 76, this.selectedResourcePacks$v1_8);
      } else {
         this.availableResourcePacksList = GuiResourcePackAvailable.newInstance$v1_7(this.mc, 200, this.height - 20, this.field_146966_g$v1_7);
         this.selectedResourcePacksList = GuiResourcePackSelected.newInstance$v1_7(this.mc, 200, this.height - 56, this.field_146969_h$v1_7);
      }

      this.availableResourcePacksList.setSlotXBoundsFromLeft(this.width / 2 - 4 - 200);
      this.availableResourcePacksList.registerScrollButtons(7, 8);
      this.selectedResourcePacksList.setSlotXBoundsFromLeft(this.width / 2 + 4);
      this.selectedResourcePacksList.registerScrollButtons(7, 8);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.searchField = new GuiTextField(103, this.fontRenderer, this.width / 2 - 204, this.height - 70, 200, 18);
      } else {
         this.searchField = new GuiTextField(this.fontRenderer, this.width / 2 - 204, this.height - 70, 200, 18);
      }

      int var4 = this.width / 2 + 9;
      int var5 = this.height - (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? 125 : 107);

      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR var7 : this.components) {
         var7.IRRCCOICORICIHCHRHIHIHROIRHOCR(var4, var5, 190.0F);
         var5 = (int)(var5 + var7.getHeight());
      }
   }

   private void discoverResourcePacks() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.availableResourcePacks$v1_8.clear();
         this.selectedResourcePacks$v1_8.clear();
      } else {
         this.field_146969_h$v1_7.clear();
         this.field_146966_g$v1_7.clear();
      }

      new Thread(
            () -> {
               this.discoveredResourcePacks = false;
               File var1 = this.mc.fileResourcepacks;
               if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .COIIIHRHRRRHIRHRHHCCOOCCRHICHC()
                     .isEnabled()
                  && var1.exists()
                  && var1.isDirectory()) {
                  String[] var2 = var1.list(RRHHORICORICIRHICOHHROHIIHICCH.IOHRORHRHCIOCOOCHHROOIHOCICRHI());

                  for (String var6 : var2) {
                     File var7 = new File(var1, var6);
                     if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                        this.availableResourcePacks$v1_8
                           .add(
                              new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                                 (GuiScreenResourcePacks)this, var7, var1, null, this.availableResourcePacks$v1_8, this.resourcePackFolderEntries
                              )
                           );
                     } else {
                        this.field_146966_g$v1_7
                           .add(
                              new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                                 (GuiScreenResourcePacks)this, var7, var1, null, this.field_146966_g$v1_7, this.resourcePackFolderEntries
                              )
                           );
                     }
                  }
               }

               ResourcePackRepository var8 = this.mc.getResourcePackRepository();
               var8.updateRepositoryEntriesAll();
               ArrayList var9;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  var9 = Lists.newArrayList(var8.getRepositoryEntriesAll$v1_8());
                  var9.removeAll(var8.getRepositoryEntries$v1_8());
               } else {
                  var9 = Lists.newArrayList(var8.getRepositoryEntriesAll$v1_7());
                  var9.removeAll(var8.getRepositoryEntries$v1_7());
               }

               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  int var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? 3 : 1;

                  for (Entry var14 : var9) {
                     int var15 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var14.getPackFormat$v1_12() : var14.func_183027_f$v1_8();
                     if (var15 == var10
                        || (Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                           .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                           .COIIIHRHRRRHIRHRHHCCOOCCRHICHC()
                           .HIRCCOIRHRIHRCOIORROICRHHIRRCC()
                           .get()) {
                        this.availableResourcePacks$v1_8.add(new ResourcePackListEntryFound((GuiScreenResourcePacks)this, var14));
                     }
                  }
               } else {
                  for (Entry var13 : var9) {
                     this.field_146966_g$v1_7.add(new ResourcePackListEntryFound((GuiScreenResourcePacks)this, var13));
                  }
               }

               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
                  this.doneButton.enabled = true;
                  this.loaded = true;
               }

               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  this.mc
                     .addScheduledTask$v1_8(
                        () -> {
                           try {
                              if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
                                 Entry var2x = var8.getResourcePackEntry$v1_12();
                                 if (var2x != null) {
                                    this.selectedResourcePacks$v1_8
                                       .add(new ResourcePackListEntryServer((GuiScreenResourcePacks)this, var8.getServerResourcePack$v1_12()));
                                 }
                              }

                              for (Entry var3 : Lists.reverse(var8.getRepositoryEntries$v1_8())) {
                                 this.selectedResourcePacks$v1_8.add(new ResourcePackListEntryFound((GuiScreenResourcePacks)this, var3));
                              }

                              this.selectedResourcePacks$v1_8.add(new ResourcePackListEntryDefault((GuiScreenResourcePacks)this));
                           } catch (Exception var4) {
                              var4.printStackTrace();
                           }
                        }
                     );
               } else {
                  this.mc.addScheduledTask$v1_7(() -> {
                     try {
                        for (Object var3 : Lists.reverse(var8.getRepositoryEntries$v1_7())) {
                           this.field_146969_h$v1_7.add(new ResourcePackListEntryFound((GuiScreenResourcePacks)this, (Entry)var3));
                        }

                        this.field_146969_h$v1_7.add(new ResourcePackListEntryDefault((GuiScreenResourcePacks)this));
                     } catch (Exception var4) {
                        var4.printStackTrace();
                     }
                  });
               }

               this.discoveredResourcePacks = true;
            }
         )
         .start();
   }

   public void keyTyped(char var1, int var2) {
      super.keyTyped(var1, var2);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 0 || this.loaded) {
         this.searchField.textboxKeyTyped(var1, var2);
         this.lunar$refreshAvailableList();
      }
   }

   @Unique
   private void lunar$refreshAvailableList() {
      if (!this.searchField.getText().isEmpty()) {
         LinkedHashMap var1 = new LinkedHashMap();

         for (Object var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.availableResourcePacks$v1_8 : this.field_146966_g$v1_7) {
            ResourcePackListEntry var4 = (ResourcePackListEntry)var3;
            String var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var4.getResourcePackName$v1_12() : var4.func_148312_b$v1_7();
            if (var4 instanceof com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
               )
             {
               var1.put(var5, var4);
            } else if (!var1.containsKey(var5)) {
               String var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
                  var5
               );
               String var7 = this.searchField.getText();
               var7 = IORRORCRRHRRORHIRHRROHCRRIHRII.RCROOHHCROORIIICHORIHRROIOOHHC(var7);
               String[] var8 = var6.split(" ");

               for (String var12 : var8) {
                  var12 = IORRORCRRHRRORHIRHRROHCRRIHRII.RCROOHHCROORIIICHORIHRROIOOHHC(var12);
                  if (var12.startsWith(var7)) {
                     var1.put(var5, (ResourcePackListEntry)var3);
                  }
               }
            }
         }

         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IOIICIRIICICIIOORHCIIIIRRIHRHI)this.availableResourcePacksList)
            .setUnderlyingList(new ArrayList(var1.values()));
      } else {
         List var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.availableResourcePacks$v1_8 : this.field_146966_g$v1_7;
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IOIICIRIICICIIOORHCIIIIRRIHRHI)this.availableResourcePacksList)
            .setUnderlyingList(var13);
      }
   }

   public void updateScreen() {
      this.searchField.updateCursorCounter();
   }

   @Inject(method = "mouseClicked", at = @At("RETURN"))
   private void lunar$mouseClicked(int var1, int var2, int var3, CallbackInfo var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.searchField.mouseClicked$v1_12(var1, var2, var3);
      } else {
         this.searchField.mouseClicked$v1_7(var1, var2, var3);
      }

      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1, var2
      );

      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR var7 : this.components) {
         if (var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5)
            && var7.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var5, var3)
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            && var7 == this.showIncompatible) {
            this.discoverResourcePacks();
         }
      }

      float var9 = this.width / 2.0F - 200.0F;
      float var10 = this.height - 42;
      boolean var8 = var1 >= var9 && var1 <= var9 + 30.0F && var2 >= var10 && var2 <= var10 + 20.0F;
      if (var3 == 0 && var8) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OIOOICHIIHICCRCOOIOIOCIRRIIIRC();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .IHCHHRRIIIORORCHIICIIOORCOIOIO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.INFO,
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                  "urlOpened", new Object[0]
               )
            );
         com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIIRIOIIIRICHRRRHCIRHRORCIIRIO, Initiator.INITIATOR_UNSPECIFIED
         );
      }
   }

   @Inject(method = "drawScreen", at = @At("RETURN"))
   private void lunar$drawScreen(int var1, int var2, float var3, CallbackInfo var4) {
      List var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.availableResourcePacksList.resourcePackEntries$v1_8
         : this.availableResourcePacksList.field_148204_l$v1_7;
      if (var5.isEmpty()) {
         String var6;
         if (!this.discoveredResourcePacks) {
            var6 = "Discovering resource packs...";
         } else if (this.searchField.getText().isEmpty()) {
            var6 = "No resource packs found";
         } else {
            var6 = "";
         }

         this.drawCenteredString(
            this.fontRenderer,
            ""
               + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GRAY
               + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ITALIC
               + var6,
            this.width / 2 - 100,
            60,
            16777215
         );
      }

      this.searchField.drawTextBox();
      if (this.searchField.getText().isEmpty() && !this.searchField.isFocused()) {
         this.drawString(
            this.fontRenderer,
            ""
               + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GRAY
               + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ITALIC
               + "Search...",
            this.width / 2 - 200,
            this.height - 65,
            16777215
         );
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR var12 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      int var7 = this.width / 2 + 4;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null
         || !(Boolean)com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .RCCHCHHRRIIRIOOHHIRIHHICOCRHRR()
            .get()) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var12,
            var7,
            this.height - (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? 127.0F : 107.0F),
            200.0F,
            IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? 76.0F : 56.0F,
            -1879048192
         );
      }

      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1, var2
      );
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = var12.IRCRHHCRHIIIHROOCORCHHHRIIROIR();

      for (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR var11 : this.components) {
         var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9, var8, var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8));
      }

      this.lunar$drawResourcePacksGGbutton(var12, var1, var2);
   }

   @Redirect(method = "drawScreen", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreenResourcePacks;drawBackground(I)V"))
   private void lunar$drawBackground(GuiScreenResourcePacks var1, int var2) {
      if (this.mc.world != null
         && (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .RCCHCHHRRIIRIOOHHIRIHHICOCRHRR()
            .get()) {
         var1.drawDefaultBackground();
      } else {
         var1.drawBackground(var2);
      }
   }

   @Inject(method = "actionPerformed", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;refreshResources()V", shift = Shift.AFTER))
   private void lunar$onSwapPack(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSelectedResourcePack()
            )
         );
   }

   public void bridge$handlePackSwapList() {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COIIIHRHRRRHIRHRHHCCOOCCRHICHC()
         .isEnabled()) {
         List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.availableResourcePacks$v1_8 : this.field_146966_g$v1_7;

         for (ResourcePackListEntry var3 : List.copyOf(var1)) {
            List var4 = null;
            if (var3 instanceof ResourcePackListEntryFound var5) {
               IResourcePack var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
                  ? var5.resourcePackEntry$v1_12.reResourcePack
                  : var5.field_148319_c$v1_7.reResourcePack;
               if (!(var6 instanceof AbstractResourcePack)) {
                  continue;
               }

               com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var7 = this.resourcePackFolderEntries
                  .get(((AbstractResourcePack)var6).resourcePackFile.getParentFile());
               if (var7 == null) {
                  var4 = this.baseAvailableResourcePacks;
               } else {
                  var4 = var7.OOHOCROIHRIIRCCHCIIOHHOHIHICOO();
               }
            }

            if (var4 != null && var4 != var1) {
               var1.remove(var3);
               var4.add(var3);
            }
         }

         for (com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var9 : this.resourcePackFolderEntries
            .values()) {
            var9.IHIRCRRIHICOHHCCOIHRHOORRIIIHC();
         }
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.markChanged$v1_8();
      }
   }

   @Unique
   private void lunar$drawResourcePacksGGbutton(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      int var2,
      int var3
   ) {
      float var4 = this.width / 2.0F - 200.0F;
      float var5 = this.height - 42;
      boolean var6 = var2 >= var4 && var2 <= var4 + 30.0F && var3 >= var5 && var3 <= var5 + 20.0F;
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1, this.lunar$rpggIcon, var4, var5, 30.0F, 20.0F, var6 ? -1 : -1426063361
      );
   }
}
