package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR;

import java.io.ByteArrayInputStream;
import java.util.function.LongConsumer;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ByteArrayInputStream {
   private long count;
   private LongConsumer HORCIOCCROCOHCIICCICRIHIIICHIR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1) {
      super(var1);
   }

   @Override
   public synchronized int read() {
      int var1 = super.read();
      if (var1 != -1) {
         this.count++;
         if (this.HORCIOCCROCOHCIICCICRIHIIICHIR != null) {
            this.HORCIOCCROCOHCIICCICRIHIIICHIR.accept(this.count);
         }
      }

      return var1;
   }

   @Override
   public int read(@NotNull byte[] var1) {
      int var2 = super.read(var1);
      if (var2 != -1) {
         this.count += var2;
         if (this.HORCIOCCROCOHCIICCICRIHIIICHIR != null) {
            this.HORCIOCCROCOHCIICCICRIHIIICHIR.accept(this.count);
         }
      }

      return var2;
   }

   @Override
   public synchronized int read(byte[] var1, int var2, int var3) {
      int var4 = super.read(var1, var2, var3);
      if (var4 != -1) {
         this.count += var4;
         if (this.HORCIOCCROCOHCIICCICRIHIIICHIR != null) {
            this.HORCIOCCROCOHCIICCICRIHIIICHIR.accept(this.count);
         }
      }

      return var4;
   }

   @Generated
   public long getCount() {
      return this.count;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LongConsumer var1) {
      this.HORCIOCCROCOHCIICCICRIHIIICHIR = var1;
   }
}
