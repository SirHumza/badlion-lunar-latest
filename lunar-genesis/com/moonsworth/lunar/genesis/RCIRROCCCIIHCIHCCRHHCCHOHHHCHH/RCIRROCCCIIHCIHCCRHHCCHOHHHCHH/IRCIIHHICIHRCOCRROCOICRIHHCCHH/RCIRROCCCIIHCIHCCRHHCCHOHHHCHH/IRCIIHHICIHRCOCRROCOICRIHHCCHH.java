package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   PRIVATE(':', ','),
   REGISTRY('!', '?');

   private final char innerNodeCode;
   private final char leafNodeCode;

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(char var3, char var4) {
      this.innerNodeCode = var3;
      this.leafNodeCode = var4;
   }

   char getLeafNodeCode() {
      return this.leafNodeCode;
   }

   char getInnerNodeCode() {
      return this.innerNodeCode;
   }

   static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromCode(char var0) {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : values()) {
         if (var4.getInnerNodeCode() == var0 || var4.getLeafNodeCode() == var0) {
            return var4;
         }
      }

      throw new IllegalArgumentException("No enum corresponding to given code: " + var0);
   }

   static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromIsPrivate(boolean var0) {
      return var0 ? PRIVATE : REGISTRY;
   }
}
