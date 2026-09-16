package org.spongepowered.asm.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.MixinVerifier;
import org.spongepowered.asm.util.throwables.LVTGeneratorError;

public final class Locals {
   private static final String[] FRAME_TYPES = new String[]{"TOP", "INTEGER", "FLOAT", "DOUBLE", "LONG", "NULL", "UNINITIALIZED_THIS"};
   private static final Map<String, List<LocalVariableNode>> calculatedLocalVariables = new HashMap<>();

   private Locals() {
   }

   public static LocalVariableNode[] getInitialMethodLocals(MethodNode var0, ClassNode var1, int var2) {
      return getInitialMethodLocals(var0, var1, var2, false);
   }

   public static LocalVariableNode[] getInitialMethodLocals(MethodNode var0, ClassNode var1, int var2, boolean var3) {
      boolean var4 = Bytecode.isStatic(var0);
      Type[] var5 = Type.getArgumentTypes(var0.desc);
      int var6 = Bytecode.getFirstNonArgLocalIndex(var0);
      LocalVariableNode[] var7 = new LocalVariableNode[var6];
      int var8 = 0;
      String[] var9 = var2 >= 17000 ? getParameterNames(var0, var4) : new String[var5.length];
      if (!var4) {
         var7[var8++] = new LocalVariableNode("this", Type.getObjectType(var1.name).getDescriptor(), null, null, null, 0);
      }

      for (int var10 = 0; var10 < var5.length; var10++) {
         Type var11 = var5[var10];
         String var12 = var9[var10];
         if (var12 == null) {
            if (var3) {
               var12 = "arg" + var8;
            } else {
               var12 = "arg" + var10;
            }
         }

         var7[var8] = new LocalVariableNode(var12, var11.getDescriptor(), null, null, null, var8);
         var8 += var11.getSize();
      }

      return var7;
   }

   private static String[] getParameterNames(MethodNode var0, boolean var1) {
      Type[] var2 = Type.getArgumentTypes(var0.desc);
      if (var2.length == 0) {
         return new String[0];
      }

      String[] var3 = new String[var2.length];
      HashMap var4 = new HashMap();
      int var5 = var1 ? 0 : 1;

      for (int var6 = 0; var6 < var2.length; var6++) {
         var4.put(var5, var6);
         var5 += var2[var6].getSize();
      }

      if (var0.localVariables != null) {
         for (LocalVariableNode var7 : var0.localVariables) {
            Integer var8 = (Integer)var4.get(var7.index);
            if (var8 != null) {
               var3[var8] = var7.name;
            }
         }
      }

      if (var0.parameters != null) {
         for (int var10 = 0; var10 < Math.min(var2.length, var0.parameters.size()); var10++) {
            if (var3[var10] == null) {
               var3[var10] = var0.parameters.get(var10).name;
            }
         }
      }

      return var3;
   }

   public static void loadLocals(Type[] var0, InsnList var1, int var2, int var3) {
      while (var2 < var0.length && var3 > 0) {
         if (var0[var2] != null) {
            var1.add(new VarInsnNode(var0[var2].getOpcode(21), var2));
            var3--;
         }

         var2++;
      }
   }

   public static LocalVariableNode[] getLocalsAt(ClassNode var0, MethodNode var1, AbstractInsnNode var2, int var3) {
      return var3 >= 10000 ? getLocalsAt(var0, var1, var2, Locals.Settings.DEFAULT, var3) : getLocalsAt092(var0, var1, var2);
   }

   public static LocalVariableNode[] getLocalsAt(ClassNode var0, MethodNode var1, AbstractInsnNode var2, Locals.Settings var3) {
      return getLocalsAt(var0, var1, var2, var3, 17004);
   }

