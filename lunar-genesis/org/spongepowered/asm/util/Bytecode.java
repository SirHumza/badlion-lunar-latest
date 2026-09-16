package org.spongepowered.asm.util;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.TraceClassVisitor;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.MarkerNode;
import org.spongepowered.asm.util.throwables.SyntheticBridgeException;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.collect.Iterators;
import org.spongepowered.include.com.google.common.collect.UnmodifiableIterator;
import org.spongepowered.include.com.google.common.primitives.Ints;

public final class Bytecode {
   public static final int[] CONSTANTS_INT = new int[]{2, 3, 4, 5, 6, 7, 8};
   public static final int[] CONSTANTS_FLOAT = new int[]{11, 12, 13};
   public static final int[] CONSTANTS_DOUBLE = new int[]{14, 15};
   public static final int[] CONSTANTS_LONG = new int[]{9, 10};
   public static final int[] CONSTANTS_ALL = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 192, 193};
   private static final Object[] CONSTANTS_VALUES = new Object[]{Type.VOID_TYPE, -1, 0, 1, 2, 3, 4, 5, 0L, 1L, 0.0F, 1.0F, 2.0F, 0.0, 1.0};
   private static final String[] CONSTANTS_TYPES = new String[]{"V", "I", "I", "I", "I", "I", "I", "I", "J", "J", "F", "F", "F", "D", "D", "I", "I"};
   private static final String[] BOXING_TYPES = new String[]{
      null,
      "java/lang/Boolean",
      "java/lang/Character",
      "java/lang/Byte",
      "java/lang/Short",
      "java/lang/Integer",
      "java/lang/Float",
      "java/lang/Long",
      "java/lang/Double",
      null,
      null,
      null
   };
   private static final String[] UNBOXING_METHODS = new String[]{
      null, "booleanValue", "charValue", "byteValue", "shortValue", "intValue", "floatValue", "longValue", "doubleValue", null, null, null
   };

   private Bytecode() {
   }

   public static MethodNode findMethod(ClassNode var0, String var1, String var2) {
      for (MethodNode var4 : var0.methods) {
         if (var4.name.equals(var1) && var4.desc.equals(var2)) {
            return var4;
         }
      }

      return null;
   }

   public static AbstractInsnNode findInsn(MethodNode var0, int var1) {
      for (AbstractInsnNode var3 : var0.instructions) {
         if (var3.getOpcode() == var1) {
            return var3;
         }
      }

      return null;
   }

   public static Bytecode.DelegateInitialiser findDelegateInit(MethodNode var0, String var1, String var2) {
      if (!"<init>".equals(var0.name)) {
         return Bytecode.DelegateInitialiser.NONE;
      }

      int var3 = 0;

      for (AbstractInsnNode var5 : var0.instructions) {
         if (var5 instanceof TypeInsnNode && var5.getOpcode() == 187) {
            var3++;
         } else if (var5 instanceof MethodInsnNode && var5.getOpcode() == 183) {
            MethodInsnNode var6 = (MethodInsnNode)var5;
            if ("<init>".equals(var6.name)) {
               if (var3 <= 0) {
                  boolean var7 = var6.owner.equals(var1);
                  if (var7 || var6.owner.equals(var2)) {
                     return new Bytecode.DelegateInitialiser(var6, var7);
                  }
               } else {
                  var3--;
               }
            }
         }
      }

      return Bytecode.DelegateInitialiser.NONE;
   }

   public static void textify(ClassNode var0, OutputStream var1) {
      var0.accept(new TraceClassVisitor(new PrintWriter(var1)));
   }

   public static void textify(MethodNode var0, OutputStream var1) {
      TraceClassVisitor var2 = new TraceClassVisitor(new PrintWriter(var1));
      MethodVisitor var3 = var2.visitMethod(var0.access, var0.name, var0.desc, var0.signature, var0.exceptions.toArray(new String[0]));
      var0.accept(var3);
      var2.visitEnd();
   }

   public static void dumpClass(ClassNode var0) {
      ClassWriter var1 = new ClassWriter(3);
      var0.accept(var1);
      dumpClass(var1.toByteArray());
   }

   public static void dumpClass(byte[] var0) {
      ClassReader var1 = new ClassReader(var0);
      CheckClassAdapter.verify(var1, true, new PrintWriter(System.out));
   }

   public static void printMethodWithOpcodeIndices(MethodNode var0) {
      System.err.printf("%s%s\n", var0.name, var0.desc);
      int var1 = 0;
      ListIterator var2 = var0.instructions.iterator();

      while (var2.hasNext()) {
         System.err.printf("[%4d] %s\n", var1++, describeNode((AbstractInsnNode)var2.next()));
      }
   }

   public static void printMethod(MethodNode var0) {
      System.err.printf("%s%s maxStack=%d maxLocals=%d\n", var0.name, var0.desc, var0.maxStack, var0.maxLocals);
      int var1 = 0;
      ListIterator var2 = var0.instructions.iterator();

      while (var2.hasNext()) {
         System.err.printf("%-4d  ", var1++);
         printNode((AbstractInsnNode)var2.next());
      }
   }

   public static void printNode(AbstractInsnNode var0) {
      System.err.printf("%s\n", describeNode(var0));
   }

   public static String describeNode(AbstractInsnNode var0) {
      return describeNode(var0, true);
   }

   public static String describeNode(AbstractInsnNode var0, boolean var1) {
      if (var0 == null) {
         return var1 ? String.format("   %-14s ", "null") : "null";
      }

      if (var0 instanceof MarkerNode) {
         MarkerNode var5 = (MarkerNode)var0;
         return String.format("[%s] Marker type=%d", var5.getLabel(), var5.type);
      }

      if (var0 instanceof LabelNode) {
         return String.format("[%s]", ((LabelNode)var0).getLabel());
      }

      String var2 = String.format(var1 ? "   %-14s " : "%s ", var0.getClass().getSimpleName().replace("Node", ""));
      if (var0 instanceof JumpInsnNode) {
         var2 = var2 + String.format("[%s] [%s]", getOpcodeName(var0), ((JumpInsnNode)var0).label.getLabel());
      } else if (var0 instanceof VarInsnNode) {
         var2 = var2 + String.format("[%s] %d", getOpcodeName(var0), ((VarInsnNode)var0).var);
      } else if (var0 instanceof MethodInsnNode) {
         MethodInsnNode var3 = (MethodInsnNode)var0;
         var2 = var2 + String.format("[%s] %s::%s%s", getOpcodeName(var0), var3.owner, var3.name, var3.desc);
      } else if (var0 instanceof FieldInsnNode) {
         FieldInsnNode var6 = (FieldInsnNode)var0;
         var2 = var2 + String.format("[%s] %s::%s:%s", getOpcodeName(var0), var6.owner, var6.name, var6.desc);
      } else if (var0 instanceof InvokeDynamicInsnNode) {
         InvokeDynamicInsnNode var7 = (InvokeDynamicInsnNode)var0;
         var2 = var2
            + String.format(
               "[%s] %s%s { %s %s::%s%s }",
               getOpcodeName(var0),
               var7.name,
               var7.desc,
               getOpcodeName(var7.bsm.getTag(), Printer.HANDLE_TAG),
               var7.bsm.getOwner(),
               var7.bsm.getName(),
               var7.bsm.getDesc()
            );
      } else if (var0 instanceof LineNumberNode) {
         LineNumberNode var8 = (LineNumberNode)var0;
         var2 = var2 + String.format("LINE=[%d] LABEL=[%s]", var8.line, var8.start.getLabel());
      } else if (var0 instanceof LdcInsnNode) {
         var2 = var2 + ((LdcInsnNode)var0).cst;
      } else if (var0 instanceof IntInsnNode) {
         var2 = var2 + ((IntInsnNode)var0).operand;
      } else if (var0 instanceof FrameNode) {
         var2 = var2 + String.format("[%s] ", getFrameTypeName((FrameNode)var0));
      } else if (var0 instanceof TypeInsnNode) {
         var2 = var2 + String.format("[%s] %s", getOpcodeName(var0), ((TypeInsnNode)var0).desc);
      } else {
         var2 = var2 + String.format("[%s] ", getOpcodeName(var0));
      }

      return var2;
   }

   public static String getOpcodeName(AbstractInsnNode var0) {
      return var0 != null ? getOpcodeName(var0.getOpcode()) : "";
   }

   public static String getOpcodeName(int var0) {
      return getOpcodeName(var0, Printer.OPCODES);
   }

   private static String getOpcodeName(int var0, String[] var1) {
      if (var0 < 0) {
         return "UNKNOWN";
      } else {
         return var0 < var1.length ? var1[var0] : String.valueOf(var0);
      }
   }

   private static String getFrameTypeName(FrameNode var0) {
      switch (var0.type) {
         case -1:
            return "F_NEW";
         case 0:
            return "F_FULL";
         case 1:
            return "F_APPEND";
         case 2:
            return "F_CHOP";
         case 3:
            return "F_SAME";
         case 4:
            return "F_SAME1";
         default:
            return "UNKNOWN";
      }
   }

   public static int parseOpcodeName(String var0) {
      if (var0 == null) {
         return -1;
      }

      if (var0.matches("^1[0-9]{0,2}|[1-9][0-9]?$")) {
         return Integer.parseInt(var0);
      }

      if (var0.startsWith("Opcodes.")) {
         var0 = var0.substring(8);
      }

      return !var0.matches("^[A-Z][A-Z0-9_]+$") ? -1 : parseOpcodeName(var0, Printer.OPCODES);
   }

   private static int parseOpcodeName(String var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var0.equalsIgnoreCase(var1[var2])) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean methodHasLineNumbers(MethodNode var0) {
      ListIterator var1 = var0.instructions.iterator();

      while (var1.hasNext()) {
         if (var1.next() instanceof LineNumberNode) {
            return true;
         }
      }

      return false;
   }

   public static boolean isStatic(MethodNode var0) {
      return (var0.access & 8) == 8;
   }

   public static boolean isStatic(FieldNode var0) {
      return (var0.access & 8) == 8;
   }

   public static int getFirstNonArgLocalIndex(MethodNode var0) {
      return getFirstNonArgLocalIndex(Type.getArgumentTypes(var0.desc), !isStatic(var0));
   }

   public static int getFirstNonArgLocalIndex(Type[] var0, boolean var1) {
      return getArgsSize(var0) + (var1 ? 1 : 0);
   }

   public static int getArgsSize(Type[] var0) {
      return getArgsSize(var0, 0, var0.length);
   }

   public static int getArgsSize(Type[] var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = var1; var4 < var0.length && var4 < var2; var4++) {
         var3 += var0[var4].getSize();
      }

      return var3;
   }

   public static void loadArgs(Type[] var0, InsnList var1, int var2) {
      loadArgs(var0, var1, var2, -1);
   }

   public static void loadArgs(Type[] var0, InsnList var1, int var2, int var3) {
      loadArgs(var0, var1, var2, var3, null);
   }

   public static void loadArgs(Type[] var0, InsnList var1, int var2, int var3, Type[] var4) {
      int var5 = var2;

      for (int var6 = 0; var6 < var0.length; var6++) {
         var1.add(new VarInsnNode(var0[var6].getOpcode(21), var5));
         if (var4 != null && var6 < var4.length && var4[var6] != null) {
            var1.add(new TypeInsnNode(192, var4[var6].getInternalName()));
         }

         var5 += var0[var6].getSize();
         if (var3 >= var2 && var5 >= var3) {
            return;
         }
      }
   }

   public static Type[] getTypes(Class<?>... var0) {
      Type[] var1 = new Type[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = Type.getType(var0[var2]);
      }

      return var1;
   }

   public static Map<LabelNode, LabelNode> cloneLabels(InsnList var0) {
      HashMap var1 = new HashMap();

      for (AbstractInsnNode var3 : var0) {
         if (var3 instanceof LabelNode) {
            var1.put((LabelNode)var3, new LabelNode(((LabelNode)var3).getLabel()));
         }
      }

      return var1;
   }

   public static String generateDescriptor(Type var0, Type... var1) {
      return generateDescriptor(var0, var1);
   }

   public static String generateDescriptor(Object var0, Object... var1) {
      StringBuilder var2 = new StringBuilder().append('(');

      for (Object var6 : var1) {
         var2.append(toDescriptor(var6));
      }

      return var2.append(')').append(var0 != null ? toDescriptor(var0) : "V").toString();
   }

   private static String toDescriptor(Object var0) {
      if (var0 instanceof String) {
         return (String)var0;
      } else if (var0 instanceof Type) {
         return var0.toString();
      } else if (var0 instanceof Class) {
         return Type.getDescriptor((Class<?>)var0);
      } else {
         return var0 == null ? "" : var0.toString();
      }
   }

   public static String getDescriptor(Type... var0) {
      return "(" + Joiner.on("").join(var0) + ")";
   }

   public static String getDescriptor(Type var0, Type... var1) {
      return getDescriptor(var1) + var0.toString();
   }

   public static String changeDescriptorReturnType(String var0, String var1) {
      if (var0 == null || !var0.startsWith("(") || var0.lastIndexOf(41) < 1) {
         return null;
      } else {
         return var1 == null ? var0 : var0.substring(0, var0.lastIndexOf(41) + 1) + var1;
      }
   }

   public static String getSimpleName(Type var0) {
      return var0.getSort() < 9 ? var0.getDescriptor() : getSimpleName(var0.getClassName());
   }

   public static String getSimpleName(String var0) {
      int var1 = Math.max(var0.lastIndexOf(47), 0);
      return var0.substring(var1 + 1).replace(";", "");
   }

   public static boolean isConstant(AbstractInsnNode var0) {
      return var0 == null ? false : Ints.contains(CONSTANTS_ALL, var0.getOpcode());
   }

   public static Object getConstant(AbstractInsnNode var0) {
      if (var0 == null) {
         return null;
      }

      if (var0 instanceof LdcInsnNode) {
         return ((LdcInsnNode)var0).cst;
      }

      if (var0 instanceof IntInsnNode) {
         int var2 = ((IntInsnNode)var0).operand;
         return var0.getOpcode() != 16 && var0.getOpcode() != 17 ? null : var2;
      }

      if (var0 instanceof TypeInsnNode) {
         return var0.getOpcode() < 192 ? null : Type.getObjectType(((TypeInsnNode)var0).desc);
      }

      int var1 = Ints.indexOf(CONSTANTS_ALL, var0.getOpcode());
      return var1 < 0 ? null : CONSTANTS_VALUES[var1];
   }

   public static Type getConstantType(AbstractInsnNode var0) {
      if (var0 == null) {
         return null;
      }

      if (var0 instanceof LdcInsnNode) {
         Object var2 = ((LdcInsnNode)var0).cst;
         if (var2 instanceof Integer) {
            return Type.getType("I");
         } else if (var2 instanceof Float) {
            return Type.getType("F");
         } else if (var2 instanceof Long) {
            return Type.getType("J");
         } else if (var2 instanceof Double) {
            return Type.getType("D");
         } else if (var2 instanceof String) {
            return Type.getType("Ljava/lang/String;");
         } else if (var2 instanceof Type) {
            return Type.getType("Ljava/lang/Class;");
         } else {
            throw new IllegalArgumentException("LdcInsnNode with invalid payload type " + var2.getClass() + " in getConstant");
         }
      } else {
         if (var0 instanceof TypeInsnNode) {
            return var0.getOpcode() < 192 ? null : Type.getType("Ljava/lang/Class;");
         }

         int var1 = Ints.indexOf(CONSTANTS_ALL, var0.getOpcode());
         return var1 < 0 ? null : Type.getType(CONSTANTS_TYPES[var1]);
      }
   }

   public static boolean hasFlag(ClassNode var0, int var1) {
      return (var0.access & var1) == var1;
   }

   public static boolean hasFlag(MethodNode var0, int var1) {
      return (var0.access & var1) == var1;
   }

   public static boolean hasFlag(FieldNode var0, int var1) {
      return (var0.access & var1) == var1;
   }

   public static boolean compareFlags(MethodNode var0, MethodNode var1, int var2) {
      return hasFlag(var0, var2) == hasFlag(var1, var2);
   }

   public static boolean compareFlags(FieldNode var0, FieldNode var1, int var2) {
      return hasFlag(var0, var2) == hasFlag(var1, var2);
   }

   public static boolean isVirtual(MethodNode var0) {
      return var0 != null && !isStatic(var0) && getVisibility(var0).isAtLeast(Bytecode.Visibility.PROTECTED);
   }

   public static Bytecode.Visibility getVisibility(MethodNode var0) {
      return getVisibility(var0.access & 7);
   }

   public static Bytecode.Visibility getVisibility(FieldNode var0) {
      return getVisibility(var0.access & 7);
   }

   private static Bytecode.Visibility getVisibility(int var0) {
      if ((var0 & 4) != 0) {
         return Bytecode.Visibility.PROTECTED;
      } else if ((var0 & 2) != 0) {
         return Bytecode.Visibility.PRIVATE;
      } else {
         return (var0 & 1) != 0 ? Bytecode.Visibility.PUBLIC : Bytecode.Visibility.PACKAGE;
      }
   }

   public static void setVisibility(ClassNode var0, Bytecode.Visibility var1) {
      var0.access = setVisibility(var0.access, var1.access);
   }

   public static void setVisibility(MethodNode var0, Bytecode.Visibility var1) {
      var0.access = setVisibility(var0.access, var1.access);
   }

   public static void setVisibility(FieldNode var0, Bytecode.Visibility var1) {
      var0.access = setVisibility(var0.access, var1.access);
   }

   public static void setVisibility(ClassNode var0, int var1) {
      var0.access = setVisibility(var0.access, var1);
   }

   public static void setVisibility(MethodNode var0, int var1) {
      var0.access = setVisibility(var0.access, var1);
   }

   public static void setVisibility(FieldNode var0, int var1) {
      var0.access = setVisibility(var0.access, var1);
   }

   private static int setVisibility(int var0, int var1) {
      return var0 & -8 | var1 & 7;
   }

   public static int getMaxLineNumber(ClassNode var0, int var1, int var2) {
      int var3 = 0;

      for (MethodNode var5 : var0.methods) {
         for (AbstractInsnNode var7 : var5.instructions) {
            if (var7 instanceof LineNumberNode) {
               var3 = Math.max(var3, ((LineNumberNode)var7).line);
            }
         }
      }

      return Math.max(var1, var3 + var2);
   }

   public static String getBoxingType(Type var0) {
      return var0 == null ? null : BOXING_TYPES[var0.getSort()];
   }

   public static String getUnboxingMethod(Type var0) {
      return var0 == null ? null : UNBOXING_METHODS[var0.getSort()];
   }

   public static void compareBridgeMethods(MethodNode var0, MethodNode var1) {
      UnmodifiableIterator var2 = Iterators.filter(var0.instructions.iterator(), Bytecode::isRealInsn);
      UnmodifiableIterator var3 = Iterators.filter(var1.instructions.iterator(), Bytecode::isRealInsn);

      int var4;
      for (var4 = 0; var2.hasNext() && var3.hasNext(); var4++) {
         AbstractInsnNode var5 = (AbstractInsnNode)var2.next();
         AbstractInsnNode var6 = (AbstractInsnNode)var3.next();
         if (var5 instanceof MethodInsnNode) {
            MethodInsnNode var7 = (MethodInsnNode)var5;
            MethodInsnNode var8 = (MethodInsnNode)var6;
            if (!var7.name.equals(var8.name)) {
               throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_INVOKE_NAME, var0.name, var0.desc, var4, var5, var6);
            }

            if (!var7.desc.equals(var8.desc)) {
               throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_INVOKE_DESC, var0.name, var0.desc, var4, var5, var6);
            }
         } else {
            if (var5.getOpcode() != var6.getOpcode()) {
               throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_INSN, var0.name, var0.desc, var4, var5, var6);
            }

            if (var5 instanceof VarInsnNode) {
               VarInsnNode var9 = (VarInsnNode)var5;
               VarInsnNode var11 = (VarInsnNode)var6;
               if (var9.var != var11.var) {
                  throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_LOAD, var0.name, var0.desc, var4, var5, var6);
               }
            } else if (var5 instanceof TypeInsnNode) {
               TypeInsnNode var10 = (TypeInsnNode)var5;
               TypeInsnNode var12 = (TypeInsnNode)var6;
               if (var10.getOpcode() == 192 && !var10.desc.equals(var12.desc)) {
                  throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_CAST, var0.name, var0.desc, var4, var5, var6);
               }
            }
         }
      }

      if (var2.hasNext()) {
         throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_LENGTH, var0.name, var0.desc, var4, (AbstractInsnNode)var2.next(), null);
      }

      if (var3.hasNext()) {
         throw new SyntheticBridgeException(SyntheticBridgeException.Problem.BAD_LENGTH, var0.name, var0.desc, var4, null, (AbstractInsnNode)var3.next());
      }
   }

   private static boolean isRealInsn(AbstractInsnNode var0) {
      return var0.getOpcode() != -1;
   }

   public static void merge(ClassNode var0, ClassNode var1) {
      if (var0 != null) {
         if (var1 == null) {
            throw new NullPointerException("Target ClassNode for merge must not be null");
         }

         var1.version = Math.max(var0.version, var1.version);
         var1.interfaces = merge(var0.interfaces, var1.interfaces);
         var1.invisibleAnnotations = merge(var0.invisibleAnnotations, var1.invisibleAnnotations);
         var1.visibleAnnotations = merge(var0.visibleAnnotations, var1.visibleAnnotations);
         var1.visibleTypeAnnotations = merge(var0.visibleTypeAnnotations, var1.visibleTypeAnnotations);
         var1.invisibleTypeAnnotations = merge(var0.invisibleTypeAnnotations, var1.invisibleTypeAnnotations);
         var1.attrs = merge(var0.attrs, var1.attrs);
         var1.innerClasses = merge(var0.innerClasses, var1.innerClasses);
         var1.fields = merge(var0.fields, var1.fields);
         var1.methods = merge(var0.methods, var1.methods);
      }
   }

   public static void replace(ClassNode var0, ClassNode var1) {
      if (var0 != null) {
         if (var1 == null) {
            throw new NullPointerException("Target ClassNode for replace must not be null");
         }

         var1.name = var0.name;
         var1.signature = var0.signature;
         var1.superName = var0.superName;
         var1.version = var0.version;
         var1.access = var0.access;
         var1.sourceDebug = var0.sourceDebug;
         var1.sourceFile = var0.sourceFile;
         var1.outerClass = var0.outerClass;
         var1.outerMethod = var0.outerMethod;
         var1.outerMethodDesc = var0.outerMethodDesc;
         clear(var1.interfaces);
         clear(var1.visibleAnnotations);
         clear(var1.invisibleAnnotations);
         clear(var1.visibleTypeAnnotations);
         clear(var1.invisibleTypeAnnotations);
         clear(var1.attrs);
         clear(var1.innerClasses);
         clear(var1.fields);
         clear(var1.methods);
         if (ASM.API_VERSION >= 393216) {
            var1.module = var0.module;
         }

         merge(var0, var1);
      }
   }

   private static <T> void clear(List<T> var0) {
      if (var0 != null) {
         var0.clear();
      }
   }

   private static <T> List<T> merge(List<T> var0, List<T> var1) {
      if (var0 == null || var0.isEmpty()) {
         return var1;
      }

      if (var1 == null) {
         return new ArrayList<>(var0);
      }

      var1.addAll(var0);
      return var1;
   }

   public static boolean isEnumValuesArray(FieldNode var0, ClassNode var1) {
      return hasFlag(var0, 4104) && var0.desc.equals("[L" + var1.name + ';');
   }

   public static boolean isEnumConstant(FieldNode var0, ClassNode var1) {
      return hasFlag(var0, 16392) && var0.desc.equals('L' + var1.name + ';');
   }

   public static AbstractInsnNode loadIntConstant(int var0) {
      if (-1 <= var0 && var0 <= 5) {
         return new InsnNode(3 + var0);
      } else if (-128 <= var0 && var0 <= 127) {
         return new IntInsnNode(16, var0);
      } else {
         return -32768 <= var0 && var0 <= 32767 ? new IntInsnNode(17, var0) : new LdcInsnNode(var0);
      }
   }

   public static MethodInsnNode invokeMethod(ClassNode var0, MethodNode var1, MixinTargetContext var2) {
      boolean var3 = hasFlag(var1, 2);
      boolean var4 = hasFlag(var0, 512);
      boolean var5 = hasFlag(var1, 8);
      MixinEnvironment.CompatibilityLevel var6 = MixinEnvironment.CompatibilityLevel.forClassVersion(var2.getMinRequiredClassVersion());
      boolean var7 = var6.supports(8);
      int var8 = var5 ? 184 : (var3 && !var7 ? 183 : (var4 ? 185 : 182));
      return new MethodInsnNode(var8, var0.name, var1.name, var1.desc, var4);
   }

   public static class DelegateInitialiser {
      public static final Bytecode.DelegateInitialiser NONE = new Bytecode.DelegateInitialiser(null, false);
      public final MethodInsnNode insn;
      public final boolean isSuper;
      public final boolean isPresent;

      DelegateInitialiser(MethodInsnNode var1, boolean var2) {
         this.insn = var1;
         this.isSuper = var2;
         this.isPresent = var1 != null;
      }

      @Override
      public String toString() {
         return this.isSuper ? "super" : "this";
      }
   }

   public enum Visibility {
      PRIVATE(2),
      PROTECTED(4),
      PACKAGE(0),
      PUBLIC(1);

      final int access;

      Visibility(int var3) {
         this.access = var3;
      }

      public boolean isAtLeast(Bytecode.Visibility var1) {
         return var1 == null || var1.ordinal() <= this.ordinal();
      }

      public boolean isLessThan(Bytecode.Visibility var1) {
         return var1 != null && this.ordinal() < var1.ordinal();
      }
   }
}
