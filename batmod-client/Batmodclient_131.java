public class B9N0BtGq6RZLf8QCe5OPOKXfmPZWJGrDLsZWkOrfe25wiBcS10N48o9XHDauPs8ztUv5vUpi8CK4uG5PzoPM7BWmPA8TSzsIIYT {
   public long BatModClient = 0L;
   public long Button = 0L;

   public void BatModClient() {
      if (PYVSfnivtmqUso9TowOWG87ucf6g5t79vM2TAXkyOihpBUmSzFS27VdOi3xE3RxWEK0heY2qmQl5mgsfH5fVezJFaV5lMbqt9zV.BatModClient
         && this.BatModClient == 0L) {
         this.BatModClient = System.nanoTime();
      }
   }

   public void Button() {
      if (PYVSfnivtmqUso9TowOWG87ucf6g5t79vM2TAXkyOihpBUmSzFS27VdOi3xE3RxWEK0heY2qmQl5mgsfH5fVezJFaV5lMbqt9zV.BatModClient
         && this.BatModClient != 0L) {
         this.Button = this.Button
            + (System.nanoTime() - this.BatModClient);
         this.BatModClient = 0L;
      }
   }

   private void CustomSpinner() {
      this.Button = 0L;
      this.BatModClient = 0L;
   }
}
