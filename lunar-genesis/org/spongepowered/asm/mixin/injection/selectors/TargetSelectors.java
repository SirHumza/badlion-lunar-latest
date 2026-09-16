package org.spongepowered.asm.mixin.injection.selectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.selectors.throwables.SelectorConstraintException;
import org.spongepowered.asm.mixin.injection.struct.InvalidMemberDescriptorException;
import org.spongepowered.asm.mixin.injection.struct.TargetNotSupportedException;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.mixin.struct.AnnotatedMethodInfo;
import org.spongepowered.asm.mixin.transformer.meta.MixinMerged;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;

public class TargetSelectors implements Iterable<TargetSelectors.SelectedMethod> {
   private final ISelectorContext context;
   private final ClassNode targetClassNode;
   private final IMixinContext mixin;
   private final Object method;
   private final boolean isStatic;
   private final Set<ITargetSelector> selectors = new LinkedHashSet<>();
   private final List<TargetSelectors.SelectedMethod> targets = new ArrayList<>();

   public TargetSelectors(ISelectorContext var1, ClassNode var2) {
      this.context = var1;
      this.targetClassNode = var2;
      this.mixin = var1.getMixin();
      this.method = var1.getMethod();
      this.isStatic = this.method instanceof MethodNode && Bytecode.isStatic((MethodNode)this.method);
   }

   public void parse(Set<ITargetSelector> var1) {
      for (ITargetSelector var3 : var1) {
         try {
            this.addSelector(var3.validate().attach(this.context));
         } catch (InvalidMemberDescriptorException var5) {
            throw new InvalidInjectionException(
               this.context,
               String.format(
                  "%s, has invalid target descriptor: %s. %s",
                  this.context.getElementDescription(),
                  var5.getMessage(),
                  this.mixin.getReferenceMapper().getStatus()
               )
            );
         } catch (TargetNotSupportedException var6) {
            throw new InvalidInjectionException(
               this.context, String.format("%s specifies a target class '%s', which is not supported", this.context.getElementDescription(), var6.getMessage())
            );
         } catch (InvalidSelectorException var7) {
            throw new InvalidInjectionException(
               this.context, String.format("%s is decorated with an invalid selector: %s", this.context.getElementDescription(), var7.getMessage())
            );
         }
      }
   }

   public TargetSelectors addSelector(ITargetSelector var1) {
      this.selectors.add(var1);
      return this;
   }

   public int size() {
      return this.targets.size();
   }

   public void clear() {
      this.targets.clear();
   }

   @Override
   public Iterator<TargetSelectors.SelectedMethod> iterator() {
      return this.targets.iterator();
   }

   public void remove(TargetSelectors.SelectedMethod var1) {
      this.targets.remove(var1);
   }

   public void find() {
      this.findRootTargets();
   }

   private void findRootTargets() {
      for (ITargetSelector var2 : this.selectors) {
         var2 = var2.configure(ITargetSelector.Configure.SELECT_MEMBER);
         int var3 = 0;
         int var4 = var2.getMaxMatchCount();

         for (MethodNode var6 : this.targetClassNode.methods) {
            if (var2.match(ElementNode.of(this.targetClassNode, var6)).isExactMatch()) {
               var3++;
               boolean var7 = Annotations.getVisible(var6, MixinMerged.class) != null;
               if (var4 <= 1 || (this.isStatic || !Bytecode.isStatic(var6)) && var6 != this.method && !var7) {
                  this.checkTarget(var6);
                  this.targets.add(new TargetSelectors.SelectedMethod(var2, var6));
               }

               if (var3 >= var4) {
                  break;
               }
            }
         }

         if (var3 < var2.getMinMatchCount()) {
            throw new InvalidInjectionException(
               this.context,
               new SelectorConstraintException(
                  var2,
                  String.format(
                     "Injection validation failed: %s for %s did not match the required number of targets (required=%d, matched=%d). %s%s",
                     var2,
                     this.context.getElementDescription(),
                     var2.getMinMatchCount(),
                     var3,
                     this.mixin.getReferenceMapper().getStatus(),
                     AnnotatedMethodInfo.getDynamicInfo(this.method)
                  )
               )
            );
         }
      }
   }

