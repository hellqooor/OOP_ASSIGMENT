import java.awt.*;
import java.io.File;
import javax.swing.*;

public class GUI2 {
    private static final String FOLDER_GAMBAR = "/Users/hell/Documents/Collage/SEMESTER 3/OOP/GUI/Pict";

    private static PData[] pokedex = {
        new PData("001.png", "Bulbasaur is a small, quadrupedal amphibian Pokémon that has blue-green skin with darker patches. It has red eyes with white pupils, pointed, ear-like structures on top of its head, and a short, blunt snout with a wide mouth. Small, pointed teeth are visible in the upper jaw when the mouth is open.\n \nEach of its thick legs ends with three sharp claws. On Bulbasaur's back is a green plant bulb that conceals two slender, tentacle-like vines, which grow from a seed planted there at birth. The bulb also provides it with energy through photosynthesis and from the nutrient-rich seeds contained within.", "Bulbasaur"),
        new PData("002.png", "Ivysaur is a quadrupedal amphibian Pokémon that has blue-green skin with darker patches. On top of its head are pointed ears with black insides, and it has narrow red eyes. Ivysaur has a short, rounded snout with a wide mouth and two pointed teeth in its upper jaw.\n \nEach of its feet has three claws on them. The bulb on its back has bloomed into a giant pink bud. A short brown trunk surrounded by leafy green fronds supports the bud.", "Ivysaur"),
        new PData("003.png", "Venusaur is a squat, quadrupedal amphibian Pokémon with bumpy, blue-green skin. It has small, circular red eyes and a short, blunt snout. Its mouth is wide with two pointed teeth in the upper jaw and four in the lower jaw. On top of its head are small, pointed ears with reddish-pink insides.\n \nIt has three clawed toes on each foot. The bud on its back has bloomed into a large pink, white-spotted flower. The flower is supported by a thick, brown trunk surrounded by green fronds. A female Venusaur has a gynoecium in the center of its flower.", "Venusaur"),
        new PData("004.png", "Charmander is a bipedal, reptilian Pokémon with a primarily orange body and blue eyes. Its underside from the chest down and the soles of its feet are cream-colored. It has two small fangs visible in its upper jaw and two smaller fangs in its lower jaw. A fire burns at the tip of this Pokémon's slender tail, which has blazed there since Charmander's birth.", "Charmander"),
        new PData("005.png", "Charmeleon is a bipedal, reptilian Pokémon. It has dark red scales and a cream underside from the chest down. It has blue eyes and a long snout with a slightly hooked tip. On the back of its head is a single horn-like protrusion. It has relatively long arms with three sharp claws. Its short legs have plantigrade feet with three claws and cream-colored soles. The tip of its long, powerful tail has a flame burning on it. The temperature rises to unbearable levels if Charmeleon swings its tail.", "Charmeleon"),
        new PData("006.png", "Charizard is a draconic, bipedal Pokémon. It is primarily orange with a cream underside from the chest to the tip of its tail. It has a long neck, small blue eyes, slightly raised nostrils, and two horn-like structures protruding from the back of its rectangular head. Two fangs are visible in its upper jaw when its mouth is closed. Two large wings with blue-green undersides sprout from its back, and a horn-like appendage juts out from the top of the third joint of each wing. A single wing finger is visible through the center of each wing membrane. Charizard's arms are short and skinny compared to its robust belly, and each limb has three white claws. In Pokémon Red and Green Versions, Charizard is seemingly shown holding a fireball, implying that it's capable of manipulating its flames using its hands; this is seen in media where it uses Fire Punch. It has stocky legs with cream-colored soles on each of its plantigrade feet. The tip of its long, tapering tail burns with a sizable flame, which can intensify to a blue flame if Charizard is irritated.", "Charizard"),
        new PData("007.png", "Squirtle is a small reptilian Pokémon that resembles a light-blue turtle. While it typically walks on its two short legs, it has been shown to run on all fours in Super Smash Bros. Brawl. It has large, purplish, or reddish eyes and a slightly hooked upper lip. Each of its hands and feet has three pointed digits. The end of its long, squirrel-like tail curls inward. Its body is encased by a tough shell that forms and hardens after birth. This shell is brown on the top, pale yellow on the bottom, and has a thick white ridge between the two halves.", "Squirtle"),
        new PData("008.png", "Wartortle is a bipedal, indigo reptilian Pokémon similar to a turtle. It has brown eyes, a dark blue streak on each cheek, and two sharp teeth protruding from its upper jaw. It has three clawed fingers and pointed toes. On each side of its head are feather-like ears covered in pale blue fur. A brown shell with a pale yellow underside encases its body. A thick, white rim separates the upper and lower halves of the shell. An older Wartortle may have scars and algae growing on its shell, as well as moss, as seen in Summer Days with Wartortle. Poking out of the bottom of the shell is a thick, wavy tail that also has light blue fur and cannot be fully withdrawn into its shell. Its tail fur will darken with age. Its tail symbolizes longevity and good luck, making this Pokémon popular with the elderly. It is said to be able to live for 10,000 years.", "Wartortle"),
        new PData("009.png", "Blastoise is a large, bipedal turtle Pokémon. Its body is blue and is mostly hidden by its tough, brown shell. This shell has a cream-colored underside and a white ridge encircling its arms and separating the upper and lower halves. Two powerful water cannons/jet nozzles reside at the top of its shell over its shoulders. These cannons can be extended or withdrawn. Blastoise's head has triangular ears that are black on the inside, small brown eyes, and a cream-colored lower jaw. Its arms are thick, and it has three claws on each hand. Its feet have three claws on the front and one on the back. Poking out of the bottom of its shell is a stubby tail.", "Blastoise")
    };
    private static int currentIndex = 0;

