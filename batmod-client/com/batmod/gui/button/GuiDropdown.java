package com.batmod.gui.button;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class GuiAccountDropdown extends GuiDropdown {
   private final float Downloader;
   private GuiAccountDropdown$Callback InstallationLogger;
   private String RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;

   public GuiAccountDropdown(int var1, int var2, int var3, GuiAccountDropdown$Callback var4) {
      super(
         var1,
         var2,
         var3,
         false,
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
            .N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl()
            .Spinner()
            .getName(),
         (String[])ArrayUtils.addAll(
            BatModClient.BatModClient()
               .IntegerSpinner()
               .ButtonAction(),
            new String[]{
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "bm.accountmanager.add_account"
               )
            }
         )
      );
      this.ButtonAction = BatModClient.BatModClient;
      this.width = 100;

      for (String var8 : this.IntegerSpinner) {
         int var9 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .ColorTextPane
               .BatModClient(var8)
            + 38;
         if (this.width < var9) {
            this.width = var9;
         }
      }

      this.height = 20;
      this.Downloader = (this.height - 16.0F) / 2.0F;
      this.InstallationLogger = var4;
   }

   @Override
   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.Checkbox) {
         this.ProgressBar = this.Button(
            var2, var3
         );
         if (this.BatModProgressBar
            && this.ButtonAction
            && this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               < this.BatModClient()) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               + (float)(System.currentTimeMillis() - this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN);
            if (this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               > this.BatModClient()) {
               this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = this.BatModClient();
            }
         }

         if ((
               !this.BatModProgressBar
                  || !this.ButtonAction
            )
            && this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               > this.CustomSpinner()) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               - (float)(System.currentTimeMillis() - this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN);
         }

         if (this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            < this.CustomSpinner()) {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = this.CustomSpinner();
         }

         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = System.currentTimeMillis();
         this.TextField
            .BatModClient(
               this.ButtonAction
                  && this.ProgressBar
            );
         this.ColorTextPane
            .BatModClient(
               this.BatModProgressBar
                  && this.ButtonAction
            );
         float var4 = 0.6F;
         int var5 = (int)(
            this.Button
               + this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane(
            5889
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
         int var6 = new ufUkNvXxPYHboFIRmj8v02j2jBXcs5iDVIf0FTLmVf2MdCOyYiu8HENrDhf7oMr4M7BUj6R37hUz9GYDygElS2ydDmlsIzNehir8(var1)
            .Spinner();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            this.BatModClient * var6,
            (
                  var1.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA.ColorTextPane
                     - var5
               )
               * var6,
            this.width * var6,
            (var5 - this.Button) * var6
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane(
            5889
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            this.BatModClient,
            this.BatModClient + this.width,
            var5,
            this.Button,
            1000.0,
            3000.0
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane(
            5888
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            0.0F, 0.0F, -2000.0F
         );
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               Button.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .BatModClient()
            );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            this.BatModClient + var4,
            this.Button + var4,
            this.BatModClient + this.width - var4,
            this.Button + this.height
               - var4
               + (
                  (
                           !this.BatModProgressBar
                              || !this.ButtonAction
                        )
                        && !(
                           this.CustomSpinner()
                              < this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
                        )
                     ? 0.0F
                     : var4
               ),
            this.TextField
               .BatModClient()
         );
         int var7 = -861756766;
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            this.BatModClient + var4,
            this.Button,
            this.BatModClient + this.width - var4,
            this.Button + var4,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            this.BatModClient,
            this.Button + var4,
            this.BatModClient + var4,
            this.Button + this.height - var4,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            this.BatModClient + this.width - var4,
            this.Button + var4,
            this.BatModClient + this.width,
            this.Button + this.height - var4,
            var7
         );
         Checkbox var8 = BatModClient.BatModClient()
            .IntegerSpinner();
         ButtonAction var9 = var8.Checkbox();
         this.BatModClient(
            var1,
            var9,
            -1,
            var9.ProgressBar(),
            this.BatModClient
               + this.Downloader,
            this.Button
               + this.Downloader,
            var2,
            var3
         );
         if ((
               !this.BatModProgressBar
                  || !this.ButtonAction
            )
            && !(
               this.CustomSpinner()
                  < this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            )) {
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
               this.BatModClient + var4,
               this.Button + this.height - var4,
               this.BatModClient + this.width - var4,
               this.Button + this.height,
               var7
            );
         } else {
            this.BatModClient(
               Arrays.asList(this.IntegerSpinner), var2, var3
            );
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane(
            5889
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            0,
            0,
            var1.ButtonAction,
            var1.Spinner
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane(
            5888
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF();
         if (this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM != null) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.TextField();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN();
            var1.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  Collections.singletonList(this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM),
                  var2,
                  var3
               );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               1.0F, 1.0F, 1.0F
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane();
            this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = null;
         }

         if (this.ProgressBar) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.TextField();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN();
            var1.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  var1.ColorTextPane
                     .CustomSpinner(
                        f6cgUQ6aSGnWSqG4OYas4oignCfbZ5duBEZLn4M7DX96UEc9FqhcuJ2jlhnXSDUikC0lQXip4FQJFN7fF9brqfQLOfH9sDLAvmAd.BatModClient(
                           rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                              "bm.accountmanager.unsupported"
                           )
                        ),
                        250
                     ),
                  var2,
                  var3
               );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               1.0F, 1.0F, 1.0F
            );
         }
      }
   }

   @Override
   void BatModClient(List var1, int var2, int var3) {
      float var4 = 0.6F;

      for (int var5 = 0; var1.size() > var5; var5++) {
         if (var5 <= this.BatModInstallerMain.size()) {
            boolean var6 = this.BatModClient(var5, var2, var3);
            waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW var7 = (waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW)this.BatModInstallerMain
               .get(var5);
            var7.BatModClient(
               this.ButtonAction && var6
            );
            int var8 = var7.BatModClient();
            if (var7.CustomSpinner() <= 0.0F && var5 % 2 == 0) {
               var8 = 2131364362;
            }

            int var9 = this.height * (var5 + 1);
            boolean var10 = var5 == var1.size() - 1;
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
               this.BatModClient + var4,
               this.Button + var9,
               this.BatModClient + this.width - var4,
               this.Button + this.height + var9
                  - (var10 ? var4 : 0.0F),
               var8
            );
            var8 = -861756766;
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
               this.BatModClient,
               this.Button + var9 - var4,
               this.BatModClient + var4,
               this.Button + this.height + var9 - var4,
               var8
            );
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
               this.BatModClient + this.width - var4,
               this.Button + var9 - var4,
               this.BatModClient + this.width,
               this.Button + this.height + var9 - var4,
               var8
            );
            if (var10) {
               O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
                  this.BatModClient + var4,
                  this.Button + this.height + var9 - var4,
                  this.BatModClient + this.width - var4,
                  this.Button + this.height + var9,
                  var8
               );
            }

            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var11 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson();
            if (var5 == var1.size() - 1) {
               float var12 = 0.65F;
               float var13 = this.BatModClient
                  + this.Downloader;
               var9 = (int)(
                  var9 + this.Button
                     + this.Downloader
               );
               var11.ColorTextPane
                  .BatModClient(
                     this.IntegerSpinner[var5],
                     var13 + this.Downloader + 16.0F,
                     var9
                        + this.height / 2.0F
                        - AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                              .ColorTextPane
                              .Spinner
                           / 2.0F
                        - this.Downloader / 2.0F,
                     -16724979
                  );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
                  1.0F, 1.0F, 1.0F, 1.0F
               );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
               var11.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
                  .BatModClient(
                     Button.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                        .BatModClient()
                  );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
                  var12
               );
               var11.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
                  .BatModClient(
                     (float)(var13 / var12 + 2.5F), (float)(var9 / var12 + 2.5F), 94, 0, 19, 19
                  );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
            } else {
               float var18 = 0.5F;
               float var19 = this.BatModClient
                  + this.Downloader
                  + this.width
                  - 15.0F;
               float var14 = var9 + this.Button
                  + this.Downloader
                  + 5.0F;
               var6 = var19 <= var2 && var14 <= var3 && var19 + 15.0F * var18 >= var2 && var14 + 15.0F * var18 >= var3;
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
               var11.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
                  .BatModClient(
                     Button.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                        .BatModClient()
                  );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
                  1.0F, 1.0F, 1.0F, 1.0F
               );
               if (var6) {
                  net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
                     0.7F, 0.7F, 1.0F
                  );
               }

               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
                  var18
               );
               this.BatModClient(
                  (float)(var19 / var18), (float)(var14 / var18), 20, 0, 16, 16
               );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
               if (var6) {
                  this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "selectServer.delete"
                  );
               }

               if (var5
                  < BatModClient.BatModClient()
                     .IntegerSpinner()
                     .CustomSpinner()
                     .size()) {
                  this.BatModClient(
                     var11,
                     (ButtonAction)BatModClient.BatModClient()
                        .IntegerSpinner()
                        .CustomSpinner()
                        .get(var5),
                     var5,
                     this.BatModClient
                        + this.Downloader,
                     var9 + this.Button
                        + this.Downloader,
                     var2,
                     var3
                  );
               }
            }
         }
      }
   }

   private void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1,
      ButtonAction var2,
      int var3,
      float var4,
      float var5,
      int var6,
      int var7
   ) {
      this.BatModClient(
         var1,
         var2,
         var3,
         var2 == null ? "§cInvalid" : var2.ProgressBar(),
         var4,
         var5,
         var6,
         var7
      );
   }

   private void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1,
      ButtonAction var2,
      int var3,
      String var4,
      float var5,
      float var6,
      int var7,
      int var8
   ) {
      Checkbox var9 = BatModClient.BatModClient()
         .IntegerSpinner();
      float var10 = 0.5F;
      var1.ColorTextPane
         .BatModClient(
            var4,
            var5 + this.Downloader + 32.0F * var10,
            var6
               + this.height / 2.0F
               - AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                     .ColorTextPane
                     .Spinner
                  / 2.0F
               - this.Downloader / 2.0F,
            var3 == -1
                  && this.BatModProgressBar
                  && this.ButtonAction
               ? -171
               : (this.BatModClient(var3, var7, var8) ? 16777120 : -1)
         );
      if (var3 == -1) {
         var10 = 0.7F;
         float var11 = (this.height - 16.0F) / 2.0F;
         float var12 = this.BatModClient + var11 + this.width - 16.0F;
         float var13 = this.Button + var11 + 5.0F;
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               Button.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
                  .BatModClient()
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
            var10
         );
         this.ColorTextPane
            .BatModClient(var12, var13, var10, 7.5F, 5.0F);
         this.BatModClient(
            (float)(var12 / var10), (float)(var13 / var10), 42, 0, 15, 10
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
      }

      var10 = 0.5F;
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
         1.0F, 1.0F, 1.0F, 1.0F
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
      var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
         .BatModClient(
            var2 == null
               ? (
                  var9.Spinner() != null
                        && var9.Spinner()
                              .ProgressBar()
                           != null
                     ? var9.Spinner()
                        .IntegerSpinner()
                     : L4uaVMCd3oGSH0oCjM3VDqaD9VO3BiV9lih4UOOYQ3zS9zoArGhufbuPZuU1skykagKo9dxU6loDnqdolcTTJAvcLcmbD5ukewav.BatModClient()
               )
               : var2.IntegerSpinner()
         );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
         var10
      );
      this.BatModClient(
         (float)(var5 / var10), (float)(var6 / var10), 32, 32, 32, 32
      );
      this.BatModClient(
         (float)(var5 / var10), (float)(var6 / var10), 160, 32, 32, 32
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      if (var2 != null && var3 != -1) {
         var10 = 0.025F;
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               var2.Checkbox()
                     == ProgressBar.BatModClient
                  ? Button.Downloader
                     .BatModClient()
                  : Button.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
                     .BatModClient()
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ButtonAction(
            var10
         );
         this.BatModClient(
            (float)((
                  var5
                     + (
                        var2.Checkbox()
                              == ProgressBar.BatModClient
                           ? 0.25F
                           : 0.0F
                     )
               )
               / var10),
            (float)((var6 + 0.0F) / var10),
            0,
            0,
            256,
            256
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
      }
   }

   @Override
   public int BatModClient(int var1, int var2) {
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var3 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson();
      int var4 = super.BatModClient(var1, var2);
      if (var4 == -1) {
         return var4;
      }

      if (var4 == this.IntegerSpinner.length - 1) {
         var3.BatModClient(
            new q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx(
               var3.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            )
         );
      } else if (var4 < this.IntegerSpinner.length - 1) {
         Checkbox var5 = BatModClient.BatModClient()
            .IntegerSpinner();
         ButtonAction var6 = var5.BatModClient(
            this.IntegerSpinner[var4]
         );
         float var7 = 0.5F;
         float var8 = this.BatModClient
            + this.Downloader
            + this.width
            - 15.0F;
         float var9 = this.height * (var4 + 1) + this.Button
            + this.Downloader
            + 5.0F;
         if (var8 <= var1 && var9 <= var2 && var8 + 15.0F * var7 >= var1 && var9 + 15.0F * var7 >= var2) {
            var5.Button(var6);
            this.InstallationLogger.call();
            return var4;
         }

         HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn.Button(
            () -> var6.BatModClient(
               new GuiAccountDropdown$1(this, var5)
            )
         );
      }

      return var4;
   }

   @Override
   public boolean Button(int var1, int var2) {
      return var1 >= this.BatModClient
         && var2 >= this.Button
         && var1 < this.BatModClient + this.width
         && var2 < this.Button + this.height;
   }
}
