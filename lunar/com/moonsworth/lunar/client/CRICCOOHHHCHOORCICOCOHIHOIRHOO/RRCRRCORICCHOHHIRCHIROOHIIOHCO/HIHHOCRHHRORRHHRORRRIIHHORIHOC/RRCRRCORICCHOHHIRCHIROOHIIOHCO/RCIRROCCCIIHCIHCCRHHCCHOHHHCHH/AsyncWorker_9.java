package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.DataOutputStream;
import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;
import lombok.Generated;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.util.opus.Opus;

public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH {
   protected final HHCCIRHCCCIIRHCROHIORHIRHHIORH ROCHHROOIOHHRCRICIRCHRHCRCCIOH = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private boolean paused = false;
   protected long HCCOHRHCICCCHOOHCHORIIICOHORHR;
   private Thread IOIOCCCOIHICRCHCHIOORCICHHHIRI;
   protected final Set<DataOutputStream> HCIRHIORRHORHIHHORCICRROORHIHO = new HashSet<>();

   protected void HRCRRCRCCRCOHCOHCROHIRIHRIHRRO() {
      IntBuffer var1 = BufferUtils.createIntBuffer(1);
      this.HCCOHRHCICCCHOOHCHORIIICOHORHR = Opus.opus_encoder_create(
         this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frequency, this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.channels, 2049, var1
      );
      if (var1.get() != 0) {
         throw new RuntimeException("Failed to create Opus encoder: " + var1.get());
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(DataOutputStream var1) {
      this.HCIRHIORRHORHIHHORCICRROORHIHO.add(var1);
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(DataOutputStream var1) {
      this.HCIRHIORRHORHIHHORCICRROORHIHO.remove(var1);
   }

   public abstract void start();

   public void IIRHCHHOICHRICOOCRORCCIOOIHOIR(Runnable var1) {
      this.IOIOCCCOIHICRCHCHIOORCICHHHIRI = new Thread(var1);
      this.IOIOCCCOIHICRCHCHIOORCICHHHIRI.start();
   }

   public void stop() {
      if (this.IOIOCCCOIHICRCHCHIOORCICHHHIRI != null) {
         this.IOIOCCCOIHICRCHCHIOORCICHHHIRI.interrupt();

         try {
            this.IOIOCCCOIHICRCHCHIOORCICHHHIRI.join();
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      if (this.HCCOHRHCICCCHOOHCHORIIICOHORHR != 0L) {
         Opus.opus_encoder_destroy(this.HCCOHRHCICCCHOOHCHORIIICOHORHR);
      }

      for (DataOutputStream var2 : this.HCIRHIORRHORHIHHORCICRROORHIHO) {
         var2.close();
      }
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OICIHIRCCCIROROROOROCORICICRCO() {
      return this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH;
   }

   @Generated
   public boolean CHRHOHORRICRRHRCRCICOORCHHCIOH() {
      return this.paused;
   }

   @Generated
   public void RCOHCCHCRHIIIICRIHCOICIHHCCOOC(boolean var1) {
      this.paused = var1;
   }
}
