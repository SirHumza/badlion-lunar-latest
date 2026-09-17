import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;

public class pxu2qAtU6onYKtDNhCwQQzjukGn4dChy0qfDrv3garRznLfuJ9sWqhwQW3zYBEEclJSUGofu4e0vhRE1lFwPYd96DQWmCDRpUvT {
   private final Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM BatModClient;
   private boolean Button = true;
   private static final Map CustomSpinner = Maps.newHashMap();
   private final Map ButtonAction = Maps.newHashMap();
   private boolean Spinner;
   private ReadWriteLock Checkbox = new ReentrantReadWriteLock();

   public pxu2qAtU6onYKtDNhCwQQzjukGn4dChy0qfDrv3garRznLfuJ9sWqhwQW3zYBEEclJSUGofu4e0vhRE1lFwPYd96DQWmCDRpUvT(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      this.BatModClient = var1;
   }

   public void BatModClient(int var1, Object var2) {
      Integer var3 = (Integer)CustomSpinner.get(var2.getClass());
      if (var3 == null) {
         throw new IllegalArgumentException("Unknown data type: " + var2.getClass());
      }

      if (var1 > 31) {
         throw new IllegalArgumentException("Data value id is too big with " + var1 + "! (Max is " + 31 + ")");
      }

      if (this.ButtonAction.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id value for " + var1 + "!");
      }

      F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var4 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(
         var3, var1, var2
      );
      this.Checkbox.writeLock().lock();
      this.ButtonAction.put(var1, var4);
      this.Checkbox.writeLock().unlock();
      this.Button = false;
   }

   public void BatModClient(int var1, int var2) {
      F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(
         var2, var1, null
      );
      this.Checkbox.writeLock().lock();
      this.ButtonAction.put(var1, var3);
      this.Checkbox.writeLock().unlock();
      this.Button = false;
   }

   public byte BatModClient(int var1) {
      return (Byte)this.ColorChooser(var1)
         .Button();
   }

   public short Button(int var1) {
      return (Short)this.ColorChooser(var1)
         .Button();
   }

   public int CustomSpinner(int var1) {
      return (Integer)this.ColorChooser(var1)
         .Button();
   }

   public float ButtonAction(int var1) {
      return (Float)this.ColorChooser(var1)
         .Button();
   }

   public String Spinner(int var1) {
      return (String)this.ColorChooser(var1)
         .Button();
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Checkbox(
      int var1
   ) {
      return (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65)this.ColorChooser(
            var1
         )
         .Button();
   }

   private F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x ColorChooser(
      int var1
   ) {
      this.Checkbox.readLock().lock();

      F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var2;
      try {
         var2 = (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x)this.ButtonAction
            .get(var1);
      } catch (Throwable var6) {
         dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK var4 = dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK.BatModClient(
            var6, "Getting synched entity data"
         );
         jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var5 = var4.BatModClient(
            "Synched entity data"
         );
         var5.BatModClient("Data ID", var1);
         throw new Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg(var4);
      }

      this.Checkbox.readLock().unlock();
      return var2;
   }

   public ikRN4LfVX0bmgyyU9CIeSy5CBIVsesR6BFzCJhwRuDtrPgIGQ3GTkC1SmqFoV5s8VOLcde9jJjuwNuvB3feJANOArzeqz6gd6Joo ProgressBar(
      int var1
   ) {
      return (ikRN4LfVX0bmgyyU9CIeSy5CBIVsesR6BFzCJhwRuDtrPgIGQ3GTkC1SmqFoV5s8VOLcde9jJjuwNuvB3feJANOArzeqz6gd6Joo)this.ColorChooser(
            var1
         )
         .Button();
   }

   public void Button(int var1, Object var2) {
      F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 = this.ColorChooser(
         var1
      );
      if (ObjectUtils.notEqual(var2, var3.Button())) {
         var3.BatModClient(var2);
         this.BatModClient
            .IntegerSpinner(var1);
         var3.BatModClient(true);
         this.Spinner = true;
      }
   }

   public void BatModProgressBar(int var1) {
      F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x.BatModClient(
         this.ColorChooser(var1), true
      );
      this.Spinner = true;
   }

   public boolean BatModClient() {
      return this.Spinner;
   }

   public static void BatModClient(
      List var0, LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      if (var0 != null) {
         for (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 : var0) {
            BatModClient(var1, var3);
         }
      }

      var1.writeByte(127);
   }

   public List Button() {
      ArrayList var1 = null;
      if (this.Spinner) {
         this.Checkbox.readLock().lock();

         for (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 : this.ButtonAction
            .values()) {
            if (var3.ButtonAction()) {
               var3.BatModClient(false);
               if (var1 == null) {
                  var1 = Lists.newArrayList();
               }

               var1.add(var3);
            }
         }

         this.Checkbox.readLock().unlock();
      }

      this.Spinner = false;
      return var1;
   }

   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.Checkbox.readLock().lock();

      for (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 : this.ButtonAction
         .values()) {
         BatModClient(var1, var3);
      }

      this.Checkbox.readLock().unlock();
      var1.writeByte(127);
   }

