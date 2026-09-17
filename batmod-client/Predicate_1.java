import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;

public enum y5dcK1NVt4oKJg54fcJt1jX7I9PaR4FfKbVMm3KQP2iTS9P9Yt6aHH0BqHOogCF7vGd7RDpCbhBv4phIoKX7t4Ghls9aqlYcnUof implements Predicate, Iterable {
   BatModClient("HORIZONTAL", 0),
   Button("VERTICAL", 1);

   private static final y5dcK1NVt4oKJg54fcJt1jX7I9PaR4FfKbVMm3KQP2iTS9P9Yt6aHH0BqHOogCF7vGd7RDpCbhBv4phIoKX7t4Ghls9aqlYcnUof[] CustomSpinner = new y5dcK1NVt4oKJg54fcJt1jX7I9PaR4FfKbVMm3KQP2iTS9P9Yt6aHH0BqHOogCF7vGd7RDpCbhBv4phIoKX7t4Ghls9aqlYcnUof[]{
      BatModClient,
      Button
   };
   private static final String ButtonAction = "CL_00002319";

   y5dcK1NVt4oKJg54fcJt1jX7I9PaR4FfKbVMm3KQP2iTS9P9Yt6aHH0BqHOogCF7vGd7RDpCbhBv4phIoKX7t4Ghls9aqlYcnUof(String var3, int var4) {
   }

   public NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn[] BatModClient() {
      switch (KFOKlKsaU4rJuKopQ4EkRFNrijDlULzw8SRwSVeevg1Oc0e9RGsgPO4rYqVf4T0S9A9sKmr0WmtCD9rPKSMjcCl4OzeKEidAjhk.CustomSpinner[this.ordinal()]) {
         case 1:
            return new NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn[]{
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner,
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox,
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction,
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner
            };
         case 2:
            return new NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn[]{
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button,
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient
            };
         default:
            throw new Error("Someone's been tampering with the universe!");
      }
   }

   public NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn BatModClient(
      Random var1
   ) {
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn[] var2 = this.BatModClient();
      return var2[var1.nextInt(var2.length)];
   }

   public boolean BatModClient(
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1
   ) {
      return var1 != null
         && var1.ColorTextPane()
               .Spinner()
            == this;
   }

   @Override
   public Iterator iterator() {
      return Iterators.forArray(this.BatModClient());
   }

   public boolean apply(Object var1) {
      return this.BatModClient(
         (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn)var1
      );
   }
}
