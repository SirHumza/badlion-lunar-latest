public class fgQuuXqsFN0qhthPlGriAhtlOuvyihlcqnlzYorZmawvWupOKOTKbWPax55z9S26uyWOPxcgsuaE6Qth8cM77A06aOjgVrmnR5uO
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;
   private int CustomSpinner;
   private int ButtonAction;
   private int Spinner;

   public fgQuuXqsFN0qhthPlGriAhtlOuvyihlcqnlzYorZmawvWupOKOTKbWPax55z9S26uyWOPxcgsuaE6Qth8cM77A06aOjgVrmnR5uO() {
   }

   public fgQuuXqsFN0qhthPlGriAhtlOuvyihlcqnlzYorZmawvWupOKOTKbWPax55z9S26uyWOPxcgsuaE6Qth8cM77A06aOjgVrmnR5uO(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      this.BatModClient = var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb();
      this.Button = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 * 32.0
      );
      this.CustomSpinner = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa * 32.0
      );
      this.ButtonAction = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 * 32.0
      );
      if (var1 instanceof OeVe6x8UgYmdnjTvMmRtQrR1YqXwgTa8QbP6adPgOlMn7zAkOwj3KUII1IlR5JUacvOCYNJcgUX6W8VW2Ilp4moycemrBmQCQaH3) {
         this.Spinner = 1;
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.ButtonAction();
      this.Spinner = var1.readByte();
      this.Button = var1.readInt();
      this.CustomSpinner = var1.readInt();
      this.ButtonAction = var1.readInt();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.Button(
         this.BatModClient
      );
      var1.writeByte(this.Spinner);
      var1.writeInt(this.Button);
      var1.writeInt(this.CustomSpinner);
      var1.writeInt(this.ButtonAction);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.ButtonAction;
   }

   public int Spinner() {
      return this.Spinner;
   }
}
