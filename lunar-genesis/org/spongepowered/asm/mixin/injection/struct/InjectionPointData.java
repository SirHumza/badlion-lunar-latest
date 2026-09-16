package org.spongepowered.asm.mixin.injection.struct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;
import org.spongepowered.asm.mixin.injection.selectors.TargetSelector;
import org.spongepowered.asm.mixin.injection.selectors.dynamic.DynamicSelectorDesc;
import org.spongepowered.asm.mixin.injection.throwables.InvalidInjectionPointException;
import org.spongepowered.asm.mixin.refmap.IMixinContext;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.IMessageSink;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Strings;
import org.spongepowered.include.com.google.common.primitives.Ints;

public class InjectionPointData {
   private static final Pattern AT_PATTERN = createPattern();
   private final Map<String, String> args = new HashMap<>();
   private final IInjectionPointContext context;
   private final String at;
   private final String type;
   private final InjectionPoint.Specifier specifier;
   private final InjectionPoint.RestrictTargetLevel targetRestriction;
   private final String target;
   private final String slice;
   private final int ordinal;
   private final int opcode;
   private final String id;
   private final int flags;

   public InjectionPointData(IInjectionPointContext var1, String var2, List<String> var3, String var4, String var5, int var6, int var7, String var8, int var9) {
      this.context = var1;
      this.at = var2;
      this.target = var4;
      this.slice = Strings.nullToEmpty(var5);
      this.ordinal = Math.max(-1, var6);
      this.opcode = var7;
      this.id = var8;
      this.flags = var9;
      this.parseArgs(var3);
      this.args.put("target", var4);
      this.args.put("ordinal", String.valueOf(var6));
      this.args.put("opcode", String.valueOf(var7));
      Matcher var10 = AT_PATTERN.matcher(var2);
      this.type = parseType(var10, var2);
      this.specifier = parseSpecifier(var10);
      this.targetRestriction = this.isUnsafe() ? InjectionPoint.RestrictTargetLevel.ALLOW_ALL : InjectionPoint.RestrictTargetLevel.METHODS_ONLY;
   }

   private void parseArgs(List<String> var1) {
      if (var1 != null) {
         for (String var3 : var1) {
            if (var3 != null) {
               int var4 = var3.indexOf(61);
               if (var4 > -1) {
                  this.args.put(var3.substring(0, var4), var3.substring(var4 + 1));
               } else {
                  this.args.put(var3, "");
               }
            }
         }
      }
   }

   public IMessageSink getMessageSink() {
      return this.context;
   }

   public String getAt() {
      return this.at;
   }

   public String getType() {
      return this.type;
   }

   public InjectionPoint.Specifier getSpecifier() {
      return this.specifier;
   }

   public InjectionPoint.RestrictTargetLevel getTargetRestriction() {
      return this.targetRestriction;
   }

   public IInjectionPointContext getContext() {
      return this.context;
   }

   public IMixinContext getMixin() {
      return this.context.getMixin();
   }

   public MethodNode getMethod() {
      return this.context.getMethod();
   }

   public Type getMethodReturnType() {
      return Type.getReturnType(this.getMethod().desc);
   }

   public AnnotationNode getParent() {
      return this.context.getAnnotationNode();
   }

   public String getSlice() {
      return this.slice;
   }

   public LocalVariableDiscriminator getLocalVariableDiscriminator() {
      return LocalVariableDiscriminator.parse(this.getParent());
   }

   public String get(String var1, String var2) {
      String var3 = this.args.get(var1);
      return var3 != null ? var3 : var2;
   }

   public int get(String var1, int var2) {
      return parseInt(this.get(var1, String.valueOf(var2)), var2);
   }

   public boolean get(String var1, boolean var2) {
      return parseBoolean(this.get(var1, String.valueOf(var2)), var2);
   }

   public <T extends Enum<T>> T get(String var1, T var2) {
      return parseEnum(this.get(var1, var2.name()), (T)var2);
   }

   public ITargetSelector get(String var1) {
      try {
         return TargetSelector.parseAndValidate(this.get(var1, ""), this.context);
      } catch (InvalidSelectorException var3) {
         throw new InvalidInjectionPointException(
            this.getMixin(), var3, "Failed parsing @At(\"%s\").%s \"%s\" on %s", this.at, var1, this.target, this.getDescription()
         );
      }
   }

   public ITargetSelector getTarget() {
      try {
         if (Strings.isNullOrEmpty(this.target)) {
            IAnnotationHandle var1 = this.context.getSelectorAnnotation();
            AnnotationNode var2 = Annotations.getValue(((Annotations.Handle)var1).getNode(), "desc");
            if (var2 != null) {
               String var3 = Annotations.getValue(var2, "id", "at");
               if ("at".equalsIgnoreCase(var3)) {
                  return DynamicSelectorDesc.of(Annotations.handleOf(var2), this.context);
               }
            }
         }

         return TargetSelector.parseAndValidate(this.target, this.context);
      } catch (InvalidSelectorException var4) {
         throw new InvalidInjectionPointException(
            this.getMixin(), var4, "Failed validating @At(\"%s\").target \"%s\" on %s", this.at, this.target, this.getDescription()
         );
      }
   }

   public String getDescription() {
      return InjectionInfo.describeInjector(this.context.getMixin(), this.context.getAnnotationNode(), this.context.getMethod());
   }

   public int getOrdinal() {
      return this.ordinal;
   }

   public int getOpcode() {
      return this.opcode;
   }

   public int getOpcode(int var1) {
      return this.opcode > 0 ? this.opcode : var1;
   }

   public int getOpcode(int var1, int... var2) {
      for (int var6 : var2) {
         if (this.opcode == var6) {
            return this.opcode;
         }
      }

      return var1;
   }

   public int[] getOpcodeList(String var1, int[] var2) {
      String var3 = this.args.get(var1);
      if (var3 == null) {
         return var2;
      }

      TreeSet var4 = new TreeSet();
      String[] var5 = var3.split("[ ,;]");

      for (String var9 : var5) {
         int var10 = Bytecode.parseOpcodeName(var9.trim());
         if (var10 > 0) {
            var4.add(var10);
         }
      }

      return Ints.toArray(var4);
   }

   public String getId() {
      return this.id;
   }

   public boolean isUnsafe() {
      return (this.flags & 1) != 0;
   }

   @Override
   public String toString() {
      return this.type;
   }

   private static Pattern createPattern() {
      return Pattern.compile(String.format("^(.+?)(:(%s))?$", Joiner.on('|').join(InjectionPoint.Specifier.values())));
   }

   public static String parseType(String var0) {
      Matcher var1 = AT_PATTERN.matcher(var0);
      return parseType(var1, var0);
   }

   private static String parseType(Matcher var0, String var1) {
      return var0.matches() ? var0.group(1) : var1;
   }

   private static InjectionPoint.Specifier parseSpecifier(Matcher var0) {
      return var0.matches() && var0.group(3) != null ? InjectionPoint.Specifier.valueOf(var0.group(3)) : InjectionPoint.Specifier.DEFAULT;
   }

   private static int parseInt(String var0, int var1) {
      try {
         return Integer.parseInt(var0);
      } catch (Exception var3) {
         return var1;
      }
   }

   private static boolean parseBoolean(String var0, boolean var1) {
      try {
         return Boolean.parseBoolean(var0);
      } catch (Exception var3) {
         return var1;
      }
   }

   private static <T extends Enum<T>> T parseEnum(String var0, T var1) {
      try {
         return Enum.valueOf((Class<T>)var1.getClass(), var0);
      } catch (Exception var3) {
         return (T)var1;
      }
   }
}
