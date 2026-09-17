public class S0HO1qGhfimD3frNGpy5mx8TqBkWXZcpf9yEMHYmbvmB5EXx4FEhhFx6T5ytmO7wbWzwLBu2OdzhwrF4gO2CAwaPvB4ZtZ9ue0ZH
   extends knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 {
   private boolean ColorChooser = false;

   public S0HO1qGhfimD3frNGpy5mx8TqBkWXZcpf9yEMHYmbvmB5EXx4FEhhFx6T5ytmO7wbWzwLBu2OdzhwrF4gO2CAwaPvB4ZtZ9ue0ZH(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public boolean BatModClient() {
      return this.ColorChooser;
   }

   public void BatModClient(boolean var1) {
      this.ColorChooser = var1;
   }

   @Override
   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.ProgressBar) {
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3.BatModClient
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         boolean var4 = var2 >= this.Button
            && var3 >= this.CustomSpinner
            && var2 < this.Button + this.width
            && var3 < this.CustomSpinner + this.height;
         ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g var5;
         if (this.ColorChooser) {
            if (!this.Checkbox) {
               var5 = ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g.CustomSpinner;
            } else if (var4) {
               var5 = ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g.Button;
            } else {
               var5 = ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g.BatModClient;
            }
         } else if (!this.Checkbox) {
            var5 = ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g.Checkbox;
         } else if (var4) {
            var5 = ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g.Spinner;
         } else {
            var5 = ur9GIpiqLfDJ7k5F2SxpcqyjuzcJj28Ank8GJnbLLzPPhikKvcDQRu9oRLQp2SX5BpfCi4WOWOSho0uywoijjVmCjrpTa2jTbK0g.ButtonAction;
         }

         this.Button(
            this.Button,
            this.CustomSpinner,
            var5.BatModClient(),
            var5.Button(),
            this.width,
            this.height
         );
      }
   }
}
