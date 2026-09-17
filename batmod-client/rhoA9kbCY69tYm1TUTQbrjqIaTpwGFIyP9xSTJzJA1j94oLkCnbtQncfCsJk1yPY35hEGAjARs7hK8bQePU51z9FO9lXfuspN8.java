import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class rhoA9kbCY69tYm1TUTQbrjqIaTpwGFIyP9xSTJzJA1j94oLkCnbtQncfCsJk1yPY35hEGAjARs7hK8bQePU51z9FO9lXfuspN8
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "stats";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.stats.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 1) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.usage");
      }

      boolean var3;
      if (var2[0].equals("entity")) {
         var3 = false;
      } else {
         if (!var2[0].equals("block")) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.usage");
         }

         var3 = true;
      }

      int var4;
      if (var3) {
         if (var2.length < 5) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.block.usage");
         }

         var4 = 4;
      } else {
         if (var2.length < 3) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.entity.usage");
         }

         var4 = 2;
      }

      String var5 = var2[var4++];
      if ("set".equals(var5)) {
         if (var2.length < var4 + 3) {
            if (var4 == 5) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.block.set.usage");
            }

            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.entity.set.usage");
         }
      } else {
         if (!"clear".equals(var5)) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.usage");
         }

         if (var2.length < var4 + 1) {
            if (var4 == 5) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
                  "commands.stats.block.clear.usage"
               );
            }

            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.stats.entity.clear.usage");
         }
      }

      OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE var6 = OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.BatModClient(
         var2[var4++]
      );
      if (var6 == null) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.stats.failed");
      }

      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var7 = var1.ButtonAction();
      xeMyBhVggGCvVCWrJHq0hglLqe93TKHaXItqzxqydOQsgV7W6Bv5pNkq3JbGh5TCuiOeAWzBpKRWI6qMs8bMrT5KGH2QezKAFQAe var8;
      if (var3) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var9 = BatModClient(
            var1, var2, 1, false
         );
         gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var10 = var7.BatModClient(
            var9
         );
         if (var10 == null) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.stats.noCompatibleBlock",
               var9.BatModProgressBar(),
               var9.ColorChooser(),
               var9.IntegerSpinner()
            );
         }

         if (var10 instanceof SPlMGBrPf17iPJe0sE898OFNPBq9WEFb7JV0rQbonbi81IjDR9X7cPN9ERZXcvmXoLmHHVzktJOg4VWpNyKUIJmrNC7BagyHSx0Q) {
            var8 = ((SPlMGBrPf17iPJe0sE898OFNPBq9WEFb7JV0rQbonbi81IjDR9X7cPN9ERZXcvmXoLmHHVzktJOg4VWpNyKUIJmrNC7BagyHSx0Q)var10)
               .Button();
         } else {
            if (!(var10 instanceof dhG69zFoSW1qJlp08LZptdfLxV5f5nrYnDe8DAxtqiygNZGlH57pbgM6COLtbpbDA10gV51ML6eNhmX0h5VTTe0KNZ98NrEJkgQr)) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                  "commands.stats.noCompatibleBlock",
                  var9.BatModProgressBar(),
                  var9.ColorChooser(),
                  var9.IntegerSpinner()
               );
            }

            var8 = ((dhG69zFoSW1qJlp08LZptdfLxV5f5nrYnDe8DAxtqiygNZGlH57pbgM6COLtbpbDA10gV51ML6eNhmX0h5VTTe0KNZ98NrEJkgQr)var10)
               .CustomSpinner();
         }
      } else {
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var14 = Button(
            var1, var2[1]
         );
         var8 = var14.JavaVersion();
      }

      if ("set".equals(var5)) {
         String var15 = var2[var4++];
         String var17 = var2[var4];
         if (var15.length() == 0 || var17.length() == 0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.stats.failed");
         }

         xeMyBhVggGCvVCWrJHq0hglLqe93TKHaXItqzxqydOQsgV7W6Bv5pNkq3JbGh5TCuiOeAWzBpKRWI6qMs8bMrT5KGH2QezKAFQAe.BatModClient(
            var8, var6, var15, var17
         );
         BatModClient(
            var1,
            this,
            "commands.stats.success",
            var6.Button(),
            var17,
            var15
         );
      } else if ("clear".equals(var5)) {
         xeMyBhVggGCvVCWrJHq0hglLqe93TKHaXItqzxqydOQsgV7W6Bv5pNkq3JbGh5TCuiOeAWzBpKRWI6qMs8bMrT5KGH2QezKAFQAe.BatModClient(
            var8, var6, (String)null, (String)null
         );
         BatModClient(
            var1, this, "commands.stats.cleared", var6.Button()
         );
      }

      if (var3) {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var16 = BatModClient(
            var1, var2, 1, false
         );
         gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var18 = var7.BatModClient(
            var16
         );
         var18.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
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
                              (var2.length != 4 || !var2[0].equals("entity")) && (var2.length != 6 || !var2[0].equals("block"))
                                 ? (
                                    var2.length == 6 && var2[0].equals("entity") || var2.length == 8 && var2[0].equals("block")
                                       ? BatModClient(
                                          var2, this.Spinner()
                                       )
                                       : null
                                 )
                                 : BatModClient(
                                    var2,
                                    OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.CustomSpinner()
                                 )
                           )
                           : BatModClient(var2, "set", "clear")
                     )
               )
         );
   }

   protected String[] ButtonAction() {
      return TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
   }

   protected List Spinner() {
      Collection var1 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .BatModClient(0)
         .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
         .BatModClient();
      ArrayList var2 = Lists.newArrayList();

      for (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var4 : var1) {
         if (!var4.CustomSpinner()
            .Button()) {
            var2.add(var4.Button());
         }
      }

      return var2;
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var1.length > 0 && var1[0].equals("entity") && var2 == 1;
   }
}
