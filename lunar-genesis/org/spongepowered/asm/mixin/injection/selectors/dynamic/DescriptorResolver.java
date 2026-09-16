package org.spongepowered.asm.mixin.injection.selectors.dynamic;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.Desc;
import org.spongepowered.asm.mixin.injection.Descriptors;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.Quantifier;
import org.spongepowered.asm.util.asm.IAnnotatedElement;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Strings;

public final class DescriptorResolver {
   public static String PRINT_ID = "?";

   private DescriptorResolver() {
   }

   public static IResolvedDescriptor resolve(IAnnotationHandle var0, ISelectorContext var1) {
      return new DescriptorResolver.Descriptor(Collections.emptySet(), var0, var1);
   }

   public static IResolvedDescriptor resolve(String var0, ISelectorContext var1) {
      boolean var2 = false;
      DescriptorResolver.ResolverObserverBasic var3 = new DescriptorResolver.ResolverObserverBasic();
      if (!Strings.isNullOrEmpty(var0)) {
         if (PRINT_ID.equals(var0)) {
            var3 = new DescriptorResolver.ResolverObserverDebug(var1);
            var0 = "";
            var2 = true;
         } else {
            var3.visit(var0, "", "");
         }
      }

      IAnnotationHandle var4 = resolve(var0, var1, var3, var1.getSelectorCoordinate(true));
      var3.postResolve();
      return new DescriptorResolver.Descriptor(var3.getSearched(), var4, var1, var2);
   }

   private static IAnnotationHandle resolve(String var0, ISelectorContext var1, DescriptorResolver.IResolverObserver var2, String var3) {
      IAnnotationHandle var4 = Annotations.handleOf(var1.getSelectorAnnotation());
      var2.visit(var3, var4, var4.toString() + ".desc");
      IAnnotationHandle var5 = resolve(var0, var1, var2, var3, var4.getAnnotationList("desc"));
      if (var5 != null) {
         return var5;
      } else {
         var5 = resolve(var0, var1, var2, var3, var1.getMethod(), "method");
         if (var5 != null) {
            return var5;
         } else {
            ISelectorContext var6 = getRoot(var1);
            String var7 = var6.getSelectorCoordinate(false);
            String var8 = (var6 != var1 || !var3.contains(".")) && !var7.equals(var3) ? var7 + "." + var3 : var3;
            var5 = resolve(var0, var1, var2, var8, var1.getMixin(), "mixin");
            if (var5 != null) {
               return var5;
            } else {
               ISelectorContext var9 = var1.getParent();
               if (var9 != null) {
                  String var10 = var9.getSelectorCoordinate(false) + "." + var3;
                  return resolve(var0, var9, var2, var10);
               } else {
                  return null;
               }
            }
         }
      }
   }

