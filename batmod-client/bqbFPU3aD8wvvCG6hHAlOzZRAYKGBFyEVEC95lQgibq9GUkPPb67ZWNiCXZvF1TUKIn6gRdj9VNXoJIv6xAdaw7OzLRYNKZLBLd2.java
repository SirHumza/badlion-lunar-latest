public class bqbFPU3aD8wvvCG6hHAlOzZRAYKGBFyEVEC95lQgibq9GUkPPb67ZWNiCXZvF1TUKIn6gRdj9VNXoJIv6xAdaw7OzLRYNKZLBLd2 {
   public float[] BatModClient;
   public Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF[] Button;
   public int CustomSpinner;
   public int ButtonAction;
   public long Spinner;

   public bqbFPU3aD8wvvCG6hHAlOzZRAYKGBFyEVEC95lQgibq9GUkPPb67ZWNiCXZvF1TUKIn6gRdj9VNXoJIv6xAdaw7OzLRYNKZLBLd2(
      gabtnzkBf7dRq6qPrEf9SIVY1knKycdOs8I8iEwlq5oXezB8VdvYRLfhnjn5S2Y7kA6FARADjeN2MVTFCnrubJpsBE5ZnFy7gUzf var1, int var2, int var3
   ) {
      this.Checkbox = var1;
      this.BatModClient = new float[256];
      this.Button = new Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF[256];
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
      gabtnzkBf7dRq6qPrEf9SIVY1knKycdOs8I8iEwlq5oXezB8VdvYRLfhnjn5S2Y7kA6FARADjeN2MVTFCnrubJpsBE5ZnFy7gUzf.BatModClient(
            var1
         )
         .BatModClient(
            this.BatModClient, var2 << 4, var3 << 4, 16, 16
         );
      gabtnzkBf7dRq6qPrEf9SIVY1knKycdOs8I8iEwlq5oXezB8VdvYRLfhnjn5S2Y7kA6FARADjeN2MVTFCnrubJpsBE5ZnFy7gUzf.BatModClient(
            var1
         )
         .BatModClient(
            this.Button, var2 << 4, var3 << 4, 16, 16, false
         );
   }

   public Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF BatModClient(
      int var1, int var2
   ) {
      return this.Button[var1 & 15 | (var2 & 15) << 4];
   }
}
