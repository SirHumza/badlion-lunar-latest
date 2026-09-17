package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.cadixdev.bombe.type.BaseType;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   public static final String RIICCICCRROHCCOHCCOCOIORIRHOOR = "Lorg/spongepowered/asm/mixin/";
   public static final String IHIRHHCRRIHRIHRIIIRHRHRRIIIRRR = "Lcom/llamalad7/mixinextras/injector/";
   public static final String CCCOCOHOHRRIOIRCCHHROCCCRIRIOR = "Lorg/spongepowered/asm/mixin/Mixin;";
   public static final String ORRICHIRCORORRIIOROHCOOCHHHCIO = "Lorg/spongepowered/asm/mixin/Shadow;";
   public static final String OCCRIRRRRIRROOHIOIRRHHOOCIIHOH = "Lorg/spongepowered/asm/mixin/Overwrite;";
   public static final String ROIIOCHRORHHIIRHHRRHOIRCCOCICH = "Lorg/spongepowered/asm/mixin/gen/Accessor;";
   public static final String RIROORRIOHIHOIIHIORRICOHCRIICR = "Lorg/spongepowered/asm/mixin/gen/Invoker;";
   private static final boolean RRHOORCIOOHOHCHIRRCOOCIHOIHHRC = false;
   private final com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH CRRHICHOICHRHCICIOHHCORCOCHHCR;
   private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIRIIICRIOOOHCIIHHHCHRRHCCICIR;
   private final ClassNode ROOOROCIIIRRIIHIIHIHRHCHICCCIO;
   private final MappingSet CRCCROOICRCHOIICCCRCOCCHIROOHI;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO OOCORICIHOCCOORIRRIIHIHIROIOOI;
   private final Map<AnnotationNode, Object> HCRIRCOHIIOOHROCHHRICIIOROOOIO;
   private List<ClassMapping<?, ?>> COHOOHRIRRRHIRCHOCHRROROIOCRHI = null;
   private final MappingSet RIOHROOOOICIIIIIRHRHCCROHCOHOH = MappingSet.create();
   private static final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH, CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> HRCOCHRHIHIOIHCCCHCHRROHCRCCHR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHRCCIIHCHIIRORORRICRHOIOOCHRH()
      .IRCIIHHICIHRCOCRROCOICRIHHCCHH(10L, TimeUnit.SECONDS)
      .IHIHOIOHCOOORRHIICCROCHRCOIHHO();

   public static ClassNode RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var0,
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      ClassNode var2,
      MappingSet var3,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var4
   ) {
      Map var5 = CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2);
      if (!var5.isEmpty()) {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var6 = new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0, var1, var2, var3, var4, var5);
         var6.remap();
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var6.RIOHROOOOICIIIIIRHRHCCROHCOHOH, var1, false, false);
         var7.getCompletedClassMapping(var2.name);
         var2 = com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0.IHIRRIIORRHORHRORIHOROIRCORCOO(), var2, var7
         );
      } else if (var2.outerClass != null && (var2.access & 65536) == 0) {
         ClassNode var12 = var1.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var2.outerClass, false);
         var5 = CIOHHCORHRCCRICCCORIHCRHCCCRRR(var12);
         if (!var5.isEmpty()) {
            ArrayList var13 = new ArrayList();

            for (FieldNode var9 : var12.fields) {
               LinkedHashMap var10 = new LinkedHashMap();
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var9.visibleAnnotations, var9);
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var9.invisibleAnnotations, var9);
               var10.forEach((var2x, var3x) -> {
                  if (var2x.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
                     var13.add(var9.name);
                  }
               });
            }

            for (MethodNode var16 : var12.methods) {
               LinkedHashMap var18 = new LinkedHashMap();
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var18, var16.visibleAnnotations, var16);
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var18, var16.invisibleAnnotations, var16);
               var18.forEach((var2x, var3x) -> {
                  if (var2x.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
                     var13.add(var16.name + var16.desc);
                  }
               });
            }

            List var15 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3, var4, var12, var5.keySet(), var1);
            MappingSet var17 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var15, var12.name, var13);
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR var19 = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var17, var4.HOIIOIHICHOCHRCICHOIOOCCCOOCRH());
            com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var0.IHIRRIIORRHORHRORIHOROIRCORCOO(), var2, var19
            );
         }
      }

      return var2;
   }

   private static MappingSet RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MappingSet var0, List<? extends ClassMapping<?, ?>> var1, String var2, List<String> var3) {
      MappingSet var4 = MappingSet.create();
      ClassMapping var5 = var4.getOrCreateClassMapping(var2);

      for (ClassMapping var7 : var1) {
         for (FieldMapping var9 : var7.getFieldMappings()) {
            if (var3.contains(var9.getObfuscatedName())) {
               var5.createFieldMapping(var9.getObfuscatedName(), var9.getDeobfuscatedName());
            }
         }

         for (MethodMapping var12 : var7.getMethodMappings()) {
            if (var3.contains(var12.getObfuscatedName() + var12.getDescriptor())) {
               MethodDescriptor var10 = var0.deobfuscate(var12.getDescriptor());
               var5.createMethodMapping(var12.getObfuscatedName(), var10).setDeobfuscatedName(var12.getDeobfuscatedName());
            }
         }
      }

      return var4;
   }

   public static Map<AnnotationNode, Object> CIOHHCORHRCCRICCCORIHCRHCCCRRR(ClassNode var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0.visibleAnnotations, var0);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0.invisibleAnnotations, var0);

      for (FieldNode var3 : var0.fields) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3.visibleAnnotations, var3);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3.invisibleAnnotations, var3);
      }

      for (MethodNode var5 : var0.methods) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5.visibleAnnotations, var5);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5.invisibleAnnotations, var5);
      }

      return var1;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<AnnotationNode, Object> var0, List<AnnotationNode> var1, Object var2) {
      if (var1 != null) {
         for (AnnotationNode var4 : var1) {
            if (var4.desc.startsWith("Lorg/spongepowered/asm/mixin/") || var4.desc.startsWith("Lcom/llamalad7/mixinextras/injector/")) {
               var0.put(var4, var2);
            }
         }
      }
   }

   private CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      ClassNode var3,
      MappingSet var4,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var5,
      Map<AnnotationNode, Object> var6
   ) {
      this.CRRHICHOICHRHCICIOHHCORCOCHHCR = var1;
      this.RIRIIICRIOOOHCIIHHHCHRRHCCICIR = var2;
      this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO = var3;
      this.CRCCROOICRCHOIICCCRCOCCHIROOHI = var4;
      this.OOCORICIHOCCOORIRRIIHIHIROIOOI = var5;
      this.HCRIRCOHIIOOHROCHHRICIIOROOOIO = var6;
   }

   private void remap() {
      Map var1 = this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO);
      this.COHOOHRIRRRHIRCHOCHRROROIOCRHI = var1.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
      this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2 -> {
         for (Entry var4 : var1.entrySet()) {
            String var5x = (String)var4.getKey();
            if (!var5x.equals(this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO.name)) {
               List var6 = (List)var4.getValue();
               ClassMapping var7 = this.RIOHROOOOICIIIIIRHRHCCROHCOHOH.getOrCreateClassMapping(var5x);

               for (ClassMapping var9 : var6) {
                  for (FieldMapping var11 : var9.getFieldMappings()) {
                     var2.createFieldMapping(var11.getObfuscatedName()).setDeobfuscatedName(var11.getDeobfuscatedName());
                     var7.createFieldMapping(var11.getObfuscatedName()).setDeobfuscatedName(var11.getDeobfuscatedName());
                  }

                  for (MethodMapping var14 : var9.getMethodMappings()) {
                     String var12 = this.OOCORICIHOCCOORIRRIIHIHIROIOOI.mapMethodDesc(var14.getObfuscatedDescriptor());
                     var2.createMethodMapping(var14.getObfuscatedName(), var12).setDeobfuscatedName(var14.getDeobfuscatedName());
                     var7.createMethodMapping(var14.getObfuscatedName(), var12).setDeobfuscatedName(var14.getDeobfuscatedName());
                  }
               }
            }
         }
      });
      this.HCRIRCOHIIOOHROCHHRICIIOROOOIO.forEach(this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);

      for (FieldNode var3 : this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO.fields) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
      }

      for (MethodNode var5 : this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO.methods) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5);
      }
   }

   private Map<String, List<ClassMapping<?, ?>>> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(ClassNode var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      List var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.HCRIRCOHIIOOHROCHHRICIIOROOOIO.keySet());
      var2.put(var1.name, var3);
      String var4 = var1.superName;

      while (var4 != null && !"java/lang/Object".equals(var4)) {
         try {
            String var5 = var4;
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = HRCOCHRHIHIOIHCCCHCHRROHCRCCHR.get(
               new CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, this.RIRIIICRIOOOHCIIHHHCHRRHCCICIR), () -> {
                  ClassNode var2x = this.RIRIIICRIOOOHCIIHHHCHRRHCCICIR.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var5, false);
                  Map var3x = CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2x);
                  if (!var3x.isEmpty()) {
                     List var4x = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x, var3x.keySet());
                     return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2x.superName, var4x);
                  } else {
                     return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2x.superName, null);
                  }
               }
            );
            if (var6.IROROIHHOHIHIIRICIIIOIRHHOOCOO == null) {
               break;
            }

            var2.put(var5, var6.IROROIHHOHIHIIRICIIIOIRHHOOCOO);
            var4 = var6.superName;
         } catch (Exception var7) {
            break;
         }
      }

      return var2;
   }

   private List<ClassMapping<?, ?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassNode var1, Collection<AnnotationNode> var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.CRRHICHOICHRHCICIOHHCORCOCHHCR,
         this.CRCCROOICRCHOIICCCRCOCCHIROOHI,
         this.OOCORICIHOCCOORIRRIIHIHIROIOOI,
         var1,
         var2,
         this.RIRIIICRIOOOHCIIHHHCHRRHCCICIR
      );
   }

   private static List<ClassMapping<?, ?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var0,
      MappingSet var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      ClassNode var3,
      Collection<AnnotationNode> var4,
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5
   ) {
      return IHICORCROOROHCIHIHCOIHRRHICICO(var4)
         .map(var2x -> var0.IHIRRIIORRHORHRORIHOROIRCORCOO().HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(var3.name, var2x))
         .map(var2x -> {
            var2x = var2x.replace('.', '/');
            ClassMapping var3x = var1.getClassMapping(var2x).orElse(null);
            String var4x = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2x, null);
            if (var3x == null && var4x == null) {
               try {
                  ClassNode var5x = var5.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var2x, false);
                  if (var5x.superName != null && !"java/lang/Object".equals(var5x.superName)) {
                     var3x = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1, null, var5x.superName, var2x);
                  }

                  for (String var7 : var5x.interfaces) {
                     var3x = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1, var3x, var7, var2x);
                  }
               } catch (Exception var8) {
               }
            }

            if (var3x != null && var4x == null) {
               return var3x;
            } else {
               return var4x == null ? null : var1.getClassMapping(var4x).orElse(null);
            }
         })
         .filter(Objects::nonNull)
         .map(var1x -> var2.getCompletedClassMapping(var1x.getFullObfuscatedName()))
         .collect(Collectors.toList());
   }

   @NotNull
   private static Stream<String> IHICORCROOROHCIHIHCOIHRRHICICO(Collection<AnnotationNode> var0) {
      return var0.stream()
         .filter(var0x -> var0x.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;"))
         .findFirst()
         .stream()
         .flatMap(var0x -> var0x.values.stream())
         .flatMap(var0x -> var0x instanceof ArrayList ? ((ArrayList)var0x).stream() : Stream.of((Object)var0x))
         .map(var0x -> {
            if (var0x instanceof Type var1) {
               String var3 = var1.getDescriptor();
               return var3.substring(1, var3.length() - 1);
            } else if (var0x instanceof String var2) {
               return var2.indexOf(46) == -1 && var2.indexOf(47) == -1 ? null : var2;
            } else {
               return null;
            }
         })
         .filter(Objects::nonNull);
   }

   private void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(Consumer<ClassMapping<?, ?>> var1) {
      var1.accept(this.RIOHROOOOICIIIIIRHRHCCROHCOHOH.getOrCreateClassMapping(this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO.name));
   }

   private static ClassMapping<?, ?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, MappingSet var1, ClassMapping<?, ?> var2, String var3, String var4
   ) {
      if (var3.startsWith("java/")) {
         return var2;
      }

      Optional var5 = var1.getClassMapping(var3);

      ClassNode var6;
      try {
         var6 = var0.CCIHHRIOOOOCOHRCIHOHROOICIORCC(var3, false);
      } catch (Exception var11) {
         return var2;
      }

      if (var5.isPresent()) {
         ClassMapping var7 = (ClassMapping)var5.get();
         if (var2 == null) {
            var2 = var1.getOrCreateClassMapping(var4);
         }

         for (FieldMapping var9 : var7.getFieldMappings()) {
            String var10 = var5.<FieldMapping>flatMap(var1x -> var1x.getFieldMapping(var9.getDeobfuscatedName()))
               .map(Mapping::getDeobfuscatedName)
               .orElse(var9.getDeobfuscatedName());
            var2.getOrCreateFieldMapping(var9.getObfuscatedName()).setDeobfuscatedName(var10);
         }

         for (MethodMapping var17 : var7.getMethodMappings()) {
            String var20 = var5.<MethodMapping>flatMap(var1x -> var1x.getMethodMapping(var17.getDeobfuscatedSignature()))
               .map(Mapping::getDeobfuscatedName)
               .orElse(var17.getDeobfuscatedName());
            var2.getOrCreateMethodMapping(MethodSignature.of(var17.getObfuscatedName(), var17.getObfuscatedDescriptor())).setDeobfuscatedName(var20);
         }

         for (FieldMapping var18 : var7.getFieldMappings()) {
            var2.getOrCreateFieldMapping(var18.getObfuscatedName()).setDeobfuscatedName(var18.getDeobfuscatedName());
         }

         for (MethodMapping var19 : var7.getMethodMappings()) {
            var2.getOrCreateMethodMapping(MethodSignature.of(var19.getObfuscatedName(), var19.getObfuscatedDescriptor()))
               .setDeobfuscatedName(var19.getDeobfuscatedName());
         }
      }

      if (var6.superName != null) {
         var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var6.superName, var4);
      }

      for (String var16 : var6.interfaces) {
         var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, var16, var4);
      }

      return var2;
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(FieldNode var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.visibleAnnotations, var1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.invisibleAnnotations, var1);
      var2.forEach(
         (var2x, var3) -> {
            if (var2x.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
               String var4 = var1.name;
               Optional var5 = this.COHOOHRIRRRHIRCHOCHRROROIOCRHI
                  .stream()
                  .map(var1xx -> var1xx.getFieldMapping(var4))
                  .filter(Optional::isPresent)
                  .map(Optional::get)
                  .findFirst();
               var5.ifPresent(var3x -> {
                  String var4x = var3x.getDeobfuscatedName();
                  if (!var4x.equals(var4)) {
                     var1.name = var4x;
                     this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2xxx -> var2xxx.createFieldMapping(var4, var4x));
                  }
               });
            }
         }
      );
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(MethodNode var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.visibleAnnotations, var1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.invisibleAnnotations, var1);
      var2.forEach(
         (var2x, var3) -> {
            String var4 = var2x.desc;
            if (var4.equals("Lorg/spongepowered/asm/mixin/Overwrite;")) {
               var1.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var1.access);
            }

            if (var4.equals("Lorg/spongepowered/asm/mixin/Shadow;") || var4.equals("Lorg/spongepowered/asm/mixin/Overwrite;")) {
               MethodDescriptor var16 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.CRCCROOICRCHOIICCCRCOCCHIROOHI, MethodDescriptor.of(var1.desc)
               );
               String var17 = var1.name;
               MethodSignature var19 = new MethodSignature(var17, var16);
               Object var21 = var17;
               if (var21.startsWith("shadow$")) {
                  var21 = var21.replace("shadow$", "");
               }

               String var23 = var21 + var16;

               try {
                  String var24 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     this.CRCCROOICRCHOIICCCRCOCCHIROOHI,
                     var23,
                     this.COHOOHRIRRRHIRCHOCHRROROIOCRHI,
                     CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL
                  );
                  MethodSignature var25;
                  if (!var24.equals(var23) && var24.indexOf(40) != -1) {
                     var25 = MethodSignature.of(var24);
                  } else {
                     var25 = null;
                     var24 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        this.CRCCROOICRCHOIICCCRCOCCHIROOHI,
                        (String)var21,
                        this.COHOOHRIRRRHIRCHOCHRROROIOCRHI,
                        CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL
                     );
                  }

                  if (var25 != null) {
                     String var12 = var25.getName();
                     var1.name = var12;
                     var1.desc = this.CRCCROOICRCHOIICCCRCOCCHIROOHI.deobfuscate(var25.getDescriptor()).toString();
                     MethodSignature var13 = MethodSignature.of(var17, var1.desc);
                     this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2xx -> var2xx.createMethodMapping(var13, var12));
                  } else if (!var24.equals(var1.name)) {
                     int var26 = var24.indexOf(40);
                     if (var26 != -1) {
                        String var27 = var24.substring(0, var26);
                        String var14 = var24.substring(var26);
                        var1.name = var27;
                        var1.desc = var14;
                        this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2xx -> var2xx.createMethodMapping(var19, var27));
                     } else {
                        var1.name = var24;
                        this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2xx -> var2xx.createMethodMapping(var19, var1.name));
                     }
                  }
               } catch (Exception var15) {
               }
            } else if ((var4.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;") || var4.equals("Lorg/spongepowered/asm/mixin/gen/Invoker;"))
               && var2x.values == null) {
               String var5 = var1.name;
               boolean var6 = false;
               if (var5.startsWith("is")) {
                  var5 = var5.substring(2);
                  var6 = true;
               } else if (var5.startsWith("get") || var5.startsWith("set") || var5.startsWith("new")) {
                  var5 = var5.substring(3);
                  var6 = true;
               } else if (var5.startsWith("call")) {
                  var5 = var5.substring(4);
                  var6 = true;
               } else if (var5.startsWith("invoke") || var5.startsWith("create")) {
                  var5 = var5.substring(6);
                  var6 = true;
               }

               if (var6 && var5.length() > 2) {
                  boolean var7 = true;

                  for (char var11 : var5.toCharArray()) {
                     if (Character.isLowerCase(var11)) {
                        var7 = false;
                        break;
                     }
                  }

                  if (!var7) {
                     var5 = Character.toLowerCase(var5.charAt(0)) + var5.substring(1);
                  }
               }

               String var18 = this.CRRHICHOICHRHCICIOHHCORCOCHHCR
                  .IHIRRIIORRHORHRORIHOROIRCORCOO()
                  .HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO.name, var5);
               String var20 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.CRCCROOICRCHOIICCCRCOCCHIROOHI,
                  var18,
                  this.COHOOHRIRRRHIRCHOCHRROROIOCRHI,
                  CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL
               );
               ArrayList var22 = new ArrayList();
               var22.add("value");
               var22.add(var20);
               var22.add("remap");
               var22.add(false);
               var2x.values = var22;
            }
         }
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AnnotationNode var1, @Nullable Object var2) {
      List var3 = var1.values;
      if (var3 != null) {
         for (byte var4 = 0; var4 < var3.size() && var3.size() >= var4 + 1; var4 += 2) {
            Object var5 = var3.get(var4 + 1);
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL;
            if (var1.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
               var6 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FIELD;
               var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6);
               if (var5 instanceof String var7 && var7.contains(":")) {
                  var5 = var7.substring(0, var7.indexOf(58));
               }
            } else if (var1.desc.equals("Lorg/spongepowered/asm/mixin/gen/Invoker;")) {
               var6 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.METHOD;
               Object var15 = var5;
               if (var15 instanceof String var8 && !var8.contains("(") && var2 instanceof MethodNode var9) {
                  MethodDescriptor var10 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     this.CRCCROOICRCHOIICCCRCOCCHIROOHI, MethodDescriptor.of(var9.desc)
                  );
                  String var11 = var15 + var10.toString();
                  var11 = (String)this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var6);
                  if (var11.contains("(")) {
                     var11 = var11.substring(0, var11.indexOf("("));
                  }

                  var15 = var11;
               }

               if (Objects.equals(var5, var15)) {
                  var15 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15, var6);
               }

               var5 = var15;
            } else {
               var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6);
            }

            var3.set(var4 + 1, var5);
         }
      }
   }

   private Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      if (!(var1 instanceof ArrayList var3)) {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      } else {
         for (int var4 = 0; var4 < var3.size(); var4++) {
            Object var5 = var3.get(var4);
            var3.set(var4, this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var2));
         }

         return var3;
      }
   }

   private Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object var1, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      if (var1 instanceof String var3) {
         String var6 = this.CRRHICHOICHRHCICIOHHCORCOCHHCR
            .IHIRRIIORRHORHRORIHOROIRCORCOO()
            .HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(this.ROOOROCIIIRRIIHIIHIHRHCHICCCIO.name, var3);
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CRCCROOICRCHOIICCCRCOCCHIROOHI, var6, this.COHOOHRIRRRHIRCHOCHRROROIOCRHI, var2);
      } else if (var1 instanceof Type var4) {
         return Type.getType("L" + this.OOCORICIHOCCOORIRRIIHIHIROIOOI.mapType(var4.getInternalName()) + ";");
      } else if (!(var1 instanceof AnnotationNode var5)) {
         return var1;
      } else {
         if (var5.desc.startsWith("Lorg/spongepowered/asm/mixin/") || var5.desc.startsWith("Lcom/llamalad7/mixinextras/injector/")) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, null);
         }

         return var5;
      }
   }

   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      MappingSet var1, String var2, List<ClassMapping<?, ?>> var3, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      if (var3 == null) {
         throw new IllegalStateException("Failed to find target classes?");
      }

      int var5 = var2.indexOf(40);
      int var6 = var2.indexOf(76);
      int var7 = var2.indexOf(59);
      int var8 = var2.indexOf(58);
      int var9 = var2.indexOf(42);
      if (var6 != 0 || var7 >= var5 && var7 >= var8 && var7 >= var9) {
         if (var8 != -1) {
            try {
               String var20 = var2.substring(0, var8);
               String var24 = var2.substring(var8 + 1);
               String var27 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var20, var3);
               FieldType var31 = FieldType.of(var24);
               boolean var32 = BaseType.isValidBase(var24.charAt(0));
               boolean var15 = var24.length() > 1;
               if (!var32 || !var15) {
                  var24 = var1.deobfuscate(var31).toString();
               }

               return var27 + ":" + var24;
            } catch (Exception var19) {
            }
         }

         MethodSignature var10;
         try {
            var10 = MethodSignature.of(var2);
         } catch (Exception var17) {
            var10 = null;
         }

         if (var2.startsWith("<") && var5 != -1) {
            int var11 = var2.indexOf(62);
            String var12 = var2.substring(0, var11 + 1);
            String var13 = var2.substring(var11 + 1);

            try {
               return var12 + var1.deobfuscate(MethodDescriptor.of(var13)).toString();
            } catch (Exception var18) {
               if (!var13.contains("*")) {
                  throw new IllegalStateException("Failed to parse " + var13 + " from " + var2, var18);
               }
            }
         }

         for (ClassMapping var25 : var3) {
            if (var10 != null) {
               MethodMapping var29 = var25.getMethodMapping(var10).orElse(null);
               if (var29 != null) {
                  return var29.getDeobfuscatedSignature().toJvmsIdentifier();
               }
            } else if (var4 != CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FIELD) {
               for (MethodMapping var14 : var25.getMethodMappings()) {
                  if (var14.getObfuscatedName().equals(var2)) {
                     return var14.getDeobfuscatedSignature().toJvmsIdentifier();
                  }
               }
            }

            if (var4 != CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.METHOD) {
               FieldMapping var30 = var25.getFieldMapping(var2).orElse(null);
               if (var30 != null) {
                  if (var5 == -1) {
                     return var30.getDeobfuscatedSignature().getName();
                  }

                  return var30.getDeobfuscatedSignature().toJvmsIdentifier();
               }
            }
         }

         if (var5 != -1) {
            String var23 = var2.substring(0, var5);
            String var26 = var2.substring(var5);

            try {
               return var23 + var1.deobfuscate(MethodDescriptor.of(var26)).toString();
            } catch (IllegalStateException var16) {
               return var2;
            }
         } else {
            if (var2.contains("/") || var2.contains(".")) {
               if (var2.startsWith("L") && var2.endsWith(";")) {
                  var2 = var2.substring(1, var2.length() - 1);
               }

               Optional var22 = var1.getClassMapping(var2).map(Mapping::getFullDeobfuscatedName);
               if (var22.isPresent()) {
                  return (String)var22.get();
               }
            }

            return var2;
         }
      } else {
         return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
      }
   }

   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MappingSet var1, String var2, List<ClassMapping<?, ?>> var3) {
      for (ClassMapping var5 : var3) {
         FieldMapping var6 = var5.getFieldMapping(var2).orElse(null);
         if (var6 != null) {
            return var6.getDeobfuscatedSignature().getName();
         }
      }

      return var2;
   }

   private String HHCCIRHCCCIIRHCROHIORHIRHHIORH(MappingSet var1, String var2) {
      int var3 = var2.indexOf(59);
      if (var3 == -1) {
         return var2;
      }

      String var4 = var2.substring(1, var3);
      var4 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4);
      ClassMapping var5 = var1.computeClassMapping(var4)
         .map(var1x -> this.OOCORICIHOCCOORIRRIIHIHIROIOOI.getCompletedClassMapping(var1x.getFullObfuscatedName()))
         .orElse(null);
      String var6;
      List var7;
      if (var5 == null) {
         var6 = var4;
         var7 = List.of();
      } else {
         var6 = var5.getFullDeobfuscatedName();
         var7 = List.of(var5);
      }

      String var8 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2.substring(var3 + 1), var7, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALL);
      return "L" + var6 + ";" + var8;
   }

   private record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      private final String superName;
      @Nullable
      private final List<ClassMapping<?, ?>> IROROIHHOHIHIIRICIIIOIRHHOOCOO;

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, @Nullable List<ClassMapping<?, ?>> var2) {
         this.superName = var1;
         this.IROROIHHOHIHIIRICIIIOIRHHOOCOO = var2;
      }

      public String HHHICIHHRRHCCICHRRHOIOHCCOCOOR() {
         return this.superName;
      }

      @Nullable
      public List<ClassMapping<?, ?>> ROOOIOHCRIHIRRRHHRCHOHCIIRRHCI() {
         return this.IROROIHHOHIHIIRICIIIOIRHHOOCOO;
      }
   }

   private record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final String IOCIHIHRRIRHCOHHOICROROORRCCIR;
      private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HIROOROCIHOHOIORCCCIHRRRIOOHOH;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         this.IOCIHIHRRIRHCOHHOICROROORRCCIR = var1;
         this.HIROOROCIHOHOIORCCCIHRRRIOOHOH = var2;
      }

      public String className() {
         return this.IOCIHIHRRIRHCOHHOICROROORRCCIR;
      }

      public com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HICRCCRCORCCIROHHCCOOCCIHOIHCC() {
         return this.HIROOROCIHOHOIORCCCIHRRRIOOHOH;
      }
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      ALL,
      FIELD,
      METHOD;
   }
}
