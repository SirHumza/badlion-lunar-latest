import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

public class Lf0vx1VCbztknR73Vb9xPRg9YSqlQgdL5c4jUqRc3WhJF8hSasC9pigeyDY0i3EAWIyMjPpCrIj2ehaUgNT1EMTwBouu0Q9QbVpV implements IChatChannelListener {
   protected String BatModClient;
   protected boolean Button;
   protected Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH CustomSpinner;
   protected List ButtonAction;
   protected LinkedList Spinner;
   protected LinkedList Checkbox;
   protected ChatBadgeData ProgressBar;

   public Lf0vx1VCbztknR73Vb9xPRg9YSqlQgdL5c4jUqRc3WhJF8hSasC9pigeyDY0i3EAWIyMjPpCrIj2ehaUgNT1EMTwBouu0Q9QbVpV(
      dXBqAbjpYv7zSec7fp54hHiuwjK5QijEmx7CKYZ4XMEMLCMe01wHSSPA3HHysMoGWQsEZwTBkjhQVoot5ryw4gXq4Nx7n6FAgY6Y var1, String var2
   ) {
      this.BatModProgressBar = var1;
      this.BatModClient = null;
      this.Button = false;
      this.CustomSpinner = Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.BatModClient;
      this.ButtonAction = Lists.newArrayList();
      this.Spinner = new LinkedList();
      this.Checkbox = new LinkedList();
      this.ProgressBar = null;
      this.BatModClient = var2;
   }

   public Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH BatModClient() {
      return this.CustomSpinner;
   }

   public boolean BatModClient(boolean var1) {
      this.Button = var1;
      ErrorCode var2 = ErrorCode.TTV_EC_SUCCESS;
      if (var1) {
         var2 = this.BatModProgressBar
            .Checkbox
            .connectAnonymous(this.BatModClient, this);
      } else {
         var2 = this.BatModProgressBar
            .Checkbox
            .connect(
               this.BatModClient,
               this.BatModProgressBar.Button,
               this.BatModProgressBar
                  .BatModProgressBar
                  .data,
               this
            );
      }

      if (ErrorCode.failed(var2)) {
         String var3 = ErrorCode.getString(var2);
         this.BatModProgressBar
            .ProgressBar(String.format("Error connecting: %s", var3));
         this.ButtonAction(
            this.BatModClient
         );
         return false;
      } else {
         this.BatModClient(
            Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.Button
         );
         this.CustomSpinner();
         return true;
      }
   }

   public boolean Button() {
      switch (this.CustomSpinner) {
         case CustomSpinner:
         case Button:
            ErrorCode var1 = this.BatModProgressBar
               .Checkbox
               .disconnect(this.BatModClient);
            if (ErrorCode.failed(var1)) {
               String var2 = ErrorCode.getString(var1);
               this.BatModProgressBar
                  .ProgressBar(
                     String.format("Error disconnecting: %s", var2)
                  );
               return false;
            }

            this.BatModClient(
               Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.ButtonAction
            );
            return true;
         case BatModClient:
         case Spinner:
         case ButtonAction:
         default:
            return false;
      }
   }

   protected void BatModClient(
      Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH var1
   ) {
      if (var1 != this.CustomSpinner) {
         this.CustomSpinner = var1;
      }
   }

   public void BatModClient(String var1) {
      if (this.BatModProgressBar.ColorTextPane
         == Uc2kOZaefGe3ngS6hqyO3dG2AIF25BHfFty2Ejyuo5k1Ik0XyvfRZQQVrj4PTy0eOAva7ed4O2P4UXjal0Yz44mYBYXiyZ4s7pCb.BatModClient
         )
       {
         this.Spinner.clear();
         this.Checkbox.clear();
      } else {
         if (this.Spinner.size() > 0) {
            ListIterator var2 = this.Spinner.listIterator();

            while (var2.hasNext()) {
               ChatRawMessage var3 = (ChatRawMessage)var2.next();
               if (var3.userName.equals(var1)) {
                  var2.remove();
               }
            }
         }

         if (this.Checkbox.size() > 0) {
            ListIterator var5 = this.Checkbox.listIterator();

            while (var5.hasNext()) {
               ChatTokenizedMessage var6 = (ChatTokenizedMessage)var5.next();
               if (var6.displayName.equals(var1)) {
                  var5.remove();
               }
            }
         }
      }

      try {
         if (this.BatModProgressBar.BatModClient
            != null) {
            this.BatModProgressBar
               .BatModClient
               .BatModClient(
                  this.BatModClient, var1
               );
         }
      } catch (Exception var4) {
         this.BatModProgressBar
            .ProgressBar(var4.toString());
      }
   }

