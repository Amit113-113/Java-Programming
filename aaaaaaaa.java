public class aaaaaaaa {

    public static String userIdGeneration(String firstName, String lastName, String pin, int n) {
        String smallerName, longerName;

        // Step 1: Determine Smaller Name and Longer Name
        if (firstName.length() < lastName.length()) {
            smallerName = firstName;
            longerName = lastName;
        } else if (firstName.length() > lastName.length()) {
            smallerName = lastName;
            longerName = firstName;
        } else { // Lengths are equal, compare alphabetically
            if (firstName.compareTo(lastName) < 0) {
                smallerName = firstName;
                longerName = lastName;
            } else {
                smallerName = lastName;
                longerName = firstName;
            }
        }

        // Step 2: Construct the user-id
        char firstLetterOfLongerName = longerName.charAt(0);
        char digitFromLeft = pin.charAt(n - 1);
        char digitFromRight = pin.charAt(pin.length() - n);
        String userId = firstLetterOfLongerName + smallerName + digitFromLeft + digitFromRight;

        // Step 3: Toggle the case
        StringBuilder toggledUserId = new StringBuilder();
        for (char c : userId.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledUserId.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledUserId.append(Character.toUpperCase(c));
            } else {
                toggledUserId.append(c); // Digits remain unchanged
            }
        }

        return toggledUserId.toString();
    }

    public static void main(String[] args) {
        UserMainCode code = new UserMainCode();
        String firstName = "Manoj";
        String lastName = "kumar";
        int pin = 561327;
        int position = 2;
        String userId = code.userIdGeneration(firstName, lastName, pin, position);
        System.out.println("Generated User-ID: " + userId);

    }
}
