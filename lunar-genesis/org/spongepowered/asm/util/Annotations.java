package org.spongepowered.asm.util;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.common.collect.Lists;

public final class Annotations {
   private static final Class<?>[] MERGEABLE_MIXIN_ANNOTATIONS = new Class[]{Overwrite.class, Intrinsic.class, Final.class, Debug.class};
   private static Pattern mergeableAnnotationPattern = getMergeableAnnotationPattern();

   private Annotations() {
   }

   public static IAnnotationHandle handleOf(Object var0) {
      if (var0 instanceof IAnnotationHandle) {
         return (IAnnotationHandle)var0;
      } else if (var0 instanceof AnnotationNode) {
         return new Annotations.Handle((AnnotationNode)var0);
      } else if (var0 == null) {
         return null;
      } else {
         throw new IllegalArgumentException("Unsupported annotation type: " + var0.getClass().getName());
      }
   }

   public static String getDesc(Class<? extends Annotation> var0) {
      return Type.getType(var0).getInternalName();
   }

   public static String getSimpleName(Class<? extends Annotation> var0) {
      return var0.getSimpleName();
   }

   public static String getSimpleName(AnnotationNode var0) {
      return Bytecode.getSimpleName(var0.desc);
   }

   public static void setVisible(FieldNode var0, Class<? extends Annotation> var1, Object... var2) {
      AnnotationNode var3 = createNode(Type.getDescriptor(var1), var2);
      var0.visibleAnnotations = add(var0.visibleAnnotations, var3);
   }

   public static void setInvisible(FieldNode var0, Class<? extends Annotation> var1, Object... var2) {
      AnnotationNode var3 = createNode(Type.getDescriptor(var1), var2);
      var0.invisibleAnnotations = add(var0.invisibleAnnotations, var3);
   }

   public static void setVisible(MethodNode var0, Class<? extends Annotation> var1, Object... var2) {
      AnnotationNode var3 = createNode(Type.getDescriptor(var1), var2);
      var0.visibleAnnotations = add(var0.visibleAnnotations, var3);
   }

   public static void setInvisible(MethodNode var0, Class<? extends Annotation> var1, Object... var2) {
      AnnotationNode var3 = createNode(Type.getDescriptor(var1), var2);
      var0.invisibleAnnotations = add(var0.invisibleAnnotations, var3);
   }

   private static AnnotationNode createNode(String var0, Object... var1) {
      AnnotationNode var2 = new AnnotationNode(var0);

      for (int var3 = 0; var3 < var1.length - 1; var3 += 2) {
         if (!(var1[var3] instanceof String)) {
            throw new IllegalArgumentException(
               "Annotation keys must be strings, found "
                  + var1[var3].getClass().getSimpleName()
                  + " with "
                  + var1[var3].toString()
                  + " at index "
                  + var3
                  + " creating "
                  + var0
            );
         }

         var2.visit((String)var1[var3], var1[var3 + 1]);
      }

      return var2;
   }

   private static List<AnnotationNode> add(List<AnnotationNode> var0, AnnotationNode var1) {
      if (var0 == null) {
         var0 = new ArrayList(1);
      } else {
         var0.remove(get(var0, var1.desc));
      }

      var0.add(var1);
      return var0;
   }

   public static AnnotationNode getVisible(FieldNode var0, Class<? extends Annotation> var1) {
      return get(var0.visibleAnnotations, Type.getDescriptor(var1));
   }

   public static AnnotationNode getInvisible(FieldNode var0, Class<? extends Annotation> var1) {
      return get(var0.invisibleAnnotations, Type.getDescriptor(var1));
   }

   public static AnnotationNode getVisible(MethodNode var0, Class<? extends Annotation> var1) {
      return get(var0.visibleAnnotations, Type.getDescriptor(var1));
   }

   public static AnnotationNode getInvisible(MethodNode var0, Class<? extends Annotation> var1) {
      return get(var0.invisibleAnnotations, Type.getDescriptor(var1));
   }

   public static AnnotationNode getSingleVisible(MethodNode var0, Class<? extends Annotation>... var1) {
      return getSingle(var0.visibleAnnotations, var1);
   }

   public static AnnotationNode getSingleInvisible(MethodNode var0, Class<? extends Annotation>... var1) {
      return getSingle(var0.invisibleAnnotations, var1);
   }

   public static AnnotationNode getVisible(ClassNode var0, Class<? extends Annotation> var1) {
      return get(var0.visibleAnnotations, Type.getDescriptor(var1));
   }

   public static AnnotationNode getInvisible(ClassNode var0, Class<? extends Annotation> var1) {
      return get(var0.invisibleAnnotations, Type.getDescriptor(var1));
   }

