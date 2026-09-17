import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class Y7A0LeaZWWmXLAsux6qT4ZgKhX1Xzut5i9NN5TQBwLpuVVRxg8jPv6RzIKZDDvMquLS21ve2SezeIpeRJq2u63QlmO30pOFQVbBP implements IStreamCallbacks {
   Y7A0LeaZWWmXLAsux6qT4ZgKhX1Xzut5i9NN5TQBwLpuVVRxg8jPv6RzIKZDDvMquLS21ve2SezeIpeRJq2u63QlmO30pOFQVbBP(
      nA9Swv5o7xchcGNov04Rc0EQOlLmcISyrrvTO5Q7JLj9uygdiTxWKxuEBGTannv9y4ccbH9j97suVd75z5jIIPrrkLPp9KGuidFx var1
   ) {
      this.BatModClient = var1;
   }

   public void requestAuthTokenCallback(ErrorCode var1, AuthToken var2) {
   }

   public void loginCallback(ErrorCode var1, ChannelInfo var2) {
   }

   public void getIngestServersCallback(ErrorCode var1, IngestList var2) {
   }

   public void getUserInfoCallback(ErrorCode var1, UserInfo var2) {
   }

   public void getStreamInfoCallback(ErrorCode var1, StreamInfo var2) {
   }

   public void getArchivingStateCallback(ErrorCode var1, ArchivingState var2) {
   }

   public void runCommercialCallback(ErrorCode var1) {
   }

   public void setStreamInfoCallback(ErrorCode var1) {
   }

   public void getGameNameListCallback(ErrorCode var1, GameInfoList var2) {
   }

   public void bufferUnlockCallback(long var1) {
   }

   public void startCallback(ErrorCode var1) {
      this.BatModClient.BatModJson = false;
      if (ErrorCode.succeeded(var1)) {
         this.BatModClient.ExitCode = true;
         this.BatModClient.TextField = System.currentTimeMillis();
         this.BatModClient
            .BatModClient(
               bAeDD91e6KqQ3vgAuRrI6499AemOLJsWKkxqL9hp6f1nGoiJqHrKUpq9Hzj5ydklQNWgWFwN1P6GXQcqtW04GI7j97F2AWhKtjfk.CustomSpinner
            );
      } else {
         this.BatModClient.BatModInstallerMain = false;
         this.BatModClient
            .BatModClient(
               bAeDD91e6KqQ3vgAuRrI6499AemOLJsWKkxqL9hp6f1nGoiJqHrKUpq9Hzj5ydklQNWgWFwN1P6GXQcqtW04GI7j97F2AWhKtjfk.Spinner
            );
      }
   }

   public void stopCallback(ErrorCode var1) {
      if (ErrorCode.failed(var1)) {
         System.out
            .println(
               "IngestTester.stopCallback failed to stop - "
                  + this.BatModClient
                     .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .serverName
                  + ": "
                  + var1.toString()
            );
      }

      this.BatModClient.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = false;
      this.BatModClient.ExitCode = false;
      this.BatModClient
         .BatModClient(
            bAeDD91e6KqQ3vgAuRrI6499AemOLJsWKkxqL9hp6f1nGoiJqHrKUpq9Hzj5ydklQNWgWFwN1P6GXQcqtW04GI7j97F2AWhKtjfk.Spinner
         );
      this.BatModClient.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = null;
      if (this.BatModClient.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         )
       {
         this.BatModClient
            .BatModClient(
               bAeDD91e6KqQ3vgAuRrI6499AemOLJsWKkxqL9hp6f1nGoiJqHrKUpq9Hzj5ydklQNWgWFwN1P6GXQcqtW04GI7j97F2AWhKtjfk.ProgressBar
            );
      }
   }

   public void sendActionMetaDataCallback(ErrorCode var1) {
   }

   public void sendStartSpanMetaDataCallback(ErrorCode var1) {
   }

   public void sendEndSpanMetaDataCallback(ErrorCode var1) {
   }
}
