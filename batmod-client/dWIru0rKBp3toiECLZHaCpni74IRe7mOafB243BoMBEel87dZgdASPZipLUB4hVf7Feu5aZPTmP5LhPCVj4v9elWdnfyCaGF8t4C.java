import com.google.common.base.Predicate;

public class dWIru0rKBp3toiECLZHaCpni74IRe7mOafB243BoMBEel87dZgdASPZipLUB4hVf7Feu5aZPTmP5LhPCVj4v9elWdnfyCaGF8t4C {
   private final xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY BatModClient;
   private final q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Button;
   private final boolean CustomSpinner;
   private jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS ButtonAction;
   private gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI Spinner;
   private boolean Checkbox;

   public dWIru0rKBp3toiECLZHaCpni74IRe7mOafB243BoMBEel87dZgdASPZipLUB4hVf7Feu5aZPTmP5LhPCVj4v9elWdnfyCaGF8t4C(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2,
      boolean var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   public jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS BatModClient() {
      if (this.ButtonAction == null
         && (
            this.CustomSpinner
               || this.BatModClient
                  .Checkbox(
                     this.Button
                  )
         )) {
         this.ButtonAction = this.BatModClient
            .Button(
               this.Button
            );
      }

      return this.ButtonAction;
   }

   public gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI Button() {
      if (this.Spinner == null
         && !this.Checkbox) {
         this.Spinner = this.BatModClient
            .BatModClient(
               this.Button
            );
         this.Checkbox = true;
      }

      return this.Spinner;
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW CustomSpinner() {
      return this.Button;
   }

   public static Predicate BatModClient(Predicate var0) {
      return new i9wazrCSuvMyj8qkgbdqc1HStFsH6e0ZctlRh7hyU5kBrH5FLLzcKeQNiTvN36wCiQNgtaW1Avz25aqVra0kJcg4fQy9iIAbwDD(var0);
   }
}
