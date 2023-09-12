import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class newproject {
    import java.util.*;

    public class newproject {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tài liệu:");
            String document = scanner.nextLine();

            // Tạo một StringTokenizer sử dụng khoảng trắng làm delimiter để tách các từ
            StringTokenizer wordTokenizer = new StringTokenizer(document, " \t\n\r\f");

            // Tạo một bản đồ (Map) để lưu trữ số lần xuất hiện của từng từ
            Map<String, Integer> wordCountMap = new HashMap<>();

            // Tạo một bản đồ (Map) để lưu trữ số lần xuất hiện của từng ký tự
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Đếm số lần xuất hiện của từng từ và từng ký tự
            while (wordTokenizer.hasMoreTokens()) {
                String word = wordTokenizer.nextToken().toLowerCase(); // Chuyển thành chữ thường để không phân biệt hoa thường

                // Đếm từng từ
                if (wordCountMap.containsKey(word)) {
                    int count = wordCountMap.get(word);
                    wordCountMap.put(word, count + 1);
                } else {
                    wordCountMap.put(word, 1);
                }

                // Đếm từng ký tự
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (Character.isLetter(c)) {
                        if (charCountMap.containsKey(c)) {
                            int count = charCountMap.get(c);
                            charCountMap.put(c, count + 1);
                        } else {
                            charCountMap.put(c, 1);
                        }
                    }
                }
            }

            // In ra số lần xuất hiện của từng từ
            System.out.println("Số lần xuất hiện của từng từ:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // In ra số lần xuất hiện của từng ký tự
            System.out.println("Số lần xuất hiện của từng ký tự:");
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
