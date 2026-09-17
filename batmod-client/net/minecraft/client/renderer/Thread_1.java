package net.minecraft.client.renderer;

import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

class jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2 extends Thread {
   private static final String Button = "CL_00001050";

   jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2(
      net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR var1, String var2
   ) {
      super(var2);
      this.BatModClient = var1;
   }

   @Override
   public void run() {
      HttpURLConnection var1 = null;
      net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.CustomSpinner()
         .debug(
            "Downloading http texture from {} to {}",
            new Object[]{
               net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.BatModClient(
                  this.BatModClient
               ),
               net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Button(
                  this.BatModClient
               )
            }
         );
      if (net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.CustomSpinner(
         this.BatModClient
      )) {
         net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.ButtonAction(
            this.BatModClient
         );
      } else {
         try {
            var1 = (HttpURLConnection)new URL(
                  net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.BatModClient(
                     this.BatModClient
                  )
               )
               .openConnection(
                  AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                     .WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
               );
            var1.setDoInput(true);
            var1.setDoOutput(false);
            var1.connect();
            if (var1.getResponseCode() / 100 == 2) {
               BufferedImage var2;
               if (net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Button(
                     this.BatModClient
                  )
                  != null) {
                  FileUtils.copyInputStreamToFile(
                     var1.getInputStream(),
                     net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Button(
                        this.BatModClient
                     )
                  );
                  var2 = ImageIO.read(
                     net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Button(
                        this.BatModClient
                     )
                  );
               } else {
                  var2 = oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
                     var1.getInputStream()
                  );
               }

               if (net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Spinner(
                     this.BatModClient
                  )
                  != null) {
                  var2 = net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Spinner(
                        this.BatModClient
                     )
                     .BatModClient(var2);
               }

               this.BatModClient
                  .BatModClient(var2);
               return;
            }

            if (var1.getErrorStream() != null) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
                  var1.getErrorStream()
               );
            }

            return;
         } catch (Exception var6) {
            net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.CustomSpinner()
               .error("Couldn't download http texture: " + var6.getClass().getName() + ": " + var6.getMessage());
         } finally {
            if (var1 != null) {
               var1.disconnect();
            }

            this.BatModClient.BatModClient = net.minecraft.client.renderer.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR.Checkbox(
                  this.BatModClient
               )
               != null;
         }
      }
   }
}
