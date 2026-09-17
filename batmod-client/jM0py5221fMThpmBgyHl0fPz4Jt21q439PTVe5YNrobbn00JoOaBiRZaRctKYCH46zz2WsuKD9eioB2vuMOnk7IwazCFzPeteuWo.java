public enum jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo
   implements kL1nOQpXwDl2V9inoZyIUR90RLwre33st31iJQtjGIk6qqPNCyw4LG9FJl1wcZgCaI2jQzAJpgiSruoUWInPiMK7QcvluDLWntZ {
   BatModClient(
      0,
      "dirt",
      "default",
      cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d.ColorTextPane
   ),
   Button(
      1,
      "coarse_dirt",
      "coarse",
      cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d.ColorTextPane
   ),
   CustomSpinner(
      2,
      "podzol",
      cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
   );

   private static final jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo[] ButtonAction = new jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo[values().length];
   private final int Spinner;
   private final String Checkbox;
   private final String ProgressBar;
   private final cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d BatModProgressBar;

   jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo(
      int var3, String var4, cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d var5
   ) {
      this(var3, var4, var4, var5);
   }

   jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo(
      int var3, String var4, String var5, cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d var6
   ) {
      this.Spinner = var3;
      this.Checkbox = var4;
      this.ProgressBar = var5;
      this.BatModProgressBar = var6;
   }

   public int Button() {
      return this.Spinner;
   }

   public String CustomSpinner() {
      return this.ProgressBar;
   }

   public cF2zF2HfDzm75NeYYqJm9c29cnJYJEGtbFInWJUyYLQ6qAPf0h0hyjebrLNEHenfENfze5SRfs2RIXIAEUKzHuDzl6qyAKm4vK8d ButtonAction() {
      return this.BatModProgressBar;
   }

   @Override
   public String toString() {
      return this.Checkbox;
   }

   public static jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo BatModClient(
      int var0
   ) {
      if (var0 < 0 || var0 >= ButtonAction.length) {
         var0 = 0;
      }

      return ButtonAction[var0];
   }

   @Override
   public String BatModClient() {
      return this.Checkbox;
   }

   static {
      for (jM0py5221fMThpmBgyHl0fPz4Jt21q439PTVe5YNrobbn00JoOaBiRZaRctKYCH46zz2WsuKD9eioB2vuMOnk7IwazCFzPeteuWo var3 : values()) {
         ButtonAction[var3.Button()] = var3;
      }
   }
}
