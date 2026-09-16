package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;
import org.cadixdev.bombe.provider.ClassProvider;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public record RRCRRCORICCHOHHIRCHIROOHIIOHCO()
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR OCICOIOIIROOCCCHCCCIIROIHCHCHC;
   private final List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HRCHICHOOIIOOOOICROICHIOCIIOOR;
   private final ClassProvider CCRIIHCIOCOROCCOHHHCOIOCOOHIHC;
   private static final String HCIORIRCICCRRCCOIOORIOIHRIICRR = Type.getInternalName(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
   );
   private static volatile Map<String, List<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> HCIIHOIHIIIOHRHCHOCROIIICICIRI = null;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2,
      ClassProvider var3
   ) {
      this.OCICOIOIIROOCCCHCCCIIROIHCHCHC = var1;
      this.HRCHICHOOIIOOOOICROICHIOCIIOOR = var2;
      this.CCRIIHCIOCOROCCOHHHCOIOCOOHIHC = var3;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Queue<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2,
      Stack<com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var3,
      InsnList var4
   ) {
      this.HCOICRCCRIIHCIHCORRHCORHRROHIR();
      if (this.HRCHICHOOIIOOOOICROICHIOCIIOOR.size() <= 1) {
         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15 : this.HRCHICHOOIIOOOOICROICHIOCIIOOR) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15);
         }
      } else {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 : this.HRCHICHOOIIOOOOICROICHIOCIIOOR) {
            InsnList var9 = new InsnList();
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var9);
            var5.add(var9);
            var6.add((com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var3.pop());
         }

         label47:
         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 : HCIIHOIHIIIOHRHCHOCROIIICICIRI.get(
            this.OCICOIOIIROOCCCHCCCIIROIHCHCHC.toString()
         )) {
            ArrayList var18 = new ArrayList();
            int var10 = 0;

            for (com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var12 : var17.COHRICOCOHIIRICOHIOOHHCCRROCCI()
               .RIOHRHOOCCORHCCCROOCHIRCHRIROI()) {
               InsnList var13 = new InsnList();
               if (!var1.ROIHCRCOHHRHRROCIIHIHIORCIHIOH()
                  .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                     (com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var6.get(var10), var12, var13
                  )) {
                  continue label47;
               }

               var18.add(var13);
               var10++;
            }

            for (int var19 = 0; var19 < this.HRCHICHOOIIOOOOICROICHIOCIIOOR.size(); var19++) {
               var4.add((InsnList)var5.get(var19));
               var4.add((InsnList)var18.get(var19));
            }

            var4.add(new MethodInsnNode(184, HCIORIRCICCRRCCOIOORIOIHRIICRR, var17.name(), var17.COHRICOCOHIIRICOHIOOHHCCRROCCI().getDescriptor(), false));
            var3.push(this.OCICOIOIIROOCCCHCCCIIROIHCHCHC);
            return;
         }

         throw new NoSuchElementException("Could not find a valid grouping to convert from %s to %s!".formatted(var6, this.OCICOIOIIROOCCCHCCCIIROIHCHCHC));
      }
   }

   private void HCOICRCCRIIHCIHCORRHCORHRROHIR() {
      if (HCIIHOIHIIIOHRHCHOCROIIICICIRI == null) {
         synchronized (RRCRRCORICCHOHHIRCHIROOHIIOHCO.class) {
            if (HCIIHOIHIIIOHRHCHOCROIIICICIRI == null) {
               HashMap var2 = new HashMap();
               ClassNode var3 = this.CCRIIHCIOCOROCCOHHHCOIOCOOHIHC.getAsNode(HCIORIRCICCRRCCOIOORIOIHRIICRR, 1);

               for (MethodNode var5 : var3.methods) {
                  if (com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.isStatic(var5.access) && Type.getReturnType(var5.desc) != Type.VOID_TYPE) {
                     com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var6 = com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        Objects.requireNonNullElse(var5.signature, var5.desc), var3.signature, null
                     );
                     String var7 = var6.HCHIIOHRCHCCHOIOHICRROIHIRHIHR().toString();
                     var2.compute(
                        var7,
                        (var2x, var3x) -> {
                           if (var3x == null) {
                              var3x = new ArrayList();
                              var3x.add(new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.name, var6));
                           } else {
                              for (RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5x : var3x) {
                                 if (var5x.COHRICOCOHIIRICOHIOOHHCCRROCCI().RIOHRHOOCCORHCCCROOCHIRCHRIROI().equals(var6.RIOHRHOOCCORHCCCROOCHIRCHRIROI())) {
                                    throw new IllegalStateException(
                                       String.format(
                                          "Both %s and %s in GroupingUtil share the signature %s. Ensure only one method exists per signature!",
                                          var5x.RCRIICIORIOIRIIIOHCHOCHOIOCCHI,
                                          var5.name,
                                          var6
                                       )
                                    );
                                 }
                              }
                           }

                           return (List)var3x;
                        }
                     );
                  }
               }

               HCIIHOIHIIIOHRHCHOCROIIICICIRI = var2;
            }
         }
      }
   }

   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR RHHIRORIIHOHRHIRHOHICHIIOCHCOR() {
      return this.OCICOIOIIROOCCCHCCCIIROIHCHCHC;
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHHOHCRIHHOOICHHHHIHRHRCCCHHHC() {
      return this.HRCHICHOOIIOOOOICROICHIOCIIOOR;
   }

   public ClassProvider OICROOOICOOHCIIHHOCRRRIRIHHIIH() {
      return this.CCRIIHCIOCOROCCOHHHCOIOCOOHIHC;
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String RCRIICIORIOIRIIIOHCHOCHOIOCCHI;
      private final com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RRRHOHIIOOHCRHCHIROHICCROCICHC;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2) {
         this.RCRIICIORIOIRIIIOHCHOCHOIOCCHI = var1;
         this.RRRHOHIIOOHCRHCHIROHICCROCICHC = var2;
      }

      public String name() {
         return this.RCRIICIORIOIRIIIOHCHOCHOIOCCHI;
      }

      public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI COHRICOCOHIIRICOHIOOHHCCRROCCI() {
         return this.RRRHOHIIOOHCRHCHIROHICCROCICHC;
      }
   }
}
