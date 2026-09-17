import java.util.Arrays;
import org.apache.commons.lang3.StringEscapeUtils;

public class x9eoM4KOojnEVzKG2LAwG2bfIY4ju89F9i5qEPEeOj88NakjJHmm2TZCxd7KEo1FIoWSntq8Uw0Uk6DqgaPiCxjVbcUkGmiKuZQm {
   private String[] BatModClient = null;
   private String Button = null;
   private int CustomSpinner = 0;
   private String ButtonAction = null;
   private static final int Spinner = 0;
   private static final int Checkbox = 1;
   private static final int ProgressBar = 2;
   private static final int BatModProgressBar = 3;
   private static final int ColorChooser = 4;
   private static final String IntegerSpinner = "pattern:";
   private static final String TextField = "ipattern:";
   private static final String ColorTextPane = "regex:";
   private static final String BatModInstallerMain = "iregex:";

   public x9eoM4KOojnEVzKG2LAwG2bfIY4ju89F9i5qEPEeOj88NakjJHmm2TZCxd7KEo1FIoWSntq8Uw0Uk6DqgaPiCxjVbcUkGmiKuZQm(String var1, String var2) {
      String[] var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var1, "."
      );
      this.BatModClient = Arrays.copyOfRange(var3, 0, var3.length - 1);
      this.Button = var3[var3.length - 1];
      if (var2.startsWith("pattern:")) {
         this.CustomSpinner = 1;
         var2 = var2.substring("pattern:".length());
      } else if (var2.startsWith("ipattern:")) {
         this.CustomSpinner = 2;
         var2 = var2.substring("ipattern:".length()).toLowerCase();
      } else if (var2.startsWith("regex:")) {
         this.CustomSpinner = 3;
         var2 = var2.substring("regex:".length());
      } else if (var2.startsWith("iregex:")) {
         this.CustomSpinner = 4;
         var2 = var2.substring("iregex:".length()).toLowerCase();
      } else {
         this.CustomSpinner = 0;
      }

