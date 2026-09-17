import java.util.UUID;

public class L4uaVMCd3oGSH0oCjM3VDqaD9VO3BiV9lih4UOOYQ3zS9zoArGhufbuPZuU1skykagKo9dxU6loDnqdolcTTJAvcLcmbD5ukewav {
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/entity/steve.png"
   );
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD Button = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/entity/alex.png"
   );

   public static p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient() {
      return BatModClient;
   }

   public static p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient(
      UUID var0
   ) {
      return CustomSpinner(var0)
         ? Button
         : BatModClient;
   }

   public static String Button(UUID var0) {
      return CustomSpinner(var0) ? "slim" : "default";
   }

   private static boolean CustomSpinner(UUID var0) {
      return (var0.hashCode() & 1) == 1;
   }
}
