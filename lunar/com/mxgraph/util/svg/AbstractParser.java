package com.mxgraph.util.svg;

import java.io.IOException;
import java.util.MissingResourceException;

public abstract class AbstractParser implements Parser {
   public static final String BUNDLE_CLASSNAME = "org.apache.batik.parser.resources.Messages";
   protected ErrorHandler errorHandler = new DefaultErrorHandler();
   protected NormalizingReader reader;
   protected int current;

   public int getCurrent() {
      return this.current;
   }

   @Override
   public void setErrorHandler(ErrorHandler var1) {
      this.errorHandler = var1;
   }

   @Override
   public void parse(String var1) {
      try {
         this.reader = new StringNormalizingReader(var1);
         this.doParse();
      } catch (IOException var3) {
         this.errorHandler.error(new ParseException(this.createErrorMessage("io.exception", null), var3));
      }
   }

   protected abstract void doParse();

   protected void reportError(String var1, Object[] var2) {
      this.errorHandler.error(new ParseException(this.createErrorMessage(var1, var2), this.reader.getLine(), this.reader.getColumn()));
   }

   protected void reportCharacterExpectedError(char var1, int var2) {
      this.reportError("character.expected", new Object[]{new Character(var1), new Integer(var2)});
   }

   protected void reportUnexpectedCharacterError(int var1) {
      this.reportError("character.unexpected", new Object[]{new Integer(var1)});
   }

   protected String createErrorMessage(String var1, Object[] var2) {
      try {
         return "";
      } catch (MissingResourceException var4) {
         return var1;
      }
   }

   protected String getBundleClassName() {
      return "org.apache.batik.parser.resources.Messages";
   }

   protected void skipSpaces() {
      while (true) {
         switch (this.current) {
            case 9:
            case 10:
            case 13:
            case 32:
               this.current = this.reader.read();
               break;
            default:
               return;
         }
      }
   }

   protected void skipCommaSpaces() {
      while (true) {
         switch (this.current) {
            case 9:
            case 10:
            case 13:
            case 32:
               this.current = this.reader.read();
               break;
            default:
               if (this.current == 44) {
                  while (true) {
                     switch (this.current = this.reader.read()) {
                        case 9:
                        case 10:
                        case 13:
                        case 32:
                           break;
                        default:
                           return;
                     }
                  }
               }

               return;
         }
      }
   }
}
