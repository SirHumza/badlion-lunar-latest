package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Comparator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

public class TryCatchBlockSorter extends MethodNode {
   public TryCatchBlockSorter(MethodVisitor var1, int var2, String var3, String var4, String var5, String[] var6) {
      this(589824, var1, var2, var3, var4, var5, var6);
      if (this.getClass() != TryCatchBlockSorter.class) {
         throw new IllegalStateException();
      }
   }

   protected TryCatchBlockSorter(int var1, MethodVisitor var2, int var3, String var4, String var5, String var6, String[] var7) {
      super(var1, var3, var4, var5, var6, var7);
      this.mv = var2;
   }

   @Override
   public void visitEnd() {
      Collections.sort(this.tryCatchBlocks, new Comparator<TryCatchBlockNode>() {
         public int compare(TryCatchBlockNode var1, TryCatchBlockNode var2) {
            return this.blockLength(var1) - this.blockLength(var2);
         }

         private int blockLength(TryCatchBlockNode var1) {
            int var2 = TryCatchBlockSorter.this.instructions.indexOf(var1.start);
            int var3 = TryCatchBlockSorter.this.instructions.indexOf(var1.end);
            return var3 - var2;
         }
      });

      for (int var1 = 0; var1 < this.tryCatchBlocks.size(); var1++) {
         this.tryCatchBlocks.get(var1).updateIndex(var1);
      }

      if (this.mv != null) {
         this.accept(this.mv);
      }
   }
}
