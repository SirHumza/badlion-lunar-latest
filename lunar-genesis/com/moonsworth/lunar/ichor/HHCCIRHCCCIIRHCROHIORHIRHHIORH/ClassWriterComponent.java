package com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import org.objectweb.asm.ClassWriter;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ClassWriter {
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO OCCRICHRHOCROORRHCHIOHHIIOHRIO;
   private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCCIOHORRIRICOOOCRIHRIOHROCHRC;
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROCCIOHOIORHORCIOOCIIHOIOHOIOC;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO var2, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3) {
      super(var1);
      this.OCCRICHRHOCROORRHCHIOHHIIOHRIO = var2;
      this.HCCIOHORRIRICOOOCRIHRIOHROCHRC = var3;
      this.ROCCIOHOIORHORCIOOCIIHOIOHOIOC = new com.moonsworth.lunar.ichor.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2, var3
      );
   }

   @Override
   protected String getCommonSuperClass(String var1, String var2) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.ROCCIOHOIORHORCIOOCIIHOIOHOIOC.provide(var1);
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.ROCCIOHOIORHORCIOOCIIHOIOHOIOC.provide(var2);
      if (var3 == null || var4 == null) {
         return "java/lang/Object";
      }

      if (var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4)) {
         return var3.name();
      }

      if (var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)) {
         return var4.name();
      }

      if (var3.IRCHCICORRHHCROOROORHRHCOCIIHC() != null && var4.IRCHCICORRHHCROOROORHRHCOCIIHC() != null) {
         do {
            var3 = var3.IRCHCICORRHHCROOROORHRHCOCIIHC();
         } while (!var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4));

         return var3.name();
      } else {
         return "java/lang/Object";
      }
   }
}
