import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr {
   public static final File BatModClient() {
      JFileChooser var0 = new JFileChooser();
      FileNameExtensionFilter var1 = new FileNameExtensionFilter("PNG & JPG Format", "png", "jpg");
      var0.setFileFilter(var1);
      var0.setMultiSelectionEnabled(false);
      var0.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
      var0.setDialogTitle("Select a Cape");
      var0.showOpenDialog(new JFrame().getParent());
      return var0.getSelectedFile();
   }
}
