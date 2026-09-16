package com.beatofthedrum.alacdecoder;

import java.io.IOException;

class DemuxResT {
   int formatRead;
   int numChannels;
   int sampleSize;
   int sampleRate;
   int format;
   private int[] buf = new int[81920];
   DemuxResT.SampleInfo[] timeToSample = new DemuxResT.SampleInfo[16];
   int numTimeToSamples;
   int[] sampleByteSize;
   int codecDataLen;
   int[] codecData = new int[1024];
   int[] stco;
   DemuxResT.ChunkInfo[] stsc;
   int mdatLen;

   DemuxResT() {
      for (int var1 = 0; var1 < 16; var1++) {
         this.timeToSample[var1] = new DemuxResT.SampleInfo();
      }
   }

   void getSampleInfo(int var1, DemuxResT.SampleDuration var2) {
      int var3 = 0;
      int var4 = 0;
      if (var1 >= this.sampleByteSize.length) {
         throw new IOException("sample " + var1 + " does not exist ");
      }

      if (this.numTimeToSamples == 0) {
         throw new IOException("no time to samples");
      }

      while (this.timeToSample[var4].sampleCount + var3 <= var1) {
         var3 += this.timeToSample[var4].sampleCount;
         if (++var4 >= this.numTimeToSamples) {
            throw new IOException("sample " + var1 + " does not have a duration");
         }
      }

      var2.sampleDuration = this.timeToSample[var4].sampleDuration;
      var2.sampleByteSize = this.sampleByteSize[var1];
   }

   static class ChunkInfo {
      int firstChunk;
      int samplesPerChunk;
      int sampleDescIndex;
   }

   static class SampleDuration {
      int sampleByteSize = 0;
      int sampleDuration = 0;
   }

   static class SampleInfo {
      int sampleCount = 0;
      int sampleDuration = 0;
   }
}