   public boolean Button(String var1) {
      if (this.CustomSpinner
         != Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.CustomSpinner
         )
       {
         return false;
      } else {
         ErrorCode var2 = this.BatModProgressBar
            .Checkbox
            .sendMessage(this.BatModClient, var1);
         if (ErrorCode.failed(var2)) {
            String var3 = ErrorCode.getString(var2);
            this.BatModProgressBar
               .ProgressBar(
                  String.format("Error sending chat message: %s", var3)
               );
            return false;
         } else {
            return true;
         }
      }
   }

   protected void CustomSpinner() {
      if (this.BatModProgressBar.ColorTextPane
            != Uc2kOZaefGe3ngS6hqyO3dG2AIF25BHfFty2Ejyuo5k1Ik0XyvfRZQQVrj4PTy0eOAva7ed4O2P4UXjal0Yz44mYBYXiyZ4s7pCb.BatModClient
         && this.ProgressBar == null) {
         ErrorCode var1 = this.BatModProgressBar
            .Checkbox
            .downloadBadgeData(this.BatModClient);
         if (ErrorCode.failed(var1)) {
            String var2 = ErrorCode.getString(var1);
            this.BatModProgressBar
               .ProgressBar(
                  String.format("Error trying to download badge data: %s", var2)
               );
         }
      }
   }

   protected void ButtonAction() {
      if (this.ProgressBar == null) {
         this.ProgressBar = new ChatBadgeData();
         ErrorCode var1 = this.BatModProgressBar
            .Checkbox
            .getBadgeData(
               this.BatModClient,
               this.ProgressBar
            );
         if (ErrorCode.succeeded(var1)) {
            try {
               if (this.BatModProgressBar.BatModClient
                  != null) {
                  this.BatModProgressBar
                     .BatModClient
                     .CustomSpinner(
                        this.BatModClient
                     );
               }
            } catch (Exception var3) {
               this.BatModProgressBar
                  .ProgressBar(var3.toString());
            }
         } else {
            this.BatModProgressBar
               .ProgressBar(
                  "Error preparing badge data: " + ErrorCode.getString(var1)
               );
         }
      }
   }

   protected void Spinner() {
      if (this.ProgressBar != null) {
         ErrorCode var1 = this.BatModProgressBar
            .Checkbox
            .clearBadgeData(this.BatModClient);
         if (ErrorCode.succeeded(var1)) {
            this.ProgressBar = null;

            try {
               if (this.BatModProgressBar.BatModClient
                  != null) {
                  this.BatModProgressBar
                     .BatModClient
                     .ButtonAction(
                        this.BatModClient
                     );
               }
            } catch (Exception var3) {
               this.BatModProgressBar
                  .ProgressBar(var3.toString());
            }
         } else {
            this.BatModProgressBar
               .ProgressBar(
                  "Error releasing badge data: " + ErrorCode.getString(var1)
               );
         }
      }
   }

   protected void CustomSpinner(String var1) {
      try {
         if (this.BatModProgressBar.BatModClient
            != null) {
            this.BatModProgressBar
               .BatModClient
               .BatModClient(var1);
         }
      } catch (Exception var3) {
         this.BatModProgressBar
            .ProgressBar(var3.toString());
      }
   }

