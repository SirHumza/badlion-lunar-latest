import com.google.common.collect.Lists;
import java.util.Collection;

public class oY4dTRNgiVX7NxJz7QlA23c4Ww3LF6DN8TyFKbg81Fky9aP3ZNFuNw0y6mTlHizxNCuoAHv8NOgvOJdSm6bTgLojBvybAaxX7X62
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private String BatModClient = "";
   private String Button = "";
   private String CustomSpinner = "";
   private String ButtonAction = "";
   private String Spinner;
   private int Checkbox;
   private Collection ProgressBar;
   private int BatModProgressBar;
   private int ColorChooser;

   public oY4dTRNgiVX7NxJz7QlA23c4Ww3LF6DN8TyFKbg81Fky9aP3ZNFuNw0y6mTlHizxNCuoAHv8NOgvOJdSm6bTgLojBvybAaxX7X62() {
      this.Spinner = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.BatModClient
         .Spinner;
      this.Checkbox = -1;
      this.ProgressBar = Lists.newArrayList();
   }

   public oY4dTRNgiVX7NxJz7QlA23c4Ww3LF6DN8TyFKbg81Fky9aP3ZNFuNw0y6mTlHizxNCuoAHv8NOgvOJdSm6bTgLojBvybAaxX7X62(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1, int var2
   ) {
      this.Spinner = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.BatModClient
         .Spinner;
      this.Checkbox = -1;
      this.ProgressBar = Lists.newArrayList();
      this.BatModClient = var1.BatModClient();
      this.BatModProgressBar = var2;
      if (var2 == 0 || var2 == 2) {
         this.Button = var1.Button();
         this.CustomSpinner = var1.ButtonAction();
         this.ButtonAction = var1.Spinner();
         this.ColorChooser = var1.IntegerSpinner();
         this.Spinner = var1.BatModProgressBar()
            .Spinner;
         this.Checkbox = var1.TextField()
            .BatModClient();
      }

      if (var2 == 0) {
         this.ProgressBar
            .addAll(var1.CustomSpinner());
      }
   }

   public oY4dTRNgiVX7NxJz7QlA23c4Ww3LF6DN8TyFKbg81Fky9aP3ZNFuNw0y6mTlHizxNCuoAHv8NOgvOJdSm6bTgLojBvybAaxX7X62(
      hbC3aMun52qjl0WBmHVxBgWCq1askUuTbvPM9zvdPFrJRSJOmAXlBB2qpkGqVIhXZQOzA3BmmNT7JjuP79EoQUFIOgseXbObuK6I var1, Collection var2, int var3
   ) {
      this.Spinner = kRZ4kwbKWhhX0KrUr9PWIOnyhNk9TEcFIua78R5KX3xSqHb2eXq0xea9BvVmobUSXIeGOg7uhVFeM7oyKcVg08XroQcdXz6cCycN.BatModClient
         .Spinner;
      this.Checkbox = -1;
      this.ProgressBar = Lists.newArrayList();
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      }

      if (var2 != null && !var2.isEmpty()) {
         this.BatModProgressBar = var3;
         this.BatModClient = var1.BatModClient();
         this.ProgressBar.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.CustomSpinner(
         16
      );
      this.BatModProgressBar = var1.readByte();
      if (this.BatModProgressBar == 0
         || this.BatModProgressBar == 2) {
         this.Button = var1.CustomSpinner(
            32
         );
         this.CustomSpinner = var1.CustomSpinner(
            16
         );
         this.ButtonAction = var1.CustomSpinner(
            16
         );
         this.ColorChooser = var1.readByte();
         this.Spinner = var1.CustomSpinner(
            32
         );
         this.Checkbox = var1.readByte();
      }

      if (this.BatModProgressBar == 0
         || this.BatModProgressBar == 3
         || this.BatModProgressBar == 4) {
         int var2 = var1.ButtonAction();

         for (int var3 = 0; var3 < var2; var3++) {
            this.ProgressBar
               .add(var1.CustomSpinner(40));
         }
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.BatModClient(
         this.BatModClient
      );
      var1.writeByte(this.BatModProgressBar);
      if (this.BatModProgressBar == 0
         || this.BatModProgressBar == 2) {
         var1.BatModClient(
            this.Button
         );
         var1.BatModClient(
            this.CustomSpinner
         );
         var1.BatModClient(
            this.ButtonAction
         );
         var1.writeByte(this.ColorChooser);
         var1.BatModClient(
            this.Spinner
         );
         var1.writeByte(this.Checkbox);
      }

      if (this.BatModProgressBar == 0
         || this.BatModProgressBar == 3
         || this.BatModProgressBar == 4) {
         var1.Button(
            this.ProgressBar.size()
         );

         for (String var3 : this.ProgressBar) {
            var1.BatModClient(var3);
         }
      }
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public String Button() {
      return this.Button;
   }

   public String CustomSpinner() {
      return this.CustomSpinner;
   }

   public String ButtonAction() {
      return this.ButtonAction;
   }

   public Collection Spinner() {
      return this.ProgressBar;
   }

   public int Checkbox() {
      return this.BatModProgressBar;
   }

   public int ProgressBar() {
      return this.ColorChooser;
   }

   public int BatModProgressBar() {
      return this.Checkbox;
   }

   public String ColorChooser() {
      return this.Spinner;
   }
}
