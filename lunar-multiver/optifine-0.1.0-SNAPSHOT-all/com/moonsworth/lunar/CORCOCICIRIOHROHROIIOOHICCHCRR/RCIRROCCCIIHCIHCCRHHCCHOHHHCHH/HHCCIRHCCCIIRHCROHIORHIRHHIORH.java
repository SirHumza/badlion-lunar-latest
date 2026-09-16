package com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.ichor.util.FatalIchorError;
import java.util.HashSet;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.srg.csrg.CSrgReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR[]{com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.POST_OPTIFINE_PATCH};
   }

   @HICHRCOHCCRHOHCICOOCHOIHCCHIRI(CCCIROHORHHCRCCOIRHRRCOIROOCRH = true, optional = true)
   public MappingSet RICRIRRCOHRCOCRRHHCRHRROOIOHHR(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = var1.IHIRRIIORRHORHRORIHOROIRCORCOO();
      MappingSet var3 = (MappingSet)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHIHRHICIORIIHICHIHOCCCHCICCHR,
            CSrgReader::new
         )
         .orElseThrow(() -> new FatalIchorError("Can't find mappings"));
      var2.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
         .ifPresent(var1x -> var1x.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3));
      return var3;
   }

   @CRRRICCRROCOHHOHIICIHORCOORRRH
   public void ORHIOICIOCRRHOOCOHRORIHICHRCRR(ClassNode var1) {
      HashSet var2 = new HashSet(var1.methods.size());

      for (MethodNode var4 : var1.methods) {
         if (!var2.add(var4.name + var4.desc)) {
            throw new FatalIchorError("Class " + var1.name + " has duplicate methods: " + var4.name + var4.desc);
         }
      }
   }
}
