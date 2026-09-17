import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class MNJ6OLXi3GTeJgmiTbSesVyFkBRcJZNLBHOEHDRMJcPC2TkbrxMo8QIgihdzOOKH5s4eJzBLRBFJKULGjs1mvkiVpHKw2pa6uvyu {
   public int BatModClient;
   public int Button;

   public void BatModClient() {
      Mouse.setGrabbed(true);
      this.BatModClient = 0;
      this.Button = 0;
   }

   public void Button() {
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   public void CustomSpinner() {
      this.BatModClient = Mouse.getDX();
      this.Button = Mouse.getDY();
   }
}
