package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.lwjgl.BufferUtils;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final int ICOOROHCRRRIOOOCHCIOOCOCCCOCHC = 4;
   private static final int OCOIRHHHHIOCRICORCORRRHCIIROII = 5;
   private int width = -1;
   private int height = -1;
   private int RHHRHIRCRHIHRROIHHIRICHIRIHCCI = 0;
   private final ArrayBlockingQueue<ByteBuffer> OOIIHORRRIRHCIIHOORCCROHOCIIHC = new ArrayBlockingQueue<>(5);
   private final ArrayBlockingQueue<ByteBuffer> HHORCCRCIHHIOHIORHROIICRIRHCCI = new ArrayBlockingQueue<>(5);
   private final AtomicInteger IIHROCIRCICOOIHCOHCHICORRRCCIC = new AtomicInteger(0);

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteBuffer var1) {
      if (var1 != null && var1.capacity() == this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI) {
         this.HHORCCRCIHHIOHIORHROIICRIRHCCI.put(var1);
      }
   }

   @Override
   public boolean isFull() {
      return this.IIHROCIRCICOOIHCOHCHICORRRCCIC.get() + this.OOIIHORRRIRHCIIHOORCCROHOCIIHC.size() >= 5;
   }

   @Override
   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var1.getWidth(), var1.getHeight());
      if (this.IIHROCIRCICOOIHCOHCHICORRRCCIC.get() >= 5) {
         return false;
      }

      ByteBuffer var2 = this.HHORCCRCIHHIOHIORHROIICRIRHCCI.poll();
      if (var2 == null) {
         return false;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI()
         .HIHCRRIHRIROROCRICHHORIOCRCOCO();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = var3.HHRRRORIICOCHCOOOORHHOOHHIOHHI()
         .HOIHRCIOCIHORHIRHCOHRHHCCHOOOR();
      this.IIHROCIRCICOOIHCOHCHICORRRCCIC.incrementAndGet();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4.bridge$getColorTexture(true),
            0,
            0,
            this.width,
            this.height,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RGBA8,
            var2x -> {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2x, var2);
               this.OOIIHORRRIRHCIIHOORCCROHOCIIHC.offer(var2);
               this.IIHROCIRCICOOIHCOHCHICORRRCCIC.decrementAndGet();
            }
         );
      return true;
   }

   @Override
   public ByteBuffer ROROHRHRICIHRIIOOIHCIRIICRRORH() {
      return this.OOIIHORRRIRHCIIHOORCCROHOCIIHC.poll();
   }

   @Override
   public void close() {
      this.OOIIHORRRIRHCIIHOORCCROHOCIIHC.clear();
      this.HHORCCRCIHHIOHIORHROIICRIRHCCI.clear();
      this.IIHROCIRCICOOIHCOHCHICORRRCCIC.set(0);
      this.width = -1;
      this.height = -1;
      this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI = 0;
   }

   private void IOHIHIIHCCCCCIHRORIOIOORCIOHII(int var1, int var2) {
      int var3 = var1 * var2 * 4;
      if (var1 != this.width || var2 != this.height || this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI != var3) {
         this.OOIIHORRRIRHCIIHOORCCROHOCIIHC.clear();
         this.HHORCCRCIHHIOHIORHROIICRIRHCCI.clear();
         this.width = var1;
         this.height = var2;
         this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI = var3;

         for (int var4 = 0; var4 < 5; var4++) {
            this.HHORCCRCIHHIOHIORHROIICRIRHCCI.offer(BufferUtils.createByteBuffer(this.RHHRHIRCRHIHRROIHHIRICHIRIHCCI));
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ByteBuffer var0, ByteBuffer var1) {
      var1.clear();
      int var2 = var0.position();
      int var3 = var0.limit();
      int var4 = var3 - var2;

      for (byte var5 = 0; var5 + 3 < var4; var5 += 4) {
         byte var6 = var0.get(var2 + var5);
         byte var7 = var0.get(var2 + var5 + 1);
         byte var8 = var0.get(var2 + var5 + 2);
         byte var9 = var0.get(var2 + var5 + 3);
         var1.put(var8).put(var7).put(var6).put(var9);
      }

      var1.flip();
   }
}
