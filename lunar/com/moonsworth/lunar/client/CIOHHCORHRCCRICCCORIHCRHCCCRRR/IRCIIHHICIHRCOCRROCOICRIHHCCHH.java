package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.ichor.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import java.util.ArrayList;
import java.util.HashSet;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends IHIRRIIORRHORHRORIHOROIRCORCOO {
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      super("net.minecraft.*|com.mojang.*|[^\\/]+");
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRE_META_MIXIN
      };
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(ClassNode var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      if (!com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO(var1)
         && (var1.access & 1024) == 0
         && !com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1)) {
         HashSet var3 = new HashSet();
         ArrayList var4 = new ArrayList();

         for (MethodNode var6 : var1.methods) {
            if (var6.name.equals("newInstance")) {
               var3.add(this.RICOIHCRHHHOCROOCHRROIICRROIIH(var6.desc));
            } else if (var6.name.equals("<init>")) {
               var4.add(var6);
            }
         }

         for (MethodNode var8 : var4) {
            if (!var3.contains(this.RICOIHCRHHHOCROOCHRROIICRROIIH(var8.desc))) {
               var1.methods.add(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var1));
            }
         }
      }
   }

   private MethodNode RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final MethodNode var1, final ClassNode var2) {
      final Type[] var3 = Type.getArgumentTypes(var1.desc);
      MethodNode var4 = new MethodNode(9, "newInstance", Type.getMethodDescriptor(Type.getObjectType(var2.name), var3), null, null);
      var4.instructions = new InsnList() {
         {
            this.add(new TypeInsnNode(187, var2.name));
            this.add(new InsnNode(89));
            int var5 = 0;

            for (Type var9 : var3) {
               this.add(new VarInsnNode(var9.getOpcode(21), var5));
               var5 += var9.getSize();
            }

            this.add(new MethodInsnNode(183, var2.name, "<init>", var1.desc, false));
            this.add(new InsnNode(176));
         }
      };
      return var4;
   }

   private String RICOIHCRHHHOCROOCHRROIICRROIIH(String var1) {
      return var1.substring(0, var1.lastIndexOf(41) + 1);
   }
}
