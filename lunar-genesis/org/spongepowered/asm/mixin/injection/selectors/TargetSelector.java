package org.spongepowered.asm.mixin.injection.selectors;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.tools.Diagnostic.Kind;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.spongepowered.asm.mixin.injection.selectors.dynamic.DynamicSelectorDesc;
import org.spongepowered.asm.mixin.injection.selectors.throwables.SelectorConstraintException;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.mixin.throwables.MixinError;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.asm.util.logging.MessageRouter;
import org.spongepowered.include.com.google.common.base.Strings;

public final class TargetSelector {
   private static final Pattern PATTERN_DYNAMIC = Pattern.compile("(?i)^\\x40([a-z]+(:[a-z]+)?)(\\((.*)\\))?$");
   private static Map<String, TargetSelector.DynamicSelectorEntry> dynamicSelectors = new LinkedHashMap<>();

   private TargetSelector() {
   }

   public static void register(Class<? extends ITargetSelectorDynamic> var0, String var1) {
      ITargetSelectorDynamic.SelectorId var2 = var0.getAnnotation(ITargetSelectorDynamic.SelectorId.class);
      if (var2 == null) {
         throw new IllegalArgumentException("Dynamic target selector class " + var0 + " is not annotated with @SelectorId");
      }

      String var3 = var2.namespace();
      if (!Strings.isNullOrEmpty(var3)) {
         var1 = var3;
      }

      if (Strings.isNullOrEmpty(var1)) {
         throw new IllegalArgumentException(
            "Dynamic target selector class " + var0 + " has no namespace. Please specify namespace in SelectorId annotation or declaring configuration"
         );
      }

      TargetSelector.DynamicSelectorEntry var4;
      try {
         var4 = new TargetSelector.DynamicSelectorEntry(var1.toLowerCase(Locale.ROOT), var2.value().toLowerCase(Locale.ROOT), var0);
      } catch (NoSuchMethodException var7) {
         throw new MixinError("Dynamic target selector class " + var0.getName() + " does not contain a valid parse method");
      }

      String var5 = var4.getCode();
      if (!Pattern.matches("[a-z]+(:[a-z]+)?", var5)) {
         throw new IllegalArgumentException(
            "Dynamic target selector class " + var0 + " has an invalid id. Only alpha characters can be used in selector ids and namespaces"
         );
      }

      TargetSelector.DynamicSelectorEntry var6 = dynamicSelectors.get(var5);
      if (var6 != null) {
         MessageRouter.getMessager()
            .printMessage(Kind.WARNING, String.format("Overriding target selector for @%s with %s (previously %s)", var5, var0.getName(), var6.type.getName()));
      } else {
         MessageRouter.getMessager().printMessage(Kind.OTHER, String.format("Registering new target selector for @%s with %s", var5, var0.getName()));
      }

      dynamicSelectors.put(var5, var4);
   }

   private static void registerBuiltIn(Class<? extends ITargetSelectorDynamic> var0) {
      ITargetSelectorDynamic.SelectorId var1 = var0.getAnnotation(ITargetSelectorDynamic.SelectorId.class);

      TargetSelector.DynamicSelectorEntry var2;
      try {
         var2 = new TargetSelector.DynamicSelectorEntry(null, var1.value().toLowerCase(Locale.ROOT), var0);
      } catch (NoSuchMethodException var4) {
         throw new MixinError("Dynamic target selector class " + var0.getName() + " does not contain a valid parse method");
      }

      dynamicSelectors.put(var2.id, var2);
      dynamicSelectors.put("mixin:" + var2.id, var2);
   }

   public static ITargetSelector parseAndValidate(IAnnotationHandle var0, ISelectorContext var1) {
      return parse(var0, var1).validate();
   }

   public static ITargetSelector parseAndValidate(String var0, ISelectorContext var1) {
      return parse(var0, var1).validate();
   }

   public static Set<ITargetSelector> parseAndValidate(Iterable<?> var0, ISelectorContext var1) {
      Set var2 = parse(var0, var1, new LinkedHashSet<>());

      for (ITargetSelector var4 : var2) {
         var4.validate();
      }

      return var2;
   }

   public static Set<ITargetSelector> parse(Iterable<?> var0, ISelectorContext var1) {
      return parse(var0, var1, new LinkedHashSet<>());
   }

