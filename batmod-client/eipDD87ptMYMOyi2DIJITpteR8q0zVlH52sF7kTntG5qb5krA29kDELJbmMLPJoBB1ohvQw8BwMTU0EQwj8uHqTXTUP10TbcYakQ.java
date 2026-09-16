import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class eipDD87ptMYMOyi2DIJITpteR8q0zVlH52sF7kTntG5qb5krA29kDELJbmMLPJoBB1ohvQw8BwMTU0EQwj8uHqTXTUP10TbcYakQ {
   private final String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
   private final int BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;

   private eipDD87ptMYMOyi2DIJITpteR8q0zVlH52sF7kTntG5qb5krA29kDELJbmMLPJoBB1ohvQw8BwMTU0EQwj8uHqTXTUP10TbcYakQ(String var1, int var2) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = var2;
   }

   public String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      return IDN.toASCII(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I);
   }

   public int BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      return this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
   }

   public static eipDD87ptMYMOyi2DIJITpteR8q0zVlH52sF7kTntG5qb5krA29kDELJbmMLPJoBB1ohvQw8BwMTU0EQwj8uHqTXTUP10TbcYakQ Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0
   ) {
      if (var0 == null) {
         return null;
      }

      String[] var1 = var0.split(":");
      if (var0.startsWith("[")) {
         int var2 = var0.indexOf("]");
         if (var2 > 0) {
            String var3 = var0.substring(1, var2);
            String var4 = var0.substring(var2 + 1).trim();
            if (var4.startsWith(":") && var4.length() > 0) {
               var4 = var4.substring(1);
               var1 = new String[]{var3, var4};
            } else {
               var1 = new String[]{var3};
            }
         }
      }

      if (var1.length > 2) {
         var1 = new String[]{var0};
      }

      String var5 = var1[0];
      int var6 = var1.length > 1 ? Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1[1], 25565) : 25565;
      if (var6 == 25565) {
         String[] var8 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var5);
         var5 = var8[0];
         var6 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var8[1], 25565);
      }

      return new eipDD87ptMYMOyi2DIJITpteR8q0zVlH52sF7kTntG5qb5krA29kDELJbmMLPJoBB1ohvQw8BwMTU0EQwj8uHqTXTUP10TbcYakQ(var5, var6);
   }

   private static String[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var0) {
      try {
         String var1 = "com.sun.jndi.dns.DnsContextFactory";
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable var2 = new Hashtable();
         var2.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         var2.put("java.naming.provider.url", "dns:");
         var2.put("com.sun.jndi.dns.timeout.retries", "1");
         InitialDirContext var3 = new InitialDirContext(var2);
         Attributes var4 = var3.getAttributes("_minecraft._tcp." + var0, new String[]{"SRV"});
         String[] var5 = var4.get("srv").get().toString().split(" ", 4);
         return new String[]{var5[3], var5[2]};
      } catch (Throwable var6) {
         return new String[]{var0, Integer.toString(25565)};
      }
   }

   private static int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }
}