   protected void ButtonAction(String var1) {
      try {
         if (this.BatModProgressBar.BatModClient
            != null) {
            this.BatModProgressBar
               .BatModClient
               .Button(var1);
         }
      } catch (Exception var3) {
         this.BatModProgressBar
            .ProgressBar(var3.toString());
      }
   }

   private void Checkbox() {
      if (this.CustomSpinner
         != Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.Spinner
         )
       {
         this.BatModClient(
            Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.Spinner
         );
         this.ButtonAction(
            this.BatModClient
         );
         this.Spinner();
      }
   }

   public void chatStatusCallback(String var1, ErrorCode var2) {
      if (!ErrorCode.succeeded(var2)) {
         this.BatModProgressBar
            .ColorChooser
            .remove(var1);
         this.Checkbox();
      }
   }

   public void chatChannelMembershipCallback(String var1, ChatEvent var2, ChatChannelInfo var3) {
      switch (var2) {
         case TTV_CHAT_JOINED_CHANNEL:
            this.BatModClient(
               Vy7OcfiCIVJcOxcWKxp7CHnTCgV3xB2BHpbSG9x41Er39Ab2TelpmbwWOmxUV9ZC4nnq5JEidtsEddJk8tljVmlZe5qk35ZLp9TH.CustomSpinner
            );
            this.CustomSpinner(var1);
            break;
         case TTV_CHAT_LEFT_CHANNEL:
            this.Checkbox();
      }
   }

   public void chatChannelUserChangeCallback(String var1, ChatUserInfo[] var2, ChatUserInfo[] var3, ChatUserInfo[] var4) {
      for (int var5 = 0; var5 < var3.length; var5++) {
         int var6 = this.ButtonAction.indexOf(var3[var5]);
         if (var6 >= 0) {
            this.ButtonAction.remove(var6);
         }
      }

      for (int var8 = 0; var8 < var4.length; var8++) {
         int var10 = this.ButtonAction.indexOf(var4[var8]);
         if (var10 >= 0) {
            this.ButtonAction.remove(var10);
         }

         this.ButtonAction.add(var4[var8]);
      }

      for (int var9 = 0; var9 < var2.length; var9++) {
         this.ButtonAction.add(var2[var9]);
      }

      try {
         if (this.BatModProgressBar.BatModClient
            != null) {
            this.BatModProgressBar
               .BatModClient
               .BatModClient(
                  this.BatModClient, var2, var3, var4
               );
         }
      } catch (Exception var7) {
         this.BatModProgressBar
            .ProgressBar(var7.toString());
      }
   }

   public void chatChannelRawMessageCallback(String var1, ChatRawMessage[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         this.Spinner.addLast(var2[var3]);
      }

      try {
         if (this.BatModProgressBar.BatModClient
            != null) {
            this.BatModProgressBar
               .BatModClient
               .BatModClient(
                  this.BatModClient, var2
               );
         }
      } catch (Exception var4) {
         this.BatModProgressBar
            .ProgressBar(var4.toString());
      }

      while (
         this.Spinner.size()
            > this.BatModProgressBar.IntegerSpinner
      ) {
         this.Spinner.removeFirst();
      }
   }

   public void chatChannelTokenizedMessageCallback(String var1, ChatTokenizedMessage[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         this.Checkbox.addLast(var2[var3]);
      }

      try {
         if (this.BatModProgressBar.BatModClient
            != null) {
            this.BatModProgressBar
               .BatModClient
               .BatModClient(
                  this.BatModClient, var2
               );
         }
      } catch (Exception var4) {
         this.BatModProgressBar
            .ProgressBar(var4.toString());
      }

      while (
         this.Checkbox.size()
            > this.BatModProgressBar.IntegerSpinner
      ) {
         this.Checkbox.removeFirst();
      }
   }

   public void chatClearCallback(String var1, String var2) {
      this.BatModClient(var2);
   }

   public void chatBadgeDataDownloadCallback(String var1, ErrorCode var2) {
      if (ErrorCode.succeeded(var2)) {
         this.ButtonAction();
      }
   }
}
