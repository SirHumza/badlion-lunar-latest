package net.optifine.config;

public class ParserEnchantmentId implements IParserInt {
   @Override
   public int parse(String str, int defVal) {
      aci en = aci.b(str);
      return en == null ? defVal : en.B;
   }
}
