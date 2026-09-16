package com.mxgraph.util.svg;

public class DefaultErrorHandler implements ErrorHandler {
   @Override
   public void error(ParseException var1) {
      throw var1;
   }
}
