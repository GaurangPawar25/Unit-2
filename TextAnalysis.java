public class TextAnalysis {

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }

    public static String extractFirstSentence(String text) {
        int index = text.indexOf(".");
        if (index != -1) {
            return text.substring(0, index + 1);
        }
        return text;
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }

    public static void main(String[] args) {
        String text = "This is a sample paragraph. It contains multiple sentences. The goal is to analyze this text.";

        System.out.println("Word Count: " + countWords(text));
        System.out.println("Text after replacing 'sample' with 'example': " + replaceWord(text, "sample", "example"));
        System.out.println("First Sentence: " + extractFirstSentence(text));
        System.out.println("Text in Uppercase: " + toUpperCase(text));
        System.out.println("Text in Lowercase: " + toLowerCase(text));
    }
}
