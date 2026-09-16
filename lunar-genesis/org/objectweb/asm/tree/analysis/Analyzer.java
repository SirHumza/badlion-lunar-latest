package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;

public class Analyzer<V extends Value> implements Opcodes {
   private final Interpreter<V> interpreter;
   private InsnList insnList;
   private int insnListSize;
   private List<TryCatchBlockNode>[] handlers;
   private Frame<V>[] frames;
   private Subroutine[] subroutines;
   private boolean[] inInstructionsToProcess;
   private int[] instructionsToProcess;
   private int numInstructionsToProcess;

   public Analyzer(Interpreter<V> var1) {
      this.interpreter = var1;
   }

   public Frame<V>[] analyze(String var1, MethodNode var2) {
      if ((var2.access & 1280) != 0) {
         this.frames = new Frame[0];
         return this.frames;
      }

      this.insnList = var2.instructions;
      this.insnListSize = this.insnList.size();
      this.handlers = new List[this.insnListSize];
      this.frames = new Frame[this.insnListSize];
      this.subroutines = new Subroutine[this.insnListSize];
      this.inInstructionsToProcess = new boolean[this.insnListSize];
      this.instructionsToProcess = new int[this.insnListSize];
      this.numInstructionsToProcess = 0;

      for (TryCatchBlockNode var4 : var2.tryCatchBlocks) {
         int var5 = this.insnList.indexOf(var4.start);
         int var6 = this.insnList.indexOf(var4.end);

         for (int var7 = var5; var7 < var6; var7++) {
            List var8 = this.handlers[var7];
            if (var8 == null) {
               var8 = new ArrayList();
               this.handlers[var7] = var8;
            }

            var8.add(var4);
         }
      }

      this.findSubroutines(var2.maxLocals);

      Frame var19;
      try {
         var19 = this.computeInitialFrame(var1, var2);
         this.merge(0, var19, null);
         this.init(var1, var2);
      } catch (RuntimeException var16) {
         throw new AnalyzerException(this.insnList.get(0), stringConcat$0(var16.getMessage()), var16);
      }

      while (this.numInstructionsToProcess > 0) {
         int var20 = this.instructionsToProcess[--this.numInstructionsToProcess];
         Frame var21 = this.frames[var20];
         Subroutine var22 = this.subroutines[var20];
         this.inInstructionsToProcess[var20] = false;
         AbstractInsnNode var23 = null;

         try {
            var23 = var2.instructions.get(var20);
            int var24 = var23.getOpcode();
            int var9 = var23.getType();
            if (var9 != 8 && var9 != 15 && var9 != 14) {
               var19.init(var21).execute(var23, this.interpreter);
               var22 = var22 == null ? null : new Subroutine(var22);
               if (var23 instanceof JumpInsnNode) {
                  JumpInsnNode var10 = (JumpInsnNode)var23;
                  if (var24 != 167 && var24 != 168) {
                     var19.initJumpTarget(var24, null);
                     this.merge(var20 + 1, var19, var22);
                     this.newControlFlowEdge(var20, var20 + 1);
                  }

                  int var11 = this.insnList.indexOf(var10.label);
                  var19.initJumpTarget(var24, var10.label);
                  if (var24 == 168) {
                     this.merge(var11, var19, new Subroutine(var10.label, var2.maxLocals, var10));
                  } else {
                     this.merge(var11, var19, var22);
                  }

                  this.newControlFlowEdge(var20, var11);
               } else if (var23 instanceof LookupSwitchInsnNode) {
                  LookupSwitchInsnNode var25 = (LookupSwitchInsnNode)var23;
                  int var31 = this.insnList.indexOf(var25.dflt);
                  var19.initJumpTarget(var24, var25.dflt);
                  this.merge(var31, var19, var22);
                  this.newControlFlowEdge(var20, var31);

                  for (LabelNode var13 : var25.labels) {
                     var31 = this.insnList.indexOf(var13);
                     var19.initJumpTarget(var24, var13);
                     this.merge(var31, var19, var22);
                     this.newControlFlowEdge(var20, var31);
                  }
               } else if (var23 instanceof TableSwitchInsnNode) {
                  TableSwitchInsnNode var26 = (TableSwitchInsnNode)var23;
                  int var33 = this.insnList.indexOf(var26.dflt);
                  var19.initJumpTarget(var24, var26.dflt);
                  this.merge(var33, var19, var22);
                  this.newControlFlowEdge(var20, var33);

                  for (LabelNode var40 : var26.labels) {
                     var19.initJumpTarget(var24, var40);
                     var33 = this.insnList.indexOf(var40);
                     this.merge(var33, var19, var22);
                     this.newControlFlowEdge(var20, var33);
                  }
               } else if (var24 == 169) {
                  if (var22 == null) {
                     throw new AnalyzerException(var23, "RET instruction outside of a subroutine");
                  }

                  for (JumpInsnNode var35 : var22.callers) {
                     int var38 = this.insnList.indexOf(var35);
                     if (this.frames[var38] != null) {
                        this.merge(var38 + 1, this.frames[var38], var19, this.subroutines[var38], var22.localsUsed);
                        this.newControlFlowEdge(var20, var38 + 1);
                     }
                  }
               } else if (var24 != 191 && (var24 < 172 || var24 > 177)) {
                  if (var22 != null) {
                     if (var23 instanceof VarInsnNode) {
                        int var29 = ((VarInsnNode)var23).var;
                        var22.localsUsed[var29] = true;
                        if (var24 == 22 || var24 == 24 || var24 == 55 || var24 == 57) {
                           var22.localsUsed[var29 + 1] = true;
                        }
                     } else if (var23 instanceof IincInsnNode) {
                        int var28 = ((IincInsnNode)var23).var;
                        var22.localsUsed[var28] = true;
                     }
                  }

                  this.merge(var20 + 1, var19, var22);
                  this.newControlFlowEdge(var20, var20 + 1);
               }
            } else {
               var19.init(var21);
               this.merge(var20 + 1, var21, var22);
               this.newControlFlowEdge(var20, var20 + 1);
            }

            List var30 = this.handlers[var20];
            if (var30 != null) {
               for (TryCatchBlockNode var39 : var30) {
                  Type var41;
                  if (var39.type == null) {
                     var41 = Type.getObjectType("java/lang/Throwable");
                  } else {
                     var41 = Type.getObjectType(var39.type);
                  }

                  if (this.newControlFlowExceptionEdge(var20, var39)) {
                     Frame var14 = this.newFrame(var21);
                     var14.clearStack();
                     Value var15 = this.interpreter.newExceptionValue(var39, var14, var41);
                     var14.push(var15);
                     this.merge(this.insnList.indexOf(var39.handler), var14, var22);
                     var14 = this.newFrame(var19);
                     var14.clearStack();
                     var14.push(var15);
                     this.merge(this.insnList.indexOf(var39.handler), var14, var22);
                  }
               }
            }
         } catch (AnalyzerException var17) {
            throw new AnalyzerException(var17.node, stringConcat$1(var20, var17.getMessage()), var17);
         } catch (RuntimeException var18) {
            throw new AnalyzerException(var23, stringConcat$2(var20, var18.getMessage()), var18);
         }
      }

      return this.frames;
   }

