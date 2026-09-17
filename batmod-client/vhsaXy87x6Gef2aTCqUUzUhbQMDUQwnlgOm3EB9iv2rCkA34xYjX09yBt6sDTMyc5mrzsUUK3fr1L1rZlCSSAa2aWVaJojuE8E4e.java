import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class vhsaXy87x6Gef2aTCqUUzUhbQMDUQwnlgOm3EB9iv2rCkA34xYjX09yBt6sDTMyc5mrzsUUK3fr1L1rZlCSSAa2aWVaJojuE8E4e
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private final List Button = Lists.newArrayList();

   public vhsaXy87x6Gef2aTCqUUzUhbQMDUQwnlgOm3EB9iv2rCkA34xYjX09yBt6sDTMyc5mrzsUUK3fr1L1rZlCSSAa2aWVaJojuE8E4e() {
   }

   public vhsaXy87x6Gef2aTCqUUzUhbQMDUQwnlgOm3EB9iv2rCkA34xYjX09yBt6sDTMyc5mrzsUUK3fr1L1rZlCSSAa2aWVaJojuE8E4e(int var1, Collection var2) {
      this.BatModClient = var1;

      for (uAWrt2GkGcRp9rQq85uUZN6bXvPWoPKZrZ3rMiiStFamdJjzXsTR4StJIlA9dpholfs4P9jHYUBf9Ja3BtBF5UqfSwNLmJM10wUX var4 : var2) {
         this.Button
            .add(
               new WzZBxrZyw86ir2FuKNCzrEMFkl8FUC7c6DPx8GdfgdouV8qeUiigHfP1vAafMDgIJwKqk6HoQXg7tSBvDUdMYBgK7mUl9gKTAcqd(
                  this,
                  var4.BatModClient()
                     .BatModClient(),
                  var4.Button(),
                  var4.CustomSpinner()
               )
            );
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.ButtonAction();
      int var2 = var1.readInt();

      for (int var3 = 0; var3 < var2; var3++) {
         String var4 = var1.CustomSpinner(64);
         double var5 = var1.readDouble();
         ArrayList var7 = Lists.newArrayList();
         int var8 = var1.ButtonAction();

         for (int var9 = 0; var9 < var8; var9++) {
            UUID var10 = var1.Checkbox();
            var7.add(
               new kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7(
                  var10, "Unknown synced attribute modifier", var1.readDouble(), var1.readByte()
               )
            );
         }

         this.Button
            .add(new WzZBxrZyw86ir2FuKNCzrEMFkl8FUC7c6DPx8GdfgdouV8qeUiigHfP1vAafMDgIJwKqk6HoQXg7tSBvDUdMYBgK7mUl9gKTAcqd(this, var4, var5, var7));
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.Button(
         this.BatModClient
      );
      var1.writeInt(this.Button.size());

      for (WzZBxrZyw86ir2FuKNCzrEMFkl8FUC7c6DPx8GdfgdouV8qeUiigHfP1vAafMDgIJwKqk6HoQXg7tSBvDUdMYBgK7mUl9gKTAcqd var3 : this.Button) {
         var1.BatModClient(
            var3.BatModClient()
         );
         var1.writeDouble(var3.Button());
         var1.Button(
            var3.CustomSpinner().size()
         );

         for (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var5 : var3.CustomSpinner()) {
            var1.BatModClient(
               var5.BatModClient()
            );
            var1.writeDouble(var5.ButtonAction());
            var1.writeByte(var5.CustomSpinner());
         }
      }
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public List Button() {
      return this.Button;
   }
}
