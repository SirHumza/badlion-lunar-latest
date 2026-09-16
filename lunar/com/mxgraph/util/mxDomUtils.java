package com.mxgraph.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mxDomUtils {
   public static Document createDocument() {
      return mxXmlUtils.getDocumentBuilder().newDocument();
   }

   public static Document createSvgDocument(int var0, int var1) {
      Document var2 = createDocument();
      Element var3 = var2.createElement("svg");
      String var4 = String.valueOf(var0);
      String var5 = String.valueOf(var1);
      var3.setAttribute("width", var4);
      var3.setAttribute("height", var5);
      var3.setAttribute("viewBox", "0 0 " + var4 + " " + var5);
      var3.setAttribute("version", "1.1");
      var3.setAttribute("xmlns", mxConstants.NS_SVG);
      var3.setAttribute("xmlns:xlink", mxConstants.NS_XLINK);
      var2.appendChild(var3);
      return var2;
   }

   public static Document createVmlDocument() {
      Document var0 = createDocument();
      Element var1 = var0.createElement("html");
      var1.setAttribute("xmlns:v", "urn:schemas-microsoft-com:vml");
      var1.setAttribute("xmlns:o", "urn:schemas-microsoft-com:office:office");
      var0.appendChild(var1);
      Element var2 = var0.createElement("head");
      Element var3 = var0.createElement("style");
      var3.setAttribute("type", "text/css");
      var3.appendChild(var0.createTextNode("<!-- v\\:* {behavior: url(#default#VML);} -->"));
      var2.appendChild(var3);
      var1.appendChild(var2);
      Element var4 = var0.createElement("body");
      var1.appendChild(var4);
      return var0;
   }

   public static Document createHtmlDocument() {
      Document var0 = createDocument();
      Element var1 = var0.createElement("html");
      var0.appendChild(var1);
      Element var2 = var0.createElement("head");
      var1.appendChild(var2);
      Element var3 = var0.createElement("body");
      var1.appendChild(var3);
      return var0;
   }
}
