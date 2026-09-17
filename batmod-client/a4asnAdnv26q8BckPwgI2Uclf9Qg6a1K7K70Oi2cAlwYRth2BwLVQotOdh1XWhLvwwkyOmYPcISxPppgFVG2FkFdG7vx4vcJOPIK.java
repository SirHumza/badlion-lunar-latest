import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class a4asnAdnv26q8BckPwgI2Uclf9Qg6a1K7K70Oi2cAlwYRth2BwLVQotOdh1XWhLvwwkyOmYPcISxPppgFVG2FkFdG7vx4vcJOPIK
   extends kX7CE3LXbiFNkVJzBSuFkmvyirzHbtbPlI1aLDvbj4Wz8ez2PvMpuuqAB4M3fbcNcp4yzxe5r5TXEPEQgVjE53BCNwsXyoNcJDq {
   private final u89n5kaLerdQ3DaNxeW9VcQP9BJ7aLEJqvlzNlGyHLQlNBQ7bxrrNziMGu1G5MseqUhWR8fL1Rm7gJRDXHvBhKze3LJxxDq2R6L8 BatModClient;
   private final AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB Button;
   private final jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK[] CustomSpinner;
   private int ButtonAction = 0;

   public a4asnAdnv26q8BckPwgI2Uclf9Qg6a1K7K70Oi2cAlwYRth2BwLVQotOdh1XWhLvwwkyOmYPcISxPppgFVG2FkFdG7vx4vcJOPIK(
      u89n5kaLerdQ3DaNxeW9VcQP9BJ7aLEJqvlzNlGyHLQlNBQ7bxrrNziMGu1G5MseqUhWR8fL1Rm7gJRDXHvBhKze3LJxxDq2R6L8 var1,
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var2
   ) {
      super(
         var2,
         var1.TextField,
         var1.ColorTextPane,
         63,
         var1.ColorTextPane - 32,
         20
      );
      this.BatModClient = var1;
      this.Button = var2;
      QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[] var3 = (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[])ArrayUtils.clone(
         var2.InstallationLogger.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn
      );
      this.CustomSpinner = new jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK[var3.length
         + QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW.CustomSpinner()
            .size()];
      Arrays.sort(var3);
      int var4 = 0;
      String var5 = null;

      for (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW var9 : var3) {
         String var10 = var9.Checkbox();
         if (!var10.equals(var5)) {
            var5 = var10;
            this.CustomSpinner[var4++] = new lTnNYRBVvhWNtadYmpPhxh3LF4jE5ERcQnwtgYVDMhHIGE6XbO8ma3sGq47OvhKED3WfYsBTNUJCpQQiakdGYsNNlSIpYUAreYq4(
               this, var10
            );
         }

         int var11 = var2.ColorTextPane
            .BatModClient(
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  var9.BatModProgressBar()
               )
            );
         if (var11 > this.ButtonAction) {
            this.ButtonAction = var11;
         }

         this.CustomSpinner[var4++] = new VDHHvtMA9gjHEOCV7kCycUOCX4JsOzdjHeDMYVjMaKhSUsosDHH6P4tmxpP5PNYJtJFsJ3F0M9WwibgKCa05PmuRAvdxz0YxvvS(
            this, var9, null
         );
      }
   }

   @Override
   protected int BatModClient() {
      return this.CustomSpinner.length;
   }

   @Override
   public jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK BatModClient(
      int var1
   ) {
      return this.CustomSpinner[var1];
   }

   @Override
   protected int CustomSpinner() {
      return super.CustomSpinner() + 15;
   }

   @Override
   public int ButtonAction() {
      return super.ButtonAction() + 32;
   }
}