   private static LocalVariableNode[] getLocalsAt(ClassNode var0, MethodNode var1, AbstractInsnNode var2, Locals.Settings var3, int var4) {
      for (int var5 = 0; var5 < 3 && (var2 instanceof LabelNode || var2 instanceof LineNumberNode); var5++) {
         AbstractInsnNode var6 = nextNode(var1.instructions, var2);
         if (var6 instanceof FrameNode) {
            break;
         }

         var2 = var6;
      }

      ClassInfo var28 = ClassInfo.forName(var0.name);
      if (var28 == null) {
         throw new LVTGeneratorError("Could not load class metadata for " + var0.name + " generating LVT for " + var1.name);
      }

      ClassInfo.Method var29 = var28.findMethod(var1, var1.access | 262144);
      if (var29 == null) {
         throw new LVTGeneratorError("Could not locate method metadata for " + var1.name + " generating LVT in " + var0.name);
      }

      List var7 = var29.getFrames();
      LocalVariableNode[] var8 = getInitialMethodLocals(var1, var0, var4);
      LocalVariableNode[] var9 = new LocalVariableNode[var1.maxLocals];
      System.arraycopy(var8, 0, var9, 0, var8.length);
      int var10 = var8.length;
      int var11 = var10;
      int var12 = -1;
      int var13 = var10;
      int var14 = var10;
      VarInsnNode var15 = null;

      for (AbstractInsnNode var17 : var1.instructions) {
         for (int var18 = 0; var18 < var9.length; var18++) {
            if (var9[var18] instanceof Locals.ZombieLocalVariableNode) {
               Locals.ZombieLocalVariableNode var19 = (Locals.ZombieLocalVariableNode)var9[var18];
               var19.lifetime++;
               if (var17 instanceof FrameNode) {
                  var19.frames++;
               }
            }
         }

         if (var15 != null) {
            LocalVariableNode var32 = getLocalVariableAt(var0, var1, var17, var15.var);
            var9[var15.var] = var32;
            var14 = Math.max(var14, var15.var + 1);
            if (var32 != null && var15.var < var1.maxLocals - 1 && var32.desc != null && Type.getType(var32.desc).getSize() == 2) {
               var9[var15.var + 1] = null;
               var14 = Math.max(var14, var15.var + 2);
               if (var3.hasFlags(Locals.Settings.RESURRECT_EXPOSED_ON_STORE)) {
                  resurrect(var9, var14, var3);
               }
            }

            var15 = null;
         }

         if (var17 instanceof FrameNode) {
            var12++;
            FrameNode var33 = (FrameNode)var17;
            if (var33.type != 3 && var33.type != 4) {
               int var35 = computeFrameSize(var33, var10);
               ClassInfo.FrameData var20 = var12 < var7.size() ? (ClassInfo.FrameData)var7.get(var12) : null;
               if (var20 != null) {
                  if (var20.type == 0) {
                     var14 = var13 = var11 = Math.max(var10, Math.min(var35, var20.size));
                  } else {
                     var11 = getAdjustedFrameSize(var11, var20, var10);
                  }
               } else {
                  var11 = getAdjustedFrameSize(var11, var33, var10);
               }

               if (var11 < var10) {
                  throw new IllegalStateException(
                     String.format(
                        "Locals entered an invalid state evaluating %s::%s%s at instruction %d (%s). Initial frame size is %d, calculated a frame size of %d with %s",
                        var0.name,
                        var1.name,
                        var1.desc,
                        var1.instructions.indexOf(var17),
                        Bytecode.describeNode(var17, false),
                        var10,
                        var11,
                        var20
                     )
                  );
               }

               if (var20 == null && (var33.type == 2 || var33.type == -1) || var20 != null && var20.type == 2) {
                  for (int var38 = var11; var38 < var9.length; var38++) {
                     var9[var38] = Locals.ZombieLocalVariableNode.of(var9[var38], 'C');
                  }

                  var13 = var11;
                  var14 = var11;
               } else {
                  int var21 = var33.type == 1 ? var13 : 0;
                  var13 = var11;

                  for (int var22 = 0; var21 < var9.length; var22++) {
                     Object var23 = var22 < var33.local.size() ? var33.local.get(var22) : null;
                     if (var23 instanceof String) {
                        var9[var21] = getLocalVariableAt(var0, var1, var17, var21);
                     } else if (var23 instanceof Integer) {
                        boolean var24 = var23 == Opcodes.UNINITIALIZED_THIS || var23 == Opcodes.NULL;
                        boolean var25 = var23 == Opcodes.INTEGER || var23 == Opcodes.FLOAT;
                        boolean var26 = var23 == Opcodes.DOUBLE || var23 == Opcodes.LONG;
                        if (var23 == Opcodes.TOP) {
                           if (var9[var21] instanceof Locals.ZombieLocalVariableNode && var3.hasFlags(Locals.Settings.RESURRECT_FOR_BOGUS_TOP)) {
                              Locals.ZombieLocalVariableNode var27 = (Locals.ZombieLocalVariableNode)var9[var21];
                              if (var27.type == 'X') {
                                 var9[var21] = var27.ancestor;
                              }
                           }
                        } else if (var24) {
                           var9[var21] = null;
                        } else {
                           if (!var25 && !var26) {
                              throw new LVTGeneratorError(
                                 "Unrecognised locals opcode "
                                    + var23
                                    + " in locals array at position "
                                    + var22
                                    + " in "
                                    + var0.name
                                    + "."
                                    + var1.name
                                    + var1.desc
                              );
                           }

                           var9[var21] = getLocalVariableAt(var0, var1, var17, var21);
                           if (var26) {
                              var9[++var21] = null;
                           }
                        }
                     } else if (var23 == null) {
                        if (var21 >= var10 && var21 >= var11 && var11 > 0) {
                           if (var21 < var14) {
                              var9[var21] = getLocalVariableAt(var0, var1, var17, var21);
                           } else {
                              var9[var21] = Locals.ZombieLocalVariableNode.of(var9[var21], 'X');
                           }
                        }
                     } else if (!(var23 instanceof LabelNode)) {
                        throw new LVTGeneratorError(
                           "Invalid value " + var23 + " in locals array at position " + var22 + " in " + var0.name + "." + var1.name + var1.desc
                        );
                     }

                     var21++;
                  }
               }
            }
         } else if (var17 instanceof VarInsnNode) {
            VarInsnNode var34 = (VarInsnNode)var17;
            boolean var36 = var17.getOpcode() >= 21 && var17.getOpcode() <= 53;
            if (var36) {
               LocalVariableNode var37 = getLocalVariableAt(var0, var1, var17, var34.var);
               var9[var34.var] = var37;
               int var39 = var37 != null && var37.desc != null ? Type.getType(var9[var34.var].desc).getSize() : 1;
               var14 = Math.max(var14, var34.var + var39);
               if (var3.hasFlags(Locals.Settings.RESURRECT_EXPOSED_ON_LOAD)) {
                  resurrect(var9, var14, var3);
               }
            } else {
               var15 = var34;
            }
         }

         if (var17 == var2) {
            break;
         }
      }

      for (int var30 = 0; var30 < var9.length; var30++) {
         if (var9[var30] instanceof Locals.ZombieLocalVariableNode) {
            Locals.ZombieLocalVariableNode var31 = (Locals.ZombieLocalVariableNode)var9[var30];
            var9[var30] = var31.lifetime > 1 ? null : var31.ancestor;
         }

         if (var9[var30] != null && var9[var30].desc == null || var9[var30] instanceof Locals.SyntheticLocalVariableNode) {
            var9[var30] = null;
         }
      }

      return var9;
   }