   public static Set<ITargetSelector> parse(Iterable<?> var0, ISelectorContext var1, Set<ITargetSelector> var2) {
      if (var2 == null) {
         var2 = new LinkedHashSet();
      }

      if (var0 != null) {
         for (Object var4 : var0) {
            if (var4 instanceof IAnnotationHandle) {
               var2.add(parse((IAnnotationHandle)var4, var1));
            } else if (var4 instanceof AnnotationNode) {
               var2.add(parse(Annotations.handleOf(var4), var1));
            } else if (var4 instanceof String) {
               var2.add(parse((String)var4, var1));
            } else if (var4 instanceof Class) {
               String var5 = Type.getType((Class<?>)var4).getDescriptor();
               var2.add(parse(var5, var1));
            } else if (var4 != null) {
               var2.add(parse(var4.toString(), var1));
            }
         }
      }

      return var2;
   }

   public static ITargetSelector parse(IAnnotationHandle var0, ISelectorContext var1) {
      for (TargetSelector.DynamicSelectorEntry var3 : dynamicSelectors.values()) {
         if (var3.annotation != null && Annotations.getDesc(var3.annotation).equals(var0.getDesc())) {
            try {
               return var3.parse(var0, var1);
            } catch (ReflectiveOperationException var5) {
               return new InvalidSelector(var5.getCause());
            } catch (Exception var6) {
               return new InvalidSelector(var6);
            }
         }
      }

      return new InvalidSelector(new InvalidSelectorException("Dynamic selector for annotation " + var0 + " is not registered."));
   }

   public static ITargetSelector parse(String var0, ISelectorContext var1) {
      var0 = var0.trim();
      if (var0.endsWith("/")) {
         MemberMatcher var2 = MemberMatcher.parse(var0, var1);
         if (var2 != null) {
            return var2;
         }
      }

      if (!var0.startsWith("@")) {
         return MemberInfo.parse(var0, var1);
      }

      Matcher var8 = PATTERN_DYNAMIC.matcher(var0);
      if (!var8.matches()) {
         return new InvalidSelector(new InvalidSelectorException("Dynamic selector was in an unrecognised format. Parsing selector: " + var0));
      }

      String var3 = var8.group(1).toLowerCase(Locale.ROOT);
      if (!dynamicSelectors.containsKey(var3)) {
         return new InvalidSelector(
            new InvalidSelectorException("Dynamic selector with id '@" + var8.group(1) + "' is not registered. Parsing selector: " + var0)
         );
      }

      try {
         return dynamicSelectors.get(var3).parse(Strings.nullToEmpty(var8.group(4)).trim(), var1);
      } catch (ReflectiveOperationException var5) {
         return new InvalidSelector(var5.getCause(), var0);
      } catch (Exception var6) {
         return new InvalidSelector(var6);
      }
   }

   public static String parseName(String var0, ISelectorContext var1) {
      ITargetSelector var2 = parse(var0, var1);
      if (!(var2 instanceof ITargetSelectorByName)) {
         return var0;
      }

      String var3 = ((ITargetSelectorByName)var2).getName();
      return var3 != null ? var3 : var0;
   }

   public static <TNode> TargetSelector.Result<TNode> run(ITargetSelector var0, Iterable<ElementNode<TNode>> var1) {
      ArrayList var2 = new ArrayList();
      ElementNode var3 = runSelector(var0, var1, var2);
      return new TargetSelector.Result<>(var3, var2);
   }

   public static <TNode> TargetSelector.Result<TNode> run(Iterable<ITargetSelector> var0, Iterable<ElementNode<TNode>> var1) {
      ElementNode var2 = null;
      ArrayList var3 = new ArrayList();

      for (ITargetSelector var5 : var0) {
         ElementNode var6 = runSelector(var5, var1, var3);
         if (var2 == null) {
            var2 = var6;
         }
      }

      return new TargetSelector.Result<>(var2, var3);
   }

