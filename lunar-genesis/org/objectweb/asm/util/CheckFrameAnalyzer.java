package org.objectweb.asm.util;

import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.Interpreter;
import org.objectweb.asm.tree.analysis.Value;

class CheckFrameAnalyzer<V extends Value> extends Analyzer<V> {
   private final Interpreter<V> interpreter;
   private InsnList insnList;
   private int currentLocals;

   CheckFrameAnalyzer(Interpreter<V> var1) {
      super(var1);
      this.interpreter = var1;
   }

   @Override
   protected void init(String var1, MethodNode var2) {
      this.insnList = var2.instructions;
      this.currentLocals = Type.getArgumentsAndReturnSizes(var2.desc) >> 2;
      if ((var2.access & 8) != 0) {
         this.currentLocals--;
      }

      Frame[] var3 = this.getFrames();
      Frame var4 = this.newFrame(var3[0]);
      this.expandFrames(var1, var2, var4);

      for (int var5 = 0; var5 < this.insnList.size(); var5++) {
         Frame var6 = var3[var5];
         AbstractInsnNode var7 = null;

         try {
            var7 = var2.instructions.get(var5);
            int var8 = var7.getOpcode();
            int var9 = var7.getType();
            if (var9 != 8 && var9 != 15 && var9 != 14) {
               var4.init(var6).execute(var7, this.interpreter);
               if (var7 instanceof JumpInsnNode) {
                  if (var8 == 168) {
                     throw new AnalyzerException(var7, "JSR instructions are unsupported");
                  }

                  JumpInsnNode var18 = (JumpInsnNode)var7;
                  int var23 = this.insnList.indexOf(var18.label);
                  this.checkFrame(var23, var4, true);
                  if (var8 == 167) {
                     this.endControlFlow(var5);
                  } else {
                     this.checkFrame(var5 + 1, var4, false);
                  }
               } else if (var7 instanceof LookupSwitchInsnNode) {
                  LookupSwitchInsnNode var17 = (LookupSwitchInsnNode)var7;
                  int var21 = this.insnList.indexOf(var17.dflt);
                  this.checkFrame(var21, var4, true);

                  for (LabelNode var27 : var17.labels) {
                     var21 = this.insnList.indexOf(var27);
                     var4.initJumpTarget(var8, var27);
                     this.checkFrame(var21, var4, true);
                  }

                  this.endControlFlow(var5);
               } else if (var7 instanceof TableSwitchInsnNode) {
                  TableSwitchInsnNode var10 = (TableSwitchInsnNode)var7;
                  int var11 = this.insnList.indexOf(var10.dflt);
                  var4.initJumpTarget(var8, var10.dflt);
                  this.checkFrame(var11, var4, true);
                  this.newControlFlowEdge(var5, var11);

                  for (LabelNode var13 : var10.labels) {
                     var4.initJumpTarget(var8, var13);
                     var11 = this.insnList.indexOf(var13);
                     this.checkFrame(var11, var4, true);
                  }

                  this.endControlFlow(var5);
               } else {
                  if (var8 == 169) {
                     throw new AnalyzerException(var7, "RET instructions are unsupported");
                  }

                  if (var8 == 191 || var8 >= 172 && var8 <= 177) {
                     this.endControlFlow(var5);
                  } else {
                     this.checkFrame(var5 + 1, var4, false);
                  }
               }
            } else {
               this.checkFrame(var5 + 1, var6, false);
            }

            List var19 = this.getHandlers(var5);
            if (var19 != null) {
               for (TryCatchBlockNode var26 : var19) {
                  Type var28;
                  if (var26.type == null) {
                     var28 = Type.getObjectType("java/lang/Throwable");
                  } else {
                     var28 = Type.getObjectType(var26.type);
                  }

                  Frame var14 = this.newFrame(var6);
                  var14.clearStack();
                  var14.push(this.interpreter.newExceptionValue(var26, var14, var28));
                  this.checkFrame(this.insnList.indexOf(var26.handler), var14, true);
               }
            }

            if (!this.hasNextJvmInsnOrFrame(var5)) {
               break;
            }
         } catch (AnalyzerException var15) {
            throw new AnalyzerException(var15.node, stringConcat$0(var5, var15.getMessage()), var15);
         } catch (RuntimeException var16) {
            throw new AnalyzerException(var7, stringConcat$1(var5, var16.getMessage()), var16);
         }
      }
   }

   private void expandFrames(String var1, MethodNode var2, Frame<V> var3) {
      int var4 = -1;
      Frame var5 = var3;
      int var6 = 0;

      for (AbstractInsnNode var8 : var2.instructions) {
         if (var8 instanceof FrameNode) {
            try {
               var5 = this.expandFrame(var1, var5, (FrameNode)var8);
            } catch (AnalyzerException var10) {
               throw new AnalyzerException(var10.node, stringConcat$2(var6, var10.getMessage()), var10);
            }

            for (int var9 = var4 + 1; var9 <= var6; var9++) {
               this.getFrames()[var9] = var5;
            }
         }

         if (isJvmInsnNode(var8) || var8 instanceof FrameNode) {
            var4 = var6;
         }

         var6++;
      }
   }

