import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class KUG04E6KsHwtu2X2P0KfKjQY6lnMWe6nJ3ym91yYXH6rpbbIkEDEYQqKScbJWqQijKPiGjVPub9qZTNlS03jsqGMebz7AhbeoLW5
   implements bAva0O5lvjKFS9u6Hmx1etuPcYsJC5HWM9TTHhZ49bFRnzKK87SKrkAolO24hZsAByXOhEQ6G5C6Y5DtqtkskDNVv5QXTYPWB4RM {
   private xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY BatModClient;
   private Random Button;
   private final jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS[] CustomSpinner = new jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS[256];
   private final madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2 ButtonAction;
   private final List Spinner = Lists.newArrayList();
   private final boolean Checkbox;
   private final boolean ProgressBar;
   private Tt2yxGW5bWVn3eQt0jSSgjcw67poudOVLP5s7S0tgVf1QREcEL3f1Ycfwuf2ILwjoCPODE0ej1Pj8bQ1I5TrBvuJincuXOMdYx7Y BatModProgressBar;
   private Tt2yxGW5bWVn3eQt0jSSgjcw67poudOVLP5s7S0tgVf1QREcEL3f1Ycfwuf2ILwjoCPODE0ej1Pj8bQ1I5TrBvuJincuXOMdYx7Y ColorChooser;

   public KUG04E6KsHwtu2X2P0KfKjQY6lnMWe6nJ3ym91yYXH6rpbbIkEDEYQqKScbJWqQijKPiGjVPub9qZTNlS03jsqGMebz7AhbeoLW5(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1, long var2, boolean var4, String var5
   ) {
      this.BatModClient = var1;
      this.Button = new Random(var2);
      this.ButtonAction = madMd43YbMdQbj4e9mCec17IEBjewM4itYlUt55aEvTSDioMT85eF3ATuo7PSdn8IcXsM31AMWG0iYhOCO4tx4YQK0ZJFO3k0FF2.BatModClient(
         var5
      );
      if (var4) {
         Map var6 = this.ButtonAction
            .Button();
         if (var6.containsKey("village")) {
            Map var7 = (Map)var6.get("village");
            if (!var7.containsKey("size")) {
               var7.put("size", "1");
            }

            this.Spinner
               .add(new rlz6jOVtimlfQjJbehUvXQeQS9ehPAZna2tRcCF28bQ5LehPjLAOSXYzUJYJvGrqI9f7OpjnlQ1ivVLlPrTtAie55jroMiaIjxyj(var7));
         }

         if (var6.containsKey("biome_1")) {
            this.Spinner
               .add(new i4UGduKr25SfTTA06OhzaFjbFHrplxGC0VX6y48S895nYg6oOVVfNpK82ZfMXXGGiNxM0MdoyikqHma8ITgtjW1gu7qcBI0V6zh((Map)var6.get("biome_1")));
         }

         if (var6.containsKey("mineshaft")) {
            this.Spinner
               .add(new SqDvL6ZowZqQPde8umL6rCQ1eiH37Q8CNGMRbuWtPv2ZiI6ofCXm7VM5z2Ze85X8jLyWSsaN5s16s5gEzwd214BGiXTENVi8dvng((Map)var6.get("mineshaft")));
         }

         if (var6.containsKey("stronghold")) {
            this.Spinner
               .add(new VtdxFfyfn71VUGba0Z8cza5ePBI3CYenbyINLC9XFI6fVnizcmkcnhdksTvohPZITWUY454GCQLyeEwjk6dfIVSxJqDKea8jvLMy((Map)var6.get("stronghold")));
         }

         if (var6.containsKey("oceanmonument")) {
            this.Spinner
               .add(new Y9I6GlqbSg83ebTtUcl3a4t3DmU1Q5KYeJK3sv35UsBDBi1JEqDl1Q9F3h01UaWAwOkvAoslNvwcm2dMbbzP6TAJMb6ekih3bwPl((Map)var6.get("oceanmonument")));
         }
      }

      if (this.ButtonAction
         .Button()
         .containsKey("lake")) {
         this.BatModProgressBar = new Tt2yxGW5bWVn3eQt0jSSgjcw67poudOVLP5s7S0tgVf1QREcEL3f1Ycfwuf2ILwjoCPODE0ej1Pj8bQ1I5TrBvuJincuXOMdYx7Y(
            fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.IntegerSpinner
         );
      }

      if (this.ButtonAction
         .Button()
         .containsKey("lava_lake")) {
         this.ColorChooser = new Tt2yxGW5bWVn3eQt0jSSgjcw67poudOVLP5s7S0tgVf1QREcEL3f1Ycfwuf2ILwjoCPODE0ej1Pj8bQ1I5TrBvuJincuXOMdYx7Y(
            fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.ColorTextPane
         );
      }

      this.ProgressBar = this.ButtonAction
         .Button()
         .containsKey("dungeon");
      int var13 = 0;
      int var14 = 0;
      boolean var8 = true;

      for (scYQhmjlduMtn4d95yKTdeVqTIitE2gDTQ65bj25sHwqi7DJ9zpiTx2keQfqmIPUAEMQI64mv9eEAEE4632xJSzYQhahHLjl4YzC var10 : this.ButtonAction
         .CustomSpinner()) {
         for (int var11 = var10.CustomSpinner();
            var11
               < var10.CustomSpinner()
                  + var10.BatModClient();
            var11++
         ) {
            jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var12 = var10.Button();
            if (var12.CustomSpinner()
               != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
               )
             {
               var8 = false;
               this.CustomSpinner[var11] = var12;
            }
         }

         if (var10.Button()
               .CustomSpinner()
            == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
            )
          {
            var14 += var10.BatModClient();
         } else {
            var13 += var10.BatModClient() + var14;
            var14 = 0;
         }
      }

      var1.CustomSpinner(var13);
      this.Checkbox = var8
         ? false
         : this.ButtonAction
            .Button()
            .containsKey("decoration");
   }

   @Override
   public WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj ButtonAction(
      int var1, int var2
   ) {
      Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7 var3 = new Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7();

      for (int var4 = 0; var4 < this.CustomSpinner.length; var4++) {
         jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var5 = this.CustomSpinner[var4];
         if (var5 != null) {
            for (int var6 = 0; var6 < 16; var6++) {
               for (int var7 = 0; var7 < 16; var7++) {
                  var3.BatModClient(var6, var4, var7, var5);
               }
            }
         }
      }

      for (jkYi7hkCQaHBMkKA7QEQmtjUnlsH2cwUoAUHHWA1iNnWc8aejyZGqr8KVgznAymE5pM3UlsAlWeHvpsePpzP3IztKwj3f6Kz4f5L var10 : this.Spinner) {
         var10.BatModClient(
            this, this.BatModClient, var1, var2, var3
         );
      }

      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var9 = new WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj(
         this.BatModClient, var3, var1, var2
      );
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF[] var11 = this.BatModClient
         .IntegerSpinner()
         .Button(
            (Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF[])null, var1 * 16, var2 * 16, 16, 16
         );
      byte[] var12 = var9.TextField();

      for (int var13 = 0; var13 < var12.length; var13++) {
         var12[var13] = (byte)var11[var13].BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv;
      }

      var9.ButtonAction();
      return var9;
   }

   @Override
   public boolean BatModClient(int var1, int var2) {
      return true;
   }

   @Override
   public void BatModClient(
      bAva0O5lvjKFS9u6Hmx1etuPcYsJC5HWM9TTHhZ49bFRnzKK87SKrkAolO24hZsAByXOhEQ6G5C6Y5DtqtkskDNVv5QXTYPWB4RM var1, int var2, int var3
   ) {
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var6 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         var4, 0, var5
      );
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF var7 = this.BatModClient
         .CustomSpinner(
            new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var4 + 16, 0, var5 + 16)
         );
      boolean var8 = false;
      this.Button
         .setSeed(
            this.BatModClient
               .ExitCode()
         );
      long var9 = this.Button.nextLong() / 2L * 2L + 1L;
      long var11 = this.Button.nextLong() / 2L * 2L + 1L;
      this.Button
         .setSeed(
            var2 * var9 + var3 * var11
               ^ this.BatModClient
                  .ExitCode()
         );
      mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH var13 = new mfkVofzbwMv5rqykHfGmleyzSuDdktrfvFBPe0KI9e5yQJTHFwIUKLhJqWutPqyXke1YkCJbTeGe5ZPtfhBgUxTVaM6Aux3WGvyH(
         var2, var3
      );

      for (YKvuoqwlUP8m1VbaJdAA7YuGO2bPcwTKxZXUbqFhDmzLRCzYdQSRjaqKyqnTQOtT6F1G1qTBjwlGCSgMhKJKuWUsfOF1Jt94S var15 : this.Spinner) {
         boolean var16 = var15.BatModClient(
            this.BatModClient,
            this.Button,
            var13
         );
         if (var15 instanceof rlz6jOVtimlfQjJbehUvXQeQS9ehPAZna2tRcCF28bQ5LehPjLAOSXYzUJYJvGrqI9f7OpjnlQ1ivVLlPrTtAie55jroMiaIjxyj) {
            var8 |= var16;
         }
      }

      if (this.BatModProgressBar != null
         && !var8
         && this.Button.nextInt(4) == 0) {
         this.BatModProgressBar
            .BatModClient(
               this.BatModClient,
               this.Button,
               var6.BatModClient(
                  this.Button.nextInt(16) + 8,
                  this.Button.nextInt(256),
                  this.Button.nextInt(16) + 8
               )
            );
      }

      if (this.ColorChooser != null
         && !var8
         && this.Button.nextInt(8) == 0) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var17 = var6.BatModClient(
            this.Button.nextInt(16) + 8,
            this.Button
               .nextInt(this.Button.nextInt(248) + 8),
            this.Button.nextInt(16) + 8
         );
         if (var17.ColorChooser()
               < this.BatModClient
                  .RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM()
            || this.Button.nextInt(10) == 0) {
            this.ColorChooser
               .BatModClient(
                  this.BatModClient,
                  this.Button,
                  var17
               );
         }
      }

      if (this.ProgressBar) {
         for (int var18 = 0; var18 < 8; var18++) {
            new uzNyqi70gX4G58MsiKv9Yk0RqhAmWMmjcw68icIqwvnIQpXTvZ6pwpHouTfsNLseLEFogjTDKlZ4fZgYFTF53i4hLp2zaPrywWrj()
               .BatModClient(
                  this.BatModClient,
                  this.Button,
                  var6.BatModClient(
                     this.Button.nextInt(16) + 8,
                     this.Button.nextInt(256),
                     this.Button.nextInt(16) + 8
                  )
               );
         }
      }

      if (this.Checkbox) {
         var7.BatModClient(
            this.BatModClient,
            this.Button,
            var6
         );
      }
   }

   @Override
   public boolean BatModClient(
      bAva0O5lvjKFS9u6Hmx1etuPcYsJC5HWM9TTHhZ49bFRnzKK87SKrkAolO24hZsAByXOhEQ6G5C6Y5DtqtkskDNVv5QXTYPWB4RM var1,
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var2,
      int var3,
      int var4
   ) {
      return false;
   }

   @Override
   public boolean BatModClient(
      boolean var1, iJ3b2qzegVIaPj9gtoKCyZaxHKPjqdkShc17nlIQiAxQhfK0MLieeVuXyQRC3UBSrH1qBX3rDcYNevqRHCQdWOt4Br58MC6LRlqh var2
   ) {
      return true;
   }

   @Override
   public void BatModClient() {
   }

   @Override
   public boolean Button() {
      return false;
   }

   @Override
   public boolean CustomSpinner() {
      return true;
   }

   @Override
   public String ButtonAction() {
      return "FlatLevelSource";
   }

   @Override
   public List BatModClient(
      je7IBlakAp4pd4eBA4P58UAF9DS1t5KYY1wSjD6uefWLJ8CiVnLmpuPWPGxjqJCq5nZSEzlpO3mH2lIShfHsZqjg6MQ2p93BWG0Y var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF var3 = this.BatModClient
         .CustomSpinner(var2);
      return var3.BatModClient(var1);
   }

   @Override
   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      String var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      if ("Stronghold".equals(var2)) {
         for (YKvuoqwlUP8m1VbaJdAA7YuGO2bPcwTKxZXUbqFhDmzLRCzYdQSRjaqKyqnTQOtT6F1G1qTBjwlGCSgMhKJKuWUsfOF1Jt94S var5 : this.Spinner) {
            if (var5 instanceof VtdxFfyfn71VUGba0Z8cza5ePBI3CYenbyINLC9XFI6fVnizcmkcnhdksTvohPZITWUY454GCQLyeEwjk6dfIVSxJqDKea8jvLMy) {
               return var5.Button(var1, var3);
            }
         }
      }

      return null;
   }

   @Override
   public int Spinner() {
      return 0;
   }

   @Override
   public void BatModClient(
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var1, int var2, int var3
   ) {
      for (YKvuoqwlUP8m1VbaJdAA7YuGO2bPcwTKxZXUbqFhDmzLRCzYdQSRjaqKyqnTQOtT6F1G1qTBjwlGCSgMhKJKuWUsfOF1Jt94S var5 : this.Spinner) {
         var5.BatModClient(
            this,
            this.BatModClient,
            var2,
            var3,
            (Z7u3kXmE1Z1La5wuW43LvM3MqXi2h2heVDrb5yErQvVFes5dvNjvuTD4vtNVaxJ74kxMHODIIL6qJ5Q6XSDm9TINzbpL91BffMM7)null
         );
      }
   }

   @Override
   public WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return this.ButtonAction(
         var1.BatModProgressBar() >> 4,
         var1.IntegerSpinner() >> 4
      );
   }
}
