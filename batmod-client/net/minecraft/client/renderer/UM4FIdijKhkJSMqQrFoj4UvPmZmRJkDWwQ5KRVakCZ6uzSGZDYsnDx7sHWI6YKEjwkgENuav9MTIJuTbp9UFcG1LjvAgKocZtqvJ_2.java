package net.minecraft.client.renderer;

import java.util.Collection;

public abstract class keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9
   extends UM4FIdijKhkJSMqQrFoj4UvPmZmRJkDWwQ5KRVakCZ6uzSGZDYsnDx7sHWI6YKEjwkgENuav9MTIJuTbp9UFcG1LjvAgKocZtqvJ {
   private final BatModClient BatModClient = BatModClient.BatModClient();
   private boolean Button;

   public keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9(
      Aj7XcOq39OSNFQ9XdHMZK983N1FTgww66fEcYW7FZpHTf8YZVRDpMUrV6homDZeu06ifByDzcDCkLuiKMOfUndmcWdqxmSEB7obV var1
   ) {
      super(var1);
   }

   @Override
   public void BatModClient() {
      super.BatModClient();
      this.Checkbox();
   }

   @Override
   protected void Checkbox() {
      if (!this.BatModClient
            .ProgressBar()
            .inventoryAnimation_1_7
         && !this.ColorChooser
            .BatModProgressBar
            .jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD()
            .isEmpty()) {
         this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = 160
            + (
                  this.TextField
                     - this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                     - 200
               )
               / 2;
         this.Button = true;
      } else {
         this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = (
               this.TextField
                  - this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            )
            / 2;
         if (this.BatModClient
               .ProgressBar()
               .inventoryAnimation_1_7
            && !this.ColorChooser
               .BatModProgressBar
               .jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD()
               .isEmpty()) {
            this.Button = true;
         } else {
            this.Button = false;
         }
      }
   }

   @Override
   public void BatModClient(int var1, int var2, float var3) {
      super.BatModClient(var1, var2, var3);
      if (this.Button) {
         this.ProgressBar();
      }
   }

   private void ProgressBar() {
      int var1 = this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL - 124;
      int var2 = this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr;
      short var3 = 166;
      Collection var4 = this.ColorChooser
         .BatModProgressBar
         .jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD();
      if (!var4.isEmpty()) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorTextPane();
         int var5 = 33;
         if (var4.size() > 5) {
            var5 = 132 / (var4.size() - 1);
         }

         for (Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var7 : this.ColorChooser
            .BatModProgressBar
            .jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD()) {
            ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x var8 = ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[var7.BatModClient()];
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               1.0F, 1.0F, 1.0F, 1.0F
            );
            this.ColorChooser
               .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
               .BatModClient(
                  z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
               );
            this.Button(var1, var2, 0, 166, 140, 32);
            if (var8.Spinner()) {
               int var9 = var8.Checkbox();
               this.Button(
                  var1 + 6, var2 + 7, 0 + var9 % 8 * 18, 198 + var9 / 8 * 18, 18, 18
               );
            }

            String var11 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               var8.ButtonAction()
            );
            if (var7.CustomSpinner() == 1) {
               var11 = var11
                  + " "
                  + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "enchantment.level.2"
                  );
            } else if (var7.CustomSpinner() == 2) {
               var11 = var11
                  + " "
                  + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "enchantment.level.3"
                  );
            } else if (var7.CustomSpinner() == 3) {
               var11 = var11
                  + " "
                  + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "enchantment.level.4"
                  );
            }

            this.BatModJson
               .BatModClient(
                  var11, (float)(var1 + 10 + 18), (float)(var2 + 6), 16777215
               );
            String var10 = ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient(
               var7
            );
            this.BatModJson
               .BatModClient(
                  var10, (float)(var1 + 10 + 18), (float)(var2 + 6 + 10), 8355711
               );
            var2 += var5;
         }
      }
   }
}
