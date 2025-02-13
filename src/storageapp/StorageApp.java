package storageapp;

/**
 *
 * @author juan_
 */
public class StorageApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llama a la GUI
        StorageInterface gui = new StorageInterface();
        gui.setVisible(true);
        
    }
    
}
