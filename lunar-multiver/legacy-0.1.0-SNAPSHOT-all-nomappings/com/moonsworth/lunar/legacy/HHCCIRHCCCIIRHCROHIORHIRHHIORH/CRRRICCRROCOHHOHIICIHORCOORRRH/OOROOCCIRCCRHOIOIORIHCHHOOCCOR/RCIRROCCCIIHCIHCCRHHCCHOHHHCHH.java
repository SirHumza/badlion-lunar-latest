package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleCrit;
import net.minecraft.client.particle.ParticleDigging;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleManager.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public World world;
   @Final
   @Shadow
   public ArrayDeque<Particle>[][] fxLayers$v1_12;
   @Shadow
   public List[] fxLayers$v1_7;
   @Shadow
   public List<Particle>[][] fxLayers$v1_8;

   @Shadow
   public abstract void addEffect(Particle var1);

   @Shadow
   public abstract void emitParticleAtEntity$v1_12(Entity var1, EnumParticleTypes var2, int var3);

   @Shadow
   public abstract void emitParticleAtEntity$v1_8(Entity var1, EnumParticleTypes var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/client/renderer/texture/TextureManager;)V", at = @At("TAIL"))
   private void bridge$init(CallbackInfo var1) {
      String[] var2 = new String[]{
         "hugeexplosion",
         "largeexplode",
         "fireworksSpark",
         "bubble",
         "suspended",
         "depthsuspend",
         "townaura",
         "crit",
         "magicCrit",
         "smoke",
         "mobSpell",
         "mobSpellAmbient",
         "spell",
         "instantSpell",
         "witchMagic",
         "note",
         "portal",
         "enchantmenttable",
         "explode",
         "flame",
         "lava",
         "footstep",
         "splash",
         "wake",
         "largesmoke",
         "cloud",
         "reddust",
         "snowballpoof",
         "dripWater",
         "dripLava",
         "snowshovel",
         "slime",
         "heart",
         "angryVillager",
         "happyVillager",
         "iconcrack_",
         "blockcrack_",
         "blockdust_"
      };

      for (String var6 : var2) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getParticleFromName(
            var6
         );
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = var7.asModernParticle();
         var8.setDataProvider(
            new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var7.getParticleName(), var7.getParticleID()
            )
         );
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH.populateRegistry();
   }

   public void bridge$addEffect(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (var1 instanceof ParticleDigging) {
            ((CRRRICCRROCOHHOHIICIHORCOORRRH)var1)
               .bridge$setParticleType(HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(EnumParticleTypes.BLOCK_CRACK.getParticleID()));
         }

         this.addEffect((Particle)var1);
      } else {
         if (var1 instanceof ParticleDigging) {
            ((CRRRICCRROCOHHOHIICIHORCOORRRH)var1)
               .bridge$setParticleType(
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BLOCK_CRACK
                        .getParticleID()
                  )
               );
         }

         this.addEffect((Particle)var1);
      }
   }

   public void bridge$emitParticleAtEntity(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.emitParticleAtEntity$v1_12((Entity)var1, EnumParticleTypes.getParticleFromId(var2.getDataProvider().getId()), 3);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.emitParticleAtEntity$v1_8((Entity)var1, EnumParticleTypes.getParticleFromId(var2.getDataProvider().getId()));
      } else if (var2 == HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRIT) {
         Minecraft.getMinecraft().effectRenderer.addEffect(new ParticleCrit(Minecraft.getMinecraft().world, (Entity)var1));
      } else if (var2 == HHCCIRHCCCIIRHCROHIORHIRHHIORH.ENCHANTED_HIT) {
         Minecraft.getMinecraft().effectRenderer.addEffect(new ParticleCrit(Minecraft.getMinecraft().world, (Entity)var1, "magicCrit"));
      } else {
         this.world.spawnParticle$v1_7(var2.getDataProvider().getName(), var1.bridge$getPosX(), var1.bridge$getPosY(), var1.bridge$getPosZ(), 0.0, 0.0, 0.0);
      }
   }

   public int bridge$countParticles() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1) {
         return this.fxLayers$v1_7[0].size() + this.fxLayers$v1_7[1].size() + this.fxLayers$v1_7[2].size();
      }

      int var1 = 0;

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 2; var3++) {
            var1 += ((Object[])((Object[])(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.fxLayers$v1_12 : this.fxLayers$v1_8))[var2])[var3].size();
         }
      }

      return var1;
   }

   public void bridge$spawnBloodParticles(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, double var2, double var4, double var6) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .HCHORIRRHRIIOHORRCOIIIHRCIHICO();
      if (!var8.COOOIHCOIIOIOIIOHHCIORROIICHII()) {
         Block var9 = Blocks.REDSTONE_BLOCK;
         World var10 = (World)var1;
         if (var8.RRIHCIIOCOHOICHOOHCIIHOIOCOHCH()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
               SoundType var11 = var9.getSoundType$v1_12();
               var10.playSound$v1_12(
                  var2, var4, var6, var11.breakSound, SoundCategory.BLOCKS, (var11.getVolume() + 1.0F) / 2.0F, var11.getPitch() * 0.8F, false
               );
            } else {
               net.minecraft.block.Block.SoundType var22 = var9.stepSound$v1_7;
               ResourceLocation var12 = new ResourceLocation(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 ? var22.getDigResourcePath$v1_7() : var22.getBreakSound$v1_8()
               );
               Minecraft.getMinecraft()
                  .getSoundHandler()
                  .playSound(
                     new PositionedSoundRecord(var12, (var22.getVolume() + 1.0F) / 2.0F, var22.getFrequency() * 0.8F, (float)var2, (float)var4, (float)var6)
                  );
            }
         }

         ThreadLocalRandom var23 = ThreadLocalRandom.current();

         for (int var24 = 0; var24 < 27; var24++) {
            int var13 = var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23);

            for (int var14 = 0; var14 < var13; var14++) {
               double var15 = var23.nextFloat() * 2.0F - 1.0F;
               double var17 = var23.nextFloat() * 2.0F - 1.0F;
               double var19 = var23.nextFloat() * 2.0F - 1.0F;
               com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var21;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 0) {
                  var21 = new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var10, var2, var4, var6, var15, var17, var19, var9.defaultBlockState$v1_8
                  );
                  var21.setBlockPos$v1_8(new BlockPos(var2, var4, var6));
               } else {
                  var21 = new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var10, var2, var4, var6, var15, var17, var19, var9, 0
                  );
               }

               Minecraft.getMinecraft().effectRenderer.addEffect(var21);
            }
         }
      }
   }

   @Inject(
      method = {"addBlockHitEffects$v1_7", "addBlockHitEffects$v1_8", "addBlockDestroyEffects$v1_7", "addBlockDestroyEffects$v1_8"},
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$cancelDigParticles(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .IIRHHCORRCIIOIOCICRRIORCCIOHCR()) {
         var1.cancel();
      }
   }
}
