package com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final String IICROOHICHCROIICHCHCOHHIRRRRRH = "net/fabricmc/loader/FabricLoader";
   public static final String OHIOHHCORHRIORHHOOIIIIHRHHIHRC = "net/fabricmc/loader/impl/FabricLoaderImpl";
   public static final String HCCHHOHRRCHHORCHCOCCIOOCOICHHR = "net/fabricmc/loader/impl/discovery/ModCandidateImpl";
   public static final String HHIORCIIIIOHOCCOIIHOOCHRROORRH = "net/fabricmc/loader/impl/discovery/ModCandidateFinder";
   public static final String IHRHOIRHIOOORIICIIRHRHRIIOIHRI = "net/fabricmc/loader/impl/game/patch/GamePatch";

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      String var2 = var1.className();
      return var2.equals("net/fabricmc/loader/FabricLoader")
         || var2.equals("net/fabricmc/loader/impl/FabricLoaderImpl")
         || var2.equals("net/fabricmc/loader/impl/discovery/ModCandidateImpl")
         || var2.equals("net/fabricmc/loader/impl/discovery/ModCandidateFinder")
         || var2.equals("net/fabricmc/loader/impl/game/patch/GamePatch");
   }

   @Override
   public CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR[]{HHCCIRHCCCIIRHCROHIORHIRHHIORH.FABRIC_LOADER};
   }

   @CRRRICCRROCOHHOHIICIHORCOORRRH
   public void IIRHCHHOICHRICOOCRORCCIOOIHOIR(ClassNode var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      boolean var3 = var1.name.equals("net/fabricmc/loader/impl/game/patch/GamePatch");
      var1.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1.access, true);

      for (MethodNode var5 : var1.methods) {
         if (var3 || var5.name.startsWith("<init>") || var5.name.startsWith("createBuiltin")) {
            var5.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var5.access, true);
         }
      }

      for (FieldNode var7 : var1.fields) {
         if (var7.name.equals("INSTANCE")) {
            var7.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var7.access, true);
         }
      }
   }
}