   public Frame<V>[] analyzeAndComputeMaxs(String var1, MethodNode var2) {
      var2.maxLocals = computeMaxLocals(var2);
      var2.maxStack = -1;
      this.analyze(var1, var2);
      var2.maxStack = computeMaxStack(this.frames);
      return this.frames;
   }

   private static int computeMaxLocals(MethodNode var0) {
      int var1 = Type.getArgumentsAndReturnSizes(var0.desc) >> 2;
      if ((var0.access & 8) != 0) {
         var1--;
      }

      for (AbstractInsnNode var3 : var0.instructions) {
         if (var3 instanceof VarInsnNode) {
            int var4 = ((VarInsnNode)var3).var;
            int var5 = var3.getOpcode() != 22 && var3.getOpcode() != 24 && var3.getOpcode() != 55 && var3.getOpcode() != 57 ? 1 : 2;
            var1 = Math.max(var1, var4 + var5);
         } else if (var3 instanceof IincInsnNode) {
            int var6 = ((IincInsnNode)var3).var;
            var1 = Math.max(var1, var6 + 1);
         }
      }

      return var1;
   }

   private static int computeMaxStack(Frame<?>[] var0) {
      int var1 = 0;

      for (Frame var5 : var0) {
         if (var5 != null) {
            int var6 = 0;

            for (int var7 = 0; var7 < var5.getStackSize(); var7++) {
               var6 += var5.getStack(var7).getSize();
            }

            var1 = Math.max(var1, var6);
         }
      }

      return var1;
   }

   private void findSubroutines(int var1) {
      Subroutine var2 = new Subroutine(null, var1, null);
      ArrayList var3 = new ArrayList();
      this.findSubroutine(0, var2, var3);
      HashMap var4 = new HashMap();

      while (!var3.isEmpty()) {
         JumpInsnNode var5 = (JumpInsnNode)var3.remove(0);
         Subroutine var6 = (Subroutine)var4.get(var5.label);
         if (var6 == null) {
            var6 = new Subroutine(var5.label, var1, var5);
            var4.put(var5.label, var6);
            this.findSubroutine(this.insnList.indexOf(var5.label), var6, var3);
         } else {
            var6.callers.add(var5);
         }
      }

      for (int var7 = 0; var7 < this.insnListSize; var7++) {
         if (this.subroutines[var7] != null && this.subroutines[var7].start == null) {
            this.subroutines[var7] = null;
         }
      }
   }

   private void findSubroutine(int var1, Subroutine var2, List<AbstractInsnNode> var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var1);

