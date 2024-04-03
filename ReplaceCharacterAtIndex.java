public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int index = 7; 
        char replacementChar = 'X';

        String modifiedString = replaceCharAtIndex(originalString, index, replacementChar);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replacementChar;

        return new String(charArray);
    }
}
