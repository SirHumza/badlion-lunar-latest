import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class qlXEh8o8keRZEoFh2GZMTzmRXMEiLntx7zyJRpyX6ZeHl30RzVChFVgdOvKc8rzxqLm4JBkj8ijCohKOJNymRp0bajwInQi7DmZp
   extends gz4TF3kWVpjkEyKphK9tGhaH9NZsm4idteBg3ApDwNo4MBWQUvoi2kQHcXwPJoB8lPmeiFuan1dkde6qrJTVlpSbXAqXeAeUtwP {
   public int Button;
   public int CustomSpinner;
   public byte ButtonAction;
   public byte Spinner;
   public byte[] Checkbox = new byte[16384];
   public List ProgressBar = Lists.newArrayList();
   private Map ColorChooser = Maps.newHashMap();
   public Map BatModProgressBar = Maps.newLinkedHashMap();

   public qlXEh8o8keRZEoFh2GZMTzmRXMEiLntx7zyJRpyX6ZeHl30RzVChFVgdOvKc8rzxqLm4JBkj8ijCohKOJNymRp0bajwInQi7DmZp(String var1) {
      super(var1);
   }

   public void BatModClient(double var1, double var3, int var5) {
      int var6 = 128 * (1 << var5);
      int var7 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         (var1 + 64.0) / var6
      );
      int var8 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         (var3 + 64.0) / var6
      );
      this.Button = var7 * var6 + var6 / 2 - 64;
      this.CustomSpinner = var8 * var6 + var6 / 2 - 64;
   }

   @Override
   public void BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      this.ButtonAction = var1.ButtonAction(
         "dimension"
      );
      this.Button = var1.Checkbox(
         "xCenter"
      );
      this.CustomSpinner = var1.Checkbox(
         "zCenter"
      );
      this.Spinner = var1.ButtonAction(
         "scale"
      );
      this.Spinner = (byte)u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         this.Spinner, 0, 4
      );
      short var2 = var1.Spinner("width");
      short var3 = var1.Spinner("height");
      if (var2 == 128 && var3 == 128) {
         this.Checkbox = var1.TextField(
            "colors"
         );
      } else {
         byte[] var4 = var1.TextField("colors");
         this.Checkbox = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for (int var7 = 0; var7 < var3; var7++) {
            int var8 = var7 + var6;
            if (var8 >= 0 || var8 < 128) {
               for (int var9 = 0; var9 < var2; var9++) {
                  int var10 = var9 + var5;
                  if (var10 >= 0 || var10 < 128) {
                     this.Checkbox[var10 + var8 * 128] = var4[var9
                        + var7 * var2];
                  }
               }
            }
         }
      }
   }

   @Override
   public void CustomSpinner(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      var1.BatModClient(
         "dimension", this.ButtonAction
      );
      var1.BatModClient(
         "xCenter", this.Button
      );
      var1.BatModClient(
         "zCenter", this.CustomSpinner
      );
      var1.BatModClient(
         "scale", this.Spinner
      );
      var1.BatModClient("width", (short)128);
      var1.BatModClient("height", (short)128);
      var1.BatModClient(
         "colors", this.Checkbox
      );
   }

   public void BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2
   ) {
      if (!this.ColorChooser.containsKey(var1)) {
         RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev var3 = new RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev(
            this, var1
         );
         this.ColorChooser.put(var1, var3);
         this.ProgressBar.add(var3);
      }

      if (!var1.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         .CustomSpinner(var2)) {
         this.BatModProgressBar.remove(var1.C_());
      }

      for (int var6 = 0; var6 < this.ProgressBar.size(); var6++) {
         RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev var4 = (RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev)this.ProgressBar
            .get(var6);
         if (!var4.BatModClient.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu
            && (
               var4.BatModClient
                     .aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
                     .CustomSpinner(var2)
                  || var2.BatModJson()
            )) {
            if (!var2.BatModJson()
               && var4.BatModClient.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
                  == this.ButtonAction) {
               this.BatModClient(
                  0,
                  var4.BatModClient.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY,
                  var4.BatModClient.C_(),
                  var4.BatModClient.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
                  var4.BatModClient.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4,
                  var4.BatModClient.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
               );
            }
         } else {
            this.ColorChooser
               .remove(var4.BatModClient);
            this.ProgressBar.remove(var4);
         }
      }

      if (var2.BatModJson()) {
         OvUujot6oh3kXdEZZ1wwlbipUHlxSTzK4EP9kbh2bTD3XSc9doloOdhbCd5bQj07VbsjrjitM3zasIJ7xZYJGjvKg3RuJjR31Se9 var7 = var2.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var9 = var7.ColorTextPane();
         this.BatModClient(
            1,
            var1.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY,
            "frame-" + var7.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb(),
            var9.BatModProgressBar(),
            var9.IntegerSpinner(),
            var7.Button
                  .CustomSpinner()
               * 90
         );
      }

      if (var2.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()
         && var2.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()
            .Button("Decorations", 9)) {
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var8 = var2.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()
            .CustomSpinner("Decorations", 10);

         for (int var10 = 0; var10 < var8.Spinner(); var10++) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var5 = var8.Button(
               var10
            );
            if (!this.BatModProgressBar
               .containsKey(var5.IntegerSpinner("id"))) {
               this.BatModClient(
                  var5.ButtonAction("type"),
                  var1.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY,
                  var5.IntegerSpinner("id"),
                  var5.ColorChooser("x"),
                  var5.ColorChooser("z"),
                  var5.ColorChooser("rot")
               );
            }
         }
      }
   }

   private void BatModClient(
      int var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      String var3,
      double var4,
      double var6,
      double var8
   ) {
      int var10 = 1 << this.Spinner;
      float var11 = (float)(var4 - this.Button) / var10;
      float var12 = (float)(var6 - this.CustomSpinner) / var10;
      byte var13 = (byte)(var11 * 2.0F + 0.5);
      byte var14 = (byte)(var12 * 2.0F + 0.5);
      byte var15 = 63;
      byte var16;
      if (var11 >= -var15 && var12 >= -var15 && var11 <= var15 && var12 <= var15) {
         var8 += var8 < 0.0 ? -8.0 : 8.0;
         var16 = (byte)(var8 * 16.0 / 360.0);
         if (this.ButtonAction < 0) {
            int var17 = (int)(
               var2.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
                     .ProgressBar()
                  / 10L
            );
            var16 = (byte)(var17 * var17 * 34187121 + var17 * 121 >> 15 & 15);
         }
      } else {
         if (Math.abs(var11) >= 320.0F || Math.abs(var12) >= 320.0F) {
            this.BatModProgressBar.remove(var3);
            return;
         }

         var1 = 6;
         var16 = 0;
         if (var11 <= -var15) {
            var13 = (byte)(var15 * 2 + 2.5);
         }

         if (var12 <= -var15) {
            var14 = (byte)(var15 * 2 + 2.5);
         }

         if (var11 >= var15) {
            var13 = (byte)(var15 * 2 + 1);
         }

         if (var12 >= var15) {
            var14 = (byte)(var15 * 2 + 1);
         }
      }

      this.BatModProgressBar
         .put(var3, new qkEiKigPDgTgMoIVaDIUQv3Vs3obuVjAQwvJvVlBND68ij4wPv1GzAxouaGdgmlgKaaY7qy8v53lpfNL8l7fz7s2FG0srrHAv1TV((byte)var1, var13, var14, var16));
   }

   public fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM BatModClient(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var3
   ) {
      RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev var4 = (RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev)this.ColorChooser
         .get(var3);
      return var4 == null ? null : var4.BatModClient(var1);
   }

   public void BatModClient(int var1, int var2) {
      super.ButtonAction();

      for (RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev var4 : this.ProgressBar) {
         var4.BatModClient(var1, var2);
      }
   }

   public RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev var2 = (RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev)this.ColorChooser
         .get(var1);
      if (var2 == null) {
         var2 = new RfOlxWhUEJ9HwFwUBuUmuC9Jt9rhSLkesVIDsNPgbIy6ShP8ysdAPX35A78uQRm1nVuM8C4NCBV03kGPxXKyvYC7QBSvdWGzPHev(this, var1);
         this.ColorChooser.put(var1, var2);
         this.ProgressBar.add(var2);
      }

      return var2;
   }
}