      while (!var4.isEmpty()) {
         int var5 = (Integer)var4.remove(var4.size() - 1);
         if (var5 < 0 || var5 >= this.insnListSize) {
            throw new AnalyzerException(null, "Execution can fall off the end of the code");
         }

         if (this.subroutines[var5] == null) {
            this.subroutines[var5] = new Subroutine(var2);
            AbstractInsnNode var6 = this.insnList.get(var5);
            if (var6 instanceof JumpInsnNode) {
               if (var6.getOpcode() == 168) {
                  var3.add(var6);
               } else {
                  JumpInsnNode var7 = (JumpInsnNode)var6;
                  var4.add(this.insnList.indexOf(var7.label));
               }
            } else if (var6 instanceof TableSwitchInsnNode) {
               TableSwitchInsnNode var10 = (TableSwitchInsnNode)var6;
               this.findSubroutine(this.insnList.indexOf(var10.dflt), var2, var3);

               for (int var8 = var10.labels.size() - 1; var8 >= 0; var8--) {
                  LabelNode var9 = var10.labels.get(var8);
                  var4.add(this.insnList.indexOf(var9));
               }
            } else if (var6 instanceof LookupSwitchInsnNode) {
               LookupSwitchInsnNode var11 = (LookupSwitchInsnNode)var6;
               this.findSubroutine(this.insnList.indexOf(var11.dflt), var2, var3);

               for (int var13 = var11.labels.size() - 1; var13 >= 0; var13--) {
                  LabelNode var15 = var11.labels.get(var13);
                  var4.add(this.insnList.indexOf(var15));
               }
            }

            List var12 = this.handlers[var5];
            if (var12 != null) {
               for (TryCatchBlockNode var16 : var12) {
                  var4.add(this.insnList.indexOf(var16.handler));
               }
            }

            switch (var6.getOpcode()) {
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
                  break;
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
               default:
                  var4.add(var5 + 1);
            }
         }
      }
   }

   private Frame<V> computeInitialFrame(String var1, MethodNode var2) {
      Frame var3 = this.newFrame(var2.maxLocals, var2.maxStack);
      int var4 = 0;
      boolean var5 = (var2.access & 8) == 0;
      if (var5) {
         Type var6 = Type.getObjectType(var1);
         var3.setLocal(var4, this.interpreter.newParameterValue(var5, var4, var6));
         var4++;
      }

      Type[] var11 = Type.getArgumentTypes(var2.desc);

      for (Type var10 : var11) {
         var3.setLocal(var4, this.interpreter.newParameterValue(var5, var4, var10));
         var4++;
         if (var10.getSize() == 2) {
            var3.setLocal(var4, this.interpreter.newEmptyValue(var4));
            var4++;
         }
      }

      while (var4 < var2.maxLocals) {
         var3.setLocal(var4, this.interpreter.newEmptyValue(var4));
         var4++;
      }

      var3.setReturn(this.interpreter.newReturnTypeValue(Type.getReturnType(var2.desc)));
      return var3;
   }

   public Frame<V>[] getFrames() {
      return this.frames;
   }

   public List<TryCatchBlockNode> getHandlers(int var1) {
      return this.handlers[var1];
   }

   protected void init(String var1, MethodNode var2) {
   }

   protected Frame<V> newFrame(int var1, int var2) {
      return new Frame<>(var1, var2);
   }

   protected Frame<V> newFrame(Frame<? extends V> var1) {
      return new Frame<>(var1);
   }

   protected void newControlFlowEdge(int var1, int var2) {
   }

   protected boolean newControlFlowExceptionEdge(int var1, int var2) {
      return true;
   }

   protected boolean newControlFlowExceptionEdge(int var1, TryCatchBlockNode var2) {
      return this.newControlFlowExceptionEdge(var1, this.insnList.indexOf(var2.handler));
   }

   private void merge(int var1, Frame<V> var2, Subroutine var3) {
      Frame var5 = this.frames[var1];
      boolean var4;
      if (var5 == null) {
         this.frames[var1] = this.newFrame(var2);
         var4 = true;
      } else {
         var4 = var5.merge(var2, this.interpreter);
      }

      Subroutine var6 = this.subroutines[var1];
      if (var6 == null) {
         if (var3 != null) {
            this.subroutines[var1] = new Subroutine(var3);
            var4 = true;
         }
      } else if (var3 != null) {
         var4 |= var6.merge(var3);
      }

      if (var4 && !this.inInstructionsToProcess[var1]) {
         this.inInstructionsToProcess[var1] = true;
         this.instructionsToProcess[this.numInstructionsToProcess++] = var1;
      }
   }

   private void merge(int var1, Frame<V> var2, Frame<V> var3, Subroutine var4, boolean[] var5) {
      var3.merge(var2, var5);
      Frame var7 = this.frames[var1];
      boolean var6;
      if (var7 == null) {
         this.frames[var1] = this.newFrame(var3);
         var6 = true;
      } else {
         var6 = var7.merge(var3, this.interpreter);
      }

      Subroutine var8 = this.subroutines[var1];
      if (var8 != null && var4 != null) {
         var6 |= var8.merge(var4);
      }

      if (var6 && !this.inInstructionsToProcess[var1]) {
         this.inInstructionsToProcess[var1] = true;
         this.instructionsToProcess[this.numInstructionsToProcess++] = var1;
      }
   }
}
