package org.spongepowered.asm.mixin.transformer.struct;

import java.util.ArrayDeque;
import java.util.Deque;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;

public class InsnRange {
   public final int start;
   public final int end;
   public final int marker;

   public InsnRange(int var1, int var2, int var3) {
      this.start = var1;
      this.end = var2;
      this.marker = var3;
   }

   public boolean isValid() {
      return this.start != 0 && this.end != 0 && this.end >= this.start;
   }

   public boolean contains(int var1) {
      return var1 >= this.start && var1 <= this.end;
   }

   public boolean excludes(int var1) {
      return var1 < this.start || var1 > this.end;
   }

   @Override
   public String toString() {
      return String.format("Range[%d-%d,%d,valid=%s)", this.start, this.end, this.marker, this.isValid());
   }

   public Deque<AbstractInsnNode> apply(InsnList var1, boolean var2) {
      ArrayDeque var3 = new ArrayDeque();
      int var4 = 0;
      boolean var5 = false;
      short var6 = -1;
      LabelNode var7 = null;

      for (AbstractInsnNode var9 : var1) {
         if (var9 instanceof LineNumberNode) {
            var4 = ((LineNumberNode)var9).line;
            AbstractInsnNode var10 = var1.get(var1.indexOf(var9) + 1);
            if (var4 == this.end && var10.getOpcode() != 177) {
               var5 = !var2;
               var6 = 177;
            } else {
               var5 = var2 ? this.contains(var4) : this.excludes(var4);
               var6 = -1;
            }
         } else if (var5) {
            if (var7 != null) {
               var3.add(var7);
               var7 = null;
            }

            if (var9 instanceof LabelNode) {
               var7 = (LabelNode)var9;
            } else {
               int var12 = var9.getOpcode();
               if (var12 == var6) {
                  var6 = -1;
               } else {
                  var3.add(var9);
               }
            }
         }
      }

      return var3;
   }
}
