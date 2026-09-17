public enum t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N {
   BatModClient(0, "cape"),
   Button(1, "jacket"),
   CustomSpinner(2, "left_sleeve"),
   ButtonAction(3, "right_sleeve"),
   Spinner(4, "left_pants_leg"),
   Checkbox(5, "right_pants_leg"),
   ProgressBar(6, "hat");

   private final int BatModProgressBar;
   private final int ColorChooser;
   private final String IntegerSpinner;
   private final WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY TextField;

   t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N(int var3, String var4) {
      this.BatModProgressBar = var3;
      this.ColorChooser = 1 << var3;
      this.IntegerSpinner = var4;
      this.TextField = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
         "options.modelPart." + var4
      );
   }

   public int BatModClient() {
      return this.ColorChooser;
   }

   public int Button() {
      return this.BatModProgressBar;
   }

   public String CustomSpinner() {
      return this.IntegerSpinner;
   }

   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY ButtonAction() {
      return this.TextField;
   }
}
