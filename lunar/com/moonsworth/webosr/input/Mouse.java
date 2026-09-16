package com.moonsworth.webosr.input;

public final class Mouse {
   public enum Action {
      DOWN,
      UP,
      MOVED;

      public static Mouse.Action fromValue(int var0) {
         return values()[var0];
      }

      public int getValue() {
         return this.ordinal();
      }
   }

   public enum Button {
      LEFT,
      MIDDLE,
      RIGHT,
      NONE;

      public static Mouse.Button fromValue(int var0) {
         return values()[var0];
      }

      public int getValue() {
         return this.ordinal();
      }
   }

   public enum Cursor {
      POINTER,
      CROSS,
      HAND,
      I_BEAM,
      WAIT,
      HELP,
      EAST_RESIZE,
      NORTH_RESIZE,
      NORTH_EAST_RESIZE,
      NORTH_WEST_RESIZE,
      SOUTH_RESIZE,
      SOUTH_EAST_RESIZE,
      SOUTH_WEST_RESIZE,
      WEST_RESIZE,
      NORTH_SOUTH_RESIZE,
      EAST_WEST_RESIZE,
      NORTH_EAST_SOUTH_WEST_RESIZE,
      NORTH_WEST_SOUTH_EAST_RESIZE,
      COLUMN_RESIZE,
      ROW_RESIZE,
      MIDDLE_PANNING,
      EAST_PANNING,
      NORTH_PANNING,
      NORTH_EAST_PANNING,
      NORTH_WEST_PANNING,
      SOUTH_PANNING,
      SOUTH_EAST_PANNING,
      SOUTH_WEST_PANNING,
      WEST_PANNING,
      MOVE,
      VERTICAL_TEXT,
      CELL,
      CONTEXT_MENU,
      ALIAS,
      PROGRESS,
      NO_DROP,
      COPY,
      NONE,
      NOT_ALLOWED,
      ZOOM_IN,
      ZOOM_OUT,
      GRAB,
      GRABBING,
      CUSTOM,
      PASS_THROUGH;

      public static Mouse.Cursor fromValue(int var0) {
         return values()[var0];
      }

      public int getValue() {
         return this.ordinal();
      }
   }
}
