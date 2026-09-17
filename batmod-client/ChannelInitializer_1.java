import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

class wFd1hQmJ7M5zaiGtmRIMa8caAffZbDdVfkblaVfL5NBWOvgusH81O3Lpapt4eGs1tvARE7YRAo9Tg2fIlEmVnP6dVTZXgi0QBPeL extends ChannelInitializer {
   wFd1hQmJ7M5zaiGtmRIMa8caAffZbDdVfkblaVfL5NBWOvgusH81O3Lpapt4eGs1tvARE7YRAo9Tg2fIlEmVnP6dVTZXgi0QBPeL(
      qA5bWMiRpUjvglK4lkQ6RKDCp5wf7VfTP5AN6Tm3MD05LavLFkrPHSL7rpwxqPxOWip7u6dKCDiLJvjVGbFynPtQ4DV2HS8fdA8h var1,
      eipDD87ptMYMOyi2DIJITpteR8q0zVlH52sF7kTntG5qb5krA29kDELJbmMLPJoBB1ohvQw8BwMTU0EQwj8uHqTXTUP10TbcYakQ var2,
      Go8Q4QnWnWN69jeeJFNTCXkOQH15MGJcSX7ytPZxDv87l8N767jT897Tayfk1hYvBZSEIZwFFhM7veSw5gsH2NaNRjDrhFSlYaHx var3
   ) {
      this.CustomSpinner = var1;
      this.BatModClient = var2;
      this.Button = var3;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      var1.pipeline()
         .addLast(new ChannelHandler[]{new aFjcDJXw7PGlyBnAAwln3Km2OSuTaBLbmeqYpQg3yWraa0HaC3qrATpYQ31eIHl7kcc8alAcSjykBOsjZDjxSBhM9QGCLPhwjuqT(this)});
   }
}
