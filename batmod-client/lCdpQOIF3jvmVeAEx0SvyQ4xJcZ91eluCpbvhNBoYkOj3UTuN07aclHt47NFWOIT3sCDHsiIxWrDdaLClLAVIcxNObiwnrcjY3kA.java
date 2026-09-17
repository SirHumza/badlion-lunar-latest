public class lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA {
   private final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient;
   private final AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi Button;
   private final boolean CustomSpinner;
   private final int ButtonAction;

   public lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1,
      AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi var2,
      boolean var3,
      int var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   public p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModClient() {
      return this.BatModClient;
   }

   public AiUEuRfoUKx67rczH5DuXQgU5gndY0YCLglkoTdbPzsws79svyFJFQvcjsWn5yFBr5XMqNpJevZ5CwI4uep07DNLzilP7I7YOQgi Button() {
      return this.Button;
   }

   public boolean CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.ButtonAction;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA)) {
         return false;
      }

      lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA var2 = (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA)var1;
      return this.BatModClient
            .equals(var2.BatModClient)
         && this.Button
            == var2.Button
         && this.CustomSpinner
            == var2.CustomSpinner;
   }

   @Override
   public int hashCode() {
      int var1 = this.BatModClient.hashCode();
      var1 = 31 * var1
         + (
            this.Button != null
               ? this.Button.hashCode()
               : 0
         );
      return 31 * var1 + (this.CustomSpinner ? 1 : 0);
   }
}
