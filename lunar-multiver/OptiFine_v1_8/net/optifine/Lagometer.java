package net.optifine;

import net.optifine.util.MemoryMonitor;
import org.lwjgl.opengl.GL11;

public class Lagometer {
   private static ave mc;
   private static avh gameSettings;
   private static nt profiler;
   public static boolean active = false;
   public static Lagometer.TimerNano timerTick = new Lagometer.TimerNano();
   public static Lagometer.TimerNano timerScheduledExecutables = new Lagometer.TimerNano();
   public static Lagometer.TimerNano timerChunkUpload = new Lagometer.TimerNano();
   public static Lagometer.TimerNano timerChunkUpdate = new Lagometer.TimerNano();
   public static Lagometer.TimerNano timerVisibility = new Lagometer.TimerNano();
   public static Lagometer.TimerNano timerTerrain = new Lagometer.TimerNano();
   public static Lagometer.TimerNano timerServer = new Lagometer.TimerNano();
   private static long[] timesFrame = new long[512];
   private static long[] timesTick = new long[512];
   private static long[] timesScheduledExecutables = new long[512];
   private static long[] timesChunkUpload = new long[512];
   private static long[] timesChunkUpdate = new long[512];
   private static long[] timesVisibility = new long[512];
   private static long[] timesTerrain = new long[512];
   private static long[] timesServer = new long[512];
   private static boolean[] gcs = new boolean[512];
   private static int numRecordedFrameTimes = 0;
   private static long prevFrameTimeNano = -1L;
   private static long renderTimeNano = 0L;

   public static void updateLagometer() {
      if (mc == null) {
         mc = ave.A();
         gameSettings = mc.t;
         profiler = mc.A;
      }

      if (gameSettings.aC && (gameSettings.ofLagometer || gameSettings.aE)) {
         active = true;
         long timeNowNano = System.nanoTime();
         if (prevFrameTimeNano == -1L) {
            prevFrameTimeNano = timeNowNano;
         } else {
            int frameIndex = numRecordedFrameTimes & timesFrame.length - 1;
            numRecordedFrameTimes++;
            boolean gc = MemoryMonitor.isGcEvent();
            timesFrame[frameIndex] = timeNowNano - prevFrameTimeNano - renderTimeNano;
            timesTick[frameIndex] = timerTick.timeNano;
            timesScheduledExecutables[frameIndex] = timerScheduledExecutables.timeNano;
            timesChunkUpload[frameIndex] = timerChunkUpload.timeNano;
            timesChunkUpdate[frameIndex] = timerChunkUpdate.timeNano;
            timesVisibility[frameIndex] = timerVisibility.timeNano;
            timesTerrain[frameIndex] = timerTerrain.timeNano;
            timesServer[frameIndex] = timerServer.timeNano;
            gcs[frameIndex] = gc;
            timerTick.reset();
            timerScheduledExecutables.reset();
            timerVisibility.reset();
            timerChunkUpdate.reset();
            timerChunkUpload.reset();
            timerTerrain.reset();
            timerServer.reset();
            prevFrameTimeNano = System.nanoTime();
         }
      } else {
         active = false;
         prevFrameTimeNano = -1L;
      }
   }

