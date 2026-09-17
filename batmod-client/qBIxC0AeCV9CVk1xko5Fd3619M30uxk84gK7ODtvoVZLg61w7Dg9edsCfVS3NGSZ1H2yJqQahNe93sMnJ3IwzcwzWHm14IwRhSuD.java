public class qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD {
   public final double BatModClient;
   public final double Button;
   public final double CustomSpinner;

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(double var1, double var3, double var5) {
      if (var1 == -0.0) {
         var1 = 0.0;
      }

      if (var3 == -0.0) {
         var3 = 0.0;
      }

      if (var5 == -0.0) {
         var5 = 0.0;
      }

      this.BatModClient = var1;
      this.Button = var3;
      this.CustomSpinner = var5;
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
      u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var1
   ) {
      this(
         var1.BatModProgressBar(),
         var1.ColorChooser(),
         var1.IntegerSpinner()
      );
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
         var1.BatModClient
            - this.BatModClient,
         var1.Button
            - this.Button,
         var1.CustomSpinner
            - this.CustomSpinner
      );
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient() {
      double var1 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         this.BatModClient
               * this.BatModClient
            + this.Button
               * this.Button
            + this.CustomSpinner
               * this.CustomSpinner
      );
      return var1 < 1.0E-4
         ? new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(0.0, 0.0, 0.0)
         : new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
            this.BatModClient / var1,
            this.Button / var1,
            this.CustomSpinner / var1
         );
   }

   public double Button(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return this.BatModClient
            * var1.BatModClient
         + this.Button
            * var1.Button
         + this.CustomSpinner
            * var1.CustomSpinner;
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD CustomSpinner(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
         this.Button
               * var1.CustomSpinner
            - this.CustomSpinner
               * var1.Button,
         this.CustomSpinner
               * var1.BatModClient
            - this.BatModClient
               * var1.CustomSpinner,
         this.BatModClient
               * var1.Button
            - this.Button
               * var1.BatModClient
      );
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD ButtonAction(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return this.BatModClient(
         var1.BatModClient,
         var1.Button,
         var1.CustomSpinner
      );
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient(
      double var1, double var3, double var5
   ) {
      return this.Button(-var1, -var3, -var5);
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD Spinner(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return this.Button(
         var1.BatModClient,
         var1.Button,
         var1.CustomSpinner
      );
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD Button(
      double var1, double var3, double var5
   ) {
      return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
         this.BatModClient + var1,
         this.Button + var3,
         this.CustomSpinner + var5
      );
   }

   public double Checkbox(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      double var2 = var1.BatModClient
         - this.BatModClient;
      double var4 = var1.Button
         - this.Button;
      double var6 = var1.CustomSpinner
         - this.CustomSpinner;
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var2 * var2 + var4 * var4 + var6 * var6
      );
   }

   public double ProgressBar(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      double var2 = var1.BatModClient
         - this.BatModClient;
      double var4 = var1.Button
         - this.Button;
      double var6 = var1.CustomSpinner
         - this.CustomSpinner;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double Button() {
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         this.BatModClient
               * this.BatModClient
            + this.Button
               * this.Button
            + this.CustomSpinner
               * this.CustomSpinner
      );
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1, double var2
   ) {
      double var4 = var1.BatModClient
         - this.BatModClient;
      double var6 = var1.Button
         - this.Button;
      double var8 = var1.CustomSpinner
         - this.CustomSpinner;
      if (var4 * var4 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.BatModClient) / var4;
      return var10 >= 0.0 && var10 <= 1.0
         ? new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
            this.BatModClient + var4 * var10,
            this.Button + var6 * var10,
            this.CustomSpinner + var8 * var10
         )
         : null;
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD Button(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1, double var2
   ) {
      double var4 = var1.BatModClient
         - this.BatModClient;
      double var6 = var1.Button
         - this.Button;
      double var8 = var1.CustomSpinner
         - this.CustomSpinner;
      if (var6 * var6 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.Button) / var6;
      return var10 >= 0.0 && var10 <= 1.0
         ? new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
            this.BatModClient + var4 * var10,
            this.Button + var6 * var10,
            this.CustomSpinner + var8 * var10
         )
         : null;
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD CustomSpinner(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1, double var2
   ) {
      double var4 = var1.BatModClient
         - this.BatModClient;
      double var6 = var1.Button
         - this.Button;
      double var8 = var1.CustomSpinner
         - this.CustomSpinner;
      if (var8 * var8 < 1.0E-7F) {
         return null;
      }

      double var10 = (var2 - this.CustomSpinner) / var8;
      return var10 >= 0.0 && var10 <= 1.0
         ? new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(
            this.BatModClient + var4 * var10,
            this.Button + var6 * var10,
            this.CustomSpinner + var8 * var10
         )
         : null;
   }

   @Override
   public String toString() {
      return "("
         + this.BatModClient
         + ", "
         + this.Button
         + ", "
         + this.CustomSpinner
         + ")";
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD BatModClient(
      float var1
   ) {
      float var2 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
         var1
      );
      float var3 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var1
      );
      double var4 = this.BatModClient;
      double var6 = this.Button * var2
         + this.CustomSpinner * var3;
      double var8 = this.CustomSpinner * var2
         - this.Button * var3;
      return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(var4, var6, var8);
   }

   public qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD Button(
      float var1
   ) {
      float var2 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
         var1
      );
      float var3 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var1
      );
      double var4 = this.BatModClient * var2
         + this.CustomSpinner * var3;
      double var6 = this.Button;
      double var8 = this.CustomSpinner * var2
         - this.BatModClient * var3;
      return new qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD(var4, var6, var8);
   }
}
