package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IROCHOHCORHCOCCCOCHORCICRORIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC;

   @Nullable
   @Override
   public Integer RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable Component var1, @Nullable Component var2) {
      if (this.ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC.isEnabled()
         && this.ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC.ORHRCOIICOCHRIOHRRHOOOHOHORRCI().get()
         && this.ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC.CIHHROOIIRHRIIOIOORIICRCHCRRCI()) {
         if (var1 != null) {
            String var3 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var1)
            );
            if (var3.startsWith("TRAP TRIGGERED!") || var3.startsWith("ALARM!!!")) {
               return this.ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC.HOHORIHCIHIOOIORHHIHHHOROCOCIR().CHRHCORIRCORHHIIROCRORHIROICOC();
            }
         }

         if (var2 != null) {
            String var4 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var2)
            );
            if (var4.startsWith("Your") && var4.endsWith("Trap has been set off!") || var4.startsWith("Reveal trap set off by")) {
               return this.ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC.ROORCICOORIIOIHHIHOHHRIICCIHRI().CHRHCORIRCORHHIIROCRORHIROICOC();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.ICCOHHIIIHOCOHHCRHOIIHHCCOCCOC = var1;
   }
}
