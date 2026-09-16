package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public abstract class Parser implements CommandLineParser {
   protected CommandLine cmd;
   private Options options;
   private List requiredOptions;

   protected void setOptions(Options var1) {
      this.options = var1;
      this.requiredOptions = new ArrayList(var1.getRequiredOptions());
   }

   protected Options getOptions() {
      return this.options;
   }

   protected List getRequiredOptions() {
      return this.requiredOptions;
   }

   protected abstract String[] flatten(Options var1, String[] var2, boolean var3);

   public CommandLine parse(Options var1, String[] var2) {
      return this.parse(var1, var2, null, false);
   }

   public CommandLine parse(Options var1, String[] var2, Properties var3) {
      return this.parse(var1, var2, var3, false);
   }

   public CommandLine parse(Options var1, String[] var2, boolean var3) {
      return this.parse(var1, var2, null, var3);
   }

   public CommandLine parse(Options var1, String[] var2, Properties var3, boolean var4) {
      for (Option var6 : var1.helpOptions()) {
         var6.clearValues();
      }

      this.setOptions(var1);
      this.cmd = new CommandLine();
      boolean var10 = false;
      if (var2 == null) {
         var2 = new String[0];
      }

      List var11 = Arrays.asList(this.flatten(this.getOptions(), var2, var4));
      ListIterator var7 = var11.listIterator();

      while (var7.hasNext()) {
         String var8 = (String)var7.next();
         if ("--".equals(var8)) {
            var10 = true;
         } else if ("-".equals(var8)) {
            if (var4) {
               var10 = true;
            } else {
               this.cmd.addArg(var8);
            }
         } else if (var8.startsWith("-")) {
            if (var4 && !this.getOptions().hasOption(var8)) {
               var10 = true;
               this.cmd.addArg(var8);
            } else {
               this.processOption(var8, var7);
            }
         } else {
            this.cmd.addArg(var8);
            if (var4) {
               var10 = true;
            }
         }

         if (var10) {
            while (var7.hasNext()) {
               String var9 = (String)var7.next();
               if (!"--".equals(var9)) {
                  this.cmd.addArg(var9);
               }
            }
         }
      }

      this.processProperties(var3);
      this.checkRequiredOptions();
      return this.cmd;
   }

   protected void processProperties(Properties var1) {
      if (var1 != null) {
         Enumeration var2 = var1.propertyNames();

         while (var2.hasMoreElements()) {
            String var3 = var2.nextElement().toString();
            if (!this.cmd.hasOption(var3)) {
               Option var4 = this.getOptions().getOption(var3);
               String var5 = var1.getProperty(var3);
               if (var4.hasArg()) {
                  if (var4.getValues() == null || var4.getValues().length == 0) {
                     try {
                        var4.addValueForProcessing(var5);
                     } catch (RuntimeException var7) {
                     }
                  }
               } else if (!"yes".equalsIgnoreCase(var5) && !"true".equalsIgnoreCase(var5) && !"1".equalsIgnoreCase(var5)) {
                  break;
               }

               this.cmd.addOption(var4);
            }
         }
      }
   }

   protected void checkRequiredOptions() {
      if (!this.getRequiredOptions().isEmpty()) {
         throw new MissingOptionException(this.getRequiredOptions());
      }
   }

   public void processArgs(Option var1, ListIterator var2) {
      while (var2.hasNext()) {
         String var3 = (String)var2.next();
         if (this.getOptions().hasOption(var3) && var3.startsWith("-")) {
            var2.previous();
            break;
         } else {
            try {
               var1.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(var3));
            } catch (RuntimeException var5) {
               var2.previous();
               break;
            }
         }
      }

      if (var1.getValues() == null && !var1.hasOptionalArg()) {
         throw new MissingArgumentException(var1);
      }
   }

   protected void processOption(String var1, ListIterator var2) {
      boolean var3 = this.getOptions().hasOption(var1);
      if (!var3) {
         throw new UnrecognizedOptionException("Unrecognized option: " + var1, var1);
      }

      Option var4 = (Option)this.getOptions().getOption(var1).clone();
      if (var4.isRequired()) {
         this.getRequiredOptions().remove(var4.getKey());
      }

      if (this.getOptions().getOptionGroup(var4) != null) {
         OptionGroup var5 = this.getOptions().getOptionGroup(var4);
         if (var5.isRequired()) {
            this.getRequiredOptions().remove(var5);
         }

         var5.setSelected(var4);
      }

      if (var4.hasArg()) {
         this.processArgs(var4, var2);
      }

      this.cmd.addOption(var4);
   }
}
