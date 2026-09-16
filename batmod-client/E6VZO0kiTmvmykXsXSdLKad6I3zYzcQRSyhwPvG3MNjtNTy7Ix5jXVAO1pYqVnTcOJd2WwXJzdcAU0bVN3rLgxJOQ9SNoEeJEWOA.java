import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class E6VZO0kiTmvmykXsXSdLKad6I3zYzcQRSyhwPvG3MNjtNTy7Ix5jXVAO1pYqVnTcOJd2WwXJzdcAU0bVN3rLgxJOQ9SNoEeJEWOA
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      return "scoreboard";
   }

   @Override
   public int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      return 2;
   }

   @Override
   public String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.scoreboard.usage";
   }

   @Override
   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (!this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1, var2)) {
         if (var2.length < 1) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.scoreboard.usage");
         }

         if (var2[0].equalsIgnoreCase("objectives")) {
            if (var2.length == 1) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.objectives.usage"
               );
            }

            if (var2[1].equalsIgnoreCase("list")) {
               this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1);
            } else if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length < 4) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.objectives.add.usage"
                  );
               }

               this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length != 3) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.objectives.remove.usage"
                  );
               }

               this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(var1, var2[2]);
            } else {
               if (!var2[1].equalsIgnoreCase("setdisplay")) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.objectives.usage"
                  );
               }

               if (var2.length != 3 && var2.length != 4) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.objectives.setdisplay.usage"
                  );
               }

               this.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(var1, var2, 2);
            }
         } else if (var2[0].equalsIgnoreCase("players")) {
            if (var2.length == 1) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.players.usage"
               );
            }

            if (var2[1].equalsIgnoreCase("list")) {
               if (var2.length > 3) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.list.usage"
                  );
               }

               this.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length < 5) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.add.usage"
                  );
               }

               this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length < 5) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.remove.usage"
                  );
               }

               this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("set")) {
               if (var2.length < 5) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.set.usage"
                  );
               }

               this.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("reset")) {
               if (var2.length != 3 && var2.length != 4) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.reset.usage"
                  );
               }

               this.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("enable")) {
               if (var2.length != 4) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.enable.usage"
                  );
               }

               this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("test")) {
               if (var2.length != 5 && var2.length != 6) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.test.usage"
                  );
               }

               this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN(var1, var2, 2);
            } else {
               if (!var2[1].equalsIgnoreCase("operation")) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.usage"
                  );
               }

               if (var2.length != 7) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.players.operation.usage"
                  );
               }

               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr(var1, var2, 2);
            }
         } else {
            if (!var2[0].equalsIgnoreCase("teams")) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.scoreboard.usage");
            }

            if (var2.length == 1) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.scoreboard.teams.usage");
            }

            if (var2[1].equalsIgnoreCase("list")) {
               if (var2.length > 3) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.list.usage"
                  );
               }

               this.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("add")) {
               if (var2.length < 3) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.add.usage"
                  );
               }

               this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("remove")) {
               if (var2.length != 3) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.remove.usage"
                  );
               }

               this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("empty")) {
               if (var2.length != 3) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.empty.usage"
                  );
               }

               this.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("join")) {
               if (var2.length < 4
                  && (
                     var2.length != 3 || !(var1 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)
                  )) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.join.usage"
                  );
               }

               this.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ(var1, var2, 2);
            } else if (var2[1].equalsIgnoreCase("leave")) {
               if (var2.length < 3 && !(var1 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.leave.usage"
                  );
               }

               this.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(var1, var2, 2);
            } else {
               if (!var2[1].equalsIgnoreCase("option")) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.usage"
                  );
               }

               if (var2.length != 4 && var2.length != 5) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.option.usage"
                  );
               }

               this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1, var2, 2);
            }
         }
      }
   }

   private boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      int var3 = -1;

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var2, var4) && "*".equals(var2[var4])) {
            if (var3 >= 0) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                  "commands.scoreboard.noMultiWildcard"
               );
            }

            var3 = var4;
         }
      }

      if (var3 < 0) {
         return false;
      }

      ArrayList var12 = Lists.newArrayList(
         this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
            .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
      );
      String var5 = var2[var3];
      ArrayList var6 = Lists.newArrayList();

      for (String var8 : var12) {
         var2[var3] = var8;

         try {
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var2);
            var6.add(var8);
         } catch (idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO var11) {
            emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var10 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               var11.getMessage(), var11.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            );
            var10.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
               );
            var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var10);
         }
      }

      var2[var3] = var5;
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
         var6.size()
      );
      if (var6.size() == 0) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.scoreboard.allMatchesFailed");
      } else {
         return true;
      }
   }

   protected mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      return TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0)
         .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o();
   }

   protected fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var1, boolean var2
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var3 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var4 = var3.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1
      );
      if (var4 == null) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.objectiveNotFound", var1
         );
      } else if (var2
         && var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
            .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.objectiveReadOnly", var1
         );
      } else {
         return var4;
      }
   }

   protected hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
      String var1
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var2 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var3 = var2.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
         var1
      );
      if (var3 == null) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.teamNotFound", var1
         );
      } else {
         return var3;
      }
   }

   protected void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      String var4 = var2[var3++];
      String var5 = var2[var3++];
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var6 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W var7 = (Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W)Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         .get(var5);
      if (var7 == null) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
            "commands.scoreboard.objectives.add.wrongType", var5
         );
      }

      if (var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4) != null) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.objectives.add.alreadyExists", var4
         );
      }

      if (var4.length() > 16) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.objectives.add.tooLong", var4, 16
         );
      }

      if (var4.length() == 0) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
            "commands.scoreboard.objectives.add.usage"
         );
      }

      if (var2.length > var3) {
         String var8 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var2, var3)
            .y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY();
         if (var8.length() > 32) {
            throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
               "commands.scoreboard.objectives.add.displayTooLong", var8, 32
            );
         }

         if (var8.length() > 0) {
            var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4, var7)
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8);
         } else {
            var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4, var7);
         }
      } else {
         var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4, var7);
      }

      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, this, "commands.scoreboard.objectives.add.success", var4
      );
   }

   protected void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      String var4 = var2[var3++];
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var5 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      if (var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var4) != null) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.teams.add.alreadyExists", var4
         );
      }

      if (var4.length() > 16) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.teams.add.tooLong", var4, 16
         );
      }

      if (var4.length() == 0) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.scoreboard.teams.add.usage");
      }

      if (var2.length > var3) {
         String var6 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var2, var3)
            .y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY();
         if (var6.length() > 32) {
            throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
               "commands.scoreboard.teams.add.displayTooLong", var6, 32
            );
         }

         if (var6.length() > 0) {
            var5.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var4)
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6);
         } else {
            var5.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var4);
         }
      } else {
         var5.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var4);
      }

      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, this, "commands.scoreboard.teams.add.success", var4
      );
   }

   protected void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var4 = this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
         var2[var3++]
      );
      if (var4 != null) {
         String var5 = var2[var3++].toLowerCase();
         if (!var5.equalsIgnoreCase("color")
            && !var5.equalsIgnoreCase("friendlyfire")
            && !var5.equalsIgnoreCase("seeFriendlyInvisibles")
            && !var5.equalsIgnoreCase("nametagVisibility")
            && !var5.equalsIgnoreCase("deathMessageVisibility")) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
               "commands.scoreboard.teams.option.usage"
            );
         }

         if (var2.length == 4) {
            if (var5.equalsIgnoreCase("color")) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        true, false
                     )
                  )
               );
            }

            if (!var5.equalsIgnoreCase("friendlyfire") && !var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
               if (!var5.equalsIgnoreCase("nametagVisibility") && !var5.equalsIgnoreCase("deathMessageVisibility")) {
                  throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                     "commands.scoreboard.teams.option.usage"
                  );
               }

               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                  )
               );
            }

            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
               "commands.scoreboard.teams.option.noValue",
               var5,
               Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I((Collection)Arrays.asList("true", "false"))
            );
         }

         String var6 = var2[var3];
         if (var5.equalsIgnoreCase("color")) {
            C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr var7 = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               var6
            );
            if (var7 == null || var7.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        true, false
                     )
                  )
               );
            }

            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7);
            var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var7.toString());
            var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
                  .toString()
            );
         } else if (var5.equalsIgnoreCase("friendlyfire")) {
            if (!var6.equalsIgnoreCase("true") && !var6.equalsIgnoreCase("false")) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     (Collection)Arrays.asList("true", "false")
                  )
               );
            }

            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6.equalsIgnoreCase("true"));
         } else if (var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
            if (!var6.equalsIgnoreCase("true") && !var6.equalsIgnoreCase("false")) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     (Collection)Arrays.asList("true", "false")
                  )
               );
            }

            var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var6.equalsIgnoreCase("true"));
         } else if (var5.equalsIgnoreCase("nametagVisibility")) {
            kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN var10 = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var6
            );
            if (var10 == null) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                  )
               );
            }

            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var10);
         } else if (var5.equalsIgnoreCase("deathMessageVisibility")) {
            kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN var11 = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var6
            );
            if (var11 == null) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.scoreboard.teams.option.noValue",
                  var5,
                  Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                  )
               );
            }

            var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var11);
         }

         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.teams.option.success",
            var5,
            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(),
            var6
         );
      }
   }

   protected void uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var5 = this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
         var2[var3]
      );
      if (var5 != null) {
         var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var5);
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.teams.remove.success",
            var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
         );
      }
   }

   protected void QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      if (var2.length > var3) {
         hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var5 = this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
            var2[var3]
         );
         if (var5 == null) {
            return;
         }

         Collection var6 = var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5();
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590,
            var6.size()
         );
         if (var6.size() <= 0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.teams.list.player.empty",
               var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            );
         }

         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var7 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "commands.scoreboard.teams.list.player.count",
            var6.size(),
            var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
         );
         var7.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            );
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7);
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
               Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6.toArray())
            )
         );
      } else {
         Collection var9 = var4.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590,
            var9.size()
         );
         if (var9.size() <= 0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.teams.list.empty"
            );
         }

         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var10 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "commands.scoreboard.teams.list.count", var9.size()
         );
         var10.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            );
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var10);

         for (hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var8 : var9) {
            var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                  "commands.scoreboard.teams.list.entry",
                  var8.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(),
                  var8.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
                  var8.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5().size()
               )
            );
         }
      }
   }

   protected void kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      String var5 = var2[var3++];
      HashSet var6 = Sets.newHashSet();
      HashSet var7 = Sets.newHashSet();
      if (var1 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u && var3 == var2.length) {
         String var13 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1).C_();
         if (var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var13, var5)) {
            var6.add(var13);
         } else {
            var7.add(var13);
         }
      } else {
         while (var3 < var2.length) {
            String var8 = var2[var3++];
            if (var8.startsWith("@")) {
               for (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var10 : vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                  var1, var8
               )) {
                  String var11 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
                     var1, var10.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString()
                  );
                  if (var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var11, var5)) {
                     var6.add(var11);
                  } else {
                     var7.add(var11);
                  }
               }
            } else {
               String var9 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var8);
               if (var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var9, var5)) {
                  var6.add(var9);
               } else {
                  var7.add(var9);
               }
            }
         }
      }

      if (!var6.isEmpty()) {
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
            var6.size()
         );
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.teams.join.success",
            var6.size(),
            var5,
            Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6.toArray(new String[var6.size()]))
         );
      }

      if (!var7.isEmpty()) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.teams.join.failure",
            var7.size(),
            var5,
            Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7.toArray(new String[var7.size()]))
         );
      }
   }

   protected void y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      HashSet var5 = Sets.newHashSet();
      HashSet var6 = Sets.newHashSet();
      if (var1 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u && var3 == var2.length) {
         String var11 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1).C_();
         if (var4.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var11)) {
            var5.add(var11);
         } else {
            var6.add(var11);
         }
      } else {
         while (var3 < var2.length) {
            String var7 = var2[var3++];
            if (var7.startsWith("@")) {
               for (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var9 : vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
                  var1, var7
               )) {
                  String var10 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
                     var1, var9.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString()
                  );
                  if (var4.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var10)) {
                     var5.add(var10);
                  } else {
                     var6.add(var10);
                  }
               }
            } else {
               String var8 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var7);
               if (var4.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var8)) {
                  var5.add(var8);
               } else {
                  var6.add(var8);
               }
            }
         }
      }

      if (!var5.isEmpty()) {
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
            var5.size()
         );
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.teams.leave.success",
            var5.size(),
            Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var5.toArray(new String[var5.size()]))
         );
      }

      if (!var6.isEmpty()) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.teams.leave.failure",
            var6.size(),
            Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6.toArray(new String[var6.size()]))
         );
      }
   }

   protected void sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var5 = this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
         var2[var3]
      );
      if (var5 != null) {
         ArrayList var6 = Lists.newArrayList(var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5());
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5,
            var6.size()
         );
         if (var6.isEmpty()) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.teams.empty.alreadyEmpty",
               var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            );
         }

         for (String var8 : var6) {
            var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8, var5);
         }

         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.teams.empty.success",
            var6.size(),
            var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
         );
      }
   }

   protected void y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String var2
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var3 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var4 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2, false
      );
      var3.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var4);
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, this, "commands.scoreboard.objectives.remove.success", var2
      );
   }

   protected void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var2 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      Collection var3 = var2.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
      if (var3.size() <= 0) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.objectives.list.empty"
         );
      }

      emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var4 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
         "commands.scoreboard.objectives.list.count", var3.size()
      );
      var4.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         );
      var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4);

      for (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var6 : var3) {
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "commands.scoreboard.objectives.list.entry",
               var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
               var6.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(),
               var6.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
            )
         );
      }
   }

   protected void lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      String var5 = var2[var3++];
      int var6 = mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(
         var5
      );
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var7 = null;
      if (var2.length == 4) {
         var7 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2[var3], false);
      }

      if (var6 < 0) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.objectives.setdisplay.invalidSlot", var5
         );
      }

      var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6, var7);
      if (var7 != null) {
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.objectives.setdisplay.successSet",
            mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               var6
            ),
            var7.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
      } else {
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.objectives.setdisplay.successCleared",
            mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               var6
            )
         );
      }
   }

   protected void agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      if (var2.length > var3) {
         String var5 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2[var3]);
         Map var6 = var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var5);
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590,
            var6.size()
         );
         if (var6.size() <= 0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.players.list.player.empty", var5
            );
         }

         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var7 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "commands.scoreboard.players.list.player.count", var6.size(), var5
         );
         var7.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            );
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7);

         for (ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var9 : var6.values()) {
            var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                  "commands.scoreboard.players.list.player.entry",
                  var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
                  var9.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                     .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(),
                  var9.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                     .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               )
            );
         }
      } else {
         Collection var10 = var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590,
            var10.size()
         );
         if (var10.size() <= 0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.players.list.empty"
            );
         }

         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var11 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "commands.scoreboard.players.list.count", var10.size()
         );
         var11.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            );
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var11);
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
               Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var10.toArray())
            )
         );
      }
   }

   protected void uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      String var4 = var2[var3 - 1];
      int var5 = var3;
      String var6 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2[var3++]);
      if (var6.length() > 40) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.players.name.tooLong", var6, 40
         );
      }

      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var7 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2[var3++], true
      );
      int var8 = var4.equalsIgnoreCase("set")
         ? Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2[var3++])
         : Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2[var3++], 0);
      if (var2.length > var3) {
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var9 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var1, var2[var5]
         );

         try {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var10 = vphUrnh98xLudN5HSO36Mg1NeLo6iMGHXeBJODlR0dXu1Iy4QBCNdQaRBKdgHi8eTPXzkTfx7fGnqf94Zku3AAWUqmNv6ZIg8pgJ.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, var3)
            );
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var11 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            var9.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var11);
            if (!nYYaE52De6WnZadOQMn3x1Vq1U3OwG9G3CxVDPNs0kMrvQwgYpMPQM8AX5cqVJGQXTwCbGgIszyEtZz4a6cJywXSsbpZhMg4Jb41.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var10, var11, true
            )) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                  "commands.scoreboard.players.set.tagMismatch", var6
               );
            }
         } catch (HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a var12) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.players.set.tagError", var12.getMessage()
            );
         }
      }

      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var16 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var17 = var16.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var6, var7
      );
      if (var4.equalsIgnoreCase("set")) {
         var17.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var8);
      } else if (var4.equalsIgnoreCase("add")) {
         var17.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8);
      } else {
         var17.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var8);
      }

      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1,
         this,
         "commands.scoreboard.players.set.success",
         var7.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
         var6,
         var17.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
      );
   }

   protected void Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      String var5 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2[var3++]);
      if (var2.length > var3) {
         fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var6 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var2[var3++], false
         );
         var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var5, var6);
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.players.resetscore.success",
            var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
            var5
         );
      } else {
         var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var5, (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi)null
         );
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1, this, "commands.scoreboard.players.reset.success", var5
         );
      }
   }

   protected void aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      String var5 = PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1, var2[var3++]);
      if (var5.length() > 40) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.players.name.tooLong", var5, 40
         );
      }

      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var6 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2[var3], false
      );
      if (var6.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
         != Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         )
       {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.players.enable.noTrigger",
            var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
      }

      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var7 = var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var5, var6
      );
      var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false);
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1,
         this,
         "commands.scoreboard.players.enable.success",
         var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
         var5
      );
   }

   protected void LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      String var5 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2[var3++]);
      if (var5.length() > 40) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.players.name.tooLong", var5, 40
         );
      }

      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var6 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2[var3++], false
      );
      if (!var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var5, var6)) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.players.test.notFound",
            var6.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
            var5
         );
      }

      int var7 = var2[var3].equals("*")
         ? Integer.MIN_VALUE
         : Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2[var3]);
      var3++;
      int var8 = var3 < var2.length && !var2[var3].equals("*")
         ? Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2[var3], var7)
         : Integer.MAX_VALUE;
      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var9 = var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var5, var6
      );
      if (var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() >= var7
         && var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() <= var8) {
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            this,
            "commands.scoreboard.players.test.success",
            var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
            var7,
            var8
         );
      } else {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.players.test.failed",
            var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
            var7,
            var8
         );
      }
   }

   protected void G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2, int var3
   ) {
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var4 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      String var5 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2[var3++]);
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var6 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2[var3++], true
      );
      String var7 = var2[var3++];
      String var8 = uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var1, var2[var3++]);
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var9 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2[var3], false
      );
      if (var5.length() > 40) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.players.name.tooLong", var5, 40
         );
      }

      if (var8.length() > 40) {
         throw new jC6JIzlb1HgKUI3WJNUnz4LSBH0pt3269asQ4RGoprOIfEFvKH9K70vgTPVXxmLPkTU59L0YRCOOmYvpmtDQNJbTjyVdkMkZmdkE(
            "commands.scoreboard.players.name.tooLong", var8, 40
         );
      }

      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var10 = var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var5, var6
      );
      if (!var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8, var9)) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.scoreboard.players.operation.notFound",
            var9.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
            var8
         );
      }

      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var11 = var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var8, var9
      );
      if (var7.equals("+=")) {
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               + var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
      } else if (var7.equals("-=")) {
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               - var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
      } else if (var7.equals("*=")) {
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               * var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
      } else if (var7.equals("/=")) {
         if (var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() != 0) {
            var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
               var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
                  / var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
            );
         }
      } else if (var7.equals("%=")) {
         if (var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() != 0) {
            var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
               var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
                  % var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
            );
         }
      } else if (var7.equals("=")) {
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
      } else if (var7.equals("<")) {
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            Math.min(
               var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
               var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
            )
         );
      } else if (var7.equals(">")) {
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            Math.max(
               var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
               var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
            )
         );
      } else {
         if (!var7.equals("><")) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.scoreboard.players.operation.invalidOperation", var7
            );
         }

         int var12 = var10.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
         var10.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var11.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
         );
         var11.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var12);
      }

      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, this, "commands.scoreboard.players.operation.success"
      );
   }

   @Override
   public List Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      if (var2.length == 1) {
         return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, "objectives", "players", "teams");
      }

      if (var2[0].equalsIgnoreCase("objectives")) {
         if (var2.length == 2) {
            return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2, "list", "add", "remove", "setdisplay"
            );
         }

         if (var2[1].equalsIgnoreCase("add")) {
            if (var2.length == 4) {
               Set var4 = Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                  .keySet();
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, var4);
            }
         } else if (var2[1].equalsIgnoreCase("remove")) {
            if (var2.length == 3) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false)
               );
            }
         } else if (var2[1].equalsIgnoreCase("setdisplay")) {
            if (var2.length == 3) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2,
                  mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
               );
            }

            if (var2.length == 4) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false)
               );
            }
         }
      } else if (var2[0].equalsIgnoreCase("players")) {
         if (var2.length == 2) {
            return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2, "set", "add", "remove", "reset", "list", "enable", "test", "operation"
            );
         }

         if (!var2[1].equalsIgnoreCase("set") && !var2[1].equalsIgnoreCase("add") && !var2[1].equalsIgnoreCase("remove") && !var2[1].equalsIgnoreCase("reset")) {
            if (var2[1].equalsIgnoreCase("enable")) {
               if (var2.length == 3) {
                  return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var2,
                     TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                        .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
                  );
               }

               if (var2.length == 4) {
                  return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var2, this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590()
                  );
               }
            } else if (!var2[1].equalsIgnoreCase("list") && !var2[1].equalsIgnoreCase("test")) {
               if (var2[1].equalsIgnoreCase("operation")) {
                  if (var2.length == 3) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2,
                        this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                           .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
                     );
                  }

                  if (var2.length == 4) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(true)
                     );
                  }

                  if (var2.length == 5) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><"
                     );
                  }

                  if (var2.length == 6) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2,
                        TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                           .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
                     );
                  }

                  if (var2.length == 7) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false)
                     );
                  }
               }
            } else {
               if (var2.length == 3) {
                  return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var2,
                     this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                        .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
                  );
               }

               if (var2.length == 4 && var2[1].equalsIgnoreCase("test")) {
                  return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var2, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(false)
                  );
               }
            }
         } else {
            if (var2.length == 3) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2,
                  TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                     .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
               );
            }

            if (var2.length == 4) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2, this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(true)
               );
            }
         }
      } else if (var2[0].equalsIgnoreCase("teams")) {
         if (var2.length == 2) {
            return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               var2, "add", "remove", "join", "leave", "empty", "list", "option"
            );
         }

         if (var2[1].equalsIgnoreCase("join")) {
            if (var2.length == 3) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2,
                  this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                     .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
               );
            }

            if (var2.length >= 4) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2,
                  TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                     .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
               );
            }
         } else {
            if (var2[1].equalsIgnoreCase("leave")) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2,
                  TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                     .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
               );
            }

            if (!var2[1].equalsIgnoreCase("empty") && !var2[1].equalsIgnoreCase("list") && !var2[1].equalsIgnoreCase("remove")) {
               if (var2[1].equalsIgnoreCase("option")) {
                  if (var2.length == 3) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2,
                        this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                           .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                     );
                  }

                  if (var2.length == 4) {
                     return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var2, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility"
                     );
                  }

                  if (var2.length == 5) {
                     if (var2[3].equalsIgnoreCase("color")) {
                        return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                           var2,
                           C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                              true, false
                           )
                        );
                     }

                     if (var2[3].equalsIgnoreCase("nametagVisibility") || var2[3].equalsIgnoreCase("deathMessageVisibility")) {
                        return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                           var2,
                           kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
                        );
                     }

                     if (var2[3].equalsIgnoreCase("friendlyfire") || var2[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                        return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, "true", "false");
                     }
                  }
               }
            } else if (var2.length == 3) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var2,
                  this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                     .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
               );
            }
         }
      }

      return null;
   }

   protected List Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(boolean var1) {
      Collection var2 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
      ArrayList var3 = Lists.newArrayList();

      for (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var5 : var2) {
         if (!var1
            || !var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
               .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()) {
            var3.add(var5.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW());
         }
      }

      return var3;
   }

   protected List uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      Collection var1 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
      ArrayList var2 = Lists.newArrayList();

      for (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var4 : var1) {
         if (var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
            == Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
            )
          {
            var2.add(var4.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW());
         }
      }

      return var2;
   }

   @Override
   public boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String[] var1, int var2) {
      return !var1[0].equalsIgnoreCase("players")
         ? (var1[0].equalsIgnoreCase("teams") ? var2 == 2 : false)
         : (var1.length > 1 && var1[1].equalsIgnoreCase("operation") ? var2 == 2 || var2 == 5 : var2 == 2);
   }
}
