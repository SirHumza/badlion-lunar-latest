package net.optifine;

import cj.a;
import java.util.HashSet;
import java.util.Set;

public class DynamicLight {
   private pk entity = null;
   private double offsetY = 0.0;
   private double lastPosX = -2.1474836E9F;
   private double lastPosY = -2.1474836E9F;
   private double lastPosZ = -2.1474836E9F;
   private int lastLightLevel = 0;
   private boolean underwater = false;
   private long timeCheckMs = 0L;
   private Set<cj> setLitChunkPos = new HashSet<>();
   private a blockPosMutable = new a();

   public DynamicLight(pk entity) {
      this.entity = entity;
      this.offsetY = entity.aS();
   }

   public void update(bfr renderGlobal) {
      if (Config.isDynamicLightsFast()) {
         long timeNowMs = System.currentTimeMillis();
         if (timeNowMs < this.timeCheckMs + 500L) {
            return;
         }

         this.timeCheckMs = timeNowMs;
      }

      double posX = this.entity.s - 0.5;
      double posY = this.entity.t - 0.5 + this.offsetY;
      double posZ = this.entity.u - 0.5;
      int lightLevel = DynamicLights.getLightLevel(this.entity);
      double dx = posX - this.lastPosX;
      double dy = posY - this.lastPosY;
      double dz = posZ - this.lastPosZ;
      double delta = 0.1;
      if (!(Math.abs(dx) <= delta) || !(Math.abs(dy) <= delta) || !(Math.abs(dz) <= delta) || this.lastLightLevel != lightLevel) {
         this.lastPosX = posX;
         this.lastPosY = posY;
         this.lastPosZ = posZ;
         this.lastLightLevel = lightLevel;
         this.underwater = false;
         adm world = renderGlobal.getWorld();
         if (world != null) {
            this.blockPosMutable.c(ns.c(posX), ns.c(posY), ns.c(posZ));
            alz state = world.p(this.blockPosMutable);
            afh block = state.c();
            this.underwater = block == afi.j;
         }

         Set<cj> setNewPos = new HashSet<>();
         if (lightLevel > 0) {
            cq dirX = (ns.c(posX) & 15) >= 8 ? cq.f : cq.e;
            cq dirY = (ns.c(posY) & 15) >= 8 ? cq.b : cq.a;
            cq dirZ = (ns.c(posZ) & 15) >= 8 ? cq.d : cq.c;
            cj chunkPos = new cj(posX, posY, posZ);
            bht chunk = renderGlobal.getRenderChunk(chunkPos);
            cj chunkPosX = this.getChunkPos(chunk, chunkPos, dirX);
            bht chunkX = renderGlobal.getRenderChunk(chunkPosX);
            cj chunkPosZ = this.getChunkPos(chunk, chunkPos, dirZ);
            bht chunkZ = renderGlobal.getRenderChunk(chunkPosZ);
            cj chunkPosXZ = this.getChunkPos(chunkX, chunkPosX, dirZ);
            bht chunkXZ = renderGlobal.getRenderChunk(chunkPosXZ);
            cj chunkPosY = this.getChunkPos(chunk, chunkPos, dirY);
            bht chunkY = renderGlobal.getRenderChunk(chunkPosY);
            cj chunkPosYX = this.getChunkPos(chunkY, chunkPosY, dirX);
            bht chunkYX = renderGlobal.getRenderChunk(chunkPosYX);
            cj chunkPosYZ = this.getChunkPos(chunkY, chunkPosY, dirZ);
            bht chunkYZ = renderGlobal.getRenderChunk(chunkPosYZ);
            cj chunkPosYXZ = this.getChunkPos(chunkYX, chunkPosYX, dirZ);
            bht chunkYXZ = renderGlobal.getRenderChunk(chunkPosYXZ);
            this.updateChunkLight(chunk, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkX, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkZ, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkXZ, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkY, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkYX, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkYZ, this.setLitChunkPos, setNewPos);
            this.updateChunkLight(chunkYXZ, this.setLitChunkPos, setNewPos);
         }

         this.updateLitChunks(renderGlobal);
         this.setLitChunkPos = setNewPos;
      }
   }

   private cj getChunkPos(bht renderChunk, cj pos, cq facing) {
      return renderChunk != null ? renderChunk.a(facing) : pos.a(facing, 16);
   }

   private void updateChunkLight(bht renderChunk, Set<cj> setPrevPos, Set<cj> setNewPos) {
      if (renderChunk != null) {
         bhq compiledChunk = renderChunk.g();
         if (compiledChunk != null && !compiledChunk.a()) {
            renderChunk.a(true);
         }

         cj pos = renderChunk.j();
         if (setPrevPos != null) {
            setPrevPos.remove(pos);
         }

         if (setNewPos != null) {
            setNewPos.add(pos);
         }
      }
   }

   public void updateLitChunks(bfr renderGlobal) {
      for (cj posOld : this.setLitChunkPos) {
         bht chunkOld = renderGlobal.getRenderChunk(posOld);
         this.updateChunkLight(chunkOld, null, null);
      }
   }

   public pk getEntity() {
      return this.entity;
   }

   public double getLastPosX() {
      return this.lastPosX;
   }

   public double getLastPosY() {
      return this.lastPosY;
   }

   public double getLastPosZ() {
      return this.lastPosZ;
   }

   public int getLastLightLevel() {
      return this.lastLightLevel;
   }

   public boolean isUnderwater() {
      return this.underwater;
   }

   public double getOffsetY() {
      return this.offsetY;
   }

   @Override
   public String toString() {
      return "Entity: " + this.entity + ", offsetY: " + this.offsetY;
   }
}
