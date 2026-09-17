package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.VarInsnNode;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR HOOCOOIRHCHIICICHOICHCOIRICIHI;
   private final int HORHRIOCOOOORHCRIHHORCRIRCOOCI;
   private final Map<String, AnnotationNode> annotations;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, int var2, List<AnnotationNode> var3) {
      this(var1, var2, new HashMap<>());
      if (var3 != null) {
         for (AnnotationNode var5 : var3) {
            this.annotations.put(var5.desc, var5);
         }
      }
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, int var2, Map<String, AnnotationNode> var3) {
      this.HOOCOOIRHCHIICICHOICHCOIRICIHI = var1;
      this.HORHRIOCOOOORHCRIHHORCRIRCOOCI = var2;
      this.annotations = var3;
   }

   public AbstractInsnNode load() {
      return new VarInsnNode(this.HOOCOOIRHCHIICICHOICHCOIRICIHI.IICRHRIOIROIOHRICHHHHHIHIOOICI().getOpcode(21), this.HORHRIOCOOOORHCRIHHORCRIRCOOCI);
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR ORHOOHRCIHIORCCRCOOOOCIROHRHCO() {
      return this.HOOCOOIRHCHIICICHOICHCOIRICIHI;
   }

   public int index() {
      return this.HORHRIOCOOOORHCRIHHORCRIRCOOCI;
   }

   public Map<String, AnnotationNode> IICOROICCIIHRRIIRORHOOHCCIIIII() {
      return this.annotations;
   }
}
