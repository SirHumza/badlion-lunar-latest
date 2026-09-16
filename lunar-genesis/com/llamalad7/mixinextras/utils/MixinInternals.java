package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.lib.apache.commons.tuple.Pair;
import com.llamalad7.mixinextras.wrapper.WrapperInjectionInfo;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.function.Predicate;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.transformer.ClassInfo;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;
import org.spongepowered.asm.mixin.transformer.ext.Extensions;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.IExtensionRegistry;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.mixin.transformer.ext.extensions.ExtensionCheckClass;

public class MixinInternals {
   private static final InternalField<ITargetClassContext, SortedSet<IMixinInfo>> TARGET_CLASS_CONTEXT_MIXINS = InternalField.of(
      "org.spongepowered.asm.mixin.transformer.TargetClassContext", "mixins"
   );
   private static final InternalMethod<IMixinInfo, ?> MIXIN_INFO_GET_STATE = InternalMethod.of("org.spongepowered.asm.mixin.transformer.MixinInfo", "getState");
   private static final InternalField<Object, ClassNode> STATE_CLASS_NODE = InternalField.of(
      "org.spongepowered.asm.mixin.transformer.MixinInfo$State", "classNode"
   );
   private static final InternalField<IExtensionRegistry, List<IExtension>> EXTENSIONS = InternalField.of(Extensions.class, "extensions");
   private static final InternalField<IExtensionRegistry, List<IExtension>> ACTIVE_EXTENSIONS = InternalField.of(Extensions.class, "activeExtensions");
   private static final InternalField<InjectionInfo, Map<Target, List<InjectionNodes.InjectionNode>>> INJECTION_INFO_TARGET_NODES = InternalField.of(
      InjectionInfo.class, "targetNodes"
   );
   private static final InternalField<InjectionNodes.InjectionNode, Map<String, Object>> INJECTION_NODE_DECORATIONS = InternalField.of(
      InjectionNodes.InjectionNode.class, "decorations"
   );
   private static final InternalField<InjectionInfo, Injector> INJECTION_INFO_INJECTOR = InternalField.of(InjectionInfo.class, "injector");
   private static final InternalMethod<?, Void> CLASS_INFO_FROM_CLASS_NODE = InternalMethod.of(ClassInfo.class, "fromClassNode", ClassNode.class);
   private static final InternalConstructor<?> INJECTOR_ENTRY = InternalConstructor.of(
      "org.spongepowered.asm.mixin.injection.struct.InjectionInfo$InjectorEntry", Class.class, Class.class
   );
   private static final InternalField<Object, Class<? extends Annotation>> INJECTOR_ENTRY_ANNOTATION_TYPE = InternalField.of(
      "org.spongepowered.asm.mixin.injection.struct.InjectionInfo$InjectorEntry", "annotationType"
   );
   private static final InternalField<?, Map<String, ?>> INJECTION_INFO_REGISTRY = InternalField.of(InjectionInfo.class, "registry");
   private static final InternalField<InjectionInfo, Class<? extends Annotation>[]> INJECTION_INFO_REGISTERED_ANNOTATIONS = InternalField.of(
      InjectionInfo.class, "registeredAnnotations"
   );
   private static final InternalField<?, Map<String, Class<? extends InjectionPoint>>> INJECTION_POINT_TYPES = InternalField.of(InjectionPoint.class, "types");

   public static List<Pair<IMixinInfo, ClassNode>> getMixinsFor(ITargetClassContext var0) {
      ArrayList var1 = new ArrayList();

      for (IMixinInfo var3 : TARGET_CLASS_CONTEXT_MIXINS.get(var0)) {
         var1.add(Pair.of(var3, getClassNode(var3)));
      }

      return var1;
   }

   public static Map<Target, List<InjectionNodes.InjectionNode>> getTargets(InjectionInfo var0) {
      return var0 instanceof WrapperInjectionInfo ? ((WrapperInjectionInfo)var0).getTargetMap() : INJECTION_INFO_TARGET_NODES.get(var0);
   }