   private static LocalVariableNode[] getLocalsAt092(ClassNode var0, MethodNode var1, AbstractInsnNode var2) {
      for (int var3 = 0; var3 < 3 && (var2 instanceof LabelNode || var2 instanceof LineNumberNode); var3++) {
         var2 = nextNode(var1.instructions, var2);
      }

      ClassInfo var24 = ClassInfo.forName(var0.name);
      if (var24 == null) {
         throw new LVTGeneratorError("Could not load class metadata for " + var0.name + " generating LVT for " + var1.name);
      }

      ClassInfo.Method var4 = var24.findMethod(var1, var1.access | 262144);
      if (var4 == null) {
         throw new LVTGeneratorError("Could not locate method metadata for " + var1.name + " generating LVT in " + var0.name);
      }

      List var5 = var4.getFrames();
      LocalVariableNode[] var6 = new LocalVariableNode[var1.maxLocals];
      int var7 = 0;
      int var8 = 0;
      if ((var1.access & 8) == 0) {
         var6[var7++] = new LocalVariableNode("this", Type.getObjectType(var0.name).toString(), null, null, null, 0);
      }

      for (Type var12 : Type.getArgumentTypes(var1.desc)) {
         var6[var7] = new LocalVariableNode("arg" + var8++, var12.toString(), null, null, null, var7);
         var7 += var12.getSize();
      }

      int var25 = var7;
      int var26 = var7;
      int var27 = -1;
      int var28 = var7;
      VarInsnNode var13 = null;

      for (AbstractInsnNode var15 : var1.instructions) {
         if (var13 != null) {
            var6[var13.var] = getLocalVariableAt(var0, var1, var15, var13.var);
            var13 = null;
         }

         if (var15 instanceof FrameNode) {
            var27++;
            FrameNode var16 = (FrameNode)var15;
            if (var16.type != 3 && var16.type != 4) {
               ClassInfo.FrameData var17 = var27 < var5.size() ? (ClassInfo.FrameData)var5.get(var27) : null;
               if (var17 != null) {
                  if (var17.type == 0) {
                     var26 = Math.min(var26, var17.locals);
                     var28 = var26;
                  } else {
                     var26 = getAdjustedFrameSize(var26, var17.type, var17.rawSize, 0);
                  }
               } else {
                  var26 = getAdjustedFrameSize(var26, var16, 0);
               }

               if (var16.type == 2) {
                  for (int var18 = var26; var18 < var6.length; var18++) {
                     var6[var18] = null;
                  }

                  var28 = var26;
               } else {
                  int var32 = var16.type == 1 ? var28 : 0;
                  var28 = var26;

                  for (int var19 = 0; var32 < var6.length; var19++) {
                     Object var20 = var19 < var16.local.size() ? var16.local.get(var19) : null;
                     if (var20 instanceof String) {
                        var6[var32] = getLocalVariableAt(var0, var1, var15, var32);
                     } else if (var20 instanceof Integer) {
                        boolean var21 = var20 == Opcodes.UNINITIALIZED_THIS || var20 == Opcodes.NULL;
                        boolean var22 = var20 == Opcodes.INTEGER || var20 == Opcodes.FLOAT;
                        boolean var23 = var20 == Opcodes.DOUBLE || var20 == Opcodes.LONG;
                        if (var20 != Opcodes.TOP) {
                           if (var21) {
                              var6[var32] = null;
                           } else {
                              if (!var22 && !var23) {
                                 throw new LVTGeneratorError(
                                    "Unrecognised locals opcode "
                                       + var20
                                       + " in locals array at position "
                                       + var19
                                       + " in "
                                       + var0.name
                                       + "."
                                       + var1.name
                                       + var1.desc
                                 );
                              }

                              var6[var32] = getLocalVariableAt(var0, var1, var15, var32);
                              if (var23) {
                                 var6[++var32] = null;
                              }
                           }
                        }
                     } else if (var20 == null) {
                        if (var32 >= var25 && var32 >= var26 && var26 > 0) {
                           var6[var32] = null;
                        }
                     } else if (!(var20 instanceof LabelNode)) {
                        throw new LVTGeneratorError(
                           "Invalid value " + var20 + " in locals array at position " + var19 + " in " + var0.name + "." + var1.name + var1.desc
                        );
                     }

                     var32++;
                  }
               }
            }
         } else if (var15 instanceof VarInsnNode) {
            VarInsnNode var30 = (VarInsnNode)var15;
            boolean var31 = var15.getOpcode() >= 21 && var15.getOpcode() <= 53;
            if (var31) {
               var6[var30.var] = getLocalVariableAt(var0, var1, var15, var30.var);
            } else {
               var13 = var30;
            }
         }

         if (var15 == var2) {
            break;
         }
      }

      for (int var29 = 0; var29 < var6.length; var29++) {
         if (var6[var29] != null && var6[var29].desc == null) {
            var6[var29] = null;
         }
      }

      return var6;
   }

