import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class z5KWbvozsfyZAEUXROtfE5IQ7n0egHVHcgFnqIVsdqmTq72WQQEauG7L7yX6jAqbxLs56patOvxzwCmElQnuk0DVI0VNTwVXPM8B
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   private static final Map BatModClient = Maps.newHashMap();

   @Override
   public String CustomSpinner() {
      return "replaceitem";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.replaceitem.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 1) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.replaceitem.usage");
      }

      boolean var3;
      if (var2[0].equals("entity")) {
         var3 = false;
      } else {
         if (!var2[0].equals("block")) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.replaceitem.usage");
         }

         var3 = true;
      }

      int var4;
      if (var3) {
         if (var2.length < 6) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.replaceitem.block.usage");
         }

         var4 = 4;
      } else {
         if (var2.length < 4) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.replaceitem.entity.usage");
         }

         var4 = 2;
      }

      int var5 = this.Spinner(var2[var4++]);

      q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 var6;
      try {
         var6 = Checkbox(var1, var2[var4]);
      } catch (AC7DHVQ77uvXF5QCLMnJsah5UmUnPopMXXEx6PtFJK7ErlEaGWbe3YW49QICJyfOJolaoUELWqAzC1t1DKTl1VKnsy46hxAXVYxR var15) {
         if (c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
               var2[var4]
            )
            != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
            )
          {
            throw var15;
         }

         var6 = null;
      }

      var4++;
      int var7 = var2.length > var4
         ? BatModClient(var2[var4++], 1, 64)
         : 1;
      int var8 = var2.length > var4 ? BatModClient(var2[var4++]) : 0;
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var9 = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65(
         var6, var7, var8
      );
      if (var2.length > var4) {
         String var10 = BatModClient(var1, var2, var4)
            .BatModProgressBar();

         try {
            var9.ButtonAction(
               vphUrnh98xLudN5HSO36Mg1NeLo6iMGHXeBJODlR0dXu1Iy4QBCNdQaRBKdgHi8eTPXzkTfx7fGnqf94Zku3AAWUqmNv6ZIg8pgJ.BatModClient(
                  var10
               )
            );
         } catch (HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a var14) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.replaceitem.tagError", var14.getMessage()
            );
         }
      }

      if (var9.BatModClient() == null) {
         var9 = null;
      }

      if (var3) {
         var1.BatModClient(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.ButtonAction,
            0
         );
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var18 = BatModClient(
            var1, var2, 1, false
         );
         xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var11 = var1.ButtonAction();
         gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var12 = var11.BatModClient(
            var18
         );
         if (var12 == null || !(var12 instanceof r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.replaceitem.noContainer",
               var18.BatModProgressBar(),
               var18.ColorChooser(),
               var18.IntegerSpinner()
            );
         }

         r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr var13 = (r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)var12;
         if (var5 >= 0 && var5 < var13.ColorChooser()) {
            var13.CustomSpinner(var5, var9);
         }
      } else {
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var19 = Button(
            var1, var2[1]
         );
         var1.BatModClient(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.ButtonAction,
            0
         );
         if (var19 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u) {
            ((EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)var19)
               .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
               .CustomSpinner();
         }

         if (!var19.Button(var5, var9)) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.replaceitem.failed",
               var5,
               var7,
               var9 == null ? "Air" : var9.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
            );
         }

         if (var19 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u) {
            ((EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)var19)
               .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
               .CustomSpinner();
         }
      }

      var1.BatModClient(
         OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.ButtonAction,
         var7
      );
      BatModClient(
         var1,
         this,
         "commands.replaceitem.success",
         var5,
         var7,
         var9 == null ? "Air" : var9.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4()
      );
   }

   private int Spinner(String var1) {
      if (!BatModClient.containsKey(var1)) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.generic.parameter.invalid", var1
         );
      } else {
         return (Integer)BatModClient.get(var1);
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(var2, "entity", "block")
         : (
            var2.length == 2 && var2[0].equals("entity")
               ? BatModClient(
                  var2, this.ButtonAction()
               )
               : (
                  var2.length >= 2 && var2.length <= 4 && var2[0].equals("block")
                     ? BatModClient(var2, 1, var3)
                     : (
                        (var2.length != 3 || !var2[0].equals("entity")) && (var2.length != 5 || !var2[0].equals("block"))
                           ? (
                              var2.length == 4 && var2[0].equals("entity") || var2.length == 6 && var2[0].equals("block")
                                 ? BatModClient(
                                    var2,
                                    q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient
                                       .CustomSpinner()
                                 )
                                 : null
                           )
                           : BatModClient(
                              var2, BatModClient.keySet()
                           )
                     )
               )
         );
   }

   protected String[] ButtonAction() {
      return TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var1.length > 0 && var1[0].equals("entity") && var2 == 1;
   }

   static {
      for (int var0 = 0; var0 < 54; var0++) {
         BatModClient.put("slot.container." + var0, var0);
      }

      for (int var1 = 0; var1 < 9; var1++) {
         BatModClient.put("slot.hotbar." + var1, var1);
      }

      for (int var2 = 0; var2 < 27; var2++) {
         BatModClient.put("slot.inventory." + var2, 9 + var2);
      }

      for (int var3 = 0; var3 < 27; var3++) {
         BatModClient.put("slot.enderchest." + var3, 200 + var3);
      }

      for (int var4 = 0; var4 < 8; var4++) {
         BatModClient.put("slot.villager." + var4, 300 + var4);
      }

      for (int var5 = 0; var5 < 15; var5++) {
         BatModClient.put("slot.horse." + var5, 500 + var5);
      }

      BatModClient.put("slot.weapon", 99);
      BatModClient.put("slot.armor.head", 103);
      BatModClient.put("slot.armor.chest", 102);
      BatModClient.put("slot.armor.legs", 101);
      BatModClient.put("slot.armor.feet", 100);
      BatModClient.put("slot.horse.saddle", 400);
      BatModClient.put("slot.horse.armor", 401);
      BatModClient.put("slot.horse.chest", 499);
   }
}
