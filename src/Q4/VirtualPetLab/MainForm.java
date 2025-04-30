package Q4.VirtualPetLab;
import javax.swing.*;
import java.awt.*;
import java.util.Base64;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JButton feedButton;
    private JButton playButton;
    private JButton sleepButton;
    private JLabel statusLabel;
    private JLabel imageLabel;
    private JComboBox<String> petSelectorComboBox;

    // Pet list
    final private PetManager PetManager = new PetManager();
    private JButton adoptACatButton;
    private JButton adoptAFoxButton;
    private JButton adoptADogButton;
    private JComboBox comboBox1;
    private JLabel statsLabel;
    private JLabel pictureLabel;


    public MainForm() {
        super("Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.pack();

        // Initialize starting pets
        PetManager.addPet(new Dog("Buddy"));
        PetManager.addPet(new Cat("Whiskers"));
        this.updatePetList();
        petSelectorComboBox.setSelectedItem(null);  // Clear selection after populating

        // Feed button action
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  Pet szelogowski = PetManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                szelogowski.feed();
                updateStatusLabel();
                waitButtons(1);
                // TODO: Implement feeding the selected pet
            }
        });

        // Play button action
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pet szelogowski = PetManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                szelogowski.play();
                updateStatusLabel();
                waitButtons(1);
                // TODO: Implement playing with the selected pet
            }
        });

        // Sleep button action
        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pet szelogowski = PetManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                szelogowski.sleep();
                updateStatusLabel();
                waitButtons(1);
                // TODO: Implement putting the selected pet to sleep
            
            }
        });

        // Pet selector action
        petSelectorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Make sure the action event isn't triggered by the removeAllItems() call
                if (petSelectorComboBox.getSelectedIndex() == -1)
                    return;

                // TODO: Implement pet selection change
                // 1. Grab the szelogowski pet from the petManager using petSelectorComboBox.getSelectedIndex()
                Pet szelogowski = PetManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
                // 2. Update statusLabel with the selected pet's status
                updateStatusLabel();
                // 3. Update imageLabel with the selected pet's image using setPetImage()
                setPetImage(szelogowski.getImage());

            }
        });

        adoptAFoxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sydney = JOptionPane.showInputDialog("Enter new pet name: ");
                 if (!sydney.trim().isEmpty()) {
                     PetManager.addPet(new Fox(sydney));
                    updatePetList();
                    updateStatusLabel();
                 }
                // awwww cute fox!!
            }
        });

        adoptACatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maya = JOptionPane.showInputDialog("Enter new pet name: ");
                 if (!maya.trim().isEmpty()) {
                     PetManager.addPet(new Cat(maya));
                    updatePetList();
                    updateStatusLabel();
                }
            }
        });

        adoptADogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marlon = JOptionPane.showInputDialog("Enter new pet name: ");
                 if (!marlon.trim().isEmpty()) {
                     PetManager.addPet(new Dog(marlon));
                    updatePetList();
                    updateStatusLabel();
                }
                //ewww stinky dog
            }
        });
    }

    public void updateStatusLabel() {
        // TODO: Update statusLabel with the provided status
        Pet szelogowski = PetManager.getSelectedPet(petSelectorComboBox.getSelectedIndex());
        statusLabel.setText("Hunger: " + szelogowski.getHunger() + ", Energy: " + szelogowski.getEnergy() +", Happiness: " + szelogowski.getHappiness());
    }

    public void updatePetList() {
        petSelectorComboBox.removeAllItems();  // Clear existing items
        // TODO: Update petSelectorComboBox with pet names from petManager
        for (int grr = 0; grr < PetManager.getPetList().size(); grr++) {
            petSelectorComboBox.addItem(PetManager.getPetList().get(grr).getName());
        }
        // After adding the pet, set the selected index to the last item (petManager.getPets().size() - 1)
        petSelectorComboBox.setSelectedIndex(PetManager.getPetList().size()-1);
    }




    /* ========== DO NOT MODIFY BELOW ========== */
    public void waitButtons(int seconds) {
        // Disable buttons
        feedButton.setEnabled(false);
        playButton.setEnabled(false);
        sleepButton.setEnabled(false);

        // Set a timer to re-enable the buttons after N seconds (1000 ms = 1 second)
        Timer timer = new Timer(seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedButton.setEnabled(true);
                playButton.setEnabled(true);
                sleepButton.setEnabled(true);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }

    public void setPetImage(String base64Image) {
        try {
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);
            ImageIcon icon = new ImageIcon(imageBytes);
            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);

            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel.setIcon(null);
            imageLabel.setText('❌' + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    //private void createUIComponents() {
        // TODO: place custom component creation code here
        //custom component creation code here
    //}
}