   protected void findNestedTargets() {
      boolean var1 = false;

      do {
         var1 = false;
         ListIterator var2 = this.targets.listIterator();

         while (var2.hasNext()) {
            TargetSelectors.SelectedMethod var3 = (TargetSelectors.SelectedMethod)var2.next();
            ITargetSelector var4 = var3.next();
            if (var4 != null) {
               var1 = true;
               TargetSelector.Result var5 = TargetSelector.run(var4, ElementNode.dynamicInsnList(var3.getMethod().instructions));
               var2.remove();

               for (ElementNode var7 : var5.candidates) {
                  if (var7.getInsn().getOpcode() == 186) {
                     if (!var7.getOwner().equals(this.mixin.getTargetClassRef())) {
                        throw new InvalidInjectionException(
                           this.context,
                           String.format(
                              "%s, failed to select into child. Cannot select foreign method: %s. %s",
                              this.context.getElementDescription(),
                              var7,
                              this.mixin.getReferenceMapper().getStatus()
                           )
                        );
                     }

                     MethodNode var8 = this.findMethod(var7);
                     if (var8 == null) {
                        throw new InvalidInjectionException(
                           this.context,
                           String.format(
                              "%s, failed to select into child. %s%s was not found in the target class.",
                              this.context.getElementDescription(),
                              var7.getName(),
                              var7.getDesc()
                           )
                        );
                     }

                     var2.add(new TargetSelectors.SelectedMethod(var3, var4, var8));
                  }
               }
            }
         }
      } while (var1);
   }

   private void checkTarget(MethodNode var1) {
      AnnotationNode var2 = Annotations.getVisible(var1, MixinMerged.class);
      if (var2 != null) {
         if (Annotations.getVisible(var1, Final.class) != null) {
            throw new InvalidInjectionException(
               this.context,
               String.format(
                  "%s cannot inject into @Final method %s::%s%s merged by %s",
                  this,
                  this.mixin.getTargetClassName(),
                  var1.name,
                  var1.desc,
                  Annotations.getValue(var2, "mixin")
               )
            );
         }
      }
   }

   private MethodNode findMethod(ElementNode<AbstractInsnNode> var1) {
      for (MethodNode var3 : this.targetClassNode.methods) {
         if (var3.name.equals(var1.getSyntheticName()) && var3.desc.equals(var1.getDesc())) {
            return var3;
         }
      }

      return null;
   }

   public void validate(int var1, int var2) {
      int var3 = this.targets.size();
      if (var3 <= 0) {
         if (this.mixin.getOption(MixinEnvironment.Option.DEBUG_INJECTORS) && var1 > 0) {
            throw new InvalidInjectionException(
               this.context,
               String.format(
                  "Injection validation failed: %s could not find any targets matching %s in %s. %s%s",
                  this.context.getElementDescription(),
                  namesOf(this.selectors),
                  this.mixin.getTargetClassRef(),
                  this.mixin.getReferenceMapper().getStatus(),
                  AnnotatedMethodInfo.getDynamicInfo(this.method)
               )
            );
         }

         if (var2 > 0) {
            throw new InvalidInjectionException(
               this.context,
               String.format(
                  "Critical injection failure: %s could not find any targets matching %s in %s. %s%s",
                  this.context.getElementDescription(),
                  namesOf(this.selectors),
                  this.mixin.getTargetClassRef(),
                  this.mixin.getReferenceMapper().getStatus(),
                  AnnotatedMethodInfo.getDynamicInfo(this.method)
               )
            );
         }
      }
   }

   private static String namesOf(Collection<ITargetSelector> var0) {
      int var1 = 0;
      int var2 = var0.size();
      StringBuilder var3 = new StringBuilder();

      for (ITargetSelector var5 : var0) {
         if (var1 > 0) {
            if (var1 == var2 - 1) {
               var3.append(" or ");
            } else {
               var3.append(", ");
            }
         }

         var3.append('\'').append(var5.toString()).append('\'');
         var1++;
      }

      return var3.toString();
   }

   public static class SelectedMethod {
      private final TargetSelectors.SelectedMethod parent;
      private final ITargetSelector selector;
      private final MethodNode method;

      SelectedMethod(TargetSelectors.SelectedMethod var1, ITargetSelector var2, MethodNode var3) {
         this.parent = var1;
         this.selector = var2;
         this.method = var3;
      }

      SelectedMethod(ITargetSelector var1, MethodNode var2) {
         this(null, var1, var2);
      }

      @Override
      public String toString() {
         return this.method.name + this.method.desc;
      }

      public TargetSelectors.SelectedMethod getParent() {
         return this.parent;
      }

      public ITargetSelector next() {
         return this.selector.next();
      }

      public MethodNode getMethod() {
         return this.method;
      }
   }
}