    public static void main(String[] args) {
        JFrame window = new JFrame("Pokedex");
        window.setSize(550, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        JPanel pane = new JPanel(new BorderLayout(10, 10));
        pane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pane.setBackground(Color.LIGHT_GRAY);

        JButton pre = new JButton("<");
        JButton nex = new JButton(">");

        JPanel highPane = new JPanel(new BorderLayout(10, 10));
        highPane.setOpaque(false);

        JLabel labpoke = new JLabel("", SwingConstants.CENTER);
        JTextArea desc = new JTextArea();
        
        JPanel name = new JPanel (new FlowLayout(FlowLayout.CENTER));
        name.setOpaque(false);

        JLabel lblPo = new JLabel();
        lblPo.setFont(new Font("Arial", Font.BOLD, 20)); // Perbesar font agar terlihat seperti judul
        name.add(lblPo);


        desc.setRows(7);
        desc.setEditable(false);
        desc.setLineWrap(true);
        desc.setWrapStyleWord(true);

        Runnable updatePokedexDisplay = () -> {
        PData currentPokemon = pokedex[currentIndex];
    
        File fileGambar = new File(FOLDER_GAMBAR, currentPokemon.getImagePath());
        if (fileGambar.exists()) {
        ImageIcon originalIcon = new ImageIcon(fileGambar.getAbsolutePath());
        Image scaledImage = originalIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        labpoke.setIcon(new ImageIcon(scaledImage));
        labpoke.setText("");
        } else {
        labpoke.setIcon(null);
        labpoke.setText("Gambar tidak ditemukan");
        }

        lblPo.setText(currentPokemon.getName());

        desc.setText(currentPokemon.getDescription());
        };

        updatePokedexDisplay.run();

        highPane.add(labpoke, BorderLayout.CENTER);
        highPane.add(pre, BorderLayout.WEST);
        highPane.add(nex, BorderLayout.EAST);
        highPane.add(name, BorderLayout.NORTH);

        JScrollPane descScroll = new JScrollPane(desc);
        pane.add(highPane, BorderLayout.CENTER);
        pane.add(descScroll, BorderLayout.SOUTH);

        pre.addActionListener(e -> {
            if (currentIndex > 0) {
                currentIndex--; 
                updatePokedexDisplay.run(); 
            } else {
                System.out.println("Ini adalah Pokémon pertama (tidak bisa Prev lagi).");
            }
        });
        nex.addActionListener(e -> {
            if (currentIndex < pokedex.length - 1) {
                currentIndex++; 
                updatePokedexDisplay.run(); 
            } else {
                System.out.println("Ini adalah Pokémon terakhir dalam Pokedex.");
            }
        });

        window.add(pane);
        window.setVisible(true);
    }
}