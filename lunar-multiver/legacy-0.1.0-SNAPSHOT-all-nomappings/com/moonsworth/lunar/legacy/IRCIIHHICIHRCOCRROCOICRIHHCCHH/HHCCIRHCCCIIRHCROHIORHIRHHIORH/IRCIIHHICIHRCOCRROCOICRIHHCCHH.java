package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.entity.Entity;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ModelSkeletonHead implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final IRCIIHHICIHRCOCRROCOICRIHHCCHH COOCOOICRIHHCRCHCOORICHOIHHRRC = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(64);
   public static final IRCIIHHICIHRCOCRROCOICRIHHCCHH HRHHRCCCIRICHCCROHCRRHHCHHIRCI = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(32);
   public final ModelRenderer OHICOHRIIOHHHROORCCOCROIIHIORO = new ModelRenderer(this, 32, 0);

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
      super(0, 0, 64, var1);
      this.OHICOHRIIOHHHROORCCOCROIIHIORO.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
      this.OHICOHRIIOHHHROORCCOCROIIHIORO.setRotationPoint(0.0F, 0.0F, 0.0F);
   }

   public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.render(var1, var2, var3, var4, var5, var6, var7);
      this.OHICOHRIIOHHHROORCCOCROIIHIORO.render(var7);
   }

   public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity var7) {
      super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
      this.OHICOHRIIOHHHROORCCOCROIIHIORO.rotateAngleY = this.skeletonHead.rotateAngleY;
      this.OHICOHRIIOHHHROORCCOCROIIHIORO.rotateAngleX = this.skeletonHead.rotateAngleX;
   }

   public void bridge$showHat(boolean var1) {
      this.OHICOHRIIOHHHROORCCOCROIIHIORO.showModel = var1;
   }
}