      var2 = StringEscapeUtils.unescapeJava(var2);
      this.ButtonAction = var2;
   }

   public boolean BatModClient(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var1
   ) {
      if (var1 == null) {
         return false;
      }

      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var2 = var1;

      for (int var3 = 0; var3 < this.BatModClient.length; var3++) {
         String var4 = this.BatModClient[var3];
         var2 = BatModClient(var2, var4);
         if (var2 == null) {
            return false;
         }
      }

      if (this.Button.equals("*")) {
         return this.BatModClient(var2);
      }

      var2 = BatModClient(
         var2, this.Button
      );
      return var2 == null ? false : this.Button(var2);
   }

   private boolean BatModClient(
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var1
   ) {
      if (var1 instanceof YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2 = (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)var1;

         for (String var4 : var2.Spinner()) {
            NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var5 = var2.BatModClient(
               var4
            );
            if (this.Button(var5)) {
               return true;
            }
         }
      }

      if (var1 instanceof fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ) {
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var6 = (fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ)var1;
         int var7 = var6.Spinner();

         for (int var8 = 0; var8 < var7; var8++) {
            NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var9 = var6.ProgressBar(
               var8
            );
            if (this.Button(var9)) {
               return true;
            }
         }
      }

      return false;
   }

   private static NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju BatModClient(
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var0, String var1
   ) {
      if (var0 instanceof YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm) {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var4 = (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)var0;
         return var4.BatModClient(var1);
      } else if (var0 instanceof fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ) {
         fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ var2 = (fBgyrZqC7DySyUjSO3nxOnJ0BzL00PKBwqY8KALx9wZReCahdBEevsWHA8oRs2ZWQWyUfvliHYs6B41jP69tZW126FxqK4Tef7nZ)var0;
         int var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var1, -1
         );
         return var3 < 0 ? null : var2.ProgressBar(var3);
      } else {
         return null;
      }
   }

   private boolean Button(
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var1
   ) {
      if (var1 == null) {
         return false;
      }

      String var2 = CustomSpinner(var1);
      if (var2 == null) {
         return false;
      }

      switch (this.CustomSpinner) {
         case 0:
            return var2.equals(this.ButtonAction);
         case 1:
            return this.BatModClient(
               var2, this.ButtonAction
            );
         case 2:
            return this.BatModClient(
               var2.toLowerCase(), this.ButtonAction
            );
         case 3:
            return this.Button(
               var2, this.ButtonAction
            );
         case 4:
            return this.Button(
               var2.toLowerCase(), this.ButtonAction
            );
         default:
            throw new IllegalArgumentException(
               "Unknown NbtTagValue type: " + this.CustomSpinner
            );
      }
   }

   private boolean BatModClient(String var1, String var2) {
      return XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.BatModClient(
         var1, var2, '*', '?'
      );
   }

   private boolean Button(String var1, String var2) {
      return var1.matches(var2);
   }

   private static String CustomSpinner(
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var0
   ) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1) {
         Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1 var7 = (Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1)var0;
         return var7.ButtonAction();
      } else if (var0 instanceof TdDa6LEShT8KlsmAu0gZCDzQO0cX7P0JSMq862WeIenwcs5lasIHM3UQCH2Cn1S5vdbwoVdxNbJ0vrfrLq4UAuq9jkSUwqGxyjpG) {
         TdDa6LEShT8KlsmAu0gZCDzQO0cX7P0JSMq862WeIenwcs5lasIHM3UQCH2Cn1S5vdbwoVdxNbJ0vrfrLq4UAuq9jkSUwqGxyjpG var6 = (TdDa6LEShT8KlsmAu0gZCDzQO0cX7P0JSMq862WeIenwcs5lasIHM3UQCH2Cn1S5vdbwoVdxNbJ0vrfrLq4UAuq9jkSUwqGxyjpG)var0;
         return Integer.toString(var6.Checkbox());
      } else if (var0 instanceof ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP) {
         ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP var5 = (ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP)var0;
         return Byte.toString(var5.BatModProgressBar());
      } else if (var0 instanceof QSWAqZV5kKDew4cLJKZZ3smnRiQYR2bTqBlilga7uMww0Rx7k62K6WZ3hhkzyPCgHERSjayZjHSuSjbmytbR9fkDoiOCwwVzcKMz) {
         QSWAqZV5kKDew4cLJKZZ3smnRiQYR2bTqBlilga7uMww0Rx7k62K6WZ3hhkzyPCgHERSjayZjHSuSjbmytbR9fkDoiOCwwVzcKMz var4 = (QSWAqZV5kKDew4cLJKZZ3smnRiQYR2bTqBlilga7uMww0Rx7k62K6WZ3hhkzyPCgHERSjayZjHSuSjbmytbR9fkDoiOCwwVzcKMz)var0;
         return Short.toString(var4.ProgressBar());
      } else if (var0 instanceof d6urEgIuPgx0Li4ot1uTOfE54DbHPcjMD2SRwQZ6XTFNDMCpRN4sGkroYvyJruWUTsvo0qJuoSGgZAl5sv1AXw4aOXMbjvceHB4W) {
         d6urEgIuPgx0Li4ot1uTOfE54DbHPcjMD2SRwQZ6XTFNDMCpRN4sGkroYvyJruWUTsvo0qJuoSGgZAl5sv1AXw4aOXMbjvceHB4W var3 = (d6urEgIuPgx0Li4ot1uTOfE54DbHPcjMD2SRwQZ6XTFNDMCpRN4sGkroYvyJruWUTsvo0qJuoSGgZAl5sv1AXw4aOXMbjvceHB4W)var0;
         return Long.toString(var3.Spinner());
      } else if (var0 instanceof nqmV0QIyfmeq3ZMBlKbuduSrifEFlTggy9HPXXqZGnR1KBm5xqMUmsXMepwi2uHsME6u5gMEGd9fRO4Bctwwm9R45gvqRXeQ8NjA) {
         nqmV0QIyfmeq3ZMBlKbuduSrifEFlTggy9HPXXqZGnR1KBm5xqMUmsXMepwi2uHsME6u5gMEGd9fRO4Bctwwm9R45gvqRXeQ8NjA var2 = (nqmV0QIyfmeq3ZMBlKbuduSrifEFlTggy9HPXXqZGnR1KBm5xqMUmsXMepwi2uHsME6u5gMEGd9fRO4Bctwwm9R45gvqRXeQ8NjA)var0;
         return Float.toString(var2.IntegerSpinner());
      } else if (var0 instanceof wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX) {
         wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX var1 = (wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX)var0;
         return Double.toString(var1.ColorChooser());
      } else {
         return var0.toString();
      }
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < this.BatModClient.length; var2++) {
         String var3 = this.BatModClient[var2];
         if (var2 > 0) {
            var1.append(".");
         }

         var1.append(var3);
      }

      if (var1.length() > 0) {
         var1.append(".");
      }

      var1.append(this.Button);
      var1.append(" = ");
      var1.append(this.ButtonAction);
      return var1.toString();
   }
}
