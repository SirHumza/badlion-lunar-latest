import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class ntQtaO7O2GjodYsmlbGxP9BDhAVfUrZW3YDfgs2sOsRwEoQgh3iN4hDtc67oHQUuttZ0YAf2JlbOKMxTVXDBjZJMgtaU5TZsdW5b
   extends nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 {
   private static final C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr BatModClient = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.CustomSpinner;
   private static final C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr Button = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.BatModInstallerMain;
   private static final C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr CustomSpinner = C3cdxfCtUxBOCD4OLW1zjkGaXWuymEKlLQppyfN5BpyqTJK1qa6a5Eys11gsmSs3yT227iadxeI1VnxBYSqPgvavMBE9DkG8zPBr.Checkbox;
   private final ChatUserInfo ButtonAction;
   private final WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY Spinner;
   private final List Checkbox = Lists.newArrayList();
   private final IfuVVy7j7Fxc4PclUHf3sDym6TnZmpDD3AeABRHuf8vUbrANKTwVe6oF6H4nukcr3HQuLgF86OzqUBTXiT1nHdwdndTpJSmEblZd ProgressBar;
   private int BatModProgressBar;

   public ntQtaO7O2GjodYsmlbGxP9BDhAVfUrZW3YDfgs2sOsRwEoQgh3iN4hDtc67oHQUuttZ0YAf2JlbOKMxTVXDBjZJMgtaU5TZsdW5b(
      IfuVVy7j7Fxc4PclUHf3sDym6TnZmpDD3AeABRHuf8vUbrANKTwVe6oF6H4nukcr3HQuLgF86OzqUBTXiT1nHdwdndTpJSmEblZd var1, ChatUserInfo var2
   ) {
      this.ProgressBar = var1;
      this.ButtonAction = var2;
      this.Spinner = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
         var2.displayName
      );
      this.Checkbox
         .addAll(BatModClient(var2.modes, var2.subscriptions, var1));
   }

   public static List BatModClient(
      Set var0, Set var1, IfuVVy7j7Fxc4PclUHf3sDym6TnZmpDD3AeABRHuf8vUbrANKTwVe6oF6H4nukcr3HQuLgF86OzqUBTXiT1nHdwdndTpJSmEblZd var2
   ) {
      String var3 = var2 == null ? null : var2.BatModJson();
      boolean var4 = var2 != null && var2.ExitCode();
      ArrayList var5 = Lists.newArrayList();

      for (ChatUserMode var7 : var0) {
         WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var8 = BatModClient(
            var7, var3, var4
         );
         if (var8 != null) {
            E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl var9 = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
               "- "
            );
            var9.BatModClient(var8);
            var5.add(var9);
         }
      }

      for (ChatUserSubscription var11 : var1) {
         WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var12 = BatModClient(
            var11, var3, var4
         );
         if (var12 != null) {
            E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl var13 = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(
               "- "
            );
            var13.BatModClient(var12);
            var5.add(var13);
         }
      }

      return var5;
   }

   public static WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY BatModClient(
      ChatUserSubscription var0, String var1, boolean var2
   ) {
      emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var3 = null;
      if (var0 == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
         if (var1 == null) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "stream.user.subscription.subscriber"
            );
         } else if (var2) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "stream.user.subscription.subscriber.self"
            );
         } else {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "stream.user.subscription.subscriber.other", var1
            );
         }

         var3.ProgressBar()
            .BatModClient(
               BatModClient
            );
      } else if (var0 == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
         var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.subscription.turbo");
         var3.ProgressBar()
            .BatModClient(
               CustomSpinner
            );
      }

      return var3;
   }

   public static WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY BatModClient(
      ChatUserMode var0, String var1, boolean var2
   ) {
      emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var3 = null;
      if (var0 == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
         var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.administrator");
         var3.ProgressBar()
            .BatModClient(
               CustomSpinner
            );
      } else if (var0 == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
         if (var1 == null) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.banned");
         } else if (var2) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.banned.self");
         } else {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "stream.user.mode.banned.other", var1
            );
         }

         var3.ProgressBar()
            .BatModClient(
               Button
            );
      } else if (var0 == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
         if (var1 == null) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.broadcaster");
         } else if (var2) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.broadcaster.self");
         } else {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "stream.user.mode.broadcaster.other"
            );
         }

         var3.ProgressBar()
            .BatModClient(
               BatModClient
            );
      } else if (var0 == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
         if (var1 == null) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.moderator");
         } else if (var2) {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.moderator.self");
         } else {
            var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "stream.user.mode.moderator.other", var1
            );
         }

         var3.ProgressBar()
            .BatModClient(
               BatModClient
            );
      } else if (var0 == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
         var3 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01("stream.user.mode.staff");
         var3.ProgressBar()
            .BatModClient(
               CustomSpinner
            );
      }

      return var3;
   }

   @Override
   public void BatModClient() {
      int var1 = this.TextField / 3;
      int var2 = var1 - 130;
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               1,
               var1 * 0 + var2 / 2,
               this.ColorTextPane - 70,
               130,
               20,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "stream.userinfo.timeout"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               0,
               var1 * 1 + var2 / 2,
               this.ColorTextPane - 70,
               130,
               20,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "stream.userinfo.ban"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               2,
               var1 * 2 + var2 / 2,
               this.ColorTextPane - 70,
               130,
               20,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "stream.userinfo.mod"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               5,
               var1 * 0 + var2 / 2,
               this.ColorTextPane - 45,
               130,
               20,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "gui.cancel"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               3,
               var1 * 1 + var2 / 2,
               this.ColorTextPane - 45,
               130,
               20,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "stream.userinfo.unban"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               4,
               var1 * 2 + var2 / 2,
               this.ColorTextPane - 45,
               130,
               20,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "stream.userinfo.unmod"
               )
            )
         );
      int var3 = 0;

      for (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var5 : this.Checkbox) {
         var3 = Math.max(
            var3,
            this.BatModJson
               .BatModClient(
                  var5.ColorChooser()
               )
         );
      }

      this.BatModProgressBar = this.TextField
            / 2
         - var3 / 2;
   }

   @Override
   protected void BatModClient(
      knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var1
   ) {
      if (var1.Checkbox) {
         if (var1.Spinner == 0) {
            this.ProgressBar
               .Checkbox(
                  "/ban " + this.ButtonAction.displayName
               );
         } else if (var1.Spinner == 3) {
            this.ProgressBar
               .Checkbox(
                  "/unban " + this.ButtonAction.displayName
               );
         } else if (var1.Spinner == 2) {
            this.ProgressBar
               .Checkbox(
                  "/mod " + this.ButtonAction.displayName
               );
         } else if (var1.Spinner == 4) {
            this.ProgressBar
               .Checkbox(
                  "/unmod " + this.ButtonAction.displayName
               );
         } else if (var1.Spinner == 1) {
            this.ProgressBar
               .Checkbox(
                  "/timeout " + this.ButtonAction.displayName
               );
         }

         this.ColorChooser
            .BatModClient(
               (nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000)null
            );
      }
   }

   @Override
   public void BatModClient(int var1, int var2, float var3) {
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA();
      this.BatModClient(
         this.BatModJson,
         this.Spinner
            .BatModProgressBar(),
         this.TextField / 2,
         70,
         16777215
      );
      int var4 = 80;

      for (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var6 : this.Checkbox) {
         this.Button(
            this.BatModJson,
            var6.ColorChooser(),
            this.BatModProgressBar,
            var4,
            16777215
         );
         var4 += this.BatModJson.Spinner;
      }

      super.BatModClient(var1, var2, var3);
   }
}
