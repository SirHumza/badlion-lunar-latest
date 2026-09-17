public enum TFY24BjV00Hq40Tu4CzUzZsGLLEn6WoDjp5gIKPaqkqmA9ljeHzxOistbcFJaEjVnpEJdaXDo8Bxhlr0TJDYZlucmrD7cJhpdjR8 {
   BatModClient("leather", 5, new int[]{1, 3, 2, 1}, 15),
   Button("chainmail", 15, new int[]{2, 5, 4, 1}, 12),
   CustomSpinner("iron", 15, new int[]{2, 6, 5, 2}, 9),
   ButtonAction("gold", 7, new int[]{2, 5, 3, 1}, 25),
   Spinner("diamond", 33, new int[]{3, 8, 6, 3}, 10);

   private final String Checkbox;
   private final int ProgressBar;
   private final int[] BatModProgressBar;
   private final int ColorChooser;

   TFY24BjV00Hq40Tu4CzUzZsGLLEn6WoDjp5gIKPaqkqmA9ljeHzxOistbcFJaEjVnpEJdaXDo8Bxhlr0TJDYZlucmrD7cJhpdjR8(String var3, int var4, int[] var5, int var6) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
      this.BatModProgressBar = var5;
      this.ColorChooser = var6;
   }

   public int BatModClient(int var1) {
      return Bn0Hx3Qxohsra9mqMMM7AWPK9FKsJHF5jgWiWxspfajCyiIupvx0DPByxuZEL1eledVSZ6z5lhzbc7GnMmTpG8zrWnEf0WTRFXCI.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()[var1]
         * this.ProgressBar;
   }

   public int Button(int var1) {
      return this.BatModProgressBar[var1];
   }

   public int BatModClient() {
      return this.ColorChooser;
   }

   public q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 Button() {
      return this == BatModClient
         ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK
         : (
            this == Button
               ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.IntegerSpinner
               : (
                  this == ButtonAction
                     ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.TextField
                     : (
                        this == CustomSpinner
                           ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.IntegerSpinner
                           : (
                              this == Spinner
                                 ? PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.ColorChooser
                                 : null
                           )
                     )
               )
         );
   }

   public String CustomSpinner() {
      return this.Checkbox;
   }
}
