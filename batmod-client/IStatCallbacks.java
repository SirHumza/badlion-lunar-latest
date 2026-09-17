import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StatType;

class aEXsylGqqTmZNEpqim0C1MaQ6wrAqeBQfV55DVSO10dcsykBfldgDSF90fxNK6v4ME3UB8qaPXYjll2fEIpd93PaUdw4yYXIi940 implements IStatCallbacks {
   aEXsylGqqTmZNEpqim0C1MaQ6wrAqeBQfV55DVSO10dcsykBfldgDSF90fxNK6v4ME3UB8qaPXYjll2fEIpd93PaUdw4yYXIi940(
      nA9Swv5o7xchcGNov04Rc0EQOlLmcISyrrvTO5Q7JLj9uygdiTxWKxuEBGTannv9y4ccbH9j97suVd75z5jIIPrrkLPp9KGuidFx var1
   ) {
      this.BatModClient = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void statCallback(StatType var1, long var2) {
      switch (var1) {
         case TTV_ST_RTMPSTATE:
            this.BatModClient.BatModProgressBar = RTMPState.lookupValue(
               (int)var2
            );
            break;
         case TTV_ST_RTMPDATASENT:
            this.BatModClient.ProgressBar = var2;
      }
   }
}
