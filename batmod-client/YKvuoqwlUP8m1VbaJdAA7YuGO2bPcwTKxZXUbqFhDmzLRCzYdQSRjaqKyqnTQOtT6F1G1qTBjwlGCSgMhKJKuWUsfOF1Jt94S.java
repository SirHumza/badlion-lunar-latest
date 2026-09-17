import java.util.Map;
import java.util.Map.Entry;

public class SqDvL6ZowZqQPde8umL6rCQ1eiH37Q8CNGMRbuWtPv2ZiI6ofCXm7VM5z2Ze85X8jLyWSsaN5s16s5gEzwd214BGiXTENVi8dvng
   extends YKvuoqwlUP8m1VbaJdAA7YuGO2bPcwTKxZXUbqFhDmzLRCzYdQSRjaqKyqnTQOtT6F1G1qTBjwlGCSgMhKJKuWUsfOF1Jt94S {
   private double Spinner = 0.004;

   public SqDvL6ZowZqQPde8umL6rCQ1eiH37Q8CNGMRbuWtPv2ZiI6ofCXm7VM5z2Ze85X8jLyWSsaN5s16s5gEzwd214BGiXTENVi8dvng() {
   }

   @Override
   public String BatModClient() {
      return "Mineshaft";
   }

   public SqDvL6ZowZqQPde8umL6rCQ1eiH37Q8CNGMRbuWtPv2ZiI6ofCXm7VM5z2Ze85X8jLyWSsaN5s16s5gEzwd214BGiXTENVi8dvng(Map var1) {
      for (Entry var3 : var1.entrySet()) {
         if (((String)var3.getKey()).equals("chance")) {
            this.Spinner = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               (String)var3.getValue(), this.Spinner
            );
         }
      }
   }

   @Override
   protected boolean BatModClient(int var1, int var2) {
      return this.Button.nextDouble()
            < this.Spinner
         && this.Button.nextInt(80)
            < Math.max(Math.abs(var1), Math.abs(var2));
   }

   @Override
   protected lmGpsHWfgruU6R0D9ud0H5Jp2r9xkezQ8UkI9FCTC83XJ7VxWqi0MyTqquqseEc7buI8NDQigAt0sAauOiFXoiCCZ13l7ZRiEMA7 Button(
      int var1, int var2
   ) {
      return new BdDErMOSLQyfA8iu2vGN04QNbOYdbSBsEwKnmZbjP4Sv409rKlS4jFIAm9w3Csz3lMxoy8Io4DT2PAxW2QF8nnmVyM8bcwPeeZst(
         this.CustomSpinner,
         this.Button,
         var1,
         var2
      );
   }
}