   public List CustomSpinner() {
      ArrayList var1 = null;
      this.Checkbox.readLock().lock();

      for (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 : this.ButtonAction
         .values()) {
         if (var1 == null) {
            var1 = Lists.newArrayList();
         }

         var1.add(var3);
      }

      this.Checkbox.readLock().unlock();
      return var1;
   }

   private static void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var0,
      F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var1
   ) {
      int var2 = (
            var1.CustomSpinner() << 5
               | var1.BatModClient() & 31
         )
         & 0xFF;
      var0.writeByte(var2);
      switch (var1.CustomSpinner()) {
         case 0:
            var0.writeByte((Byte)var1.Button());
            break;
         case 1:
            var0.writeShort((Short)var1.Button());
            break;
         case 2:
            var0.writeInt((Integer)var1.Button());
            break;
         case 3:
            var0.writeFloat((Float)var1.Button());
            break;
         case 4:
            var0.BatModClient(
               (String)var1.Button()
            );
            break;
         case 5:
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3 = (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65)var1.Button();
            var0.BatModClient(var3);
            break;
         case 6:
            q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW)var1.Button();
            var0.writeInt(var4.BatModProgressBar());
            var0.writeInt(var4.ColorChooser());
            var0.writeInt(var4.IntegerSpinner());
            break;
         case 7:
            ikRN4LfVX0bmgyyU9CIeSy5CBIVsesR6BFzCJhwRuDtrPgIGQ3GTkC1SmqFoV5s8VOLcde9jJjuwNuvB3feJANOArzeqz6gd6Joo var5 = (ikRN4LfVX0bmgyyU9CIeSy5CBIVsesR6BFzCJhwRuDtrPgIGQ3GTkC1SmqFoV5s8VOLcde9jJjuwNuvB3feJANOArzeqz6gd6Joo)var1.Button();
            var0.writeFloat(var5.Button());
            var0.writeFloat(var5.CustomSpinner());
            var0.writeFloat(var5.ButtonAction());
      }
   }

   public static List Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var0
   ) {
      ArrayList var1 = null;

      for (byte var2 = var0.readByte(); var2 != 127; var2 = var0.readByte()) {
         if (var1 == null) {
            var1 = Lists.newArrayList();
         }

         int var3 = (var2 & 224) >> 5;
         int var4 = var2 & 31;
         F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var5 = null;
         switch (var3) {
            case 0:
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(var3, var4, var0.readByte());
               break;
            case 1:
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(var3, var4, var0.readShort());
               break;
            case 2:
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(var3, var4, var0.readInt());
               break;
            case 3:
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(var3, var4, var0.readFloat());
               break;
            case 4:
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(
                  var3, var4, var0.CustomSpinner(32767)
               );
               break;
            case 5:
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(
                  var3, var4, var0.BatModProgressBar()
               );
               break;
            case 6:
               int var6 = var0.readInt();
               int var7 = var0.readInt();
               int var8 = var0.readInt();
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(
                  var3, var4, new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var6, var7, var8)
               );
               break;
            case 7:
               float var9 = var0.readFloat();
               float var10 = var0.readFloat();
               float var11 = var0.readFloat();
               var5 = new F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x(
                  var3, var4, new ikRN4LfVX0bmgyyU9CIeSy5CBIVsesR6BFzCJhwRuDtrPgIGQ3GTkC1SmqFoV5s8VOLcde9jJjuwNuvB3feJANOArzeqz6gd6Joo(var9, var10, var11)
               );
         }

         var1.add(var5);
      }

      return var1;
   }

   public void BatModClient(List var1) {
      this.Checkbox.writeLock().lock();

      for (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var3 : var1) {
         F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x var4 = (F6rXonTJ5HMPoL9llz5byNppy5qUtpdCkog9tIfQ5hh4qbj97vYJUcJePts22kVzNgpJ9MjgJKIjNNpTFciBdN6gDnpFT5ccW4x)this.ButtonAction
            .get(var3.BatModClient());
         if (var4 != null) {
            var4.BatModClient(
               var3.Button()
            );
            this.BatModClient
               .IntegerSpinner(
                  var3.BatModClient()
               );
         }
      }

      this.Checkbox.writeLock().unlock();
      this.Spinner = true;
   }

   public boolean ButtonAction() {
      return this.Button;
   }

   public void Spinner() {
      this.Spinner = false;
   }

   static {
      CustomSpinner.put(Byte.class, 0);
      CustomSpinner.put(Short.class, 1);
      CustomSpinner.put(Integer.class, 2);
      CustomSpinner.put(Float.class, 3);
      CustomSpinner.put(String.class, 4);
      CustomSpinner.put(
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65.class, 5
      );
      CustomSpinner.put(
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW.class, 6
      );
      CustomSpinner.put(
         ikRN4LfVX0bmgyyU9CIeSy5CBIVsesR6BFzCJhwRuDtrPgIGQ3GTkC1SmqFoV5s8VOLcde9jJjuwNuvB3feJANOArzeqz6gd6Joo.class, 7
      );
   }
}
