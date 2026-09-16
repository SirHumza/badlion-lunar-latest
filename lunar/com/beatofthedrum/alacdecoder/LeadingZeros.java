package com.beatofthedrum.alacdecoder;

class LeadingZeros {
   private int curByte = 0;
   private int output = 0;

   private void countLeadingZerosExtra(int var1, int var2) {
      if ((var1 & 240) == 0) {
         var2 += 4;
      } else {
         var1 >>= 4;
      }

      if ((var1 & 8) != 0) {
         this.output = var2;
         this.curByte = var1;
      } else if ((var1 & 4) != 0) {
         this.output = var2 + 1;
         this.curByte = var1;
      } else if ((var1 & 2) != 0) {
         this.output = var2 + 2;
         this.curByte = var1;
      } else if ((var1 & 1) != 0) {
         this.output = var2 + 3;
         this.curByte = var1;
      } else {
         this.output = var2 + 4;
         this.curByte = var1;
      }
   }

   int countLeadingZeros(int var1) {
      int var2 = 0;
      int var3 = 0;
      var3 = var1 >> 24;
      if (var3 != 0) {
         this.countLeadingZerosExtra(var3, var2);
         return this.output;
      } else {
         var2 += 8;
         var3 = var1 >> 16;
         if ((var3 & 0xFF) != 0) {
            this.countLeadingZerosExtra(var3, var2);
            return this.output;
         } else {
            var2 += 8;
            var3 = var1 >> 8;
            if ((var3 & 0xFF) != 0) {
               this.countLeadingZerosExtra(var3, var2);
               return this.output;
            } else {
               var2 += 8;
               var3 = var1;
               if ((var3 & 0xFF) != 0) {
                  this.countLeadingZerosExtra(var3, var2);
                  return this.output;
               } else {
                  return var2 + 8;
               }
            }
         }
      }
   }
}