   private static <TNode> ElementNode<TNode> runSelector(ITargetSelector var0, Iterable<ElementNode<TNode>> var1, List<ElementNode<TNode>> var2) {
      int var3 = 0;
      ElementNode var4 = null;

      for (ElementNode var6 : var1) {
         MatchResult var7 = var0.match(var6);
         if (var7.isMatch()) {
            if (++var3 > var0.getMaxMatchCount()) {
               break;
            }

            if (!var2.contains(var6)) {
               var2.add(var6);
            }

            if (var4 == null && var7.isExactMatch()) {
               var4 = var6;
            }
         }
      }

      if (var3 < var0.getMinMatchCount()) {
         throw new SelectorConstraintException(
            var0, String.format("%s did not match the required number of targets (required=%d, matched=%d)", var0, var0.getMinMatchCount(), var3)
         );
      } else {
         return var4;
      }
   }

   static {
      registerBuiltIn(DynamicSelectorDesc.class);
   }

   static class DynamicSelectorEntry {
      final String namespace;
      final String id;
      final Class<? extends ITargetSelectorDynamic> type;
      final Class<? extends Annotation> annotation;
      final Method mdParseString;
      final Method mdParseAnnotation;

      DynamicSelectorEntry(String var1, String var2, Class<? extends ITargetSelectorDynamic> var3) {
         this.namespace = var1;
         this.id = var2;
         this.type = var3;
         this.mdParseString = var3.getDeclaredMethod("parse", String.class, ISelectorContext.class);
         if (!Modifier.isStatic(this.mdParseString.getModifiers())) {
            throw new MixinError("parse method for dynamic target selector [" + this.type.getName() + "] must be static");
         }

         if (!ITargetSelectorDynamic.class.isAssignableFrom(this.mdParseString.getReturnType())) {
            throw new MixinError("parse(String) method for dynamic target selector [" + this.type.getName() + "] must return an ITargetSelectorDynamic subtype");
         }

         Class var4 = null;
         Method var5 = null;
         ITargetSelectorDynamic.SelectorAnnotation var6 = var3.getAnnotation(ITargetSelectorDynamic.SelectorAnnotation.class);
         if (var6 != null) {
            var4 = var6.value();
            var5 = var3.getDeclaredMethod("parse", IAnnotationHandle.class, ISelectorContext.class);
            if (!Modifier.isStatic(var5.getModifiers())) {
               throw new MixinError("parse method for dynamic target selector [" + this.type.getName() + "] must be static");
            }

            if (!ITargetSelectorDynamic.class.isAssignableFrom(var5.getReturnType())) {
               throw new MixinError(
                  "parse(Annotation) method for dynamic target selector [" + this.type.getName() + "] must return an ITargetSelectorDynamic subtype"
               );
            }
         }

         this.annotation = var4;
         this.mdParseAnnotation = var5;
      }

      String getCode() {
         return (this.namespace != null ? this.namespace + ":" : "") + this.id;
      }

      ITargetSelectorDynamic parse(String var1, ISelectorContext var2) {
         return this.parse(var1, var2, this.mdParseString);
      }

      ITargetSelectorDynamic parse(IAnnotationHandle var1, ISelectorContext var2) {
         return this.parse(var1, var2, this.mdParseAnnotation);
      }

      ITargetSelectorDynamic parse(Object var1, ISelectorContext var2, Method var3) {
         try {
            return (ITargetSelectorDynamic)var3.invoke(null, var1, var2);
         } catch (InvocationTargetException var7) {
            Throwable var5 = var7.getCause();
            if (var5 instanceof MixinException) {
               throw (MixinException)var5;
            }

            Throwable var6 = var5 != null ? var5 : var7;
            throw new MixinError("Error parsing dynamic target selector [" + this.type.getName() + "] for " + var2, var6);
         }
      }
   }

   public static class Result<TNode> {
      public final ElementNode<TNode> exactMatch;
      public final List<ElementNode<TNode>> candidates;

      Result(ElementNode<TNode> var1, List<ElementNode<TNode>> var2) {
         this.exactMatch = var1;
         this.candidates = var2;
      }

      public TNode getSingleResult(boolean var1) {
         int var2 = this.candidates.size();
         if (this.exactMatch != null) {
            return this.exactMatch.get();
         } else if (var2 != 1 && var1) {
            throw new IllegalStateException((var2 == 0 ? "No" : "Multiple") + " candidates were found");
         } else {
            return this.candidates.get(0).get();
         }
      }
   }
}
