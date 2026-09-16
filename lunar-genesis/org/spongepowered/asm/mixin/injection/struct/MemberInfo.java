package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.spongepowered.asm.mixin.injection.selectors.ElementNode;
import org.spongepowered.asm.mixin.injection.selectors.ISelectorContext;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorByName;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorConstructor;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelectorRemappable;
import org.spongepowered.asm.mixin.injection.selectors.MatchResult;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.Quantifier;
import org.spongepowered.asm.util.SignaturePrinter;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Strings;

public final class MemberInfo implements ITargetSelectorConstructor, ITargetSelectorRemappable {
   private final String owner;
   private final String name;
   private final String desc;
   private final Quantifier matches;
   private final boolean forceField;
   private final String input;
   private final String tail;

   public MemberInfo(String var1, Quantifier var2) {
      this(var1, null, null, var2, null, null);
   }

   public MemberInfo(String var1, String var2, Quantifier var3) {
      this(var1, var2, null, var3, null, null);
   }

   public MemberInfo(String var1, String var2, String var3) {
      this(var1, var2, var3, Quantifier.DEFAULT, null, null);
   }

   public MemberInfo(String var1, String var2, String var3, Quantifier var4) {
      this(var1, var2, var3, var4, null, null);
   }

   public MemberInfo(String var1, String var2, String var3, Quantifier var4, String var5) {
      this(var1, var2, var3, var4, var5, null);
   }

   public MemberInfo(String var1, String var2, String var3, Quantifier var4, String var5, String var6) {
      if (var2 != null && var2.contains(".")) {
         throw new IllegalArgumentException("Attempt to instance a MemberInfo with an invalid owner format");
      }

      this.owner = var2;
      this.name = var1;
      this.desc = var3;
      this.matches = var4;
      this.forceField = false;
      this.tail = var5;
      this.input = var6;
   }

   public MemberInfo(AbstractInsnNode var1) {
      this.matches = Quantifier.DEFAULT;
      this.forceField = false;
      this.input = null;
      this.tail = null;
      if (var1 instanceof MethodInsnNode) {
         MethodInsnNode var2 = (MethodInsnNode)var1;
         this.owner = var2.owner;
         this.name = var2.name;
         this.desc = var2.desc;
      } else {
         if (!(var1 instanceof FieldInsnNode)) {
            throw new IllegalArgumentException("insn must be an instance of MethodInsnNode or FieldInsnNode");
         }

         FieldInsnNode var3 = (FieldInsnNode)var1;
         this.owner = var3.owner;
         this.name = var3.name;
         this.desc = var3.desc;
      }
   }

   public MemberInfo(IMapping<?> var1) {
      this.owner = var1.getOwner();
      this.name = var1.getSimpleName();
      this.desc = var1.getDesc();
      this.matches = Quantifier.SINGLE;
      this.forceField = var1.getType() == IMapping.Type.FIELD;
      this.tail = null;
      this.input = null;
   }

   private MemberInfo(MemberInfo var1, MappingMethod var2, boolean var3) {
      this.owner = var3 ? var2.getOwner() : var1.owner;
      this.name = var2.getSimpleName();
      this.desc = var2.getDesc();
      this.matches = var1.matches;
      this.forceField = false;
      this.tail = null;
      this.input = null;
   }

   private MemberInfo(MemberInfo var1, String var2) {
      this.owner = var2;
      this.name = var1.name;
      this.desc = var1.desc;
      this.matches = var1.matches;
      this.forceField = var1.forceField;
      this.tail = var1.tail;
      this.input = null;
   }

   @Override
   public ITargetSelector next() {
      return Strings.isNullOrEmpty(this.tail) ? null : parse(this.tail, null);
   }

