package com.moonsworth.lunar.legacy.wrapper.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.common.collect.ImmutableList;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.Render_v1_8;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBed;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFireworkCharge;
import net.minecraft.item.ItemLingeringPotion;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTippedArrow;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Random RCOCHHRIORORRCIOOHHICHOHCHIRCH = new Random();
   private static final ResourceLocation HORHHOORHCRIHOHIHROCIIRCCOIRHO = new ResourceLocation("minecraft", "items/potion_bottle_splash");
   private static final ResourceLocation CCICIRRCICHOOIOIRHHOCRRRCRIHCO = new ResourceLocation("minecraft", "items/potion_bottle_drinkable");
   private static final ResourceLocation ROHHOCCHHICCHROHCOCOCICIIIHOIC = new ResourceLocation("minecraft", "items/potion_bottle_lingering");
   private static final ResourceLocation IHOORORRROOIOHOHHROOHROHRHRHCH = new ResourceLocation("minecraft", "items/spawn_egg_overlay");
   private static final ResourceLocation OIOOHHCIHHIRRHCRICHHIRRROHCRRO = new ResourceLocation("minecraft", "items/fireworks_charge_overlay");
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private static ResourceLocation OOOROICOOIROHRIRROICHIHRRROHCI;
   private static final List<ResourceLocation> CRHOIICCOIHOICIRCROHRHHICCHCHO;

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EntityItem var1, double var2, double var4, double var6, float var8) {
      RCOCHHRIORORRCIOOHHICHOHCHIRCH.setSeed(187L);
      ItemStack var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var1.getItem$v1_12() : var1.getEntityItem$v1_7();
      IBakedModel var10 = Minecraft.getMinecraft().renderItem$v1_8.itemModelMesher$v1_8.getItemModel(var9);
      int var11 = this.RCCHOORHRCORICCCHRCOCIHOICRRIO(var9.stackSize);
      GlStateManager.enableRescaleNormal();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         GlStateManager.enableColorMaterial();
      }

      GlStateManager.enableBlend();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      RenderHelper.enableStandardItemLighting();
      GlStateManager.pushMatrix();
      Render_v1_8 var12 = Minecraft.getMinecraft().renderManager$v1_8.getEntityRenderObject$v1_8(var1);
      var12.bindEntityTexture(var1);
      float var13 = var10.getItemCameraTransforms().ground.scale.y;
      float var14 = MathHelper.sin((var1.age + var8) / 10.0F + var1.hoverStart) * 0.1F + 0.1F;
      GL11.glTranslated(var2, var4 + var14 + 0.25 * var13, var6);

      for (int var15 = 0; var15 < var11; var15++) {
         GlStateManager.pushMatrix();
         this.CHHOCRCRHHCCHCCHROROIOIRHHOHHO(var15);
         float var16 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((CRRRICCRROCOHHOHIICIHORCOORRRH)var1);
         if (var16 > 1.0F) {
            GL11.glScalef(var16, var16, var16);
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            if (var9.getItem().getTranslationKey$v1_12().contains("Fence")) {
               GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
            } else if (var9.getItem() == Items.SHIELD$v1_12) {
               GlStateManager.translate(-0.115F, 0.0F, 0.0F);
            }
         } else {
            if (var10.isBuiltInRenderer() && !(var9.getItem() instanceof ItemSkull)) {
               GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
            } else if (var9.getItem().getUnlocalizedName$v1_7().contains("Fence")) {
               GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
            }

            if (var10.isGui3d()) {
               GlStateManager.scale(0.5, 0.5, 0.5);
            }
         }

         var10.getItemCameraTransforms().applyTransform(TransformType.GROUND);
         Minecraft.getMinecraft().renderItem$v1_8.renderItem$v1_8(var9, var10);
         GlStateManager.popMatrix();
      }

      GlStateManager.popMatrix();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         GlStateManager.disableRescaleNormal();
         GlStateManager.disableBlend();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, double var2, double var4, double var6, float var8) {
      RCOCHHRIORORRCIOOHHICHOHCHIRCH.setSeed(187L);
      ItemStack var9 = (ItemStack)var1.bridge$getItemState();
      Item var10 = var9.getItem();
      EntityItem var11 = (EntityItem)var1;
      if (!(var10 instanceof ItemBlock)
         && !(var10 instanceof ItemSkull)
         && !(var10 instanceof ItemBed)
         && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 || !(var10 instanceof ItemShield))
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .RCHCHRIRHCRCHHCOOIHCHRICIIOIII()
               .HIOHOHOCRIHHICRRCOIOORRCIHHHHI()
               .get()
            != com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MODEL
         )
       {
         TextureAtlasSprite var12 = Minecraft.getMinecraft().renderItem$v1_8.itemModelMesher$v1_8.getParticleIcon(var10, var9.getItemDamage$v1_8());
         boolean var13 = false;
         int var14 = -16777216;
         if (var10 instanceof ItemArmor
            || var10 instanceof ItemPotion
            || var10 instanceof ItemMonsterPlacer
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var10 instanceof ItemTippedArrow) {
            var13 = true;
            var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
               ? Minecraft.getMinecraft().itemColors$v1_12.colorMultiplier(var9, 0)
               : var10.getColorFromItemStack$v1_7(var9, 0);
         }

         int var15 = this.RCCHOORHRCORICCCHRCOCIHOICRRIO(var9.stackSize);
         Tessellator var16 = Tessellator.getInstance$v1_8();
         BufferBuilder var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? var16.getBuffer$v1_12() : var16.getWorldRenderer$v1_8();
         Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
         GlStateManager.enableRescaleNormal();
         GlStateManager.enableColorMaterial();
         GlStateManager.enableDepth();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
         }

         RenderHelper.enableStandardItemLighting();
         float var18 = MathHelper.sin((var11.age + var8) / 10.0F + var11.hoverStart) * 0.1F + 0.1F;
         GL11.glTranslated(var2, var4 + var18 + 0.1, var6);
         int var19 = var14 >> 16 & 0xFF;
         int var20 = var14 >> 8 & 0xFF;
         int var21 = var14 & 0xFF;

         for (int var22 = 0; var22 < var15; var22++) {
            GlStateManager.pushMatrix();
            this.CHHOCRCRHHCCHCCHROROIOIRHHOHHO(var22);
            float var23 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
            GL11.glScalef(var23, var23, var23);
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9)) {
               TextureAtlasSprite var24 = Minecraft.getMinecraft()
                  .textureMapBlocks
                  .getAtlasSprite(Objects.requireNonNull(this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9)).toString());
               int var25 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
                  ? Minecraft.getMinecraft().itemColors$v1_12.colorMultiplier(var9, 1)
                  : var10.getColorFromItemStack$v1_7(var9, 1);
               int var26 = var25 >> 16 & 0xFF;
               int var27 = var25 >> 8 & 0xFF;
               int var28 = var25 & 0xFF;
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var24, var26, var27, var28, true);
            }

            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var12, var19, var20, var21, var13);
            GlStateManager.popMatrix();
         }

         GlStateManager.disableRescaleNormal();
         GlStateManager.disableBlend();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            GlStateManager.disableColorMaterial();
         }
      } else {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var2, var4, var6, var8);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferBuilder var1, TextureAtlasSprite var2, int var3, int var4, int var5, boolean var6) {
      var1.begin$v1_8(7, var6 ? DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL : DefaultVertexFormats.POSITION_TEX_NORMAL);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.pos$v1_8(-0.5, -0.25, 0.0).tex$v1_8(var2.getMinU(), var2.getMaxV()), var3, var4, var5, var6)
         .normal$v1_8(0.0F, 1.0F, 0.0F)
         .endVertex$v1_8();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.pos$v1_8(0.5, -0.25, 0.0).tex$v1_8(var2.getMaxU(), var2.getMaxV()), var3, var4, var5, var6)
         .normal$v1_8(0.0F, 1.0F, 0.0F)
         .endVertex$v1_8();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.pos$v1_8(0.5, 0.75, 0.0).tex$v1_8(var2.getMaxU(), var2.getMinV()), var3, var4, var5, var6)
         .normal$v1_8(0.0F, 1.0F, 0.0F)
         .endVertex$v1_8();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.pos$v1_8(-0.5, 0.75, 0.0).tex$v1_8(var2.getMinU(), var2.getMinV()), var3, var4, var5, var6)
         .normal$v1_8(0.0F, 1.0F, 0.0F)
         .endVertex$v1_8();
      Tessellator.getInstance$v1_8().draw$v1_8();
   }

   private int RCCHOORHRCORICCCHRCOCIHOICRRIO(int var1) {
      byte var2 = 1;
      if (var1 > 1) {
         var2 = 2;
      }

      if (var1 > 5) {
         var2 = 3;
      }

      if (var1 > 20) {
         var2 = 4;
      }

      if (var1 > 40) {
         var2 = 5;
      }

      return var2;
   }

   private void CHHOCRCRHHCCHCCHROROIOIRHHOHHO(int var1) {
      if (var1 > 0) {
         float var2 = (RCOCHHRIORORRCIOOHHICHOHCHIRCH.nextFloat() * 2.0F - 1.0F) * 0.3F;
         float var3 = (RCOCHHRIORORRCIOOHHICHOHCHIRCH.nextFloat() * 2.0F - 1.0F) * 0.3F;
         float var4 = (RCOCHHRIORORRCIOOHHICHOHCHIRCH.nextFloat() * 2.0F - 1.0F) * 0.3F;
         GL11.glTranslatef(var2, var3, var4);
      }

      float var5 = -Minecraft.getMinecraft().renderManager$v1_8.playerViewX;
      float var6 = 180.0F - Minecraft.getMinecraft().renderManager$v1_8.playerViewY;
      GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ItemStack var1) {
      Item var2 = var1.getItem();
      return var2 instanceof ItemPotion
         || var2 instanceof ItemArmor && ((ItemArmor)var1.getItem()).material == ArmorMaterial.LEATHER$v1_8
         || var2 instanceof ItemMonsterPlacer
         || var2 instanceof ItemFireworkCharge
         || IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var2 instanceof ItemTippedArrow;
   }

   private ResourceLocation IRCIIHHICIHRCOCRROCOICRIHHCCHH(ItemStack var1) {
      if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1)) {
         Item var2 = var1.getItem();
         if (var2 instanceof ItemPotion) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               if (var2 instanceof ItemSplashPotion) {
                  return HORHHOORHCRIHOHIHROCIIRCCOIRHO;
               }

               if (var2 instanceof ItemLingeringPotion) {
                  return ROHHOCCHHICCHROHCOCOCICIIIHOIC;
               }
            }

            return CCICIRRCICHOOIOIRHHOCRRRCRIHCO;
         } else if (var2 instanceof ItemMonsterPlacer) {
            return IHOORORRROOIOHOHHROOHROHRHRHCH;
         } else if (var2 instanceof ItemFireworkCharge) {
            return OIOOHHCIHHIRRHCRICHHIRRROHCRRO;
         } else {
            return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var2 instanceof ItemTippedArrow
               ? OOOROICOOIROHRIRROICHIHRRROHCI
               : CRHOIICCOIHOICIRCROHRHHICCHCHO.get(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? ((ItemArmor)var2).armorType$v1_12.index : ((ItemArmor)var2).armorType$v1_7
               );
         }
      } else {
         return null;
      }
   }

   private BufferBuilder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferBuilder var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         var1.color$v1_8(var2, var3, var4, 255);
      }

      return var1;
   }

   private float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      IIHRRHORCRCROCHHOHORCHCROCIHRO var2 = (IIHRRHORCRCROCHHOHORCHCROCIHRO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IIHRRHORCRCROCHHOHORCHCROCIHRO.class,
            () -> new IIHRRHORCRCROCHHOHORCHCROCIHRO(OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(), var1.bridge$getItemState(), true, false)
         );
      return var2 == null ? 1.0F : var2.getScale();
   }

   static {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         OOOROICOOIROHRIRROICHIHRRROHCI = new ResourceLocation("minecraft", "items/tipped_arrow_base");
      }

      CRHOIICCOIHOICIRCROHRHHICCHCHO = ImmutableList.of(
            new ResourceLocation("minecraft", "items/leather_helmet_overlay"),
            new ResourceLocation("minecraft", "items/leather_chestplate_overlay"),
            new ResourceLocation("minecraft", "items/leather_leggings_overlay"),
            new ResourceLocation("minecraft", "items/leather_boots_overlay")
         )
         .reverse();
   }
}
