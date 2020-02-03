public class ServerNameGenerator {

    public static void main(String[] args){
        String[] adjectives = {"happy", "sad", "bright", "colorful", "smart", "dumb", "plain", "angry", "tall", "short"};
        String[] nouns = {"girl", "boy", "computer", "classroom", "student", "teacher", "shirt", "dog", "tree", "building"};

        System.out.println(randomElement(adjectives));
        System.out.println(randomElement(nouns));
        System.out.printf("Here is your server name:\n%s-%s\n", randomElement(adjectives), randomElement(nouns));
    }

    public static String randomElement(String[] word){
        int randomIndex = (int) Math.floor(Math.random() * 9); //random number between 1-10
        return word[randomIndex];
    }
}
