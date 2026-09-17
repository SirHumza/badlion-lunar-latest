import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public class Gof53Fi7crToHrc5gkyOqzLASX0gqqh84KH9M2bXZTSdc2GCW60B6S37dfSrOf7BcehwepI7oC2axUifSRyoITQcBF0fS1qyglLX
   extends gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI {
   private int Spinner;
   private int Checkbox;
   private GameProfile ProgressBar = null;

   @Override
   public void Button(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      super.Button(var1);
      var1.BatModClient(
         "SkullType", (byte)(this.Spinner & 0xFF)
      );
      var1.BatModClient(
         "Rot", (byte)(this.Checkbox & 0xFF)
      );
      if (this.ProgressBar != null) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         nYYaE52De6WnZadOQMn3x1Vq1U3OwG9G3CxVDPNs0kMrvQwgYpMPQM8AX5cqVJGQXTwCbGgIszyEtZz4a6cJywXSsbpZhMg4Jb41.BatModClient(
            var2, this.ProgressBar
         );
         var1.BatModClient("Owner", var2);
      }
   }

   @Override
   public void BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      super.BatModClient(var1);
      this.Spinner = var1.ButtonAction(
         "SkullType"
      );
      this.Checkbox = var1.ButtonAction(
         "Rot"
      );
      if (this.Spinner == 3) {
         if (var1.Button("Owner", 10)) {
            this.ProgressBar = nYYaE52De6WnZadOQMn3x1Vq1U3OwG9G3CxVDPNs0kMrvQwgYpMPQM8AX5cqVJGQXTwCbGgIszyEtZz4a6cJywXSsbpZhMg4Jb41.BatModClient(
               var1.BatModInstallerMain("Owner")
            );
         } else if (var1.Button("ExtraType", 8)) {
            String var2 = var1.IntegerSpinner("ExtraType");
            if (!fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F.Button(
               var2
            )) {
               this.ProgressBar = new GameProfile((UUID)null, var2);
               this.ButtonAction();
            }
         }
      }
   }

   public GameProfile BatModClient() {
      return this.ProgressBar;
   }

   @Override
   public fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
      this.Button(var1);
      return new FEynyL4pBl0CExZ03I0YymYmxA6IqvU93G3tAMUuMM1enWdb11TyGwXrhi8bdPSZWk2NoF6mTi0c74c4R2ZQIPIgunxgh8mOWaZO(
         this.Button, 4, var1
      );
   }

   public void BatModClient(int var1) {
      this.Spinner = var1;
      this.ProgressBar = null;
   }

   public void BatModClient(GameProfile var1) {
      this.Spinner = 3;
      this.ProgressBar = var1;
      this.ButtonAction();
   }

   private void ButtonAction() {
      this.ProgressBar = Button(
         this.ProgressBar
      );
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
   }

   public static GameProfile Button(GameProfile var0) {
      if (var0 != null
         && !fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F.Button(
            var0.getName()
         )) {
         if (var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         }

         if (TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            == null) {
            return var0;
         }

         GameProfile var1 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            .H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr()
            .BatModClient(var0.getName());
         if (var1 == null) {
            return var0;
         }

         Property var2 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), null);
         if (var2 == null) {
            var1 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv()
               .fillProfileProperties(var1, true);
         }

         return var1;
      } else {
         return var0;
      }
   }

   public int Button() {
      return this.Spinner;
   }

   public int CustomSpinner() {
      return this.Checkbox;
   }

   public void Button(int var1) {
      this.Checkbox = var1;
   }
}
