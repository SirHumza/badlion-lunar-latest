public enum OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE {
   BatModClient(0, "SuccessCount"),
   Button(1, "AffectedBlocks"),
   CustomSpinner(2, "AffectedEntities"),
   ButtonAction(3, "AffectedItems"),
   Spinner(4, "QueryResult");

   final int Checkbox;
   final String ProgressBar;

   OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE(int var3, String var4) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
   }

   public int BatModClient() {
      return this.Checkbox;
   }

   public String Button() {
      return this.ProgressBar;
   }

   public static String[] CustomSpinner() {
      String[] var0 = new String[values().length];
      int var1 = 0;

      for (OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE var5 : values()) {
         var0[var1++] = var5.Button();
      }

      return var0;
   }

   public static OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE BatModClient(
      String var0
   ) {
      for (OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE var4 : values()) {
         if (var4.Button().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
