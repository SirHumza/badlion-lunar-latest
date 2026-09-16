package org.apache.commons.cli;

public final class OptionBuilder {
   private static String longopt;
   private static String description;
   private static String argName;
   private static boolean required;
   private static int numberOfArgs = -1;
   private static Object type;
   private static boolean optionalArg;
   private static char valuesep;
   private static OptionBuilder instance = new OptionBuilder();

   private OptionBuilder() {
   }

   private static void reset() {
      description = null;
      argName = "arg";
      longopt = null;
      type = null;
      required = false;
      numberOfArgs = -1;
      optionalArg = false;
      valuesep = 0;
   }

   public static OptionBuilder withLongOpt(String var0) {
      longopt = var0;
      return instance;
   }

   public static OptionBuilder hasArg() {
      numberOfArgs = 1;
      return instance;
   }

   public static OptionBuilder hasArg(boolean var0) {
      numberOfArgs = var0 ? 1 : -1;
      return instance;
   }

   public static OptionBuilder withArgName(String var0) {
      argName = var0;
      return instance;
   }

   public static OptionBuilder isRequired() {
      required = true;
      return instance;
   }

   public static OptionBuilder withValueSeparator(char var0) {
      valuesep = var0;
      return instance;
   }

   public static OptionBuilder withValueSeparator() {
      valuesep = '=';
      return instance;
   }

   public static OptionBuilder isRequired(boolean var0) {
      required = var0;
      return instance;
   }

   public static OptionBuilder hasArgs() {
      numberOfArgs = -2;
      return instance;
   }

   public static OptionBuilder hasArgs(int var0) {
      numberOfArgs = var0;
      return instance;
   }

   public static OptionBuilder hasOptionalArg() {
      numberOfArgs = 1;
      optionalArg = true;
      return instance;
   }

   public static OptionBuilder hasOptionalArgs() {
      numberOfArgs = -2;
      optionalArg = true;
      return instance;
   }

   public static OptionBuilder hasOptionalArgs(int var0) {
      numberOfArgs = var0;
      optionalArg = true;
      return instance;
   }

   public static OptionBuilder withType(Object var0) {
      type = var0;
      return instance;
   }

   public static OptionBuilder withDescription(String var0) {
      description = var0;
      return instance;
   }

   public static Option create(char var0) {
      return create(String.valueOf(var0));
   }

   public static Option create() {
      if (longopt == null) {
         reset();
         throw new IllegalArgumentException("must specify longopt");
      } else {
         return create(null);
      }
   }

   public static Option create(String var0) {
      Option var1 = null;

      try {
         var1 = new Option(var0, description);
         var1.setLongOpt(longopt);
         var1.setRequired(required);
         var1.setOptionalArg(optionalArg);
         var1.setArgs(numberOfArgs);
         var1.setType(type);
         var1.setValueSeparator(valuesep);
         var1.setArgName(argName);
      } finally {
         reset();
      }

      return var1;
   }
}
