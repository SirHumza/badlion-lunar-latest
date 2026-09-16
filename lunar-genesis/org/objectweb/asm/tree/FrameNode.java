package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class FrameNode extends AbstractInsnNode {
   public int type;
   public List<Object> local;
   public List<Object> stack;

   private FrameNode() {
      super(-1);
   }

   public FrameNode(int var1, int var2, Object[] var3, int var4, Object[] var5) {
      super(-1);
      this.type = var1;
      switch (var1) {
         case -1:
         case 0:
            this.local = Util.asArrayList(var2, var3);
            this.stack = Util.asArrayList(var4, var5);
            break;
         case 1:
            this.local = Util.asArrayList(var2, var3);
            break;
         case 2:
            this.local = Util.asArrayList(var2);
         case 3:
            break;
         case 4:
            this.stack = Util.asArrayList(1, var5);
            break;
         default:
            throw new IllegalArgumentException();
      }
   }

   @Override
   public int getType() {
      return 14;
   }

   @Override
   public void accept(MethodVisitor var1) {
      switch (this.type) {
         case -1:
         case 0:
            var1.visitFrame(this.type, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
            break;
         case 1:
            var1.visitFrame(this.type, this.local.size(), asArray(this.local), 0, null);
            break;
         case 2:
            var1.visitFrame(this.type, this.local.size(), null, 0, null);
            break;
         case 3:
            var1.visitFrame(this.type, 0, null, 0, null);
            break;
         case 4:
            var1.visitFrame(this.type, 0, null, 1, asArray(this.stack));
            break;
         default:
            throw new IllegalArgumentException();
      }
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      FrameNode var2 = new FrameNode();
      var2.type = this.type;
      if (this.local != null) {
         var2.local = new ArrayList<>();
         int var3 = 0;

         for (int var4 = this.local.size(); var3 < var4; var3++) {
            Object var5 = this.local.get(var3);
            if (var5 instanceof LabelNode) {
               var5 = var1.get(var5);
            }

            var2.local.add(var5);
         }
      }

      if (this.stack != null) {
         var2.stack = new ArrayList<>();
         int var6 = 0;

         for (int var7 = this.stack.size(); var6 < var7; var6++) {
            Object var8 = this.stack.get(var6);
            if (var8 instanceof LabelNode) {
               var8 = var1.get(var8);
            }

            var2.stack.add(var8);
         }
      }

      return var2;
   }

   private static Object[] asArray(List<Object> var0) {
      Object[] var1 = new Object[var0.size()];
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         Object var4 = var0.get(var2);
         if (var4 instanceof LabelNode) {
            var4 = ((LabelNode)var4).getLabel();
         }

         var1[var2] = var4;
      }

      return var1;
   }
}
