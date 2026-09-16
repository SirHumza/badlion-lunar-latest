package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.reflect.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      Method var3
   ) {
      super(var1, var2, var3);
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      ClassNode var2 = var1.HIHHOCRHHRORRHHRORRRIIHHORIHOC(this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass());
      boolean var3 = false;

      for (FieldNode var5 : var2.fields) {
         var3 |= this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.value(), var5.name, var2, var5);
      }

      return var3;
   }
}
