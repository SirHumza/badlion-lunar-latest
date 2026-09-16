package com.mxgraph.util.svg;

public abstract class NumberParser extends AbstractParser {
   private static final double[] pow10 = new double[128];

   protected float parseFloat() {
      int var1 = 0;
      int var2 = 0;
      boolean var3 = true;
      boolean var4 = false;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      boolean var8 = true;
      switch (this.current) {
         case 45:
            var3 = false;
         case 43:
            this.current = this.reader.read();
      }

      label136:
      switch (this.current) {
         case 46:
            break;
         case 47:
         default:
            this.reportUnexpectedCharacterError(this.current);
            return 0.0F;
         case 48:
            var4 = true;

            label134:
            while (true) {
               this.current = this.reader.read();
               switch (this.current) {
                  case 46:
                  case 69:
                  case 101:
                     break label136;
                  case 48:
                     break;
                  case 49:
                  case 50:
                  case 51:
                  case 52:
                  case 53:
                  case 54:
                  case 55:
                  case 56:
                  case 57:
                     break label134;
                  default:
                     return 0.0F;
               }
            }
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            var4 = true;

            label122:
            while (true) {
               if (var2 < 9) {
                  var2++;
                  var1 = var1 * 10 + (this.current - 48);
               } else {
                  var7++;
               }

               this.current = this.reader.read();
               switch (this.current) {
                  case 48:
                  case 49:
                  case 50:
                  case 51:
                  case 52:
                  case 53:
                  case 54:
                  case 55:
                  case 56:
                  case 57:
                     break;
                  default:
                     break label122;
               }
            }
      }

      label115:
      if (this.current == 46) {
         this.current = this.reader.read();
         switch (this.current) {
            case 48:
               if (var2 == 0) {
                  label110:
                  while (true) {
                     this.current = this.reader.read();
                     var7--;
                     switch (this.current) {
                        case 48:
                           break;
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                           break label110;
                        default:
                           if (!var4) {
                              return 0.0F;
                           }
                           break label115;
                     }
                  }
               }
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
               break;
            case 69:
            case 101:
            default:
               if (!var4) {
                  this.reportUnexpectedCharacterError(this.current);
                  return 0.0F;
               }
               break label115;
         }

         label96:
         while (true) {
            if (var2 < 9) {
               var2++;
               var1 = var1 * 10 + (this.current - 48);
               var7--;
            }

            this.current = this.reader.read();
            switch (this.current) {
               case 48:
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 57:
                  break;
               default:
                  break label96;
            }
         }
      }

      switch (this.current) {
         case 69:
         case 101:
            this.current = this.reader.read();
            switch (this.current) {
               case 44:
               case 46:
               case 47:
               default:
                  this.reportUnexpectedCharacterError(this.current);
                  return 0.0F;
               case 45:
                  var8 = false;
               case 43:
                  this.current = this.reader.read();
                  switch (this.current) {
                     case 48:
                     case 49:
                     case 50:
                     case 51:
                     case 52:
                     case 53:
                     case 54:
                     case 55:
                     case 56:
                     case 57:
                        break;
                     default:
                        this.reportUnexpectedCharacterError(this.current);
                        return 0.0F;
                  }
               case 48:
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 57:
            }

            label87:
            switch (this.current) {
               case 48:
                  label86:
                  while (true) {
                     this.current = this.reader.read();
                     switch (this.current) {
                        case 48:
                           break;
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                           break label86;
                        default:
                           break label87;
                     }
                  }
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 57:
                  label79:
                  while (true) {
                     if (var6 < 3) {
                        var6++;
                        var5 = var5 * 10 + (this.current - 48);
                     }

                     this.current = this.reader.read();
                     switch (this.current) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                           break;
                        default:
                           break label79;
                     }
                  }
            }
         default:
            if (!var8) {
               var5 = -var5;
            }

            var5 += var7;
            if (!var3) {
               var1 = -var1;
            }

            return buildFloat(var1, var5);
      }
   }

   public static float buildFloat(int var0, int var1) {
      if (var1 < -125 || var0 == 0) {
         return 0.0F;
      }

      if (var1 >= 128) {
         return var0 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
      }

      if (var1 == 0) {
         return var0;
      }

      if (var0 >= 67108864) {
         var0++;
      }

      return (float)(var1 > 0 ? var0 * pow10[var1] : var0 / pow10[-var1]);
   }

   static {
      for (int var0 = 0; var0 < pow10.length; var0++) {
         pow10[var0] = Math.pow(10.0, var0);
      }
   }
}
