import com.mojang.authlib.Agent;
import com.mojang.authlib.BaseUserAuthentication;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.util.UUID;

public class ColorTextPane
   extends ColorChooser {
   public ColorTextPane(String var1, String var2) {
      super(var1, var2);
   }

   public ColorTextPane(
      ButtonAction var1
   ) {
      super(var1);
   }

   @Override
   public void BatModClient(
      IntegerSpinner var1
   ) {
      YggdrasilUserAuthentication var2 = (YggdrasilUserAuthentication)new YggdrasilAuthenticationService(
            Proxy.NO_PROXY,
            BatModClient.BatModClient()
               .IntegerSpinner()
               .Button()
         )
         .createUserAuthentication(Agent.MINECRAFT);
      var2.setUsername(this.BatModClient);
      var2.setPassword(this.Button);

      try {
         var2.logIn();
         GameProfile var3 = var2.getSelectedProfile();
         var1.BatModClient(
            new ButtonAction(
               var2.getAuthenticatedToken(),
               var3.isLegacy(),
               UUID.randomUUID(),
               new BatModProgressBar(var3.getId(), var3.getName()),
               var2.getUserID(),
               ProgressBar.BatModClient,
               this.BatModClient
            ),
            rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "bm.accountmanager.added_account"
            )
         );
      } catch (AuthenticationException var4) {
         var4.printStackTrace();
         var1.BatModClient(var4.getMessage());
      }
   }

   @Override
   public void Button(
      IntegerSpinner var1
   ) {
      YggdrasilUserAuthentication var2 = (YggdrasilUserAuthentication)new YggdrasilAuthenticationService(
            Proxy.NO_PROXY,
            BatModClient.BatModClient()
               .IntegerSpinner()
               .Button()
         )
         .createUserAuthentication(Agent.MINECRAFT);
      var2.setUsername(
         this.CustomSpinner
            .ColorChooser()
      );

      try {
         Field var3 = YggdrasilUserAuthentication.class.getDeclaredField("accessToken");
         var3.setAccessible(true);
         var3.set(
            var2,
            this.CustomSpinner
               .BatModClient()
         );
         var3 = BaseUserAuthentication.class.getDeclaredField("userid");
         var3.setAccessible(true);
         var3.set(
            var2,
            this.CustomSpinner
               .Spinner()
         );
      } catch (IllegalAccessException | NoSuchFieldException var4) {
         var4.printStackTrace();
      }

      try {
         var2.logIn();
         this.CustomSpinner
            .BatModClient(var2.getAuthenticatedToken());
         var1.BatModClient(
            this.CustomSpinner, null
         );
      } catch (AuthenticationException var5) {
         BatModClient.BatModClient()
            .IntegerSpinner()
            .Button(
               this.CustomSpinner
            );
         if (var5.getMessage() != null && var5.getMessage().equals("Token does not exist")) {
            var1.BatModClient(
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "bm.accountmanager.error.token_expired"
               )
            );
            return;
         }

         var1.BatModClient(
            rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "bm.accountmanager.error.invalid_credentials"
            )
         );
      }
   }
}
