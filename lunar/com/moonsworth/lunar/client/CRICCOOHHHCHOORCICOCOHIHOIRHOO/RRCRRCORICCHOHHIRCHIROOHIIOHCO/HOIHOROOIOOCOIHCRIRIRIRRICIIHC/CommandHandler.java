package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;

import com.google.common.collect.ImmutableList;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.List;
import java.util.Locale;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHOCRIRCCCORHICOCICRIOHCHIOIHH;
   private String key;
   private boolean disabled;
   private String name;
   private String IOIICCCRCIHOIRCHHCIRRHCIIRRHOI;
   private String command;
   private List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OROOOHOHROIROHHCOHIHHIRRIHICHC = ImmutableList.of();

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RROIHRRCHOHRIHOIOHORRRORHCOOHR() {
      String var1 = this.IOIICCCRCIHOIRCHHCIRRHCIIRRHOI != null && !this.IOIICCCRCIHOIRCHHCIRRHCIIRRHOI.isEmpty()
         ? this.IOIICCCRCIHOIRCHHCIRRHCIIRRHOI.toLowerCase(Locale.ROOT)
         : "unknown";
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "icons/hypixel/" + var1 + ".webp");
   }

   public String OIHHRHCRRHHICOIHIIHHIICIHIRCCI() {
      String var1 = this.OHOCRIRCCCORHICOCICRIOHCHIOIHH == null ? "/l " : "/play ";
      return this.command != null && !this.command.isEmpty() ? this.command : var1 + this.key.toLowerCase(Locale.ROOT);
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CICRRIRRCCHIIHOORRROOIHIIROIRR() {
      return this.OHOCRIRCCCORHICOCICRIOHCHIOIHH;
   }

   @Generated
   public String getKey() {
      return this.key;
   }

   @Generated
   public boolean isDisabled() {
      return this.disabled;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String getIcon() {
      return this.IOIICCCRCIHOIRCHHCIRRHCIIRRHOI;
   }

   @Generated
   public String getCommand() {
      return this.command;
   }

   @Generated
   public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OOROHHOIIHIHCCIIROIOOCCRRHCIHC() {
      return this.OROOOHOHROIROHHCOHIHHIRRIHICHC;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.OHOCRIRCCCORHICOCICRIOHCHIOIHH = var1;
   }

   @Generated
   public void HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(String var1) {
      this.key = var1;
   }

   @Generated
   public void OHRRIORRCRIRORHRIOOCORIIRRRRRO(boolean var1) {
      this.disabled = var1;
   }

   @Generated
   public void setName(String var1) {
      this.name = var1;
   }

   @Generated
   public void RHIHOOOHCIRRIOCRRRHRIHIORICOHI(String var1) {
      this.IOIICCCRCIHOIRCHHCIRRHCIIRRHOI = var1;
   }

   @Generated
   public void RHOIRCHRIHOORCICHIRHCORCIORRRR(String var1) {
      this.command = var1;
   }

   @Generated
   public void RCCCROCHCICCROHCOCCRRROCIIHCCH(List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
      this.OROOOHOHROIROHHCOHIHHIRRIHICHC = var1;
   }

   @Generated
   @Override
   public String toString() {
      return "HypixelGame(parent="
         + this.CICRRIRRCCHIIHOORRROOIHIIROIRR()
         + ", key="
         + this.getKey()
         + ", disabled="
         + this.isDisabled()
         + ", name="
         + this.getName()
         + ", icon="
         + this.getIcon()
         + ", command="
         + this.getCommand()
         + ", modes="
         + this.OOROHHOIIHIHCCIIROIOOCCRRHCIHC()
         + ")";
   }
}
