package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.lunarclient.apollo.module.glow.GlowModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityTrackerEntry;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.item.EntityMinecart.Type;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3d;
import org.joml.Vector3i;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Entity.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Unique
   public boolean lunar$isGlowing;
   @Unique
   private int lunar$glowingColor = -1;
   @Shadow
   public World world;
   @Shadow
   public double posX;
   @Shadow
   public double posY;
   @Shadow
   public double posZ;
   @Shadow
   public double prevPosX;
   @Shadow
   public double prevPosY;
   @Shadow
   public double motionX;
   @Shadow
   public double motionY;
   @Shadow
   public double motionZ;
   @Shadow
   public float rotationYaw;
   @Shadow
   public float rotationPitch;
   @Shadow
   public float prevRotationYaw;
   @Shadow
   public float prevRotationPitch;
   @Shadow
   public UUID entityUniqueID;
   @Shadow
   public AxisAlignedBB boundingBox;
   @Shadow
   public boolean onGround;
   @Shadow
   public int dimension;
   @Shadow
   public double lastTickPosX;
   @Shadow
   public double lastTickPosY;
   @Shadow
   public double lastTickPosZ;
   @Shadow
   public Entity ridingEntity;
   @Shadow
   public float fallDistance;
   @Shadow
   public double prevPosZ;
   @Shadow
   public float width;
   @Shadow
   public float height;
   @Shadow
   public boolean collidedHorizontally;
   @Shadow
   public boolean isDead;
   @Shadow
   public int entityId;
   @Shadow
   public boolean ignoreFrustumCheck;
   @Shadow
   public int chunkCoordX;
   @Shadow
   public int chunkCoordZ;
   @Shadow
   public int chunkCoordY;
   @Shadow
   public float stepHeight;
   @Shadow
   public Entity riddenByEntity$v1_7;

   @Shadow
   public abstract boolean isInvisibleToPlayer(EntityPlayer var1);

   @Shadow
   public abstract int getEntityId();

   @Shadow
   public abstract Vec3d getLookVec();

   @Shadow
   public abstract float getEyeHeight();

   @Shadow
   public abstract boolean hitByEntity(Entity var1);

   @Shadow
   public abstract boolean isInvisible();

   @Shadow
   public abstract boolean isInWater();

   @Shadow
   public abstract boolean isBurning();

   @Shadow
   public abstract EntityDataManager getDataWatcher$v1_7();

   @Shadow
   public abstract EntityDataManager getDataManager$v1_12();

   @Shadow
   public abstract String getEntityString();

   @Shadow
   public abstract boolean hasCustomName$v1_8();

   @Shadow
   public abstract String getCustomNameTag$v1_8();

   @Shadow
   public abstract void setAlwaysRenderNameTag$v1_8(boolean var1);

   @Shadow
   public abstract void setCustomNameTag$v1_8(String var1);

   @Shadow
   public abstract boolean isGlowing$v1_12();

   @Shadow
   public abstract void setGlowing$v1_12(boolean var1);

   @Shadow
   public abstract Vec3d getPositionEyes$v1_8(float var1);

   @Shadow
   public abstract void setPosition(double var1, double var3, double var5);

   @Shadow
   public abstract void setRotation(float var1, float var2);

   @Shadow
   public abstract void setAngles$v1_7(float var1, float var2);

   @Shadow
   public abstract void turn$v1_12(float var1, float var2);

   @Shadow
   public abstract Vec3d getLook$v1_8(float var1);

   @Shadow
   public abstract AxisAlignedBB getBoundingBox$v1_7();

   @Shadow
   public abstract AxisAlignedBB getEntityBoundingBox$v1_8();

   @Shadow
   public abstract AxisAlignedBB getRenderBoundingBox$v1_12();

   @Shadow
   public abstract boolean isInRangeToRender3d(double var1, double var3, double var5);

   @Shadow
   public abstract boolean isEntityAlive();

   @Shadow
   public abstract boolean getAlwaysRenderNameTag$v1_8();

   @Shadow
   public abstract double getMountedYOffset();

   @Shadow
   public abstract int getMaxFallHeight();

   @Shadow
   public abstract boolean canBeCollidedWith();

   @Shadow
   public abstract Team getTeam$v1_12();

   @Shadow
   public abstract UUID getUniqueID();

   @Shadow
   public abstract List<Entity> getPassengers$v1_12();

   @Overwrite
   public boolean isWet() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.isInWater()
            || this.world.isRaining()
               && (
                  this.world.isRainingAt$v1_8(new BlockPos(this.posX, this.posY, this.posZ))
                     || this.world.isRainingAt$v1_8(new BlockPos(this.posX, this.posY + this.height, this.posZ))
               )
         : this.isInWater()
            || this.world.isRaining()
               && (
                  this.world
                        .isRainingAt$v1_7(
                           MathHelper.floor_double$v1_7(this.posX), MathHelper.floor_double$v1_7(this.posY), MathHelper.floor_double$v1_7(this.posZ)
                        )
                     || this.world
                        .isRainingAt$v1_7(
                           MathHelper.floor_double$v1_7(this.posX),
                           MathHelper.floor_double$v1_7(this.posY + this.height),
                           MathHelper.floor_double$v1_7(this.posZ)
                        )
               );
   }

   public void bridge$lerpTo(double var1, double var3, double var5, float var7, float var8) {
      this.setPosition(var1, var3, var5);
      this.setRotation(var7, var8);
      this.motionX = 0.0;
      this.motionY = 0.0;
      this.motionZ = 0.0;
   }

   public void bridge$setOnGround(boolean var1) {
      this.onGround = var1;
   }

   public void bridge$setPosX(double var1) {
      this.posX = var1;
   }

   public void bridge$setPosY(double var1) {
      this.posY = var1;
   }

   public void bridge$setPosZ(double var1) {
      this.posZ = var1;
   }

   public void bridge$setPreviousPosX(double var1) {
      this.prevPosX = var1;
   }

   public void bridge$setPreviousPosY(double var1) {
      this.prevPosY = var1;
   }

   public void bridge$setPreviousPosZ(double var1) {
      this.prevPosZ = var1;
   }

   public void bridge$setChunkX(int var1) {
      this.chunkCoordX = var1;
   }

   public void bridge$setChunkY(int var1) {
      this.chunkCoordY = var1;
   }

   public void bridge$setChunkZ(int var1) {
      this.chunkCoordZ = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getBlockPos() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
            new Vector3i((int)Math.floor(this.posX), (int)Math.floor(this.posY), (int)Math.floor(this.posZ))
         )
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
            new BlockPos(this.posX, this.posY, this.posZ)
         );
   }

   public double bridge$getMotionX() {
      return this.motionX;
   }

   public double bridge$getMotionY() {
      return this.motionY;
   }

   public void bridge$setMotionY(double var1) {
      this.motionY = var1;
   }

   public double bridge$getMotionZ() {
      return this.motionZ;
   }

   public double bridge$getRotationYaw() {
      return this.rotationYaw;
   }

   public double bridge$getRotationPitch() {
      return this.rotationPitch;
   }

   public void bridge$setRotationPitch(double var1) {
      this.rotationPitch = (float)var1;
   }

   public void bridge$setRotationYaw(double var1) {
      this.rotationYaw = (float)var1;
   }

   public double bridge$getPreviousRotationYaw() {
      return this.prevRotationYaw;
   }

   public double bridge$getPreviousRotationPitch() {
      return this.prevRotationPitch;
   }

   public UUID bridge$getUniqueID() {
      return this.entityUniqueID;
   }

   public void bridge$setUniqueID(UUID var1) {
      this.entityUniqueID = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBox() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.boundingBox;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBox(float var1) {
      double var2 = this.prevPosX + (this.posX - this.prevPosX) * var1;
      double var4 = this.prevPosY + (this.posY - this.prevPosY) * var1;
      double var6 = this.prevPosZ + (this.posZ - this.prevPosZ) * var1;
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)(
         new AxisAlignedBB(
            this.boundingBox.minX - this.posX + var2,
            this.boundingBox.minY - this.posY + var4,
            this.boundingBox.minZ - this.posZ + var6,
            this.boundingBox.maxX - this.posX + var2,
            this.boundingBox.maxY - this.posY + var4,
            this.boundingBox.maxZ - this.posZ + var6
         )
      );
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBoxForCulling() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getRenderBoundingBox$v1_12()
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.boundingBox;
   }

   public boolean bridge$isOnGround() {
      return this.onGround;
   }

   public boolean bridge$isInvisibleTo(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      return this.isInvisibleToPlayer((EntityPlayer)var1);
   }

   public int bridge$getEntityId() {
      return this.getEntityId();
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getViewVector(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (CRHROHHHCIHHCOHCOORCRIHHIICROR)this.getLook$v1_8(var1);
      }

      if (var1 == 1.0F) {
         return (CRHROHHHCIHHCOHCOORCRIHHIICROR)this.getLookVec();
      }

      float var2 = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * var1;
      float var3 = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * var1;
      float var4 = (float)Math.toRadians(-var3) - (float) Math.PI;
      float var5 = (float)Math.toRadians(-var2);
      float var6 = MathHelper.cos(var4);
      float var7 = MathHelper.sin(var4);
      float var8 = -MathHelper.cos(var5);
      float var9 = MathHelper.sin(var5);
      return (CRHROHHHCIHHCOHCOORCRIHHIICROR)Vec3d.createVectorHelper$v1_7(var7 * var8, var9, var6 * var8);
   }

   public int bridge$getDimension() {
      return this.dimension;
   }

   public void bridge$setDimension(int var1) {
      this.dimension = var1;
   }

   public String bridge$getDimensionName() {
      return this.world.worldInfo.levelName;
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getEyePosition() {
      return this.bridge$getEyePosition(0.0F);
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getEyePosition(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (CRHROHHHCIHHCOHCOORCRIHHIICROR)this.getPositionEyes$v1_8(var1);
      }

      if (var1 == 1.0F) {
         return (CRHROHHHCIHHCOHCOORCRIHHIICROR)(new Vec3d(this.posX, this.posY + this.getEyeHeight(), this.posZ));
      }

      double var2 = this.prevPosX + (this.posX - this.prevPosX) * var1;
      double var4 = this.prevPosY + (this.posY - this.prevPosY) * var1 + this.getEyeHeight();
      double var6 = this.prevPosZ + (this.posZ - this.prevPosZ) * var1;
      return (CRHROHHHCIHHCOHCOORCRIHHIICROR)(new Vec3d(var2, var4, var6));
   }

   public float bridge$getEyeHeight() {
      return this.getEyeHeight();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getRidingEntity() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this.ridingEntity;
   }

   public double bridge$getFallDistance() {
      return this.fallDistance;
   }

   public void bridge$resetFallDistance() {
      this.fallDistance = 0.0F;
   }

   public boolean bridge$hitByEntity(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return this.hitByEntity((Entity)var1);
   }

   public double bridge$lastTickX() {
      return this.lastTickPosX;
   }

   public void bridge$setLastTickX(double var1) {
      this.lastTickPosX = var1;
   }

   public double bridge$lastTickY() {
      return this.lastTickPosY;
   }

   public void bridge$setLastTickY(double var1) {
      this.lastTickPosY = var1;
   }

   public double bridge$lastTickZ() {
      return this.lastTickPosZ;
   }

   public void bridge$setLastTickZ(double var1) {
      this.lastTickPosZ = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getDataWatcher() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getDataManager$v1_12() : this.getDataWatcher$v1_7()
      );
   }

   public boolean bridge$isOnFire() {
      return this.isBurning();
   }

   public void bridge$setPreviousRotationPitch(double var1) {
      this.prevRotationPitch = (float)var1;
   }

   public void bridge$setPreviousRotationYaw(double var1) {
      this.prevRotationYaw = (float)var1;
   }

   public boolean bridge$isInvisible() {
      return this.isInvisible();
   }

   public float bridge$getWidth() {
      return this.width;
   }

   public float bridge$getHeight() {
      return this.height;
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getPassengerOffset(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(0.0, this.getMountedYOffset(), 0.0);
   }

   public boolean bridge$isCollidedHorizontally() {
      return this.collidedHorizontally;
   }

   public boolean bridge$isRemoved() {
      return this.isDead;
   }

   public boolean bridge$isVisiblyCrouching() {
      return this.bridge$isSneaking();
   }

   public boolean bridge$isDiscrete() {
      return this.bridge$isSneaking();
   }

   public Component bridge$getTypeName() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
         this.getEntityString()
      );
   }

   public String bridge$getEntityString() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         Optional var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHIIHOOHRROCRRRHHHCOOHCOORC();
         if (var1.isPresent()) {
            return ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get())
               .bridge$getEntityString(this);
         }

         int var2 = EntityList.REGISTRY$v1_12.getIDForObject(((Entity)this).getClass());
         return var2 != -1 ? Objects.requireNonNullElse((String)EntityList.OLD_NAMES$v1_12.get(var2), "") : "";
      } else {
         return Objects.requireNonNullElse(this.getEntityString(), "");
      }
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$getPickResult() {
      Entity var1 = (Entity)this;
      ItemStack var2;
      if (var1 instanceof EntityPainting) {
         var2 = new ItemStack(Items.PAINTING);
      } else if (var1 instanceof EntityLeashKnot) {
         var2 = new ItemStack(Items.LEAD);
      } else if (var1 instanceof EntityItemFrame) {
         var2 = new ItemStack(Items.ITEM_FRAME);
      } else if (var1 instanceof EntityMinecart var3) {
         var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? bridge$correspondingItem$v1_8(var3) : bridge$correspondingItem$v1_7(var3);
      } else if (var1 instanceof EntityBoat var4) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var2 = new ItemStack(var4.getItemBoat$v1_12());
         } else {
            var2 = new ItemStack(Items.BOAT);
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && var1 instanceof EntityArmorStand) {
         var2 = new ItemStack(Items.ARMOR_STAND$v1_8);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var1 instanceof EntityEnderCrystal) {
         var2 = new ItemStack(Items.END_CRYSTAL$v1_12);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         ResourceLocation var5 = EntityList.getKey$v1_12(var1);
         if (var5 == null || !EntityList.ENTITY_EGGS$v1_12.containsKey(var5)) {
            return null;
         }

         var2 = new ItemStack(Items.SPAWN_EGG);
         ItemMonsterPlacer.applyEntityIdToItemStack$v1_12(var2, var5);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         int var6 = EntityList.getEntityID$v1_7(var1);
         if (!EntityList.entityEggs$v1_8.containsKey(var6)) {
            return null;
         }

         var2 = new ItemStack(Items.SPAWN_EGG);
      } else {
         int var7 = EntityList.getEntityID$v1_7(var1);
         if (!EntityList.entityEggs$v1_7.containsKey(var7)) {
            return null;
         }

         var2 = new ItemStack(Items.SPAWN_EGG);
      }

      return (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var2;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @NotNull
   private static ItemStack bridge$correspondingItem$v1_8(EntityMinecart var0) {
      Type var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1 = var0.getType$v1_12();
      } else {
         var1 = var0.getMinecartType$v1_8();
      }
      return new ItemStack(switch (var1) {
         case FURNACE -> Items.FURNACE_MINECART;
         case CHEST -> Items.CHEST_MINECART;
         case TNT -> Items.TNT_MINECART;
         case HOPPER -> Items.HOPPER_MINECART;
         case COMMAND_BLOCK -> Items.COMMAND_BLOCK_MINECART;
         default -> Items.MINECART;
      });
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private static ItemStack bridge$correspondingItem$v1_7(EntityMinecart var0) {
      return new ItemStack(switch (var0.getMinecartType$v1_7()) {
         case 1 -> Items.CHEST_MINECART;
         case 2 -> Items.FURNACE_MINECART;
         case 3 -> Items.TNT_MINECART;
         default -> Items.MINECART;
         case 5 -> Items.HOPPER_MINECART;
         case 6 -> Items.COMMAND_BLOCK_MINECART;
      });
   }

   public int bridge$getSpawnEggColor(int var1) {
      EntityEggInfo var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var2 = (EntityEggInfo)EntityList.ENTITY_EGGS$v1_12.get(EntityList.getKey$v1_12((Entity)this));
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         var2 = (EntityEggInfo)EntityList.entityEggs$v1_8.get(EntityList.getEntityID$v1_7((Entity)this));
      } else {
         var2 = (EntityEggInfo)EntityList.entityEggs$v1_7.get(EntityList.getEntityID$v1_7((Entity)this));
      }

      if (var2 == null) {
         return -1;
      } else {
         return var1 == 0 ? var2.primaryColor : var2.secondaryColor;
      }
   }

   public String bridge$getType() {
      String var1 = EntityList.getEntityString((Entity)this);
      return var1 == null ? null : var1.toLowerCase();
   }

   public boolean bridge$isRidingBoat() {
      return this.ridingEntity instanceof EntityBoat;
   }

   public boolean bridge$isGlowing() {
      Optional var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(GlowModule.class);
      if (var1.isPresent()
         && ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1.get())
            .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this)) {
         return true;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         return this.isGlowing$v1_12();
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1x -> var1x.RCHHHIICCRCOROCHCCOICIOIIRIHHO().IROCHOOOIORRICOOORROOHOIORIHIH() == this)
            ? true
            : this.lunar$isGlowing;
      }
   }

   public void bridge$setGlowing(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.setGlowing$v1_12(var1);
      } else {
         this.lunar$isGlowing = var1;
      }
   }

   public void bridge$setGlowingColor(int var1) {
      this.lunar$glowingColor = var1;
   }

   public int bridge$getGlowingColor() {
      return this.lunar$glowingColor;
   }

   public Component bridge$getCustomName() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.hasCustomName$v1_8()
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
               this.getCustomNameTag$v1_8()
            )
            : null;
      } else {
         return null;
      }
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getNameTagAttachment() {
      return CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(0.0, this.height + 0.5F, 0.0);
   }

   public void bridge$setCustomNameVisible(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.setAlwaysRenderNameTag$v1_8(var1);
      }
   }

   public boolean bridge$shouldShowName() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.getAlwaysRenderNameTag$v1_8();
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }

   public void bridge$setCustomName(Component var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.setCustomNameTag$v1_8(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var1)
         );
      }
   }

   public void bridge$turn(float var1, float var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         this.setAngles$v1_7(var1, var2);
      } else {
         this.turn$v1_12(var1, var2);
      }
   }

   public void bridge$setId(int var1) {
      this.entityId = var1;
   }

   public boolean bridge$shouldRenderAtSqrDistance(double var1) {
      double var3;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         AxisAlignedBB var5 = this.getBoundingBox$v1_7();
         if (var5 == null) {
            var3 = 1.0;
         } else {
            var3 = var5.getAverageEdgeLength();
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         var3 = this.getEntityBoundingBox$v1_8().getAverageEdgeLength();
      } else {
         var3 = this.getRenderBoundingBox$v1_12().getAverageEdgeLength();
      }

      if (Double.isNaN(var3)) {
         var3 = 1.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   public void bridge$sendPairingData(
      Consumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> var1
   ) {
      EntityTrackerEntry var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         var2 = new EntityTrackerEntry((Entity)this, Integer.MAX_VALUE, 1, true);
      } else {
         var2 = new EntityTrackerEntry((Entity)this, 0, 0, 1, true);
      }

      ArrayList var3 = new ArrayList();
      var3.add(null);
      ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var2).bridge$setPacketsConsumer(var1);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         var2.updatePlayerList$v1_7(var3);
      } else {
         var2.updatePlayerList$v1_8(var3);
      }

      ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var2).bridge$setPacketsConsumer(null);
   }

   public boolean bridge$isAlive() {
      return this.isEntityAlive();
   }

   public boolean bridge$getNoCulling() {
      return this.ignoreFrustumCheck;
   }

   public boolean bridge$isInWaterOrBubble() {
      return this.isInWater();
   }

   public boolean bridge$canBeCollidedWith() {
      return this.canBeCollidedWith();
   }

   public double bridge$distanceToCameraSq() {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
   }

   public boolean bridge$isItemFrame() {
      return (Entity)this instanceof EntityItemFrame;
   }

   public boolean bridge$isFirework() {
      return (Entity)this instanceof EntityFireworkRocket;
   }

   public boolean bridge$isWitherSkull() {
      return (Entity)this instanceof EntityWitherSkull;
   }

   public boolean bridge$isSnowball() {
      return (Entity)this instanceof EntitySnowball;
   }

   public boolean bridge$isFireball() {
      return (Entity)this instanceof EntityFireball;
   }

   public boolean bridge$isMonster() {
      Entity var1 = (Entity)this;
      return var1 instanceof EntityMob || var1 instanceof EntitySlime || var1 instanceof EntityGhast || var1 instanceof EntityDragon;
   }

   public boolean bridge$isMob() {
      return (Entity)this instanceof EntityMob;
   }

   public boolean bridge$isLeashed() {
      return this instanceof EntityMob var1 ? var1.isLeashed : false;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getLeashedToEntity() {
      return this instanceof EntityMob var1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1.leashHolder
         : null;
   }

   public boolean bridge$isInWater() {
      return this.isInWater();
   }

   public float bridge$maxUpStep() {
      return this.stepHeight;
   }

   public int bridge$getMaxFallDistance() {
      return this.getMaxFallHeight();
   }

   public Optional<String> bridge$getTeamName() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
         ? Optional.ofNullable(this.getTeam$v1_12()).map(Team::getName$v1_12)
         : Optional.ofNullable(this.world.getScoreboard().getPlayersTeam(this.getUniqueID().toString())).map(Team::getRegisteredName$v1_7);
   }

   public Optional<String> bridge$getBoatType() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 5) {
         return Optional.empty();
      } else {
         return this instanceof EntityBoat var1 ? Optional.of(var1.getBoatType$v1_12().name) : Optional.empty();
      }
   }

   public boolean bridge$isBoat() {
      return this instanceof EntityBoat;
   }

   public boolean bridge$isMinecart() {
      return this instanceof EntityMinecart;
   }

   public Vector3d bridge$getLookAngle() {
      return ((CRHROHHHCIHHCOHCOORCRIHHIICROR)this.getLookVec()).RCICCRIHIORCCCRCCORIROCOIIORHC();
   }

   public boolean bridge$shouldRender(double var1, double var3, double var5) {
      return this.isInRangeToRender3d(var1, var3, var5);
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getPassengers() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.getPassengers$v1_12();
      } else {
         return this.riddenByEntity$v1_7 == null ? Collections.emptyList() : List.of(this.riddenByEntity$v1_7);
      }
   }
}
