package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.client.util.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.ichor.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RICRIRRCOHRCOCRRHHCRHRROOIOHHR {
   private static final String RCRIORCRROOIRRROORHCOIHIRCHOHC = Type.getInternalName(IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.class);

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      super(new String[]{"net/minecraft/client/"});
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FINAL
      };
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(ClassNode var1, MethodNode var2) {
      InsnList var3 = var2.instructions;

      for (AbstractInsnNode var5 : var3) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var5);
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var5);
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InsnList var0, AbstractInsnNode var1) {
      if (var1 instanceof MethodInsnNode var2 && var2.owner.equals("java/lang/Math") && var2.name.equals("random") && var2.desc.equals("()D")) {
         MethodInsnNode var3 = new MethodInsnNode(184, "java/util/concurrent/ThreadLocalRandom", "current", "()Ljava/util/concurrent/ThreadLocalRandom;");
         var0.insertBefore(var2, var3);
         var2.setOpcode(182);
         var2.owner = "java/util/concurrent/ThreadLocalRandom";
         var2.name = "nextDouble";
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(InsnList var0, AbstractInsnNode var1) {
      if (var1 instanceof TypeInsnNode var2
         && var2.getOpcode() == 187
         && var2.desc.equals("java/util/Random")
         && var0.get(var0.indexOf(var1) + 2) instanceof MethodInsnNode var4
         && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4)) {
         var2.desc = RCRIORCRROOIRRROORHCOIHIRCHOHC;
         var4.owner = RCRIORCRROOIRRROORHCOIHIRCHOHC;
      }
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MethodInsnNode var0) {
      return var0.getOpcode() == 183 && var0.owner.equals("java/util/Random") && var0.name.equals("<init>") && var0.desc.equals("()V");
   }
}
