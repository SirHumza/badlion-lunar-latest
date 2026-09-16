package org.spongepowered.asm.mixin.refmap;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.extensibility.IRemapper;
import org.spongepowered.asm.mixin.injection.struct.MemberInfo;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Quantifier;

public final class RemappingReferenceMapper implements IClassReferenceMapper, IReferenceMapper {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final IReferenceMapper refMap;
   private final IRemapper remapper;
   private final Map<String, String> mappedReferenceCache = new HashMap<>();

   private RemappingReferenceMapper(MixinEnvironment var1, IReferenceMapper var2) {
      this.refMap = var2;
      this.remapper = var1.getRemappers();
      logger.debug("Remapping refMap {} using remapper chain", var2.getResourceName());
   }

   @Override
   public boolean isDefault() {
      return this.refMap.isDefault();
   }

   @Override
   public String getResourceName() {
      return this.refMap.getResourceName();
   }

   @Override
   public String getStatus() {
      return this.refMap.getStatus();
   }

   @Override
   public String getContext() {
      return this.refMap.getContext();
   }

   @Override
   public void setContext(String var1) {
      this.refMap.setContext(var1);
   }

   @Override
   public String remap(String var1, String var2) {
      return this.remapWithContext(this.getContext(), var1, var2);
   }

   private static String remapMethodDescriptor(IRemapper var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append('(');

      for (Type var6 : Type.getArgumentTypes(var1)) {
         var2.append(var0.mapDesc(var6.getDescriptor()));
      }

      return var2.append(')').append(var0.mapDesc(Type.getReturnType(var1).getDescriptor())).toString();
   }

   @Override
   public String remapWithContext(String var1, String var2, String var3) {
      if (var3.isEmpty()) {
         return var3;
      }

      String var4 = this.refMap.remapWithContext(var1, var2, var3);
      String var5 = this.mappedReferenceCache.get(var4);
      if (var5 != null) {
         return var5;
      }

      String var6 = var4;
      MemberInfo var7 = MemberInfo.parse(var6, null);
      if (var7.getName() == null && var7.getDesc() == null) {
         return var7.getOwner() != null ? new MemberInfo(this.remapper.map(var7.getOwner()), Quantifier.DEFAULT).toString() : var7.toString();
      }

      if (var7.isField()) {
         var6 = new MemberInfo(
               this.remapper.mapFieldName(var7.getOwner(), var7.getName(), var7.getDesc()),
               var7.getOwner() == null ? null : this.remapper.map(var7.getOwner()),
               var7.getDesc() == null ? null : this.remapper.mapDesc(var7.getDesc())
            )
            .toString();
      } else {
         var6 = new MemberInfo(
               this.remapper.mapMethodName(var7.getOwner(), var7.getName(), var7.getDesc()),
               var7.getOwner() == null ? null : this.remapper.map(var7.getOwner()),
               var7.getDesc() == null ? null : remapMethodDescriptor(this.remapper, var7.getDesc())
            )
            .toString();
      }

      this.mappedReferenceCache.put(var4, var6);
      return var6;
   }

   public static IReferenceMapper of(MixinEnvironment var0, IReferenceMapper var1) {
      return !var1.isDefault() ? new RemappingReferenceMapper(var0, var1) : var1;
   }

   @Override
   public String remapClassName(String var1, String var2) {
      return this.remapClassNameWithContext(this.getContext(), var1, var2);
   }

   @Override
   public String remapClassNameWithContext(String var1, String var2, String var3) {
      String var4;
      if (this.refMap instanceof IClassReferenceMapper) {
         var4 = ((IClassReferenceMapper)this.refMap).remapClassNameWithContext(var1, var2, var3);
      } else {
         var4 = this.refMap.remapWithContext(var1, var2, var3);
      }

      return this.remapper.map(var4.replace('.', '/'));
   }
}