   private static void resurrect(LocalVariableNode[] var0, int var1, Locals.Settings var2) {
      for (int var3 = 0; var3 < var1 && var3 < var0.length; var3++) {
         if (var0[var3] instanceof Locals.ZombieLocalVariableNode) {
            Locals.ZombieLocalVariableNode var4 = (Locals.ZombieLocalVariableNode)var0[var3];
            if (var4.checkResurrect(var2)) {
               var0[var3] = var4.ancestor;
            }
         }
      }
   }

   public static LocalVariableNode getLocalVariableAt(ClassNode var0, MethodNode var1, AbstractInsnNode var2, int var3) {
      return getLocalVariableAt(var0, var1, var1.instructions.indexOf(var2), var3);
   }

   private static LocalVariableNode getLocalVariableAt(ClassNode var0, MethodNode var1, int var2, int var3) {
      LocalVariableNode var4 = null;
      LocalVariableNode var5 = null;

      for (LocalVariableNode var7 : getLocalVariableTable(var0, var1)) {
         if (var7.index == var3) {
            if (isOpcodeInRange(var1.instructions, var7, var2)) {
               var4 = var7;
            } else if (var4 == null) {
               var5 = var7;
            }
         }
      }

      if (var4 == null && !var1.localVariables.isEmpty()) {
         for (LocalVariableNode var9 : getGeneratedLocalVariableTable(var0, var1)) {
            if (var9.index == var3 && isOpcodeInRange(var1.instructions, var9, var2)) {
               var4 = var9;
            }
         }
      }

      return var4 != null ? var4 : var5;
   }

