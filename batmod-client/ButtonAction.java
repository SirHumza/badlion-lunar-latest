import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Base64;
import java.util.UUID;
import java.util.Map.Entry;

public class ButtonAction {
   private String BatModClient;
   private boolean Button;
   private UUID CustomSpinner;
   private BatModProgressBar ButtonAction;
   private String Spinner;
   private ProgressBar Checkbox;
   private String ProgressBar;
   private p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModProgressBar;
   private boolean ColorChooser;

   public ButtonAction(
      String var1,
      boolean var2,
      UUID var3,
      BatModProgressBar var4,
      String var5,
      ProgressBar var6,
      String var7
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.Checkbox = var6;
      this.ProgressBar = var7;
      this.BatModProgressBar = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "batmod/account_skin/"
            + UUIDTypeAdapter.fromUUID(
               this.ButtonAction
                  .BatModClient()
            )
      );
      G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr.BatModClient(
         this.ButtonAction
            .BatModClient(),
         var1x -> {
            this.ButtonAction
               .BatModClient(
                  var1x.Button()
               );

            for (Property var3x : var1x.CustomSpinner()) {
               if (var3x.getName().equals("textures")) {
                  InstallationLogger var4x = Downloader.BatModClient(
                     new String(Base64.getDecoder().decode(var3x.getValue()))
                  );

                  for (Entry var6x : var4x.ButtonAction().entrySet()) {
                     if (var6x.getKey() == Type.SKIN) {
                        Spinner var7x = new Spinner(
                           this
                        );
                        net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var8 = new net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR(
                           null, (String)var6x.getValue(), null, var7x
                        );
                        var8.Button = true;
                        AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                           .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
                           .BatModClient(
                              this.BatModProgressBar, var8
                           );
                        this.ColorChooser = true;
                     }
                  }
               }
            }
         }
      );
   }

   protected ButtonAction() {
      this.ButtonAction = new BatModProgressBar(
         UUID.randomUUID(),
         "§c"
            + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "bm.invalid"
            )
      );
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.Button;
   }

   public UUID CustomSpinner() {
      return this.CustomSpinner;
   }

   public BatModProgressBar ButtonAction() {
      return this.ButtonAction;
   }

   public String Spinner() {
      return this.Spinner;
   }

   public ProgressBar Checkbox() {
      return this.Checkbox;
   }

   public String ProgressBar() {
      return this.ButtonAction
         .Button();
   }

   public UUID BatModProgressBar() {
      return this.ButtonAction
         .BatModClient();
   }

   public String ColorChooser() {
      return this.ProgressBar;
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD IntegerSpinner() {
      return this.ColorChooser
         ? this.BatModProgressBar
         : L4uaVMCd3oGSH0oCjM3VDqaD9VO3BiV9lih4UOOYQ3zS9zoArGhufbuPZuU1skykagKo9dxU6loDnqdolcTTJAvcLcmbD5ukewav.BatModClient(
            this.ButtonAction
               .BatModClient()
         );
   }

   public void BatModClient(String var1) {
      this.BatModClient = var1;
   }

   public void BatModClient(
      IntegerSpinner var1
   ) {
      Checkbox var2 = BatModClient.BatModClient()
         .IntegerSpinner();
      if (this == var2.Spinner()) {
         var1.BatModClient(
            rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "bm.accountmanager.error.account_invalid"
            )
         );
      } else {
         ColorChooser var3 = this.Checkbox
               == ProgressBar.BatModClient
            ? new ColorTextPane(this)
            : new TextField(this);
         var3.Button(var1);
      }
   }
}
