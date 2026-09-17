import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class mA9SRkjMIZ2jF5rmlgkPy5zMD2pT0z78zyl5whvUIYjXuxODDA3J5mbvqnR5KGRww9GC8BfGe5gwcpvB28lXdUAbluQYDFA9rwmT {
   private final Map BatModClient = Maps.newHashMap();
   private final Map Button = Maps.newHashMap();
   private final Map CustomSpinner = Maps.newHashMap();
   private final fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi[] ButtonAction = new fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi[19];
   private final Map Spinner = Maps.newHashMap();
   private final Map Checkbox = Maps.newHashMap();
   private static String[] ProgressBar = null;

   public fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi BatModClient(
      String var1
   ) {
      return (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi)this.BatModClient
         .get(var1);
   }

   public fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi BatModClient(
      String var1, Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W var2
   ) {
      if (var1.length() > 16) {
         throw new IllegalArgumentException("The objective name '" + var1 + "' is too long!");
      }

      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var3 = this.BatModClient(
         var1
      );
      if (var3 != null) {
         throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
      }

      var3 = new fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi(this, var1, var2);
      List var4 = (List)this.Button.get(var2);
      if (var4 == null) {
         var4 = Lists.newArrayList();
         this.Button.put(var2, var4);
      }

      var4.add(var3);
      this.BatModClient.put(var1, var3);
      this.CustomSpinner(var3);
      return var3;
   }

   public Collection BatModClient(
      Io2KyRd7fQBsNKa0hB5AWx30XWaMa0QWlpZtY318NX8dcxZP8APqY6i8mmOxR2lVUwQCUg5d5bLAdkubjOgbE9w22IQZYHQ5JK0W var1
   ) {
      Collection var2 = (Collection)this.Button.get(var1);
      return var2 == null ? Lists.newArrayList() : Lists.newArrayList(var2);
   }

   public boolean BatModClient(
      String var1, fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var2
   ) {
      Map var3 = (Map)this.CustomSpinner.get(var1);
      if (var3 == null) {
         return false;
      }

      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var4 = (ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h)var3.get(
         var2
      );
      return var4 != null;
   }

   public ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h Button(
      String var1, fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var2
   ) {
      if (var1.length() > 40) {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      }

      Map var3 = (Map)this.CustomSpinner.get(var1);
      if (var3 == null) {
         var3 = Maps.newHashMap();
         this.CustomSpinner.put(var1, var3);
      }

      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var4 = (ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h)var3.get(
         var2
      );
      if (var4 == null) {
         var4 = new ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h(this, var2, var1);
         var3.put(var2, var4);
      }

      return var4;
   }

   public Collection BatModClient(
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var1
   ) {
      ArrayList var2 = Lists.newArrayList();

      for (Map var4 : this.CustomSpinner.values()) {
         ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var5 = (ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h)var4.get(
            var1
         );
         if (var5 != null) {
            var2.add(var5);
         }
      }

      Collections.sort(
         var2,
         ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h.BatModClient
      );
      return var2;
   }

   public Collection BatModClient() {
      return this.BatModClient.values();
   }

   public Collection Button() {
      return this.CustomSpinner.keySet();
   }

   public void CustomSpinner(
      String var1, fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var2
   ) {
      if (var2 == null) {
         Map var3 = (Map)this.CustomSpinner.remove(var1);
         if (var3 != null) {
            this.ProgressBar(var1);
         }
      } else {
         Map var6 = (Map)this.CustomSpinner.get(var1);
         if (var6 != null) {
            ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var4 = (ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h)var6.remove(
               var2
            );
            if (var6.size() < 1) {
               Map var5 = (Map)this.CustomSpinner.remove(var1);
               if (var5 != null) {
                  this.ProgressBar(var1);
               }
            } else if (var4 != null) {
               this.ButtonAction(var1, var2);
            }
         }
      }
   }

   public Collection CustomSpinner() {
      Collection var1 = this.CustomSpinner.values();
      ArrayList var2 = Lists.newArrayList();

      for (Map var4 : var1) {
         var2.addAll(var4.values());
      }

      return var2;
   }

   public Map Button(String var1) {
      Map var2 = (Map)this.CustomSpinner.get(var1);
      if (var2 == null) {
         var2 = Maps.newHashMap();
      }

      return var2;
   }

   public void Button(
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var1
   ) {
      if (var1 != null) {
         this.BatModClient
            .remove(var1.Button());

         for (int var2 = 0; var2 < 19; var2++) {
            if (this.BatModClient(var2) == var1) {
               this.BatModClient(
                  var2, (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi)null
               );
            }
         }

         List var5 = (List)this.Button
            .get(var1.CustomSpinner());
         if (var5 != null) {
            var5.remove(var1);
         }

         for (Map var4 : this.CustomSpinner.values()) {
            var4.remove(var1);
         }

         this.Spinner(var1);
      }
   }

   public void BatModClient(
      int var1, fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var2
   ) {
      this.ButtonAction[var1] = var2;
   }

   public fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi BatModClient(
      int var1
   ) {
      return this.ButtonAction[var1];
   }

   public hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I CustomSpinner(
      String var1
   ) {
      return (hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I)this.Spinner
         .get(var1);
   }

   public hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I ButtonAction(
      String var1
   ) {
      if (var1.length() > 16) {
         throw new IllegalArgumentException("The team name '" + var1 + "' is too long!");
      }

      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var2 = this.CustomSpinner(
         var1
      );
      if (var2 != null) {
         throw new IllegalArgumentException("A team with the name '" + var1 + "' already exists!");
      }

      var2 = new hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I(this, var1);
      this.Spinner.put(var1, var2);
      this.Button(var2);
      return var2;
   }

   public void BatModClient(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1
   ) {
      if (var1 != null) {
         this.Spinner
            .remove(var1.BatModClient());

         for (String var3 : var1.CustomSpinner()) {
            this.Checkbox.remove(var3);
         }

         this.ButtonAction(var1);
      }
   }

   public boolean BatModClient(String var1, String var2) {
      if (var1.length() > 40) {
         throw new IllegalArgumentException("The player name '" + var1 + "' is too long!");
      }

      if (!this.Spinner.containsKey(var2)) {
         return false;
      }

      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var3 = this.CustomSpinner(
         var2
      );
      if (this.Checkbox(var1) != null) {
         this.Spinner(var1);
      }

      this.Checkbox.put(var1, var3);
      var3.CustomSpinner().add(var1);
      return true;
   }

   public boolean Spinner(String var1) {
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var2 = this.Checkbox(
         var1
      );
      if (var2 != null) {
         this.BatModClient(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public void BatModClient(
      String var1, hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var2
   ) {
      if (this.Checkbox(var1) != var2) {
         throw new IllegalStateException(
            "Player is either on another team or not on any team. Cannot remove from team '"
               + var2.BatModClient()
               + "'."
         );
      }

      this.Checkbox.remove(var1);
      var2.CustomSpinner().remove(var1);
   }

   public Collection ButtonAction() {
      return this.Spinner.keySet();
   }

   public Collection Spinner() {
      return this.Spinner.values();
   }

   public hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I Checkbox(
      String var1
   ) {
      return (hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I)this.Checkbox
         .get(var1);
   }

   public void CustomSpinner(
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var1
   ) {
   }

   public void ButtonAction(
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var1
   ) {
   }

   public void Spinner(
      fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var1
   ) {
   }

   public void BatModClient(
      ZhRj8RKC0PyYCls0TxJeTRGUZyqZsaQuB7RgHP3jy5mPjX3N01IWunAS0rVVrZNRXGQ28MwKnmknGO4b0xMvALlnxMrQW8lckb4h var1
   ) {
   }

   public void ProgressBar(String var1) {
   }

   public void ButtonAction(
      String var1, fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi var2
   ) {
   }

   public void Button(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1
   ) {
   }

   public void CustomSpinner(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1
   ) {
   }

   public void ButtonAction(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1
   ) {
   }

   public static String Button(int var0) {
      switch (var0) {
         case 0:
            return "list";
         case 1:
            return "sidebar";
         case 2:
            return "belowName";
         default:
            if (var0 >= 3 && var0 <= 18) {
               C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr var1 = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModClient(
                  var0 - 3
               );
               if (var1 != null
                  && var1
                     != C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
                  )
                {
                  return "sidebar.team." + var1.ButtonAction();
               }
            }

            return null;
      }
   }

   public static int BatModProgressBar(String var0) {
      if (var0.equalsIgnoreCase("list")) {
         return 0;
      }

      if (var0.equalsIgnoreCase("sidebar")) {
         return 1;
      }

      if (var0.equalsIgnoreCase("belowName")) {
         return 2;
      }

      if (var0.startsWith("sidebar.team.")) {
         String var1 = var0.substring("sidebar.team.".length());
         C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr var2 = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Button(
            var1
         );
         if (var2 != null && var2.BatModClient() >= 0) {
            return var2.BatModClient() + 3;
         }
      }

      return -1;
   }

   public static String[] Checkbox() {
      if (ProgressBar == null) {
         ProgressBar = new String[19];

         for (int var0 = 0; var0 < 19; var0++) {
            ProgressBar[var0] = Button(
               var0
            );
         }
      }

      return ProgressBar;
   }

   public void BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      if (var1 != null
         && !(var1 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)
         && !var1.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI()) {
         String var2 = var1.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB().toString();
         this.CustomSpinner(
            var2, (fTAT9NhbmRDafUX0DSyXmMX3ApjZcegVi6qawTc1Jzxx8EFcucupFpgj4OZRV2GSZuAn4McuSQ70wiYzALhGH8xXwvIqWZ8DyVi)null
         );
         this.Spinner(var2);
      }
   }
}
