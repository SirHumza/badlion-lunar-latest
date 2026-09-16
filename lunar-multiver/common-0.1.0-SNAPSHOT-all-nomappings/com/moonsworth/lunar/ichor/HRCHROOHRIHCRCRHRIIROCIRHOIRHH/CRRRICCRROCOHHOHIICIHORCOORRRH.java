package com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import lombok.Generated;
import org.cadixdev.bombe.type.ArrayType;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.ObjectType;
import org.cadixdev.bombe.type.Type;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final Map<String, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> ROCCCOOCICORRHOHROCHOCICOROCRR = new HashMap<>();
   private final Map<String, String> OHIHHCOCCHOOIRHCOHOROHHRCHIROI = new HashMap<>();
   private final Map<String, String> ICOHOICHICOIHOOIHRRROHOHOCHICO = new HashMap<>();

   public void HROHCRIOCIHCORHOHIOCIHOHHCIIRH(List<String> var1) {
      try {
         HashMap var2 = new HashMap();

         for (String var4 : var1) {
            if (!var4.startsWith("#") && !var4.isBlank()) {
               String[] var5 = var4.split("\t");
               if (var5.length == 6) {
                  String var6 = var5[0];
                  String var7 = var5[1];
                  String var8 = var5[2];
                  String var9 = var5[3];
                  String var10 = var5[4];
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INNER;
                  if (Character.isDigit(var10.charAt(0))) {
                     try {
                        Integer.parseInt(var10);
                        var11 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ANONYMOUS;
                     } catch (NumberFormatException var13) {
                        var11 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LOCAL;
                     }
                  }

                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var6, var7, var8.isBlank() ? null : var8, var9.isBlank() ? null : var9, var10, Integer.parseInt(var5[5]), var11
                  );
                  var2.put(var6, var12);
               }
            }
         }

         for (Entry var16 : var2.entrySet()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var17 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var16.getValue();
            ArrayList var18 = new ArrayList();
            var18.add(var17);

            for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var19 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get(var17.IRHCROCOHCCOHHCHOOCRCIOCRHORRH());
               var19 != null;
               var19 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get(var19.IRHCROCOHCCOHHCHOOCRCIOCRHORRH())
            ) {
               var18.add(var19);
            }

            for (int var20 = var18.size() - 1; var20 > 0; var20--) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var22 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var18.get(var20);
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var24 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var18.get(var20 - 1);
               var24.RRIOIROCRCCCCROHHCRHOOROOHRROI(var22.HRRHHIOHRORCCOCHICROIIORHHCCIR());
            }

            BiFunction var21 = (var1x, var2x) -> {
               if (var2x == null) {
                  var2x = new ArrayList();
               }

               var2x.add(var17);
               return var2x;
            };
            String var23 = var17.CCRIRCCRHHCICOHRIHOIIRORCHIOOI();
            this.ROCCCOOCICORRHOHROCHOCICOROCRR.compute(var23, var21);
            this.ROCCCOOCICORRHOHROCHOCICOROCRR.compute(var17.IRHCROCOHCCOHHCHOOCRCIOCRHORRH(), var21);
            String var25 = var17.HRRHHIOHRORCCOCHICROIIORHHCCIR();
            this.OHIHHCOCCHOOIRHCOHOROHHRCHIROI.put(var23, var25);
            this.ICOHOICHICOIHOOIHRRROHOHOCHICO.put(var25, var23);
         }
      } catch (Throwable var14) {
         throw var14;
      }
   }

   public String remap(String var1) {
      return this.OHIHHCOCCHOOIRHCOHOROHHRCHIROI.getOrDefault(var1, var1);
   }

   public String unmap(String var1) {
      return this.ICOHOICHICOIHOOIHRRROHOHOCHICO.getOrDefault(var1, var1);
   }

   public FieldType RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FieldType var1) {
      if (var1 instanceof ObjectType var2) {
         return new ObjectType(this.remap(var2.getClassName()));
      } else {
         return (FieldType)(var1 instanceof ArrayType var3 ? new ArrayType(var3.getDimCount(), this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.getComponent())) : var1);
      }
   }

   public MethodDescriptor RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MethodDescriptor var1) {
      Object var2 = var1.getReturnType();
      if (var2 instanceof FieldType var3) {
         var2 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
      }

      List var4 = var1.getParamTypes().stream().map(this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH).toList();
      return new MethodDescriptor(var4, (Type)var2);
   }

   public static Optional<CRRRICCRROCOHHOHIICIHORCOORRRH> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      String var1 = var0.RIOHOIHIOORHIIICRCOCRCICORICRH() + ".nest";

      try (InputStream var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.class.getClassLoader().getResourceAsStream(var1)) {
         if (var2 != null) {
            String[] var3 = new String(com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var2)).split("\n");
            CRRRICCRROCOHHOHIICIHORCOORRRH var4 = new CRRRICCRROCOHHOHIICIHORCOORRRH();
            var4.HROHCRIOCIHCORHOHIOCIHOHHCIIRH(List.of(var3));
            return Optional.of(var4);
         }
      } catch (IOException var8) {
         var8.printStackTrace();
      }

      return Optional.empty();
   }

   @Generated
   public Map<String, List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> HHHOCRICHHHRROOCOHIOCCHRRRCHCC() {
      return this.ROCCCOOCICORRHOHROCHOCICOROCRR;
   }

   @Generated
   public Map<String, String> HHICCHOHIIHHICROIHOIOHHIHHRRII() {
      return this.OHIHHCOCCHOOIRHCOHOROHHRCHIROI;
   }

   @Generated
   public Map<String, String> HCIORCCOCROIORCOHCRRRHCOOOHCRR() {
      return this.ICOHOICHICOIHOOIHRRROHOHOCHICO;
   }
}
