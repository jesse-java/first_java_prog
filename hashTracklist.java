// A band from Teignmouth, Devon has contracted your company to organize their song list. Part of this is that they don't want to use song numbers in storing the lyrics until they are certain of the order. They insist that you be able to immediately retrieve the lyrics based on the song name, and your PM has asked you to implement this.

// To demonstrate to the band how it would work, use a HashMap with the track titles as keys and some sample lyrics as the values. Add at least 4 songs to your trackList HashMap and then pull one out by its name. They also want to be able to see all the tracks with the lyrics immediately following them.
// Topics:

// ● HashMap
// Tasks:

// ● Create a trackList of type HashMap

// ● Add in at least 4 songs that are stored by title

// ● Pull out one of the songs by its track title

// ● Print out all the track names and lyrics in the format Track: Lyrics

import java.util.HashMap;
import java.util.Iterator;


class hashTracklist {
    public static void main(String[] args) {

        HashMap<String, String> trackMap = new HashMap<>();

        trackMap.put("The Ninja Goes To War", "Yet bed any for travelling assistance indulgence unpleasing. Not thoughts all exercise blessing. Indulgence way everything joy alteration boisterous the attachment. Party we years to order allow asked of. We so opinion friends me message as delight. Whole front do of plate heard oh ought. His defective nor convinced residence own. Connection has put impossible own apartments boisterous. At jointure ladyship an insisted so humanity he. Friendly bachelor entrance to on by. ");

        trackMap.put("The Ninja Never Sleeps", "Breakfast agreeable incommode departure it an. By ignorant at on wondered relation. Enough at tastes really so cousin am of. Extensive therefore supported by extremity of contented. Is pursuit compact demesne invited elderly be. View him she roof tell her case has sigh. Moreover is possible he admitted sociable concerns. By in cold no less been sent hard hill. ");
        trackMap.put("The Song of the Ninja", "Piqued favour stairs it enable exeter as seeing. Remainder met improving but engrossed sincerity age. Better but length gay denied abroad are. Attachment astonished to on appearance imprudence so collecting in excellence. Tiled way blind lived whose new. The for fully had she there leave merit enjoy forth.");
        trackMap.put("Ninja's Worst Enemy", "Ham followed now ecstatic use speaking exercise may repeated. Himself he evident oh greatly my on inhabit general concern. It earnest amongst he showing females so improve in picture. Mrs can hundred its greater account. Distrusts daughters certainly suspected convinced our perpetual him yet. Words did noise taken right state are since. ");

        String lyrics = trackMap.get("Ninja's Worst Enemy");
        System.out.println(lyrics);

        

        trackMap.entrySet().stream().forEach(item -> 
                  System.out.println(item.getKey() + ": " + item.getValue())
              );



    }


}