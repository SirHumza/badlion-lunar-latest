import tv.twitch.ErrorCode;
import tv.twitch.chat.IChatAPIListener;

class ZOFqyx8J85PdO4nJjysgt3zME01ADwRMd8Lyi3HejMI3RV8e11tv2QwAIjR2va2Aqn3GBMclXKjp9krgnBCUmD38KsXNi9ZJ5hPk implements IChatAPIListener {
   ZOFqyx8J85PdO4nJjysgt3zME01ADwRMd8Lyi3HejMI3RV8e11tv2QwAIjR2va2Aqn3GBMclXKjp9krgnBCUmD38KsXNi9ZJ5hPk(
      dXBqAbjpYv7zSec7fp54hHiuwjK5QijEmx7CKYZ4XMEMLCMe01wHSSPA3HHysMoGWQsEZwTBkjhQVoot5ryw4gXq4Nx7n6FAgY6Y var1
   ) {
      this.BatModClient = var1;
   }

   public void chatInitializationCallback(ErrorCode var1) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient
            .Checkbox
            .setMessageFlushInterval(
               this.BatModClient.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            );
         this.BatModClient
            .Checkbox
            .setUserChangeEventInterval(
               this.BatModClient.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
            );
         this.BatModClient
            .Checkbox();
         this.BatModClient
            .BatModClient(
               K8kdtuqdgwZ5HqZHArQfmiyBqudd3v0hXzzY29eWxfWgIM1n2h3he8J0HGOCfpcfCR6S5TWhHq5OBPlgaWv3BmDMv49BbUaqZdmj.CustomSpinner
            );
      } else {
         this.BatModClient
            .BatModClient(
               K8kdtuqdgwZ5HqZHArQfmiyBqudd3v0hXzzY29eWxfWgIM1n2h3he8J0HGOCfpcfCR6S5TWhHq5OBPlgaWv3BmDMv49BbUaqZdmj.BatModClient
            );
      }

      try {
         if (this.BatModClient.BatModClient
            != null) {
            this.BatModClient
               .BatModClient
               .ButtonAction(var1);
         }
      } catch (Exception var3) {
         this.BatModClient
            .ProgressBar(var3.toString());
      }
   }

   public void chatShutdownCallback(ErrorCode var1) {
      if (ErrorCode.succeeded(var1)) {
         ErrorCode var2 = this.BatModClient
            .Spinner
            .shutdown();
         if (ErrorCode.failed(var2)) {
            String var3 = ErrorCode.getString(var2);
            this.BatModClient
               .ProgressBar(
                  String.format("Error shutting down the Twitch sdk: %s", var3)
               );
         }

         this.BatModClient
            .BatModClient(
               K8kdtuqdgwZ5HqZHArQfmiyBqudd3v0hXzzY29eWxfWgIM1n2h3he8J0HGOCfpcfCR6S5TWhHq5OBPlgaWv3BmDMv49BbUaqZdmj.BatModClient
            );
      } else {
         this.BatModClient
            .BatModClient(
               K8kdtuqdgwZ5HqZHArQfmiyBqudd3v0hXzzY29eWxfWgIM1n2h3he8J0HGOCfpcfCR6S5TWhHq5OBPlgaWv3BmDMv49BbUaqZdmj.CustomSpinner
            );
         this.BatModClient
            .ProgressBar(
               String.format("Error shutting down Twith chat: %s", var1)
            );
      }

      try {
         if (this.BatModClient.BatModClient
            != null) {
            this.BatModClient
               .BatModClient
               .Spinner(var1);
         }
      } catch (Exception var4) {
         this.BatModClient
            .ProgressBar(var4.toString());
      }
   }

   public void chatEmoticonDataDownloadCallback(ErrorCode var1) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient
            .ProgressBar();
      }
   }
}
