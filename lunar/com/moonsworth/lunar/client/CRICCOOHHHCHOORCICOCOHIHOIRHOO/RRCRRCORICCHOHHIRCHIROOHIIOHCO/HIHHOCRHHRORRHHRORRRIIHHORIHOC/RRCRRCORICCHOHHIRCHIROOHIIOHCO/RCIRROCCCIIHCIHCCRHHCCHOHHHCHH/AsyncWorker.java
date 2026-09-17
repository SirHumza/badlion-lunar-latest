package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.util.opus.Opus;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COORHORCHORIOCOOCCIRICHRRIHCCR = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MONO16;
   private final Object ICHIHCCCOICHRHIORROCCORRRIHCRH;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHIOCRCHOORRIRCHICIORRCRRRHICH = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROHOOHRICIROORROHCROCCOHHCORRI();

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frequency = 48000;
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.bytesPerSample = COORHORCHORIOCOOCCIRICHRRIHCCR.getBytesPerSample();
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.channels = COORHORCHORIOCOOCCIRICHRRIHCCR.getChannels();
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize = 960;
      String var2 = var1.OICOROCRIOHHCRRHIORHOOROIOHRIR().get();

      try {
         if (!var1.OICOROCRIOHHCRRHIORHOOROIOHRIR().CCCIIICOHOOCCCHCHCOCROCOOHRIRR().call().contains(var2)) {
            var2 = "default";
            var1.OICOROCRIOHHCRRHIORHOOROIOHRIR().RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if (var2.equalsIgnoreCase("default") || var2.isEmpty()) {
         var2 = null;
      }

      this.ICHIHCCCOICHRHIORROCCORRRIHCRH = this.OHIOCRCHOORRIRCHICIORRCRRRHICH
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2,
            this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frequency,
            COORHORCHORIOCOOCCIRICHRRIHCCR.getAlFormat(),
            this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.channels * 4
         );
      if (this.ICHIHCCCOICHRHIORROCCORRRIHCRH != null && this.ICHIHCCCOICHRHIORROCCORRRIHCRH != 0L) {
         this.HRCRRCRCCRCOHCOHCROHIRIHRIHRRO();
      } else {
         throw new IllegalStateException("Failed to open the microphone device.");
      }
   }

   @Override
   public void start() {
      this.OHIOCRCHOORRIRCHICIORRCRRRHICH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.ICHIHCCCOICHRHIORROCCORRRIHCRH);
      int var1 = this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.channels;
      int var2 = var1 * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.bytesPerSample;
      ByteBuffer var3 = BufferUtils.createByteBuffer(var2).order(ByteOrder.LITTLE_ENDIAN);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var2).order(ByteOrder.LITTLE_ENDIAN);
      byte[] var5 = new byte[var2];
      ShortBuffer var6 = var3.asShortBuffer();
      this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
         () -> {
            while (!Thread.currentThread().isInterrupted()) {
               int var5x = this.OHIOCRCHOORRIRCHICIORRCRRRHICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICHIHCCCOICHRHIORROCCORRRIHCRH, 786);

               while (var5x >= this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize) {
                  var5x -= this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize;
                  this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH
                     .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                        this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.CHCRRCICCCHRHCCHICOCIIIHRORHIC()
                           + this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize * 1000L / this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frequency
                     );
                  this.OHIOCRCHOORRIRCHICIORRCRRRHICH
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ICHIHCCCOICHRHIORROCCORRRIHCRH, var3, this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize);
                  if (!this.CHRHOHORRICRRHRCRCICOORCHHCIOH()) {
                     try {
                        var4.clear();
                        int var6x = Opus.opus_encode(this.HCCOHRHCICCCHOOHCHORIIICOHORHR, var6, this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.frameSize, var4);
                        var4.get(var5, 0, var6x);

                        for (DataOutputStream var8 : this.HCIRHIORRHORHIHHORCICRROORHIHO) {
                           CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var6x);
                           var8.write(var5, 0, var6x);
                        }
                     } catch (IOException var10) {
                        com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var10, "Rewind"
                        );
                     }
                  }
               }

               try {
                  Thread.sleep(5L);
               } catch (InterruptedException var9) {
                  Thread.currentThread().interrupt();
               }
            }
         }
      );
   }

   @Override
   public void stop() {
      super.stop();
      this.OHIOCRCHOORRIRCHICIORRCRRRHICH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(this.ICHIHCCCOICHRHIORROCCORRRIHCRH);
      this.OHIOCRCHOORRIRCHICIORRCRRRHICH.IIHRRHORCRCROCHHOHORCHCROCIHRO(this.ICHIHCCCOICHRHIORROCCORRRIHCRH);
   }
}
