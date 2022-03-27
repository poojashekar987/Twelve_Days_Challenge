import java.util.List;

import static java.util.Arrays.asList;

public class TwelveDaysChallenge {
        public static void christmas_lyrics() {
            List<String> nums = asList("twelve ", "eleven ", "ten ", "nine ", "eight ", "seven ", "six ", "five ", "four ", "three ", "two ", "one ");
            List<String> numbers = asList("first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth");

            List<String> gifts = asList("Drummers Drumming", "Pipers Piping", "Lords a Leaping", "Ladies Dancing",
                    "Maids a Milking", "Swans a Swimming", "Geese a Laying", "Golden Rings",
                    "Calling Birds", "French Hens", "Turtle Doves", "Partridge in a Pear Tree \n");


            for (int i = 0; i < 12; i++) {
                String start = "\nOn the " + numbers.get(i) + " day of Christmas my true love sent to me:";
                System.out.print(start);
                for (int j = 11 - i; j <= 11; j++) {
                    if (j == 11 && i == 0) {
                        System.out.print(nums.get(j) + gifts.get(j)+ " ");
                    }
                    else if (j == 11) {
                        System.out.print("and " + nums.get(j) + gifts.get(j)+" " );
                    }
                    else {
                        System.out.print(nums.get(j) + gifts.get(j));
                    }
                }
            }
        }

        public static void main(String[] args) {
            christmas_lyrics();
        }
}