   public static void showLagometer(avr scaledResolution) {
      if (gameSettings != null) {
         if (gameSettings.ofLagometer || gameSettings.aE) {
            long timeRenderStartNano = System.nanoTime();
            bfl.m(256);
            bfl.n(5889);
            bfl.E();
            bfl.g();
            bfl.D();
            bfl.a(0.0, mc.d, mc.e, 0.0, 1000.0, 3000.0);
            bfl.n(5888);
            bfl.E();
            bfl.D();
            bfl.b(0.0F, 0.0F, -2000.0F);
            GL11.glLineWidth(1.0F);
            bfl.x();
            bfx tess = bfx.a();
            bfd tessellator = tess.c();
            tessellator.a(1, bms.f);

            for (int frameNum = 0; frameNum < timesFrame.length; frameNum++) {
               int lum = (frameNum - numRecordedFrameTimes & timesFrame.length - 1) * 100 / timesFrame.length;
               lum += 155;
               float baseHeight = mc.e;
               long heightFrame = 0L;
               if (gcs[frameNum]) {
                  heightFrame = renderTime(frameNum, timesFrame[frameNum], lum, lum / 2, 0, baseHeight, tessellator);
               } else {
                  heightFrame = renderTime(frameNum, timesFrame[frameNum], lum, lum, lum, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesServer[frameNum], lum / 2, lum / 2, lum / 2, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesTerrain[frameNum], 0, lum, 0, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesVisibility[frameNum], lum, lum, 0, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesChunkUpdate[frameNum], lum, 0, 0, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesChunkUpload[frameNum], lum, 0, lum, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesScheduledExecutables[frameNum], 0, 0, lum, baseHeight, tessellator);
                  baseHeight -= (float)renderTime(frameNum, timesTick[frameNum], 0, lum, lum, baseHeight, tessellator);
               }
            }

            renderTimeDivider(0, timesFrame.length, 33333333L, 196, 196, 196, mc.e, tessellator);
            renderTimeDivider(0, timesFrame.length, 16666666L, 196, 196, 196, mc.e, tessellator);
            tess.b();
            bfl.w();
            int y60 = mc.e - 80;
            int y30 = mc.e - 160;
            mc.k.a("30", 2, y30 + 1, -8947849);
            mc.k.a("30", 1, y30, -3881788);
            mc.k.a("60", 2, y60 + 1, -8947849);
            mc.k.a("60", 1, y60, -3881788);
            bfl.n(5889);
            bfl.F();
            bfl.n(5888);
            bfl.F();
            bfl.w();
            float lumMem = 1.0F - (float)((System.currentTimeMillis() - MemoryMonitor.getStartTimeMs()) / 1000.0);
            lumMem = Config.limit(lumMem, 0.0F, 1.0F);
            int memColR = (int)(170.0F + lumMem * 85.0F);
            int memColG = (int)(100.0F + lumMem * 55.0F);
            int memColB = (int)(10.0F + lumMem * 10.0F);
            int colMem = memColR << 16 | memColG << 8 | memColB;
            int posX = 512 / scaledResolution.e() + 2;
            int posY = mc.e / scaledResolution.e() - 8;
            avo.a(posX - 1, posY - 1, posX + 50, posY + 10, -1605349296);
            mc.k.a(" " + MemoryMonitor.getAllocationRateMb() + " MB/s", posX, posY, colMem);
            renderTimeNano = System.nanoTime() - timeRenderStartNano;
         }
      }
   }

   private static long renderTime(int frameNum, long time, int r, int g, int b, float baseHeight, bfd tessellator) {
      long heightTime = time / 200000L;
      if (heightTime < 3L) {
         return 0L;
      }

      tessellator.b(frameNum + 0.5F, baseHeight - (float)heightTime + 0.5F, 0.0).b(r, g, b, 255).d();
      tessellator.b(frameNum + 0.5F, baseHeight + 0.5F, 0.0).b(r, g, b, 255).d();
      return heightTime;
   }

   private static long renderTimeDivider(int frameStart, int frameEnd, long time, int r, int g, int b, float baseHeight, bfd tessellator) {
      long heightTime = time / 200000L;
      if (heightTime < 3L) {
         return 0L;
      }

      tessellator.b(frameStart + 0.5F, baseHeight - (float)heightTime + 0.5F, 0.0).b(r, g, b, 255).d();
      tessellator.b(frameEnd + 0.5F, baseHeight - (float)heightTime + 0.5F, 0.0).b(r, g, b, 255).d();
      return heightTime;
   }

   public static boolean isActive() {
      return active;
   }

   public static class TimerNano {
      public long timeStartNano = 0L;
      public long timeNano = 0L;

      public void start() {
         if (Lagometer.active) {
            if (this.timeStartNano == 0L) {
               this.timeStartNano = System.nanoTime();
            }
         }
      }

      public void end() {
         if (Lagometer.active) {
            if (this.timeStartNano != 0L) {
               this.timeNano = this.timeNano + (System.nanoTime() - this.timeStartNano);
               this.timeStartNano = 0L;
            }
         }
      }

      private void reset() {
         this.timeNano = 0L;
         this.timeStartNano = 0L;
      }
   }
}
