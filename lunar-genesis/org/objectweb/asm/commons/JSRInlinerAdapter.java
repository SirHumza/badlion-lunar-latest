package org.objectweb.asm.commons;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

public class JSRInlinerAdapter extends MethodNode implements Opcodes {
   private final BitSet mainSubroutineInsns = new BitSet();
   private final Map<LabelNode, BitSet> subroutinesInsns = new HashMap<>();
   final BitSet sharedSubroutineInsns = new BitSet();

   public JSRInlinerAdapter(MethodVisitor var1, int var2, String var3, String var4, String var5, String[] var6) {
      this(589824, var1, var2, var3, var4, var5, var6);
      if (this.getClass() != JSRInlinerAdapter.class) {
         throw new IllegalStateException();
      }
   }

   protected JSRInlinerAdapter(int var1, MethodVisitor var2, int var3, String var4, String var5, String var6, String[] var7) {
      super(var1, var3, var4, var5, var6, var7);
      this.mv = var2;
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      super.visitJumpInsn(var1, var2);
      LabelNode var3 = ((JumpInsnNode)this.instructions.getLast()).label;
      if (var1 == 168 && !this.subroutinesInsns.containsKey(var3)) {
         this.subroutinesInsns.put(var3, new BitSet());
      }
   }

   @Override
   public void visitEnd() {
      if (!this.subroutinesInsns.isEmpty()) {
         this.findSubroutinesInsns();
         this.emitCode();
      }

      if (this.mv != null) {
         this.accept(this.mv);
      }
   }

   private void findSubroutinesInsns() {
      BitSet var1 = new BitSet();
      this.findSubroutineInsns(0, this.mainSubroutineInsns, var1);

      for (Entry var3 : this.subroutinesInsns.entrySet()) {
         LabelNode var4 = (LabelNode)var3.getKey();
         BitSet var5 = (BitSet)var3.getValue();
         this.findSubroutineInsns(this.instructions.indexOf(var4), var5, var1);
      }
   }

   private void findSubroutineInsns(int var1, BitSet var2, BitSet var3) {
      this.findReachableInsns(var1, var2, var3);

      boolean var4;
      do {
         var4 = false;

         for (TryCatchBlockNode var6 : this.tryCatchBlocks) {
            int var7 = this.instructions.indexOf(var6.handler);
            if (!var2.get(var7)) {
               int var8 = this.instructions.indexOf(var6.start);
               int var9 = this.instructions.indexOf(var6.end);
               int var10 = var2.nextSetBit(var8);
               if (var10 >= var8 && var10 < var9) {
                  this.findReachableInsns(var7, var2, var3);
                  var4 = true;
               }
            }
         }
      } while (var4);
   }

   private void findReachableInsns(int var1, BitSet var2, BitSet var3) {
      for (int var4 = var1; var4 < this.instructions.size(); var4++) {
         if (var2.get(var4)) {
            return;
         }

         var2.set(var4);
         if (var3.get(var4)) {
            this.sharedSubroutineInsns.set(var4);
         }

         var3.set(var4);
         AbstractInsnNode var5 = this.instructions.get(var4);
         if (var5.getType() == 7 && var5.getOpcode() != 168) {
            JumpInsnNode var10 = (JumpInsnNode)var5;
            this.findReachableInsns(this.instructions.indexOf(var10.label), var2, var3);
         } else if (var5.getType() == 11) {
            TableSwitchInsnNode var9 = (TableSwitchInsnNode)var5;
            this.findReachableInsns(this.instructions.indexOf(var9.dflt), var2, var3);

            for (LabelNode var12 : var9.labels) {
               this.findReachableInsns(this.instructions.indexOf(var12), var2, var3);
            }
         } else if (var5.getType() == 12) {
            LookupSwitchInsnNode var6 = (LookupSwitchInsnNode)var5;
            this.findReachableInsns(this.instructions.indexOf(var6.dflt), var2, var3);

            for (LabelNode var8 : var6.labels) {
               this.findReachableInsns(this.instructions.indexOf(var8), var2, var3);
            }
         }

         switch (this.instructions.get(var4).getOpcode()) {
            case 167:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 191:
               return;
            case 168:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
         }
      }
   }

   private void emitCode() {
      LinkedList var1 = new LinkedList();
      var1.add(new JSRInlinerAdapter.Instantiation(null, this.mainSubroutineInsns));
      InsnList var2 = new InsnList();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();

      while (!var1.isEmpty()) {
         JSRInlinerAdapter.Instantiation var5 = (JSRInlinerAdapter.Instantiation)var1.removeFirst();
         this.emitInstantiation(var5, var1, var2, var3, var4);
      }

      this.instructions = var2;
      this.tryCatchBlocks = var3;
      this.localVariables = var4;
   }

