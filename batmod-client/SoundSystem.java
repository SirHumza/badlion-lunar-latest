import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class wb8Bx4eP7cIZS6BnOl53k6rMPXf9rmhdqmnn9fLMthRjOGis8E0Fm9Vm2xj86pbLRMJRn1KKjRk0ESZCXYignZ0JI7ogjmIAaJW5 extends SoundSystem {
   private wb8Bx4eP7cIZS6BnOl53k6rMPXf9rmhdqmnn9fLMthRjOGis8E0Fm9Vm2xj86pbLRMJRn1KKjRk0ESZCXYignZ0JI7ogjmIAaJW5(
      PvQvWyro03NWvrWrtsNZXQYge1F4IR0cDnMziWQ8BvNVXX5wqtz9j5BZmlVFm1Ymvfys0DuBae9mGc1wxxonyisBrEFUvkNDOxCp var1
   ) {
      this.BatModClient = var1;
   }

   public boolean playing(String var1) {
      synchronized (SoundSystemConfig.THREAD_SYNC) {
         if (this.soundLibrary == null) {
            return false;
         }

         Source var3 = (Source)this.soundLibrary.getSources().get(var1);
         return var3 == null ? false : var3.playing() || var3.paused() || var3.preLoad;
      }
   }
}
