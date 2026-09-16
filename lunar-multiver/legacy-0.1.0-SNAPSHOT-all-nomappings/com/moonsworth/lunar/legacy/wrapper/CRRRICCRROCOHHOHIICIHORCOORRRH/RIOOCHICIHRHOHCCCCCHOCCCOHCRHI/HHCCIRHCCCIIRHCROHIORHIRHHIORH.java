package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Shader;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   public final Shader IHRRRRROICIIICRRHRROIOOIRRIHHC;
   private int COHHHORIIOHCHROOORORRRHOHORHCI = 0;
   private final boolean[] IIHRHRRHIHOCCIIOIIOIIROHHOHRRC;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.IHRRRRROICIIICRRHRROIOOIRRIHHC = (Shader)var1;
      int var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0
         ? this.IHRRRRROICIIICRRHRROIOOIRRIHHC.getShaderManager().samplerNames$v1_7.size()
         : this.IHRRRRROICIIICRRHRROIOOIRRIHHC.getShaderManager().samplerNames$v1_8.size();
      this.IIHRHRRHIHOCCIIOIIOIIROHHOHRRC = new boolean[var2];
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Shader var0) {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         (com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var0
      );
   }

   public void bridge$setupState() {
      this.COHHHORIIOHCHROOORORRRHOHORHCI = com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.OIIOORIROIROCCCHIHHOCICIRRROCR;

      for (int var1 = 0; var1 < this.IIHRHRRHIHOCCIIOIIOIIROHHOHRRC.length; var1++) {
         int var2 = com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHCCORHIOOICOHHOOROOIHICHCRIIH(
            var1
         );
         this.IIHRHRRHIHOCCIIOIIOIIROHHOHRRC[var1] = com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.IIICHHHOHRRIRHHOCIICOHCICRIROO[var2];
      }

      ((com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.IHRRRRROICIIICRRHRROIOOIRRIHHC)
         .lunar$setupState();
   }

   public void bridge$clearState() {
      ((com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.IHRRRRROICIIICRRHRROIOOIRRIHHC)
         .lunar$clearState();

      for (int var1 = this.IIHRHRRHIHOCCIIOIIOIIROHHOHRRC.length - 1; var1 >= 0; var1--) {
         int var2 = com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHCCORHIOOICOHHOOROOIHICHCRIIH(
            var1
         );
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this.IIHRHRRHIHOCCIIOIIOIIROHHOHRRC[var1]);
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.COHHHORIIOHCHROOORORRRHOHORHCI, null);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, Boolean var2) {
      if (com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.OIIOORIROIROCCCHIHHOCICIRRROCR != var1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit + var1);
         } else {
            GL13.glActiveTexture(OpenGlHelper.defaultTexUnit + var1);
         }
      }

      if (var2 != null) {
         if (var2 != com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.OOICOCRIHRIHHRIRROOCORORHRORHI()) {
            if (var2) {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  GlStateManager.enableTexture2D();
               } else {
                  GL11.glEnable(3553);
               }
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               GlStateManager.disableTexture2D();
            } else {
               GL11.glDisable(3553);
            }
         }
      }
   }
}
