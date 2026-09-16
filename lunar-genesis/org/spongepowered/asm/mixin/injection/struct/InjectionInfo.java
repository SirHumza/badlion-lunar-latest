package org.spongepowered.asm.mixin.injection.struct;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.tools.Diagnostic.Kind;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IActivityContext;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.ISliceContext;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.code.InjectorTarget;
import org.spongepowered.asm.mixin.injection.code.MethodSlice;
import org.spongepowered.asm.mixin.injection.code.MethodSlices;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelectors;
import org.spongepowered.asm.mixin.injection.selectors.throwables.SelectorException;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.struct.AnnotatedMethodInfo;
import org.spongepowered.asm.mixin.struct.SpecialMethodInfo;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ActivityStack;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.asm.util.logging.MessageRouter;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.collect.ImmutableSet;

public abstract class InjectionInfo extends SpecialMethodInfo implements ISliceContext {
   private static Map<String, InjectionInfo.InjectorEntry> registry = new LinkedHashMap<>();
   private static Class<? extends Annotation>[] registeredAnnotations = new Class[0];
   protected final ActivityStack activities = new ActivityStack(null);
   protected final boolean isStatic;
   protected final TargetSelectors targets;
   protected final MethodSlices slices;
   protected final String atKey;
   protected final List<AnnotationNode> injectionPointAnnotations = new ArrayList<>();
   protected final List<InjectionPoint> injectionPoints = new ArrayList<>();
   protected final Map<Target, List<InjectionNodes.InjectionNode>> targetNodes = new LinkedHashMap<>();
   protected int targetCount = 0;
   protected Injector injector;
   protected InjectorGroupInfo group;
   private final List<MethodNode> injectedMethods = new ArrayList<>(0);
   private int expectedCallbackCount = 1;
   private int requiredCallbackCount = 0;
   private int maxCallbackCount = Integer.MAX_VALUE;
   private int injectedCallbackCount = 0;
   private List<String> messages;
   private int order = 1000;

