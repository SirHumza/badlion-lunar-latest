import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2 {
   private final List BatModClient = Lists.newArrayList();
   private final Map Button = Maps.newHashMap();
   private int CustomSpinner;

   public int BatModClient() {
      return this.CustomSpinner;
   }

   public void BatModClient(int var1) {
      this.CustomSpinner = var1;
   }

   public Map Button() {
      return this.Button;
   }

   public List CustomSpinner() {
      return this.BatModClient;
   }

   public void ButtonAction() {
      int var1 = 0;

      for (scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC var3 : this.BatModClient) {
         var3.BatModClient(var1);
         var1 += var3.BatModClient();
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(3);
      var1.append(";");

      for (int var2 = 0; var2 < this.BatModClient.size(); var2++) {
         if (var2 > 0) {
            var1.append(",");
         }

         var1.append(
            ((scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC)this.BatModClient
                  .get(var2))
               .toString()
         );
      }

      var1.append(";");
      var1.append(this.CustomSpinner);
      if (!this.Button.isEmpty()) {
         var1.append(";");
         int var9 = 0;

         for (Entry var4 : this.Button.entrySet()) {
            if (var9++ > 0) {
               var1.append(",");
            }

            var1.append(((String)var4.getKey()).toLowerCase());
            Map var5 = (Map)var4.getValue();
            if (!var5.isEmpty()) {
               var1.append("(");
               int var6 = 0;

               for (Entry var8 : var5.entrySet()) {
                  if (var6++ > 0) {
                     var1.append(" ");
                  }

                  var1.append((String)var8.getKey());
                  var1.append("=");
                  var1.append((String)var8.getValue());
               }

               var1.append(")");
            }
         }
      } else {
         var1.append(";");
      }

      return var1.toString();
   }

   private static scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC BatModClient(
      int var0, String var1, int var2
   ) {
      String[] var3 = var0 >= 3 ? var1.split("\\*", 2) : var1.split("x", 2);
      int var4 = 1;
      int var5 = 0;
      if (var3.length == 2) {
         try {
            var4 = Integer.parseInt(var3[0]);
            if (var2 + var4 >= 256) {
               var4 = 256 - var2;
            }

            if (var4 < 0) {
               var4 = 0;
            }
         } catch (Throwable var8) {
            return null;
         }
      }

      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var6 = null;

      try {
         String var7 = var3[var3.length - 1];
         if (var0 < 3) {
            var3 = var7.split(":", 2);
            if (var3.length > 1) {
               var5 = Integer.parseInt(var3[1]);
            }

            var6 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
               Integer.parseInt(var3[0])
            );
         } else {
            var3 = var7.split(":", 3);
            var6 = var3.length > 1
               ? c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
                  var3[0] + ":" + var3[1]
               )
               : null;
            if (var6 != null) {
               var5 = var3.length > 2 ? Integer.parseInt(var3[2]) : 0;
            } else {
               var6 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
                  var3[0]
               );
               if (var6 != null) {
                  var5 = var3.length > 1 ? Integer.parseInt(var3[1]) : 0;
               }
            }

            if (var6 == null) {
               return null;
            }
         }

         if (var6
            == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
            )
          {
            var5 = 0;
         }

         if (var5 < 0 || var5 > 15) {
            var5 = 0;
         }
      } catch (Throwable var9) {
         return null;
      }

      scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC var13 = new scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
         var0, var4, var6, var5
      );
      var13.BatModClient(var2);
      return var13;
   }

   private static List BatModClient(int var0, String var1) {
      if (var1 != null && var1.length() >= 1) {
         ArrayList var2 = Lists.newArrayList();
         String[] var3 = var1.split(",");
         int var4 = 0;

         for (String var8 : var3) {
            scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC var9 = BatModClient(
               var0, var8, var4
            );
            if (var9 == null) {
               return null;
            }

            var2.add(var9);
            var4 += var9.BatModClient();
         }

         return var2;
      } else {
         return null;
      }
   }

   public static madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2 BatModClient(
      String var0
   ) {
      if (var0 == null) {
         return Spinner();
      }

      String[] var1 = var0.split(";", -1);
      int var2 = var1.length == 1
         ? 0
         : u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var1[0], 0
         );
      if (var2 >= 0 && var2 <= 3) {
         madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2 var3 = new madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2();
         int var4 = var1.length == 1 ? 0 : 1;
         List var5 = BatModClient(var2, var1[var4++]);
         if (var5 != null && !var5.isEmpty()) {
            var3.CustomSpinner().addAll(var5);
            var3.ButtonAction();
            int var6 = Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
               .BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv;
            if (var2 > 0 && var1.length > var4) {
               var6 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                  var1[var4++], var6
               );
            }

            var3.BatModClient(var6);
            if (var2 > 0 && var1.length > var4) {
               String[] var7 = var1[var4++].toLowerCase().split(",");

               for (String var11 : var7) {
                  String[] var12 = var11.split("\\(", 2);
                  HashMap var13 = Maps.newHashMap();
                  if (var12[0].length() > 0) {
                     var3.Button().put(var12[0], var13);
                     if (var12.length > 1 && var12[1].endsWith(")") && var12[1].length() > 1) {
                        String[] var14 = var12[1].substring(0, var12[1].length() - 1).split(" ");

                        for (int var15 = 0; var15 < var14.length; var15++) {
                           String[] var16 = var14[var15].split("=", 2);
                           if (var16.length == 2) {
                              var13.put(var16[0], var16[1]);
                           }
                        }
                     }
                  }
               }
            } else {
               var3.Button().put("village", Maps.newHashMap());
            }

            return var3;
         } else {
            return Spinner();
         }
      } else {
         return Spinner();
      }
   }

   public static madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2 Spinner() {
      madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2 var0 = new madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2();
      var0.BatModClient(
         Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
            .BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv
      );
      var0.CustomSpinner()
         .add(
            new scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
               1,
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModProgressBar
            )
         );
      var0.CustomSpinner()
         .add(
            new scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
               2,
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ButtonAction
            )
         );
      var0.CustomSpinner()
         .add(
            new scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC(
               1,
               fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.CustomSpinner
            )
         );
      var0.ButtonAction();
      var0.Button().put("village", Maps.newHashMap());
      return var0;
   }
}
