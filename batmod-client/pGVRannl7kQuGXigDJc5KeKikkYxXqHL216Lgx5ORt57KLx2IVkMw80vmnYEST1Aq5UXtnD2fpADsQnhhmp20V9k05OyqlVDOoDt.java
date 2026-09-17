public enum pGVRannl7kQuGXigDJc5KeKikkYxXqHL216Lgx5ORt57KLx2IVkMw80vmnYEST1Aq5UXtnD2fpADsQnhhmp20V9k05OyqlVDOoDt {
   BatModClient,
   Button,
   CustomSpinner,
   ButtonAction,
   Spinner,
   Checkbox,
   ProgressBar,
   BatModProgressBar,
   ColorChooser,
   IntegerSpinner,
   TextField;

   public boolean BatModClient(
      q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2 var1
   ) {
      if (this == BatModClient) {
         return true;
      }

      if (this == IntegerSpinner
         && var1.ButtonAction()) {
         return true;
      }

      if (var1 instanceof Bn0Hx3Qxohsra9mqMMM7AWPK9FKsJHF5jgWiWxspfajCyiIupvx0DPByxuZEL1eledVSZ6z5lhzbc7GnMmTpG8zrWnEf0WTRFXCI) {
         if (this == Button) {
            return true;
         }

         Bn0Hx3Qxohsra9mqMMM7AWPK9FKsJHF5jgWiWxspfajCyiIupvx0DPByxuZEL1eledVSZ6z5lhzbc7GnMmTpG8zrWnEf0WTRFXCI var2 = (Bn0Hx3Qxohsra9mqMMM7AWPK9FKsJHF5jgWiWxspfajCyiIupvx0DPByxuZEL1eledVSZ6z5lhzbc7GnMmTpG8zrWnEf0WTRFXCI)var1;
         return var2.BatModProgressBar == 0
            ? this == Checkbox
            : (
               var2.BatModProgressBar == 2
                  ? this == ButtonAction
                  : (
                     var2.BatModProgressBar == 1
                        ? this == Spinner
                        : (
                           var2.BatModProgressBar == 3
                              ? this == CustomSpinner
                              : false
                        )
                  )
            );
      } else {
         return var1 instanceof dg9JvwO2hvpip5oa3hbW7bBAtNUiOpG7OXr12aiyZdV8H3WuveQqvOZt9P09MCJbcnAhu02twQP8GKYiKnnWaPuKvRsjMmpk2a2
            ? this == ProgressBar
            : (
               var1 instanceof S7ARwmAofQf96EwWnfIsZF45RPo0B2VXLCi9nDM0yk4RQYnb1a7gWdOxen17igcjEDPlhlVLv5PxY1KNWOXtBK0Ql0Kb1O4ivY0r
                  ? this == BatModProgressBar
                  : (
                     var1 instanceof I07Iau5X9xgfpY1hA4UoAXxsRQ90FRfU15e3TCtSfLyy6Vee1pcFy9SvHhfoUJVS94vNoL3S7fNEQDemxKICWkkWGety5H2fwqwI
                        ? this == TextField
                        : (
                           var1 instanceof D1ab0dPemvs5B4Gm93Uap2qmHPE8ZZhcYwADbTbJygvSwWt5snNVwMHOMEL6Ghr6nkNygTNjjc8l5wuenECYM1lF7icTW4fYYYjp
                              ? this == ColorChooser
                              : false
                        )
                  )
            );
      }
   }
}