   public static AnnotationNode getVisibleParameter(MethodNode var0, Class<? extends Annotation> var1, int var2) {
      return var2 < 0 ? getVisible(var0, var1) : getParameter(var0.visibleParameterAnnotations, Type.getDescriptor(var1), var2);
   }

   public static AnnotationNode getInvisibleParameter(MethodNode var0, Class<? extends Annotation> var1, int var2) {
      return var2 < 0 ? getInvisible(var0, var1) : getParameter(var0.invisibleParameterAnnotations, Type.getDescriptor(var1), var2);
   }

   public static AnnotationNode getParameter(List<AnnotationNode>[] var0, String var1, int var2) {
      return var0 != null && var2 >= 0 && var2 < var0.length ? get(var0[var2], var1) : null;
   }

   public static AnnotationNode get(List<AnnotationNode> var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (AnnotationNode var3 : var0) {
         if (var1.equals(var3.desc)) {
            return var3;
         }
      }

      return null;
   }

   private static AnnotationNode getSingle(List<AnnotationNode> var0, Class<? extends Annotation>[] var1) {
      ArrayList var2 = new ArrayList();

      for (Class var6 : var1) {
         AnnotationNode var7 = get(var0, Type.getDescriptor(var6));
         if (var7 != null) {
            var2.add(var7);
         }
      }

      int var8 = var2.size();
      if (var8 > 1) {
         throw new IllegalArgumentException(
            "Conflicting annotations found: " + Lists.<AnnotationNode, String>transform(var2, new Function<AnnotationNode, String>() {
               public String apply(AnnotationNode var1) {
                  return var1.desc;
               }
            })
         );
      } else {
         return var8 == 0 ? null : (AnnotationNode)var2.get(0);
      }
   }

   public static <T> T getValue(AnnotationNode var0) {
      return getValue(var0, "value");
   }

   public static <T> T getValue(AnnotationNode var0, String var1, T var2) {
      Object var3 = getValue(var0, var1);
      return (T)(var3 != null ? var3 : var2);
   }

   public static <T> T getValue(AnnotationNode var0, String var1, Class<?> var2) {
      Preconditions.checkNotNull(var2, "annotationClass cannot be null");
      Object var3 = getValue(var0, var1);
      if (var3 == null) {
         try {
            var3 = var2.getDeclaredMethod(var1).getDefaultValue();
         } catch (NoSuchMethodException var5) {
         }
      }

      return (T)var3;
   }

