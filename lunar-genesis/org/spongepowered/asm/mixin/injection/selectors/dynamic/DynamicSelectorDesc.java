package org.spongepowered.asm.mixin.injection.selectors.dynamic;

import java.util.List;
import org.objectweb.asm.Type;
import org.spongepowered.asm.mixin.injection.Desc;
import org.spongepowered.asm.mixin.injection.selectors.ElementNode;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorDynamic;
import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;
import org.spongepowered.asm.mixin.injection.selectors.MatchResult;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Quantifier;
import org.spongepowered.asm.util.SignaturePrinter;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.base.Strings;

@ITargetSelectorDynamic.SelectorId("Desc")
@ITargetSelectorDynamic.SelectorAnnotation(Desc.class)
public class DynamicSelectorDesc implements ITargetSelectorByName, ITargetSelectorDynamic {
   private final InvalidSelectorException parseException;
   private final String id;
   private final Type owner;
   private final String name;
   private final Type[] args;
   private final Type returnType;
   private final String methodDesc;
   private final Quantifier matches;
   private final List<IAnnotationHandle> next;
   private final boolean disabled;

   private DynamicSelectorDesc(IResolvedDescriptor var1) {
      this(null, var1.getId(), var1.getOwner(), var1.getName(), var1.getArgs(), var1.getReturnType(), var1.getMatches(), var1.getNext(), var1.isDebug());
   }

   private DynamicSelectorDesc(DynamicSelectorDesc var1, Quantifier var2) {
      this(var1.parseException, var1.id, var1.owner, var1.name, var1.args, var1.returnType, var2, var1.next, var1.disabled);
   }

   private DynamicSelectorDesc(DynamicSelectorDesc var1, Type var2) {
      this(var1.parseException, var1.id, var2, var1.name, var1.args, var1.returnType, var1.matches, var1.next, var1.disabled);
   }

   private DynamicSelectorDesc(InvalidSelectorException var1) {
      this(var1, null, null, null, null, null, Quantifier.NONE, null, true);
   }

   protected DynamicSelectorDesc(
      InvalidSelectorException var1, String var2, Type var3, String var4, Type[] var5, Type var6, Quantifier var7, List<IAnnotationHandle> var8, boolean var9
   ) {
      this.parseException = var1;
      this.id = var2;
      this.owner = var3;
      this.name = Strings.emptyToNull(var4);
      this.args = var5;
      this.returnType = var6;
      this.methodDesc = var6 != null ? Bytecode.getDescriptor(var6, var5) : null;
      this.matches = var7;
      this.next = var8;
      this.disabled = var9;
   }

   public static DynamicSelectorDesc parse(String var0, ISelectorContext var1) {
      IResolvedDescriptor var2 = DescriptorResolver.resolve(var0, var1);
      if (!var2.isResolved() && !var2.isDebug()) {
         String var3 = var0.length() == 0 ? ". " + var2.getResolutionInfo() : "";
         return new DynamicSelectorDesc(new InvalidSelectorException("Could not resolve @Desc(" + var0 + ") for " + var1 + var3));
      } else {
         return of(var2);
      }
   }

   public static DynamicSelectorDesc parse(IAnnotationHandle var0, ISelectorContext var1) {
      IResolvedDescriptor var2 = DescriptorResolver.resolve(var0, var1);
      return !var2.isResolved() && !var2.isDebug() ? new DynamicSelectorDesc(new InvalidSelectorException("Invalid descriptor")) : of(var2);
   }

   public static DynamicSelectorDesc resolve(ISelectorContext var0) {
      IResolvedDescriptor var1 = DescriptorResolver.resolve("", var0);
      return !var1.isResolved() ? null : of(var1);
   }

   public static DynamicSelectorDesc of(IAnnotationHandle var0, ISelectorContext var1) {
      IResolvedDescriptor var2 = DescriptorResolver.resolve(var0, var1);
      return !var2.isResolved() ? null : of(var2);
   }

