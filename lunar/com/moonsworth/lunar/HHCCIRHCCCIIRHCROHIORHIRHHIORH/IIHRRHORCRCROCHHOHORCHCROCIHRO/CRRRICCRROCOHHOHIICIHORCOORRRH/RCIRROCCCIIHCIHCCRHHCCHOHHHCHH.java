package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import javax.annotation.Nullable;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.Mapping;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   private final String HORIHOCOIORHOOROIROICICICRHHHR;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH CHCICOOHOICHHROOIRICCHHHHOHIOR;
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH[] ROCICHRHCOCRHHHRHCOIOROOORHHHI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, CRRRICCRROCOHHOHIICIHORCOORRRH var2, HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var3) {
      this.HORIHOCOIORHOOROIROICICICRHHHR = var1;
      this.CHCICOOHOICHHROOIRICCHHHHOHIOR = var2;
      this.ROCICHRHCOCRHHHRHCOIOROOORHHHI = var3;
   }

   @Nullable
   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var2 = this.CHCICOOHOICHHROOIRICCHHHHOHIOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      return var2 != null && var2.length > 0 ? var2[0].OOHHRICCIOICOORRRROOCCHRCHOICR()[0] : null;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      ClassNode var2,
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      ClassProvider var4
   ) {
      boolean var5 = this.HORIHOCOIORHOOROIROICICICRHHHR.equals(var2.name);
      if (!var5 && !var2.interfaces.contains(this.HORIHOCOIORHOOROIROICICICRHHHR)) {
         var2.interfaces.add(this.HORIHOCOIORHOOROIROICICICRHHHR);
      }

      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 : this.ROCICHRHCOCRHHHRHCOIOROOORHHHI) {
         if (var5 == var9.isStatic()) {
            try {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var9, var3, var4);
            } catch (Exception var12) {
               MethodNode var11 = var9.HCRRCHCOCHRIIRIHOOIOCCOHHCORHR();
               throw new RuntimeException("Failed to generate bridge implementation for '%s%s' in '%s'".formatted(var11.name, var11.desc, var2.name), var12);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      ClassNode var2,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var3,
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4,
      ClassProvider var5
   ) {
      String var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
      if (var6 != null) {
         MappingSet var7 = var1.getMappings();
         if (var7 != null) {
            var6 = var7.getClassMapping(var6).<String>map(Mapping::getFullDeobfuscatedName).orElse(var6);
         }

         MethodNode var8 = var3.HCRRCHCOCHRIIRIHOOIOCCOHHCORHR();
         RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var9 = var3.ORROCCOHRCROHICHCHIIOOIRRRRHHH().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4);
         if (var9 != null && var9.length != 0) {
            if (var3.isStatic()) {
               MethodNode var10 = var2.methods.stream().filter(var1x -> var1x.name.equals(var8.name) && var1x.desc.equals(var8.desc)).findFirst().orElseThrow();
               ClassNode var11 = var5.getAsNode(var6, 1);
               if (var11 == null) {
                  throw new IllegalStateException("%s was expecting a ClassNode for %s.".formatted(var2.name, var6));
               }

               var10.instructions = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var3, var1, var4, var5, var11
                  )
                  .OCCIHCOCHOHOOHIHCRCORCCCOCCOCH();
            } else {
               MethodNode var12 = new MethodNode();
               var12.name = var8.name;
               var12.desc = var8.desc;
               var12.signature = var8.signature;
               var12.access = 1;
               var12.instructions = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var3, var1, var4, var5, var2
                  )
                  .OCCIHCOCHOHOOHIHCRCORCCCOCCOCH();
               var2.methods.add(var12);
            }
         }
      }
   }

   public String IRRICCOOOOHCHIROHCRHICROHCHHCH() {
      return this.HORIHOCOIORHOOROIROICICICRHHHR;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH RCIIIHHICHOROIIROORCOCIRRCROIR() {
      return this.CHCICOOHOICHHROOIRICCHHHHOHIOR;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH[] ROHRIRHHHRCORCIRCHCICIHCRICIHR() {
      return this.ROCICHRHCOCRHHHRHCOIOROOORHHHI;
   }
}