   public static <T> T getValue(AnnotationNode var0, String var1) {
      if (var0 != null && var0.values != null) {
         for (byte var2 = 0; var2 < var0.values.size() - 1; var2 += 2) {
            if (var0.values.get(var2).equals(var1)) {
               return (T)var0.values.get(var2 + 1);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static <T extends Enum<T>> T getValue(AnnotationNode var0, String var1, Class<T> var2, T var3) {
      String[] var4 = getValue(var0, var1);
      return (T)(var4 == null ? var3 : toEnumValue(var2, var4));
   }

   public static <T> List<T> getValue(AnnotationNode var0, String var1, boolean var2) {
      Object var3 = getValue(var0, var1);
      if (var3 instanceof List) {
         return (List<T>)var3;
      } else if (var3 != null) {
         ArrayList var4 = new ArrayList();
         var4.add(var3);
         return var4;
      } else {
         return Collections.emptyList();
      }
   }

   public static <T extends Enum<T>> List<T> getValue(AnnotationNode var0, String var1, boolean var2, Class<T> var3) {
      Object var4 = getValue(var0, var1);
      if (!(var4 instanceof List)) {
         if (var4 instanceof String[]) {
            ArrayList var6 = new ArrayList();
            var6.add(toEnumValue(var3, (String[])var4));
            return var6;
         } else {
            return Collections.emptyList();
         }
      } else {
         ListIterator var5 = ((List)var4).listIterator();

         while (var5.hasNext()) {
            var5.set(toEnumValue(var3, (String[])var5.next()));
         }

         return (List<T>)var4;
      }
   }

   public static void setValue(AnnotationNode var0, String var1, Object var2) {
      if (var0 != null) {
         int var3 = 0;
         if (var0.values != null) {
            for (byte var4 = 0; var4 < var0.values.size() - 1; var4 += 2) {
               String var5 = var0.values.get(var4).toString();
               if (var1.equals(var5)) {
                  var3 = var4 + 1;
                  break;
               }
            }
         } else {
            var0.values = new ArrayList<>();
         }

         if (var3 > 0) {
            var0.values.set(var3, packValue(var2));
         } else {
            var0.values.add(var1);
            var0.values.add(packValue(var2));
         }
      }
   }

   private static Object packValue(Object var0) {
      Class var1 = var0.getClass();
      return var1.isEnum() ? new String[]{Type.getDescriptor(var1), var0.toString()} : var0;
   }

   public static void merge(ClassNode var0, ClassNode var1) {
      var1.visibleAnnotations = merge(var0.visibleAnnotations, var1.visibleAnnotations, "class", var0.name);
      var1.invisibleAnnotations = merge(var0.invisibleAnnotations, var1.invisibleAnnotations, "class", var0.name);
   }

   public static void merge(MethodNode var0, MethodNode var1) {
      var1.visibleAnnotations = merge(var0.visibleAnnotations, var1.visibleAnnotations, "method", var0.name);
      var1.invisibleAnnotations = merge(var0.invisibleAnnotations, var1.invisibleAnnotations, "method", var0.name);
   }

   public static void merge(FieldNode var0, FieldNode var1) {
      var1.visibleAnnotations = merge(var0.visibleAnnotations, var1.visibleAnnotations, "field", var0.name);
      var1.invisibleAnnotations = merge(var0.invisibleAnnotations, var1.invisibleAnnotations, "field", var0.name);
   }

   private static List<AnnotationNode> merge(List<AnnotationNode> var0, List<AnnotationNode> var1, String var2, String var3) {
      try {
         if (var0 == null) {
            return var1;
         }

         if (var1 == null) {
            var1 = new ArrayList();
         }

         for (AnnotationNode var5 : var0) {
            if (isMergeableAnnotation(var5)) {
               Iterator var6 = var1.iterator();

               while (var6.hasNext()) {
                  if (((AnnotationNode)var6.next()).desc.equals(var5.desc)) {
                     var6.remove();
                     break;
                  }
               }

               var1.add(var5);
            }
         }
      } catch (Exception var7) {
         MixinService.getService().getLogger("mixin").warn("Exception encountered whilst merging annotations for {} {}", var2, var3);
      }

      return var1;
   }

   private static boolean isMergeableAnnotation(AnnotationNode var0) {
      return var0.desc.startsWith("L" + Constants.MIXIN_PACKAGE_REF) ? mergeableAnnotationPattern.matcher(var0.desc).matches() : true;
   }

   private static Pattern getMergeableAnnotationPattern() {
      StringBuilder var0 = new StringBuilder("^L(");

      for (int var1 = 0; var1 < MERGEABLE_MIXIN_ANNOTATIONS.length; var1++) {
         if (var1 > 0) {
            var0.append('|');
         }

         var0.append(MERGEABLE_MIXIN_ANNOTATIONS[var1].getName().replace('.', '/'));
      }

      return Pattern.compile(var0.append(");$").toString());
   }

   private static <T extends Enum<T>> T toEnumValue(Class<T> var0, String[] var1) {
      if (!var0.getName().equals(Type.getType(var1[0]).getClassName())) {
         throw new IllegalArgumentException("The supplied enum class does not match the stored enum value");
      } else {
         return Enum.valueOf(var0, var1[1]);
      }
   }

   public static class Handle implements IAnnotationHandle {
      private final AnnotationNode annotation;

      Handle(AnnotationNode var1) {
         Preconditions.checkNotNull(var1, "annotation");
         this.annotation = var1;
      }

      @Override
      public boolean exists() {
         return true;
      }

      public AnnotationNode getNode() {
         return this.annotation;
      }

      @Override
      public String getDesc() {
         return Type.getType(this.annotation.desc).getInternalName();
      }

      @Override
      public List<IAnnotationHandle> getAnnotationList(String var1) {
         List var2 = Annotations.getValue(this.annotation, var1, false);
         ArrayList var3 = new ArrayList();
         if (var2 != null) {
            for (AnnotationNode var5 : var2) {
               var3.add(new Annotations.Handle(var5));
            }
         }

         return var3;
      }

      @Override
      public Type getTypeValue(String var1) {
         return this.getValue(var1, Type.VOID_TYPE);
      }

      @Override
      public List<Type> getTypeList(String var1) {
         return this.getList(var1);
      }

      @Override
      public IAnnotationHandle getAnnotation(String var1) {
         AnnotationNode var2 = Annotations.getValue(this.annotation, var1);
         return var2 != null ? new Annotations.Handle(var2) : null;
      }

      @Override
      public <T> T getValue(String var1, T var2) {
         return Annotations.getValue(this.annotation, var1, (T)var2);
      }

      @Override
      public <T> T getValue() {
         return this.getValue("value", null);
      }

      @Override
      public <T> T getValue(String var1) {
         return this.getValue(var1, null);
      }

      @Override
      public boolean getBoolean(String var1, boolean var2) {
         return this.getValue(var1, var2);
      }

      @Override
      public <T> List<T> getList() {
         return this.getList("value");
      }

      @Override
      public <T> List<T> getList(String var1) {
         return Annotations.getValue(this.annotation, var1, false);
      }

      @Override
      public String toString() {
         return "@" + Annotations.getSimpleName(this.annotation);
      }
   }
}
