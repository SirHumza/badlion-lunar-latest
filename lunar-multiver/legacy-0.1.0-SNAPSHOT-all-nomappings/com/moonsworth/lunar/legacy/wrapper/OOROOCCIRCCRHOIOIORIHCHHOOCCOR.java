package com.moonsworth.lunar.legacy.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.util.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR
   extends ModelBase
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final ModelBase RHOOICCCOCCCHORCCHHOOIHIRHOHOR;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
      this.textureWidth = 256;
      this.textureHeight = 256;
      this.setTextureOffset("wing.skin", -56, 88);
      this.setTextureOffset("wingtip.skin", -56, 144);
      this.setTextureOffset("wing.bone", 112, 88);
      this.setTextureOffset("wingtip.bone", 112, 136);
      ModelRenderer var1 = new ModelRenderer(this, "wing");
      var1.setRotationPoint(-12.0F, 5.0F, 2.0F);
      var1.addBox("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      var1.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      ModelRenderer var2 = new ModelRenderer(this, "wingtip");
      var2.setRotationPoint(-56.0F, 0.0F, 0.0F);
      var2.addBox("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      var2.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      var1.addChild(var2);
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR = new ModelBase() {};
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.textureHeight = 256;
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.textureWidth = 256;
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.setTextureOffset("wing.skin", -56, 88);
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.setTextureOffset("wingtip.skin", -56, 144);
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.setTextureOffset("wing.bone", 112, 88);
      this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.setTextureOffset("wingtip.bone", 112, 136);
      ModelRenderer var3 = new ModelRenderer(this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR, "wing");
      var3.setRotationPoint(-12.0F, 5.0F, 2.0F);
      var3.addBox("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      var3.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      ModelRenderer var4 = new ModelRenderer(this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR, "wingtip");
      var4.setRotationPoint(-56.0F, 0.0F, 0.0F);
      var4.addBox("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      var4.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      var3.addChild(var4);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1, float var2, float var3, RCIROOOOICRHCCRRCIORHHIRCOIIIC var4) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GL_SRC_ALPHA,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GL_ONE_MINUS_SRC_ALPHA
      );
      Minecraft.getMinecraft().getTextureManager().bindTexture((ResourceLocation)var4);
      var1.push();
      var1.scale(var2, var2, var2);
      GL11.glRotatef(15.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.5F, 0.25F);
      long var5 = System.currentTimeMillis();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HOROHROIORRIRIIIOOCCIROCRCROHI()
            .HRCHICHIOHOROOHHHOHROHCICCROIO()
            .getTime();
      }

      float var7 = (float)(var5 % 2000L) / 2000.0F * (float) Math.PI * 2.0F;
      List var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.boxList$v1_8
         : this.RHOOICCCOCCCHORCCHHOOIHIRHOHOR.boxList$v1_7;
      ModelRenderer var9 = (ModelRenderer)var8.get(0);
      ModelRenderer var10 = (ModelRenderer)var8.get(1);

      for (int var11 = 0; var11 < 2; var11++) {
         GL11.glEnable(2884);
         var9.rotateAngleX = -0.125F - (float)ICICIOCHHHIHOCHCOHORIHRCOHHOCR.HRHRORCIRICHCCCCCHICOOICIRHRIO(var7) * 0.2F;
         var9.rotateAngleY = 0.75F;
         var9.rotateAngleZ = (float)(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.sin(var7) + 0.125) * 0.8F;
         var10.rotateAngleZ = (float)(ICICIOCHHHIHOCHCOHORIHRCOHHOCR.sin(var7 + 2.0F) + 0.5) * 0.75F;
         var9.render(var3);
         var1.scale(-1.0F, 1.0F, 1.0F);
         if (var11 == 0) {
            GL11.glCullFace(1028);
         }

         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.GL_FLAT
         );
      }

      var1.pop();
      GL11.glCullFace(1029);
      GL11.glDisable(2884);
   }
}
