package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   private final List<Vector3dc> IIRIRCOHCIIOHIHCRHHICHOIIOOOII = new ArrayList<>();

   @Override
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICICIOCHHHIHOCHCOHORIHRCOHHOCR(double var1, double var3, double var5) {
      this.IIRIRCOHCIIOHIHCRHHICHOIIOOOII.add(new Vector3d(var1, var3, var5));
      return this;
   }

   @Override
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI CIOHHCORHRCCRICCCORIHCRHCCCRRR(double var1, double var3) {
      this.IIRIRCOHCIIOHIHCRHHICHOIIOOOII.add(new Vector3d(var1, -1.0, var3));
      return this;
   }

   @Override
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, double var2, double var4, double var6) {
      if (var1 >= this.IIRIRCOHCIIOHIHCRHHICHOIIOOOII.size()) {
         this.IIRIRCOHCIIOHIHCRHHICHOIIOOOII.add(new Vector3d(var2, var4, var6));
      } else {
         this.IIRIRCOHCIIOHIHCRHHICHOIIOOOII.set(var1, new Vector3d(var2, var4, var6));
      }

      return this;
   }

   @Generated
   public List<Vector3dc> getPoints() {
      return this.IIRIRCOHCIIOHIHCRHHICHOIIOOOII;
   }
}