   private void emitInstantiation(
      JSRInlinerAdapter.Instantiation var1,
      List<JSRInlinerAdapter.Instantiation> var2,
      InsnList var3,
      List<TryCatchBlockNode> var4,
      List<LocalVariableNode> var5
   ) {
      LabelNode var6 = null;

      for (int var7 = 0; var7 < this.instructions.size(); var7++) {
         AbstractInsnNode var8 = this.instructions.get(var7);
         if (var8.getType() == 8) {
            LabelNode var18 = (LabelNode)var8;
            LabelNode var22 = var1.getClonedLabel(var18);
            if (var22 != var6) {
               var3.add(var22);
               var6 = var22;
            }
         } else if (var1.findOwner(var7) == var1) {
            if (var8.getOpcode() != 169) {
               if (var8.getOpcode() == 168) {
                  LabelNode var17 = ((JumpInsnNode)var8).label;
                  BitSet var21 = this.subroutinesInsns.get(var17);
                  JSRInlinerAdapter.Instantiation var11 = new JSRInlinerAdapter.Instantiation(var1, var21);
                  LabelNode var12 = var11.getClonedLabelForJumpInsn(var17);
                  var3.add(new InsnNode(1));
                  var3.add(new JumpInsnNode(167, var12));
                  var3.add(var11.returnLabel);
                  var2.add(var11);
               } else {
                  var3.add(var8.clone(var1));
               }
            } else {
               LabelNode var9 = null;

               for (JSRInlinerAdapter.Instantiation var10 = var1; var10 != null; var10 = var10.parent) {
                  if (var10.subroutineInsns.get(var7)) {
                     var9 = var10.returnLabel;
                  }
               }

               if (var9 == null) {
                  throw new IllegalArgumentException(stringConcat$0(var7));
               }

               var3.add(new JumpInsnNode(167, var9));
            }
         }
      }

      for (TryCatchBlockNode var15 : this.tryCatchBlocks) {
         LabelNode var19 = var1.getClonedLabel(var15.start);
         LabelNode var23 = var1.getClonedLabel(var15.end);
         if (var19 != var23) {
            LabelNode var25 = var1.getClonedLabelForJumpInsn(var15.handler);
            if (var19 == null || var23 == null || var25 == null) {
               throw new AssertionError("Internal error!");
            }

            var4.add(new TryCatchBlockNode(var19, var23, var25, var15.type));
         }
      }

      for (LocalVariableNode var16 : this.localVariables) {
         LabelNode var20 = var1.getClonedLabel(var16.start);
         LabelNode var24 = var1.getClonedLabel(var16.end);
         if (var20 != var24) {
            var5.add(new LocalVariableNode(var16.name, var16.desc, var16.signature, var20, var24, var16.index));
         }
      }
   }

   private final class Instantiation extends AbstractMap<LabelNode, LabelNode> {
      final JSRInlinerAdapter.Instantiation parent;
      final BitSet subroutineInsns;
      final Map<LabelNode, LabelNode> clonedLabels;
      final LabelNode returnLabel;

      Instantiation(JSRInlinerAdapter.Instantiation var2, BitSet var3) {
         for (JSRInlinerAdapter.Instantiation var4 = var2; var4 != null; var4 = var4.parent) {
            if (var4.subroutineInsns == var3) {
               throw new IllegalArgumentException(stringConcat$0(String.valueOf(var3)));
            }
         }

         this.parent = var2;
         this.subroutineInsns = var3;
         this.returnLabel = var2 == null ? null : new LabelNode();
         this.clonedLabels = new HashMap<>();
         LabelNode var8 = null;

         for (int var5 = 0; var5 < JSRInlinerAdapter.this.instructions.size(); var5++) {
            AbstractInsnNode var6 = JSRInlinerAdapter.this.instructions.get(var5);
            if (var6.getType() == 8) {
               LabelNode var7 = (LabelNode)var6;
               if (var8 == null) {
                  var8 = new LabelNode();
               }

               this.clonedLabels.put(var7, var8);
            } else if (this.findOwner(var5) == this) {
               var8 = null;
            }
         }
      }

      JSRInlinerAdapter.Instantiation findOwner(int var1) {
         if (!this.subroutineInsns.get(var1)) {
            return null;
         }

         if (!JSRInlinerAdapter.this.sharedSubroutineInsns.get(var1)) {
            return this;
         }

         JSRInlinerAdapter.Instantiation var2 = this;

         for (JSRInlinerAdapter.Instantiation var3 = this.parent; var3 != null; var3 = var3.parent) {
            if (var3.subroutineInsns.get(var1)) {
               var2 = var3;
            }
         }

         return var2;
      }

      LabelNode getClonedLabelForJumpInsn(LabelNode var1) {
         return this.findOwner(JSRInlinerAdapter.this.instructions.indexOf(var1)).clonedLabels.get(var1);
      }

      LabelNode getClonedLabel(LabelNode var1) {
         return this.clonedLabels.get(var1);
      }

      @Override
      public Set<Entry<LabelNode, LabelNode>> entrySet() {
         throw new UnsupportedOperationException();
      }

      public LabelNode get(Object var1) {
         return this.getClonedLabelForJumpInsn((LabelNode)var1);
      }

      @Override
      public boolean equals(Object var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public int hashCode() {
         throw new UnsupportedOperationException();
      }
   }
}
