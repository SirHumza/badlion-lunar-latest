package com.moonsworth.lunar.ichor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import lombok.Generated;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.bombe.type.BaseType;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.ObjectType;
import org.cadixdev.bombe.type.VoidType;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.util.Bytecode;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final int IORHHHCIICRIOORCICROCHRHOCHORO = 589824;
   private static final Map<ClassProvider, com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, String>> IHIHRCCIHRIHRCHCRCHCOCCHRORCIO = new ConcurrentHashMap<>();

   private static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, String> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      ClassProvider var0
   ) {
      return IHIHRCCIHRIHRCHCRCHCOCCHRORCIO.computeIfAbsent(
         var0,
         var0x -> com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHRCCIIHCHIIRORORRICRHOIOOCHRH()
            .RICHHRCCHRIICHROOROCCICOIRRHCR(1000L)
            .IORHOHCHRIRRHCOROIORRHIHHROHIH()
            .HORIRRHCOHOHHRIRHRIOIIRCCHRHCO(4)
            .IHIHOIOHCOOORRHIICCROCHRCOIHHO()
      );
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var0, ClassNode var1) {
      var0.name = var1.name;
      var0.superName = var1.superName;
      var0.fields = var1.fields;
      var0.access = var1.access;
      var0.attrs = var1.attrs;
      var0.methods = var1.methods;
      var0.innerClasses = var1.innerClasses;
      var0.interfaces = var1.interfaces;
      var0.invisibleAnnotations = var1.invisibleAnnotations;
      var0.outerClass = var1.outerClass;
      var0.signature = var1.signature;
      var0.outerMethod = var1.outerMethod;
      var0.outerMethodDesc = var1.outerMethodDesc;
      var0.module = var1.module;
      var0.sourceFile = var1.sourceFile;
      var0.sourceDebug = var1.sourceDebug;
      var0.visibleAnnotations = var1.visibleAnnotations;
      var0.visibleTypeAnnotations = var1.visibleTypeAnnotations;
      var0.permittedSubclasses = var1.permittedSubclasses;
   }

   public static int HHRORROHIRIRIHHOOCOIRHCIRHHORI(int var0) {
      return OHHRIOHROOIHOROCIRHCHORIHRRRRI(var0, false);
   }

   public static int OHHRIOHROOIHOROCIRHCHORIHRRRRI(int var0, boolean var1) {
      var0 &= -5;
      var0 &= -3;
      if (var1) {
         var0 &= -17;
      }

      return var0 | 1;
   }

   public static int RHOCHHIRRCHHHOHOIRROIROHHHIHIO(int var0, boolean var1) {
      var0 &= -5;
      var0 &= -2;
      if (var1) {
         var0 &= -17;
      }

      return var0 | 2;
   }

   public static Optional<String> IOIOHIORIROHRRCOOOHCROHORCOIIH(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         final String[] var1 = new String[1];
         ClassVisitor var2 = new ClassVisitor(589824) {
            @Override
            public void visit(int var1x, int var2x, String var3, String var4, String var5, String[] var6) {
               var1[0] = var3;
            }
         };
         ClassReader var3 = new ClassReader(var0);
         var3.accept(var2, 1);
         return Optional.ofNullable(var1[0]);
      } else {
         return Optional.empty();
      }
   }

   public static Optional<String> IIOCHOIICCIORCOROIROHICCHIOHIC(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         final String[] var1 = new String[1];
         ClassVisitor var2 = new ClassVisitor(589824) {
            @Override
            public void visit(int var1x, int var2x, String var3, String var4, String var5, String[] var6) {
               if (var5 != null) {
                  var1[0] = var5;
               }
            }
         };
         ClassReader var3 = new ClassReader(var0);
         var3.accept(var2, 1);
         return Optional.ofNullable(var1[0]);
      } else {
         return Optional.empty();
      }
   }

   public static Set<String> RICRIHOOHROHICCHHIIHRHCORHIOHR(byte[] var0) {
      final HashSet var1 = new HashSet();
      if (var0 == null) {
         return var1;
      }

      ClassVisitor var2 = new ClassVisitor(589824) {
         @Override
         public void visit(int var1x, int var2x, String var3, String var4, String var5, String[] var6) {
            if (var5 != null) {
               var1.add(var5);
            }

            if (var6 != null) {
               Collections.addAll(var1, var6);
            }
         }
      };
      ClassReader var3 = new ClassReader(var0);
      var3.accept(var2, 1);
      return var1;
   }

   public static Set<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, ClassProvider var1) {
      Set var2 = HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1.getAsNode(var0));
      HashSet var3 = new HashSet(var2);

      for (String var5 : var2) {
         if (!var5.equals("java/lang/Object")) {
            var3.addAll(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1));
         }
      }

      return var3;
   }

   public static Set<String> HICRRICCHCCROOHHCHOCOCCHOIHHOC(ClassNode var0) {
      HashSet var1 = new HashSet();
      if (var0 == null) {
         return var1;
      }

      String var2 = var0.superName;
      if (var2 != null) {
         var1.add(var2);
      }

      List var3 = var0.interfaces;
      if (var3 != null) {
         var1.addAll(var3);
      }

      return var1;
   }

   public static Set<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InheritanceProvider.ClassInfo var0) {
      HashSet var1 = new HashSet();
      if (var0 == null) {
         return var1;
      }

      String var2 = var0.getSuperName();
      if (var2 != null) {
         var1.add(var2);
      }

      List var3 = var0.getInterfaces();
      if (var3 != null) {
         var1.addAll(var3);
      }

      return var1;
   }

   public static Set<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, InheritanceProvider var1) {
      Set var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.provide(var0).orElse(null));
      HashSet var3 = new HashSet(var2);

      for (String var5 : var2) {
         if (!var5.equals("java/lang/Object")) {
            var3.addAll(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1));
         }
      }

      return var3;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, String var1, ClassProvider var2) {
      try {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var2
         );
         String var4 = var3.get(var0, () -> {
            ClassNode var2x = var2.getAsNode(var0);
            if (var2x == null) {
               return "";
            }

            String var3x = var2x.superName;
            return var3x == null ? "" : var3x;
         });

         while (var4.length() > 0) {
            if (var4.equals(var1)) {
               return true;
            }

            String var5 = var4;
            var4 = var3.get(var4, () -> {
               ClassNode var2x = var2.getAsNode(var5);
               if (var2x == null) {
                  return "";
               }

               String var3x = var2x.superName;
               return var3x == null ? "" : var3x;
            });
         }

         return false;
      } catch (Throwable var6) {
         throw var6;
      }
   }

   public static Set<String> RIIHIHHCRHCHRCICHOROHCHIIHCICH(byte[] var0) {
      final HashSet var1 = new HashSet();
      if (var0 == null) {
         return var1;
      }

      ClassVisitor var2 = new ClassVisitor(589824) {
         @Override
         public void visitInnerClass(String var1x, String var2x, String var3, int var4) {
            var1.add(var1x);
         }
      };
      ClassReader var3 = new ClassReader(var0);
      var3.accept(var2, 1);
      return var1;
   }

   public static Set<String> IHIIIRHOOCHRCCCCIORIROCOIRRHCC(byte[] var0) {
      final HashSet var1 = new HashSet();
      if (var0 == null) {
         return var1;
      }

      ClassVisitor var2 = new ClassVisitor(589824) {
         @Override
         public void visitInnerClass(String var1x, String var2x, String var3, int var4) {
            var1.add(var1x);
         }

         @Override
         public MethodVisitor visitMethod(int var1x, String var2x, String var3, String var4, String[] var5) {
            MethodDescriptor var6 = MethodDescriptor.of(var3);

            for (FieldType var8 : var6.getParamTypes()) {
               if (var8 instanceof ObjectType var9) {
                  var1.add(var9.getClassName());
               }
            }

            if (var6.getReturnType() instanceof ObjectType var11) {
               var1.add(var11.getClassName());
            }

            return new MethodVisitor(589824) {
               @Override
               public void visitMethodInsn(int var1x, String var2x, String var3x, String var4x, boolean var5x) {
                  var1.add(var2x);
               }
            };
         }

         @Override
         public FieldVisitor visitField(int var1x, String var2x, String var3, String var4, Object var5) {
            Type var6 = Type.getType(var3);
            if (var6.getSort() == 10) {
               var1.add(var6.getInternalName());
            }

            return null;
         }
      };
      ClassReader var3 = new ClassReader(var0);
      var3.accept(var2, 0);
      return var1;
   }

   public static ClassNode RHOCHHIRRCHHHOHOIRROIROHHHIHIO(byte[] var0, int var1) {
      ClassNode var2 = new ClassNode();
      ClassReader var3 = new ClassReader(var0);
      var3.accept(var2, var1);
      return var2;
   }

   public static boolean RIROICHCRROROHCCROOCCCCOCHCCRI(ClassNode var0) {
      for (Entry var2 : com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0)
         .entrySet()) {
         AnnotationNode var3 = (AnnotationNode)var2.getKey();
         if (var3.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
            return true;
         }
      }

      return false;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var0, Class<?> var1) {
      if (var0.visibleAnnotations != null) {
         String var2 = Type.getDescriptor(var1);

         for (AnnotationNode var4 : var0.visibleAnnotations) {
            if (var4.desc.equals(var2)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(ClassNode var0, String var1) {
      if (var0.visibleAnnotations != null) {
         for (AnnotationNode var3 : var0.visibleAnnotations) {
            if (var3.desc.equals(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FieldNode var0, Class<?> var1) {
      if (var0.visibleAnnotations != null) {
         String var2 = Type.getDescriptor(var1);

         for (AnnotationNode var4 : var0.visibleAnnotations) {
            if (var4.desc.equals(var2)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FieldNode var0, String var1) {
      if (var0.visibleAnnotations != null) {
         for (AnnotationNode var3 : var0.visibleAnnotations) {
            if (var3.desc.equals(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MethodNode var0, Class<?> var1) {
      if (var0.visibleAnnotations != null) {
         String var2 = Type.getDescriptor(var1);

         for (AnnotationNode var4 : var0.visibleAnnotations) {
            if (var4.desc.equals(var2)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MethodNode var0, String var1) {
      if (var0.visibleAnnotations != null) {
         for (AnnotationNode var3 : var0.visibleAnnotations) {
            if (var3.desc.equals(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(MethodNode var0, String var1) {
      if (var0.invisibleAnnotations != null) {
         for (AnnotationNode var3 : var0.invisibleAnnotations) {
            if (var3.desc.equals(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   public static AnnotationNode RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var0, Class<?> var1) {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, Type.getDescriptor(var1));
   }

   @Nullable
   public static AnnotationNode RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Object var0, String var1) {
      Object var2 = null;
      if (var0 instanceof ClassNode var4) {
         var2 = var4.visibleAnnotations;
      } else if (var0 instanceof MethodNode var5) {
         var2 = var5.visibleAnnotations;
      } else {
         if (!(var0 instanceof FieldNode var3)) {
            throw new IllegalArgumentException("Can't handle " + var0.getClass().getName());
         }

         var2 = var3.visibleAnnotations;
      }

      if (var2 != null) {
         for (AnnotationNode var8 : var2) {
            if (var8.desc.equals(var1)) {
               return var8;
            }
         }
      }

      return null;
   }

   @Nullable
   public static AnnotationNode IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object var0, Class<?> var1) {
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, Type.getDescriptor(var1));
   }

   @Nullable
   public static AnnotationNode HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Object var0, String var1) {
      Object var2 = null;
      if (var0 instanceof ClassNode var4) {
         var2 = var4.invisibleAnnotations;
      } else if (var0 instanceof MethodNode var5) {
         var2 = var5.invisibleAnnotations;
      } else {
         if (!(var0 instanceof FieldNode var3)) {
            throw new IllegalArgumentException("Can't handle " + var0.getClass().getName());
         }

         var2 = var3.invisibleAnnotations;
      }

      if (var2 != null) {
         for (AnnotationNode var8 : var2) {
            if (var8.desc.equals(var1)) {
               return var8;
            }
         }
      }

      return null;
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Object var0, Class<?> var1) {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, Type.getDescriptor(var1));
   }

   public static void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Object var0, String var1) {
      List var2 = null;
      if (var0 instanceof ClassNode var4) {
         var2 = var4.visibleAnnotations;
      } else if (var0 instanceof MethodNode var5) {
         var2 = var5.visibleAnnotations;
      } else {
         if (!(var0 instanceof FieldNode var3)) {
            throw new IllegalArgumentException("Can't handle " + var0.getClass().getName());
         }

         var2 = var3.visibleAnnotations;
      }

      if (var2 != null) {
         var2.removeIf(var1x -> var1x.desc.equals(var1));
      }
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(Object var0, Class<?> var1) {
      CORCOCICIRIOHROHROIIOOHICCHCRR(var0, Type.getDescriptor(var1));
   }

   public static void CORCOCICIRIOHROHROIIOOHICCHCRR(Object var0, String var1) {
      List var2 = null;
      if (var0 instanceof ClassNode var4) {
         var2 = var4.invisibleAnnotations;
      } else if (var0 instanceof MethodNode var5) {
         var2 = var5.invisibleAnnotations;
      } else {
         if (!(var0 instanceof FieldNode var3)) {
            throw new IllegalArgumentException("Can't handle " + var0.getClass().getName());
         }

         var2 = var3.invisibleAnnotations;
      }

      if (var2 != null) {
         var2.removeIf(var1x -> var1x.desc.equals(var1));
      }
   }

   public static byte[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var0, ClassLoader var1, int var2) {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = new OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var2);
      var0.accept(var3);
      return var3.toByteArray();
   }

   public static boolean isStatic(int var0) {
      return (var0 & 8) > 0;
   }

   public static boolean IHIRRIIORRHORHRORIHOROIRCORCOO(ClassNode var0) {
      return (var0.access & 512) > 0;
   }

   @Nullable
   public static Integer HHCCIRHCCCIIRHCROHIORHIRHHIORH(AbstractInsnNode var0) {
      int var1 = var0.getOpcode();
      if (var1 >= 2 && var1 <= 8) {
         return var1 - 3;
      } else if (var0 instanceof IntInsnNode var2 && var1 != 188) {
         return var2.operand;
      } else {
         return var0 instanceof LdcInsnNode var3 && var3.cst instanceof Integer var4 ? var4 : null;
      }
   }

   @Nullable
   public static Long CRRRICCRROCOHHOHIICIHORCOORRRH(AbstractInsnNode var0) {
      int var1 = var0.getOpcode();
      if (var1 == 9) {
         return 0L;
      } else if (var1 == 10) {
         return 1L;
      } else {
         return var0 instanceof LdcInsnNode var2 && var2.cst instanceof Long var3 ? var3 : null;
      }
   }

   @Nullable
   public static Float RRCRRCORICCHOHHIRCHIROOHIIOHCO(AbstractInsnNode var0) {
      int var1 = var0.getOpcode();
      if (var1 >= 11 && var1 <= 13) {
         return (float)(var1 - 11);
      } else {
         return var0 instanceof LdcInsnNode var2 && var2.cst instanceof Float var3 ? var3 : null;
      }
   }

   @Nullable
   public static Double RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(AbstractInsnNode var0) {
      int var1 = var0.getOpcode();
      if (var1 == 14) {
         return 0.0;
      } else if (var1 == 15) {
         return 1.0;
      } else {
         return var0 instanceof LdcInsnNode var2 && var2.cst instanceof Double var3 ? var3 : null;
      }
   }

   @Nullable
   public static String HRCHROOHRIHCRCRHRIIROCIRHOIRHH(AbstractInsnNode var0) {
      return var0 instanceof LdcInsnNode var1 && var1.cst instanceof String var2 ? var2 : null;
   }

   public static AbstractInsnNode OHIIRICCHCRHRICOCROIIRHCCCRCIC(int var0) {
      if (var0 >= -1 && var0 <= 5) {
         return new InsnNode(var0 + 3);
      }

      if (var0 >= -128 && var0 <= 127) {
         new IntInsnNode(16, var0);
      } else if (var0 >= -32768 && var0 <= 32767) {
         new IntInsnNode(17, var0);
      }

      return new LdcInsnNode(var0);
   }

   public static AbstractInsnNode RORRCRCHIRCHHOOIHCCHRCHORHCICI(long var0) {
      if (var0 == 0L) {
         return new InsnNode(9);
      } else {
         return var0 == 1L ? new InsnNode(10) : new LdcInsnNode(var0);
      }
   }

   public static Character RICIRORIRHHIHIICHOHROROHRIIOOR(String var0) {
      return switch (var0) {
         case "java/lang/Boolean" -> 'Z';
         case "java/lang/Character" -> 'C';
         case "java/lang/Byte" -> 'B';
         case "java/lang/Short" -> 'S';
         case "java/lang/Integer" -> 'I';
         case "java/lang/Float" -> 'F';
         case "java/lang/Long" -> 'J';
         case "java/lang/Double" -> 'D';
         default -> null;
      };
   }

   public static String IOIICIRIICICIIOORHCIIIIRRIHRHI(char var0) {
      return Bytecode.getUnboxingMethod(Type.getType(String.valueOf(var0)));
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(org.cadixdev.bombe.type.Type var0) {
      if (var0 == VoidType.INSTANCE) {
         return 177;
      } else if (var0 == BaseType.DOUBLE) {
         return 175;
      } else if (var0 == BaseType.LONG) {
         return 173;
      } else if (var0 == BaseType.BOOLEAN || var0 == BaseType.INT || var0 == BaseType.SHORT || var0 == BaseType.BYTE) {
         return 172;
      } else {
         return var0 == BaseType.FLOAT ? 174 : 176;
      }
   }

   public static Optional<Integer> IRCIIHHICIHRCOCRROCOICRIHHCCHH(org.cadixdev.bombe.type.Type var0) {
      if (var0 == VoidType.INSTANCE) {
         return Optional.empty();
      } else if (var0 == BaseType.DOUBLE) {
         return Optional.of(14);
      } else if (var0 == BaseType.LONG) {
         return Optional.of(9);
      } else if (var0 == BaseType.BOOLEAN || var0 == BaseType.INT || var0 == BaseType.SHORT || var0 == BaseType.BYTE) {
         return Optional.of(3);
      } else {
         return var0 == BaseType.FLOAT ? Optional.of(11) : Optional.of(1);
      }
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(org.cadixdev.bombe.type.Type var0) {
      if (var0 == BaseType.DOUBLE) {
         return 24;
      } else if (var0 == BaseType.LONG) {
         return 22;
      } else if (var0 == BaseType.BOOLEAN || var0 == BaseType.INT || var0 == BaseType.SHORT || var0 == BaseType.BYTE) {
         return 21;
      } else {
         return var0 == BaseType.FLOAT ? 23 : 25;
      }
   }

   public static AnnotationNode RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, Map<String, Object> var1) {
      AnnotationNode var2 = new AnnotationNode("L" + var0.getName().replace('.', '/') + ";");
      var2.values = new ArrayList<>();
      var1.forEach((var1x, var2x) -> {
         var2.values.add(var1x);
         var2.values.add(var2x);
      });
      return var2;
   }

   public static FieldNode CRRRICCRROCOHHOHIICIHORCOORRRH(FieldNode var0) {
      return new FieldNode(var0.access, var0.name, var0.desc, var0.signature, var0.value);
   }

   @CORCOCICIRIOHROHROIIOOHICCHCRR
   public static boolean isRecordLazy(Class<?> var0) {
      return var0.getSuperclass() == Record.class;
   }

   @Generated
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
