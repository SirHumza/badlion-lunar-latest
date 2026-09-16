package com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.objectweb.asm.Handle;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final String CCCIIOROCHHIHCOHORIRROIOOROIOR = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getName().replace('.', '/');

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.POST_REMAP
      };
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, MethodNode var2) {
      for (AbstractInsnNode var4 : var2.instructions) {
         if (var4 instanceof MethodInsnNode var10) {
            if (var10.getOpcode() == 182 && var10.owner.equals("java/lang/Class") && var10.name.equals("isRecord") && var10.desc.equals("()Z")) {
               var10.setOpcode(184);
               var10.owner = this.CCCIIOROCHHIHCOHORIRROIOOROIOR;
               var10.name = "isRecordLazy";
               var10.desc = "(Ljava/lang/Class;)Z";
            }
         } else if (var4 instanceof InvokeDynamicInsnNode var5) {
            int var6 = 0;

            for (int var7 = var5.bsmArgs.length; var6 < var7; var6++) {
               if (var5.bsmArgs[var6] instanceof Handle var9
                  && var9.getTag() == 5
                  && var9.getOwner().equals("java/lang/Class")
                  && var9.getName().equals("isRecord")
                  && var9.getDesc().equals("()Z")) {
                  var5.bsmArgs[var6] = new Handle(6, this.CCCIIOROCHHIHCOHORIRROIOOROIOR, "isRecordLazy", "(Ljava/lang/Class;)Z", false);
               }
            }
         }
      }
   }
}
