package org.klab.commons.cli.apache;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.klab.commons.cli.Argument;
import org.klab.commons.cli.Binder;
import org.klab.commons.cli.Bound;
import org.klab.commons.cli.HelpOption;
import org.klab.commons.cli.spi.CliProvider;
import vavi.beans.BeanUtil;

public class ApacheCliProvider extends CliProvider {
   private static Log logger = LogFactory.getLog(ApacheCliProvider.class);

   @Override
   public <T> void bind(String[] var1, T var2) {
      CommandLineParser var3;
      try {
         if (this.option.isEmpty()) {
            this.option = "org.apache.commons.cli.BasicParser";
         }

         var3 = (CommandLineParser)Class.forName(this.option).getDeclaredConstructor().newInstance();
      } catch (Exception var24) {
         throw new IllegalArgumentException(var24);
      }

      LinkedHashMap var4 = new LinkedHashMap();
      HashMap var5 = new HashMap();
      final Options var6 = new Options();
      org.klab.commons.cli.Options.ExceptionHandler var7 = null;
      String var8 = null;
      HelpOption var9 = CliProvider.Util.getHelpOption(var2);
      if (var9 != null) {
         var7 = HelpOption.Util.getExceptionHandler(var9);
         var8 = var9.option();
         Option var10;
         if (var9.description().length() > 0) {
            var10 = new Option(var9.option(), var9.description());
         } else {
            var10 = OptionBuilder.create(var9.option());
         }

         var6.addOption(var10);
      }

      for (Field var11 : CliProvider.Util.getOptionFields(var2)) {
         org.klab.commons.cli.Option var12 = var11.getAnnotation(org.klab.commons.cli.Option.class);
         Option var13;
         if (var12.description().length() > 0) {
            if (PosixParser.class.isInstance(var3) && var12.option().length() > 1) {
               OptionBuilder.withLongOpt(var12.option());
               OptionBuilder.withDescription(var12.description());
               var13 = OptionBuilder.create();
            } else {
               var13 = new Option(var12.option(), var12.description());
            }
         } else if (PosixParser.class.isInstance(var3) && var12.option().length() > 1) {
            OptionBuilder.withLongOpt(var12.option());
            var13 = OptionBuilder.create();
         } else {
            var13 = OptionBuilder.create(var12.option());
         }

         if (var12.args() != 0) {
            var13.setArgs(var12.args());
         }

         if (var12.argName().length() > 0) {
            var13.setArgName(var12.argName());
         }

         if (var12.valueSeparator() != '-') {
            var13.setValueSeparator(var12.valueSeparator());
         }

         var13.setRequired(var12.required());
         var6.addOption(var13);
         if (Bound.Util.isBound(var11)) {
            var5.put(var11, var13);
         } else {
            var4.put(var11, var13);
         }
      }

      var4.putAll(var5);
      CommandLine var26 = null;

      try {
         var26 = var3.parse(var6, var1);
      } catch (ParseException var22) {
         this.exceptionHandler.handleException(new org.klab.commons.cli.Options.ExceptionHandler.Context(var22, var2) {
            @Override
            public void printHelp() {
               new HelpFormatter().printHelp(this.bean.getClass().getSimpleName(), var6, true);
            }
         });
         return;
      }

      if (var8 != null && var26.hasOption(var8)) {
         var7.handleException(new org.klab.commons.cli.Options.ExceptionHandler.Context(null, var2) {
            @Override
            public void printHelp() {
               new HelpFormatter().printHelp(this.bean.getClass().getSimpleName(), var6, true);
            }
         });
      }

      final CommandLine var28 = var26;
      Binder.Context var29 = new Binder.Context() {
         @Override
         public boolean hasOption(String var1) {
            return var28.hasOption(var1);
         }
      };

      for (Field var14 : var4.keySet()) {
         Option var15 = (Option)var4.get(var14);
         String var16;
         if (PosixParser.class.isInstance(var3) && var15.getOpt() == null) {
            var16 = var15.getLongOpt();
         } else {
            var16 = var15.getOpt();
         }

         if (var26.hasOption(var16)) {
            if (Bound.Util.isBound(var14)) {
               Binder var17 = Bound.Util.getBinder(var14);
               if (var15.getArgs() > 1) {
                  var17.bind(var2, var26.getOptionValues(var16), var29);
               } else {
                  var17.bind(var2, new String[]{var26.getOptionValue(var16)}, var29);
               }
            } else {
               Class var35 = var14.getType();
               String var18 = var26.getOptionValue(var16);
               this.defaultBinder.bind(var2, var14, var35, var18, var18);
            }

            logger.debug(var15.getArgName() + "[" + var16 + "]: " + BeanUtil.getFieldValue(var14, var2));
         }
      }

      for (Field var34 : var2.getClass().getDeclaredFields()) {
         Argument var36 = var34.getAnnotation(Argument.class);
         if (var36 != null) {
            int var37 = Argument.Util.getIndex(var34);
            boolean var19 = Argument.Util.isRequred(var34);

            try {
               if (Bound.Util.isBound(var34)) {
                  Binder var20 = Bound.Util.getBinder(var34);
                  var20.bind(var2, new String[]{var26.getArgs()[var37]}, var29);
               } else {
                  Class var38 = var34.getType();
                  String var21 = var26.getArgs()[var37];
                  this.defaultBinder.bind(var2, var34, var38, var21, var21);
               }
            } catch (ArrayIndexOutOfBoundsException var23) {
               if (var19) {
                  var7.handleException(new org.klab.commons.cli.Options.ExceptionHandler.Context(var23, var2) {
                     @Override
                     public void printHelp() {
                        new HelpFormatter().printHelp(this.bean.getClass().getSimpleName(), var6, true);
                     }
                  });
               } else {
                  logger.debug("args[" + var37 + "]: not required, ignored");
               }
            }
         }
      }
   }
}
