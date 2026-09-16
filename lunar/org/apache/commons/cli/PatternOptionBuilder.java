package org.apache.commons.cli;

public class PatternOptionBuilder {
   public static final Class STRING_VALUE = PatternOptionBuilder.class$java$lang$String == null
      ? (PatternOptionBuilder.class$java$lang$String = class$("java.lang.String"))
      : PatternOptionBuilder.class$java$lang$String;
   public static final Class OBJECT_VALUE = PatternOptionBuilder.class$java$lang$Object == null
      ? (PatternOptionBuilder.class$java$lang$Object = class$("java.lang.Object"))
      : PatternOptionBuilder.class$java$lang$Object;
   public static final Class NUMBER_VALUE = PatternOptionBuilder.class$java$lang$Number == null
      ? (PatternOptionBuilder.class$java$lang$Number = class$("java.lang.Number"))
      : PatternOptionBuilder.class$java$lang$Number;
   public static final Class DATE_VALUE = PatternOptionBuilder.class$java$util$Date == null
      ? (PatternOptionBuilder.class$java$util$Date = class$("java.util.Date"))
      : PatternOptionBuilder.class$java$util$Date;
   public static final Class CLASS_VALUE = PatternOptionBuilder.class$java$lang$Class == null
      ? (PatternOptionBuilder.class$java$lang$Class = class$("java.lang.Class"))
      : PatternOptionBuilder.class$java$lang$Class;
   public static final Class EXISTING_FILE_VALUE = PatternOptionBuilder.class$java$io$FileInputStream == null
      ? (PatternOptionBuilder.class$java$io$FileInputStream = class$("java.io.FileInputStream"))
      : PatternOptionBuilder.class$java$io$FileInputStream;
   public static final Class FILE_VALUE = PatternOptionBuilder.class$java$io$File == null
      ? (PatternOptionBuilder.class$java$io$File = class$("java.io.File"))
      : PatternOptionBuilder.class$java$io$File;
   public static final Class FILES_VALUE = PatternOptionBuilder.array$Ljava$io$File == null
      ? (PatternOptionBuilder.array$Ljava$io$File = class$("[Ljava.io.File;"))
      : PatternOptionBuilder.array$Ljava$io$File;
   public static final Class URL_VALUE = PatternOptionBuilder.class$java$net$URL == null
      ? (PatternOptionBuilder.class$java$net$URL = class$("java.net.URL"))
      : PatternOptionBuilder.class$java$net$URL;
   static Class class$java$lang$String;
   static Class class$java$lang$Object;
   static Class class$java$lang$Number;
   static Class class$java$util$Date;
   static Class class$java$lang$Class;
   static Class class$java$io$FileInputStream;
   static Class class$java$io$File;
   static Class array$Ljava$io$File;
   static Class class$java$net$URL;

   public static Object getValueClass(char var0) {
      switch (var0) {
         case '#':
            return DATE_VALUE;
         case '$':
         case '&':
         case '\'':
         case '(':
         case ')':
         case ',':
         case '-':
         case '.':
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
         case ';':
         case '=':
         case '?':
         default:
            return null;
         case '%':
            return NUMBER_VALUE;
         case '*':
            return FILES_VALUE;
         case '+':
            return CLASS_VALUE;
         case '/':
            return URL_VALUE;
         case ':':
            return STRING_VALUE;
         case '<':
            return EXISTING_FILE_VALUE;
         case '>':
            return FILE_VALUE;
         case '@':
            return OBJECT_VALUE;
      }
   }

   public static boolean isValueCode(char var0) {
      return var0 == '@' || var0 == ':' || var0 == '%' || var0 == '+' || var0 == '#' || var0 == '<' || var0 == '>' || var0 == '*' || var0 == '/' || var0 == '!';
   }

   public static Options parsePattern(String var0) {
      char var1 = ' ';
      boolean var2 = false;
      Object var3 = null;
      Options var4 = new Options();

      for (int var5 = 0; var5 < var0.length(); var5++) {
         char var6 = var0.charAt(var5);
         if (!isValueCode(var6)) {
            if (var1 != ' ') {
               OptionBuilder.hasArg(var3 != null);
               OptionBuilder.isRequired(var2);
               OptionBuilder.withType(var3);
               var4.addOption(OptionBuilder.create(var1));
               var2 = false;
               var3 = null;
               byte var7 = 32;
            }

            var1 = var6;
         } else if (var6 == '!') {
            var2 = true;
         } else {
            var3 = getValueClass(var6);
         }
      }

      if (var1 != ' ') {
         OptionBuilder.hasArg(var3 != null);
         OptionBuilder.isRequired(var2);
         OptionBuilder.withType(var3);
         var4.addOption(OptionBuilder.create(var1));
      }

      return var4;
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError().initCause(var2);
      }
   }
}