   protected InjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
      this(var1, var2, var3, "at");
   }

   protected InjectionInfo(MixinTargetContext var1, MethodNode var2, AnnotationNode var3, String var4) {
      super(var1, var2, var3);
      this.isStatic = Bytecode.isStatic(var2);
      this.targets = new TargetSelectors(this, var1.getTargetClassNode());
      this.slices = MethodSlices.parse(this);
      this.atKey = var4;
      this.readAnnotation();
   }

   protected void readAnnotation() {
      if (this.annotation != null) {
         this.activities.clear();

         try {
            IActivityContext.IActivity var1 = this.activities.begin("Read Injection Points");
            this.readInjectionPoints();
            var1.next("Parse Requirements");
            this.parseRequirements();
            var1.next("Parse Order");
            this.parseOrder();
            var1.next("Parse Selectors");
            this.parseSelectors();
            var1.next("Find Targets");
            this.targets.find();
            var1.next("Validate Targets");
            this.targets.validate(this.expectedCallbackCount, this.requiredCallbackCount);
            var1.next("Parse Injection Points");
            this.parseInjectionPoints(this.injectionPointAnnotations);
            var1.next("Parse Injector");
            this.injector = this.parseInjector(this.annotation);
            var1.end();
         } catch (InvalidMixinException var2) {
            var2.prepend(this.activities);
            throw var2;
         } catch (Exception var3) {
            throw new InvalidMixinException(
               this.mixin, "Unexpected " + var3.getClass().getSimpleName() + " parsing " + this.getElementDescription(), var3, this.activities
            );
         }
      }
   }

   protected void readInjectionPoints() {
      List var1 = Annotations.getValue(this.annotation, this.atKey, false);
      if (var1 == null) {
         throw new InvalidInjectionException(this, String.format("%s is missing '%s' value(s)", this.getElementDescription(), this.atKey));
      }

      this.injectionPointAnnotations.addAll(var1);
   }

   protected void parseRequirements() {
      this.group = this.mixin.getInjectorGroups().parseGroup(this.method, this.mixin.getDefaultInjectorGroup()).add(this);
      Integer var1 = Annotations.getValue(this.annotation, "expect");
      if (var1 != null) {
         this.expectedCallbackCount = var1;
      }

      Integer var2 = Annotations.getValue(this.annotation, "require");
      if (var2 != null && var2 > -1) {
         this.requiredCallbackCount = var2;
      } else if (this.group.isDefault()) {
         this.requiredCallbackCount = this.mixin.getDefaultRequiredInjections();
      }

      Integer var3 = Annotations.getValue(this.annotation, "allow");
      if (var3 != null) {
         this.maxCallbackCount = Math.max(Math.max(this.requiredCallbackCount, 1), var3);
      }
   }

   protected void parseOrder() {
      Integer var1 = Annotations.getValue(this.annotation, "order");
      if (var1 != null) {
         this.order = var1;
      } else {
         InjectionInfo.InjectorOrder var2 = this.getClass().getAnnotation(InjectionInfo.InjectorOrder.class);
         this.order = var2 != null ? var2.value() : 1000;
      }
   }

   protected void parseSelectors() {
      LinkedHashSet var1 = new LinkedHashSet();
      TargetSelector.parse(Annotations.getValue(this.annotation, "method", false), this, var1);
      TargetSelector.parse(Annotations.getValue(this.annotation, "target", false), this, var1);
      if (var1.size() == 0) {
         throw new InvalidInjectionException(this, String.format("%s is missing 'method' or 'target' to specify targets", this.getElementDescription()));
      }

      this.targets.parse(var1);
   }

   protected void parseInjectionPoints(List<AnnotationNode> var1) {
      this.injectionPoints.addAll(InjectionPoint.parse(this, var1));
   }

   protected abstract Injector parseInjector(AnnotationNode var1);

   public boolean isValid() {
      return this.targets.size() > 0 && this.injectionPoints.size() > 0;
   }

   public int getOrder() {
      return this.order;
   }

   public void prepare() {
      this.activities.clear();

      try {
         this.targetNodes.clear();
         IActivityContext.IActivity var1 = this.activities.begin("?");

         for (TargetSelectors.SelectedMethod var3 : this.targets) {
            var1.next("{ target: %s }", var3);
            Target var4 = this.mixin.getTargetMethod(var3.getMethod());
            InjectorTarget var5 = new InjectorTarget(this, var4, var3);

            try {
               this.targetNodes.put(var4, this.injector.find(var5, this.injectionPoints));
            } catch (SelectorException var12) {
               throw new InvalidInjectionException(
                  this,
                  String.format(
                     "Injection validation failed: %s: %s. %s%s",
                     this.getElementDescription(),
                     var12.getMessage(),
                     this.mixin.getReferenceMapper().getStatus(),
                     AnnotatedMethodInfo.getDynamicInfo(this.method)
                  )
               );
            } finally {
               var5.dispose();
            }
         }

         var1.end();
      } catch (InvalidMixinException var14) {
         var14.prepend(this.activities);
         throw var14;
      } catch (Exception var15) {
         throw new InvalidMixinException(
            this.mixin, "Unexpecteded " + var15.getClass().getSimpleName() + " preparing " + this.getElementDescription(), var15, this.activities
         );
      }
   }

   public void preInject() {
      for (Entry var2 : this.targetNodes.entrySet()) {
         this.injector.preInject((Target)var2.getKey(), (List<InjectionNodes.InjectionNode>)var2.getValue());
      }
   }

   public void inject() {
      for (Entry var2 : this.targetNodes.entrySet()) {
         this.injector.inject((Target)var2.getKey(), (List<InjectionNodes.InjectionNode>)var2.getValue());
      }

      this.targets.clear();
   }

   public void postInject() {
      for (MethodNode var2 : this.injectedMethods) {
         this.classNode.methods.add(var2);
      }

      String var4 = this.getDescription();
      String var5 = this.mixin.getReferenceMapper().getStatus();
      String var3 = AnnotatedMethodInfo.getDynamicInfo(this.method) + this.getMessages();
      if (this.mixin.getOption(MixinEnvironment.Option.DEBUG_INJECTORS) && this.injectedCallbackCount < this.expectedCallbackCount) {
         throw new InvalidInjectionException(
            this,
            String.format(
               "Injection validation failed: %s %s%s in %s expected %d invocation(s) but %d succeeded. Scanned %d target(s). %s%s",
               var4,
               this.methodName,
               this.method.desc,
               this.mixin,
               this.expectedCallbackCount,
               this.injectedCallbackCount,
               this.targetCount,
               var5,
               var3
            )
         );
      }

      if (this.injectedCallbackCount < this.requiredCallbackCount) {
         throw new InjectionError(
            String.format(
               "Critical injection failure: %s %s%s in %s failed injection check, (%d/%d) succeeded. Scanned %d target(s). %s%s",
               var4,
               this.methodName,
               this.method.desc,
               this.mixin,
               this.injectedCallbackCount,
               this.requiredCallbackCount,
               this.targetCount,
               var5,
               var3
            )
         );
      }

      if (this.injectedCallbackCount > this.maxCallbackCount) {
         throw new InjectionError(
            String.format(
               "Critical injection failure: %s %s%s in %s failed injection check, %d succeeded of %d allowed.%s",
               var4,
               this.methodName,
               this.method.desc,
               this.mixin,
               this.injectedCallbackCount,
               this.maxCallbackCount,
               var3
            )
         );
      }

      this.slices.postInject();
   }

   public void notifyInjected(Target var1) {
   }

   protected String getDescription() {
      return "Callback method";
   }

   @Override
   public String toString() {
      return describeInjector(this.mixin, this.annotation, this.method);
   }

   public int getTargetCount() {
      return this.targets.size();
   }

   @Override
   public MethodSlice getSlice(String var1) {
      return this.slices.get(this.getSliceId(var1));
   }

   public String getSliceId(String var1) {
      return "";
   }

   public int getInjectedCallbackCount() {
      return this.injectedCallbackCount;
   }

   public MethodNode addMethod(int var1, String var2, String var3) {
      MethodNode var4 = new MethodNode(ASM.API_VERSION, var1 | 4096, var2, var3, null, null);
      this.injectedMethods.add(var4);
      return var4;
   }

   public void addCallbackInvocation(MethodNode var1) {
      this.injectedCallbackCount++;
   }

   @Override
   public void addMessage(String var1, Object... var2) {
      super.addMessage(var1, var2);
      if (this.messages == null) {
         this.messages = new ArrayList<>();
      }

      String var3 = String.format(var1, var2);
      this.messages.add(var3);
   }

   protected String getMessages() {
      return this.messages != null ? " Messages: { " + Joiner.on(" ").join(this.messages) + "}" : "";
   }

   public static InjectionInfo parse(MixinTargetContext var0, MethodNode var1) {
      AnnotationNode var2 = getInjectorAnnotation(var0.getMixin(), var1);
      if (var2 == null) {
         return null;
      }

      for (InjectionInfo.InjectorEntry var4 : registry.values()) {
         if (var2.desc.equals(var4.annotationDesc)) {
            return var4.create(var0, var1, var2);
         }
      }

      return null;
   }

   public static AnnotationNode getInjectorAnnotation(IMixinInfo var0, MethodNode var1) {
      Object var2 = null;

      try {
         return Annotations.getSingleVisible(var1, registeredAnnotations);
      } catch (IllegalArgumentException var4) {
         throw new InvalidMixinException(var0, String.format("Error parsing annotations on %s in %s: %s", var1.name, var0.getClassName(), var4.getMessage()));
      }
   }

   public static String getInjectorPrefix(AnnotationNode var0) {
      if (var0 == null) {
         return "handler";
      }

      for (InjectionInfo.InjectorEntry var2 : registry.values()) {
         if (var0.desc.endsWith(var2.annotationDesc)) {
            return var2.prefix;
         }
      }

      return "handler";
   }

   static String describeInjector(IMixinContext var0, AnnotationNode var1, MethodNode var2) {
      return String.format("%s->@%s::%s%s", var0.toString(), Annotations.getSimpleName(var1), MethodNodeEx.getName(var2), var2.desc);
   }

   public static void register(Class<? extends InjectionInfo> var0) {
      InjectionInfo.AnnotationType var1 = var0.getAnnotation(InjectionInfo.AnnotationType.class);
      if (var1 == null) {
         throw new IllegalArgumentException("Injection info class " + var0 + " is not annotated with @AnnotationType");
      }

      InjectionInfo.InjectorEntry var2;
      try {
         var2 = new InjectionInfo.InjectorEntry(var1.value(), var0);
      } catch (NoSuchMethodException var7) {
         throw new MixinError("InjectionInfo class " + var0.getName() + " is missing a valid constructor");
      }

      InjectionInfo.InjectorEntry var3 = registry.get(var2.annotationDesc);
      if (var3 != null) {
         MessageRouter.getMessager()
            .printMessage(
               Kind.WARNING,
               String.format(
                  "Overriding InjectionInfo for @%s with %s (previously %s)", var1.value().getSimpleName(), var0.getName(), var3.injectorType.getName()
               )
            );
      } else {
         MessageRouter.getMessager()
            .printMessage(Kind.OTHER, String.format("Registering new injector for @%s with %s", var1.value().getSimpleName(), var0.getName()));
      }

      registry.put(var2.annotationDesc, var2);
      ArrayList var4 = new ArrayList();

      for (InjectionInfo.InjectorEntry var6 : registry.values()) {
         var4.add(var6.annotationType);
      }

      registeredAnnotations = var4.toArray(registeredAnnotations);
   }

   public static Set<Class<? extends Annotation>> getRegisteredAnnotations() {
      return ImmutableSet.copyOf(registeredAnnotations);
   }

   static {
      register(CallbackInjectionInfo.class);
      register(ModifyArgInjectionInfo.class);
      register(ModifyArgsInjectionInfo.class);
      register(RedirectInjectionInfo.class);
      register(ModifyVariableInjectionInfo.class);
      register(ModifyConstantInjectionInfo.class);
   }

   @Retention(RetentionPolicy.RUNTIME)
   @java.lang.annotation.Target(ElementType.TYPE)
   public @interface AnnotationType {
      Class<? extends Annotation> value();
   }

   @Retention(RetentionPolicy.RUNTIME)
   @java.lang.annotation.Target(ElementType.TYPE)
   public @interface HandlerPrefix {
      String DEFAULT = "handler";

      String value();
   }

   static class InjectorEntry {
      final Class<? extends Annotation> annotationType;
      final Class<? extends InjectionInfo> injectorType;
      final java.lang.reflect.Constructor<? extends InjectionInfo> ctor;
      final String annotationDesc;
      final String prefix;

      InjectorEntry(Class<? extends Annotation> var1, Class<? extends InjectionInfo> var2) {
         this.annotationType = var1;
         this.injectorType = var2;
         this.ctor = var2.getDeclaredConstructor(MixinTargetContext.class, MethodNode.class, AnnotationNode.class);
         this.annotationDesc = Type.getDescriptor(var1);
         InjectionInfo.HandlerPrefix var3 = var2.getAnnotation(InjectionInfo.HandlerPrefix.class);
         this.prefix = var3 != null ? var3.value() : "handler";
      }

      InjectionInfo create(MixinTargetContext var1, MethodNode var2, AnnotationNode var3) {
         try {
            return this.ctor.newInstance(var1, var2, var3);
         } catch (InvocationTargetException var7) {
            Throwable var5 = var7.getCause();
            if (var5 instanceof MixinException) {
               throw (MixinException)var5;
            }

            Throwable var6 = var5 != null ? var5 : var7;
            throw new MixinError("Error initialising injector metaclass [" + this.injectorType + "] for annotation " + var3.desc, var6);
         } catch (ReflectiveOperationException var8) {
            throw new MixinError("Failed to instantiate injector metaclass [" + this.injectorType + "] for annotation " + var3.desc, var8);
         }
      }
   }

   @Retention(RetentionPolicy.RUNTIME)
   @java.lang.annotation.Target(ElementType.TYPE)
   public @interface InjectorOrder {
      int EARLY = 0;
      int DEFAULT = 1000;
      int LATE = 2000;
      int REDIRECT = 10000;
      int AFTER_REDIRECT = 20000;

      int value() default 1000;
   }
}
