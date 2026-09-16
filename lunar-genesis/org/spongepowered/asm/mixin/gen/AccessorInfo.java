package org.spongepowered.asm.mixin.gen;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.gen.throwables.InvalidAccessorException;
import org.spongepowered.asm.mixin.injection.selectors.ElementNode;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.struct.SpecialMethodInfo;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.MethodNodeEx;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.include.com.google.common.collect.ImmutableSet;

public class AccessorInfo extends SpecialMethodInfo {
   protected final Class<? extends Annotation> annotationClass;
   protected final Type[] argTypes;
   protected final Type returnType;
   protected final boolean isStatic;
   protected final String specifiedName;
   protected final AccessorInfo.AccessorType type;
   private final Type targetFieldType;
   protected final ITargetSelector target;
   protected FieldNode targetField;
   protected MethodNode targetMethod;
   protected AccessorGenerator generator;

   public AccessorInfo(MixinTargetContext var1, MethodNode var2) {
      this(var1, var2, Accessor.class);
   }

   protected AccessorInfo(MixinTargetContext var1, MethodNode var2, Class<? extends Annotation> var3) {
      super(var1, var2, Annotations.getVisible(var2, var3));
      this.annotationClass = var3;
      this.argTypes = Type.getArgumentTypes(var2.desc);
      this.returnType = Type.getReturnType(var2.desc);
      this.isStatic = Bytecode.isStatic(var2);
      this.specifiedName = Annotations.getValue(this.annotation);
      this.type = this.initType();
      this.targetFieldType = this.initTargetFieldType();
      this.target = this.initTarget();
   }

   protected AccessorInfo.AccessorType initType() {
      return this.returnType.equals(Type.VOID_TYPE) ? AccessorInfo.AccessorType.FIELD_SETTER : AccessorInfo.AccessorType.FIELD_GETTER;
   }

   protected Type initTargetFieldType() {
      switch (this.type) {
         case FIELD_GETTER:
            if (this.argTypes.length > 0) {
               throw new InvalidAccessorException(this.mixin, this + " must take exactly 0 arguments, found " + this.argTypes.length);
            }

            return this.returnType;
         case FIELD_SETTER:
            if (this.argTypes.length != 1) {
               throw new InvalidAccessorException(this.mixin, this + " must take exactly 1 argument, found " + this.argTypes.length);
            }

            return this.argTypes[0];
         default:
            throw new InvalidAccessorException(this.mixin, "Computed unsupported accessor type " + this.type + " for " + this);
      }
   }

   protected ITargetSelector initTarget() {
      return new MemberInfo(this.getTargetName(this.specifiedName), null, this.targetFieldType.getDescriptor());
   }

   protected String getTargetName(String var1) {
      if (Strings.isNullOrEmpty(var1)) {
         String var2 = this.inflectTarget();
         if (var2 == null) {
            throw new InvalidAccessorException(
               this.mixin, String.format("Failed to inflect target name for %s, supported prefixes: %s", this, this.type.getExpectedPrefixes())
            );
         } else {
            return var2;
         }
      } else {
         return TargetSelector.parseName(var1, this);
      }
   }

