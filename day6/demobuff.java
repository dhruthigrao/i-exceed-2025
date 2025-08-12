public class demobuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace text (replace "Hello" with "Hi")
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete text (remove the comma)
        sb.delete(2, 3);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
