package com.moonsworth.lunar.client.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.ichor.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.SimpleRemapper;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends RICRIRRCOHRCOCRRHHCRHRROOIOHHR {
   private static final String HOHHOHOOOIRCIHCICCRCCIICICHIRC = Type.getInternalName(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class);
   private final Map<String, String> RROORIIRICOHOIIHHRHHCCHCRRCOCR = new HashMap<>();
   private final Remapper IRIHHCHHHHHRICCRCOOCOHCORIRIRR;

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      super(new String[]{"org/lwjgl/nanovg/", "org/lwjgl/util/tinyfd/", "org/lwjgl/stb/", "org/lwjgl/system/", "org/lwjgl/util/opus/"});
      this.RROORIIRICOHOIIHHRHHCCHCRRCOCR.put("org/lwjgl/BufferUtils", "org/lwjgl/actually3/BufferUtils");
      this.RROORIIRICOHOIIHHRHHCCHCRRCOCR.put("org/lwjgl/PointerBuffer", "org/lwjgl/actually3/PointerBuffer");
      this.RROORIIRICOHOIIHHRHHCCHCRRCOCR.put("org/lwjgl/CLongBuffer", "org/lwjgl/actually3/CLongBuffer");
      this.IRIHHCHHHHHRICCRCOOCOHCORIRIRR = new SimpleRemapper(this.RROORIIRICOHOIIHHRHHCCHCRRCOCR);
   }

   public com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR[]{
         com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.POST_MIXIN
      };
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(ClassNode var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      if (!this.RROORIIRICOHOIIHHRHHCCHCRRCOCR.containsKey(var1.name)) {
         com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2.IHIRRIIORRHORHRORIHOROIRCORCOO(), var1, this.IRIHHCHHHHHRICCRCOOCOHCORIRIRR
         );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(ClassNode var1, MethodNode var2) {
      if (var1.name.equals("org/lwjgl/nanovg/NanoVGGLConfig") && var2.name.equals("configGL")) {
         InsnList var3 = new InsnList();
         var3.add(new VarInsnNode(22, 0));
         var3.add(new MethodInsnNode(184, HOHHOHOOOIRCIHCICCRCCIICICHIRC, "newFunctionProvider", "()Ljava/lang/Object;", false));
         var3.add(new TypeInsnNode(192, "org/lwjgl/system/FunctionProvider"));
         var3.add(new MethodInsnNode(184, "org/lwjgl/nanovg/NanoVGGLConfig", "config", "(JLorg/lwjgl/system/FunctionProvider;)V", false));
         var3.add(new InsnNode(177));
         var2.instructions.clear();
         var2.instructions.insert(var3);
      }
   }
}
