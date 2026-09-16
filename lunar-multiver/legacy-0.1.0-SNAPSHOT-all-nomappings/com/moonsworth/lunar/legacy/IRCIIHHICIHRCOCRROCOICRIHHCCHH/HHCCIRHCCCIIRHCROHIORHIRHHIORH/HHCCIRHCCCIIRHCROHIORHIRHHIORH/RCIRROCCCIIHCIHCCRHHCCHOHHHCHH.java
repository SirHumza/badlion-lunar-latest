package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.lunarclient.websocket.hostedworld.v1.Joinability;
import com.lunarclient.websocket.hostedworld.v1.ListHostedWorldsResponse.HostedWorld;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import net.minecraft.client.renderer.Tessellator;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IGuiListEntry {
   private final GuiMultiplayer CHIOCIIOCHHCIIHRCIIRHROHCCHHRI;
   private final HostedWorld OCHROICCHHCOICOHIIOCRCHRCROORI;
   public long HHCOICIORHOCRIROHIRCCOROOCRHIC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(GuiMultiplayer var1, HostedWorld var2) {
      this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI = var1;
      this.OCHROICCHHCOICOHIIOCRCHRCROORI = var2;
   }

   public boolean OIICIHCOORRCCIRRRCRHCHIHHCCRRC() {
      return this.OCHROICCHHCOICOHIIOCRCHRCROORI.getJoinability() == Joinability.JOINABILITY_ALLOWED
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession() != null;
   }

   public void updatePosition$v1_12(int var1, int var2, int var3, float var4) {
   }

   public void drawEntry$v1_7(int var1, int var2, int var3, int var4, int var5, Tessellator var6, int var7, int var8, boolean var9) {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.OCHROICCHHCOICOHIIOCRCHRCROORI,
         CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHHRRIRIHIHRORCOHCRRCIOCRIORIR().IRCRHHCRHIIIHROOCORCHHHRIIROIR(),
         var2,
         var3,
         var4,
         var5,
         var7,
         var8,
         var9
      );
   }

   public void drawEntry$v1_8(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.OCHROICCHHCOICOHIIOCRCHRCROORI,
         CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHHRRIRIHIHRORCOHCRRCIOCRIORIR().IRCRHHCRHIIIHROOCORCHHHRIIROIR(),
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
   }

   public void drawEntry$v1_12(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.OCHROICCHHCOICOHIIOCRCHRCROORI,
         CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9).IRCRHHCRHIIIHROOCORCHHHRIIROIR(),
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8
      );
   }

   public boolean mousePressed(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 <= 32.0 && var5 < 26.0 && var5 > 10.0 && this.OIICIHCOORRCCIRRRCRHCHIHHCCRRC()) {
         this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.serverListSelector.selectedSlotIndex = var1;
         this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.connectToSelected();
         return true;
      }

      this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.serverListSelector.selectedSlotIndex = var1;
      this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.btnSelectServer.enabled = this.OIICIHCOORRCCIRRRCRHCHIHHCCRRC();
      this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.btnEditServer.enabled = false;
      this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.btnDeleteServer.enabled = false;
      if (Minecraft.getSystemTime() - this.HHCOICIORHOCRIROHIRCCOROOCRHIC < 250L && this.OIICIHCOORRCCIRRRCRHCHIHHCCRRC()) {
         this.CHIOCIIOCHHCIIHRCIIRHROHCCHHRI.connectToSelected();
      }

      this.HHCOICIORHOCRIROHIRCCOROOCRHIC = Minecraft.getSystemTime();
      return true;
   }

   public void mouseReleased(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void setSelected$v1_8(int var1, int var2, int var3) {
   }

   @Generated
   public HostedWorld CCOOCRHROHIRRCCHORCCRIOOHROHRO() {
      return this.OCHROICCHHCOICOHIIOCRCHRCROORI;
   }
}
