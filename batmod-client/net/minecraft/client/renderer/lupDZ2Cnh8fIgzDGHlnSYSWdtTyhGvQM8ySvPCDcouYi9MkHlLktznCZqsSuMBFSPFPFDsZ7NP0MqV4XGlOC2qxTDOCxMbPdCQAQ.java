package net.minecraft.client.renderer;

class IntegerSpinner
   extends gPEIx5mG3EtdJLuXNaFxxtN2mtjIBg7MQ5YJf9Amb46dssqOCDY35SCz2vpDLZFx0aUmoGbkNXf5wy9UW1DPxfWXSNZKGlClIsFS {
   IntegerSpinner(
      net.minecraft.client.renderer.ColorChooser var1
   ) {
      this.BatModClient = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI BatModClient(
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var1
   ) {
      hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY var2 = (hKxgqI5lzzy9MUJFJlOePrdVzeANRa6mR6SJHX3PX9gukJFnmUPC9YhNQcay5bJXW7J5ah59RzdmSQZwIgmeQmvfExsxEZOsaOOY)var1.BatModClient(
         O6gGEEltrtGvGmM5u95jrCxUtdSX5p37H1gn2QesaaKctdwt3qiO7SUM3wzj8apOSgiGRvkPxPCYgdf1x6Xb2i1SyUaUFTBWX31k.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
      );
      switch (var2) {
         case BatModClient:
         default:
            return new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI("quartz_block", "normal");
         case Button:
            return new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI("chiseled_quartz_block", "normal");
         case CustomSpinner:
            return new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI("quartz_column", "axis=y");
         case ButtonAction:
            return new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI("quartz_column", "axis=x");
         case Spinner:
            return new dHaQUo3gOuF3z3Ec5K2gahlPkAXnoV5IiHpWsWYlrdQehUakWAcbqyfbBtCOOcWpTaCPl6IQvlaN4r52VSgCgvqqK14HdrhWFJqI("quartz_column", "axis=z");
      }
   }
}
