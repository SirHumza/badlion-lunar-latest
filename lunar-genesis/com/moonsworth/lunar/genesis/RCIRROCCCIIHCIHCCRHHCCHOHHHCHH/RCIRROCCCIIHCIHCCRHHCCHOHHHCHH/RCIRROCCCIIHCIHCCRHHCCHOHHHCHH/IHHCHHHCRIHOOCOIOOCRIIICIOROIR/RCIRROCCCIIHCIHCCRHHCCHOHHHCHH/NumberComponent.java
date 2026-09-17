package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.ReflectionSupport;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
@ReflectionSupport(ReflectionSupport.Level.FULL)
public class OCOHORHCROHICRRIHCIHHRRCIHICRI extends Number implements Serializable {
   private static final long CHIORIHHIHRIOORHROIRORCOHHHORC = 0L;
   private transient volatile long value;
   private static final AtomicLongFieldUpdater<OCOHORHCROHICRRIHCIHHRRCIHICRI> HHOHHHHCHOOOIIIRCCIIRCCCHIICIO = AtomicLongFieldUpdater.newUpdater(
      OCOHORHCROHICRRIHCIHHRRCIHICRI.class, "value"
   );

   public OCOHORHCROHICRRIHCIHHRRCIHICRI(double var1) {
      this.value = Double.doubleToRawLongBits(var1);
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI() {
   }

   public final double RORRRIIOIRRIHHHCCCRRORCCOOOCIC() {
      return Double.longBitsToDouble(this.value);
   }

   public final void ROCRHIOCHIIOCROIHHOHHROCHCIHCH(double var1) {
      long var3 = Double.doubleToRawLongBits(var1);
      this.value = var3;
   }

   public final void OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(double var1) {
      long var3 = Double.doubleToRawLongBits(var1);
      HHOHHHHCHOOOIIIRCCIIRCCCHIICIO.lazySet(this, var3);
   }

   public final double IRRCHICCRHCHRRCHIOHIIRIORIRHRI(double var1) {
      long var3 = Double.doubleToRawLongBits(var1);
      return Double.longBitsToDouble(HHOHHHHCHOOOIIIRCCIIRCCCHIICIO.getAndSet(this, var3));
   }

   public final boolean ICICIOCHHHIHOCHCOHORIHRCOHHOCR(double var1, double var3) {
      return HHOHHHHCHOOOIIIRCCIIRCCCHIICIO.compareAndSet(this, Double.doubleToRawLongBits(var1), Double.doubleToRawLongBits(var3));
   }

   public final boolean IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(double var1, double var3) {
      return HHOHHHHCHOOOIIIRCCIIRCCCHIICIO.weakCompareAndSet(this, Double.doubleToRawLongBits(var1), Double.doubleToRawLongBits(var3));
   }

   @CanIgnoreReturnValue
   public final double ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(double var1) {
      long var3;
      double var5;
      long var9;
      do {
         var3 = this.value;
         var5 = Double.longBitsToDouble(var3);
         double var7 = var5 + var1;
         var9 = Double.doubleToRawLongBits(var7);
      } while (!HHOHHHHCHOOOIIIRCCIIRCCCHIICIO.compareAndSet(this, var3, var9));

      return var5;
   }

   @CanIgnoreReturnValue
   public final double ICOHIIIRCIORCORHRRROOOOCOOROIC(double var1) {
      long var3;
      double var7;
      long var9;
      do {
         var3 = this.value;
         double var5 = Double.longBitsToDouble(var3);
         var7 = var5 + var1;
         var9 = Double.doubleToRawLongBits(var7);
      } while (!HHOHHHHCHOOOIIIRCCIIRCCCHIICIO.compareAndSet(this, var3, var9));

      return var7;
   }

   @Override
   public String toString() {
      return Double.toString(this.RORRRIIOIRRIHHHCCCRRORCCOOOCIC());
   }

   @Override
   public int intValue() {
      return (int)this.RORRRIIOIRRIHHHCCCRRORCCOOOCIC();
   }

   @Override
   public long longValue() {
      return (long)this.RORRRIIOIRRIHHHCCCRRORCCOOOCIC();
   }

   @Override
   public float floatValue() {
      return (float)this.RORRRIIOIRRIHHHCCCRRORCCOOOCIC();
   }

   @Override
   public double doubleValue() {
      return this.RORRRIIOIRRIHHHCCCRRORCCOOOCIC();
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeDouble(this.RORRRIIOIRRIHHHCCCRRORCCOOOCIC());
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.ROCRHIOCHIIOCROIHHOHHROCHCIHCH(var1.readDouble());
   }
}
