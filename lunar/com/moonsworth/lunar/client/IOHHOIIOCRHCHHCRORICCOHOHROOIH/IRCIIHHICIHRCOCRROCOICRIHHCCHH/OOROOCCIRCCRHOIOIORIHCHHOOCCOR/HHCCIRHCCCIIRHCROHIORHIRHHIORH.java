package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private static final Lookup HOCCHCIOICOIHORCRCIOICOCRCROIO = MethodHandles.lookup();
   private static final ClassValue<Map<String, com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>> CIOHIHCIIRCRIRHIHORRRRCHIRCCRI = new ClassValue<Map<String, com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>>() {
      protected Map<String, com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HCHRIROHHHCORIOCROOCHRCIOROOCI(
         Class<?> var1
      ) {
         ConcurrentHashMap var2 = new ConcurrentHashMap();
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHICORCROOROHCIHIHCOIHRRHICICO(
               var1
            )
            .forEach(var1x -> var2.put(var1x.HCHRICRHOHOCIHRORHICHCCIICOCRC, var1x));
         return var2;
      }
   };
   private final Map<String, Object> OICHIHHHIHRROHCCIROOOCICHCIHCR = new ConcurrentHashMap<>();
   @Nullable
   private JsonObject ROCRHRRCROHHCOICIHHCIROICIOICI = null;
   private boolean dirty = false;
   private boolean IRRCOOOHHOHOICCOCOCRIORHHRCRCH = false;

   public <T> void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(String var1, T[] var2) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Arrays.asList(var2));
   }

   public <T> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Collection<T> var2) {
      LinkedHashSet var4 = new LinkedHashSet();
      boolean var5 = false;

      for (Object var7 : var2) {
         Object var3;
         if (var7 instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8
            )
          {
            var3 = var8;
         } else if (var7 instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9
            )
          {
            var3 = var9.CORROIRHRRIHCRHIROHHORCCHIIRCO();
         } else if (var7 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var10) {
            var3 = var10;
         } else if (var7 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var11) {
            var3 = var11.provide();
         } else if (var7 != null
            && !(var7 instanceof Boolean)
            && !(var7 instanceof CharSequence)
            && !(var7 instanceof Number)
            && !(var7 instanceof JsonElement)) {
            var3 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var7, var1).CCHORHIOORICCIRIHRIIHIICORIORO(var7);
         } else {
            var3 = var7;
         }

         var5 |= var3 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
         var4.add(var3);
      }

      this.IIHRRHORCRCROCHHOHORCHCROCIHRO(
         var1, var5 ? RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var4) : RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var4)
      );
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(String var1, @Nullable Object var2) {
      Object var3;
      if (var2 instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4
         )
       {
         var3 = var4;
      } else if (var2 instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5
         )
       {
         var3 = var5.CORROIRHRRIHCRHIROHHORCCHIIRCO();
      } else if (var2 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var6) {
         var3 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var6
         );
      } else if (var2 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var7) {
         var3 = var7.provide();
      } else if (var2 != null && !(var2 instanceof Boolean) && !(var2 instanceof CharSequence) && !(var2 instanceof Number) && !(var2 instanceof JsonElement)) {
         var3 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2, var1).CCHORHIOORICCIRIHRIIHIICORIORO(var2);
      } else {
         var3 = var2;
      }

      if (var3 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI) {
         this.IRRCOOOHHOHOICCOCOCRIORHHRCRCH = true;
      }

      this.OICHIHHHIHRROHCCIROOOCICHCIHCR.compute(var1, (var2x, var3x) -> {
         boolean var4x = var3x == null;
         if (var4x && var3 == null) {
            return null;
         }

         if (var4x || !var3x.equals(var3)) {
            this.dirty = true;
         }

         return var3;
      });
   }

   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      if (this.IRRCOOOHHOHOICCOCOCRIORHHRCRCH && !this.dirty) {
         this.OICHIHHHIHRROHCCIROOOCICHCIHCR
            .forEach(
               (var1, var2) -> {
                  if (var2 instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
                     )
                   {
                     this.dirty = this.dirty | var3.dirty;
                  } else if (var2 instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4
                     )
                   {
                     var4.HRRORHCRHHRROHIOROOOORRIRRCCIC();
                  }
               }
            );
      }

      if (this.dirty) {
         this.OOIICORHCCIRIRHCCRRHRRHHCROHRH();
      }

      return this.ROCRHRRCROHHCOICIHHCIROICIOICI;
   }

   private void OOIICORHCCIRIRHCCRRHRRHHCROHRH() {
      this.dirty = false;
      if (this.OICHIHHHIHRROHCCIROOOCICHCIHCR.isEmpty()) {
         this.ROCRHRRCROHHCOICIHHCIROICIOICI = null;
      } else {
         this.ROCRHRRCROHHCOICIHHCIROICIOICI = new JsonObject();
         this.OICHIHHHIHRROHCCIROOOCICHCIHCR.forEach((var1, var2) -> this.ROCRHRRCROHHCOICIHHCIROICIOICI.add(var1, CCRHOICIRORRHOOOCIHHHHCHCICHOH(var2)));
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.IRRCOOOHHOHOICCOCOCRIORHHRCRCH = this.IRRCOOOHHOHOICCOCOCRIORHHRCRCH | var1.IRRCOOOHHOHOICCOCOCRIORHHRCRCH;
      this.OICHIHHHIHRROHCCIROOOCICHCIHCR.putAll(var1.OICHIHHHIHRROHCCIROOOCICHCIHCR);
      this.dirty = true;
   }

   public void OCOHORHCROHICRRIHCIHHRRCIHICRI(String var1, Object var2) {
      if (this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2, var1).CCHORHIOORICCIRIHRIIHIICORIORO(var2) instanceof com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4
         )
       {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
      } else {
         throw new IllegalStateException(var1 + " is not a ComposingJsonDataProvider");
      }
   }

   public void clear() {
      this.OICHIHHHIHRROHCCIROOOCICHCIHCR.clear();
      this.dirty = true;
   }

   public static JsonElement CCRHOICIRORRHOOOCIHHHHCHCICHOH(Object var0) {
      if (var0 instanceof JsonElement var1) {
         return var1;
      } else if (var0 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2) {
         return var2.provide();
      } else {
         return var0 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3
            ? var3.HRRORHCRHHRROHIOROOOORRIRRCCIC()
            : IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJsonTree(var0);
      }
   }

   private com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Object var1, String var2
   ) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = CIOHIHCIIRCRIRHIHORRRRCHIRCCRI.get(
            var1.getClass()
         )
         .get(var2);
      if (var3 != null) {
         return var3;
      } else {
         throw new IllegalStateException("No data provider with that name assigned");
      }
   }

   private static Set<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> IHICORCROOROHCIHIHCOIHRRHICICO(
      Class<?> var0
   ) {
      return Arrays.stream(var0.getMethods())
         .filter(var0x -> var0x.isAnnotationPresent(CRRRICCRROCOHHOHIICIHORCOORRRH.class))
         .map(
            var0x -> com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
               var0x.getAnnotation(CRRRICCRROCOHHOHIICIHORCOORRRH.class), var0x
            )
         )
         .map(
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH::RRCRRCORICCHOHHIRCHIROOHIIOHCO
         )
         .map(
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH::CRRRICCRROCOHHOHIICIHORCOORRRH
         )
         .collect(Collectors.toSet());
   }

   private static com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO<CRRRICCRROCOHHOHIICIHORCOORRRH, CallSite> var0
   ) {
      try {
         return new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            ((CRRRICCRROCOHHOHIICIHORCOORRRH)var0.OHICIOOICHICOIOCOROIIOCCHRRCIC).value(),
            (Function)((CallSite)var0.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC).getTarget().invokeExact()
         );
      } catch (Throwable var2) {
         throw new RuntimeException(var2);
      }
   }

   private static com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO<CRRRICCRROCOHHOHIICIHORCOORRRH, CallSite> RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO<CRRRICCRROCOHHOHIICIHORCOORRRH, Method> var0
   ) {
      try {
         MethodHandle var1 = HOCCHCIOICOIHORCRCIOICOCRCROIO.unreflect((Method)var0.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC);
         return com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
            (CRRRICCRROCOHHOHIICIHORCOORRRH)var0.OHICIOOICHICOIOCOROIIOCCHRRCIC,
            LambdaMetafactory.metafactory(
               HOCCHCIOICOIHORCRCIOICOCRCROIO,
               "apply",
               MethodType.methodType(Function.class),
               MethodType.methodType(Object.class, Object.class),
               var1,
               var1.type()
            )
         );
      } catch (Throwable var2) {
         throw new RuntimeException(var2);
      }
   }

   @Generated
   public Map<String, Object> ORROHCIHCIRIROCORRORRIRRHRCIOO() {
      return this.OICHIHHHIHRROHCCIROOOCICHCIHCR;
   }

   protected class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
      private final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HCIHOIHICIHIOHRIIIORICOCCHHCCR;
      private JsonElement CHRRROIICCRICRHIRCCIHOCOOICCIC = null;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2) {
         this.HCIHOIHICIHIOHRIIIORICOCCHHCCR = var2;
      }

      @Nullable
      @Override
      public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
         boolean var1 = this.CHRRROIICCRICRHIRCCIHOCOOICCIC == null;
         JsonElement var2 = this.HCIHOIHICIHIOHRIIIORICOCCHHCCR.HRRORHCRHHRROHIOROOOORRIRRCCIC();
         if (var1 && var2 == null) {
            return null;
         }

         if (var1 || !this.CHRRROIICCRICRHIRCCIHOCOOICCIC.equals(var2)) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.dirty = true;
         }

         this.CHRRROIICCRICRHIRCCIHOCOOICCIC = var2;
         return var2;
      }
   }

   private record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final String HCHRICRHOHOCIHRORHICHCCIICOCRC;
      private final Function<Object, Object> ICHRHHHOORCOOIIHIHCRIRHCHOORHO;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Function<Object, Object> var2) {
         this.HCHRICRHOHOCIHRORHICHCCIICOCRC = var1;
         this.ICHRHHHOORCOOIIHIHCRIRHCHOORHO = var2;
      }

      Object CCHORHIOORICCIRIHRIIHIICORIORO(Object var1) {
         return this.ICHRHHHOORCOOIIHIHCRIRHCHOORHO.apply(var1);
      }

      public String name() {
         return this.HCHRICRHOHOCIHRORHICHCCIICOCRC;
      }

      public Function<Object, Object> RRCOCCHIRIHRHORRCHOHCHOIIOIHOH() {
         return this.ICHRHHHOORCOOIIHIHCRIRHCHOORHO;
      }
   }

   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO();

      @Nullable
      @Override
      default JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
         return this.CORROIRHRRIHCRHIROHHORCCHIIRCO() == null ? null : this.CORROIRHRRIHCRHIROHHORCCHIIRCO().HRRORHCRHHRROHIOROOOORRIRRCCIC();
      }

      @Override
      default JsonElement provide() {
         return this.CORROIRHRRIHCRHIROHHORCCHIIRCO() == null ? null : this.CORROIRHRRIHCRHIROHHORCCHIIRCO().HRRORHCRHHRROHIOROOOORRIRRCCIC();
      }
   }
}
