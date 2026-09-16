package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   SPINE(new boolean[][]{{true, false, false}, {true, true, false}, {true, true, true}, {true, true, true}, {true, true, false}, {true, false, false}}),
   HELIX(
      new boolean[][]{{true, true, true, true}, {false, false, false, true}, {true, true, false, true}, {true, false, false, true}, {true, true, true, true}}
   ),
   FOOTPRINT(
      new boolean[][]{
         {true, false, true, false, true},
         {true, false, true, false, true},
         {false, true, true, true, false},
         {false, true, true, true, false},
         {false, false, true, false, false}
      }
   ),
   WEBBED(
      new boolean[][]{
         {false, false, false, true, false, false, false},
         {true, false, false, true, false, false, true},
         {false, true, false, true, false, true, false},
         {false, false, true, true, true, false, false}
      }
   ),
   CLAW(
      new boolean[][]{
         {false, true, false, true, false, false},
         {true, false, true, false, true, false},
         {false, true, false, true, true, false},
         {false, false, true, true, true, true},
         {false, false, false, false, true, false}
      }
   ),
   TUSK(
      new boolean[][]{
         {false, false, true, false, false},
         {false, true, false, true, false},
         {true, false, false, false, false},
         {false, true, false, false, false},
         {false, false, true, true, true}
      }
   ),
   CLUBBED(
      new boolean[][]{
         {false, true, true, true, true, false, false, false},
         {true, false, false, false, false, true, false, false},
         {false, true, false, false, false, false, true, true},
         {false, false, false, false, false, false, true, true}
      }
   ),
   UGLY(
      new boolean[][]{
         {false, true, false, false},
         {true, true, true, false},
         {true, true, true, true},
         {true, true, true, true},
         {true, true, true, false},
         {false, true, false, false}
      }
   );

   private final boolean[][] pattern;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean[][] var3) {
      this.pattern = var3;
   }

   public int getWidth() {
      return this.pattern.length;
   }

   public int getHeight() {
      return this.pattern[0].length;
   }

   public boolean matches(int var1, int var2) {
      return this.pattern[var1][var2];
   }
}
