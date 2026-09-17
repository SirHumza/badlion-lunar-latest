public class fOHQTm9gvz0LwzSIKP2AqzCquj8xOo5fFYFd7vvQvLLKMGcAAh6dwiceDRN3wIb5KSXZDPCY3yS2fatqcFS9JckudLXU75oqY6Ps
   extends sA0kUXr2oA7z15MHyHfVenNsclYYox8DLeZ1nJUHknGBtDT0FGpRw5B3cxrCrM7as6HLIlCalxeFqWaKJkiVyW43xv0CFoqHVaBK {
   private final c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G BatModProgressBar;
   private String[] ColorChooser;

   public fOHQTm9gvz0LwzSIKP2AqzCquj8xOo5fFYFd7vvQvLLKMGcAAh6dwiceDRN3wIb5KSXZDPCY3yS2fatqcFS9JckudLXU75oqY6Ps(
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var1, boolean var2
   ) {
      super(var1);
      this.BatModProgressBar = var1;
      if (var2) {
         this.ButtonAction(0);
         this.BatModClient(true);
      }
   }

   @Override
   public int BatModClient(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1, int var2
   ) {
      return this.BatModProgressBar
         .Spinner(
            this.BatModProgressBar
               .CustomSpinner(
                  var1.BatModProgressBar()
               )
         );
   }

   @Override
   public int CustomSpinner(int var1) {
      return var1;
   }

   public fOHQTm9gvz0LwzSIKP2AqzCquj8xOo5fFYFd7vvQvLLKMGcAAh6dwiceDRN3wIb5KSXZDPCY3yS2fatqcFS9JckudLXU75oqY6Ps BatModClient(
      String[] var1
   ) {
      this.ColorChooser = var1;
      return this;
   }

   @Override
   public String Button(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1
   ) {
      if (this.ColorChooser == null) {
         return super.Button(var1);
      }

      int var2 = var1.BatModProgressBar();
      return var2 >= 0 && var2 < this.ColorChooser.length
         ? super.Button(var1)
            + "."
            + this.ColorChooser[var2]
         : super.Button(var1);
   }
}