   protected String inflectTarget() {
      return inflectTarget(
         MethodNodeEx.getName(this.method), this.type, this.toString(), this, this.mixin.getEnvironment().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)
      );
   }

   public static String inflectTarget(String var0, AccessorInfo.AccessorType var1, String var2, ISelectorContext var3, boolean var4) {
      return inflectTarget(AccessorInfo.AccessorName.of(var0), var1, var2, var3, var4);
   }

   public static String inflectTarget(AccessorInfo.AccessorName var0, AccessorInfo.AccessorType var1, String var2, ISelectorContext var3, boolean var4) {
      if (var0 != null) {
         if (!var1.isExpectedPrefix(var0.prefix) && var4) {
            MixinService.getService()
               .getLogger("mixin")
               .warn("Unexpected prefix for {}, found [{}] expecting {}", var2, var0.prefix, var1.getExpectedPrefixes());
         }

         return TargetSelector.parseName(var0.name, var3);
      } else {
         return null;
      }
   }

   public final ITargetSelector getTarget() {
      return this.target;
   }

   public final Type getTargetFieldType() {
      return this.targetFieldType;
   }

   public final FieldNode getTargetField() {
      return this.targetField;
   }

   public final MethodNode getTargetMethod() {
      return this.targetMethod;
   }

   public final Type getReturnType() {
      return this.returnType;
   }

   public final Type[] getArgTypes() {
      return this.argTypes;
   }

   public boolean isStatic() {
      return this.isStatic;
   }

   @Override
   public String toString() {
      String var1 = this.type != null ? this.type.toString() : "UNPARSED_ACCESSOR";
      return String.format("%s->@%s[%s]::%s%s", this.mixin, Annotations.getSimpleName(this.annotation), var1, this.methodName, this.method.desc);
   }

   public void locate() {
      this.targetField = this.findTargetField();
      this.annotation.visit("target", this.targetField.name + ':' + this.targetField.desc);
   }

   public void validate() {
      this.generator = this.type.getGenerator(this);
      this.generator.validate();
   }

   public MethodNode generate() {
      MethodNode var1 = this.generator.generate();
      Annotations.merge(this.method, var1);
      return var1;
   }

   private FieldNode findTargetField() {
      return this.findTarget(ElementNode.fieldList(this.classNode));
   }

   protected <TNode> TNode findTarget(List<ElementNode<TNode>> var1) {
      TargetSelector.Result var2 = TargetSelector.run(this.target.configure(ITargetSelector.Configure.ORPHAN), var1);

      try {
         return (TNode)var2.getSingleResult(true);
      } catch (IllegalStateException var4) {
         throw new InvalidAccessorException(this, String.format("%s matching %s in %s for %s", var4.getMessage(), this.target, this.classNode.name, this));
      }
   }

   public static AccessorInfo of(MixinTargetContext var0, MethodNode var1, Class<? extends Annotation> var2) {
      if (var2 == Accessor.class) {
         return new AccessorInfo(var0, var1);
      } else if (var2 == Invoker.class) {
         return new InvokerInfo(var0, var1);
      } else {
         throw new InvalidAccessorException(var0, "Could not parse accessor for unknown type " + var2.getName());
      }
   }

   public static final class AccessorName {
      private static final Pattern PATTERN = Pattern.compile("^(" + getPrefixList() + ")(([A-Z])(.*?))(_\\$md.*)?$");
      public final String methodName;
      public final String prefix;
      public final String name;

      private AccessorName(String var1, String var2, String var3) {
         this.methodName = var1;
         this.prefix = var2;
         this.name = var3;
      }

      @Override
      public String toString() {
         return super.toString();
      }

      public static AccessorInfo.AccessorName of(String var0) {
         return of(var0, true);
      }

      public static AccessorInfo.AccessorName of(String var0, boolean var1) {
         Matcher var2 = PATTERN.matcher(var0);
         if (!var2.matches()) {
            return null;
         }

         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         String var6 = var2.group(4);
         boolean var7 = isUpperCase(Locale.ROOT, var4);
         String var8 = String.format("%s%s", toLowerCaseIf(Locale.ROOT, var5, var1 && !var7), var6);
         return new AccessorInfo.AccessorName(var0, var3, var8);
      }

      private static boolean isUpperCase(Locale var0, String var1) {
         return var1.toUpperCase(var0).equals(var1);
      }

      private static String toLowerCaseIf(Locale var0, String var1, boolean var2) {
         return var2 ? var1.toLowerCase(var0) : var1;
      }

      private static String getPrefixList() {
         ArrayList var0 = new ArrayList();

         for (AccessorInfo.AccessorType var4 : AccessorInfo.AccessorType.values()) {
            var0.addAll(var4.getExpectedPrefixes());
         }

         return Joiner.on('|').join(var0);
      }
   }

   public enum AccessorType {
      FIELD_GETTER(ImmutableSet.of("get", "is")) {
         @Override
         AccessorGenerator getGenerator(AccessorInfo var1) {
            return new AccessorGeneratorFieldGetter(var1);
         }
      },
      FIELD_SETTER(ImmutableSet.of("set")) {
         @Override
         AccessorGenerator getGenerator(AccessorInfo var1) {
            return new AccessorGeneratorFieldSetter(var1);
         }
      },
      METHOD_PROXY(ImmutableSet.of("call", "invoke")) {
         @Override
         AccessorGenerator getGenerator(AccessorInfo var1) {
            return new AccessorGeneratorMethodProxy(var1);
         }
      },
      OBJECT_FACTORY(ImmutableSet.of("new", "create")) {
         @Override
         AccessorGenerator getGenerator(AccessorInfo var1) {
            return new AccessorGeneratorObjectFactory(var1);
         }
      };

      private final Set<String> expectedPrefixes;

      AccessorType(Set<String> var3) {
         this.expectedPrefixes = var3;
      }

      public boolean isExpectedPrefix(String var1) {
         return this.expectedPrefixes.contains(var1);
      }

      public Set<String> getExpectedPrefixes() {
         return Collections.unmodifiableSet(this.expectedPrefixes);
      }

      abstract AccessorGenerator getGenerator(AccessorInfo var1);
   }
}