   public static DynamicSelectorDesc of(IResolvedDescriptor var0) {
      return new DynamicSelectorDesc(var0);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("@Desc(");
      boolean var2 = false;
      if (!Strings.isNullOrEmpty(this.id)) {
         var1.append("id = \"").append(this.id).append("\"");
         var2 = true;
      }

      if (this.owner != Type.VOID_TYPE) {
         if (var2) {
            var1.append(", ");
         }

         var1.append("owner = ").append(SignaturePrinter.getTypeName(this.owner, false, false)).append(".class");
         var2 = true;
      }

      if (var2) {
         var1.append(", ");
      }

      if (this.name != null) {
         var1.append("value = \"").append(this.name).append("\"");
      }

      if (this.args.length > 0) {
         var1.append(", args = { ");

         for (int var3 = 0; var3 < this.args.length; var3++) {
            if (var3 > 0) {
               var1.append(", ");
            }

            var1.append(SignaturePrinter.getTypeName(this.args[var3], false, false)).append(".class");
         }

         var1.append(" }");
      }

      if (this.returnType != Type.VOID_TYPE) {
         var1.append(", ret = ").append(SignaturePrinter.getTypeName(this.returnType, false, false)).append(".class");
      }

      var1.append(")");
      return var1.toString();
   }

   public String getId() {
      return this.id;
   }

   @Override
   public String getOwner() {
      return this.owner.getInternalName();
   }

   @Override
   public String getName() {
      return this.name;
   }

   public Type[] getArgs() {
      return this.args;
   }

   public Type getReturnType() {
      return this.returnType;
   }

   @Override
   public String getDesc() {
      return this.methodDesc;
   }

   @Override
   public String toDescriptor() {
      return new SignaturePrinter(this).setFullyQualified(true).toDescriptor();
   }

   @Override
   public ITargetSelector validate() {
      if (this.parseException != null) {
         throw this.parseException;
      } else {
         return this;
      }
   }

   @Override
   public ITargetSelector next() {
      return this.next(0);
   }

   protected ITargetSelector next(int var1) {
      if (var1 >= 0 && var1 < this.next.size()) {
         IAnnotationHandle var2 = this.next.get(var1);
         IResolvedDescriptor var3 = DescriptorResolver.resolve(var2, null);
         return new DynamicSelectorDesc.Next(var1, var3);
      } else {
         return null;
      }
   }

   @Override
   public ITargetSelector configure(ITargetSelector.Configure var1, String... var2) {
      var1.checkArgs(var2);
      switch (var1) {
         case SELECT_MEMBER:
            if (this.matches.isDefault()) {
               return new DynamicSelectorDesc(this, Quantifier.SINGLE);
            }
            break;
         case SELECT_INSTRUCTION:
            if (this.matches.isDefault()) {
               return new DynamicSelectorDesc(this, Quantifier.ANY);
            }
            break;
         case MOVE:
            return new DynamicSelectorDesc(this, Type.getObjectType(var2[0]));
         case CLEAR_LIMITS:
            if (this.getMinMatchCount() != 0 || this.getMaxMatchCount() < Integer.MAX_VALUE) {
               return new DynamicSelectorDesc(this, Quantifier.ANY);
            }
      }

      return this;
   }

   @Override
   public ITargetSelector attach(ISelectorContext var1) {
      return this;
   }

   @Override
   public int getMinMatchCount() {
      return this.matches.getClampedMin();
   }

   @Override
   public int getMaxMatchCount() {
      return this.matches.getClampedMax();
   }

   @Override
   public MatchResult matches(String var1, String var2, String var3) {
      return this.matches(var1, var2, var3, this.methodDesc);
   }

   @Override
   public <TNode> MatchResult match(ElementNode<TNode> var1) {
      if (var1 == null || this.disabled) {
         return MatchResult.NONE;
      } else {
         return var1.isField()
            ? this.matches(var1.getOwner(), var1.getName(), var1.getDesc(), this.returnType.getDescriptor())
            : this.matches(var1.getOwner(), var1.getName(), var1.getDesc(), this.methodDesc);
      }
   }

   private MatchResult matches(String var1, String var2, String var3, String var4) {
      if (!var4.equals(var3)) {
         return MatchResult.NONE;
      } else if (this.owner != Type.VOID_TYPE && !this.owner.getInternalName().equals(var1)) {
         return MatchResult.NONE;
      } else if (this.name != null && this.name.equals(var2)) {
         return MatchResult.EXACT_MATCH;
      } else if (this.name != null && this.name.equalsIgnoreCase(var2)) {
         return MatchResult.MATCH;
      } else {
         return this.name == null ? MatchResult.EXACT_MATCH : MatchResult.NONE;
      }
   }

   final class Next extends DynamicSelectorDesc {
      private final int index;

      Next(int var2, IResolvedDescriptor var3) {
         super(null, null, var3.getOwner(), var3.getName(), var3.getArgs(), var3.getReturnType(), var3.getMatches(), null, var3.isDebug());
         this.index = var2;
      }

      @Override
      public ITargetSelector next() {
         return DynamicSelectorDesc.this.next(this.index + 1);
      }
   }
}
