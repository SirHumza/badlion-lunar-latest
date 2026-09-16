package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.util.Annotations;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements IClassBytecodeProvider {
   private static final String ICOHRRRIIOOIIRRIRORICHOCIRHHRI = "com/moonsworth/lunar/ichor/synthetic/DummyTarget";
   private static final String IIIIICHIOOICORCHCCCICIRRCCRIRC = "com/moonsworth/lunar/ichor/synthetic/IDummyTarget";
   private final com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] IORCRRICHOOOHROHOCIROCCRCRHRCC;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.IORCRRICHOOOHROHOCIROCCRCRHRCC = var1.IHIRRIIORRHORHRORIHOROIRCORCOO()
         .CHIOHRROCCRCCHHCCRRHCROOOICCOI()
         .IORCCOCHCIHRRRCIHHRCOOCRCCOCIR()
         .values()
         .stream()
         .flatMap(Collection::stream)
         .filter(
            var0 -> var0.RHIRRIRRHCIRIRICORCOHHHCHOOOCR() instanceof com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
         .map(var0 -> (com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0.RHIRRIRRHCIRIRICORCOHHHCHOOOCR())
         .toArray(com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH[]::new);
      if (this.IORCRRICHOOOHROHOCIROCCRCRHRCC.length == 0) {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.warn("No MixinClassNodeHandlers found!");
      }
   }

   @Override
   public ClassNode getClassNode(String var1) {
      return this.getClassNode(var1, true);
   }

   @Override
   public ClassNode getClassNode(String var1, boolean var2) {
      if ("com/moonsworth/lunar/ichor/synthetic/DummyTarget".equals(var1)) {
         return this.IOHHHRCRHCOOIROHRRCOHOOIRRCCCI();
      } else if ("com/moonsworth/lunar/ichor/synthetic/IDummyTarget".equals(var1)) {
         return this.OIOOCHIOOIOCHIRHHRCCHHOIHCHORH();
      } else {
         ClassLoader var3 = MixinBootstrap.class.getClassLoader();
         if (!(var3 instanceof com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4)) {
            throw new Error("Attempted to load Mixin from " + var3.getName());
         } else {
            com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var4.IHIIOIIICRCHHHCOIRIIICIRIRIICO();
            ClassNode var6 = var5.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var1, false);
            if (var6 == null) {
               throw new Error("Failed to get patched class for " + var1);
            }

            OOROOCCIRCCRHOIOIORIHCHHOOCCOR var7 = var5.IHIRRIIORRHORHRORIHOROIRCORCOO();
            if (com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var6)
               && !this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var7)) {
               return this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var6);
            }

            for (com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var11 : this.IORCRRICHOOOHROHOCIROCCRCRHRCC) {
               var11.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6, var5);
            }

            return var6;
         }
      }
   }

   @Override
   public ClassNode getClassNode(String var1, boolean var2, int var3) {
      return this.getClassNode(var1, var2);
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2) {
      for (com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 : this.IORCRRICHOOOHROHOCIROCCRCRHRCC) {
         if (!var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2)) {
            return false;
         }
      }

      return true;
   }

   private ClassNode OHHRIOHROOIHOROCIRHCHORIHRRRRI(ClassNode var1) {
      AnnotationNode var2 = Annotations.get(
         new ArrayList<>(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1).keySet()), Type.getDescriptor(Mixin.class)
      );
      Annotations.setValue(var2, "value", List.of());
      List var3;
      if ((var1.access & 512) == 512) {
         var3 = List.of("com/moonsworth/lunar/ichor/synthetic/IDummyTarget");
      } else {
         var3 = List.of("com/moonsworth/lunar/ichor/synthetic/DummyTarget");
      }

      Annotations.setValue(var2, "targets", var3);
      var1.superName = "java/lang/Object";
      var1.interfaces.clear();
      return var1;
   }

   private ClassNode IOHHHRCRHCOOIROHRRCOHOOIRRCCCI() {
      ClassNode var1 = new ClassNode();
      var1.name = "com/moonsworth/lunar/ichor/synthetic/DummyTarget";
      var1.access = 32;
      var1.version = 52;
      var1.superName = "java/lang/Object";
      return var1;
   }

   private ClassNode OIOOCHIOOIOCHIRHHRCCHHOIHCHORH() {
      ClassNode var1 = new ClassNode();
      var1.name = "com/moonsworth/lunar/ichor/synthetic/IDummyTarget";
      var1.access = 512;
      var1.version = 52;
      return var1;
   }
}