   private static boolean isOpcodeInRange(InsnList var0, LocalVariableNode var1, int var2) {
      return var0.indexOf(var1.start) <= var2 && var0.indexOf(var1.end) > var2;
   }

   public static List<LocalVariableNode> getLocalVariableTable(ClassNode var0, MethodNode var1) {
      return var1.localVariables.isEmpty() ? getGeneratedLocalVariableTable(var0, var1) : Collections.unmodifiableList(var1.localVariables);
   }

   public static List<LocalVariableNode> getGeneratedLocalVariableTable(ClassNode var0, MethodNode var1) {
      String var2 = String.format("%s.%s%s", var0.name, var1.name, var1.desc);
      List var3 = calculatedLocalVariables.get(var2);
      if (var3 != null) {
         return var3;
      }

      var3 = generateLocalVariableTable(var0, var1);
      calculatedLocalVariables.put(var2, var3);
      return Collections.unmodifiableList(var3);
   }

   public static List<LocalVariableNode> generateLocalVariableTable(ClassNode var0, MethodNode var1) {
      ArrayList var2 = null;
      if (var0.interfaces != null) {
         var2 = new ArrayList();

         for (String var4 : var0.interfaces) {
            var2.add(Type.getObjectType(var4));
         }
      }

      Type var20 = null;
      if (var0.superName != null) {
         var20 = Type.getObjectType(var0.superName);
      }

      Analyzer var21 = new Analyzer<>(new MixinVerifier(ASM.API_VERSION, Type.getObjectType(var0.name), var20, var2, false));

      try {
         var21.analyze(var0.name, var1);
      } catch (AnalyzerException var19) {
         var19.printStackTrace();
      }

      Frame[] var5 = var21.getFrames();
      int var6 = var1.instructions.size();
      ArrayList var7 = new ArrayList();
      LocalVariableNode[] var8 = new LocalVariableNode[var1.maxLocals];
      BasicValue[] var9 = new BasicValue[var1.maxLocals];
      LabelNode[] var10 = new LabelNode[var6];
      String[] var11 = new String[var1.maxLocals];

      for (int var12 = 0; var12 < var6; var12++) {
         Frame var13 = var5[var12];
         if (var13 != null) {
            LabelNode var14 = null;

            for (int var15 = 0; var15 < var13.getLocals(); var15++) {
               BasicValue var16 = (BasicValue)var13.getLocal(var15);
               if ((var16 != null || var9[var15] != null) && (var16 == null || !var16.equals(var9[var15]))) {
                  if (var14 == null) {
                     AbstractInsnNode var17 = var1.instructions.get(var12);
                     if (var17 instanceof LabelNode) {
                        var14 = (LabelNode)var17;
                     } else {
                        var10[var12] = var14 = new LabelNode();
                     }
                  }

                  if (var16 == null && var9[var15] != null) {
                     var7.add(var8[var15]);
                     var8[var15].end = var14;
                     var8[var15] = null;
                  } else if (var16 != null) {
                     if (var9[var15] != null) {
                        var7.add(var8[var15]);
                        var8[var15].end = var14;
                        var8[var15] = null;
                     }

                     String var25 = var11[var15];
                     Type var18 = var16.getType();
                     if (var18 != null) {
                        var25 = var18.getSort() >= 9 && "null".equals(var18.getInternalName()) ? "Ljava/lang/Object;" : var18.getDescriptor();
                     }

                     var8[var15] = new LocalVariableNode("var" + var15, var25, null, var14, null, var15);
                     if (var25 != null) {
                        var11[var15] = var25;
                     }
                  }

                  var9[var15] = var16;
               }
            }
         }
      }

      LabelNode var22 = null;

      for (int var23 = 0; var23 < var8.length; var23++) {
         if (var8[var23] != null) {
            if (var22 == null) {
               var22 = new LabelNode();
               var1.instructions.add(var22);
            }

            var8[var23].end = var22;
            var7.add(var8[var23]);
         }
      }

      for (int var24 = var6 - 1; var24 >= 0; var24--) {
         if (var10[var24] != null) {
            var1.instructions.insert(var1.instructions.get(var24), var10[var24]);
         }
      }

      return var7;
   }

   private static AbstractInsnNode nextNode(InsnList var0, AbstractInsnNode var1) {
      int var2 = var0.indexOf(var1) + 1;
      return var2 > 0 && var2 < var0.size() ? var0.get(var2) : var1;
   }

