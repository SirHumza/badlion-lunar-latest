package org.spongepowered.asm.mixin.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.FabricUtil;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.modify.AfterStoreLocal;
import org.spongepowered.asm.mixin.injection.modify.BeforeLoadLocal;
import org.spongepowered.asm.mixin.injection.points.AfterInvoke;
import org.spongepowered.asm.mixin.injection.points.BeforeConstant;
import org.spongepowered.asm.mixin.injection.points.BeforeFieldAccess;
import org.spongepowered.asm.mixin.injection.points.BeforeFinalReturn;
import org.spongepowered.asm.mixin.injection.points.BeforeInvoke;
import org.spongepowered.asm.mixin.injection.points.BeforeNew;
import org.spongepowered.asm.mixin.injection.points.BeforeReturn;
import org.spongepowered.asm.mixin.injection.points.BeforeStringInvoke;
import org.spongepowered.asm.mixin.injection.points.ConstructorHead;
import org.spongepowered.asm.mixin.injection.points.JumpInsnPoint;
import org.spongepowered.asm.mixin.injection.points.MethodHead;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointAnnotationContext;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.struct.AnnotatedMethodInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.IMessageSink;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public abstract class InjectionPoint {
   public static final int DEFAULT_ALLOWED_SHIFT_BY = 0;
   public static final int MAX_ALLOWED_SHIFT_BY = 5;
   private static Map<String, Class<? extends InjectionPoint>> types = new HashMap<>();
   private final String slice;
   private final InjectionPoint.Specifier specifier;
   private final String id;
   private final IMessageSink messageSink;
   private InjectionPoint.RestrictTargetLevel targetRestriction;

   protected InjectionPoint() {
      this("", InjectionPoint.Specifier.DEFAULT, null);
   }

   protected InjectionPoint(InjectionPointData var1) {
      this(var1.getSlice(), var1.getSpecifier(), var1.getId(), var1.getMessageSink(), var1.getTargetRestriction());
   }

   public InjectionPoint(String var1, InjectionPoint.Specifier var2, String var3) {
      this(var1, var2, var3, null);
   }

   public InjectionPoint(String var1, InjectionPoint.Specifier var2, String var3, IMessageSink var4) {
      this(var1, var2, var3, var4, InjectionPoint.RestrictTargetLevel.METHODS_ONLY);
   }

   public InjectionPoint(String var1, InjectionPoint.Specifier var2, String var3, IMessageSink var4, InjectionPoint.RestrictTargetLevel var5) {
      this.slice = var1;
      this.specifier = var2;
      this.id = var3;
      this.messageSink = var4;
      this.targetRestriction = var5;
   }

   public String getSlice() {
      return this.slice;
   }

   public InjectionPoint.Specifier getSpecifier(InjectionPoint.Specifier var1) {
      return this.specifier == InjectionPoint.Specifier.DEFAULT ? var1 : this.specifier;
   }

   public String getId() {
      return this.id;
   }

   protected void addMessage(String var1, Object... var2) {
      if (this.messageSink != null) {
         this.messageSink.addMessage(var1, var2);
      }
   }

   public boolean checkPriority(int var1, int var2) {
      return var1 < var2;
   }

   protected void setTargetRestriction(InjectionPoint.RestrictTargetLevel var1) {
      this.targetRestriction = var1;
   }

   public InjectionPoint.RestrictTargetLevel getTargetRestriction(IInjectionPointContext var1) {
      return this.targetRestriction;
   }

   public abstract boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3);

   @Override
   public String toString() {
      return String.format("@At(\"%s\")", this.getAtCode());
   }

   protected static AbstractInsnNode nextNode(InsnList var0, AbstractInsnNode var1) {
      int var2 = var0.indexOf(var1) + 1;
      return var2 > 0 && var2 < var0.size() ? var0.get(var2) : var1;
   }

   public static InjectionPoint and(InjectionPoint... var0) {
      return new InjectionPoint.Intersection(var0);
   }

   public static InjectionPoint or(InjectionPoint... var0) {
      return new InjectionPoint.Union(var0);
   }

   public static InjectionPoint after(InjectionPoint var0) {
      return new InjectionPoint.Shift(var0, 1);
   }

   public static InjectionPoint before(InjectionPoint var0) {
      return new InjectionPoint.Shift(var0, -1);
   }

   public static InjectionPoint shift(InjectionPoint var0, int var1) {
      return new InjectionPoint.Shift(var0, var1);
   }

   public static List<InjectionPoint> parse(IMixinContext var0, MethodNode var1, AnnotationNode var2, List<AnnotationNode> var3) {
      return parse(new AnnotatedMethodInfo(var0, var1, var2), var3);
   }

   public static List<InjectionPoint> parse(IInjectionPointContext var0, List<AnnotationNode> var1) {
      ImmutableList.Builder var2 = ImmutableList.builder();

      for (AnnotationNode var4 : var1) {
         InjectionPoint var5 = parse(new InjectionPointAnnotationContext(var0, var4, "at"), var4);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2.build();
   }

   public static InjectionPoint parse(IInjectionPointContext var0, At var1) {
      return parse(
         var0,
         var1.value(),
         var1.shift(),
         var1.by(),
         Arrays.asList(var1.args()),
         var1.target(),
         var1.slice(),
         var1.ordinal(),
         var1.opcode(),
         var1.id(),
         InjectionPoint.Flags.parse(var1)
      );
   }

   public static InjectionPoint parse(IMixinContext var0, MethodNode var1, AnnotationNode var2, At var3) {
      return parse(
         new AnnotatedMethodInfo(var0, var1, var2),
         var3.value(),
         var3.shift(),
         var3.by(),
         Arrays.asList(var3.args()),
         var3.target(),
         var3.slice(),
         var3.ordinal(),
         var3.opcode(),
         var3.id(),
         InjectionPoint.Flags.parse(var3)
      );
   }

   public static InjectionPoint parse(IMixinContext var0, MethodNode var1, AnnotationNode var2, AnnotationNode var3) {
      return parse(new InjectionPointAnnotationContext(new AnnotatedMethodInfo(var0, var1, var2), var3, "at"), var3);
   }

   public static InjectionPoint parse(IInjectionPointContext var0, AnnotationNode var1) {
      String var2 = Annotations.getValue(var1, "value");
      List var3 = Annotations.getValue(var1, "args");
      String var4 = Annotations.getValue(var1, "target", "");
      String var5 = Annotations.getValue(var1, "slice", "");
      At.Shift var6 = Annotations.getValue(var1, "shift", At.Shift.class, At.Shift.NONE);
      int var7 = Annotations.getValue(var1, "by", 0);
      int var8 = Annotations.getValue(var1, "ordinal", -1);
      int var9 = Annotations.getValue(var1, "opcode", 0);
      String var10 = Annotations.getValue(var1, "id");
      int var11 = InjectionPoint.Flags.parse(var1);
      if (var3 == null) {
         var3 = ImmutableList.of();
      }

      return parse(var0, var2, var6, var7, var3, var4, var5, var8, var9, var10, var11);
   }

   public static InjectionPoint parse(
      IMixinContext var0,
      MethodNode var1,
      AnnotationNode var2,
      String var3,
      At.Shift var4,
      int var5,
      List<String> var6,
      String var7,
      String var8,
      int var9,
      int var10,
      String var11,
      int var12
   ) {
      return parse(new AnnotatedMethodInfo(var0, var1, var2), var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public static InjectionPoint parse(
      IInjectionPointContext var0,
      String var1,
      At.Shift var2,
      int var3,
      List<String> var4,
      String var5,
      String var6,
      int var7,
      int var8,
      String var9,
      int var10
   ) {
      InjectionPointData var11 = new InjectionPointData(var0, var1, var4, var5, var6, var7, var8, var9, var10);
      Class var12 = findClass(var0.getMixin(), var11);
      InjectionPoint var13 = create(var0.getMixin(), var11, var12);
      return shift(var0, var13, var2, var3);
   }

   private static Class<? extends InjectionPoint> findClass(IMixinContext var0, InjectionPointData var1) {
      String var2 = var1.getType();
      Class var3 = types.get(var2.toUpperCase(Locale.ROOT));
      if (var3 != null) {
         return var3;
      }

      if (!var2.matches("^([A-Za-z_][A-Za-z0-9_]*[\\.\\$])+[A-Za-z_][A-Za-z0-9_]*$")) {
         throw new InvalidInjectionException(var0, var1 + " is not a valid injection point specifier");
      }

      try {
         var3 = MixinService.getService().getClassProvider().findClass(var2);
         types.put(var2, var3);
         return var3;
      } catch (Exception var5) {
         throw new InvalidInjectionException(var0, var1 + " could not be loaded or is not a valid InjectionPoint", var5);
      }
   }

   private static InjectionPoint create(IMixinContext var0, InjectionPointData var1, Class<? extends InjectionPoint> var2) {
      Constructor var3 = null;

      try {
         var3 = var2.getDeclaredConstructor(InjectionPointData.class);
         var3.setAccessible(true);
      } catch (NoSuchMethodException var8) {
         throw new InvalidInjectionException(var0, var2.getName() + " must contain a constructor which accepts an InjectionPointData", var8);
      }

      Object var4 = null;

      try {
         return (InjectionPoint)var3.newInstance(var1);
      } catch (InvocationTargetException var6) {
         throw new InvalidInjectionException(var0, "Error whilst instancing injection point " + var2.getName() + " for " + var1.getAt(), var6.getCause());
      } catch (Exception var7) {
         throw new InvalidInjectionException(var0, "Error whilst instancing injection point " + var2.getName() + " for " + var1.getAt(), var7);
      }
   }

   private static InjectionPoint shift(IInjectionPointContext var0, InjectionPoint var1, At.Shift var2, int var3) {
      int var4 = FabricUtil.getCompatibility(var0);
      if (var1 != null) {
         if (var2 == At.Shift.BEFORE) {
            return new InjectionPoint.Shift(var1, -1, var4);
         }

         if (var2 == At.Shift.AFTER) {
            return new InjectionPoint.Shift(var1, 1, var4);
         }

         if (var2 == At.Shift.BY) {
            validateByValue(var0.getMixin(), var0.getMethod(), var0.getAnnotationNode(), var1, var3);
            return new InjectionPoint.Shift(var1, var3, var4);
         }
      }

      return var1;
   }

   private static void validateByValue(IMixinContext var0, MethodNode var1, AnnotationNode var2, InjectionPoint var3, int var4) {
      MixinEnvironment var5 = var0.getMixin().getConfig().getEnvironment();
      InjectionPoint.ShiftByViolationBehaviour var6 = var5.getOption(
         MixinEnvironment.Option.SHIFT_BY_VIOLATION_BEHAVIOUR, InjectionPoint.ShiftByViolationBehaviour.WARN
      );
      if (var6 != InjectionPoint.ShiftByViolationBehaviour.IGNORE) {
         String var7 = "the maximum allowed value: ";
         String var8 = "Increase the value of maxShiftBy to suppress this warning.";
         int var9 = 0;
         if (var0 instanceof MixinTargetContext) {
            var9 = ((MixinTargetContext)var0).getMaxShiftByValue();
         }

         if (var4 > var9) {
            if (var4 > 5) {
               var7 = "MAX_ALLOWED_SHIFT_BY=";
               var8 = "You must use an alternate query or a custom injection point.";
               var9 = 5;
            }

            String var10 = String.format(
               "@%s(%s) Shift.BY=%d on %s::%s exceeds %s%d. %s", Annotations.getSimpleName(var2), var3, var4, var0, var1.name, var7, var9, var8
            );
            if (var6 == InjectionPoint.ShiftByViolationBehaviour.WARN && var9 < 5) {
               MixinService.getService().getLogger("mixin").warn(var10);
            } else {
               throw new InvalidInjectionException(var0, var10);
            }
         }
      }
   }

   protected String getAtCode() {
      InjectionPoint.AtCode var1 = this.getClass().getAnnotation(InjectionPoint.AtCode.class);
      return var1 == null ? this.getClass().getName() : var1.value().toUpperCase();
   }

   @Deprecated
   public static void register(Class<? extends InjectionPoint> var0) {
      register(var0, null);
   }

   public static void register(Class<? extends InjectionPoint> var0, String var1) {
      InjectionPoint.AtCode var2 = var0.getAnnotation(InjectionPoint.AtCode.class);
      if (var2 == null) {
         throw new IllegalArgumentException("Injection point class " + var0 + " is not annotated with @AtCode");
      }

      String var3 = var2.namespace();
      if (!Strings.isNullOrEmpty(var3)) {
         var1 = var3;
      }

      Class var4 = types.get(var2.value());
      if (var4 != null && !var4.equals(var0)) {
         MixinService.getService()
            .getLogger("mixin")
            .debug("Overriding InjectionPoint {} with {} (previously {})", var2.value(), var0.getName(), var4.getName());
      } else if (Strings.isNullOrEmpty(var1)) {
         MixinService.getService()
            .getLogger("mixin")
            .warn("Registration of InjectionPoint {} with {} without specifying namespace is deprecated.", var2.value(), var0.getName());
      }

      String var5 = var2.value().toUpperCase(Locale.ROOT);
      if (!Strings.isNullOrEmpty(var1)) {
         var5 = var1.toUpperCase(Locale.ROOT) + ":" + var5;
      }

      types.put(var5, var0);
   }

   private static void registerBuiltIn(Class<? extends InjectionPoint> var0) {
      String var1 = var0.getAnnotation(InjectionPoint.AtCode.class).value().toUpperCase(Locale.ROOT);
      types.put(var1, var0);
      types.put("MIXIN:" + var1, var0);
   }

   static {
      registerBuiltIn(BeforeFieldAccess.class);
      registerBuiltIn(BeforeInvoke.class);
      registerBuiltIn(BeforeNew.class);
      registerBuiltIn(BeforeReturn.class);
      registerBuiltIn(BeforeStringInvoke.class);
      registerBuiltIn(JumpInsnPoint.class);
      registerBuiltIn(MethodHead.class);
      registerBuiltIn(AfterInvoke.class);
      registerBuiltIn(BeforeLoadLocal.class);
      registerBuiltIn(AfterStoreLocal.class);
      registerBuiltIn(BeforeFinalReturn.class);
      registerBuiltIn(BeforeConstant.class);
      registerBuiltIn(ConstructorHead.class);
   }

   @Retention(RetentionPolicy.RUNTIME)
   @Target(ElementType.TYPE)
   public @interface AtCode {
      String namespace() default "";

      String value();
   }

   abstract static class CompositeInjectionPoint extends InjectionPoint {
      protected final InjectionPoint[] components;

      protected CompositeInjectionPoint(InjectionPoint... var1) {
         if (var1 != null && var1.length >= 2) {
            this.components = var1;
         } else {
            throw new IllegalArgumentException("Must supply two or more component injection points for composite point!");
         }
      }

      @Override
      public InjectionPoint.RestrictTargetLevel getTargetRestriction(IInjectionPointContext var1) {
         InjectionPoint.RestrictTargetLevel var2 = InjectionPoint.RestrictTargetLevel.METHODS_ONLY;

         for (InjectionPoint var6 : this.components) {
            InjectionPoint.RestrictTargetLevel var7 = var6.getTargetRestriction(var1);
            if (var7.ordinal() > var2.ordinal()) {
               var2 = var7;
            }
         }

         return var2;
      }

      @Override
      public String toString() {
         return "CompositeInjectionPoint(" + this.getClass().getSimpleName() + ")[" + Joiner.on(',').join(this.components) + "]";
      }
   }

   public static final class Flags {
      public static final int UNSAFE = 1;

      public static int parse(At var0) {
         byte var1 = 0;
         if (var0.unsafe()) {
            var1 |= 1;
         }

         return var1;
      }

      public static int parse(AnnotationNode var0) {
         byte var1 = 0;
         if (Annotations.getValue(var0, "unsafe", Boolean.TRUE)) {
            var1 |= 1;
         }

         return var1;
      }
   }

   static final class Intersection extends InjectionPoint.CompositeInjectionPoint {
      public Intersection(InjectionPoint... var1) {
         super(var1);
      }

      @Override
      public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
         boolean var4 = false;
         ArrayList[] var5 = (ArrayList[])Array.newInstance(ArrayList.class, this.components.length);

         for (int var6 = 0; var6 < this.components.length; var6++) {
            var5[var6] = new ArrayList();
            this.components[var6].find(var1, var2, var5[var6]);
         }

         ArrayList var11 = var5[0];

         for (int var7 = 0; var7 < var11.size(); var7++) {
            AbstractInsnNode var8 = (AbstractInsnNode)var11.get(var7);
            boolean var9 = true;
            int var10 = 1;

            while (var10 < var5.length && var5[var10].contains(var8)) {
               var10++;
            }

            if (var9) {
               var3.add(var8);
               var4 = true;
            }
         }

         return var4;
      }
   }

   public enum RestrictTargetLevel {
      METHODS_ONLY,
      CONSTRUCTORS_AFTER_DELEGATE,
      ALLOW_ALL;
   }

   static final class Shift extends InjectionPoint {
      private final InjectionPoint input;
      private final int shift;
      private final boolean respectSpecifier;

      public Shift(InjectionPoint var1, int var2) {
         this(var1, var2, 17004);
      }

      public Shift(InjectionPoint var1, int var2, int var3) {
         if (var1 == null) {
            throw new IllegalArgumentException("Must supply an input injection point for SHIFT");
         }

         this.input = var1;
         this.shift = var2;
         this.respectSpecifier = var3 >= 16005;
      }

      @Override
      public String toString() {
         return "InjectionPoint(" + this.getClass().getSimpleName() + ")[" + this.input + "]";
      }

      @Override
      public InjectionPoint.RestrictTargetLevel getTargetRestriction(IInjectionPointContext var1) {
         return this.input.getTargetRestriction(var1);
      }

      @Override
      public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
         List var4 = var3 instanceof List ? (List)var3 : new ArrayList(var3);
         this.input.find(var1, var2, var3);
         ListIterator var5 = var4.listIterator();

         while (var5.hasNext()) {
            int var6 = var2.indexOf((AbstractInsnNode)var5.next());
            int var7 = var6 + this.shift;
            if (var7 >= 0 && var7 < var2.size()) {
               var5.set(var2.get(var7));
            } else {
               var5.remove();
               int var8 = Math.abs(this.shift);
               int var9 = var8 != this.shift ? 45 : 43;
               this.input
                  .addMessage(
                     "@At.shift offset outside the target bounds: Index (index(%d) %s offset(%d) = %d) is outside the allowed range (0-%d)",
                     var6,
                     Character.valueOf((char)var9),
                     var8,
                     var7,
                     var2.size()
                  );
            }
         }

         if (var3 != var4) {
            var3.clear();
            var3.addAll(var4);
         }

         return var3.size() > 0;
      }

      @Override
      public InjectionPoint.Specifier getSpecifier(InjectionPoint.Specifier var1) {
         return this.respectSpecifier ? this.input.getSpecifier(var1) : super.getSpecifier(var1);
      }
   }

   enum ShiftByViolationBehaviour {
      IGNORE,
      WARN,
      ERROR;
   }

   public enum Specifier {
      ALL,
      FIRST,
      LAST,
      ONE,
      DEFAULT;
   }

   static final class Union extends InjectionPoint.CompositeInjectionPoint {
      public Union(InjectionPoint... var1) {
         super(var1);
      }

      @Override
      public boolean find(String var1, InsnList var2, Collection<AbstractInsnNode> var3) {
         LinkedHashSet var4 = new LinkedHashSet();

         for (int var5 = 0; var5 < this.components.length; var5++) {
            this.components[var5].find(var1, var2, var4);
         }

         var3.addAll(var4);
         return var4.size() > 0;
      }
   }
}
