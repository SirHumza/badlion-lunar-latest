public enum ucQXyc9DcUW5tszC2UEfzmDZnDCKJCTEunY98MTVci6QteDN1tELPZMJfGcgYcDRXifBSspONCAXDUTrxoYbmO9mj4WmcT14Rj7N {
   BatModClient,
   Button,
   CustomSpinner,
   ButtonAction,
   Spinner;

   public static ucQXyc9DcUW5tszC2UEfzmDZnDCKJCTEunY98MTVci6QteDN1tELPZMJfGcgYcDRXifBSspONCAXDUTrxoYbmO9mj4WmcT14Rj7N BatModClient(
      String var0
   ) {
      for (ucQXyc9DcUW5tszC2UEfzmDZnDCKJCTEunY98MTVci6QteDN1tELPZMJfGcgYcDRXifBSspONCAXDUTrxoYbmO9mj4WmcT14Rj7N var4 : values()) {
         if (var4.name().equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return BatModClient;
   }

   public static String[] BatModClient() {
      String[] var0 = new String[values().length];
      int var1 = 0;

      for (ucQXyc9DcUW5tszC2UEfzmDZnDCKJCTEunY98MTVci6QteDN1tELPZMJfGcgYcDRXifBSspONCAXDUTrxoYbmO9mj4WmcT14Rj7N var5 : values()) {
         var0[var1++] = var5.name().toLowerCase();
      }

      return var0;
   }
}
