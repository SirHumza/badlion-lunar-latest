package net.optifine;

import java.util.Comparator;

public class ChunkPosComparator implements Comparator<adg> {
   private int chunkPosX;
   private int chunkPosZ;
   private double yawRad;
   private double pitchNorm;

   public ChunkPosComparator(int chunkPosX, int chunkPosZ, double yawRad, double pitchRad) {
      this.chunkPosX = chunkPosX;
      this.chunkPosZ = chunkPosZ;
      this.yawRad = yawRad;
      this.pitchNorm = 1.0 - ns.a(Math.abs(pitchRad) / (Math.PI / 2), 0.0, 1.0);
   }

   public int compare(adg cp1, adg cp2) {
      int distSq1 = this.getDistSq(cp1);
      int distSq2 = this.getDistSq(cp2);
      return distSq1 - distSq2;
   }

   private int getDistSq(adg cp) {
      int dx = cp.a - this.chunkPosX;
      int dz = cp.b - this.chunkPosZ;
      int distSq = dx * dx + dz * dz;
      double yaw = ns.b(dz, dx);
      double dYaw = Math.abs(yaw - this.yawRad);
      if (dYaw > Math.PI) {
         dYaw = (Math.PI * 2) - dYaw;
      }

      return (int)(distSq * (1000.0 * (this.pitchNorm * dYaw * dYaw)));
   }
}
