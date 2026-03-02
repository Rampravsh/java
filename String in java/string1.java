public class string1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // Concatenation
        System.out.println(str3); // Output: Hello World

        String str4 = "Hello";
        System.out.println(str1.equals(str4)); // Output: true (content comparison)
        System.out.println(str1 == str4); // Output: true (reference comparison)

        String str5 = new String("Hello");
        System.out.println(str1.equals(str5)); // Output: true (content comparison)
        System.out.println(str1 == str5); // Output: false (reference comparison)
    }    
}