   private static IAnnotationHandle resolve(
      String var0, ISelectorContext var1, DescriptorResolver.IResolverObserver var2, String var3, Object var4, String var5
   ) {
      var2.visit(var3, var4, var5);
      IAnnotationHandle var6 = getVisibleAnnotation(var4, Descriptors.class);
      if (var6 != null) {
         IAnnotationHandle var7 = resolve(var0, var1, var2, var3, var6.getAnnotationList("value"));
         if (var7 != null) {
            return var7;
         }
      }

      IAnnotationHandle var9 = getVisibleAnnotation(var4, Desc.class);
      if (var9 != null) {
         IAnnotationHandle var8 = resolve(var0, var1, var2, var3, var9);
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   private static IAnnotationHandle resolve(
      String var0, ISelectorContext var1, DescriptorResolver.IResolverObserver var2, String var3, List<IAnnotationHandle> var4
   ) {
      if (var4 != null) {
         for (IAnnotationHandle var6 : var4) {
            IAnnotationHandle var7 = resolve(var0, var1, var2, var3, var6);
            if (var7 != null) {
               return var7;
            }
         }
      }

      return null;
   }

   private static IAnnotationHandle resolve(String var0, ISelectorContext var1, DescriptorResolver.IResolverObserver var2, String var3, IAnnotationHandle var4) {
      if (var4 != null) {
         String var5 = var4.getValue("id", var3);
         boolean var6 = Strings.isNullOrEmpty(var0);
         if (var6 && var5.equalsIgnoreCase(var3) || !var6 && var5.equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }

   private static IAnnotationHandle getVisibleAnnotation(Object var0, Class<? extends Annotation> var1) {
      if (var0 instanceof MethodNode) {
         return Annotations.handleOf(Annotations.getVisible((MethodNode)var0, var1));
      }

      if (var0 instanceof ClassNode) {
         return Annotations.handleOf(Annotations.getVisible((ClassNode)var0, var1));
      }

      if (var0 instanceof MixinTargetContext) {
         return Annotations.handleOf(Annotations.getVisible(((MixinTargetContext)var0).getClassNode(), var1));
      }

      if (!(var0 instanceof IAnnotatedElement)) {
         if (var0 == null) {
            return null;
         } else {
            throw new IllegalStateException("Cannot read visible annotations from element with unknown type: " + var0.getClass().getName());
         }
      } else {
         IAnnotationHandle var2 = ((IAnnotatedElement)var0).getAnnotation(var1);
         return var2 != null && var2.exists() ? var2 : null;
      }
   }

   private static ISelectorContext getRoot(ISelectorContext var0) {
      for (ISelectorContext var1 = var0.getParent(); var1 != null; var1 = var0.getParent()) {
         var0 = var1;
      }

      return var0;
   }

   static final class Descriptor implements IResolvedDescriptor {
      private final Set<String> searched;
      private final IAnnotationHandle desc;
      private final ISelectorContext context;
      private final boolean debug;

      Descriptor(Set<String> var1, IAnnotationHandle var2, ISelectorContext var3) {
         this(var1, var2, var3, false);
      }

      Descriptor(Set<String> var1, IAnnotationHandle var2, ISelectorContext var3, boolean var4) {
         this.searched = var1;
         this.desc = var2;
         this.context = var3;
         this.debug = var4;
      }

      @Override
      public boolean isResolved() {
         return this.desc != null;
      }

      @Override
      public boolean isDebug() {
         return this.debug;
      }

      @Override
      public String getResolutionInfo() {
         return this.searched == null ? "" : String.format("Searched coordinates [ \"%s\" ]", Joiner.on("\", \"").join(this.searched));
      }

      @Override
      public IAnnotationHandle getAnnotation() {
         return this.desc;
      }

      @Override
      public String getId() {
         return this.desc != null ? this.desc.getValue("id", "") : "";
      }

      @Override
      public Type getOwner() {
         if (this.desc == null) {
            return Type.VOID_TYPE;
         } else {
            Type var1 = this.desc.getTypeValue("owner");
            if (var1 != Type.VOID_TYPE) {
               return var1;
            } else {
               return this.context != null ? Type.getObjectType(this.context.getMixin().getTargetClassRef()) : var1;
            }
         }
      }

      @Override
      public String getName() {
         if (this.desc == null) {
            return "";
         }

         String var1 = this.desc.getValue("value", "");
         return !var1.isEmpty() ? var1 : this.desc.getValue("name", "");
      }

      @Override
      public Type[] getArgs() {
         if (this.desc == null) {
            return new Type[0];
         }

         List var1 = this.desc.getTypeList("args");
         return var1.toArray(new Type[var1.size()]);
      }

      @Override
      public Type getReturnType() {
         return this.desc == null ? Type.VOID_TYPE : this.desc.getTypeValue("ret");
      }

      @Override
      public Quantifier getMatches() {
         if (this.desc == null) {
            return Quantifier.DEFAULT;
         }

         int var1 = Math.max(0, this.desc != null ? this.desc.getValue("min", 0) : 0);
         Integer var2 = this.desc != null ? this.desc.getValue("max", null) : null;
         return new Quantifier(var1, var2 != null ? (var2 > 0 ? var2 : Integer.MAX_VALUE) : -1);
      }

      @Override
      public List<IAnnotationHandle> getNext() {
         return this.desc != null ? this.desc.getAnnotationList("next") : Collections.emptyList();
      }
   }

   interface IResolverObserver {
      void visit(String var1, Object var2, String var3);

      Set<String> getSearched();

      void postResolve();
   }

   static class ResolverObserverBasic implements DescriptorResolver.IResolverObserver {
      private final Set<String> searched = new LinkedHashSet<>();

      @Override
      public void visit(String var1, Object var2, String var3) {
         this.searched.add(var1);
      }

      @Override
      public Set<String> getSearched() {
         return this.searched;
      }

      @Override
      public void postResolve() {
      }
   }

   static class ResolverObserverDebug extends DescriptorResolver.ResolverObserverBasic {
      private final PrettyPrinter printer = new PrettyPrinter();

      ResolverObserverDebug(ISelectorContext var1) {
         this.printer.add("Searching for implicit descriptor").add(var1).hr().table();
         this.printer.tr("Context Coordinate:", var1.getSelectorCoordinate(true) + " (" + var1.getSelectorCoordinate(false) + ")");
         this.printer.tr("Selector Annotation:", var1.getSelectorAnnotation());
         this.printer.tr("Root Annotation:", var1.getAnnotation());
         this.printer.tr("Method:", var1.getMethod()).hr();
         this.printer.table("Search Coordinate", "Search Element", "Detail").th().hr();
      }

      @Override
      public void visit(String var1, Object var2, String var3) {
         super.visit(var1, var2, var3);
         this.printer.tr(var1, var2, var3);
      }

      @Override
      public void postResolve() {
         this.printer.print();
      }
   }
}
