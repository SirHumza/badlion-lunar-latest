package com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   extends com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Entity HROIHIOHHHROHCOROROHICICRIIIHO;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Entity var1) {
      super(var1.world);
      this.HROIHIOHHHROHCOROROHICICRIIIHO = var1;
   }

   private void RCRCHCCHCCHHRRHRHOOOCORCIHHOOH() {
      this.lastTickPosX = this.HROIHIOHHHROHCOROROHICICRIIIHO.lastTickPosX;
      this.lastTickPosY = this.HROIHIOHHHROHCOROROHICICRIIIHO.lastTickPosY;
      this.lastTickPosZ = this.HROIHIOHHHROHCOROROHICICRIIIHO.lastTickPosZ;
      this.posX = this.HROIHIOHHHROHCOROROHICICRIIIHO.posX;
      this.posY = this.HROIHIOHHHROHCOROROHICICRIIIHO.posY;
      this.posZ = this.HROIHIOHHHROHCOROROHICICRIIIHO.posZ;
      this.prevPosX = this.HROIHIOHHHROHCOROROHICICRIIIHO.prevPosX;
      this.prevPosY = this.HROIHIOHHHROHCOROROHICICRIIIHO.prevPosY;
      this.prevPosZ = this.HROIHIOHHHROHCOROROHICICRIIIHO.prevPosZ;
      this.rotationYaw = this.HROIHIOHHHROHCOROROHICICRIIIHO.rotationYaw;
      this.rotationPitch = this.HROIHIOHHHROHCOROROHICICRIIIHO.rotationPitch;
      this.prevRotationYaw = this.HROIHIOHHHROHCOROROHICICRIIIHO.prevRotationYaw;
      this.prevRotationPitch = this.HROIHIOHHHROHCOROROHICICRIIIHO.prevRotationPitch;
      this.ridingEntity = this.HROIHIOHHHROHCOROROHICICRIIIHO.ridingEntity;
      this.height = this.HROIHIOHHHROHCOROROHICICRIIIHO.height;
      this.width = this.HROIHIOHHHROHCOROROHICICRIIIHO.width;
      this.world = this.HROIHIOHHHROHCOROROHICICRIIIHO.world;
      this.onGround = this.HROIHIOHHHROHCOROROHICICRIIIHO.onGround;
      this.chunkCoordX = this.HROIHIOHHHROHCOROROHICICRIIIHO.chunkCoordX;
      this.chunkCoordY = this.HROIHIOHHHROHCOROROHICICRIIIHO.chunkCoordY;
      this.chunkCoordZ = this.HROIHIOHHHROHCOROROHICICRIIIHO.chunkCoordZ;
      this.addedToChunk = this.HROIHIOHHHROHCOROROHICICRIIIHO.addedToChunk;
      this.collided = this.HROIHIOHHHROHCOROROHICICRIIIHO.collided;
      this.collidedHorizontally = this.HROIHIOHHHROHCOROROHICICRIIIHO.collidedHorizontally;
      this.collidedVertically = this.HROIHIOHHHROHCOROROHICICRIIIHO.collidedVertically;
      this.dimension = this.HROIHIOHHHROHCOROROHICICRIIIHO.dimension;
      this.fire = this.HROIHIOHHHROHCOROROHICICRIIIHO.fire;
      this.firstUpdate = this.HROIHIOHHHROHCOROROHICICRIIIHO.firstUpdate;
      this.isInWeb = this.HROIHIOHHHROHCOROROHICICRIIIHO.isInWeb;
      this.motionX = this.HROIHIOHHHROHCOROROHICICRIIIHO.motionX;
      this.motionY = this.HROIHIOHHHROHCOROROHICICRIIIHO.motionY;
      this.motionZ = this.HROIHIOHHHROHCOROROHICICRIIIHO.motionZ;
      this.noClip = this.HROIHIOHHHROHCOROROHICICRIIIHO.noClip;
      this.inPortal = this.HROIHIOHHHROHCOROROHICICRIIIHO.inPortal;
      this.timeUntilPortal = this.HROIHIOHHHROHCOROROHICICRIIIHO.timeUntilPortal;
      this.portalCounter = this.HROIHIOHHHROHCOROROHICICRIIIHO.portalCounter;
      this.teleportDirection$v1_7 = this.HROIHIOHHHROHCOROROHICICRIIIHO.teleportDirection$v1_7;
      this.boundingBox = this.HROIHIOHHHROHCOROROHICICRIIIHO.boundingBox;
      this.rotationYawHead = this.HROIHIOHHHROHCOROROHICICRIIIHO.rotationYaw;
      this.prevRotationYawHead = this.HROIHIOHHHROHCOROROHICICRIIIHO.prevRotationYaw;
   }

   public boolean isPlayerSleeping() {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.isPlayerSleeping();
   }

   public RayTraceResult rayTrace$v1_7(double var1, float var3) {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.rayTrace$v1_7(var1, var3);
   }

   public Vec3d getPosition$v1_7(float var1) {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.getPosition$v1_7(var1);
   }

   public Vec3d getLookVec$v1_7() {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.getLookVec$v1_7();
   }

   public double getDistanceSq(double var1, double var3, double var5) {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.getDistanceSq(var1, var3, var5);
   }

   public double getDistance(double var1, double var3, double var5) {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.getDistance(var1, var3, var5);
   }

   public float getDistanceToEntity$v1_7(Entity var1) {
      this.RCRCHCCHCCHHRRHRHOOOCORCIHHOOH();
      return super.getDistanceToEntity$v1_7(var1);
   }
}
