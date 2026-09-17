import com.google.common.collect.Lists;
import java.util.List;

public class EvEnbprxFK8kIjieI2lyiqC6uTbRFQHPHGk3UHySkdUmgYbTKZaARNzx5im36HvxvKJ4vylUFMPo2dRsWPcfTjIPw1DLzBkPNtO1
   extends kX7CE3LXbiFNkVJzBSuFkmvyirzHbtbPlI1aLDvbj4Wz8ez2PvMpuuqAB4M3fbcNcp4yzxe5r5TXEPEQgVjE53BCNwsXyoNcJDq {
   private final KBYTbjCPM1fOJQJtrT6F4XgVpBd9QKek6CulP5mS7PGOskD1dSYgbfTkhflItuGx7osZKFwEejnnzTBrCJm6X1aDrhV21Sk0Q8Lk BatModClient;
   private final List Button = Lists.newArrayList();
   private final List CustomSpinner = Lists.newArrayList();
   private final jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK ButtonAction = new ccWp7EH3pKiVSSj3JSJRcWTOFlxZRJIUNmD4Zb1JT7N31Ue6rp3A9r6f1Bfv47qT8NTmUne46lXRheXNFj2HzuarC7EY5yo4QRvv();
   private int Spinner = -1;

   public EvEnbprxFK8kIjieI2lyiqC6uTbRFQHPHGk3UHySkdUmgYbTKZaARNzx5im36HvxvKJ4vylUFMPo2dRsWPcfTjIPw1DLzBkPNtO1(
      KBYTbjCPM1fOJQJtrT6F4XgVpBd9QKek6CulP5mS7PGOskD1dSYgbfTkhflItuGx7osZKFwEejnnzTBrCJm6X1aDrhV21Sk0Q8Lk var1,
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7
   ) {
      super(var2, var3, var4, var5, var6, var7);
      this.BatModClient = var1;
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = false;
   }

   @Override
   public jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK BatModClient(
      int var1
   ) {
      if (var1 < this.Button.size()) {
         return (jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK)this.Button
            .get(var1);
      }

      var1 -= this.Button.size();
      return var1 == 0
         ? this.ButtonAction
         : (jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK)this.CustomSpinner
            .get(--var1);
   }

   @Override
   protected int BatModClient() {
      return this.Button.size()
         + 1
         + this.CustomSpinner.size();
   }

   public void Button(int var1) {
      this.Spinner = var1;
   }

   @Override
   protected boolean CustomSpinner(int var1) {
      return var1 == this.Spinner;
   }

   public int Spinner() {
      return this.Spinner;
   }

   public void BatModClient(
      It3mfXjtEoxv0iNjxmpmYdNyKAztAuQDmoGBnGFXmhGwdEWStwsSDRLugFCVqFZmiqGMt5va0MAcfwm9A0APIikRSq07NEhd1o8J var1
   ) {
      this.Button.clear();

      for (int var2 = 0; var2 < var1.CustomSpinner(); var2++) {
         this.Button
            .add(
               new fHE1ArLqtZnboGf4Zi2Olwct8nl8MYJSUjiwh3Im32YOh0nLvZfBxb5opiGoTHyawOIvr5zBRIRnwKFgP2TBzww2iTuJooVziBS(
                  this.BatModClient,
                  var1.BatModClient(var2)
               )
            );
      }
   }

   public void BatModClient(List var1) {
      this.CustomSpinner.clear();

      for (mmeqtzwoGP4dllaaOahmcvlEP54rxdfrT7m2LbOHdVtJhAXfzRyeJLgry8OltmR0iCLvQzYBkfr2lysSNXFqrT2BN5gHzrLfpDC2 var3 : var1) {
         this.CustomSpinner
            .add(
               new kyieHBvS1uopZAxEoiIQSIAHW8Pu3BEPXYWUiaPAzTNeGiYIy93R41U5zR6qrlkrVocyFdQwlgkZYrvKPuQTGLVtK8mml9BjJJx4(
                  this.BatModClient, var3
               )
            );
      }
   }

   @Override
   protected int CustomSpinner() {
      return super.CustomSpinner() + 30;
   }

   @Override
   public int ButtonAction() {
      return super.ButtonAction() + 85;
   }
}
