import com.google.common.collect.Maps;
import java.util.Map;

public enum mtjk5pIZZ2QkN220eRVOTlxh3EzVKoZK6nlkT55ZdLvjN4Xx0itqQBVlRYbeIpsnJLpdK6RFrzU7Kg7dEExUMd5I2FL1cyVIqfs {
   BatModClient(
      "vertex",
      ".vsh",
      net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
   ),
   Button(
      "fragment",
      ".fsh",
      net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
   );

   private final String CustomSpinner;
   private final String ButtonAction;
   private final int Spinner;
   private final Map Checkbox = Maps.newHashMap();

   mtjk5pIZZ2QkN220eRVOTlxh3EzVKoZK6nlkT55ZdLvjN4Xx0itqQBVlRYbeIpsnJLpdK6RFrzU7Kg7dEExUMd5I2FL1cyVIqfs(String var3, String var4, int var5) {
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
   }

   public String BatModClient() {
      return this.CustomSpinner;
   }

   protected String Button() {
      return this.ButtonAction;
   }

   protected int CustomSpinner() {
      return this.Spinner;
   }

   protected Map ButtonAction() {
      return this.Checkbox;
   }
}
