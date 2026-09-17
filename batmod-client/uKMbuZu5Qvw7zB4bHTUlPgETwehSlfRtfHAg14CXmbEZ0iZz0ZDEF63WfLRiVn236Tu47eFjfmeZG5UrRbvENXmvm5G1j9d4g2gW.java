import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.regex.Pattern;

class uKMbuZu5Qvw7zB4bHTUlPgETwehSlfRtfHAg14CXmbEZ0iZz0ZDEF63WfLRiVn236Tu47eFjfmeZG5UrRbvENXmvm5G1j9d4g2gW
   extends h591mukmiLr0vJDKnnXtNoDvOBDLG8uMU7FdnK6kMpQ2SvXfMCHeD5FbacfP3NzAtSAQvZlMSmIl5E7OLWgKHmpMSplYTcSbD1uk {
   private static final Pattern CustomSpinner = Pattern.compile(
      "[-+]?[0-9]*\\.?[0-9]+[d|D]"
   );
   private static final Pattern ButtonAction = Pattern.compile(
      "[-+]?[0-9]*\\.?[0-9]+[f|F]"
   );
   private static final Pattern Spinner = Pattern.compile(
      "[-+]?[0-9]+[b|B]"
   );
   private static final Pattern Checkbox = Pattern.compile(
      "[-+]?[0-9]+[l|L]"
   );
   private static final Pattern ProgressBar = Pattern.compile(
      "[-+]?[0-9]+[s|S]"
   );
   private static final Pattern BatModProgressBar = Pattern.compile(
      "[-+]?[0-9]+"
   );
   private static final Pattern ColorChooser = Pattern.compile(
      "[-+]?[0-9]*\\.?[0-9]+"
   );
   private static final Splitter IntegerSpinner = Splitter.on(',')
      .omitEmptyStrings();
   protected String Button;

   public uKMbuZu5Qvw7zB4bHTUlPgETwehSlfRtfHAg14CXmbEZ0iZz0ZDEF63WfLRiVn236Tu47eFjfmeZG5UrRbvENXmvm5G1j9d4g2gW(String var1, String var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   @Override
   public NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju BatModClient() {
      try {
         if (CustomSpinner.matcher(
               this.Button
            )
            .matches()) {
            return new wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX(
               Double.parseDouble(
                  this.Button
                     .substring(0, this.Button.length() - 1)
               )
            );
         }

         if (ButtonAction.matcher(
               this.Button
            )
            .matches()) {
            return new nqmV0QIyfmeq3ZMBlKbuduSrifEFlTggy9HPXXqZGnR1KBm5xqMUmsXMepwi2uHsME6u5gMEGd9fRO4Bctwwm9R45gvqRXeQ8NjA(
               Float.parseFloat(
                  this.Button
                     .substring(0, this.Button.length() - 1)
               )
            );
         }

         if (Spinner.matcher(
               this.Button
            )
            .matches()) {
            return new ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP(
               Byte.parseByte(
                  this.Button
                     .substring(0, this.Button.length() - 1)
               )
            );
         }

         if (Checkbox.matcher(
               this.Button
            )
            .matches()) {
            return new d6urEgIuPgx0Li4ot1uTOfE54DbHPcjMD2SRwQZ6XTFNDMCpRN4sGkroYvyJruWUTsvo0qJuoSGgZAl5sv1AXw4aOXMbjvceHB4W(
               Long.parseLong(
                  this.Button
                     .substring(0, this.Button.length() - 1)
               )
            );
         }

         if (ProgressBar.matcher(
               this.Button
            )
            .matches()) {
            return new QSWAqZV5kKDew4cLJKZZ3smnRiQYR2bTqBlilga7uMww0Rx7k62K6WZ3hhkzyPCgHERSjayZjHSuSjbmytbR9fkDoiOCwwVzcKMz(
               Short.parseShort(
                  this.Button
                     .substring(0, this.Button.length() - 1)
               )
            );
         }

         if (BatModProgressBar.matcher(
               this.Button
            )
            .matches()) {
            return new TdDa6LEShT8KlsmAu0gZCDzQO0cX7P0JSMq862WeIenwcs5lasIHM3UQCH2Cn1S5vdbwoVdxNbJ0vrfrLq4UAuq9jkSUwqGxyjpG(
               Integer.parseInt(this.Button)
            );
         }

         if (ColorChooser.matcher(
               this.Button
            )
            .matches()) {
            return new wpKZWpbRYgEueIE9D6g52h917S0DT88NbWLV9xDD0AnpeGNMeHCEhoCkgVSo63ecA1RjkVblpdgSMtDaWYf2BlYbYbrCS14pPrqX(
               Double.parseDouble(this.Button)
            );
         }

         if (this.Button.equalsIgnoreCase("true")
            || this.Button.equalsIgnoreCase("false")) {
            return new ILDoCkPQ7m75PPbWyXpVFBZYTExZeDLjdZJqOGSp3YJMtGLUjNIC6Ms0oJPufjGBus93Xd2irOTUyzOB6l7ggR4rUhrGiU6erdCP(
               (byte)(Boolean.parseBoolean(this.Button) ? 1 : 0)
            );
         }
      } catch (NumberFormatException var6) {
         this.Button = this.Button
            .replaceAll("\\\\\"", "\"");
         return new Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1(
            this.Button
         );
      }

      if (this.Button.startsWith("[")
         && this.Button.endsWith("]")) {
         String var7 = this.Button
            .substring(1, this.Button.length() - 1);
         String[] var8 = (String[])Iterables.toArray(
            IntegerSpinner.split(var7), String.class
         );

         try {
            int[] var3 = new int[var8.length];

            for (int var4 = 0; var4 < var8.length; var4++) {
               var3[var4] = Integer.parseInt(var8[var4].trim());
            }

            return new RuyvZuJfxhIMnyBp8dTqZ0zos8gN5K2Kp8fXPld2opuZJKKRUuuMicPRKgoVKTRdoF2LbHZtVccAzAts2tJAp3aHJbCecxZ3cOM9(var3);
         } catch (NumberFormatException var5) {
            return new Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1(
               this.Button
            );
         }
      } else {
         if (this.Button.startsWith("\"")
            && this.Button.endsWith("\"")) {
            this.Button = this.Button
               .substring(1, this.Button.length() - 1);
         }

         this.Button = this.Button
            .replaceAll("\\\\\"", "\"");
         StringBuilder var1 = new StringBuilder();

         for (int var2 = 0; var2 < this.Button.length(); var2++) {
            if (var2 < this.Button.length() - 1
               && this.Button.charAt(var2) == '\\'
               && this.Button.charAt(var2 + 1) == '\\') {
               var1.append('\\');
               var2++;
            } else {
               var1.append(this.Button.charAt(var2));
            }
         }

         return new Pd5jhdF9QOusoDbf9aUjdqXFDiygc6TELw5j8tJ7lRihQCNnHVbGnGyEnc5zoRVB7PRxopg4WHNo1WQpWI5Pkb9NLdE7HO1se1Z1(var1.toString());
      }
   }
}