   private static int getAdjustedFrameSize(int var0, FrameNode var1, int var2) {
      return getAdjustedFrameSize(var0, var1.type, computeFrameSize(var1, var2), var2);
   }

   private static int getAdjustedFrameSize(int var0, ClassInfo.FrameData var1, int var2) {
      return getAdjustedFrameSize(var0, var1.type, var1.size, var2);
   }

   private static int getAdjustedFrameSize(int var0, int var1, int var2, int var3) {
      switch (var1) {
         case -1:
         case 0:
            return Math.max(var3, var2);
         case 1:
            return var0 + var2;
         case 2:
            return Math.max(var3, var0 - var2);
         case 3:
         case 4:
            return var0;
         default:
            return var0;
      }
   }

   public static int computeFrameSize(FrameNode var0, int var1) {
      if (var0.local == null) {
         return var1;
      }

      int var2 = 0;

      for (Object var4 : var0.local) {
         if (var4 instanceof Integer) {
            var2 += var4 != Opcodes.DOUBLE && var4 != Opcodes.LONG ? 1 : 2;
         } else {
            var2++;
         }
      }

      return Math.max(var1, var2);
   }

   public static String getFrameTypeName(Object var0) {
      if (var0 == null) {
         return "NULL";
      } else if (var0 instanceof String) {
         return Bytecode.getSimpleName(var0.toString());
      } else if (var0 instanceof Integer) {
         int var1 = (Integer)var0;
         return var1 >= FRAME_TYPES.length ? "INVALID" : FRAME_TYPES[var1];
      } else {
         return "?";
      }
   }

   public static class Settings {
      public static int RESURRECT_FOR_BOGUS_TOP = 1;
      public static int RESURRECT_EXPOSED_ON_LOAD = 2;
      public static int RESURRECT_EXPOSED_ON_STORE = 4;
      public static int DEFAULT_FLAGS = RESURRECT_FOR_BOGUS_TOP | RESURRECT_EXPOSED_ON_LOAD | RESURRECT_EXPOSED_ON_STORE;
      public static Locals.Settings DEFAULT = new Locals.Settings(DEFAULT_FLAGS, 0, -1, 1, -1, -1);
      final int flags;
      final int flagsCustom;
      final int choppedInsnThreshold;
      final int choppedFrameThreshold;
      final int trimmedInsnThreshold;
      final int trimmedFrameThreshold;

      public Settings(int var1, int var2, int var3, int var4) {
         this(var1, var2, var3, var4, var3, var4);
      }

      public Settings(int var1, int var2, int var3, int var4, int var5, int var6) {
         this.flags = var1;
         this.flagsCustom = var2;
         this.choppedInsnThreshold = var3;
         this.choppedFrameThreshold = var4;
         this.trimmedInsnThreshold = var5;
         this.trimmedFrameThreshold = var6;
      }

      boolean hasFlags(int var1) {
         return (this.flags & var1) == var1;
      }
   }

   public static class SyntheticLocalVariableNode extends LocalVariableNode {
      public SyntheticLocalVariableNode(String var1, String var2, String var3, LabelNode var4, LabelNode var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }
   }

   static class ZombieLocalVariableNode extends LocalVariableNode {
      final LocalVariableNode ancestor;
      final char type;
      int lifetime;
      int frames;

      ZombieLocalVariableNode(LocalVariableNode var1, char var2) {
         super(var1.name, var1.desc, var1.signature, var1.start, var1.end, var1.index);
         this.ancestor = var1;
         this.type = var2;
      }

      boolean checkResurrect(Locals.Settings var1) {
         int var2 = this.type == 'C' ? var1.choppedInsnThreshold : var1.trimmedInsnThreshold;
         if (var2 > -1 && this.lifetime > var2) {
            return false;
         }

         int var3 = this.type == 'C' ? var1.choppedFrameThreshold : var1.trimmedFrameThreshold;
         return var3 == -1 || this.frames <= var3;
      }

      static Locals.ZombieLocalVariableNode of(LocalVariableNode var0, char var1) {
         if (var0 instanceof Locals.ZombieLocalVariableNode) {
            return (Locals.ZombieLocalVariableNode)var0;
         } else {
            return var0 != null ? new Locals.ZombieLocalVariableNode(var0, var1) : null;
         }
      }

      @Override
      public String toString() {
         return String.format("Z(%s,%-2d)", this.type, this.lifetime);
      }
   }
}
