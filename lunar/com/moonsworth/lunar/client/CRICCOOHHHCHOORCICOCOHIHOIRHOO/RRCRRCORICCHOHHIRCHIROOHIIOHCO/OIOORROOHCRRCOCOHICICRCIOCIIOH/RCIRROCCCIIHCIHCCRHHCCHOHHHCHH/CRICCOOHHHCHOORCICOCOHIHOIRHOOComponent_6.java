package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @Nullable
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROIRIOCHHCCCOOORHCOCOICCROOORO;
   private final com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO RRRIICCRHHROIIOIOHHIRIOCCRCCHH;
   @Nullable
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORCHOCHHHRROCOHOOCHIHRHCRIRRHC;
   private final int OHCIIOIHROOORHCCRIORCOOHCHRHHH;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      this(var1, var2, var3, 20);
   }

   @Override
   public int getWidth() {
      return this.OHCIIOIHROOORHCCRIORCOOHCHRHHH;
   }

   @Override
   public int getHeight() {
      return this.OHCIIOIHROOORHCCRIORCOOHCHRHHH + 4;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      int var4
   ) {
      int var5 = var3;
      int var6 = var4;
      float var7 = 1.0F;
      boolean var8 = false;
      switch (this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().RCIIIRRHHHHRHRIRHHROIRICHIHROC()) {
         case CLOAK:
            var3++;
            var4 -= 5;
            var7 = 1.6F;
            break;
         case SUITS:
            var3 += 7;
            var4 += 12;
            var7 = 0.65F;
            break;
         case BACKPACK:
            var3 += 5;
            var4 += 10;
            var7 = 0.65F;
            break;
         case SHOES:
            var3 += 3;
            var4 += 9;
            var7 = 0.9F;
            break;
         case WINGS:
            if (this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().RIOOHOOCORIROCOHRORRHHCIIORRCO()) {
               var3 += 4;
               var4 += 20;
               var7 = 0.5F;
            } else {
               var3 -= 6;
               var4 -= 12;
               var7 = 2.1F;
            }
            break;
         case BELTS:
            var3 += 4;
            var4 += 9;
            var7 = 0.9F;
            break;
         case NECKWEAR:
            var3 += 5;
            var4 += 11;
            var7 = 0.75F;
            break;
         case BODYWEAR:
            var3 += 3;
            var4 += 10;
            var7 = 0.9F;
            break;
         case MASK:
            var3 += 3;
            var4 += 8;
            break;
         case GLASSES:
            var4 += 9;
            var3 += 4;
            var7 = 0.9F;
            break;
         case BANDANNA:
            var3 += 3;
            var4 += 6;
            var7 = 0.9F;
            break;
         case HAT:
            var3 += 4;
            var4 += 10;
            var7 = 0.75F;
            var8 = true;
            break;
         case PET:
            var3 += 5;
            var4 += 10;
            var7 = 0.65F;
            var8 = true;
            break;
         case COMPANION:
            var3 += 9;
            var4 -= 18;
            var7 = 0.55F;
      }

      if (var8 && this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC != null) {
         Vector3f var9 = new Vector3f(
               (float)(this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC.bridge$getMaxX() - this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC.bridge$getMinX()),
               (float)(this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC.bridge$getMaxY() - this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC.bridge$getMinY()),
               (float)(this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC.bridge$getMaxZ() - this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC.bridge$getMinZ())
            )
            .normalize();
         if (var9.y() > Math.max(var9.x(), var9.z())) {
            var7 = var9.y();
            var3 += (int)((this.OHCIIOIHROOORHCCRIORCOOHCHRHHH - this.OHCIIOIHROOORHCCRIORCOOHCHRHHH * var7) / 2.0F);
            var4 += (int)((this.OHCIIOIHROOORHCCRIORCOOHCHRHHH - this.OHCIIOIHROOORHCCRIORCOOHCHRHHH * var7) / 3.0F);
         }
      }

      if (var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var15
         )
       {
         var1.push();
         var1.scale(var7, var7, var7);
         OCOHORHCROHICRRIHCIHHRRCIHICRI var10 = var15.HHIIOHOORHHCCHRHHRCIORCROORCOI();
         this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH
            .OOICHRIOOOOIOHOIHOIRIRROCHRIOO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH,
               this.ROIRIOCHHCCCOOORHCOCOICCROOORO,
               var10,
               var3 / var7,
               var4 / var7,
               this.OHCIIOIHROOORHCCRIORCOOHCHRHHH,
               this.OHCIIOIHROOORHCCRIORCOOHCHRHHH,
               -1
            );
         var10.IIORCRHOICRHCHRROORHCRRRCRRCOI();
         var1.pop();
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 30) {
         int var16 = var5 - this.OHCIIOIHROOORHCCRIORCOOHCHRHHH;
         int var11 = var6 - this.OHCIIOIHROOORHCCRIORCOOHCHRHHH;
         float var12 = var7;
         float var13 = (var3 - var16) / var7;
         float var14 = (var4 - var11) / var7;
         var1.OHIROCOCCHORRCCHIOICOCOHRHORCC()
            .orElseThrow()
            .bridge$submitPictureInPicture$v1_21_6(
               this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH.OOICHRIOOOOIOHOIHOIRIRROCHRIOO(),
               var16,
               var11,
               var5 + this.getWidth() + this.OHCIIOIHROOORHCCRIORCOOHCHRHHH,
               var6 + this.getHeight() + this.OHCIIOIHROOORHCCRIORCOOHCHRHHH,
               var4x -> {
                  var4x.push();
                  var4x.scale(var12, var12, var12);
                  this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH
                     .OOICHRIOOOOIOHOIHOIRIRROCHRIOO()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH,
                        this.ROIRIOCHHCCCOOORHCOCOICCROOORO,
                        var4x,
                        var13,
                        var14,
                        this.OHCIIOIHROOORHCCRIORCOOHCHRHHH,
                        this.OHCIIOIHROOORHCCRIORCOOHCHRHHH,
                        -1
                     );
                  var4x.pop();
               }
            );
      }
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      int var4
   ) {
      this.ROIRIOCHHCCCOOORHCOCOICCROOORO = var1;
      this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH = var2;
      this.ORCHOCHHHRROCOHOOCHIHRHCRIRRHC = var3;
      this.OHCIIOIHROOORHCCRIORCOOHCHRHHH = var4;
   }

   @Generated
   public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO HHRIHIRIHRHHROICOHOCHIIIHORRCC() {
      return this.RRRIICCRHHROIIOIOHHIRIOCCRCCHH;
   }
}
