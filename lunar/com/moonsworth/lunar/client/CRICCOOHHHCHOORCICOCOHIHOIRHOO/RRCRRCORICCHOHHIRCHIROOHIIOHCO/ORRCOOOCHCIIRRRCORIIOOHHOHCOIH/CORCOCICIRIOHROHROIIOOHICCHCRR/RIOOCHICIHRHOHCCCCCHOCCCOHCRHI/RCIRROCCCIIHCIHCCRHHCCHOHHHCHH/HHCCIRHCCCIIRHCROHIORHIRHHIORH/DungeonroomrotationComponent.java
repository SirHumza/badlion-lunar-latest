package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.lunarclient.websocket.skyblock.v1.DungeonRoomRotation;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import lombok.Generated;
import org.joml.Vector3i;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   EAST(7, 0),
   SOUTH(30, 7),
   WEST(23, 30),
   NORTH(0, 23);

   public static final IRCIIHHICIHRCOCRROCOICRIHHCCHH[] VALUES = values();
   private final int x;
   private final int z;

   public RORCHCIIICOHIRROOORHOCCCCIOCCI getCorner(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      Vector3i var2 = switch (this) {
         case SOUTH -> new Vector3i(0, 0, -7);
         case WEST -> new Vector3i(7, 0, 0);
         case NORTH -> new Vector3i(0, 0, 7);
         default -> new Vector3i(-7, 0, 0);
      };
      return var1.bridge$add(var2);
   }

   public RORCHCIIICOHIRROOORHOCCCCIOCCI inverseGetCorner(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      Vector3i var2 = switch (this) {
         case SOUTH -> new Vector3i(0, 0, -7);
         case WEST -> new Vector3i(7, 0, 0);
         case NORTH -> new Vector3i(0, 0, 7);
         default -> new Vector3i(-7, 0, 0);
      };
      return var1.bridge$add(var2.mul(-1));
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH asDirectionBridge() {
      return switch (this) {
         case SOUTH -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SOUTH;
         case WEST -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WEST;
         case NORTH -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.NORTH;
         case EAST -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.EAST;
      };
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromProto(DungeonRoomRotation var0) {
      return switch (var0) {
         case DUNGEON_ROOM_ROTATION_EAST -> EAST;
         case DUNGEON_ROOM_ROTATION_SOUTH -> SOUTH;
         case DUNGEON_ROOM_ROTATION_WEST -> WEST;
         case DUNGEON_ROOM_ROTATION_NORTH -> NORTH;
         default -> null;
      };
   }

   public DungeonRoomRotation toProto() {
      return switch (this) {
         case SOUTH -> DungeonRoomRotation.DUNGEON_ROOM_ROTATION_SOUTH;
         case WEST -> DungeonRoomRotation.DUNGEON_ROOM_ROTATION_WEST;
         case NORTH -> DungeonRoomRotation.DUNGEON_ROOM_ROTATION_NORTH;
         case EAST -> DungeonRoomRotation.DUNGEON_ROOM_ROTATION_EAST;
      };
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var3, int var4) {
      this.x = var3;
      this.z = var4;
   }

   @Generated
   public int getX() {
      return this.x;
   }

   @Generated
   public int getZ() {
      return this.z;
   }
}
