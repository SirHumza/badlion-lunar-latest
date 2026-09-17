package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.reflect.Method;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      Method var3
   ) {
      super(var1, var2, var3);
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      ClassNode var2 = var1.HIHHOCRHHRORRHHRORRRIIHHORIHOC(this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass());
      boolean var3 = false;

      for (AnnotationNode var5 : var2.visibleAnnotations) {
         var3 |= this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.value(), var5.desc, var2, var5);
      }

      return var3;
   }
}
