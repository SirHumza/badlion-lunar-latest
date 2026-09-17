package com.moonsworth.lunar.client.util;

import com.google.gson.JsonObject;
import com.google.protobuf.Duration;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.JsonFormat;
import com.lunarclient.common.v1.Direction;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3i;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class CCHORHIOORICCIRIHRIIHIICORIORO {
   public static UUID RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Uuid var0) {
      return new UUID(var0.getHigh64(), var0.getLow64());
   }

   public static List<UUID> OCOHORHCROHICRRIHCIHHRRCIHICRI(Collection<Uuid> var0) {
      return var0.stream().map(CCHORHIOORICCIRIHRIIHIICORIORO::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH).collect(Collectors.toList());
   }

   public static Uuid IRIHOIRCHIRRCRIOORCOICORHHORHH(UUID var0) {
      return Uuid.newBuilder().setHigh64(var0.getMostSignificantBits()).setLow64(var0.getLeastSignificantBits()).build();
   }

   public static List<Uuid> CIOHHCORHRCCRICCCORIHCRHCCCRRR(Collection<UUID> var0) {
      return var0.stream().map(CCHORHIOORICCIRIHRIIHIICORIORO::IRIHOIRCHIRRCRIOORCOICORHHORHH).collect(Collectors.toList());
   }

   public static Instant RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Timestamp var0) {
      return Instant.ofEpochSecond(var0.getSeconds(), var0.getNanos());
   }

   public static Timestamp CRICCOOHHHCHOORCICOCOHIHOIRHOO(Instant var0) {
      return Timestamp.newBuilder().setSeconds(var0.getEpochSecond()).setNanos(var0.getNano()).build();
   }

   public static UuidAndUsername CORCOCICIRIOHROHROIIOOHICCHCRR(UUID var0, String var1) {
      return UuidAndUsername.newBuilder().setUuid(IRIHOIRCHIRRCRIOORCOICORHHORHH(var0)).setUsername(var1).build();
   }

   public static UuidAndUsername RHCHRCOCCOIIIHCHRHIRCORHRHRICR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0
   ) {
      return UuidAndUsername.newBuilder().setUuid(IRIHOIRCHIRRCRIOORCOICORHHORHH(var0.bridge$getUniqueID())).setUsername(var0.bridge$getName()).build();
   }

   public static UuidAndUsername OROIOCRCROHIOOOIRIHHHCHICCIRIC() {
      return RHCHRCOCCOIIIHCHRHIRCORHRHRICR(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
   }

   public static Direction IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return Direction.forNumber(var0.getId() + 1);
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Direction var0
   ) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.byId(
         var0.getNumber() - 1
      );
   }

   public static Vector3f HRCHROOHRIHCRCRHRIIROCIRHOIRHH(org.joml.Vector3f var0) {
      return Vector3f.newBuilder().setX(var0.x()).setY(var0.y()).setZ(var0.z()).build();
   }

   public static org.joml.Vector3f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3f var0) {
      return new org.joml.Vector3f(var0.getX(), var0.getY(), var0.getZ());
   }

   public static Timestamp IHROCRRIRIROCCCRCRRROCRRCRIIHH(long var0) {
      return Timestamp.newBuilder().setSeconds(var0 / 1000L).setNanos((int)(var0 % 1000L * 1000000L)).build();
   }

   public static long IRCIIHHICIHRCOCRROCOICRIHHCCHH(Timestamp var0) {
      return var0.getSeconds() * 1000L + var0.getNanos() / 1000000;
   }

   public static Duration RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(java.time.Duration var0) {
      return Duration.newBuilder().setSeconds(var0.toSeconds()).setNanos(var0.toNanosPart()).build();
   }

   public static Vector2i RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(org.joml.Vector2i var0) {
      return Vector2i.newBuilder().setX(var0.x).setZ(var0.y).build();
   }

   public static org.joml.Vector2i RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector2i var0) {
      return new org.joml.Vector2i(var0.getX(), var0.getZ());
   }

   public static Vector3i RIROICHCRROROHCCROOCCCCOCHCCRI(org.joml.Vector3i var0) {
      return Vector3i.newBuilder().setX(var0.x()).setY(var0.y()).setZ(var0.z()).build();
   }

   public static org.joml.Vector3i RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3i var0) {
      return new org.joml.Vector3i(var0.getX(), var0.getY(), var0.getZ());
   }

   public static Struct IHRHHHORORIROOCORCIORRCOCHHHRI(JsonObject var0) {
      Struct.Builder var1 = Struct.newBuilder();

      try {
         JsonFormat.parser().merge(var0.toString(), var1);
      } catch (InvalidProtocolBufferException var3) {
         throw new RuntimeException(var3);
      }

      return var1.build();
   }

   public static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Struct var0) {
      try {
         String var1 = JsonFormat.printer().print(var0);
         return IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var1, JsonObject.class);
      } catch (InvalidProtocolBufferException var2) {
         throw new RuntimeException(var2);
      }
   }
}
