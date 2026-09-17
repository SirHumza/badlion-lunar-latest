import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class csixeUH1jY6FeJWY8zoSXjpFKJ6hUR2WdogDaiQnEEkmiHbL7MDCbZkwGQgktfVor3XRy3q1It5xqvvZOY11i4sKW6dEIt3Fv7sT
   extends gz4TF3kWVpjkEyKphK9tGhaH9NZsm4idteBg3ApDwNo4MBWQUvoi2kQHcXwPJoB8lPmeiFuan1dkde6qrJTVlpSbXAqXeAeUtwP {
   private static final Logger Button = LogManager.getLogger();
   private mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT CustomSpinner;
   private YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm ButtonAction;

   public csixeUH1jY6FeJWY8zoSXjpFKJ6hUR2WdogDaiQnEEkmiHbL7MDCbZkwGQgktfVor3XRy3q1It5xqvvZOY11i4sKW6dEIt3Fv7sT() {
      this("scoreboard");
   }

   public csixeUH1jY6FeJWY8zoSXjpFKJ6hUR2WdogDaiQnEEkmiHbL7MDCbZkwGQgktfVor3XRy3q1It5xqvvZOY11i4sKW6dEIt3Fv7sT(String var1) {
      super(var1);
   }

   public void BatModClient(
      mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT var1
   ) {
      this.CustomSpinner = var1;
      if (this.ButtonAction != null) {
         this.BatModClient(
            this.ButtonAction
         );
      }
   }

   @Override
   public void BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      if (this.CustomSpinner == null) {
         this.ButtonAction = var1;
      } else {
         this.Button(
            var1.CustomSpinner("Objectives", 10)
         );
         this.CustomSpinner(
            var1.CustomSpinner("PlayerScores", 10)
         );
         if (var1.Button("DisplaySlots", 10)) {
            this.Button(
               var1.BatModInstallerMain("DisplaySlots")
            );
         }

         if (var1.Button("Teams", 9)) {
            this.BatModClient(
               var1.CustomSpinner("Teams", 10)
            );
         }
      }
   }

   protected void BatModClient(
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var1
   ) {
      for (int var2 = 0; var2 < var1.Spinner(); var2++) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = var1.Button(
            var2
         );
         String var4 = var3.IntegerSpinner("Name");
         if (var4.length() > 16) {
            var4 = var4.substring(0, 16);
         }

         hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var5 = this.CustomSpinner
            .ButtonAction(var4);
         String var6 = var3.IntegerSpinner("DisplayName");
         if (var6.length() > 32) {
            var6 = var6.substring(0, 32);
         }

         var5.BatModClient(var6);
         if (var3.Button("TeamColor", 8)) {
            var5.BatModClient(
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Button(
                  var3.IntegerSpinner("TeamColor")
               )
            );
         }

         var5.Button(
            var3.IntegerSpinner("Prefix")
         );
         var5.CustomSpinner(
            var3.IntegerSpinner("Suffix")
         );
         if (var3.Button("AllowFriendlyFire", 99)) {
            var5.BatModClient(
               var3.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("AllowFriendlyFire")
            );
         }

         if (var3.Button("SeeFriendlyInvisibles", 99)) {
            var5.Button(
               var3.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("SeeFriendlyInvisibles")
            );
         }

         if (var3.Button("NameTagVisibility", 8)) {
            kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN var7 = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.BatModClient(
               var3.IntegerSpinner("NameTagVisibility")
            );
            if (var7 != null) {
               var5.BatModClient(var7);
            }
         }

         if (var3.Button("DeathMessageVisibility", 8)) {
            kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN var8 = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.BatModClient(
               var3.IntegerSpinner("DeathMessageVisibility")
            );
            if (var8 != null) {
               var5.Button(var8);
            }
         }

         this.BatModClient(
            var5, var3.CustomSpinner("Players", 8)
         );
      }
   }

   protected void BatModClient(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1,
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var2
   ) {
      for (int var3 = 0; var3 < var2.Spinner(); var3++) {
         this.CustomSpinner
            .BatModClient(
               var2.Checkbox(var3),
               var1.BatModClient()
            );
      }
   }

   protected void Button(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      for (int var2 = 0; var2 < 19; var2++) {
         if (var1.Button("slot_" + var2, 8)) {
            String var3 = var1.IntegerSpinner("slot_" + var2);
            fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var4 = this.CustomSpinner
               .BatModClient(var3);
            this.CustomSpinner
               .BatModClient(var2, var4);
         }
      }
   }

   protected void Button(
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var1
   ) {
      for (int var2 = 0; var2 < var1.Spinner(); var2++) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = var1.Button(
            var2
         );
         Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W var4 = (Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W)Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W.BatModClient
            .get(var3.IntegerSpinner("CriteriaName"));
         if (var4 != null) {
            String var5 = var3.IntegerSpinner("Name");
            if (var5.length() > 16) {
               var5 = var5.substring(0, 16);
            }

            fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var6 = this.CustomSpinner
               .BatModClient(var5, var4);
            var6.BatModClient(
               var3.IntegerSpinner("DisplayName")
            );
            var6.BatModClient(
               TebVqYK1KaLjhLD2Qq8IFPn4tPqj9QJhd7tL9o1nZpbciP0RUBUmzaXfkBTqJpKZEAsA1igdAW5ZExSEHCkfc5i9iJnA6YDhVuht.BatModClient(
                  var3.IntegerSpinner("RenderType")
               )
            );
         }
      }
   }

   protected void CustomSpinner(
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var1
   ) {
      for (int var2 = 0; var2 < var1.Spinner(); var2++) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var3 = var1.Button(
            var2
         );
         fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var4 = this.CustomSpinner
            .BatModClient(
               var3.IntegerSpinner("Objective")
            );
         String var5 = var3.IntegerSpinner("Name");
         if (var5.length() > 40) {
            var5 = var5.substring(0, 40);
         }

         ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var6 = this.CustomSpinner
            .Button(var5, var4);
         var6.CustomSpinner(
            var3.Checkbox("Score")
         );
         if (var3.CustomSpinner("Locked")) {
            var6.BatModClient(
               var3.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA("Locked")
            );
         }
      }
   }

   @Override
   public void CustomSpinner(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      if (this.CustomSpinner == null) {
         Button.warn(
            "Tried to save scoreboard without having a scoreboard..."
         );
      } else {
         var1.BatModClient(
            "Objectives", this.Button()
         );
         var1.BatModClient(
            "PlayerScores", this.CustomSpinner()
         );
         var1.BatModClient(
            "Teams", this.BatModClient()
         );
         this.ButtonAction(var1);
      }
   }

   protected fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ BatModClient() {
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var1 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var3 : this.CustomSpinner
         .Spinner()) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         var4.BatModClient(
            "Name", var3.BatModClient()
         );
         var4.BatModClient(
            "DisplayName", var3.Button()
         );
         if (var3.TextField()
               .BatModClient()
            >= 0) {
            var4.BatModClient(
               "TeamColor",
               var3.TextField()
                  .ButtonAction()
            );
         }

         var4.BatModClient(
            "Prefix", var3.ButtonAction()
         );
         var4.BatModClient(
            "Suffix", var3.Spinner()
         );
         var4.BatModClient(
            "AllowFriendlyFire", var3.Checkbox()
         );
         var4.BatModClient(
            "SeeFriendlyInvisibles", var3.ProgressBar()
         );
         var4.BatModClient(
            "NameTagVisibility",
            var3.BatModProgressBar().Spinner
         );
         var4.BatModClient(
            "DeathMessageVisibility",
            var3.ColorChooser().Spinner
         );
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var5 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

         for (String var7 : var3.CustomSpinner()) {
            var5.BatModClient(
               new Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1(var7)
            );
         }

         var4.BatModClient("Players", var5);
         var1.BatModClient(var4);
      }

      return var1;
   }

   protected void ButtonAction(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
      boolean var3 = false;

      for (int var4 = 0; var4 < 19; var4++) {
         fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var5 = this.CustomSpinner
            .BatModClient(var4);
         if (var5 != null) {
            var2.BatModClient(
               "slot_" + var4, var5.Button()
            );
            var3 = true;
         }
      }

      if (var3) {
         var1.BatModClient("DisplaySlots", var2);
      }
   }

   protected fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ Button() {
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var1 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var3 : this.CustomSpinner
         .BatModClient()) {
         if (var3.CustomSpinner() != null) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            var4.BatModClient(
               "Name", var3.Button()
            );
            var4.BatModClient(
               "CriteriaName",
               var3.CustomSpinner()
                  .BatModClient()
            );
            var4.BatModClient(
               "DisplayName", var3.ButtonAction()
            );
            var4.BatModClient(
               "RenderType",
               var3.Spinner()
                  .BatModClient()
            );
            var1.BatModClient(var4);
         }
      }

      return var1;
   }

   protected fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ CustomSpinner() {
      fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var1 = new fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ();

      for (ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var3 : this.CustomSpinner
         .CustomSpinner()) {
         if (var3.CustomSpinner() != null) {
            YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
            var4.BatModClient(
               "Name", var3.ButtonAction()
            );
            var4.BatModClient(
               "Objective",
               var3.CustomSpinner()
                  .Button()
            );
            var4.BatModClient(
               "Score", var3.Button()
            );
            var4.BatModClient(
               "Locked", var3.Checkbox()
            );
            var1.BatModClient(var4);
         }
      }

      return var1;
   }
}
