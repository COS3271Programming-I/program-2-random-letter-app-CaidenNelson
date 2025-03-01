public class Random_Letter {
    public static void main(String[] args) {
        String word = "";
        int counter = 0;

        while (counter < 10) {
            counter += 1;

            int rand = (int) (Math.random() * 26);
            char c = (char) (rand + 'a');
            word = word + c;
            }
        int main_counter;

        for(main_counter =0; main_counter <19; main_counter++){

            int r = (int) (Math.random() * 10);

            int replacer = (int) (Math.random() * 26);
            char e = (char) (replacer + 'a');
            char replaced = word.charAt(r);
            word = word.replace(replaced, e);
            System.out.println(word);
        }
    }
}
