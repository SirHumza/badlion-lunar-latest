public class lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i
   implements r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr {
   private final k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] BatModClient;
   private final int Button;
   private final int CustomSpinner;
   private final Aj7XcOq39OSNFQ9XdHMZK983N1FTgww66fEcYW7FZpHTf8YZVRDpMUrV6homDZeu06ifByDzcDCkLuiKMOfUndmcWdqxmSEB7obV ButtonAction;

   public lRELQ3NP8qD11dZ0nd8jYmq2gVMzGKhIx4q8vNz0ECUbDm28dtQKiB40AtGSeARbVYHrJZn0sJHgfWOprEi3XearnbDfyLzg2Q2i(
      Aj7XcOq39OSNFQ9XdHMZK983N1FTgww66fEcYW7FZpHTf8YZVRDpMUrV6homDZeu06ifByDzcDCkLuiKMOfUndmcWdqxmSEB7obV var1, int var2, int var3
   ) {
      int var4 = var2 * var3;
      this.BatModClient = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[var4];
      this.ButtonAction = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   @Override
   public int ColorChooser() {
      return this.BatModClient.length;
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 ColorTextPane(
      int var1
   ) {
      return var1 >= this.ColorChooser()
         ? null
         : this.BatModClient[var1];
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 CustomSpinner(
      int var1, int var2
   ) {
      return var1 >= 0
            && var1 < this.Button
            && var2 >= 0
            && var2 <= this.CustomSpinner
         ? this.ColorTextPane(
            var1 + var2 * this.Button
         )
         : null;
   }

   @Override
   public String C_() {
      return "container.crafting";
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY CustomSpinner() {
      return this.n_()
         ? new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(this.C_())
         : new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(this.C_());
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 BatModInstallerMain(
      int var1
   ) {
      if (this.BatModClient[var1] != null) {
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2 = this.BatModClient[var1];
         this.BatModClient[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   @Override
   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Button(
      int var1, int var2
   ) {
      if (this.BatModClient[var1] != null) {
         if (this.BatModClient[var1].Button
            <= var2) {
            k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = this.BatModClient[var1];
            this.BatModClient[var1] = null;
            this.ButtonAction
               .BatModClient(this);
            return var4;
         }

         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3 = this.BatModClient[var1]
            .BatModClient(var2);
         if (this.BatModClient[var1].Button
            == 0) {
            this.BatModClient[var1] = null;
         }

         this.ButtonAction
            .BatModClient(this);
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public void CustomSpinner(
      int var1, k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2
   ) {
      this.BatModClient[var1] = var2;
      this.ButtonAction
         .BatModClient(this);
   }

   @Override
   public int LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8() {
      return 64;
   }

   @Override
   public void z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP() {
   }

   @Override
   public boolean ButtonAction(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
      return true;
   }

   @Override
   public void Spinner(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
   }

   @Override
   public void Checkbox(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1
   ) {
   }

   @Override
   public boolean ButtonAction(
      int var1, k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2
   ) {
      return true;
   }

   @Override
   public int BatModClient(int var1) {
      return 0;
   }

   @Override
   public void BatModClient(int var1, int var2) {
   }

   @Override
   public int Spinner() {
      return 0;
   }

   @Override
   public void xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa() {
      for (int var1 = 0; var1 < this.BatModClient.length; var1++) {
         this.BatModClient[var1] = null;
      }
   }

   public int ButtonAction() {
      return this.CustomSpinner;
   }

   public int Checkbox() {
      return this.Button;
   }
}
