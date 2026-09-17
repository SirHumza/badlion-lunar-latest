import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class pv41yB51QYKpb20FF9W9XSAvKS671krPqtx0SkvW8ZsADYdd666r2fOX3h9Tlsy51klNJcpTEDFkgshcExe3e0c2S5GCK6IBZKEi {
   private List BatModClient = new CopyOnWriteArrayList();

   public void BatModClient() {
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson();
      ufUkNvXxPYHboFIRmj8v02j2jBXcs5iDVIf0FTLmVf2MdCOyYiu8HENrDhf7oMr4M7BUj6R37hUz9GYDygElS2ydDmlsIzNehir8 var2 = new ufUkNvXxPYHboFIRmj8v02j2jBXcs5iDVIf0FTLmVf2MdCOyYiu8HENrDhf7oMr4M7BUj6R37hUz9GYDygElS2ydDmlsIzNehir8(
         var1
      );
      int var3 = var2.BatModClient();
      float var4 = 20.0F;

      for (Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var6 : this.BatModClient) {
         if (System.currentTimeMillis() - var6.BatModClient
            >= var6.Button) {
            this.BatModClient.remove(var6);
         } else {
            var6.ButtonAction
               .BatModClient(
                  System.currentTimeMillis() - var6.BatModClient
                     < var6.Button - 500L
               );
            float var7 = (float)(
               var3
                  - var6.CustomSpinner()
                     * var6.ButtonAction
                        .BatModClient()
            );
            if (var6.CustomSpinner == 0.0F) {
               var6.CustomSpinner = var4;
            }

            if (var4 < var6.CustomSpinner) {
               var6.Spinner
                  .BatModClient(true);
               var6.CustomSpinner = (float)Math.max(
                  20.0,
                  var4 + var6.ButtonAction()
                     - var6.ButtonAction()
                        * var6.Spinner
                           .BatModClient()
               );
            } else {
               var6.Spinner
                  .ButtonAction();
            }

            var6.BatModClient(
               var7,
               var6.CustomSpinner,
               var3,
               var6.CustomSpinner
                  + var6.ButtonAction()
            );
            var4 += var6.ButtonAction() + 10.0F;
         }
      }
   }

   public void BatModClient(
      Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var1
   ) {
      this.BatModClient.add(var1);
   }

   public void BatModClient(
      Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var1,
      Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var2
   ) {
      if (this.BatModClient.contains(var1)) {
         this.BatModClient
            .set(this.BatModClient.indexOf(var1), var2);
         var2.BatModClient(var1);
      } else {
         this.BatModClient(var2);
      }
   }

   public void BatModClient(
      Class var1, Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var2
   ) {
      int var3 = 0;

      for (Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var5 : this.BatModClient) {
         if (var1.isInstance(var5)) {
            this.BatModClient.set(var3, var2);
            var2.BatModClient(var5);
            return;
         }

         var3++;
      }

      this.BatModClient(var2);
   }

   public List Button() {
      return this.BatModClient;
   }

   public List BatModClient(Class var1) {
      ArrayList var2 = new ArrayList();

      for (Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv var4 : this.BatModClient) {
         if (var1.isInstance(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }
}
