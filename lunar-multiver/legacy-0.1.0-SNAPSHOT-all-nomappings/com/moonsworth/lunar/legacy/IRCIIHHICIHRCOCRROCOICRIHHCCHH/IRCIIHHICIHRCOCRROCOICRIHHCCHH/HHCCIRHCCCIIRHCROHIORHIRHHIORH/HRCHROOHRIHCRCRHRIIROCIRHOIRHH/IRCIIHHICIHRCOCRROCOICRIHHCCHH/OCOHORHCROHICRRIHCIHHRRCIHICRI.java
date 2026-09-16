package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderXPOrb_v1_7;
import net.minecraft.client.renderer.entity.RenderXPOrb_v1_8;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;

@Pseudo
@Mixin({RenderXPOrb_v1_7.class, RenderXPOrb_v1_8.class})
public class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/item/EntityXPOrb;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;setColorRGBA_I$v1_7(II)V")
   )
   private void lunar$onRender$v1_7(Tessellator var1, int var2, int var3, Operation<Void> var4) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var5.ICOCIIORRIICHOHORHORIIRHCRCOIH()) {
         GL11.glEnable(3042);
         GL11.glEnable(3008);
         var2 = var5.HHCCRIORRORCCIROCIIROIRHHORRHI().CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F);
         var3 = var5.HHCCRIORRORCCIROCIIROIRHHORRHI().IOHCRRIIHCIHORROOCHCCORIHRHCII(0.0F);
      }

      var4.call(new Object[]{var1, var2, var3});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "doRender(Lnet/minecraft/entity/item/EntityXPOrb;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;color$v1_8(IIII)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$onRender$v1_8(BufferBuilder var1, int var2, int var3, int var4, int var5, Operation<BufferBuilder> var6) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var7.ICOCIIORRIICHOHORHORIIRHCRCOIH()) {
         GlStateManager.enableAlpha();
         GlStateManager.enableBlend();
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var8 = var7.HHCCRIORRORCCIROCIIROIRHHORRHI();
         var2 = var8.HCHOOCHIOICRRHHIHHHICIRCIOICRI(0.0F);
         var3 = var8.RORRCRCHIRCHHOOIHCCHRCHORHCICI(0.0F);
         var4 = var8.ROCHRRCORRCOOOOOCOICOCROIIHIHH(0.0F);
         var5 = var8.IOHCRRIIHCIHORROOCHCCORIHRHCII(0.0F);
      }

      return (BufferBuilder)var6.call(new Object[]{var1, var2, var3, var4, var5});
   }
}
