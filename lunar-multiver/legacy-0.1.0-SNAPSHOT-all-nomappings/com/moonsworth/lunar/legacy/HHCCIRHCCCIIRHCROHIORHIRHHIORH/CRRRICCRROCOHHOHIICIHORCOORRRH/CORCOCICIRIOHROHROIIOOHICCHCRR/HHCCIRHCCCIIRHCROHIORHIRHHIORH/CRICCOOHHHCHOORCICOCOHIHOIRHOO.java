package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer_v1_8;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityBeacon.BeamSegment;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(TileEntityBeaconRenderer_v1_8.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Unique
   private World bridge$world = null;
   @Unique
   private List<BeamSegment> bridge$beamSegments = null;

   @Shadow
   public abstract void renderBeacon$v1_12(double var1, double var3, double var5, double var7, double var9, List<BeamSegment> var11, double var12);

   @Shadow
   public abstract void renderTileEntityAt$v1_8(TileEntity var1, double var2, double var4, double var6, float var8, int var9);

   public void bridge$renderBeacon(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      Color var12,
      double var13
   ) {
      ArrayList var15 = new ArrayList();

      for (int var16 = (int)var4 + 1; var16 < 256; var16++) {
         var15.add(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
               new BeamSegment(OCOHORHCROHICRRIHCIHHRRCIHICRI.CCHHIOROOICROROOCOHHCRRICCOCRO(var12.getRGB()))
            )
         );
      }

      this.bridge$renderBeacon(var1, var2, var4, var6, var8, var10, var15, var13);
   }

   public void bridge$renderBeacon(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var12,
      double var13
   ) {
      this.bridge$world = (World)var1;
      this.bridge$beamSegments = var12;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.renderBeacon$v1_12(var2, var4, var6, var8, var10, var12, var13);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         this.renderTileEntityAt$v1_8(null, var2, var4, var6, (float)var8, 0);
      }

      this.bridge$world = null;
      this.bridge$beamSegments = null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Redirect(
      method = "renderTileEntityAt$v1_8(Lnet/minecraft/tileentity/TileEntityBeacon;DDDFI)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/tileentity/TileEntityBeacon;shouldBeamRender()F")
   )
   public float bridge$shouldBeamRender(TileEntityBeacon var1) {
      return var1 == null ? 1.0F : var1.shouldBeamRender();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Redirect(
      method = "renderTileEntityAt$v1_8(Lnet/minecraft/tileentity/TileEntityBeacon;DDDFI)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/tileentity/TileEntityBeacon;getBeamSegments$v1_8()Ljava/util/List;")
   )
   public List<BeamSegment> bridge$getBeamSegments(TileEntityBeacon var1) {
      return var1 == null ? this.bridge$beamSegments : var1.getBeamSegments$v1_8();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Redirect(
      method = "renderTileEntityAt$v1_8(Lnet/minecraft/tileentity/TileEntityBeacon;DDDFI)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/tileentity/TileEntityBeacon;getWorld()Lnet/minecraft/world/World;")
   )
   public World bridge$getWorld(TileEntityBeacon var1) {
      return var1 == null ? this.bridge$world : var1.getWorld();
   }
}
