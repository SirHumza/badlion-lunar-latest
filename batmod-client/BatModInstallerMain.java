import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class BatModInstallerMain extends Stage {
   public BatModInstallerMain(
      aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA var1
   ) {
      this.setTitle(
         rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            "bm.accountmanager.window_title"
         )
      );
      this.setResizable(false);
      this.setOnCloseRequest(var2 -> {
         this.BatModClient();
         var1.call();
      });
   }

   public void BatModClient(WebView var1) {
      this.setScene(new Scene(var1, 1000.0, 650.0));
      this.requestFocus();
      this.show();
   }

   public void BatModClient() {
      this.hide();
   }
}
