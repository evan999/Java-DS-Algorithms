static int steadyGene(String gene) {
        HashMap<Character, Integer> characters = new HashMap<>();

        char[] chars = gene.toCharArray();

        //1.//count the characters - HashMap
        //contains characters and number of occurences
        for(char ch : chars) {
            if(characters.containsKey(ch)) {
                characters.put(ch, characters.get(ch) + 1);
            }
            else {
                characters.put(ch, 1);
            }
        }

        String prototype = "";
        String replaceStr = "";

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            if(entry.getValue() > (gene.length()/4)) {
                Character replaceCh = entry.getKey();
                System.out.println(entry.getKey() + " " + entry.getValue());
                // Make a string that contains all chars we need to find
                // We need to build a prototype of a string.
                for (int i = 0; i < entry.getValue() - (gene.length()/4); i++) {
                    prototype = prototype.concat(String.valueOf(entry.getKey()));
                }

                if(entry.getKey() == replaceCh) {
                    replaceStr += replaceCh;
                }
                else {
//                    replaceStr += gene.charAt();
                    replaceStr += entry.getKey();
                }
            }
//            else if(entry.getValue() < (gene.length()/4) {
//            }
        }
        System.out.println(prototype);
        //2/// Find difference between actual and desired character counts
        // gene.length()/4 => desired count of each character vs. values in HashMap
        // How many A,C,T,or G do we need?
        //3// Find the (minimal) substring to replace
        // we have to know what characters we are looking to remove and how many
        // find the smallest string with those amounts of characters
        return 0;
    }
}