   @Override
   public String getOwner() {
      return this.owner;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public String getDesc() {
      return this.desc;
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
   public String toString() {
      String var1 = this.owner != null ? "L" + this.owner + ";" : "";
      String var2 = this.name != null ? this.name : "";
      String var3 = this.matches.toString();
      String var4 = this.desc != null ? this.desc : "";
      String var5 = var4.startsWith("(") ? "" : (this.desc != null ? ":" : "");
      String var6 = this.tail != null ? " -> " + this.tail : "";
      return var1 + var2 + var3 + var5 + var4 + var6;
   }

   @Deprecated
   public String toSrg() {
      if (!this.isFullyQualified()) {
         throw new MixinException("Cannot convert unqualified reference to SRG mapping");
      } else {
         return this.desc.startsWith("(") ? this.owner + "/" + this.name + " " + this.desc : this.owner + "/" + this.name;
      }
   }

   @Override
   public String toDescriptor() {
      return this.desc == null ? "" : new SignaturePrinter(this).setFullyQualified(true).toDescriptor();
   }

   @Override
   public String toCtorType() {
      if (this.input == null) {
         return null;
      } else {
         String var1 = this.getReturnType();
         if (var1 != null) {
            return var1;
         } else if (this.owner != null) {
            return this.owner;
         } else if (this.name != null && this.desc == null) {
            return this.name;
         } else {
            return this.desc != null ? this.desc : this.input;
         }
      }
   }

   @Override
   public String toCtorDesc() {
      return Bytecode.changeDescriptorReturnType(this.desc, "V");
   }

   private String getReturnType() {
      if (this.desc != null && this.desc.indexOf(41) != -1 && this.desc.indexOf(40) == 0) {
         String var1 = this.desc.substring(this.desc.indexOf(41) + 1);
         return var1.startsWith("L") && var1.endsWith(";") ? var1.substring(1, var1.length() - 1) : var1;
      } else {
         return null;
      }
   }

   @Override
   public IMapping<?> asMapping() {
      return this.isField() ? this.asFieldMapping() : this.asMethodMapping();
   }

   @Override
   public MappingMethod asMethodMapping() {
      if (!this.isFullyQualified()) {
         throw new MixinException("Cannot convert unqualified reference " + this + " to MethodMapping");
      } else if (this.isField()) {
         throw new MixinException("Cannot convert a non-method reference " + this + " to MethodMapping");
      } else {
         return new MappingMethod(this.owner, this.name, this.desc);
      }
   }

   @Override
   public MappingField asFieldMapping() {
      if (!this.isField()) {
         throw new MixinException("Cannot convert non-field reference " + this + " to FieldMapping");
      } else {
         return new MappingField(this.owner, this.name, this.desc);
      }
   }

   @Override
   public boolean isFullyQualified() {
      return this.owner != null && this.name != null && this.desc != null;
   }

   @Override
   public boolean isField() {
      return this.forceField || this.desc != null && !this.desc.startsWith("(");
   }

   @Override
   public boolean isConstructor() {
      return "<init>".equals(this.name);
   }

   @Override
   public boolean isClassInitialiser() {
      return "<clinit>".equals(this.name);
   }

   @Override
   public boolean isInitialiser() {
      return this.isConstructor() || this.isClassInitialiser();
   }

   public MemberInfo validate() {
      if (this.getMaxMatchCount() == 0) {
         throw new InvalidMemberDescriptorException(this.input, "Malformed quantifier in selector: " + this.input);
      }

      if (this.owner != null) {
         if (!this.owner.matches("(?i)^[\\w\\p{Sc}/]+$")) {
            throw new InvalidMemberDescriptorException(this.input, "Invalid owner: " + this.owner);
         }

         if (this.input != null && this.input.lastIndexOf(46) > 0 && this.owner.startsWith("L")) {
            throw new InvalidMemberDescriptorException(
               this.input,
               "Malformed owner: "
                  + this.owner
                  + " If you are seeing this messageunexpectedly and the owner appears to be correct, replace the owner descriptor with formal type L"
                  + this.owner
                  + "; to suppress this error"
            );
         }
      }

      if (this.name != null && !this.name.matches("(?i)^<?[\\w\\p{Sc}]+>?$")) {
         throw new InvalidMemberDescriptorException(this.input, "Invalid name: " + this.name);
      }

      if (this.desc == null) {
         return this;
      }

      if (!this.desc.matches("^(\\([\\w\\p{Sc}\\[/;]*\\))?\\[*[\\w\\p{Sc}/;]+$")) {
         throw new InvalidMemberDescriptorException(this.input, "Invalid descriptor: " + this.desc);
      }

      if (this.isField()) {
         if (!this.desc.equals(Type.getType(this.desc).getDescriptor())) {
            throw new InvalidMemberDescriptorException(this.input, "Invalid field type in descriptor: " + this.desc);
         } else {
            return this;
         }
      } else {
         try {
            Type[] var1 = Type.getArgumentTypes(this.desc);
            if (ASM.isAtLeastVersion(6)) {
               for (Type var5 : var1) {
                  var5.getInternalName();
               }
            }
         } catch (Exception var7) {
            throw new InvalidMemberDescriptorException(this.input, "Invalid descriptor: " + this.desc);
         }

         String var8 = this.desc.substring(this.desc.indexOf(41) + 1);

         try {
            Type var9 = Type.getType(var8);
            int var10 = var9.getSort();
            if (var10 >= 9) {
               var9.getInternalName();
            }

            if (var8.equals(var9.getDescriptor())) {
               return this;
            } else {
               throw new InvalidMemberDescriptorException(this.input, "Invalid return type \"" + var8 + "\" in descriptor: " + this.desc);
            }
         } catch (Exception var6) {
            throw new InvalidMemberDescriptorException(this.input, "Invalid return type \"" + var8 + "\" in descriptor: " + this.desc);
         }
      }
   }

   @Override
   public <TNode> MatchResult match(ElementNode<TNode> var1) {
      return var1 == null ? MatchResult.NONE : this.matches(var1.getOwner(), var1.getName(), var1.getDesc());
   }

   @Override
   public MatchResult matches(String var1, String var2, String var3) {
      if (this.desc != null && var3 != null && !this.desc.equals(var3)) {
         return MatchResult.NONE;
      } else if (this.owner != null && var1 != null && !this.owner.equals(var1)) {
         return MatchResult.NONE;
      } else if (this.name == null || var2 == null) {
         return MatchResult.EXACT_MATCH;
      } else if (this.name.equals(var2)) {
         return MatchResult.EXACT_MATCH;
      } else {
         return this.name.equalsIgnoreCase(var2) ? MatchResult.MATCH : MatchResult.NONE;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof ITargetSelectorByName) {
         ITargetSelectorByName var2 = (ITargetSelectorByName)var1;
         boolean var3 = var2 instanceof MemberInfo
            ? ((MemberInfo)var2).forceField
            : (var2 instanceof ITargetSelectorRemappable ? ((ITargetSelectorRemappable)var2).isField() : false);
         return this.compareMatches(var2)
            && this.forceField == var3
            && Objects.equal(this.owner, var2.getOwner())
            && Objects.equal(this.name, var2.getName())
            && Objects.equal(this.desc, var2.getDesc());
      } else {
         return false;
      }
   }

   private boolean compareMatches(ITargetSelectorByName var1) {
      return var1 instanceof MemberInfo
         ? ((MemberInfo)var1).matches.equals(this.matches)
         : this.getMinMatchCount() == var1.getMinMatchCount() && this.getMaxMatchCount() == var1.getMaxMatchCount();
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.matches, this.owner, this.name, this.desc);
   }

   @Override
   public ITargetSelector configure(ITargetSelector.Configure var1, String... var2) {
      var1.checkArgs(var2);
      switch (var1) {
         case SELECT_MEMBER:
            if (this.matches.isDefault()) {
               return new MemberInfo(this.name, this.owner, this.desc, Quantifier.SINGLE, this.tail);
            }
            break;
         case SELECT_INSTRUCTION:
            if (this.matches.isDefault()) {
               return new MemberInfo(this.name, this.owner, this.desc, Quantifier.ANY, this.tail);
            }
            break;
         case MOVE:
            return this.move(Strings.emptyToNull(var2[0]));
         case ORPHAN:
            return this.move(null);
         case TRANSFORM:
            return this.transform(Strings.emptyToNull(var2[0]));
         case PERMISSIVE:
            return this.transform(null);
         case CLEAR_LIMITS:
            if (this.matches.getMin() != 0 || this.matches.getMax() < Integer.MAX_VALUE) {
               return new MemberInfo(this.name, this.owner, this.desc, Quantifier.ANY, this.tail);
            }
      }

      return this;
   }

   @Override
   public ITargetSelector attach(ISelectorContext var1) {
      if (this.owner != null && !this.owner.equals(var1.getMixin().getTargetClassRef())) {
         throw new TargetNotSupportedException(this.owner);
      } else {
         return this;
      }
   }

   @Override
   public ITargetSelectorRemappable move(String var1) {
      return (var1 != null || this.owner != null) && (var1 == null || !var1.equals(this.owner)) ? new MemberInfo(this, var1) : this;
   }

   @Override
   public ITargetSelectorRemappable transform(String var1) {
      return (var1 != null || this.desc != null) && (var1 == null || !var1.equals(this.desc))
         ? new MemberInfo(this.name, this.owner, var1, this.matches)
         : this;
   }

   @Override
   public ITargetSelectorRemappable remapUsing(MappingMethod var1, boolean var2) {
      return new MemberInfo(this, var1, var2);
   }

   public static MemberInfo parse(String var0, ISelectorContext var1) {
      String var2 = null;
      String var3 = null;
      String var4 = Strings.nullToEmpty(var0).replaceAll("\\s", "");
      String var5 = null;
      int var6 = var4.indexOf("->");
      if (var6 > -1) {
         var5 = var4.substring(var6 + 2);
         var4 = var4.substring(0, var6);
      }

      if (var1 != null) {
         var4 = var1.remap(var4);
      }

      int var7 = var4.indexOf(40);
      int var8 = var4.indexOf(58);
      if (var7 > -1) {
         var2 = var4.substring(var7);
         var4 = var4.substring(0, var7);
      } else if (var8 > -1) {
         var2 = var4.substring(var8 + 1);
         var4 = var4.substring(0, var8);
      }

      int var9 = var4.lastIndexOf(46);
      int var10 = var4.indexOf(59);
      if (var9 > -1) {
         var3 = var4.substring(0, var9).replace('.', '/');
         var4 = var4.substring(var9 + 1);
      } else if (var10 > -1 && var4.startsWith("L")) {
         var3 = var4.substring(1, var10).replace('.', '/');
         var4 = var4.substring(var10 + 1);
      }

      if ((var4.indexOf(47) > -1 || var4.indexOf(46) > -1) && var3 == null) {
         var3 = var4;
         var4 = "";
      }

      Quantifier var11 = Quantifier.DEFAULT;
      if (var4.endsWith("*")) {
         var11 = Quantifier.ANY;
         var4 = var4.substring(0, var4.length() - 1);
      } else if (var4.endsWith("+")) {
         var11 = Quantifier.PLUS;
         var4 = var4.substring(0, var4.length() - 1);
      } else if (var4.endsWith("}")) {
         var11 = Quantifier.NONE;
         int var12 = var4.indexOf("{");
         if (var12 >= 0) {
            try {
               var11 = Quantifier.parse(var4.substring(var12, var4.length()));
               var4 = var4.substring(0, var12);
            } catch (Exception var14) {
            }
         }
      } else if (var4.indexOf("{") >= 0) {
         var11 = Quantifier.NONE;
      }

      if (var4.isEmpty()) {
         var4 = null;
      }

      return new MemberInfo(var4, var3, var2, var11, var5, var0);
   }

   public static MemberInfo fromMapping(IMapping<?> var0) {
      return new MemberInfo(var0);
   }
}
