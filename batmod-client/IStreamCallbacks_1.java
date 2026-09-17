import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class ZziBzAp7hTnoBjTCANVrBhDmvrz9RuWVKqyqVIuo2AfTvnFwBTxbC0v6zIOv2YjubQtgV7JMSFRXvVSuXQqy2JZxOgVaM9OhsTVl implements IStreamCallbacks {
   ZziBzAp7hTnoBjTCANVrBhDmvrz9RuWVKqyqVIuo2AfTvnFwBTxbC0v6zIOv2YjubQtgV7JMSFRXvVSuXQqy2JZxOgVaM9OhsTVl(
      eH9sOnHXG7qDt2mxGJ8B4vwJAyUY1TajZMR9deJNTIyi0YFVl5IuuOstRKW74GFlLjLi0juc31y30HSBS1nJYYThVr54fkf5Krj var1
   ) {
      this.BatModClient = var1;
   }

   public void requestAuthTokenCallback(ErrorCode var1, AuthToken var2) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient.InstallationLogger = var2;
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.ButtonAction
            );
      } else {
         this.BatModClient
            .InstallationLogger
            .data = "";
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.Button
            );
         String var3 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("RequestAuthTokenDoneCallback got failure: %s", var3)
            );
      }

      try {
         if (this.BatModClient.CustomSpinner
            != null) {
            this.BatModClient
               .CustomSpinner
               .BatModClient(var1, var2);
         }
      } catch (Exception var4) {
         this.BatModClient
            .Button(var4.toString());
      }
   }

   public void loginCallback(ErrorCode var1, ChannelInfo var2) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = var2;
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.Checkbox
            );
         this.BatModClient.BatModInstallerMain = true;
      } else {
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.Button
            );
         this.BatModClient.BatModInstallerMain = false;
         String var3 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("LoginCallback got failure: %s", var3)
            );
      }

      try {
         if (this.BatModClient.CustomSpinner
            != null) {
            this.BatModClient
               .CustomSpinner
               .BatModClient(var1);
         }
      } catch (Exception var4) {
         this.BatModClient
            .Button(var4.toString());
      }
   }

   public void getIngestServersCallback(ErrorCode var1, IngestList var2) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = var2;
         this.BatModClient.Downloader = this.BatModClient
            .RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
            .getDefaultServer();
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.BatModProgressBar
            );

         try {
            if (this.BatModClient.CustomSpinner
               != null) {
               this.BatModClient
                  .CustomSpinner
                  .BatModClient(var2);
            }
         } catch (Exception var4) {
            this.BatModClient
               .Button(var4.toString());
         }
      } else {
         String var3 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("IngestListCallback got failure: %s", var3)
            );
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.Spinner
            );
      }
   }

   public void getUserInfoCallback(ErrorCode var1, UserInfo var2) {
      this.BatModClient.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = var2;
      if (ErrorCode.failed(var1)) {
         String var3 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("UserInfoDoneCallback got failure: %s", var3)
            );
      }
   }

   public void getStreamInfoCallback(ErrorCode var1, StreamInfo var2) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient.ExitCode = var2;

         try {
            if (this.BatModClient.CustomSpinner
               != null) {
               this.BatModClient
                  .CustomSpinner
                  .BatModClient(var2);
            }
         } catch (Exception var4) {
            this.BatModClient
               .Button(var4.toString());
         }
      } else {
         String var3 = ErrorCode.getString(var1);
         this.BatModClient
            .CustomSpinner(
               String.format("StreamInfoDoneCallback got failure: %s", var3)
            );
      }
   }

   public void getArchivingStateCallback(ErrorCode var1, ArchivingState var2) {
      this.BatModClient.BatModJson = var2;
      if (ErrorCode.failed(var1)) {
      }
   }

   public void runCommercialCallback(ErrorCode var1) {
      if (ErrorCode.failed(var1)) {
         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .CustomSpinner(
               String.format("RunCommercialCallback got failure: %s", var2)
            );
      }
   }

   public void setStreamInfoCallback(ErrorCode var1) {
      if (ErrorCode.failed(var1)) {
         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .CustomSpinner(
               String.format("SetStreamInfoCallback got failure: %s", var2)
            );
      }
   }

   public void getGameNameListCallback(ErrorCode var1, GameInfoList var2) {
      if (ErrorCode.failed(var1)) {
         String var3 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("GameNameListCallback got failure: %s", var3)
            );
      }

      try {
         if (this.BatModClient.CustomSpinner
            != null) {
            this.BatModClient
               .CustomSpinner
               .BatModClient(
                  var1, var2 == null ? new GameInfo[0] : var2.list
               );
         }
      } catch (Exception var4) {
         this.BatModClient
            .Button(var4.toString());
      }
   }

   public void bufferUnlockCallback(long var1) {
      FrameBuffer var3 = FrameBuffer.lookupBuffer(var1);
      this.BatModClient
         .TextField
         .add(var3);
   }

   public void startCallback(ErrorCode var1) {
      if (ErrorCode.succeeded(var1)) {
         try {
            if (this.BatModClient.CustomSpinner
               != null) {
               this.BatModClient
                  .CustomSpinner
                  .Button();
            }
         } catch (Exception var4) {
            this.BatModClient
               .Button(var4.toString());
         }

         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.TextField
            );
      } else {
         this.BatModClient.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = null;
         this.BatModClient.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = null;
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.ColorChooser
            );

         try {
            if (this.BatModClient.CustomSpinner
               != null) {
               this.BatModClient
                  .CustomSpinner
                  .CustomSpinner(var1);
            }
         } catch (Exception var3) {
            this.BatModClient
               .Button(var3.toString());
         }

         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("startCallback got failure: %s", var2)
            );
      }
   }

   public void stopCallback(ErrorCode var1) {
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = null;
         this.BatModClient.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = null;
         this.BatModClient
            .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();

         try {
            if (this.BatModClient.CustomSpinner
               != null) {
               this.BatModClient
                  .CustomSpinner
                  .CustomSpinner();
            }
         } catch (Exception var3) {
            this.BatModClient
               .Button(var3.toString());
         }

         if (this.BatModClient.BatModInstallerMain
            )
          {
            this.BatModClient
               .BatModClient(
                  juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.ColorChooser
               );
         } else {
            this.BatModClient
               .BatModClient(
                  juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.Button
               );
         }
      } else {
         this.BatModClient
            .BatModClient(
               juyV5pEqj2zf0l34CXJ4NCg50R0gepEwgErdqcAL7FAz376SUBcP6OArpvx799OrHNNsDi6u46totSrMvJ9MdijLvJEgETLwj49H.ColorChooser
            );
         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("stopCallback got failure: %s", var2)
            );
      }
   }

   public void sendActionMetaDataCallback(ErrorCode var1) {
      if (ErrorCode.failed(var1)) {
         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("sendActionMetaDataCallback got failure: %s", var2)
            );
      }
   }

   public void sendStartSpanMetaDataCallback(ErrorCode var1) {
      if (ErrorCode.failed(var1)) {
         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("sendStartSpanMetaDataCallback got failure: %s", var2)
            );
      }
   }

   public void sendEndSpanMetaDataCallback(ErrorCode var1) {
      if (ErrorCode.failed(var1)) {
         String var2 = ErrorCode.getString(var1);
         this.BatModClient
            .Button(
               String.format("sendEndSpanMetaDataCallback got failure: %s", var2)
            );
      }
   }
}
