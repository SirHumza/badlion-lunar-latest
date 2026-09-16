package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   VERTEX("vertex", 35633, true, "vsh", "vert", "glsl"),
   FRAGMENT("fragment", 35632, true, "fsh", "frag", "glsl"),
   GEOMETRY("geometry", 36313, false, "gsh", "geom", "glsl"),
   CONTROL("control", 36488, false, "tesc", "glsl"),
   EVALUATION("evaluation", 36487, false, "tese", "glsl"),
   COMPUTE("compute", 37305, false, "csh", "comp", "glsl");

   private final String name;
   private final int glId;
   private final boolean supported;
   private final String[] extensions;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, int var4, boolean var5, String... var6) {
      this.name = var3;
      this.glId = var4;
      this.supported = var5;
      this.extensions = var6;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   @Override
   public int getGlId() {
      return this.glId;
   }

   @Generated
   @Override
   public boolean isSupported() {
      return this.supported;
   }

   @Generated
   public String[] getExtensions() {
      return this.extensions;
   }
}
