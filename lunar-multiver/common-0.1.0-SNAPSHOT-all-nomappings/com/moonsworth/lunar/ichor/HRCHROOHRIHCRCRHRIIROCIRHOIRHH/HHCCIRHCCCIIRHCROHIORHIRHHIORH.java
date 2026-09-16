package com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import java.util.List;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.SimpleRemapper;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InnerClassNode;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final CRRRICCRROCOHHOHIICIHORCOORRRH CHROCRHRHCORIRCHICIHHOHORCHRHC;
   private final Remapper IHRCOHRRRCOCCCRIHIIRICOHHHCCCO;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.CHROCRHRHCORIRCHICIHHOHORCHRHC = var1;
      this.IHRCOHRRRCOCCCRIHIIRICOHHHCCCO = new SimpleRemapper(var1.HHICCHOHIIHHICROIHOIOHHIHHRRII());
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR[]{com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INIT};
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   public void CIOHHCORHRCCRICCCORIHCRHCCCRRR(ClassNode var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2.IHIRRIIORRHORHRORIHOROIRCORCOO(), var1, this.IHRCOHRRRCOCCCRIHIIRICOHHHCCCO
      );
      List var3 = this.CHROCRHRHCORIRCHICIHHOHORCHRHC.HHHOCRICHHHRROOCOHIOCCHRRRCHCC().get(var1.name);
      if (var3 != null) {
         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var3) {
            if (var1.name.equals(var5.CCRIRCCRHHCICOHRIHOIIRORCHIOOI())) {
               var1.name = var5.HRRHHIOHRORCCOCHICROIIORHHCCIR();
               var1.outerClass = var5.IRHCROCOHCCOHHCHOOCRCIOCRHORRH();
               var1.outerMethod = var5.CROIIROHIOCRORHHORCHCIIROROHOR();
               var1.outerMethodDesc = var5.HRIICHOIRHCOCHCIRRCRRHCRHIOHHO();
               var1.access = var5.CRRHHCOICIHCHCCRCHHRCOHOHRIHRO();
            } else if (var1.name.equals(var5.IRHCROCOHCCOHHCHOOCRCIOCRHORRH())) {
               var1.innerClasses
                  .add(
                     new InnerClassNode(
                        var5.IRHCROCOHCCOHHCHOOCRCIOCRHORRH() + "$" + var5.COCCICIOIHORCCCCHHOHRICIRCHIIC(),
                        var5.IRHCROCOHCCOHHCHOOCRCIOCRHORRH(),
                        var5.COCCICIOIHORCCCCHHOHRICIRCHIIC(),
                        var5.CRRHHCOICIHCHCCRCHHRCOHOHRIHRO()
                     )
                  );
            }
         }
      }
   }

   @HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   public com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCCIIIOHHOOOHIROHOHCIHCOIHRIIR() {
      return this.CHROCRHRHCORIRCHICIHHOHORCHRHC;
   }
}
