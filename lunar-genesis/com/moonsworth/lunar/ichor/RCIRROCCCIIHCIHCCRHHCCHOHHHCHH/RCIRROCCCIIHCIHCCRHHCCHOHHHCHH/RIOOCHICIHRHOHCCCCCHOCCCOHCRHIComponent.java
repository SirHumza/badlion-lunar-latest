package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.lang.reflect.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<CRICCOOHHHCHOORCICOCOHIHOIRHOO> {
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRICCOOHHHCHOORCICOCOHIHOIRHOO var1, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2, Method var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      ClassNode var2 = var1.HIHHOCRHHRORRHHRORRRIIHHORIHOC(this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass());
      boolean var3 = false;

      for (MethodNode var5 : var2.methods) {
         var3 |= this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.value(), var5.name, var2, var5);
      }

      return var3;
   }
}
