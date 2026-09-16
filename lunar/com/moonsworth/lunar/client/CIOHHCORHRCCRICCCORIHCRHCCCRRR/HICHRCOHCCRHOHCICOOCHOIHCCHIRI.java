package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INIT
      };
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return var1.className().startsWith("com/moonsworth/");
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(ClassNode var1, MethodNode var2) {
      for (AbstractInsnNode var6 : var2.instructions.toArray()) {
         if (var6 instanceof MethodInsnNode var7 && var7.owner.startsWith("org/lwjgl/opengl/GL")) {
            InsnList var8 = new InsnList();
            Type[] var9 = Type.getArgumentTypes(var7.desc);

            for (Type var13 : var9) {
               if (var13 != Type.LONG_TYPE && var13 != Type.DOUBLE_TYPE) {
                  var8.add(new InsnNode(87));
               } else {
                  var8.add(new InsnNode(88));
               }
            }

            TypeInsnNode var14 = new TypeInsnNode(187, "java/lang/RuntimeException");
            var8.add(var14);
            var8.add(new InsnNode(89));
            var8.add(new LdcInsnNode("Tried to use an opengl function despite no opengl context present!"));
            var8.add(new MethodInsnNode(183, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false));
            var8.add(new InsnNode(191));
            var2.instructions.insert(var6, var8);
            var2.instructions.remove(var6);
         }
      }
   }
}