   private Frame<V> expandFrame(String var1, Frame<V> var2, FrameNode var3) {
      Frame var4 = this.newFrame(var2);
      List var5 = var3.local == null ? Collections.emptyList() : var3.local;
      int var6 = this.currentLocals;
      switch (var3.type) {
         case -1:
         case 0:
            var6 = 0;
         case 1:
            for (Object var12 : var5) {
               Value var9 = this.newFrameValue(var1, var3, var12);
               if (var6 + var9.getSize() > var4.getLocals()) {
                  throw new AnalyzerException(var3, "Cannot append more locals than maxLocals");
               }

               var4.setLocal(var6++, var9);
               if (var9.getSize() == 2) {
                  var4.setLocal(var6++, this.interpreter.newValue(null));
               }
            }
            break;
         case 2:
            for (Object var8 : var5) {
               if (var6 <= 0) {
                  throw new AnalyzerException(var3, "Cannot chop more locals than defined");
               }

               if (var6 > 1 && var4.getLocal(var6 - 2).getSize() == 2) {
                  var6 -= 2;
               } else {
                  var6--;
               }
            }
         case 3:
         case 4:
            break;
         default:
            throw new AnalyzerException(var3, stringConcat$3(var3.type));
      }

      this.currentLocals = var6;

      while (var6 < var4.getLocals()) {
         var4.setLocal(var6++, this.interpreter.newValue(null));
      }

      List var11 = var3.stack == null ? Collections.emptyList() : var3.stack;
      var4.clearStack();

      for (Object var14 : var11) {
         var4.push(this.newFrameValue(var1, var3, var14));
      }

      return var4;
   }

   private V newFrameValue(String var1, FrameNode var2, Object var3) {
      if (var3 == Opcodes.TOP) {
         return this.interpreter.newValue(null);
      }

      if (var3 == Opcodes.INTEGER) {
         return this.interpreter.newValue(Type.INT_TYPE);
      }

      if (var3 == Opcodes.FLOAT) {
         return this.interpreter.newValue(Type.FLOAT_TYPE);
      }

      if (var3 == Opcodes.LONG) {
         return this.interpreter.newValue(Type.LONG_TYPE);
      }

      if (var3 == Opcodes.DOUBLE) {
         return this.interpreter.newValue(Type.DOUBLE_TYPE);
      }

      if (var3 == Opcodes.NULL) {
         return this.interpreter.newOperation(new InsnNode(1));
      }

      if (var3 == Opcodes.UNINITIALIZED_THIS) {
         return this.interpreter.newValue(Type.getObjectType(var1));
      }

      if (var3 instanceof String) {
         return this.interpreter.newValue(Type.getObjectType((String)var3));
      }

      if (!(var3 instanceof LabelNode)) {
         throw new AnalyzerException(var2, stringConcat$4(String.valueOf(var3)));
      }

      AbstractInsnNode var4 = (LabelNode)var3;

      while (var4 != null && !isJvmInsnNode(var4)) {
         var4 = var4.getNext();
      }

      if (var4 != null && var4.getOpcode() == 187) {
         return this.interpreter.newValue(Type.getObjectType(((TypeInsnNode)var4).desc));
      } else {
         throw new AnalyzerException(var2, "LabelNode does not designate a NEW instruction");
      }
   }

   private void checkFrame(int var1, Frame<V> var2, boolean var3) {
      Frame var4 = this.getFrames()[var1];
      if (var4 == null) {
         if (var3) {
            throw new AnalyzerException(null, stringConcat$5(var1));
         }

         this.getFrames()[var1] = this.newFrame(var2);
      } else {
         String var5 = this.checkMerge(var2, var4);
         if (var5 != null) {
            throw new AnalyzerException(null, stringConcat$6(var1, var5));
         }
      }
   }

   private String checkMerge(Frame<V> var1, Frame<V> var2) {
      int var3 = var1.getLocals();
      if (var3 != var2.getLocals()) {
         throw new AssertionError();
      }

      for (int var4 = 0; var4 < var3; var4++) {
         Value var5 = this.interpreter.merge((V)var1.getLocal(var4), (V)var2.getLocal(var4));
         if (!var5.equals(var2.getLocal(var4))) {
            return stringConcat$7(var4, String.valueOf(var1.getLocal(var4)), String.valueOf(var2.getLocal(var4)));
         }
      }

      int var7 = var1.getStackSize();
      if (var7 != var2.getStackSize()) {
         return "incompatible stack heights";
      }

      for (int var8 = 0; var8 < var7; var8++) {
         Value var6 = this.interpreter.merge((V)var1.getStack(var8), (V)var2.getStack(var8));
         if (!var6.equals(var2.getStack(var8))) {
            return stringConcat$8(var8, String.valueOf(var1.getStack(var8)), String.valueOf(var2.getStack(var8)));
         }
      }

      return null;
   }

   private void endControlFlow(int var1) {
      if (this.hasNextJvmInsnOrFrame(var1) && this.getFrames()[var1 + 1] == null) {
         throw new AnalyzerException(null, stringConcat$9(var1 + 1));
      }
   }

   private boolean hasNextJvmInsnOrFrame(int var1) {
      for (AbstractInsnNode var2 = this.insnList.get(var1).getNext(); var2 != null; var2 = var2.getNext()) {
         if (isJvmInsnNode(var2) || var2 instanceof FrameNode) {
            return true;
         }
      }

      return false;
   }

   private static boolean isJvmInsnNode(AbstractInsnNode var0) {
      return var0.getOpcode() >= 0;
   }
}
