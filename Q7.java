public class Main
{
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Steven XL");
        list.add("Steven XVI");
        list.add("David IX");
        list.add("Mary XV");
        list.add("Mary XIII");
        list.add("Mary XX");
        
        List<String> output = sortRoman(list);
        
        System.out.println("Output: ");
        
        for(String name: output) {
            System.out.println(name);
        }
    }
    
    public static List<String> sortRoman(List<String> names) {
        
        List<MyObject> list = new ArrayList<>();
        
        for(String name: names) {
            list.add(new MyObject(name.split(" ")[0], name.split(" ")[1]));
        }
        
        
        Collections.sort(list, Comparator.comparing(MyObject::getName)
                         .thenComparingInt(MyObject::getNumeral));
        
        List<String> output = new ArrayList<>();
        
        for(MyObject obj: list) {
            String str = obj.getName() + " " + obj.getRomanNumeral();
            output.add(str);
        }
        
        return output;
    }
}

class MyObject {
    
    String name;
    String romanNumeral;
    int numeral;
    
    Map<Character, Integer> map = new HashMap<>();
        
    
    MyObject(String name, String numeral) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        this.name = name;
        this.romanNumeral = numeral;
        this.numeral= getRomanValue(numeral);
    }
    
    String getName() {
        return this.name;
    }
    
    String getRomanNumeral() {
        return this.romanNumeral;
    }
    
    int getNumeral() {
        return this.numeral;
    }
    
    int getRomanValue(String str) {
        int result= map.get(str.charAt(0));
        
        for(int i = 1; i < str.length(); i++) {
            if(map.get(str.charAt(i)) > map.get(str.charAt(i-1))) {
                result += map.get(str.charAt(i)) - map.get(str.charAt(i-1));
                result -= map.get(str.charAt(i-1));
            } else {
                result += map.get(str.charAt(i));
            }
        }
        
        return result;
   }
    
}