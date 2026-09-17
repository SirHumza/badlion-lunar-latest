package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String CCOHIHCOIHIRORIOOIOROHOHRRIROH = "type.googleapis.com/";
   private final HashMap<String, com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>> RROOOHCORRIIHHCOOOCOCORRRRRHCO = new HashMap<>();
   @Nullable
   private final BiConsumer<String, String> OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this(null);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable BiConsumer<String, String> var1) {
      this.OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI = var1;
   }

   public <T extends Message> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<T> var1, Consumer<T> var2) {
      Message var3 = Internal.getDefaultInstance(var1);
      String var4 = var3.getDescriptorForType().getFullName();
      String var5 = "type.googleapis.com/" + var4;
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = this.RROOOHCORRIIHHCOOOCOCORRRRRHCO
         .get(var5);
      if (var6 == null) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = new com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(
            var1, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)
         );
         var8.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
         this.RROOOHCORRIIHHCOOOCOCORRRRRHCO.put(var5, var8);
      } else {
         if (var6.IROCCIIRORHHRICCROCRHCOHICIICC() != var1) {
            throw new IllegalArgumentException("Multiple protobuf classes use the type name " + var4);
         }

         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = var6;
         var7.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<? extends Message> var1, String var2) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var1
      );
      if (var3 != null) {
         var3.IRRIHROCORIOOCHHCHCHOHCIOHHRRI(var2);
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(Class<? extends Message> var1) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var1
      );
      if (var2 != null) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI);
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Any var1) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.CICOOHICHIROHIRCRRIOIIRRIHCCHC(
         var1.getTypeUrl()
      );
      if (var2 == null) {
         return false;
      }

      try {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getValue(), this.OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI);
         return true;
      } catch (InvalidProtocolBufferException var4) {
         return false;
      }
   }

   @Nullable
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> CICOOHICHIROHIRCRRIOIIRRIHCCHC(String var1) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.RROOOHCORRIIHHCOOOCOCORRRRRHCO
         .get(var1);
      if (var2 != null) {
         return var2;
      }

      int var3 = var1.lastIndexOf(47);
      if (var3 == -1) {
         return null;
      }

      String var4 = var1.substring(var3 + 1);
      return this.RROOOHCORRIIHHCOOOCOCORRRRRHCO.get("type.googleapis.com/" + var4);
   }

   @Nullable
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> RRCRRCORICCHOHHIRCHIROOHIIOHCO(Class<? extends Message> var1) {
      Message var2 = Internal.getDefaultInstance(var1);
      String var3 = var2.getDescriptorForType().getFullName();
      return this.RROOOHCORRIIHHCOOOCOCORRRRRHCO.get("type.googleapis.com/" + var3);
   }

   private <T extends Message> Parser<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1) {
      return (Parser<T>)var1.getParserForType();
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends Message> {
      private final Class<T> IOOHRRHORIORHRROHHROIRIOOCCOCH;
      private final String IOOIIROIIOOICHOCICCICHHIHICIOO;
      private final Parser<T> ROIHICOCOIRORRORIHRIHRIOHRRHHC;
      private Consumer<T>[] HROOCOCCRIOCRCCCROOOCHCHIIHHOR;
      @Nullable
      private String HIRROCORCHCHRORRHRIHCIHIHCCHIC;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<T> var1, Parser<T> var2) {
         this.IOOHRRHORIORHRROHHROIRIOOCCOCH = var1;
         this.IOOIIROIIOOICHOCICCICHHIHICIOO = var1.getSimpleName();
         this.ROIHICOCOIRORRORIHRIHRIOHRRHHC = var2;
         this.HROOCOCCRIOCRCCCROOOCHCHIIHHOR = new Consumer[0];
      }

      private Class<T> IROCCIIRORHHRICCROCRHCOHICIICC() {
         return this.IOOHRRHORIORHRROHHROIRIOOCCOCH;
      }

      private void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Consumer<T> var1) {
         Consumer[] var2 = Arrays.copyOf(this.HROOCOCCRIOCRCCCROOOCHCHIIHHOR, this.HROOCOCCRIOCRCCCROOOCHCHIIHHOR.length + 1);
         var2[this.HROOCOCCRIOCRCCCROOOCHCHIIHHOR.length] = Objects.requireNonNull(var1, "packetConsumer");
         this.HROOCOCCRIOCRCCCROOOCHCHIIHHOR = var2;
      }

      private void IRRIHROCORIOOCHHCHCHOHCIOHHRRI(String var1) {
         this.HIRROCORCHCHRORRHRIHCIHIHCCHIC = Objects.requireNonNull(var1, "moduleId");
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteString var1, @Nullable BiConsumer<String, String> var2) {
         Message var3 = this.ROIHICOCOIRORRORIHRIHRIOHRRHHC.parseFrom(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         Consumer[] var4 = this.HROOCOCCRIOCRCCCROOOCHCHIIHHOR;

         for (Consumer var8 : var4) {
            var8.accept(var3);
         }
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable BiConsumer<String, String> var1) {
         if (this.HIRROCORCHCHRORRHRIHCIHIHCCHIC != null && var1 != null) {
            var1.accept(this.HIRROCORCHCHRORRHRIHCIHIHCCHIC, this.IOOIIROIIOOICHOCICCICHHIHICIOO);
         }
      }
   }
}
