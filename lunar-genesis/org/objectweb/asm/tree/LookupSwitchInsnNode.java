package org.objectweb.asm.tree;

import java.util.List;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class LookupSwitchInsnNode extends AbstractInsnNode {
   public LabelNode dflt;
   public List<Integer> keys;
   public List<LabelNode> labels;

   public LookupSwitchInsnNode(LabelNode var1, int[] var2, LabelNode[] var3) {
      super(171);
      this.dflt = var1;
      this.keys = Util.asArrayList(var2);
      this.labels = Util.asArrayList(var3);
   }

   @Override
   public int getType() {
      return 12;
   }

   @Override
   public void accept(MethodVisitor var1) {
      int[] var2 = new int[this.keys.size()];
      int var3 = 0;

      for (int var4 = var2.length; var3 < var4; var3++) {
         var2[var3] = this.keys.get(var3);
      }

      Label[] var6 = new Label[this.labels.size()];
      int var7 = 0;

      for (int var5 = var6.length; var7 < var5; var7++) {
         var6[var7] = this.labels.get(var7).getLabel();
      }

      var1.visitLookupSwitchInsn(this.dflt.getLabel(), var2, var6);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      LookupSwitchInsnNode var2 = new LookupSwitchInsnNode(clone(this.dflt, var1), null, clone(this.labels, var1));
      var2.keys.addAll(this.keys);
      return var2.cloneAnnotations(this);
   }
}