   public static Extensions getExtensions() {
      IMixinTransformer var0 = (IMixinTransformer)MixinEnvironment.getDefaultEnvironment().getActiveTransformer();
      return (Extensions)var0.getExtensions();
   }

   public static void registerExtension(IExtension var0) {
      registerExtension(var0, false);
   }

   public static void registerExtension(IExtension var0, boolean var1) {
      Extensions var2 = getExtensions();
      List var3 = EXTENSIONS.get(var2);
      addExtension(var3, var0, var1);
      ArrayList var4 = new ArrayList<>(ACTIVE_EXTENSIONS.get(var2));
      addExtension(var4, var0, var1);
      ACTIVE_EXTENSIONS.set(var2, Collections.unmodifiableList(var4));
   }

   public static void unregisterExtension(IExtension var0) {
      Extensions var1 = getExtensions();
      List var2 = EXTENSIONS.get(var1);
      var2.remove(var0);
      ArrayList var3 = new ArrayList<>(ACTIVE_EXTENSIONS.get(var1));
      var3.remove(var0);
      ACTIVE_EXTENSIONS.set(var1, Collections.unmodifiableList(var3));
   }

   private static void addExtension(List<IExtension> var0, IExtension var1, boolean var2) {
      if (var2) {
         var0.add(0, var1);
      } else {
         var0.add(var1);
      }

      shiftLateExtensions(var0, var0x -> var0x instanceof ExtensionCheckClass);
   }

   private static void shiftLateExtensions(List<IExtension> var0, Predicate<IExtension> var1) {
      ArrayList var2 = new ArrayList();
      ListIterator var3 = var0.listIterator();

      while (var3.hasNext()) {
         IExtension var4 = (IExtension)var3.next();
         if (var1.test(var4)) {
            var3.remove();
            var2.add(var4);
         }
      }

      var0.addAll(var2);
   }

   public static Map<String, Object> getDecorations(InjectionNodes.InjectionNode var0) {
      Map var1 = INJECTION_NODE_DECORATIONS.get(var0);
      return var1 == null ? Collections.emptyMap() : var1;
   }

   public static Injector getInjector(InjectionInfo var0) {
      return INJECTION_INFO_INJECTOR.get(var0);
   }

   private static ClassNode getClassNode(IMixinInfo var0) {
      return STATE_CLASS_NODE.get(MIXIN_INFO_GET_STATE.call(var0));
   }

   public static void registerClassInfo(ClassNode var0) {
      CLASS_INFO_FROM_CLASS_NODE.call(null, var0);
   }

   public static void registerInjector(String var0, Class<?> var1) {
      Class var2;
      try {
         var2 = Class.forName(var0);
      } catch (ClassNotFoundException var5) {
         throw new RuntimeException("Could not find injector annotation, please report to LlamaLad7!", var5);
      }

      Map var3 = INJECTION_INFO_REGISTRY.get(null);
      Object var4 = INJECTOR_ENTRY.newInstance(var2, var1);
      var3.put(Type.getDescriptor(var2), var4);
      bakeInjectionInfoArray(var3);
   }

   public static void unregisterInjector(String var0) {
      Map var1 = INJECTION_INFO_REGISTRY.get(null);
      var1.remove('L' + var0.replace('.', '/') + ';');
      bakeInjectionInfoArray(var1);
   }

   private static void bakeInjectionInfoArray(Map<String, Object> var0) {
      ArrayList var1 = new ArrayList();

      for (Object var3 : var0.values()) {
         var1.add(INJECTOR_ENTRY_ANNOTATION_TYPE.get(var3));
      }

      INJECTION_INFO_REGISTERED_ANNOTATIONS.set(null, var1.toArray(new Class[0]));
   }

   public static void registerInjectionPoint(Class<? extends InjectionPoint> var0) {
      String var1 = var0.getAnnotation(InjectionPoint.AtCode.class).value();
      INJECTION_POINT_TYPES.get(null).put(var1, var0);
   }
}
