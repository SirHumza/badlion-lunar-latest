import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZHe8k1rhxETrynnZllNzGfnZRfwbQyNFZ4kMMP5nNZ1ImIeSsVqWJwZAwn0TTNwEus4bIpxZLH7MvSBPdCXRgdGNHNg8aDhbmk1y {
   private static final Pattern BatModClient = Pattern.compile(
      "^@([pare])(?:\\[([\\w=,!-]*)\\])?$"
   );
   private static final Pattern Button = Pattern.compile(
      "\\G([-!]?[\\w-]*)(?:$|,)"
   );
   private static final Pattern CustomSpinner = Pattern.compile(
      "\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)"
   );
   private static final Set ButtonAction = Sets.newHashSet(
      new String[]{"x", "y", "z", "dx", "dy", "dz", "rm", "r"}
   );

   public static egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var0, String var1
   ) {
      return (egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)BatModClient(
         var0, var1, egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS.class
      );
   }

   public static Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var0, String var1, Class var2
   ) {
      List var3 = Button(var0, var1, var2);
      return var3.size() == 1 ? (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var3.get(0) : null;
   }

   public static WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY Button(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var0, String var1
   ) {
      List var2 = Button(
         var0, var1, Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM.class
      );
      if (var2.isEmpty()) {
         return null;
      }

      ArrayList var3 = Lists.newArrayList();

      for (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var5 : var2) {
         var3.add(var5.CustomSpinner());
      }

      return uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB.BatModClient(
         var3
      );
   }

   public static List Button(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var0, String var1, Class var2
   ) {
      Matcher var3 = BatModClient.matcher(var1);
      if (var3.matches() && var0.BatModClient(1, "@")) {
         Map var4 = CustomSpinner(var3.group(2));
         if (!Button(var0, var4)) {
            return Collections.emptyList();
         }

         String var5 = var3.group(1);
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var6 = Button(
            var4, var0.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr()
         );
         List var7 = BatModClient(var0, var4);
         ArrayList var8 = Lists.newArrayList();

         for (xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var10 : var7) {
            if (var10 != null) {
               ArrayList var11 = Lists.newArrayList();
               var11.addAll(BatModClient(var4, var5));
               var11.addAll(Button(var4));
               var11.addAll(CustomSpinner(var4));
               var11.addAll(ButtonAction(var4));
               var11.addAll(Spinner(var4));
               var11.addAll(Checkbox(var4));
               var11.addAll(BatModClient(var4, var6));
               var11.addAll(ProgressBar(var4));
               var8.addAll(
                  BatModClient(var4, var2, var11, var5, var10, var6)
               );
            }
         }

         return BatModClient(var8, var4, var0, var2, var5, var6);
      } else {
         return Collections.emptyList();
      }
   }

   private static List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var0, Map var1
   ) {
      ArrayList var2 = Lists.newArrayList();
      if (BatModProgressBar(var1)) {
         var2.add(var0.ButtonAction());
      } else {
         Collections.addAll(
            var2,
            TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .ButtonAction
         );
      }

      return var2;
   }

   private static boolean Button(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var0, Map var1
   ) {
      String var2 = Button(var1, "type");
      var2 = var2 != null && var2.startsWith("!") ? var2.substring(1) : var2;
      if (var2 != null
         && !hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.Button(
            var2
         )) {
         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "commands.generic.entity.invalidType", var2
         );
         var3.ProgressBar()
            .BatModClient(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModInstallerMain
            );
         var0.BatModClient(var3);
         return false;
      } else {
         return true;
      }
   }

   private static List BatModClient(Map var0, String var1) {
      ArrayList var2 = Lists.newArrayList();
      String var3 = Button(var0, "type");
      boolean var4 = var3 != null && var3.startsWith("!");
      if (var4) {
         var3 = var3.substring(1);
      }

      boolean var5 = !var1.equals("e");
      boolean var6 = var1.equals("r") && var3 != null;
      if ((var3 == null || !var1.equals("e")) && !var6) {
         if (var5) {
            var2.add(new O9X0agnnirUjCdaa3jZYpnCTspLG5bn60TrXgcwWbS1imJsg2sJ6lbgiawnWTJUbexWsTHdZzcJXoiWvnsqWVQfY28b4QAA7Mi1x());
         }
      } else {
         String var7 = var3;
         var2.add(new bdPYL6lw4iMEewT4MBG1nPMQVPZKjERPUW5v8Q2tHPJSKYVJURzwVS570WzEw532zcxR4Jf3hrZdgXBjWnnKNqVJmrTZftqWmM5i(var7, var4));
      }

      return var2;
   }

   private static List Button(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      int var2 = BatModClient(var0, "lm", -1);
      int var3 = BatModClient(var0, "l", -1);
      if (var2 > -1 || var3 > -1) {
         var1.add(new RGlvwpkZnqTVlgVhEIUNM5WCc6hEAnWrP6ywwBZppbyLHGzbnCDgJsrjh8P6IbU7ID9FiCUE9yTwIqaSEdDJM6ndpNK2R8ljrifk(var2, var3));
      }

      return var1;
   }

   private static List CustomSpinner(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      int var2 = BatModClient(
         var0,
         "m",
         UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc.BatModClient
            .BatModClient()
      );
      if (var2
         != UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc.BatModClient
            .BatModClient()) {
         var1.add(new PvIXlVuu67MlIjhODkV4iuXjaP5qVBKn4CenDe0ziI6fwk2fzt2tAWkamKUTGePzxs0DdroEH8fhcO4nc8inAHl5FH5yxSK1Zkvf(var2));
      }

      return var1;
   }

   private static List ButtonAction(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      String var2 = Button(var0, "team");
      boolean var3 = var2 != null && var2.startsWith("!");
      if (var3) {
         var2 = var2.substring(1);
      }

      if (var2 != null) {
         String var4 = var2;
         var1.add(new XTJyo9pz2bwiamrcixKFBI4bHXRHktk9SGhhSpjZgBZclWsd7OIFMWeMvboFGVIPXAYMx9C74fFDx5TveRkIH0nP9EI1xHUc0fzm(var4, var3));
      }

      return var1;
   }

   private static List Spinner(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      Map var2 = BatModClient(var0);
      if (var2 != null && var2.size() > 0) {
         var1.add(new OpfQGq2k67gH5RddixnlqZPM9NMUoNYYJbSLObjs2aM7trTRarjk43DNndTIxFJLxODNELLzUZfY7mQ39VxtmI6BXR2xbVm3zFzI(var2));
      }

      return var1;
   }

   private static List Checkbox(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      String var2 = Button(var0, "name");
      boolean var3 = var2 != null && var2.startsWith("!");
      if (var3) {
         var2 = var2.substring(1);
      }

      if (var2 != null) {
         String var4 = var2;
         var1.add(new OuqmGvFfNTLdYzZzlJXwN1HiFdf6jZA3GKBDkpzguEtOrRkKm9eIQ6vBHlqOqjqlna6CME33nAqvThNw9iEwe1LaieweR1S3lof(var4, var3));
      }

      return var1;
   }

   private static List BatModClient(
      Map var0, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      ArrayList var2 = Lists.newArrayList();
      int var3 = BatModClient(var0, "rm", -1);
      int var4 = BatModClient(var0, "r", -1);
      if (var1 != null && (var3 >= 0 || var4 >= 0)) {
         int var5 = var3 * var3;
         int var6 = var4 * var4;
         var2.add(new M6GzV2tYF6kDzXveYxeK0oPIH4D9pwQjPOGCaDTRBsHqI4Ob5BhsvLk1WOJYbD34jhiKUc8BjsFfrbTwqdAeM0GzsDCJ3KeSRFk(var1, var3, var5, var4, var6));
      }

      return var2;
   }

   private static List ProgressBar(Map var0) {
      ArrayList var1 = Lists.newArrayList();
      if (var0.containsKey("rym") || var0.containsKey("ry")) {
         int var2 = BatModClient(
            BatModClient(var0, "rym", 0)
         );
         int var3 = BatModClient(
            BatModClient(var0, "ry", 359)
         );
         var1.add(new gr18L5mEUnNOO0fByuSLjnJ0OE80fGzmTUCUuR9rMuk9sSQcRll9SWPD7qXQ8w8Awr1HrudLJh8mYyvVPAA3FPpc0WDikmkXRsxl(var2, var3));
      }

      if (var0.containsKey("rxm") || var0.containsKey("rx")) {
         int var4 = BatModClient(
            BatModClient(var0, "rxm", 0)
         );
         int var5 = BatModClient(
            BatModClient(var0, "rx", 359)
         );
         var1.add(new A3zUOWl3eHjMFoue3gNSvTQ4UwJ5lPgdTu4CLfMfuKjPbqCTnHqYXx3bIYd5ha2dhnRaSx9If9rW4Cvn2VTlINjAUUYxVuSxBz0h(var4, var5));
      }

      return var1;
   }

   private static List BatModClient(
      Map var0,
      Class var1,
      List var2,
      String var3,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var4,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var5
   ) {
      ArrayList var6 = Lists.newArrayList();
      String var7 = Button(var0, "type");
      var7 = var7 != null && var7.startsWith("!") ? var7.substring(1) : var7;
      boolean var8 = !var3.equals("e");
      boolean var9 = var3.equals("r") && var7 != null;
      int var10 = BatModClient(var0, "dx", 0);
      int var11 = BatModClient(var0, "dy", 0);
      int var12 = BatModClient(var0, "dz", 0);
      int var13 = BatModClient(var0, "r", -1);
      Predicate var14 = Predicates.and(var2);
      Predicate var15 = Predicates.and(
         K2KPA4pfEqQGUxwgH4FOKySEldvUe4B7eFvOoEyLMDOD1bg7M9Ex8MKacJ4N4GMwLh5jsdUOa03oyeEeXmZI78vbWMhvYjiea49W.BatModClient,
         var14
      );
      if (var5 != null) {
         int var16 = var4.Checkbox.size();
         int var17 = var4.Button.size();
         boolean var18 = var16 < var17 / 16;
         if (var0.containsKey("dx") || var0.containsKey("dy") || var0.containsKey("dz")) {
            rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var22 = BatModClient(
               var5, var10, var11, var12
            );
            if (var8 && var18 && !var9) {
               i47HqAdlEqDjq4KSrwnmoRRKeK4o5E1qRtohHCBiaDLKOQpulRitLER2zqlOP8Rh7Pz7sGSc1jskufziiLuiqwd0yiUJbH8Ux3H7 var20 = new i47HqAdlEqDjq4KSrwnmoRRKeK4o5E1qRtohHCBiaDLKOQpulRitLER2zqlOP8Rh7Pz7sGSc1jskufziiLuiqwd0yiUJbH8Ux3H7(
                  var22
               );
               var6.addAll(
                  var4.Button(var1, Predicates.and(var15, var20))
               );
            } else {
               var6.addAll(var4.BatModClient(var1, var22, var15));
            }
         } else if (var13 >= 0) {
            rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var19 = new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(
               var5.BatModProgressBar() - var13,
               var5.ColorChooser() - var13,
               var5.IntegerSpinner() - var13,
               var5.BatModProgressBar() + var13 + 1,
               var5.ColorChooser() + var13 + 1,
               var5.IntegerSpinner() + var13 + 1
            );
            if (var8 && var18 && !var9) {
               var6.addAll(var4.Button(var1, var15));
            } else {
               var6.addAll(var4.BatModClient(var1, var19, var15));
            }
         } else if (var3.equals("a")) {
            var6.addAll(var4.Button(var1, var14));
         } else if (var3.equals("p") || var3.equals("r") && !var9) {
            var6.addAll(var4.Button(var1, var15));
         } else {
            var6.addAll(var4.BatModClient(var1, var15));
         }
      } else if (var3.equals("a")) {
         var6.addAll(var4.Button(var1, var14));
      } else if (var3.equals("p") || var3.equals("r") && !var9) {
         var6.addAll(var4.Button(var1, var15));
      } else {
         var6.addAll(var4.BatModClient(var1, var15));
      }

      return var6;
   }

   private static List BatModClient(
      List var0,
      Map var1,
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var2,
      Class var3,
      String var4,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var5
   ) {
      int var6 = BatModClient(
         var1, "c", !var4.equals("a") && !var4.equals("e") ? 1 : 0
      );
      if (!var4.equals("p") && !var4.equals("a") && !var4.equals("e")) {
         if (var4.equals("r")) {
            Collections.shuffle(var0);
         }
      } else if (var5 != null) {
         Collections.sort(var0, new HpccovQJ62tU4qglhVTqDBUMnjjSnJiIrOQ08AQTiTxWgeOhzHq0tptSAceEEk6JjVF0AKxN8chCqwEMHWyoCHyboVrd9h6zyjht(var5));
      }

      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var7 = var2.o_();
      if (var7 != null && var3.isAssignableFrom(var7.getClass()) && var6 == 1 && var0.contains(var7) && !"r".equals(var4)) {
         var0 = Lists.newArrayList(new Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM[]{var7});
      }

      if (var6 != 0) {
         if (var6 < 0) {
            Collections.reverse(var0);
         }

         var0 = var0.subList(0, Math.min(Math.abs(var6), var0.size()));
      }

      return var0;
   }

   private static rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var0, int var1, int var2, int var3
   ) {
      boolean var4 = var1 < 0;
      boolean var5 = var2 < 0;
      boolean var6 = var3 < 0;
      int var7 = var0.BatModProgressBar() + (var4 ? var1 : 0);
      int var8 = var0.ColorChooser() + (var5 ? var2 : 0);
      int var9 = var0.IntegerSpinner() + (var6 ? var3 : 0);
      int var10 = var0.BatModProgressBar() + (var4 ? 0 : var1) + 1;
      int var11 = var0.ColorChooser() + (var5 ? 0 : var2) + 1;
      int var12 = var0.IntegerSpinner() + (var6 ? 0 : var3) + 1;
      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(var7, var8, var9, var10, var11, var12);
   }

   public static int BatModClient(int var0) {
      var0 %= 360;
      if (var0 >= 160) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   private static q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Button(
      Map var0, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         BatModClient(
            var0, "x", var1.BatModProgressBar()
         ),
         BatModClient(
            var0, "y", var1.ColorChooser()
         ),
         BatModClient(
            var0, "z", var1.IntegerSpinner()
         )
      );
   }

   private static boolean BatModProgressBar(Map var0) {
      for (String var2 : ButtonAction) {
         if (var0.containsKey(var2)) {
            return true;
         }
      }

      return false;
   }

   private static int BatModClient(Map var0, String var1, int var2) {
      return var0.containsKey(var1)
         ? u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            (String)var0.get(var1), var2
         )
         : var2;
   }

   private static String Button(Map var0, String var1) {
      return (String)var0.get(var1);
   }

   public static Map BatModClient(Map var0) {
      HashMap var1 = Maps.newHashMap();

      for (String var3 : var0.keySet()) {
         if (var3.startsWith("score_") && var3.length() > "score_".length()) {
            var1.put(
               var3.substring("score_".length()),
               u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                  (String)var0.get(var3), 1
               )
            );
         }
      }

      return var1;
   }

   public static boolean BatModClient(String var0) {
      Matcher var1 = BatModClient.matcher(var0);
      if (!var1.matches()) {
         return false;
      }

      Map var2 = CustomSpinner(var1.group(2));
      String var3 = var1.group(1);
      int var4 = !"a".equals(var3) && !"e".equals(var3) ? 1 : 0;
      return BatModClient(var2, "c", var4) != 1;
   }

   public static boolean Button(String var0) {
      return BatModClient.matcher(var0).matches();
   }

   private static Map CustomSpinner(String var0) {
      HashMap var1 = Maps.newHashMap();
      if (var0 == null) {
         return var1;
      }

      int var2 = 0;
      int var3 = -1;

      for (Matcher var4 = Button.matcher(var0);
         var4.find();
         var3 = var4.end()
      ) {
         String var5 = null;
         switch (var2++) {
            case 0:
               var5 = "x";
               break;
            case 1:
               var5 = "y";
               break;
            case 2:
               var5 = "z";
               break;
            case 3:
               var5 = "r";
         }

         if (var5 != null && var4.group(1).length() > 0) {
            var1.put(var5, var4.group(1));
         }
      }

      if (var3 < var0.length()) {
         Matcher var6 = CustomSpinner.matcher(
            var3 == -1 ? var0 : var0.substring(var3)
         );

         while (var6.find()) {
            var1.put(var6.group(1), var6.group(2));
         }
      }

      return var1;
   }
}
